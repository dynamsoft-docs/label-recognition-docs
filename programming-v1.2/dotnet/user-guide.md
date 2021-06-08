---
layout: default-layout
title: Dynamsoft Label Recognition - .Net User Guide
description: This is the user guide page of Dynamsoft Label Recognition for .Net Language.
keywords: a, user guide
needAutoGenerateSidebar: true
---

# Dynamsoft Label Recognition - .Net User Guide

Accurately read alphanumeric characters and standard symbols from images of varying background colour, font, or text size. Additional characters can be trained.

## System Requirements

- Operating systems:
   - Windows: 7, 8, 10, 2003, 2008, 2008 R2, 2012.

- Environment: Visual Studio 2008 and above.

- Framework supported: .NET Framework 2.0, .NET Framework 4.0

## Installation

Download the Dynamsoft Label Recognition SDK from the [Dynamsoft website](https://www.dynamsoft.com/label-recognition/downloads) and unzip the package. The package includes a free trial license valid for 30 days.

## Getting Started: Hello World

1. Start Visual Studio and create a new Console Application (.NET Framework) in C#. 
   
2. Add Dynamsoft Label Recognition namespace and libs to a new file, `DLRHelloWorld.cs`.  

    ```cs
    using System;
    using Dynamsoft.DLR;
    ```

    Please add the Dynamsoft Label Recognition ibraries (`Dynamsoft.LabelRecognition.dll` and `DynamsoftCommon.dll`) to the project references. The lib files can be found in `[INSTALLATION FOLDER]\Lib\`. Select the corresponding folder (2.0 or 4.0) based on your project's .NET Framework version.

3. Update the main function in `DLRHelloWorld.cs`. 

    ```cs
    class Program
    {
        static void Main(string[] args)
        {
            try
            {
                LabelRecognition labelRecognition = new LabelRecognition();

                // Apply for a trial license: https://www.dynamsoft.com/customer/license/trialLicense
                labelRecognition.InitLicense("<insert DLR license key here>");

                DLR_Result[] results = labelRecognition.RecognizeByFile("<full image path>", "");

                for (int i = 0; i < results.Length; ++i)
                {
                    Console.WriteLine("Result " + i.ToString() + ": ");
                    for (int j = 0; j < results[i].LineResults.Length; ++j)
                    {
                        Console.WriteLine(">>LineResult " + j.ToString() + ": " + results[i].LineResults[j].Text);
                    }
                }
            }
            catch (DLR_Exception exp)
            {
                Console.WriteLine(exp);
            }
            catch (Exception exp)
            {
                Console.WriteLine(exp);
            }
        }
    }
    ```
    Please replace `<insert DLR license key here>` with your DLR license key. If you do not have a valid license, please request a trial license through the [customer portal](https://www.dynamsoft.com/customer/license/trialLicense). 

    In line 6 of the snippet above, `<full image path>` should also be replaced with the full path to the image you'd like to recognize.

4. Run the project.   
   Build the application and copy the related DLL files to the same folder as the EXE file (usually in `\bin\Debug`). The DLLs can be found in `[INSTALLATION FOLDER]\Lib\[.NET Framework version]`.

    To deploy your application, ensure the DLL/Lib files are in the same folder as the EXE file. 

## Features

### Specify a reference region using results from Dynamsoft Barcode Reader

Assuming Dynamsoft Barcode Reader has been set up within the project, the following code will allow you to use the barcode results as the reference region for Dynamsoft Label Reader. 

```cs
TextResult[] dbr_result = dbr.DecodeFile("<insert image path>", "");
             
LabelRecognition dlr = new LabelRecognition();
dlr.InitLicense("<insert DLR license>");
dlr.AppendSettingsFromString("{\"LabelRecognitionParameter\":{\"Name\":\"P1\", \"RegionPredetectionModes\":[{\"Mode\":\"DLR_RPM_GENERAL_HSV_CONTRAST\"}], \"ReferenceRegionNameArray\": [\"R1\"]},\"ReferenceRegion\":{\"Name\":\"R1\",\"Localization\":{\"SourceType\":\"DLR_LST_BARCODE\"},\"TextAreaNameArray\":[\"T1\"]},\"TextArea\":{\"Name\":\"T1\",\"CharacterModelName\":\"Number\"}}");
dlr.UpdateReferenceRegionFromBarcodeResults(dbr_result, "P1");
DLR_Result[] dlr_result = dlr.RecognizeByFile("<insert image path>", "P1");
```

