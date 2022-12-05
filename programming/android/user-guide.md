---
layout: default-layout
title: Android User Guide - Dynamsoft Label Recognizer
description: This is the user guide page of Dynamsoft Label Recognizer for Android Language.
keywords: a, user guide
needAutoGenerateSidebar: true
needGenerateH3Content: true
---

# Dynamsoft Label Recognizer - Android User Guide

- [Requirements](#requirements)
- [Add the SDK](#add-the-sdk)
- [Build Your First Application](#build-your-first-application)
  - [Create a New Project](#create-a-new-project)
  - [Include the Library](#include-the-library)
  - [Initialize the License](#initialize-the-license)
  - [Initialize Camera Module](#initialize-camera-module)
  - [Initialize Label Recognizer](#initialize-label-recognizer)
  - [Start Recognition Process](#start-recognition-process)
  - [Obtain And Display Recognized Results](#obtain-and-display-recognized-results)
  - [Build and Run the Project](#build-and-run-the-project)

## Requirements

- Supported OS: Android 5.0 (API Level 21) or higher.
- Supported ABI: **armeabi-v7a**, **arm64-v8a**, **x86** and **x86_64**.
- Development Environment: Android Studio 3.4+ (Android Studio 4.2+ recommended).

## Add the SDK

The Dynamsoft Label Recognizer (DLR) Android SDK comes with three modules:

- **DynamsoftLabelRecognizer.aar**: Main module. Provides APIs to recognize text from image files and camera video.

- **DynamsoftCore.aar**: The core library of Dynamsoft's capture vision SDKs, including common basic structure and license related APIs.

- **DynamsoftCameraEnhancer.aar** (Optional): <a href="https://www.dynamsoft.com/camera-enhancer/docs/introduction/" target="_blank"> Dynamsoft Camera Enhancer (DCE) module</a> for getting video frames from mobile cameras. Provides APIs for camera control, camera preview, and other advanced features.

There are two ways to add the SDK into your project - **Manually** and **Maven**.

### Add the Library Manually

1. Download the SDK package from the <a href="https://www.dynamsoft.com/survey/dlr/?utm_source=docs" target="_blank">Dynamsoft Website</a>. After unzipping, three **aar** files can be found in the **DynamsoftLabelRecognizer\Libs** directory:

   - **DynamsoftLabelRecognizer.aar**
   - **DynamsoftCore.aar**
   - **DynamsoftCameraEnhancer.aar** (Optional)
      >Note:
      >
      >If you want to use Android Camera SDK or your own sdk to control camera, please ignore **DynamsoftCameraEnhancer.aar** in the following steps.

2. Copy the above two **aar** files to the target directory such as `[App Project Root Path]\app\libs`

3. Open the file `[App Project Root Path]\app\build.gradle` and add reference in the dependencies:

    ```groovy
    dependencies {
        implementation fileTree(dir: 'libs', include: ['*.aar'])

        def camerax_version = '1.1.0'
        implementation "androidx.camera:camera-core:$camerax_version"
        implementation "androidx.camera:camera-camera2:$camerax_version"
        implementation "androidx.camera:camera-lifecycle:$camerax_version"
        implementation "androidx.camera:camera-view:$camerax_version"
    }
    ```

    > Note:
    >
    > DCE 3.x is based on Android CameraX, so you need to add the CameraX dependency manually.

4. Click **Sync Now**. After the synchronization completes, the SDK is added to the project.

### Add the Library via Maven

1. Open the file `[App Project Root Path]\app\build.gradle` and add the maven repository:

    ```groovy
    repositories {
         maven {
            url "https://download2.dynamsoft.com/maven/aar"
         }
    }
    ```

2. Add reference in the dependencies:

   ```groovy
   dependencies {
      implementation 'com.dynamsoft:dynamsoftlabelrecognizer:2.2.20'
      // Remove the following line if you want to use Android Camera sdk or your own sdk to control camera.
      implementation 'com.dynamsoft:dynamsoftcameraenhancer:3.0.1'
   }
   ```

3. Click **Sync Now**. After the synchronization completes, the SDK is added to the project.

## Build Your First Application

The following sample will demonstrate how to create a HelloWorld app for recognizing text from camera video input.
>Note:
>
>- The following steps are completed in Android Studio 4.2.
>- You can download the similar complete source code from [Here](https://github.com/Dynamsoft/label-recognizer-mobile-samples/tree/master/android/HelloWorld).

### Create a New Project

1. Open Android Studio and select New Project… in the File > New > New Project… menu to create a new project.

2. Choose the correct template for your project. In this sample, we'll use `Empty Activity`.

3. When prompted, choose your app name (`HelloWorld`) and set the Save location, Language, and Minimum SDK (21)
    >Note: With minSdkVersion set to 21, your app is available on more than 94.1% of devices on the Google Play Store (last update: March 2021).

### Include the Library

Add the SDK to your new project. Please read [Add the SDK](#add-the-sdk) section for more details.

### Initialize the License

1. Import the `LicenseManager` class and initialize the license in the file `MainActivity.java`.

   ```java
   import com.dynamsoft.core.LicenseManager;
   import com.dynamsoft.core.LicenseVerificationListener;
   import com.dynamsoft.core.CoreException;

   public class MainActivity extends AppCompatActivity {

      @Override
      protected void onCreate(Bundle savedInstanceState) { 
         super.onCreate(savedInstanceState);
         setContentView(R.layout.activity_main);

         LicenseManager.initLicense("DLS2eyJvcmdhbml6YXRpb25JRCI6IjIwMDAwMSJ9", MainActivity.this, new LicenseVerificationListener() {
            @Override
            public void licenseVerificationCallback(boolean isSuccess, CoreException error) {
               if(!isSuccess){
                  error.printStackTrace();
               }
            }
         });
      }
   }
   ```

   >Note:  
   >  
   >- Network connection is required for the license to work.
   >- The license string here will grant you a time-limited trial license.
   >- If the license has expired, you can go to the <a href="https://www.dynamsoft.com/customer/license/trialLicense?utm_source=docs" target="_blank">customer portal</a> to request for an extension.

### Initialize Camera Module

1. In the Project window, open **app > res > layout > `activity_main.xml`** and create a DCE camera view section under the root node.

    ```xml
    <com.dynamsoft.dce.DCECameraView
        android:id="@+id/camera_view"
        android:layout_width="match_parent"
        android:layout_height="match_parent"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintLeft_toLeftOf="parent"
        app:layout_constraintRight_toRightOf="parent"
        app:layout_constraintTop_toTopOf="parent">
    </com.dynamsoft.dce.DCECameraView>
    ```

2. Import the dynamsoft camera module, initialize the camera view and bind to the created Camera Enhancer instance in the file `MainActivity.java`.

   ```java
   ...
   
   import com.dynamsoft.dce.DCECameraView;
   import com.dynamsoft.dce.CameraEnhancer;
   import com.dynamsoft.dce.CameraEnhancerException;

   public class MainActivity extends AppCompatActivity {
      private CameraEnhancer mCamera;

      @Override
      protected void onCreate(Bundle savedInstanceState) { 

         ...

         DCECameraView cameraView = findViewById(R.id.camera_view);

         mCamera = new CameraEnhancer(MainActivity.this);
         mCamera.setCameraView(cameraView);
      }
   }
   ```

3. Define a scan region for recognition.

   ```java
   ...
   
   import com.dynamsoft.core.RegionDefiniton;

   public class MainActivity extends AppCompatActivity {

      @Override
      protected void onCreate(Bundle savedInstanceState) { 

        ...

        RegionDefinition region = new RegionDefinition(10, 40, 90, 60, 1);
        try {
            mCamera.setScanRegion(region);
        } catch (CameraEnhancerException e) {
            e.printStackTrace();
        }
      }
   }
   ```

### Initialize Label Recognizer

1. Import and initialize the label recognizer, bind to the created Camera Enhancer instance.

   ```java
   ...

   import com.dynamsoft.dlr.LabelRecognizer;
   import com.dynamsoft.dlr.LabelRecognizerException;

   public class MainActivity extends AppCompatActivity {
      
      ...

      private LabelRecognizer mRecognizer;

      @Override
      protected void onCreate(Bundle savedInstanceState) { 
         
         ...

         try {
            mRecognizer = new LabelRecognizer();
         } catch (LabelRecognizerException e) {
            e.printStackTrace();
         }

         mRecognizer.setImageSource(mCamera);
      }
   }
   ```

### Start Recognition Process

1. Override the `MainActivity.onResume` and `MainActivity.onPause` functions to start/stop video text recognition. After recognition starts, the Label Recognizer will automatically invoke the `recognizeBuffer` API to process the video frames from the Camera Enhancer, then send the recognized text results to the callback function.

   ```java
   public class MainActivity extends AppCompatActivity {
      
      ...

      @Override
      protected void onResume() {
         mRecognizer.startScanning();
         try {
            mCamera.open();
         } catch (CameraEnhancerException e) {
            e.printStackTrace();
         }
         super.onResume();
      }


      @Override
      protected void onPause() {
         mRecognizer.stopScanning();
         try {
            mCamera.close();
         } catch (CameraEnhancerException e) {
            e.printStackTrace();
         }
         super.onPause();
      }
   }
   ```

### Obtain and Display Recognized Results

1. Create a label result listener and register with the label recognizer instance to get recognized label results.

   ```java
   ...
   import android.app.AlertDialog;
   import android.app.Dialog;
   import android.content.DialogInterface;
   import com.dynamsoft.core.ImageData;
   import com.dynamsoft.dlr.DLRResult;
   import com.dynamsoft.dlr.DLRLineResult;
   import com.dynamsoft.dlr.LabelResultListener;

   public class MainActivity extends AppCompatActivity {
      
      ...

      @Override
      protected void onCreate(Bundle savedInstanceState) { 
         
         ...
         
         mRecognizer.setLabelResultListener(new LabelResultListener() {
            @Override
            public void labelResultCallback(int id, ImageData imageData, DLRResult[] dlrResults) {
                if (dlrResults != null && dlrResults.length > 0) {
                    mRecognizer.stopScanning();
                    showResults(dlrResults);
                }
            }
        });
      }

      private void showResults(DLRResult[] results) {
        StringBuilder resultBuilder = new StringBuilder();
        if (results != null) {
            for (DLRResult result : results) {
                for (DLRLineResult lineResult : result.lineResults) {
                    resultBuilder.append(lineResult.text).append("\n\n");
                }
            }
        }
        
        runOnUiThread(new Runnable() {
            @Override
            public void run() {
                Dialog alertDialog = new AlertDialog.Builder(MainActivity.this).
                        setTitle("Label Results").
                        setMessage(resultBuilder.toString()).
                        setPositiveButton("OK", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                mRecognizer.startScanning();
                            }
                        }).
                        create();
                alertDialog.show();
            }
        });
      }
   }
   ```

    The recognition results of SDK are organized into a four-tier structure:
    - `DLRResult[]` corresponds to the results of an `image`
    - `DLRResult` corresponds to the result of a `TextArea` (also called Label)
    - `DLRLineResult` corresponds to the result of each `TextLine` in the Label
    - `DLRCharacterResult` corresponds to the result of each `Character` in the `TextLine`

    The structure is shown in the figure below:

    <div align="center">
        <img src="../assets/dlr_result2.png" alt="DLR Result Structure" width="80%"/>
        <p>Figure 1 – DLR Result Structure</p>
    </div>

You can download the similar complete source code from [Here](https://github.com/Dynamsoft/label-recognizer-mobile-samples/tree/master/android/HelloWorld).

### Build and Run the Project

1. Select the device that you want to run your app on from the target device drop-down menu in the toolbar.

2. Click `Run app` button, then Android Studio installs your app on your connected device and starts it.
