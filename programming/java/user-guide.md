---
layout: default-layout
title: Dynamsoft Label Recognizer - Java User Guide
description: This is the user guide page of Dynamsoft Label Recognizer for Java Language.
keywords: java, user guide
needAutoGenerateSidebar: true
needGenerateH3Content: true
---

# User Guide - Java

## Requirements

- Operating systems:
   - Windows 7, 8, 10
   - Windows Server 2003, 2008, 2008 R2, 2012
   - Linux x64 (Ubuntu 14.04.4+ LTS, Debian 8+, etc.)
   - JDK 1.7 and above

- Environment: Eclipse 3.7 and above.

## Installation

If you don’t have SDK yet, please download the Dynamsoft Label Recognizer(DLR) SDK from the <a href="https://www.dynamsoft.com/label-recognition/downloads" target="_blank">Dynamsoft website</a> and unzip the package. After decompression, the root directory of the DLR installation package is `DynamsoftLabelRecognizer`, which is represented by `[INSTALLATION FOLDER]`.

## Build your first application

### Create a new project 

1. Open Eclipse. Go to File > New > Project,  create a new Java project `DLRJavaSample`.

2. Add a new Class named `DLRJavaSample` into the project.

### Include the library

1. Add the Dynamsoft Label Recognizer JAR file to your project.
    Click File > Properties > Java Build Path > Libraries > Add external JARs, add `dynamsoft-labelrecognizer-{version number}.jar` and click Apply.
    >Note: The JAR file can be found at `[INSTALLATION FOLDER]\lib`.


2. Import the package in the file `DLRJavaSample.java`
    ```java
    import com.dynamsoft.dlr.*;
    ```

### Initialize the Dynamsoft Label Recognizer

1. Create an instance of Dynamsoft Label Recognizer

    ```java
    LabelRecognizer dlr = new LabelRecognizer();
    ```

2. Initialize the license key

    ```java
    dlr.InitLicense("<insert DLR license key here>");
    ```    
    
    >Please replace `<insert DLR license key here>` with your DLR license key. There are two ways to obtain a DLR license:
    >- Find the license in the sample code of the installation package;
    >- If the license has expired, please request a trial license through the <a href="https://www.dynamsoft.com/customer/license/trialLicense?utm_source=docs" target="_blank">customer portal</a>.

### Recognizing and output results

1. Recognizing text in an image 
    
    ```java
    DLRResult[] results = null;

    try {
        results = dlr.recognizeByFile("dlr_test.png", "");
    } catch (LabelRecognizerException ex) {
        ex.printStackTrace();
    }
    ```

    >You can download the image [dlr_test.png](../assets/dlr_test.png) for testing. In addition, you can replace `dlr_test.png` with the full path of the image you want to recognize.

    >For the error handling mechanism, when an error occurs during the recognition process, an exception will be thrown. You should add codes for error handling based on your needs. Check out [Error Code]({{site.enumerations}}error-code.html) for full supported error codes.

2. Get and output the recognition results

    ```java
    if (results != null && results.length > 0) {
        for (int i = 0; i < results.length; i++) {
            
            // Get result of each text area (also called label).
            DLRResult result = results[i];
            System.out.println("Result " + i + ":");
            for (int j = 0; j < result.lineResults.length; j++) {
                
                // Get the result of each text line in the label.
                DLRLineResult lineResult = result.lineResults[j];
                System.out.println(">>Line Result " + j + ": " + lineResult.text);
            }
        }
    } else {
        System.out.println("No data detected.");
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

You can find the similar complete source code for this application in `[INSTALLATION FOLDER]\Samples\HelloWorld`.

### Build and run the project

1. Right click the project， click Run As > Java Application.

