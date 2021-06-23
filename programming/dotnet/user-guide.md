---
layout: default-layout
title: Dynamsoft Label Recognizer - .Net User Guide
description: This is the user guide page of Dynamsoft Label Recognizer for .Net Language.
keywords: a, user guide
needAutoGenerateSidebar: true
---

# Dynamsoft Label Recognizer - .Net User Guide

## Requirements

- Operating systems:
   - Windows: 7, 8, 10, 2003, 2008, 2008 R2, 2012.

- Environment: Visual Studio 2008 and above.

- Framework supported: .NET Framework 2.0, .NET Framework 4.0

## Installation

If you don’t have SDK yet, please download the Dynamsoft Label Recognizer(DLR) SDK from the [Dynamsoft website](https://www.dynamsoft.com/label-recognition/downloads) and unzip the package. After decompression, the root directory of the DLR installation package is `DynamsoftLabelRecognizer`, which is represented by `[INSTALLATION FOLDER]`.

## Build your first application

### Create a new project 

1. Open Visual Studio. Go to File > New > Project, select `Visual C#` template, create a new Console Application (.NET Framework) named `DLRCSharpSample`.

### Include the library

1. Add the Dynamsoft Label Recognizer libraries (`Dynamsoft.LabelRecognizer.dll` and `DynamsoftCommon.dll`) to the project references. The lib files can be found in `[INSTALLATION FOLDER]\Lib\[dotNetVersion]`.
    >Note: Select the corresponding folder (2.0 or 4.0) based on your project's .NET Framework version.

2. Import the namespace in the file `Program.cs`
    
    ```cs
    using Dynamsoft.DLR;
    ```

### Initialize the Dynamsoft Label Recognizer

1. Create an instance of Dynamsoft Label Recognizer

    ```cs
    LabelRecognizer dlr = new LabelRecognizer();
    ```

2. Initialize the license key

    ```cs
    dlr.InitLicense("<insert DLR license key here>");
    ```    
    
    >Please replace `<insert DLR license key here>` with your DLR license key. There are two ways to obtain a DLR license:
    >- Find the license in the sample code of the installation package;
    >- If the license has expired, please request a trial license through the [customer portal](https://www.dynamsoft.com/customer/license/trialLicense?utm_source=docs). 

### Recognizing and output results

1. Recognizing text in an image 
    
    ```cs
    DLR_Result[] results = null;

    try
    {
        results = dlr.RecognizeByFile("dlr_test.png", "");
    }
    catch (DLR_Exception exp)
    {
        Console.WriteLine(exp);
    }
    ```

    >You can download the image [dlr_test.png](../assets/dlr_test.png) for testing. In addition, you can replace `dlr_test.png` with the full path of the image you want to recognize.

    >For the error handling mechanism, when an error occurs during the recognition process, an exception will be thrown. You should add codes for error handling based on your needs. Check out [Error Code]({{site.enumerations}}error-code.html) for full supported error codes.

2. Get and output the recognition results

    ```cs
    if(results != null)
    {
        for (int i = 0; i < results.Length; ++i)
        {
            Console.WriteLine("Result " + i.ToString() + ": ");
            for (int j = 0; j < results[i].LineResults.Length; ++j)
            {
                Console.WriteLine(">>LineResult " + j.ToString() + ": " + results[i].LineResults[j].Text);
            }
        }
    }
    ```

    The recognition results of SDK are organized into a four-tier structure: 
    - `DLR_Result[]` corresponds to the results of an `image`
    - `DLR_Result` corresponds to the result of a `TextArea` (also called Label) 
    - `DLR_LineResult` corresponds to the result of each `TextLine` in the Label
    - `DLR_CharacterResult` corresponds to the result of each `Character` in the `TextLine`

    The structure is shown in the figure below:

    <div align="center">
    <img src="../assets/dlr_result2.png" alt="DLR Result Structure" width="80%"/>
    <p>Figure 1 – DLR Result Structure</p>
    </div> 

You can find the similar complete source code for this application in `dlr-dotnet-{version number}\DynamsoftLabelRecognizer\Samples\HelloWorld`.

### Build and run the project

1. Build the application through Visual Studio and copy the related folders to the same folder as the EXE file. The related folders includes `[INSTALLATION FOLDER]\Lib\[dotNetVersion]\x86` and `[INSTALLATION FOLDER]\Lib\[dotNetVersion]\x64`.
    >Note: Select the corresponding folder (2.0 or 4.0) based on your project's .NET Framework version.

2. Run the program `DLRCSharpSample.exe`.
