---
layout: default-layout
title: Dynamsoft Label Recognizer - Android User Guide
description: This is the user guide page of Dynamsoft Label Recognizer for Android Language.
keywords: a, user guide
needAutoGenerateSidebar: true
---

# Dynamsoft Label Recognizer - Android User Guide

## System Requirements

- Operating systems:
   - Supported OS: Android 5 or higher (Android 7 or higher recommended)
   - Supported ABI: armeabi-v7a, arm64-v8a, x86, x86_64

## Installation

Download the Dynamsoft Label Recognizer SDK from the [Dynamsoft website](https://www.dynamsoft.com/label-recognition/downloads) and unzip the package. The package includes a free trial license valid for 30 days.

## Getting Started: Hello World

1. Create a new Android project in Android Studio.

2. Import the `DynamsoftLabelRecognizerAndroid.aar` package into the new project. To manually import the `.aar`:

    i. Locate `DynamsoftLabelRecognizerAndroid.aar` in the downloaded android zip.
    ii. Put the .aar file under the `libs` directory in the project.
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
    implementation(name: 'DynamsoftLabelRecognizerAndroid', ext: 'aar')
    ```

    v. Click **Sync Now**. After the synchronization completes, `DynamsoftLabelRecognizerAndroid.aar` is added to the project.

3. Add the following code to initiate and use the Dynamsoft Label Recognizer SDK.

    ```java
    import com.dynamsoft.dlr.*;
    public class MainActivity extends AppCompatActivity { 
        private LabelRecognizer mRecognizer;
        @Override
        protected void onCreate(Bundle savedInstanceState)  {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);
            try {
                mRecognizer = new LabelRecognizer("<insert DLR license key here>");
                DLRResult[] results = mRecognizer.recognizeByFile("<full image path>", "");

                if (results != null && results.length > 0) {
                    String strCurResult = "";
                    for (int i = 0; i < results.length; i++) {
                        strCurResult += "["+i+"] :\n";
                        for (int j = 0; j < results[i].lineResults.length; j++) {
                            strCurResult += results[i].lineResults[j].text + "\n";
                        }
                    }
                    Log.i("DLR", strCurResult);
                }
                else {
                    Log.i("DLR", "No results returned.");
                }
            } 
            catch (Exception ex) {
                ex.printStackTrace();
            }
        }
    }
    ```
    Please replace `<insert DLR license key here>` with your DLR license key. If you do not have a valid license, please request a trial license through the [customer portal](https://www.dynamsoft.com/customer/license/trialLicense). 

    In the snippet above, `<full image path>` should also be replaced with the full path to the image you'd like to recognize.

4. Run the project.
