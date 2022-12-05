---
layout: default-layout
title: Settings - Dynamsoft Label Recognition C++ API Reference
description: This is the settings functions of Dynamsoft Label Recognition for C++ API Reference.
keywords: api reference, cpp
needAutoGenerateSidebar: true
---

# C++ API Reference - Settings

| Method               | Description |
|----------------------|-------------|
  | [`AppendSettingsFromString`](#appendsettingsfromstring) | Appends LabelRecognitionParameter settings in a string to the SDK object. |
  | [`AppendSettingsFromFile`](#appendsettingsfromfile) | Appends LabelRecognitionParameter settings in a file to the SDK object. |
  | [`ClearAppendedSettings`](#clearappendedsettings) | Clears appended LabelRecognitionParameter settings. |
  | [`GetModeArgument`](#getmodeargument) | Get argument value for the specified mode parameter. |
  | [`GetRuntimeSettings`](#getruntimesettings) | Gets the current settings and saves it into a struct. |
  | [`OutputSettingsToFile`](#outputsettingstofile) | Outputs LabelRecognitionParameter settings into a file (JSON file). |
  | [`ResetRuntimeSettings`](#resetruntimesettings) | Resets the runtime settings. |
  | [`SetModeArgument`](#setmodeargument) | Set argument value for the specified mode parameter. |
  | [`UpdateReferenceRegionFromBarcodeResults`](#updatereferenceregionfrombarcoderesults) | Updates reference region which is defined with source type DLR_LST_BARCODE. |
  | [`UpdateRuntimeSettings`](#updateruntimesettings) | Updates runtime settings with a given struct. |

---

## GetRuntimeSettings
Get current settings and save them into a [`DLRRuntimeSettings`]({{ site.c-cplusplus-structs }}dlr-runtime-settings.html) struct.

```cpp
int dynamsoft::dlr::CLabelRecognition::GetRuntimeSettings (DLRRuntimeSettings* settings)
```   
   
**Parameters**
`[in,out]	settings` The struct of runtime settings.  

**Return Value**
Returns error code (returns 0 if the function operates successfully).    
*You can call [`GetErrorString`](general.md#geterrorstring) to get detailed error message.*

**Code Snippet**
```cpp
CLabelRecognition* recognizer = new CLabelRecognition();
recognizer->InitLicense("t0260NwAAAHV***************");
DLRRuntimeSettings settings;
int errorCode = recognizer->GetRuntimeSettings(&settings);
delete recognizer;
```

&nbsp;

## UpdateRuntimeSettings
Update runtime settings with a given [`DLRRuntimeSettings`]({{ site.c-cplusplus-structs }}dlr-runtime-settings.html) struct.

```cpp
int dynamsoft::dlr::CLabelRecognition::UpdateRuntimeSettings (DLRRuntimeSettings* settings, char errorMsgBuffer[] = NULL, const int errorMsgBufferLen = 0)
```   
   
**Parameters**
`[in]	settings` The struct of runtime settings.  
`[in,out]	errorMsgBuffer` <sub>Optional</sub> The buffer is allocated by caller and the recommended length is 256.The error message will be copied to the buffer.  
`[in]	errorMsgBufferLen` <sub>Optional</sub> The length of the allocated buffer.  

**Return Value**
Returns error code (returns 0 if the function operates successfully).    
*You can call [`GetErrorString`](general.md#geterrorstring) to get detailed error message.*

**Code Snippet**
```cpp
CLabelRecognition* recognizer = new CLabelRecognition();
recognizer->InitLicense("t0260NwAAAHV***************");
DLRRuntimeSettings settings;
int errorCode = recognizer->GetRuntimeSettings(&settings);
settings.linesCount = 1;
char errorMessage[256];
recognizer->UpdateRuntimeSettings(&settings, errorMessage, 256);
delete recognizer;
```

&nbsp;

## ResetRuntimeSettings
Reset all runtime settings to default values.

```cpp
int dynamsoft::dlr::CLabelRecognition::ResetRuntimeSettings ()
```   
   
**Return Value**
Returns error code (returns 0 if the function operates successfully).    
*You can call [`GetErrorString`](general.md#geterrorstring) to get detailed error message.*

**Code Snippet**
```cpp
CLabelRecognition* recognizer = new CLabelRecognition();
recognizer->InitLicense("t0260NwAAAHV***************");
DLRRuntimeSettings settings;
int errorCode = recognizer->GetRuntimeSettings(&settings);
settings.linesCount = 1;
recognizer->UpdateRuntimeSettings(&settings);
recognizer->ResetRuntimeSettings(recognizer);
delete recognizer;
```


&nbsp;


## AppendSettingsFromString
Append a new template string to the current label recognition instance.

```cpp
int dynamsoft::dlr::CLabelRecognition::AppendSettingsFromString (const char* content, char errorMsgBuffer[] = NULL, const int errorMsgBufferLen = 0)
```   
   
**Parameters**
`[in] content` A JSON string that represents the content of the settings.   
`[in,out] errorMsgBuffer` <sub>Optional</sub> The buffer is allocated by caller and the recommending length is 256. The error message will be copied to the buffer.  
`[in] errorMsgBufferLen` <sub>Optional</sub> The length of allocated buffer.


**Return Value**
Returns error code (returns 0 if the function operates successfully).    
*You can call [`GetErrorString`](general.md#geterrorstring) to get detailed error message.*

**Code Snippet**
```cpp
CLabelRecognition* recognizer = new CLabelRecognition();
recognizer->InitLicense("t0260NwAAAHV***************");
char errorMessage[256];
recognizer->AppendSettingsFromString("{\"LabelRecognitionParameter\":{\"Name\":\"P1\", \"RegionPredetectionModes\":[{\"Mode\":\"DLR_RPM_GENERAL_HSV_CONTRAST\"}], \"ReferenceRegionNameArray\": [\"R1\"]},\"ReferenceRegion\":{\"Name\":\"R1\",\"Localization\":{\"SourceType\":\"DLR_LST_PREDETECTED_REGION\",\"RegionPredetectionModesIndex\":0},\"TextAreaNameArray\":[\"T1\"]},\"TextArea\":{\"Name\":\"T1\",\"CharacterModelName\":\"Number\"}}", errorMessage, 256);
delete recognizer;
```

&nbsp;

## AppendSettingsFromFile
Appends LabelRecognitionParameter settings in a file to the SDK object.

```cpp
int dynamsoft::dlr::CLabelRecognition::AppendSettingsFromFile (const char* filePath, char errorMsgBuffer[] = NULL, const int errorMsgBufferLen = 0)
```   
   
**Parameters**
`[in] filePath` The settings file path.   
`[in,out] errorMsgBuffer` <sub>Optional</sub> The buffer is allocated by caller and the recommending length is 256. The error message will be copied to the buffer.  
`[in] errorMsgBufferLen` <sub>Optional</sub> The length of allocated buffer.


**Return Value**
Returns error code (returns 0 if the function operates successfully).    
*You can call [`GetErrorString`](general.md#geterrorstring) to get detailed error message.*

**Code Snippet**
```cpp
CLabelRecognition* recognizer = new CLabelRecognition();
recognizer->InitLicense("t0260NwAAAHV***************");
char errorMessage[256];
recognizer->AppendSettingsFromString("your file path", errorMessage, 256);
delete recognizer;
```

&nbsp;


## OutputSettingsToFile
Outputs runtime settings and save them into a settings file (JSON file).  

```cpp
int dynamsoft::dlr::CLabelRecognition::OutputSettingsToFile (const char* filePath, const char* templateName)
```   
   
**Parameters**
`[in]	filePath` The path of the output file which stores current settings.  
`[in]	templateName` A unique name for declaring current runtime settings.  


**Return Value**
Returns error code (returns 0 if the function operates successfully).    
*You can call [`GetErrorString`](general.md#geterrorstring) to get detailed error message.*

**Code Snippet**
```cpp
CLabelRecognition* recognizer = new CLabelRecognition();
recognizer->InitLicense("t0260NwAAAHV***************");
char errorMessageAppend[256];
recognizer->AppendSettingsFromString("{\"LabelRecognitionParameter\":{\"Name\":\"P1\", \"RegionPredetectionModes\":[{\"Mode\":\"DLR_RPM_GENERAL_HSV_CONTRAST\"}], \"ReferenceRegionNameArray\": [\"R1\"]},\"ReferenceRegion\":{\"Name\":\"R1\",\"Localization\":{\"SourceType\":\"DLR_LST_PREDETECTED_REGION\",\"RegionPredetectionModesIndex\":0},\"TextAreaNameArray\":[\"T1\"]},\"TextArea\":{\"Name\":\"T1\",\"CharacterModelName\":\"Number\"}}", errorMessageAppend, 256);
recognizer->OutputSettingsToFile("C:\\Program Files (x86)\\Dynamsoft\\{Version number}\\Templates\\CurrentRuntimeSettings.json", "currentRuntimeSettings");
delete recognizer;
```

&nbsp;


## ClearAppendedSettings
Clear all appended parameter settings of the current label recognition instance.

```cpp
void dynamsoft::dlr::CLabelRecognition::ClearAppendedSettings ()	
```   
   
**Code Snippet**
```cpp
CLabelRecognition* recognizer = new CLabelRecognition();
recognizer->InitLicense("t0260NwAAAHV***************");
recognizer->ClearAppendedSettings();
```

## UpdateReferenceRegionFromBarcodeResults
Updates reference region which is defined with source type DLR_LST_BARCODE.  

```cpp
int dynamsoft::dlr::CLabelRecognition::UpdateReferenceRegionFromBarcodeResults (const TextResultArray* barcodeResults, const char* templateName)
```   
   
**Parameters**
`[in]	barcodeResults` The barcode results used to localize reference region.  
`[in]	templateName` The template name. A template name is the value of key LabelRecognitionParameter.Name defined in JSON formatted settings. If no template name is specified, current runtime settings will be used.


**Return Value**
Returns error code (returns 0 if the function operates successfully).    
*You can call [`GetErrorString`](general.md#geterrorstring) to get detailed error message.*

**Code Snippet**
```cpp
CLabelRecognition* recognizer = new CLabelRecognition();
recognizer->InitLicense("t0260NwAAAHV***************");
char errorMessageAppend[256];
recognizer->AppendSettingsFromString("{\"LabelRecognitionParameter\":{\"Name\":\"P1\", \"RegionPredetectionModes\":[{\"Mode\":\"DLR_RPM_GENERAL_HSV_CONTRAST\"}], \"ReferenceRegionNameArray\": [\"R1\"]},\"ReferenceRegion\":{\"Name\":\"R1\",\"Localization\":{\"SourceType\":\"DLR_LST_BARCODE\"},\"TextAreaNameArray\":[\"T1\"]},\"TextArea\":{\"Name\":\"T1\",\"CharacterModelName\":\"Number\"}}", errorMessageAppend, 256);
//Get barcodeResults from Dynamsoft Barcode Reader SDK
recognizer->UpdateReferenceRegionFromBarcodeResults(barcodeResults, "P1");
delete recognizer;
```

&nbsp;

## SetModeArgument

Set argument value for the specified mode parameter.


```cpp
int dynamsoft::dlr::CLabelRecognition::SetModeArgument (const char* modesName, const int index, const char* argumentName, const char* argumentValue, char errorMsgBuffer[] = NULL,  const int errorMsgBufferLen = 0)	
```   
**Parameters**
`[in]	modesName` The mode parameter name to set argument.  
`[in]	index` The array index of mode parameter to indicate a specific mode.  
`[in]	argumentName` The name of the argument to set.  
`[in]	argumentValue` The value of the argument to set.  
`[in,out]	errorMsgBuffer`<sub>Optional</sub> The buffer is allocated by the caller and the recommended length is 256. The error message will be copied to the buffer.  
`[in]	errorMsgBufferLen`<sub>Optional</sub> The length of the allocated buffer.  

**Return Value**
Returns error code (returns 0 if the function operates successfully).  
*You can call [`GetErrorString`](general.md#geterrorstring) to get detailed error message.*

#### Remark
Check follow link for available modes and arguments:
- [`RegionPredetectionModes`]({{ site.parameters-reference }}label-recognition-parameter/region-predetection-modes.html#regionpredetectionmodes)

**Code Snippet**
```cpp
CLabelRecognition* recognizer = new CLabelRecognition();
recognizer->InitLicense("t0260NwAAAHV***************");
DLRRuntimeSettings settings;
int errorCode = recognizer->GetRuntimeSettings(&settings);
settings.regionPredetectionModes[0] = DLR_RPM_GENERAL_RGB_CONTRAST;
char errorMessage[256];
recognizer->UpdateRuntimeSettings(&settings, errorMessage, 256);
recognizer->SetModeArgument("RegionPredetectionModes", 0, "AspectRatioRange", "100", errorMessage, 256);
delete recognizer;
```

&nbsp;


## GetModeArgument

Get argument value for the specified mode parameter.

```cpp
int dynamsoft::dlr::CLabelRecognition::GetModeArgument (const char* modesName, const int index, const char* argumentName, char valueBuffer[], const int valueBufferLen, char errorMsgBuffer[] = NULL, const int errorMsgBufferLen = 0)	
```   
   
**Parameters**  
`[in]	modesName` The mode parameter name to get argument.  
`[in]	index` The array index of mode parameter to indicate a specific mode.  
`[in]	argumentName` The name of the argument to get.  
`[in,out]	valueBuffer` The buffer is allocated by caller and the recommended length is 480. The argument value would be copied to the buffer.  
`[in]	valueBufferLen` The length of allocated buffer.  
`[in,out]	errorMsgBuffer`<sub>Optional</sub> The buffer is allocated by the caller and the recommended length is 256. The error message will be copied to the buffer.  
`[in]	errorMsgBufferLen`<sub>Optional</sub> The length of the allocated buffer.  

**Return Value**
Returns error code (returns 0 if the function operates successfully).  
*You can call [`GetErrorString`](general.md#geterrorstring) to get detailed error message.*

#### Remark
Check follow link for available modes and arguments:
- [`RegionPredetectionModes`]({{ site.parameters-reference }}label-recognition-parameter/region-predetection-modes.html#regionpredetectionmodes)

**Code Snippet**
```cpp
CLabelRecognition* recognizer = new CLabelRecognition();
recognizer->InitLicense("t0260NwAAAHV***************");
DLRRuntimeSettings settings;
int errorCode = recognizer->GetRuntimeSettings(&settings);
settings.regionPredetectionModes[0] = DLR_RPM_GENERAL_RGB_CONTRAST;
char errorMessage[256];
char argumentValue[480];
recognizer->UpdateRuntimeSettings(&settings, errorMessage, 256);
recognizer->SetModeArgument("RegionPredetectionModes", 0, "AspectRatioRange", "100", errorMessage, 256);
recognizer->GetModeArgument("RegionPredetectionModes", 0, "AspectRatioRange", argumentValue, 480, errorMessage, 256);
delete recognizer;
```

&nbsp;

