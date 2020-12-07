# Dynamsoft Label Recognition - C/C++ User Guide

Precisely read alphanumeric characters and standard symbols from images of varying background colour, font, or text size. Additional characters can be trained.

## System Requirements

- Operating systems:
   - Windows: 7, 8, 10, 2003, 2008, 2008 R2, 2012.
   - Linux x64: Ubuntu 14.04.4+ LTS, Debian 8+, etc;   

## Installation

Download the Dynamsoft Label Recognition SDK from the [Dynamsoft website](https://www.dynamsoft.com/Downloads/Dynamic-Barcode-Reader-Download.aspx) and run the installer. The installer includes a free trial license valid for 30 days.   

## Getting Started: Hello World

1. Start Visual Studio and create a new Win32 Console Application in C++. Let's name it `BarcodeReadDemo_CPP`.  
   
2. Add Dynamsoft Label Recognition headers and libs in `DLRHelloWorld.cpp`.   
   ```cpp
    #include <stdio.h>
    #include "<relative path>/Include/DynamsoftLabelRecognition.h"
    #include "<relative path>/Include/DynamsoftCommon.h"
    using namespace std;
    using namespace dynamsoft::dlr;

    #ifdef _WIN64
    #pragma comment(lib, "<relative path>/Lib/Windows/x64/DynamsoftLabelRecognitionx64.lib")
    #else
    #pragma comment(lib, "<relative path>/Lib/Windows/x86/DynamsoftLabelRecognitionx86.lib")
    #endif
   ```
   
  The `DynamsoftLabelRecognition.h` and `DynamsoftCommon.h` file can be found in `[INSTALLATION FOLDER]\Include\` folder. The other necessary folder and files, including DLL/LIB files, can be found in `[INSTALLATION FOLDER]\Lib\`.  Please replace `<relative path>` in the above code with the relative path to the `DLRHelloWorld.cpp` file. 
 
3. Update the main function in `DLRHelloWorld.cpp`.   
   ```cpp
    int main()
    {
        CLabelRecognition dlr;
        dlr.InitLicense("<insert DLR license key here>");

        int errorcode = dlr.RecognizeByFile("<full image path>", "");

        if (errorcode != DLR_OK)
            printf("\r\nFailed to recognize label\r\n");
        else
        {
            DLRResultArray* pDLRResults = nullptr;
            dlr.GetAllDLRResults(&pDLRResults);

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
            dlr.FreeDLRResults(&pDLRResults);
        }
        return 0;
    }
   ```

4. Run the project.   
   Build the application and copy the related DLL files to the same folder as the EXE file. The DLLs can be found in `[INSTALLATION FOLDER]\Lib\[OPERATING SYSTEM]\`.
   
To deploy your application, ensure the DLL/Lib files are in the same folder as the EXE file. 

## Features

### Specify a reference region

There are two ways to set a single reference region - 1) through runtime settings and 2) JSON template. The following example demonstrates how to specify a single reference region using the first option - runtime settings. The second option is outlined in the next section [Specify multiple reference regions](#specify-multiple-reference-regions) for how to reference regions using a JSON template.

```cpp
	char error[512];

	DLRRuntimeSettings settings;
	dlr.GetRuntimeSettings(&settings);
	settings.referenceRegion.regionBottom = 90;
	settings.referenceRegion.regionLeft = 30;
	settings.referenceRegion.regionMeasuredByPercentage = 1;
	settings.referenceRegion.regionRight = 70;
	settings.referenceRegion.regionTop = 10;
	dlr.UpdateRuntimeSettings(&settings, error, 512);
```

### Specify multiple reference regions

To reference multiple regions, we cannot follow the runtime settings example above. Below is an example of how to define multiple reference regions of interest, `R1` and `R2`, using a template string. Learn more about [`ReferenceRegionArray`](#).

```cpp
    string ReferenceRegionArray = "\"ReferenceRegionArray\":[{\
    \"Bottom\" : 60,\
    \"Left\" : 30,\
    \"MeasuredByPercentage\" : 1,\
    \"Right\" : 70,\
    \"Top\" : 30,\
    \"Name\":\"R1\"\
    },{\
    \"Bottom\" : 90,\
    \"Left\" : 10,\
    \"MeasuredByPercentage\" : 1,\
    \"Right\" : 20,\
    \"Top\" : 70,\
    \"Name\":\"R2\"\
    }]";
    string DLRParameterArray = "\"LabelRecognitionParameterArray\":[{\
    \"Name\": \"l1\",\
    \"ReferenceRegionNameArray\": [\"R1\",\"R2\"]\
    }]";
    
    dlr.AppendSettingsFromString(("{" + DLRParameterArray + ", " + ReferenceRegionArray + "}").c_str(), errorMessage, 256);
```

### Enable region autodetection 

Dynamsoft Label Recognition SDK supports automatic region detection to extract text.

```cpp
    char szErrorMsg[512];

	DLRRuntimeSettings settings;
	dlr.GetRuntimeSettings(&settings);
	settings.regionPredetectionModes[0] = DLRRegionPredetectionMode::DLR_RPM_AUTO;
	dlr.UpdateRuntimeSettings(&settings, szErrorMsg, 512);
```

Setting the predetection mode option to `DLR_RPM_AUTO` will allow the library to automatically detect a region. Learn more about other predetection mode options available in [`DLRRegionPredetectionMode`](#).

### Use a template to change settings

Easily manage recognition settings and reduce redundant lines of code by using templates. Templates can be used to customize and manage all runtime settings. Templates can be used in either string or JSON file format. 

#### Change template settings using a string

Use [`AppendSettingsFromString`](#) when changing template settings with a string. The following demonstrates how to use a string template to modify recognition settings.

```cpp
    string characterModelArray = "\"CharacterModelArray\":[\
        {\
            \"Name\":\"Number\",\
            \"DirectoryPath\" : \"CaffeModel\"\
        },\
        {\
            \"Name\":\"NumberLetter\",\
            \"DirectoryPath\" : \"CaffeModel\"\
        }]";
    
    string TextAreaArray = "\"TextAreaArray\":[{\"CharacterModelName\" : \"NumberLetter\",\"Name\" : \"numberLetterArea\"}]";

    string ReferenceRegionArray = "\"ReferenceRegionArray\":[{\"TextAreaNameArray\" : [ \"numberLetterArea\" ],\"Name\":\"numberletterregion\"}]";

    string DLRParameterArray = "\"LabelRecognitionParameterArray\":[{\"Name\": \"l1\",\"LetterHeightRange\" : [ 8, 30, 1 ],\"ReferenceRegionNameArray\": [\"numberletterregion\"]}]";
    
    dlr.AppendSettingsFromString(("{" + characterModelArray + "," + DLRParameterArray + "," + ReferenceRegionArray  +", "+ TextAreaArray+ "}").c_str(), errorMessage, 256);

```

#### Change template settings using a JSON file

As with using a string, we will use the same method [`AppendSettingsFromString`](#) to modify the template setting. When using a JSON file, we'll need to do a little more work to get the JSON file into an acceptable string.

Let's take a look at the following JSON settings file, `DLRTemplate.json`. 

```json
    {
        "LabelRecognitionParameterArray" : [
        {
            "Name":"locr",
            "MaxThreadCount":4,
            "LinesCount":1,
            "TextColourModes":[{
                "Mode":"DLR_TCM_DARK_ON_LIGHT"
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
            "Top":0,
            "Left":0,
            "Right":100,
            "Bottom":100,
            "MeasuredByPercentage":1,
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

In the following cpp file, we'll demonstrate how to read the `DLRTemplate.json` file and use it in [`AppendSettingsFromString`](#) before recognizing the image. The `ReadJsonFile` function will convert the JSON object of the file parameter to an acceptable string. 

```cpp
    string ReadJsonFile(const string& pJsonFile) {
        fstream _file;
        _file.open(pJsonFile, ios::in);

        if (!_file) {
            return "";
        }

        string tempJsonFile = pJsonFile;
        string tempSettingPath;
        int index1 = tempJsonFile.find_last_of("\\");
        int index2 = tempJsonFile.find_last_of("/");

        if (index2 > index1)
        {
            tempSettingPath = string(pJsonFile, 0, index2) + "/";
        }
        else
        {
            tempSettingPath = string(pJsonFile, 0, index1) + "\\";
        }

        std::string strJsonFile((std::istreambuf_iterator<char>(_file)), std::istreambuf_iterator<char>());
        return strJsonFile;
    }

    int main() {
        char error[512];
        string ocrTemplate;
        string templateName;

        ocrTemplate = "<relative_path>/DLRTemplate.json";
        templateName = "dlrtemplate"

        dlr.AppendSettingsFromString(ReadJsonFile(ocrTemplate).c_str(), error, 512);

        ret = ocr.RecognizeByFile("<full image path>", templateName.c_str());

        ...
    }
```
