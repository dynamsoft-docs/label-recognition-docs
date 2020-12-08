---
layout: default-layout
title: Dynamsoft Label Recognition C API Reference - Settings
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
  | [`DLR_OutputSettingsToFile`](#dlr_outputsettingstofile) | Outputs LabelRecognitionParameter settings into a file (JSON file). |
  | [`DLR_ClearAppendedSettings`](#dlr_appendsettingsfromstring) | Clears appended LabelRecognitionParameter settings. |

---


## DLR_GetRuntimeSettings
Get current settings and save them into a [`DLRRuntimeSettings`]({{ site.c-cplusplus-structs }}dlr-runtime-settings.html) struct.

```c
DLR_API int DLR_GetRuntimeSettings (void* recognizer, DLRRuntimeSettings* settings)
```   
   
#### Parameters
`[in] recognizer` Handle of the label recognition instance.  
`[in,out]	settings` The struct of template settings.  

#### Return value
Returns error code (returns 0 if the function operates successfully).    
*You can call [`DLR_GetErrorString`](general.md#dlr_geterrorstring) to get detailed error message.*

#### Code Snippet
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
   
#### Parameters
`[in] recognizer` Handle of the label recognition instance.  
`[in]	settings` The struct of template settings.  
`[in,out]	errorMsgBuffer` The buffer is allocated by caller and the recommended length is 256.The error message will be copied to the buffer.  
`[in]	errorMsgBufferLen` The length of the allocated buffer.  

#### Return value
Returns error code (returns 0 if the function operates successfully).    
*You can call [`DLR_GetErrorString`](general.md#dlr_geterrorstring) to get detailed error message.*

#### Code Snippet
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
   
#### Parameters
`[in] recognizer` Handle of the label recognition instance.  

#### Return value
Returns error code (returns 0 if the function operates successfully).    
*You can call [`DLR_GetErrorString`](general.md#dlr_geterrorstring) to get detailed error message.*

#### Code Snippet
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
   
#### Parameters
`[in] recognizer` Handle of the label recognition instance.  
`[in] content` A JSON string that represents the content of the settings.   
`[in,out] errorMsgBuffer` The buffer is allocated by caller and the recommending length is 256. The error message will be copied to the buffer.  
`[in] errorMsgBufferLen` The length of allocated buffer.


#### Return value
Returns error code (returns 0 if the function operates successfully).    
*You can call [`DLR_GetErrorString`](general.md#dlr_geterrorstring) to get detailed error message.*

#### Code Snippet
```c
void* recognizer = DLR_CreateInstance();
DLR_InitLicense(recognizer, "t0260NwAAAHV***************");
char errorMessage[256];
DLR_AppendSettingsFromString(recognizer, "{\"LabelRecognitionParameter\":{\"Name\":\"P1\", \"RegionPredetectionModes\":[{\"Mode\":\"DLR_RPM_GENERAL_HSV_CONTRAST\",\"RelativeTextAreaNames\":\"T1\"}]},\"TextArea\":{\"Name\":\"T1\",\"CharacterModelName\":\"Number\"}}", errorMessage, 256);
DLR_DestroyInstance(recognizer);
```

&nbsp;


## DLR_OutputSettingsToFile
Outputs runtime settings and save them into a settings file (JSON file).  

```c
DLR_API int DLR_OutputSettingsToFile (void* recognizer, const char* filePath, const char* templateName)
```   
   
#### Parameters
`[in] recognizer` Handle of the label recognition instance.  
`[in]	filePath` The path of the output file which stores current settings.  
`[in]	templateName` A unique name for declaring current runtime settings.  


#### Return value
Returns error code (returns 0 if the function operates successfully).    
*You can call [`DLR_GetErrorString`](general.md#dlr_geterrorstring) to get detailed error message.*

#### Code Snippet
```c
void* recognizer = DLR_CreateInstance();
DLR_InitLicense(recognizer, "t0260NwAAAHV***************");
char errorMessageAppend[256];
DLR_AppendSettingsFromString(recognizer, "{\"LabelRecognitionParameter\":{\"Name\":\"P1\", \"RegionPredetectionModes\":[{\"Mode\":\"DLR_RPM_GENERAL_HSV_CONTRAST\",\"RelativeTextAreaNames\":\"T1\"}]},\"TextArea\":{\"Name\":\"T1\",\"CharacterModelName\":\"Number\"}}", errorMessageAppend, 256);
DLR_OutputSettingsToFile(recognizer, "C:\\Program Files (x86)\\Dynamsoft\\{Version number}\\Templates\\CurrentRuntimeSettings.json", "currentRuntimeSettings");
DLR_DestroyInstance(recognizer);
```

&nbsp;


## DLR_ClearAppendedSettings
Clear all appended parameter settings of the current label recognition instance.

```c
DLR_API void DLR_ClearAppendedSettings (void* recognizer)	
```   
   
#### Parameters
`[in]	recognizer` Handle of the Dynamsoft Label Recognition instance.

#### Code Snippet
```c
void* recognizer = DLR_CreateInstance();
DLR_InitLicense(recognizer, "t0260NwAAAHV***************");
DLR_ClearAppendedSettings(labelRecognizer);
```
