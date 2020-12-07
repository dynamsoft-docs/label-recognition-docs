---
layout: default-layout
title: Dynamsoft Label Recognition C++ API Reference - Settings
description: This is the settings functions of Dynamsoft Label Recognition for C++ API Reference.
keywords: api reference, cpp
needAutoGenerateSidebar: false
---

# C+ API Reference - Settings

| Method               | Description |
|----------------------|-------------|
  | [`GetRuntimeSettings`](#getruntimesettings) | Gets the current settings and saves it into a struct. |
  | [`UpdateRuntimeSettings`](#updateruntimesettings) | Updates runtime settings with a given struct. |
  | [`ResetRuntimeSettings`](#resetruntimesettings) | Resets the runtime settings. |
  | [`GetModeArgument`](#getmodeargument) | Gets the optional argument for a specified mode in Modes parameters. |
  | [`SetModeArgument`](#setmodeargument) | Sets the optional argument for a specified mode in Modes parameters. |
  | [`AppendSettingsFromString`](#appendsettingsfromstring) | Appends LabelRecognitionParameter settings in a string to the SDK object. |
  | [`OutputSettingsToFile`](#outputsettingstofile) | Outputs LabelRecognitionParameter settings into a file (JSON file). |
  | [`ClearAppendedSettings`](#appendsettingsfromstring) | Clears appended LabelRecognitionParameter settings. |

---


## GetRuntimeSettings
Get current settings and save them into a [`DLRRuntimeSettings`]({{ site.c-cplusplus-structs }}dlr-runtime-settings.html) struct.

```cpp
int dynamsoft::dlr::CLabelRecognition::GetRuntimeSettings (DLRRuntimeSettings* settings)
```   
   
#### Parameters
`[in,out]	settings` The struct of template settings.  

#### Return value
Returns error code (returns 0 if the function operates successfully).    
*You can call [`GetErrorString`](general.md#geterrorstring) to get detailed error message.*

#### Code Snippet
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
int dynamsoft::dlr::CLabelRecognition::UpdateRuntimeSettings (DLRRuntimeSettings* settings, char errorMsgBuffer[], const int errorMsgBufferLen)
```   
   
#### Parameters
`[in]	settings` The struct of template settings.  
`[in,out]	errorMsgBuffer` The buffer is allocated by caller and the recommended length is 256.The error message will be copied to the buffer.  
`[in]	errorMsgBufferLen` The length of the allocated buffer.  

#### Return value
Returns error code (returns 0 if the function operates successfully).    
*You can call [`GetErrorString`](general.md#geterrorstring) to get detailed error message.*

#### Code Snippet
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
   
#### Return value
Returns error code (returns 0 if the function operates successfully).    
*You can call [`GetErrorString`](general.md#geterrorstring) to get detailed error message.*

#### Code Snippet
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


## GetModeArgument
Get argument value for the specified mode parameter.

```cpp
int dynamsoft::dlr::CLabelRecognition::GetModeArgument (const char* modesName, const int index, const char* argumentName, char valueBuffer[], const int valueBufferLen, char errorMsgBuffer[], const int errorMsgBufferLen)
```   
   
#### Parameters
`[in]	modesName` The mode parameter name to get argument.  
`[in]	index` The array index of mode parameter to indicate a specific mode.  
`[in]	argumentName` The name of the argument to get.  
`[in,out]	valueBuffer` The buffer is allocated by caller and the recommended length is 480. The argument value would be copied to the buffer.  
`[in]	valueBufferLen` The length of allocated buffer.  
`[in,out]	errorMsgBuffer` The buffer is allocated by the caller and the recommended length is 256. The error message will be copied to the buffer.  
`[in]	errorMsgBufferLen` The length of the allocated buffer.  

#### Return value
Returns error code. Possible return(s): DLR_OK; DLRERR_GET_MODE_ARGUMENT_ERROR.  
*You can call [`GetErrorString`](general.md#geterrorstring) to get detailed error message.*

#### Remark
Check follow link for available modes and arguments:
- [`BinarizationModes`]({{ site.parameters-reference }}label-recognition-parameter/binarization-modes.html#mode-arguments)
- [`RegionPredetectionModes`]({{ site.parameters-reference }}label-recognition-parameter/region-predetection-modes.html#mode-arguments)
- [`GrayscaleTransformationModes`]({{ site.parameters-reference }}label-recognition-parameter/grayscale-transformation-modes.html#mode-arguments)  

#### Code Snippet
```cpp
CLabelRecognition* recognizer = new CLabelRecognition();
recognizer->InitLicense("t0260NwAAAHV***************");
DLRRuntimeSettings settings;
recognizer->GetRuntimeSettings(&settings);
settings.binarizationModes[0] = BM_LOCAL_BLOCK;
char errorMessage[256];
char argumentValue[480];
recognizer->UpdateRuntimeSettings(&settings, errorMessage, 256);
recognizer->SetModeArgument("BinarizationModes", 0, "EnableFillBinaryVacancy", "1", errorMessage, 256);
recognizer->GetModeArgument("BinarizationModes", 0, "EnableFillBinaryVacancy", argumentValue, 480, errorMessage, 256);
delete recognizer;
```

&nbsp;

## SetModeArgument
Set argument value for the specified mode parameter.


```cpp
int dynamsoft::dlr::CLabelRecognition::SetModeArgument (const char* modesName, const int index, const char* argumentName, const char* argumentValue, char errorMsgBuffer[], const int errorMsgBufferLen)
```   
   
#### Parameters
`[in]	modesName` The mode parameter name to set argument.  
`[in]	index` The array index of mode parameter to indicate a specific mode.  
`[in]	argumentName` The name of the argument to set.  
`[in]	argumentValue` The value of the argument to set.  
`[in,out]` errorMsgBuffer	The buffer is allocated by the caller and the recommended length is 256. The error message will be copied to the buffer.  
`[in] errorMsgBufferLen` The length of the allocated buffer.

#### Return value
Returns error code. Possible return(s): DLR_OK; DLRERR_SET_MODE_ARGUMENT_ERROR.   
*You can call [`GetErrorString`](general.md#geterrorstring) to get detailed error message.*
  
#### Remark
Check follow link for available modes and arguments:
- [`BinarizationModes`]({{ site.parameters-reference }}label-recognition-parameter/binarization-modes.html#mode-arguments)
- [`RegionPredetectionModes`]({{ site.parameters-reference }}label-recognition-parameter/region-predetection-modes.html#mode-arguments)
- [`GrayscaleTransformationModes`]({{ site.parameters-reference }}label-recognition-parameter/grayscale-transformation-modes.html#mode-arguments)  

#### Code Snippet
```cpp
CLabelRecognition* recognizer = new CLabelRecognition();
recognizer->InitLicense("t0260NwAAAHV***************");
DLRRuntimeSettings settings;
recognizer->GetRuntimeSettings(&settings);
settings.binarizationModes[0] = BM_LOCAL_BLOCK;
char errorMessage[256];
recognizer->UpdateRuntimeSettings(&settings, errorMessage, 256);
recognizer->SetModeArgument("BinarizationModes", 0, "EnableFillBinaryVacancy", "1", errorMessage, 256);
delete recognizer;
```

&nbsp;


## AppendSettingsFromString
Append a new template string to the current label recognition instance.

```cpp
int dynamsoft::dlr::CLabelRecognition::AppendSettingsFromString (const char* content, char errorMsgBuffer[], const int errorMsgBufferLen)
```   
   
#### Parameters
`[in] content` A JSON string that represents the content of the settings.   
`[in,out] errorMsgBuffer` The buffer is allocated by caller and the recommending length is 256. The error message will be copied to the buffer.  
`[in] errorMsgBufferLen` The length of allocated buffer.


#### Return value
Returns error code (returns 0 if the function operates successfully).    
*You can call [`GetErrorString`](general.md#geterrorstring) to get detailed error message.*

#### Code Snippet
```cpp
CLabelRecognition* recognizer = new CLabelRecognition();
recognizer->InitLicense("t0260NwAAAHV***************");
char errorMessage[256];
recognizer->AppendSettingsFromString("{\"LabelRecognitionParameter\":{\"Name\":\"P1\", \"RegionPredetectionModes\":[{\"Mode\":\"DLR_RPM_GENERAL_HSV_CONTRAST\",\"RelativeTextAreaNames\":\"T1\"}]},\"TextArea\":{\"Name\":\"T1\",\"CharacterModelName\":\"Number\"}}", errorMessage, 256);
delete recognizer;
```

&nbsp;


## OutputSettingsToFile
Outputs runtime settings and save them into a settings file (JSON file).  

```cpp
int dynamsoft::dlr::CLabelRecognition::OutputSettingsToFile (const char* filePath, const char* templateName)
```   
   
#### Parameters
`[in]	filePath` The path of the output file which stores current settings.  
`[in]	templateName` A unique name for declaring current runtime settings.  


#### Return value
Returns error code (returns 0 if the function operates successfully).    
*You can call [`GetErrorString`](general.md#geterrorstring) to get detailed error message.*

#### Code Snippet
```cpp
CLabelRecognition* recognizer = new CLabelRecognition();
recognizer->InitLicense("t0260NwAAAHV***************");
char errorMessageAppend[256];
recognizer->AppendSettingsFromString("{\"LabelRecognitionParameter\":{\"Name\":\"P1\", \"RegionPredetectionModes\":[{\"Mode\":\"DLR_RPM_GENERAL_HSV_CONTRAST\",\"RelativeTextAreaNames\":\"T1\"}]},\"TextArea\":{\"Name\":\"T1\",\"CharacterModelName\":\"Number\"}}", CM_IGNORE, errorMessageAppend, 256);
recognizer->OutputSettingsToFile("C:\\Program Files (x86)\\Dynamsoft\\{Version number}\\Templates\\CurrentRuntimeSettings.json", "currentRuntimeSettings");
delete recognizer;
```

&nbsp;


## ClearAppendedSettings
Clear all appended parameter settings of the current label recognition instance.

```cpp
void dynamsoft::dlr::CLabelRecognition::ClearAppendedSettings ()	
```   
   
#### Code Snippet
```cpp
CLabelRecognition* recognizer = new CLabelRecognition();
recognizer->InitLicense("t0260NwAAAHV***************");
recognizer->ClearAppendedSettings(labelRecognizer);
```
