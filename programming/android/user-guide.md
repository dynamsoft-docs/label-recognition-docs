---
layout: default-layout
title: Dynamsoft Label Recognition - Android User Guide
description: This is the user guide page of Dynamsoft Label Recognition for Android Language.
keywords: a, user guide
needAutoGenerateSidebar: true
---

# Dynamsoft Label Recognition - Android User Guide

## System Requirements

- Operating systems:
   - Supported OS: Android 5 or higher (Android 7 or higher recommended)
   - Supported ABI: armeabi-v7a, arm64-v8a, x86 and x86_64

## Installation

Download the Dynamsoft Label Recognition SDK from the [Dynamsoft website](https://www.dynamsoft.com/label-recognition/downloads) and unzip the package. The package includes a free trial license valid for 30 days.

## Getting Started: Hello World

1. Create a new Android project in Android Studio.

2. Import the `DynamsoftLabelRecognitionAndroid.aar` package into the new project. To manually import the `.aar`:

    i. Locate `DynamsoftLabelRecognitionAndroid.aar` in the downloaded android zip.
    ii. Put the .aar file under the directory libs in the project.
    iii. In the project, open build.gradle(Module: app) and add the following code:

    ```
    repositories {
        flatDir {
        dirs 'libs'
        }
    }
    ```

    iv. Add `.aar` reference in the dependencies:

    ```
    implementation(name: 'DynamsoftLabelRecognitionAndroid', ext: 'aar')
    ```

    v. Click **Sync Now**. After the synchronization completes, `DynamsoftLabelRecognitionAndroid.aar` is added to the project.

3. Add the following code to initiate and use the Dynamsoft Label Reader SDK.

    ```java
    import com.dynamsoft.dlr.*;
    public class MainActivity extends AppCompatActivity { 
        private LabelRecognition mRecognition;
        @Override
        protected void onCreate(Bundle savedInstanceState)  {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);
            try {
                mRecognition = new LabelRecognition("<insert DLR license key here>");
                DLRResult[] results = mRecognition.recognizeByFile("<full image path>", "");

                if (results != null && results.length > 0) {
                    for (int i = 0; i < results.length; i++) {
                        String strCurResult = "["+i+"] :\n";
                        for (int j = 0; j < result[i].lineResults.length; j++) {
                            strCurResult += result[i].lineResults[j].text + "\n";
                        }
                    }
                    Log.i("DBR", strCurResult);
                }
                else {
                        Log.i("DBR", "No barcode found");
                }
            } 
            catch (Exception ex) {
                ex.printStackTrace();
            }
        }
    }
    ```
    Please replace `<insert DLR license key here>` with your DLR license key. If you do not have a valid license, please request a trial license through the [customer portal](https://www.dynamsoft.com/customer/license/trialLicense). 

    In line 9 of the snippet above, `<full image path>` should also be replaced with the full path to the image you'd like to recognize.

4. Run the project.