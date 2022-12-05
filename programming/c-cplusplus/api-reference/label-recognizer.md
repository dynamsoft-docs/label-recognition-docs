---
layout: default-layout
title: CLabelRecognizer Class - Dynamsoft Label Recognizer C++ API Reference
description: This page shows CLabelRecognizer methods of Dynamsoft Label Recognizer for C++ API Reference.
keywords: api reference, c++
needAutoGenerateSidebar: true
needGenerateH3Content: true
noTitleIndex: true
---

# class CLabelRecognizer

```cpp
class dynamsoft::dlr::CLabelRecognizer
```

## Initialization Methods Summary
  
  | Method               | Description |
  |----------------------|-------------|
  | [`CLabelRecognizer`](#clabelrecognizer) | Initialization of `CLabelRecognizer` object.|

## Settings Methods Summary

  | Method               | Description |
  |----------------------|-------------|
  | [`SetCharacterModelDefaultPath`](#setcharactermodeldefaultpath) | Set default directory path of the character models. |
  | [`GetRuntimeSettings`](#getruntimesettings) | Gets the current settings and saves it into a struct. |
  | [`UpdateRuntimeSettings`](#updateruntimesettings) | Updates runtime settings with a given struct. |
  | [`ResetRuntimeSettings`](#resetruntimesettings) | Resets the runtime settings. |
  | [`InitRuntimeSettings`](#initruntimesettings) | Initializes a new setting to the current label recognizer instance via template string. |
  | [`InitRuntimeSettingsFromFile`](#initruntimesettingsfromfile) | Initializes a new setting to the current label recognizer instance via template file. |
  | [`OutputRuntimeSettings`](#outputruntimesettings) | Output runtime settings to a string. |
  | [`OutputRuntimeSettingsToFile`](#outputruntimesettingstofile) | Outputs LabelRecognizerParameter settings into a file (JSON file). |
  | [`UpdateReferenceRegionFromBarcodeResults`](#updatereferenceregionfrombarcoderesults) | Updates reference region which is defined with source type LST_BARCODE. |
  | [`GetModeArgument`](#getmodeargument) | Get argument value for the specified mode parameter. |
  | [`SetModeArgument`](#setmodeargument) | Set argument value for the specified mode parameter. |

## Recognizing Methods Summary

  | Method               | Description |
  |----------------------|-------------|
  | [`RecognizeBuffer`](#recognizebuffer) | Recognizes text from memory buffer containing image pixels in defined format. |
  | [`RecognizeFile`](#recognizefile) | Recognizes text from a specified image file. |
  | [`RecognizeFileInMemory`](#recognizefileinmemory) | Recognizes text from an image file in memory. |

## Result Methods Summary

  | Method               | Description |
  |----------------------|-------------|
  | [`GetAllResults`](#getallresults) | Gets all recognized results. |
  | [`FreeResults`](#freeresults) | Frees memory allocated for recognized results. |

## General Methods Summary

  | Method               | Description |
  |----------------------|-------------|
  | [`GetErrorString`](#geterrorstring) | Returns the error string. |
  | [`GetVersion`](#getversion) | Returns the version number string for the SDK. |
  | [`FreeString`](#freestring) | Free the allocated string memory. |

## Initialization Methods Details

### CLabelRecognizer

Initialization of `CLabelRecognizer` object.

```cpp
CLabelRecognizer()
```

**Code Snippet**

```cpp
CLabelRecognizer* recognizer = new CLabelRecognizer();
delete recognizer;
```

## Settings Methods Details

### SetCharacterModelDefaultPath

Set default directory path of the character models.

```cpp
int SetCharacterModelDefaultPath (const char* modelPath, char errorMsgBuffer[], const int errorMsgBufferLen)
```

**Parameters**
`[in] modelPath` The full directory path of character models.  
`[in,out] errorMsgBuffer` The buffer is allocated by caller and the recommending length is 256. The error message will be copied to the buffer.  
`[in] errorMsgBufferLen` The length of allocated buffer.

**Return Value**  
Returns error code (returns 0 if the function operates successfully).
*You can call [`GetErrorString`](#geterrorstring) to get detailed error message.*

**Code Snippet**

```cpp
char errorMessage[256];
CLicenseManager::InitLicense("t0260NwAAAHV***************", errorMessage, 256);

CLabelRecognizer* recognizer = new CLabelRecognizer();
int errorCode = recognizer->SetCharacterModelDefaultPath("C:\\CharacterModel", errorMessage, 256);
delete recognizer;
```

&nbsp;

### GetRuntimeSettings

Get current settings and save them into a [`DLR_RuntimeSettings`](dlr-runtime-settings.md) struct.

```cpp
int GetRuntimeSettings (DLR_RuntimeSettings* settings)
```

**Parameters**

`[in,out] settings` The struct of runtime settings.  

**Return value**

Returns error code (returns 0 if the function operates successfully).    
*You can call [`GetErrorString`](#geterrorstring) to get detailed error message.*

**Code Snippet**

```cpp
char errorMessage[256];
CLicenseManager::InitLicense("t0260NwAAAHV***************", errorMessage, 256);

CLabelRecognizer* recognizer = new CLabelRecognizer();
DLR_RuntimeSettings settings;
int errorCode = recognizer->GetRuntimeSettings(&settings);
delete recognizer;
```

&nbsp;

### UpdateRuntimeSettings

Update runtime settings with a given [`DLR_RuntimeSettings`](dlr-runtime-settings.md) struct.

```cpp
int UpdateRuntimeSettings (DLR_RuntimeSettings* settings, char errorMsgBuffer[] = NULL, const int errorMsgBufferLen = 0)
```

**Parameters**

`[in] settings` The struct of runtime settings.  
`[in,out] errorMsgBuffer` <sub>Optional</sub> The buffer is allocated by caller and the recommended length is 256.The error message will be copied to the buffer.  
`[in] errorMsgBufferLen` <sub>Optional</sub> The length of the allocated buffer.  

**Return value**

Returns error code (returns 0 if the function operates successfully).
*You can call [`GetErrorString`](#geterrorstring) to get detailed error message.*

**Code Snippet**

```cpp
char errorMessage[256];
CLicenseManager::InitLicense("t0260NwAAAHV***************", errorMessage, 256);

CLabelRecognizer* recognizer = new CLabelRecognizer();
DLR_RuntimeSettings settings;
int errorCode = recognizer->GetRuntimeSettings(&settings);
settings.maxThreadCount = 4;
recognizer->UpdateRuntimeSettings(&settings, errorMessage, 256);
delete recognizer;
```

&nbsp;

### ResetRuntimeSettings

Reset all runtime settings to default values.

```cpp
int ResetRuntimeSettings ()
```

**Return value**

Returns error code (returns 0 if the function operates successfully).
*You can call [`GetErrorString`](#geterrorstring) to get detailed error message.*

**Code Snippet**

```cpp
char errorMessage[256];
CLicenseManager::InitLicense("t0260NwAAAHV***************", errorMessage, 256);

CLabelRecognizer* recognizer = new CLabelRecognizer();
DLR_RuntimeSettings settings;
int errorCode = recognizer->GetRuntimeSettings(&settings);
settings.maxThreadCount = 4;
recognizer->UpdateRuntimeSettings(&settings);
recognizer->ResetRuntimeSettings();
delete recognizer;
```

&nbsp;

### InitRuntimeSettings

Initializes a new setting to the current label recognizer instance via template string.

```cpp
int InitRuntimeSettings(const char* content, char errorMsgBuffer[] = NULL, const int errorMsgBufferLen = 0)
```

**Parameters**

`[in] content` A JSON string that represents the content of the settings.
`[in,out] errorMsgBuffer` <sub>Optional</sub> The buffer is allocated by caller and the recommending length is 256. The error message will be copied to the buffer.  
`[in] errorMsgBufferLen` <sub>Optional</sub> The length of allocated buffer.

**Return value**

Returns error code (returns 0 if the function operates successfully).
*You can call [`GetErrorString`](#geterrorstring) to get detailed error message.*

**Code Snippet**

```cpp
char errorMessage[256];
CLicenseManager::InitLicense("t0260NwAAAHV***************", errorMessage, 256);

CLabelRecognizer* recognizer = new CLabelRecognizer();
recognizer->InitRuntimeSettings("{\"LabelRecognizerParameter\":{\"Name\":\"P1\", \"RegionPredetectionModes\":[{\"Mode\":\"RPM_GENERAL_HSV_CONTRAST\"}], \"ReferenceRegionNameArray\": [\"R1\"]},\"ReferenceRegion\":{\"Name\":\"R1\",\"Localization\":{\"SourceType\":\"LST_PREDETECTED_REGION\",\"RegionPredetectionModesIndex\":0},\"TextAreaNameArray\":[\"T1\"]},\"TextArea\":{\"Name\":\"T1\",\"CharacterModelName\":\"Number\"}}", errorMessage, 256);
delete recognizer;
```

&nbsp;

### InitRuntimeSettingsFromFile

Initializes a new setting to the current label recognizer instance via template file.

```cpp
int InitRuntimeSettingsFromFile (const char* filePath, char errorMsgBuffer[] = NULL, const int errorMsgBufferLen = 0)
```

**Parameters**

`[in] filePath` The settings file path.
`[in,out] errorMsgBuffer` <sub>Optional</sub> The buffer is allocated by caller and the recommending length is 256. The error message will be copied to the buffer.  
`[in] errorMsgBufferLen` <sub>Optional</sub> The length of allocated buffer.

**Return value**

Returns error code (returns 0 if the function operates successfully).    
*You can call [`GetErrorString`](#geterrorstring) to get detailed error message.*

**Code Snippet**

```cpp
char errorMessage[256];
CLicenseManager::InitLicense("t0260NwAAAHV***************", errorMessage, 256);

CLabelRecognizer* recognizer = new CLabelRecognizer();
recognizer->InitRuntimeSettingsFromFile("your file path", errorMessage, 256);
delete recognizer;
```

&nbsp;

### OutputRuntimeSettingsToFile

Outputs runtime settings and save them into a settings file (JSON file).  

```cpp
int OutputRuntimeSettingsToFile(const char* templateName, const char* filePath)
```

**Parameters**

`[in] templateName` A unique name for declaring current runtime settings.  
`[in] filePath` The path of the output file which stores current settings.  

**Return value**

Returns error code (returns 0 if the function operates successfully).    
*You can call [`GetErrorString`](#geterrorstring) to get detailed error message.*

**Code Snippet**

```cpp
char errorMessage[256];
CLicenseManager::InitLicense("t0260NwAAAHV***************", errorMessage, 256);

CLabelRecognizer* recognizer = new CLabelRecognizer();
recognizer->InitRuntimeSettings("{\"LabelRecognizerParameter\":{\"Name\":\"P1\", \"RegionPredetectionModes\":[{\"Mode\":\"RPM_GENERAL_HSV_CONTRAST\"}], \"ReferenceRegionNameArray\": [\"R1\"]},\"ReferenceRegion\":{\"Name\":\"R1\",\"Localization\":{\"SourceType\":\"LST_PREDETECTED_REGION\",\"RegionPredetectionModesIndex\":0},\"TextAreaNameArray\":[\"T1\"]},\"TextArea\":{\"Name\":\"T1\",\"CharacterModelName\":\"Number\"}}", errorMessage, 256);
recognizer->OutputRuntimeSettingsToFile("P1","C:\\Program Files (x86)\\Dynamsoft\\{Version number}\\Templates\\CurrentRuntimeSettings.json");
delete recognizer;
```

&nbsp;

### OutputRuntimeSettings

Outputs runtime settings and save them into a settings file (JSON file).  

```cpp
int OutputRuntimeSettings(const char* pSettingsName, char** content)
```

**Parameters**
`[in] pSettingsName` A unique name for declaring current runtime settings.  
`[in,out] content` The output string which stores the contents of current settings.If not needed, it should be freed via `FreeString`.

**Return value**

Returns error code (returns 0 if the function operates successfully).    
*You can call [`GetErrorString`](#geterrorstring) to get detailed error message.*

**Code Snippet**

```cpp
char errorMessage[256];
CLicenseManager::InitLicense("t0260NwAAAHV***************", errorMessage, 256);

CLabelRecognizer* recognizer = new CLabelRecognizer;
char *content = NULL;
recognizer->OutputRuntimeSettings("", &content);
CLabelRecognizer::FreeString(&content);
delete recognizer;
```

&nbsp;

### UpdateReferenceRegionFromBarcodeResults

Updates reference region which is defined with source type LST_BARCODE.  

```cpp
int UpdateReferenceRegionFromBarcodeResults (const BarcodeResultArray* barcodeResults, const char* templateName)
```

**Parameters**

`[in] barcodeResults` The barcode results used to localize reference region.  See also [`BarcodeResultArray`](barcode-result-array.md).
`[in] templateName` The template name. A template name is the value of key LabelRecognizerParameter.Name defined in JSON formatted settings. If no template name is specified, current runtime settings will be used.

**Return value**

Returns error code (returns 0 if the function operates successfully).
*You can call [`GetErrorString`](#geterrorstring) to get detailed error message.*

**Code Snippet**

```cpp
char errorMessage[256];
CLicenseManager::InitLicense("t0260NwAAAHV***************", errorMessage, 256);

CLabelRecognizer* recognizer = new CLabelRecognizer();
recognizer->AppendSettingsFromString("{\"LabelRecognizerParameter\":{\"Name\":\"P1\", \"RegionPredetectionModes\":[{\"Mode\":\"RPM_GENERAL_HSV_CONTRAST\"}], \"ReferenceRegionNameArray\": [\"R1\"]},\"ReferenceRegion\":{\"Name\":\"R1\",\"Localization\":{\"SourceType\":\"LST_BARCODE\"},\"TextAreaNameArray\":[\"T1\"]},\"TextArea\":{\"Name\":\"T1\",\"CharacterModelName\":\"Number\"}}", errorMessage, 256);
//Get barcodeResults from Dynamsoft Barcode Reader SDK
recognizer->UpdateReferenceRegionFromBarcodeResults(barcodeResults, "P1");
delete recognizer;
```

&nbsp;

### SetModeArgument

Set argument value for the specified mode parameter.

```cpp
int SetModeArgument (const char* modesName, const int index, const char* argumentName, const char* argumentValue, char errorMsgBuffer[] = NULL,  const int errorMsgBufferLen = 0) 
```

**Parameters**

`[in] modesName` The mode parameter name to set argument.  
`[in] index` The array index of mode parameter to indicate a specific mode.  
`[in] argumentName` The name of the argument to set.  
`[in] argumentValue` The value of the argument to set.  
`[in,out] errorMsgBuffer`<sub>Optional</sub> The buffer is allocated by the caller and the recommended length is 256. The error message will be copied to the buffer.  
`[in] errorMsgBufferLen`<sub>Optional</sub> The length of the allocated buffer.  

**Return value**

Returns error code (returns 0 if the function operates successfully).  
*You can call [`GetErrorString`](#geterrorstring) to get detailed error message.*

**Remark**

Check follow link for available modes and arguments:

- [`RegionPredetectionModes`]({{ site.parameters-reference }}label-recognition-parameter/region-predetection-modes.html#regionpredetectionmodes)

**Code Snippet**

```cpp
char errorMessage[256];
CLicenseManager::InitLicense("t0260NwAAAHV***************", errorMessage, 256);

CLabelRecognizer* recognizer = new CLabelRecognizer();
DLR_RuntimeSettings settings;
int errorCode = recognizer->GetRuntimeSettings(&settings);
settings.furtherModes.regionPredetectionModes[0] = RPM_GENERAL_RGB_CONTRAST;
recognizer->UpdateRuntimeSettings(&settings, errorMessage, 256);
recognizer->SetModeArgument("RegionPredetectionModes", 0, "AspectRatioRange", "100", errorMessage, 256);
delete recognizer;
```

&nbsp;

### GetModeArgument

Get argument value for the specified mode parameter.

```cpp
int GetModeArgument (const char* modesName, const int index, const char* argumentName, char valueBuffer[], const int valueBufferLen, char errorMsgBuffer[] = NULL, const int errorMsgBufferLen = 0) 
```

**Parameters**
  
`[in] modesName` The mode parameter name to get argument.  
`[in] index` The array index of mode parameter to indicate a specific mode.  
`[in] argumentName` The name of the argument to get.  
`[in,out] valueBuffer` The buffer is allocated by caller and the recommended length is 480. The argument value would be copied to the buffer.  
`[in] valueBufferLen` The length of allocated buffer.  
`[in,out] errorMsgBuffer`<sub>Optional</sub> The buffer is allocated by the caller and the recommended length is 256. The error message will be copied to the buffer.  
`[in] errorMsgBufferLen`<sub>Optional</sub> The length of the allocated buffer.  

**Return value**

Returns error code (returns 0 if the function operates successfully).  
*You can call [`GetErrorString`](#geterrorstring) to get detailed error message.*

**Remark**

Check follow link for available modes and arguments:

- [`RegionPredetectionModes`]({{ site.parameters-reference }}label-recognition-parameter/region-predetection-modes.html#regionpredetectionmodes)

**Code Snippet**

```cpp
char errorMessage[256];
CLicenseManager::InitLicense("t0260NwAAAHV***************", errorMessage, 256);

CLabelRecognizer* recognizer = new CLabelRecognizer();
DLR_RuntimeSettings settings;
int errorCode = recognizer->GetRuntimeSettings(&settings);
settings.furtherModes.regionPredetectionModes[0] = RPM_GENERAL_RGB_CONTRAST;
char argumentValue[480];
recognizer->UpdateRuntimeSettings(&settings, errorMessage, 256);
recognizer->SetModeArgument("RegionPredetectionModes", 0, "AspectRatioRange", "100", errorMessage, 256);
recognizer->GetModeArgument("RegionPredetectionModes", 0, "AspectRatioRange", argumentValue, 480, errorMessage, 256);
delete recognizer;
```

## Recognition Methods

### RecognizeBuffer

Recognizes text from the memory buffer containing image pixels in defined format.

```cpp
int RecognizeBuffer(const CImageData* imageData, const char* templateName)
```

**Parameters**

`[in] imageData` An instance of [`CImageData`](image-data-cpp.md) that represents an image.  
`[in] templateName` The template name. A template name is the value of key LabelRecognizerParameter.Name defined in JSON formatted settings. If no template name is specified, current runtime settings will be used.

**Return value**

Returns error code (returns 0 if the function operates successfully).
*You can call [`GetErrorString`](#geterrorstring) to get detailed error message.*

**Code Snippet**

```cpp
char errorMessage[256];
CLicenseManager::InitLicense("t0260NwAAAHV***************", errorMessage, 256);

CLabelRecognizer* recognizer = new CLabelRecognizer();

//Generate imageData from somewhere else
int errorCode = recognizer->RecognizeBuffer(imageData, "");
delete recognizer;
```

&nbsp;

### RecognizeFile

Recognizes text from a specified image file.

```cpp
int RecognizeFile (const char* fileName, const char* templateName) 
```

**Parameters**

`[in] fileName` A string defining the file name.  
`[in] templateName` The template name. A template name is the value of key LabelRecognizerParameter.Name defined in JSON formatted settings. If no template name is specified, current runtime settings will be used.

**Return value**

Returns error code (returns 0 if the function operates successfully).
*You can call [`GetErrorString`](#geterrorstring) to get detailed error message.*

**Code Snippet**

```cpp
char errorMessage[256];
CLicenseManager::InitLicense("t0260NwAAAHV***************", errorMessage, 256);

CLabelRecognizer* recognizer = new CLabelRecognizer();
int errorCode = recognizer->RecognizeFile("C:\\Program Files (x86)\\Dynamsoft\\{Version number}\\Images\\AllSupportedBarcodeTypes.tif", "");
delete recognizer;
```

### RecognizeFileInMemory

Recognizes text from a specified image file in memory.

```cpp
int RecognizeFileInMemory (const unsigned char* pFileBytes, const int fileSize, const char* pTemplateName) 
```  

**Parameters**  
`[in] pFileBytes` The image file bytes in memory.  
`[in] fileSize` The length of the file bytes in memory.  
`[in] pTemplateName` The template name.  

**Return Value**  
Returns error code (returns 0 if the function operates successfully).
*You can call [`GetErrorString`](#geterrorstring) to get detailed error message.*

**Code Snippet**  

```cpp
char errorMessage[256];
CLicenseManager::InitLicense("t0260NwAAAHV***************", errorMessage, 256);

CLabelRecognizer* recognizer = new CLabelRecognizer();

unsigned char* pFileBytes;
int nFileSize = 0;
GetFileStream("C:\\Program Files (x86)\\Dynamsoft\\{Version number}\\Images\\AllSupportedBarcodeTypes.tif", &pFileBytes, &nFileSize);

int errorCode = recognizer->RecognizeFileInMemory(pFileBytes, nFileSize, "");
delete recognizer;
```

## Result Methods Details

### GetAllResults

Get all recognized results.

```cpp
int GetAllResults (DLR_ResultArray** results) 
```

**Parameters**

`[out] results` Recognized results returned by last calling function [`RecognizeBuffer`](#recognizebuffer) / [`RecognizeFile`](#recognizefile). The results is allocated by SDK and should be freed by calling function [`FreeResults`](#freeresults).

**Return value**

Returns error code (returns 0 if the function operates successfully).
*You can call [`GetErrorString`](#geterrorstring) to get detailed error message.*

**Code Snippet**

```cpp
char errorMessage[256];
CLicenseManager::InitLicense("t0260NwAAAHV***************", errorMessage, 256);

CLabelRecognizer* recognizer = new CLabelRecognizer();
DLR_ResultArray * results;
int errorCode = recognizer->RecognizeFile("C:\\Program Files (x86)\\Dynamsoft\\{Version number}\\Images\\AllSupportedBarcodeTypes.tif", "");
recognizer->GetAllResults(&results);
CLabelRecognizer::FreeResults(&results);
delete recognizer;
```

&nbsp;

### FreeResults

Free memory allocated for text results.

```cpp
static void FreeResults (DLR_ResultArray ** results) 
```

**Parameters**

`[in] results` Recognized results.

**Code Snippet**

```cpp
char errorMessage[256];
CLicenseManager::InitLicense("t0260NwAAAHV***************", errorMessage, 256);

CLabelRecognizer* recognizer = new CLabelRecognizer();
DLR_ResultArray * results;
int errorCode = recognizer->RecognizeFile("C:\\Program Files (x86)\\Dynamsoft\\{Version number}\\Images\\AllSupportedBarcodeTypes.tif", "");
recognizer->GetAllResults(&results);
CLabelRecognizer::FreeResults(&results);
delete recognizer;
```

## General Methods Details

### GetErrorString

Get error message by error code.

```c++
static const char* GetErrorString (const int errorCode) 
```

**Parameters**

`[in] errorCode` The error code.

**Return value**

The error message.

**Code Snippet**

```c++
const char* errorString = GetErrorString(errorCode);
```

&nbsp;

### GetVersion

Get version information of SDK.

```c++
static const char* GetVersion ()
```

**Return value**

The version information string.

**Code Snippet**

```c++
const char* versionInfo = GetVersion();
```

&nbsp;

### FreeString

Free the allocated string memory.

```cpp
static void FreeString(char** str)
```

**Parameters**

`[in] str` The allocated string memory.

**Code Snippet**

```cpp
CLabelRecognizer* recognizer = new CLabelRecognizer();
char *content = NULL;
recognizer->OutputRuntimeSettings("", &content);
CLabelRecognizer::FreeString(&content);
delete recognizer;
```
