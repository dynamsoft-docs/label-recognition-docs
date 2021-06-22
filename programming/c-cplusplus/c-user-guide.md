---
layout: default-layout
title: Dynamsoft Label Recognizer - C User Guide
description: This is the user guide page of Dynamsoft Label Recognizer for C Language.
keywords: c, user guide
needAutoGenerateSidebar: true
needGenerateH3Content: true
---

# Dynamsoft Label Recognizer - User Guide for C

## Requirements
   
### Windows 
- Windows 7, 8, 10, 2003, 2008, 2008 R2, 2012.
- Visual Studio 2003 or above

### Linux
- Linux x64: Ubuntu 14.04.4+ LTS, Debian 8+, etc
- GCC 4.2+  

## Installation

If you don’t have SDK yet, please download the Dynamsoft Label Recognizer(DLR) SDK from the [Dynamsoft website](https://www.dynamsoft.com/label-recognition/downloads) and unzip the package. After decompression, the root directory of the DLR installation package is `DynamsoftLabelRecognizer`, which is represented by `[INSTALLATION FOLDER]`.

## Build your first application

### Create a new project 

#### For Windows

1. Open Visual Studio. Go to File > New > Project, select Empty App and enter `DLRCSample` in the `name` text box.

2. Add a new source file named `DLRCSample.c` into the project.

#### For Linux
1. Create a new source file named `DLRCSample.c` and place it into the folder `[INSTALLATION FOLDER]\Samples`.

2. Create a file named `Makefile` and put it in the same directory as the file `DLRCSample.c`. The content of `Makefile` is as follows:

    ```makefile
    CC=gcc
    CCFLAGS=-c

    DLRLIB_PATH=../Lib/Linux

    LDFLAGS=-L $(DLRLIB_PATH) -Wl,-rpath=$(DLRLIB_PATH) -Wl,-rpath=./
    DLRLIB=-lDynamsoftLabelRecognizer

    TARGET=DLRCSample
    OBJECT=DLRCSample.o
    SOURCE=DLRCSample.c

    # build rule for target.
    $(TARGET): $(OBJECT)
        $(CC) -o $(TARGET) $(OBJECT) $(DLRLIB) $(LDFLAGS)

    # target to build an object file
    $(OBJECT): $(SOURCE)
        $(CC) $(CCFLAGS) $(SOURCE)

    # the clean target
    .PHONY : clean
    clean: 
        rm -f $(OBJECT) $(TARGET)
    ```

    >Note: The DLRLIB_PATH variable should be set to the correct directory where the DLR library files are located. The files and character models directory can be found in `[INSTALLATION FOLDER]\Lib\Linux`.

### Include the library

1. Add headers and libs in `DLRCSample.c`.   
   
    ```c
    #include <stdio.h>
    #include "<relative path>/Include/DynamsoftLabelRecognizer.h"
    #include "<relative path>/Include/DynamsoftCommon.h"

    // The following code is only applies to Windows.
    #ifdef _WINDOWS
        #ifdef _WIN64
            #pragma comment(lib, "<relative path>/Lib/Windows/x64/DynamsoftLabelRecognizerx64.lib")
        #else
            #pragma comment(lib, "<relative path>/Lib/Windows/x86/DynamsoftLabelRecognizerx86.lib")
        #endif
    #endif
    ```
   
    >Please replace `<relative path>` in the above code with the relative path to the `DLRCSample.c` file. The `DynamsoftLabelRecognizer.h` and `DynamsoftCommon.h` file can be found in `[INSTALLATION FOLDER]\Include\` folder. The import lib files (only for Windows) can be found in `[INSTALLATION FOLDER]\Lib\`. 
    
### Initialize the Dynamsoft Label Recognizer

1. Create an instance of Dynamsoft Label Recognizer

    ```c
    void* dlr = DLR_CreateInstance();
    ```

2. Initialize the license key

    ```c
    DLR_InitLicense(dlr, "<insert DLR license key here>");
    ```    
    
    >Please replace `<insert DLR license key here>` with your DLR license key. There are two ways to obtain a DLR license:
    >- Find the license in the sample code of the installation package;
    >- If the license has expired, please request a trial license through the [customer portal](https://www.dynamsoft.com/customer/license/trialLicense?utm_source=docs). 


### Recognizing and output results

1. Recognizing text in an image 
    
    ```c
    errorcode = DLR_RecognizeByFile(dlr, "test.png", "");
    
    if(errorcode != DLR_OK)
        printf("%s\r\n", DLR_GetErrorString(errorcode));
    ```

    >You can download the image [dlr_test.png](../assets/dlr_test.png) for testing. In addition, you can replace `dlr_test.png` with the full path of the image you want to recognize.

    >For the error handling mechanism, the SDK returns Error Code for each function and provides a function `DBR_GetErrorString` to get the readable message. You should add codes for error handling based on your needs. Check out [Error Code]({{site.enumerations}}error-code.html) for full supported error codes.

2. Get and output the recognition results

    ```c
    DLRResultArray *pDLRResults = NULL;
    DLRResult* result = NULL;
    int lCount, rCount, li, ri;

    // Get all recognized results.
    DLR_GetAllResults(dlr, &pDLRResults);

    if (pDLRResults != NULL && pDLRResults->resultsCount > 0)
    {
        rCount = pDLRResults->resultsCount;
        printf("Recognized %d results\r\n", rCount);
        for (ri = 0; ri < rCount; ++ri)
        {
            // Get result of each text area (also called label).
            result = pDLRResults->results[ri];
            lCount = result->lineResultsCount;
            for (li = 0; li < lCount; ++li)
            {
                // Get the result of each text line in the label.
                printf("Line result %d: %s\r\n", li, result->lineResults[li]->text);
            }
        }
    }
    else
    {
        printf("No data detected.\r\n");
    }
    ```

    The recognition results of SDK are organized into a four-tier structure: 
    - `DLRResultArray` corresponds to the results of an `image`
    - `DLRResult` corresponds to the result of a `TextArea` (also called Label) 
    - `DLRLineResult` corresponds to the result of each `TextLine` in the Label
    - `DLRCharacterResult` corresponds to the result of each `Character` in the `TextLine`

    The structure is shown in the figure below:

    <div align="center">
    <img src="../assets/dlr_result.png" alt="DLR Result Structure" width="80%"/>
    <p>Figure 1 – DLR Result Structure</p>
    </div> 

### Release allocated memory

1. Release the allocated memory for the recognition results and instance

    ```c
    if(pDLRResults != NULL)           
        DLR_FreeResults(&pDLRResults);
    
    DLR_DestroyInstance(dlr);
    ```

You can find the similar complete source code for this application in `dlr-c_cpp-{version number}\DynamsoftLabelRecognizer\Samples\HelloWorldC`.

### Build and run the project

#### For windows

1. Build the application through Visual Studio and copy the related DLL files and character models directory to the same folder as the EXE file. The DLL files and character models directory can be found in `[INSTALLATION FOLDER]\Lib\Windows\[platforms]`.

2. Run the program `DLRSample.exe`. The executable files can be downloaded [here](). 
#### For Linux

1. Open a terminal and change to the target directory where `Makefile` located in. Build the sample:

    ```
    >make
    ```

2. Run the program `DLRCSample`. The executable files can be downloaded [here](). 
    ```
    >./DLRCSample
    ```

