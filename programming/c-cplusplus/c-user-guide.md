---
layout: default-layout
title: Dynamsoft Label Recognizer - C User Guide
description: This is the user guide page of Dynamsoft Label Recognizer for C Language.
keywords: c, user guide
needAutoGenerateSidebar: true
---

# Dynamsoft Label Recognizer - C User Guide

## System Requirements

- Operating systems:
   - Windows: 7, 8, 10, 2003, 2008, 2008 R2, 2012.
   - Linux x64: Ubuntu 14.04.4+ LTS, Debian 8+, etc;   

## Installation

Download the Dynamsoft Label Recognizer SDK from the [Dynamsoft website](https://www.dynamsoft.com/label-recognition/downloads) and unzip the package. The package includes a free trial license valid for 30 days.   

## Getting Started: Hello World

1. Start Visual Studio and create a new Win32 Console Application in C. 
   
2. Add Dynamsoft Label Recognizer headers and libs in `DLRHelloWorld.c`.   
   
   ```c
    #include <stdio.h>
    #include "<relative path>/Include/DynamsoftLabelRecognizer.h"
    #include "<relative path>/Include/DynamsoftCommon.h"

    #ifdef _WIN64
    #pragma comment(lib, "<relative path>/Lib/Windows/x64/DynamsoftLabelRecognizerx64.lib")
    #else
    #pragma comment(lib, "<relative path>/Lib/Windows/x86/DynamsoftLabelRecognizerx86.lib")
    #endif
   ```
   
    The `DynamsoftLabelRecognizer.h` and `DynamsoftCommon.h` file can be found in `[INSTALLATION FOLDER]\Include\` folder. The other necessary folder and files, including DLL/LIB files, can be found in `[INSTALLATION FOLDER]\Lib\`.  Please replace `<relative path>` in the above code with the relative path to the `DLRHelloWorld.c` file. 
 
3. Update the main function in `DLRHelloWorld.c`.   
   ```c
    int main()
    {
        int errorcode = 0;
        DLRResultArray *pDLRResults = NULL;
        DLRResult* result = NULL;
        int lCount, rCount, li, ri;

        void* dlr = DLR_CreateInstance();

        DLR_InitLicense(dlr, "<insert DLR license key here>");

        errorcode = DLR_RecognizeByFile(dlr, "<full image path>", "");

        if (errorcode != DLR_OK)
            printf("\r\nFailed to recognize label\r\n");
        else
        {
            DLR_GetAllDLRResults(dlr, &pDLRResults);

            if (pDLRResults != NULL)
            {
                rCount = pDLRResults->resultsCount;
                printf("\r\nRecognized %d results\r\n", rCount);
                for (ri = 0; ri < rCount; ++ri)
                {
                    result = pDLRResults->results[ri];
                    lCount = result->lineResultsCount;
                    for (li = 0; li < lCount; ++li)
                    {
                        printf("Line result %d: %s\r\n", li, result->lineResults[li]->text);
                    }
                }
            }
            else
            {
                printf("\r\nNo data detected.\r\n");
            }
            DLR_FreeDLRResults(dlr, &pDLRResults);
        }

        DLR_DestroyInstance(dlr);

        return 0;
    }
   ```

    Please replace `<insert DLR license key here>` with your DLR license key. If you do not have a valid license, please request a trial license through the [customer portal](https://www.dynamsoft.com/customer/license/trialLicense). 

    In the snippet above, `<full image path>` should also be replaced with the full path to the image you'd like to recognize.

4. Run the project.   
   Build the application and copy the related DLL files to the same folder as the EXE file. The DLLs can be found in `[INSTALLATION FOLDER]\Lib\[OPERATING SYSTEM]\`.
   
    To deploy your application, ensure the DLL/Lib files are in the same folder as the EXE file. 

## Features

### Specify a reference region and text area

There are two ways to set a single reference region - 1) through runtime settings and 2) JSON template. The following example demonstrates how to specify a single reference region using the first option - runtime settings. The second option is outlined in the next section [Specify multiple reference regions](#specify-multiple-reference-regions) for how to reference regions using a JSON template.

```c
    char error[512];

    DLRRuntimeSettings settings;
    DLR_GetRuntimeSettings(dlr, &settings);
    
    settings.referenceRegion= { { {0, 0}, { 50,0 }, { 50,100 }, { 0, 100 }}, 1 };
    settings.textArea = { { {0,0}, {50,0},{50,100},{0,100} } };
    DLR_UpdateRuntimeSettings(dlr, &settings, error, 512);
```

### Specify multiple reference regions

To reference multiple regions, we cannot follow the runtime settings example above. Below is an example of how to define multiple reference regions of interest, `R1` and `R2`, using a template string. Learn more about [`ReferenceRegionArray`]({{ site.parameters-reference }}organizational-json-parameter.html#referenceregionarray).

```c
    char * pJson = 
    "{\"ReferenceRegionArray\":[{\
        \"Localization\": \
            {\
                \"SourceType\": \"DLR_LST_PREDETECTED_REGION\",\
                \"RegionPredetectionModesIndex\": 1\
            },\
        \"Name\":\"R1\"\
    },{\
        \"Localization\": \
            {\
                \"SourceType\": \"DLR_LST_PREDETECTED_REGION\",\
                \"RegionPredetectionModesIndex\": 0\
            },\
        \"Name\":\"R2\"\
    }], \"LabelRecognizerParameterArray\":[{\
        \"Name\": \"l1\",\
        \"LinesCount\":2,\
        \"ReferenceRegionNameArray\": [\"R1\",\"R2\"]\
    }]}";
    DLR_AppendSettingsFromString(dlr, pJson, errorMessage, 256);
```

### Specify one region with multiple text areas

```c
    char * pJson = 
    "{\"TextAreaArray\":[{\
        \"FirstPoint\" : [ -500, -500 ],\
        \"SecondPoint\" : [500, -500],\
        \"ThirdPoint\" : [500, 0],\
        \"FourthPoint\" : [-500, 0],\
        \"Name\" : \"t2\"\
    },{\
        \"FirstPoint\" : [ -500, 0 ],\
        \"SecondPoint\" : [500, 0],\
        \"ThirdPoint\" : [500, 500],\
        \"FourthPoint\" : [-500, 500],\
        \"Name\" : \"t1\"\
    }], \"ReferenceRegionArray\":[{\
        \"Localization\": \
            {\
                \"SourceType\": \"DLR_LST_PREDETECTED_REGION\",\
                \"RegionPredetectionModesIndex\": 1\
            },\
        \"Name\":\"R1\",\
        \"TextAreaNameArray\" : [ \"t1\", \"t2\" ]\
    }], \"LabelRecognizerParameterArray\":[{\
        \"Name\": \"l1\",\
        \"LinesCount\":2,\
        \"ReferenceRegionNameArray\": [\"R1\"]\
    }]}";
    DLR_AppendSettingsFromString(pJson, errorMessage, 256);
```

### Enable region autodetection 

Dynamsoft Label Recognizer SDK supports automatic region detection to extract text.

```c
    char szErrorMsg[512];

    DLRRuntimeSettings settings;
    DLR_GetRuntimeSettings(dlr, &settings);
    settings.regionPredetectionModes[0] = DLRRegionPredetectionMode::DLR_RPM_AUTO;
    DLR_UpdateRuntimeSettings(dlr, &settings, szErrorMsg, 512);
```

Setting the predetection mode option to `DLR_RPM_AUTO` will allow the library to automatically detect a region. Learn more about other predetection mode options available in [`DLRRegionPredetectionMode`]({{ site.enumerations }}parameter-mode-enums.html#dlrregionpredetectionmode).

### Use a template to change settings

Easily manage recognition settings and reduce redundant lines of code by using templates. Templates can be used to customize and manage all runtime settings. Templates can be used in either string or JSON file format. 

#### Change template settings using a string

Use [`DLR_AppendSettingsFromString`](api-reference/label-recognizer-functions.md#dlr_appendsettingsfromstring) when changing template settings with a string. The following demonstrates how to use a string template to modify recognition settings.

```c
    char* pJson = "{\"CharacterModelArray\":[\
        {\
            \"Name\":\"Number\",\
            \"DirectoryPath\" : \"CharacterModel\"\
        },\
        {\
            \"Name\":\"NumberLetter\",\
            \"DirectoryPath\" : \"CharacterModel\"\
        }], \"TextAreaArray\":[{\"CharacterModelName\" : \"NumberLetter\",\"Name\" : \"numberLetterArea\"}], \
        \"ReferenceRegionArray\":[{\"TextAreaNameArray\" : [ \"numberLetterArea\" ],\"Name\":\"numberletterregion\"}], \
        \"LabelRecognizerParameterArray\":[{\"Name\": \"l1\",\"LetterHeightRange\" : [ 8, 30, 1 ],\"ReferenceRegionNameArray\": [\"numberletterregion\"]}]}";
    
    DLR_AppendSettingsFromString(dlr, pJson, errorMessage, 256);

```

#### Change template settings using a JSON file

When using a JSON file, we will use another method [`DLR_AppendSettingsFromFile`](api-reference/label-recognition-functions.md#dlr_appendsettingsfromfile).

The following demonstrates how to use a template file(`DLRTemplate.json`) to modify recognition settings.

```json

    {
        "LabelRecognizerParameterArray" : [
        {
            "Name":"locr",
            "MaxThreadCount":4,
            "LinesCount":1,
            "GrayscaleTransformationModes":[{
                "Mode":"DLR_GTM_INVERTED"
            }],
            "RegionPredetectionModes":[
            {
                "ForeAndBackgroundColours" : "[20,-1,20]",
                "Mode" : "DLR_RPM_GENERAL_HSV_CONTRAST",
                "SpatialIndexBlockSize" : 3
            }
            ],
            "CharacterModelName":"Number"
        }
        ],

        "ReferenceRegionArray":[
        {
            "Name":"R1",
            "Localization": 
                {
                    "SourceType": "DLR_LST_PREDETECTED_REGION",
                    "RegionPredetectionModesIndex": 0
                },
            "TextAreaNameArray":["T1"]
        }
        ],
        
        "TextAreaArray":[
        {
            "Name":"T1",
            "FirstPoint":[0,0],
            "SecondPoint":[100,0],
            "ThirdPoint":[100,100],
            "FourthPoint":[0,100],
            "LetterHeightRange":[15,100,1]
        }
        ],
        
        "CharacterModelArray":[
        {
            "Name":"Number",
            "DirectoryPath":"../CharacterModel"
        }
        ]
    }
```

```c
    int main() {
        char error[512];
        char* ocrTemplate = "<relative_path>/DLRTemplate.json";
        char* templateName = "dlrtemplate";

        DLR_AppendSettingsFromFile(dlr, ocrTemplate, error, 512);

        ret = DLR_RecognizeByFile(dlr, "<full image path>", templateName);
        ...
    }
```
