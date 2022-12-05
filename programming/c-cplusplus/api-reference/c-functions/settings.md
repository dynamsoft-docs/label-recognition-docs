---
layout: default-layout
title: Settings - Dynamsoft Label Recognition C API Reference
description: This is the settings functions of Dynamsoft Label Recognition for C API Reference.
keywords: api reference, c
needAutoGenerateSidebar: true
---

# C API Reference - Settings

| Method               | Description |
|----------------------|-------------|
  | [`DLR_GetRuntimeSettings`](#dlr_getruntimesettings) | Gets the current settings and saves it into a struct. |
  | [`DLR_UpdateRuntimeSettings`](#dlr_updateruntimesettings) | Updates runtime settings with a given struct. |
  | [`DLR_ResetRuntimeSettings`](#dlr_resetruntimesettings) | Resets the runtime settings. |
  | [`DLR_AppendSettingsFromString`](#dlr_appendsettingsfromstring) | Appends LabelRecognitionParameter settings in a string to the SDK object. |
  | [`DLR_AppendSettingsFromFile`](#dlr_appendsettingsfromfile) | Appends LabelRecognitionParameter settings in a file to the SDK object. |
  | [`DLR_OutputSettingsToFile`](#dlr_outputsettingstofile) | Outputs LabelRecognitionParameter settings into a file (JSON file). |
  | [`DLR_ClearAppendedSettings`](#dlr_clearappendedsettings) | Clears appended LabelRecognitionParameter settings. |
  | [`DLR_UpdateReferenceRegionFromBarcodeResults`](#dlr_updatereferenceregionfrombarcoderesults) | Updates reference region which is defined with source type DLR_LST_BARCODE. |
  | [`DLR_GetModeArgument`](#dlr_getmodeargument) | Get argument value for the specified mode parameter. |
  | [`DLR_SetModeArgument`](#dlr_setmodeargument) | Set argument value for the specified mode parameter. |

---


## DLR_GetRuntimeSettings
Get current settings and save them into a [`DLRRuntimeSettings`]({{ site.c-cplusplus-structs }}dlr-runtime-settings.html) struct.

```c
DLR_API int DLR_GetRuntimeSettings (void* recognizer, DLRRuntimeSettings* settings)
```   
   
**Parameters**
`[in] recognizer` Handle of the label recognition instance.  
`[in,out]	settings` The struct of runtime settings.  

**Return Value**
Returns error code (returns 0 if the function operates successfully).    
*You can call [`DLR_GetErrorString`](general.md#dlr_geterrorstring) to get detailed error message.*

**Code Snippet**
```c
void* recognizer = DLR_CreateInstance();
DLR_InitLicense(recognizer, "t0260NwAAAHV***************");
DLRRuntimeSettings settings;
int errorCode = DLR_GetRuntimeSettings(recognizer, &settings);
DLR_DestroyInstance(recognizer);
```

&nbsp;

## DLR_UpdateRuntimeSettings
Update runtime settings with a given [`DLRRuntimeSettings`]({{ site.c-cplusplus-structs }}dlr-runtime-settings.html) struct.

```c
DLR_API int DLR_UpdateRuntimeSettings (void* recognizer, DLRRuntimeSettings* settings, char errorMsgBuffer[], const int errorMsgBufferLen)
```   
   
**Parameters**
`[in] recognizer` Handle of the label recognition instance.  
`[in]	settings` The struct of runtime settings.  
`[in,out]	errorMsgBuffer` The buffer is allocated by caller and the recommended length is 256.The error message will be copied to the buffer.  
`[in]	errorMsgBufferLen` The length of the allocated buffer.  

**Return Value**
Returns error code (returns 0 if the function operates successfully).    
*You can call [`DLR_GetErrorString`](general.md#dlr_geterrorstring) to get detailed error message.*

**Code Snippet**
```c
void* recognizer = DLR_CreateInstance();
DLR_InitLicense(recognizer, "t0260NwAAAHV***************");
DLRRuntimeSettings settings;
int errorCode = DLR_GetRuntimeSettings(recognizer, &settings);
settings.linesCount = 1;
char errorMessage[256];
DLR_UpdateRuntimeSettings(recognizer, &settings, errorMessage, 256);
DLR_DestroyInstance(recognizer);
```

&nbsp;

## DLR_ResetRuntimeSettings
Reset all runtime settings to default values.

```c
DLR_API int DLR_ResetRuntimeSettings (void* recognizer)
```   
   
**Parameters**
`[in] recognizer` Handle of the label recognition instance.  

**Return Value**
Returns error code (returns 0 if the function operates successfully).    
*You can call [`DLR_GetErrorString`](general.md#dlr_geterrorstring) to get detailed error message.*

**Code Snippet**
```c
void* recognizer = DLR_CreateInstance();
DLR_InitLicense(recognizer, "t0260NwAAAHV***************");
DLRRuntimeSettings settings;
int errorCode = DLR_GetRuntimeSettings(recognizer, &settings);
settings.linesCount = 1;
DLR_UpdateRuntimeSettings(recognizer, &settings);
DLR_ResetRuntimeSettings(recognizer);
DLR_DestroyInstance(recognizer);
```


&nbsp;


## DLR_AppendSettingsFromString
Append a new template string to the current label recognition instance.

```c
DLR_API int DLR_AppendSettingsFromString (void* recognizer, const char* content, char errorMsgBuffer[], const int errorMsgBufferLen)
```   
   
**Parameters**
`[in] recognizer` Handle of the label recognition instance.  
`[in] content` A JSON string that represents the content of the settings.   
`[in,out] errorMsgBuffer` The buffer is allocated by caller and the recommending length is 256. The error message will be copied to the buffer.  
`[in] errorMsgBufferLen` The length of allocated buffer.


**Return Value**
Returns error code (returns 0 if the function operates successfully).    
*You can call [`DLR_GetErrorString`](general.md#dlr_geterrorstring) to get detailed error message.*

**Code Snippet**
```c
void* recognizer = DLR_CreateInstance();
DLR_InitLicense(recognizer, "t0260NwAAAHV***************");
char errorMessage[256];
DLR_AppendSettingsFromString(recognizer, "{\"LabelRecognitionParameter\":{\"Name\":\"P1\", \"RegionPredetectionModes\":[{\"Mode\":\"DLR_RPM_GENERAL_HSV_CONTRAST\"}], \"ReferenceRegionNameArray\": [\"R1\"]},\"ReferenceRegion\":{\"Name\":\"R1\",\"Localization\":{\"SourceType\":\"DLR_LST_PREDETECTED_REGION\",\"RegionPredetectionModesIndex\":0},\"TextAreaNameArray\":[\"T1\"]},\"TextArea\":{\"Name\":\"T1\",\"CharacterModelName\":\"Number\"}}", errorMessage, 256);
DLR_DestroyInstance(recognizer);
```

&nbsp;


## DLR_AppendSettingsFromFile
Appends LabelRecognitionParameter settings in a file to the SDK object.

```c
DLR_API int DLR_AppendSettingsFromFile (void* recognizer, const char* filePath, char errorMsgBuffer[], const int errorMsgBufferLen)
```   
   
**Parameters**
`[in] recognizer` Handle of the label recognition instance.  
`[in] filePath` The settings file path.   
`[in,out] errorMsgBuffer` The buffer is allocated by caller and the recommending length is 256. The error message will be copied to the buffer.  
`[in] errorMsgBufferLen` The length of allocated buffer.


**Return Value**
Returns error code (returns 0 if the function operates successfully).    
*You can call [`DLR_GetErrorString`](general.md#dlr_geterrorstring) to get detailed error message.*

**Code Snippet**
```c
void* recognizer = DLR_CreateInstance();
DLR_InitLicense(recognizer, "t0260NwAAAHV***************");
char errorMessage[256];
DLR_AppendSettingsFromFile(recognizer, "your file path", errorMessage, 256);
DLR_DestroyInstance(recognizer);
```

&nbsp;


## DLR_OutputSettingsToFile
Outputs runtime settings and save them into a settings file (JSON file).  

```c
DLR_API int DLR_OutputSettingsToFile (void* recognizer, const char* filePath, const char* templateName)
```   
   
**Parameters**
`[in] recognizer` Handle of the label recognition instance.  
`[in]	filePath` The path of the output file which stores current settings.  
`[in]	templateName` A unique name for declaring current runtime settings.  


**Return Value**
Returns error code (returns 0 if the function operates successfully).    
*You can call [`DLR_GetErrorString`](general.md#dlr_geterrorstring) to get detailed error message.*

**Code Snippet**
```c
void* recognizer = DLR_CreateInstance();
DLR_InitLicense(recognizer, "t0260NwAAAHV***************");
char errorMessageAppend[256];
DLR_AppendSettingsFromString(recognizer, "{\"LabelRecognitionParameter\":{\"Name\":\"P1\", \"RegionPredetectionModes\":[{\"Mode\":\"DLR_RPM_GENERAL_HSV_CONTRAST\"}], \"ReferenceRegionNameArray\": [\"R1\"]},\"ReferenceRegion\":{\"Name\":\"R1\",\"Localization\":{\"SourceType\":\"DLR_LST_PREDETECTED_REGION\",\"RegionPredetectionModesIndex\":0},\"TextAreaNameArray\":[\"T1\"]},\"TextArea\":{\"Name\":\"T1\",\"CharacterModelName\":\"Number\"}}", errorMessageAppend, 256);
DLR_OutputSettingsToFile(recognizer, "C:\\Program Files (x86)\\Dynamsoft\\{Version number}\\Templates\\CurrentRuntimeSettings.json", "currentRuntimeSettings");
DLR_DestroyInstance(recognizer);
```

&nbsp;


## DLR_ClearAppendedSettings
Clear all appended parameter settings of the current label recognition instance.

```c
DLR_API void DLR_ClearAppendedSettings (void* recognizer)	
```   
   
**Parameters**
`[in]	recognizer` Handle of the Dynamsoft Label Recognition instance.

**Code Snippet**
```c
void* recognizer = DLR_CreateInstance();
DLR_InitLicense(recognizer, "t0260NwAAAHV***************");
DLR_ClearAppendedSettings(recognizer);
```

## DLR_UpdateReferenceRegionFromBarcodeResults
Updates reference region which is defined with source type DLR_LST_BARCODE.  

```c
DLR_API int DLR_UpdateReferenceRegionFromBarcodeResults (void* recognizer, const TextResultArray* barcodeResults, const char* templateName)
```   
   
**Parameters**
`[in]	recognizer` Handle of the Dynamsoft Label Recognition instance.  
`[in]	barcodeResults` The barcode results used to localize reference region.  
`[in]	templateName` The template name. A template name is the value of key LabelRecognitionParameter.Name defined in JSON formatted settings. If no template name is specified, current runtime settings will be used.


**Return Value**
Returns error code (returns 0 if the function operates successfully).    
*You can call [`GetErrorString`](general.md#geterrorstring) to get detailed error message.*

**Code Snippet**
```c
void* recognizer = DLR_CreateInstance();
DLR_InitLicense(recognizer, "t0260NwAAAHV***************");
char errorMessageAppend[256];
DLR_AppendSettingsFromString(recognizer, "{\"LabelRecognitionParameter\":{\"Name\":\"P1\", \"RegionPredetectionModes\":[{\"Mode\":\"DLR_RPM_GENERAL_HSV_CONTRAST\"}], \"ReferenceRegionNameArray\": [\"R1\"]},\"ReferenceRegion\":{\"Name\":\"R1\",\"Localization\":{\"SourceType\":\"DLR_LST_BARCODE\"},\"TextAreaNameArray\":[\"T1\"]},\"TextArea\":{\"Name\":\"T1\",\"CharacterModelName\":\"Number\"}}", errorMessageAppend, 256);
//Get barcodeResults from Dynamsoft Barcode Reader SDK
DLR_UpdateReferenceRegionFromBarcodeResults(recognizer, barcodeResults, "P1");
DLR_DestroyInstance(recognizer);
```

&nbsp;

## DLR_SetModeArgument

Set argument value for the specified mode parameter.


```c
DLR_API int DLR_SetModeArgument (void* recognizer, const char* modesName, const int index, const char* argumentName, const char* argumentValue, char errorMsgBuffer[],  const int errorMsgBufferLen)	
```   
**Parameters**
`[in] recognizer` Handle of the label recognition instance.  
`[in]	modesName` The mode parameter name to set argument.  
`[in]	index` The array index of mode parameter to indicate a specific mode.  
`[in]	argumentName` The name of the argument to set.  
`[in]	argumentValue` The value of the argument to set.  
`[in,out]	errorMsgBuffer` The buffer is allocated by the caller and the recommended length is 256. The error message will be copied to the buffer.  
`[in]	errorMsgBufferLen` The length of the allocated buffer.  

**Return Value**
Returns error code (returns 0 if the function operates successfully).  
*You can call [`DLR_GetErrorString`](general.md#dlr_geterrorstring) to get detailed error message.*

#### Remark
Check follow link for available modes and arguments:
- [`RegionPredetectionModes`]({{ site.parameters-reference }}label-recognition-parameter/region-predetection-modes.html#regionpredetectionmodes)

**Code Snippet**
```c
void* recognizer = DLR_CreateInstance();
DLR_InitLicense(recognizer, "t0260NwAAAHV***************");
DLRRuntimeSettings settings;
int errorCode = DLR_GetRuntimeSettings(recognizer, &settings);
settings.regionPredetectionModes[0] = DLR_RPM_GENERAL_RGB_CONTRAST;
char errorMessage[256];
DLR_UpdateRuntimeSettings(recognizer, &settings, errorMessage, 256);
DLR_SetModeArgument(recognizer, "RegionPredetectionModes", 0, "AspectRatioRange", "100", errorMessage, 256);
DLR_DestroyInstance(recognizer);
```

&nbsp;


## DLR_GetModeArgument

Get argument value for the specified mode parameter.

```c
DLR_API int DLR_GetModeArgument (void* recognizer, const char* modesName, const int index, const char* argumentName, char valueBuffer[], const int valueBufferLen, char errorMsgBuffer[], const int errorMsgBufferLen)	
```   
   
**Parameters**  
`[in] recognizer` Handle of the label recognition instance.  
`[in]	modesName` The mode parameter name to get argument.  
`[in]	index` The array index of mode parameter to indicate a specific mode.  
`[in]	argumentName` The name of the argument to get.  
`[in,out]	valueBuffer` The buffer is allocated by caller and the recommended length is 480. The argument value would be copied to the buffer.  
`[in]	valueBufferLen` The length of allocated buffer.  
`[in,out]	errorMsgBuffer` The buffer is allocated by the caller and the recommended length is 256. The error message will be copied to the buffer.  
`[in]	errorMsgBufferLen` The length of the allocated buffer.  

**Return Value**
Returns error code (returns 0 if the function operates successfully).  
*You can call [`DLR_GetErrorString`](general.md#dlr_geterrorstring) to get detailed error message.*

#### Remark
Check follow link for available modes and arguments:
- [`RegionPredetectionModes`]({{ site.parameters-reference }}label-recognition-parameter/region-predetection-modes.html#regionpredetectionmodes)

**Code Snippet**
```c
void* recognizer = DLR_CreateInstance();
DLR_InitLicense(recognizer, "t0260NwAAAHV***************");
DLRRuntimeSettings settings;
int errorCode = DLR_GetRuntimeSettings(recognizer, &settings);
settings.regionPredetectionModes[0] = DLR_RPM_GENERAL_RGB_CONTRAST;
char errorMessage[256];
DLR_UpdateRuntimeSettings(recognizer, &settings, errorMessage, 256);
DLR_SetModeArgument(recognizer, "RegionPredetectionModes", 0, "AspectRatioRange", "100", errorMessage, 256);
DLR_GetModeArgument(recognizer, "RegionPredetectionModes", 0, "AspectRatioRange", argumentValue, 480, errorMessage, 256);
DLR_DestroyInstance(recognizer);
```

&nbsp;

