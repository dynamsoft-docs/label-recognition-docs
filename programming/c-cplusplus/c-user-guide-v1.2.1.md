---
layout: default-layout
title: C User Guide - Dynamsoft Label Recognition
description: This is the user guide page of Dynamsoft Label Recognition for C Language.
keywords: c, user guide
needAutoGenerateSidebar: true
---

# Dynamsoft Label Recognition - C User Guide

## System Requirements

- Operating systems:
   - Windows: 7, 8, 10, 2003, 2008, 2008 R2, 2012.
   - Linux x64: Ubuntu 14.04.4+ LTS, Debian 8+, etc;   

## Installation

Download the Dynamsoft Label Recognition SDK from the [Dynamsoft website](https://www.dynamsoft.com/label-recognition/downloads) and unzip the package. The package includes a free trial license valid for 30 days.   

## Getting Started: Hello World

1. Start Visual Studio and create a new Win32 Console Application in C. 
   
2. Add Dynamsoft Label Recognition headers and libs in `DLRHelloWorld.c`.   
   
   ```c
    #include <stdio.h>
    #include "<relative path>/Include/DynamsoftLabelRecognition.h"
    #include "<relative path>/Include/DynamsoftCommon.h"

    #ifdef _WIN64
    #pragma comment(lib, "<relative path>/Lib/Windows/x64/DynamsoftLabelRecognitionx64.lib")
    #else
    #pragma comment(lib, "<relative path>/Lib/Windows/x86/DynamsoftLabelRecognitionx86.lib")
    #endif
   ```
   
    The `DynamsoftLabelRecognition.h` and `DynamsoftCommon.h` file can be found in `[INSTALLATION FOLDER]\Include\` folder. The other necessary folder and files, including DLL/LIB files, can be found in `[INSTALLATION FOLDER]\Lib\`.  Please replace `<relative path>` in the above code with the relative path to the `DLRHelloWorld.c` file. 
 
3. Update the main function in `DLRHelloWorld.c`.   
   ```c
    int main()
    {
        void* dlr = DLR_CreateInstance();
        DLR_InitLicense(dlr, "<insert DLR license key here>");

        int errorcode = DLR_RecognizeByFile(dlr, "<full image path>", "");

        if (errorcode != DLR_OK)
            printf("\r\nFailed to recognize label\r\n");
        else
        {
            DLRResultArray* pDLRResults = nullptr;
            DLR_GetAllDLRResults(dlr, &pDLRResults);

            if (pDLRResults != nullptr)
            {
                int rCount = pDLRResults->resultsCount;
                printf("\r\nRecognized %d results\r\n", rCount);
                for (int ri = 0; ri < rCount; ++ri)
                {
                    DLRResult* result = pDLRResults->results[ri];
                    int lCount = result->lineResultsCount;
                    for (int li = 0; li < lCount; ++li)
                    {
                        printf("Line result %d: %s\r\n", li, result->lineResults[li]->text);
                    }
                }
            }
            else
            {
                printf("\r\nNo data detected.\r\n");
            }
            DLR_FreeDLRResults(&pDLRResults);
        }

        DLR_DestroyInstance(dlr);

        return 0;
    }
   ```

    Please replace `<insert DLR license key here>` with your DLR license key. If you do not have a valid license, please request a trial license through the [customer portal](https://www.dynamsoft.com/customer/license/trialLicense). 

    In line 6 of the snippet above, `<full image path>` should also be replaced with the full path to the image you'd like to recognize.

4. Run the project.   
   Build the application and copy the related DLL files to the same folder as the EXE file. The DLLs can be found in `[INSTALLATION FOLDER]\Lib\[OPERATING SYSTEM]\`.
   
    To deploy your application, ensure the DLL/Lib files are in the same folder as the EXE file. 


