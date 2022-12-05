---
layout: default-layout
title: C Functions - Dynamsoft Label Recognizer C API Reference
description: This page shows all methods of Dynamsoft Label Recognizer for C API Reference.
keywords: api reference, c
needAutoGenerateSidebar: true
needGenerateH3Content: true
noTitleIndex: true
---


# C Functions
  

## Initialization
  
  | Method               | Description |
  |----------------------|-------------|
  | [`DLR_CreateInstance`](#dlr_createinstance) | Creates a Dynamsoft Label Recognizer instance. |
  | [`DLR_DestroyInstance`](#dlr_destroyinstance) | Destroys an instance of Dynamsoft Label Recognizer. |
  | [`DLR_InitLicense`](#dlr_initlicense) | Sets the license and activates the SDK. |



&nbsp;

### DLR_CreateInstance
Create an instance of Dynamsoft Label Recognizer.


```c
void* DLR_CreateInstance ()	
```   

**Return value**

Returns an instance of Dynamsoft Label Recognizer. If failed, returns NULL.



**Code Snippet**

```c
void* recognizer = DLR_CreateInstance();
DLR_DestroyInstance(recognizer);
```



&nbsp;

### DLR_DestroyInstance
Destroy the instance of Dynamsoft Label Recognizer.

```c
void DLR_DestroyInstance (void* recognizer)	
```   
   
**Parameters**

`[in]	recognizer` Handle of the Dynamsoft Label Recognizer instance.

**Code Snippet**

```c
void* recognizer = DLR_CreateInstance();
DLR_DestroyInstance(recognizer);
```

&nbsp;

### DLR_InitLicense
Sets product key and activate the SDK.

```c
int DLR_InitLicense (const char* pLicense, char errorMsgBuffer[], const int errorMsgBufferLen)
```   
   
**Parameters**

`[in]	pLicense` The product keys.
`[in, out] errorMsgBuffer` The buffer is allocated by caller and the recommending length is 256. The error message will be copied to the buffer.  
`[in]	errorMsgBufferLen` The length of allocated buffer. 

**Return value**

Returns error code (returns 0 if the function operates successfully).    
*You can call [`DLR_GetErrorString`](#dlr_geterrorstring) to get detailed error message.*

**Code Snippet**

```c
char errorMessage[256];
DLR_InitLicense("t0260NwAAAHV***************", errorMessage, 256);

void* recognizer = DLR_CreateInstance();
DLR_DestroyInstance(recognizer);
```


## Setting

  | Method               | Description |
  |----------------------|-------------|
  | [`DLR_GetRuntimeSettings`](#dlr_getruntimesettings) | Gets the current settings and saves it into a struct. |
  | [`DLR_UpdateRuntimeSettings`](#dlr_updateruntimesettings) | Updates runtime settings with a given struct. |
  | [`DLR_UpdateRuntimeSettingsFromString`](#dlr_updateruntimesettingsfromstring) | Updates runtime settings with the settings in a given JSON string. |
  | [`DLR_ResetRuntimeSettings`](#dlr_resetruntimesettings) | Resets the runtime settings. |
  | [`DLR_AppendSettingsFromString`](#dlr_appendsettingsfromstring) | Appends LabelRecognizerParameter settings in a string to the SDK object. |
  | [`DLR_AppendSettingsFromFile`](#dlr_appendsettingsfromfile) | Appends LabelRecognizerParameter settings in a file to the SDK object. |
  | [`DLR_OutputSettingsToFile`](#dlr_outputsettingstofile) | Outputs LabelRecognizerParameter settings into a file (JSON file). |
  | [`DLR_OutputSettingsToString`](#dlr_outputsettingstostring) | Output runtime settings to a string. |
  | [`DLR_ClearAppendedSettings`](#dlr_appendsettingsfromstring) | Clears appended LabelRecognizerParameter settings. |
  | [`DLR_UpdateReferenceRegionFromBarcodeResults`](#dlr_updatereferenceregionfrombarcoderesults) | Updates reference region which is defined with source type LST_BARCODE. |
  | [`DLR_GetModeArgument`](#dlr_getmodeargument) | Get argument value for the specified mode parameter. |
  | [`DLR_SetModeArgument`](#dlr_setmodeargument) | Set argument value for the specified mode parameter. |



&nbsp;

### DLR_GetRuntimeSettings
Get current settings and save them into a [`DLR_RuntimeSettings`](dlr-runtime-settings.md) struct.

```c
int DLR_GetRuntimeSettings (void* recognizer, DLR_RuntimeSettings* settings)
```   
   
**Parameters**

`[in] recognizer` Handle of the label recognition instance.  
`[in,out]	settings` The struct of runtime settings.  

**Return value**

Returns error code (returns 0 if the function operates successfully).    
*You can call [`DLR_GetErrorString`](#dlr_geterrorstring) to get detailed error message.*

**Code Snippet**

```c
char errorMessage[256];
DLR_InitLicense("t0260NwAAAHV***************", errorMessage, 256);

void* recognizer = DLR_CreateInstance();
DLR_RuntimeSettings settings;
int errorCode = DLR_GetRuntimeSettings(recognizer, &settings);
DLR_DestroyInstance(recognizer);
```



&nbsp;

### DLR_UpdateRuntimeSettings
Update runtime settings with a given [`DLR_RuntimeSettings`](dlr-runtime-settings.md) struct.

```c
int DLR_UpdateRuntimeSettings (void* recognizer, DLR_RuntimeSettings* settings, char errorMsgBuffer[], const int errorMsgBufferLen)
```   
   
**Parameters**

`[in] recognizer` Handle of the label recognition instance.  
`[in]	settings` The struct of runtime settings.  
`[in,out]	errorMsgBuffer` The buffer is allocated by caller and the recommended length is 256.The error message will be copied to the buffer.  
`[in]	errorMsgBufferLen` The length of the allocated buffer.  

**Return value**

Returns error code (returns 0 if the function operates successfully).    
*You can call [`DLR_GetErrorString`](#dlr_geterrorstring) to get detailed error message.*

**Code Snippet**

```c
char errorMessage[256];
DLR_InitLicense("t0260NwAAAHV***************", errorMessage, 256);

void* recognizer = DLR_CreateInstance();
DLR_RuntimeSettings settings;
int errorCode = DLR_GetRuntimeSettings(recognizer, &settings);
settings.maxThreadCount = 4;
DLR_UpdateRuntimeSettings(recognizer, &settings, errorMessage, 256);
DLR_DestroyInstance(recognizer);
```

&nbsp;

### DLR_UpdateRuntimeSettingsFromString
Updates runtime settings with the parameters obtained from a JSON string.

```c
int DLR_UpdateRuntimeSettingsFromString (void* recognizer, const char* content, char errorMsgBuffer[], const int errorMsgBufferLen)
```   
   
**Parameters** 
`[in] recognizer` Handle of the label recognition instance.  
`[in]	content` A JSON string that represents the content of the settings.  
`[in,out] errorMsgBuffer` The buffer is allocated by caller and the recommending length is 256. The error message will be copied to the buffer.  
`[in]	errorMsgBufferLen` The length of allocated buffer.


**Return Value**  
Returns error code (returns 0 if the function operates successfully).    
*You can call [`DLR_GetErrorString`](#dlr_geterrorstring) to get detailed error message.*

**Code Snippet**  
```c
char errorMessage[256];
DLR_InitLicense("t0260NwAAAHV***************", errorMessage, 256);

void* recognizer = DLR_CreateInstance();

const char* strJson = "{\"LabelRecognizerParameter\":{\"Name\":\"P1\", \"RegionPredetectionModes\":[{\"Mode\":\"RPM_GENERAL_HSV_CONTRAST\"}], \"ReferenceRegionNameArray\": [\"R1\"]},\"ReferenceRegion\":{\"Name\":\"R1\",\"Localization\":{\"SourceType\":\"LST_PREDETECTED_REGION\",\"RegionPredetectionModesIndex\":0},\"TextAreaNameArray\":[\"T1\"]},\"TextArea\":{\"Name\":\"T1\",\"CharacterModelName\":\"Number\"}}";

DLR_UpdateRuntimeSettingsFromString(recognizer, strJson, errorMessage, 256);
DLR_DestroyInstance(recognizer);
```

&nbsp;

### DLR_ResetRuntimeSettings
Reset all runtime settings to default values.

```c
int DLR_ResetRuntimeSettings (void* recognizer)
```   
   
**Parameters**

`[in] recognizer` Handle of the label recognition instance.  

**Return value**

Returns error code (returns 0 if the function operates successfully).    
*You can call [`DLR_GetErrorString`](#dlr_geterrorstring) to get detailed error message.*

**Code Snippet**

```c
char errorMessage[256];
DLR_InitLicense("t0260NwAAAHV***************", errorMessage, 256);

void* recognizer = DLR_CreateInstance();
DLR_RuntimeSettings settings;
int errorCode = DLR_GetRuntimeSettings(recognizer, &settings);
settings.maxThreadCount = 4;
DLR_UpdateRuntimeSettings(recognizer, &settings);
DLR_ResetRuntimeSettings(recognizer);
DLR_DestroyInstance(recognizer);
```





&nbsp;

### DLR_AppendSettingsFromString
Append a new template string to the current label recognition instance.

```c
int DLR_AppendSettingsFromString (void* recognizer, const char* content, char errorMsgBuffer[], const int errorMsgBufferLen)
```   
   
**Parameters**

`[in] recognizer` Handle of the label recognition instance.  
`[in] content` A JSON string that represents the content of the settings.   
`[in,out] errorMsgBuffer` The buffer is allocated by caller and the recommending length is 256. The error message will be copied to the buffer.  
`[in] errorMsgBufferLen` The length of allocated buffer.


**Return value**

Returns error code (returns 0 if the function operates successfully).    
*You can call [`DLR_GetErrorString`](#dlr_geterrorstring) to get detailed error message.*

**Code Snippet**

```c
char errorMessage[256];
DLR_InitLicense("t0260NwAAAHV***************", errorMessage, 256);

void* recognizer = DLR_CreateInstance();
DLR_AppendSettingsFromString(recognizer, "{\"LabelRecognizerParameter\":{\"Name\":\"P1\", \"RegionPredetectionModes\":[{\"Mode\":\"RPM_GENERAL_HSV_CONTRAST\"}], \"ReferenceRegionNameArray\": [\"R1\"]},\"ReferenceRegion\":{\"Name\":\"R1\",\"Localization\":{\"SourceType\":\"LST_PREDETECTED_REGION\",\"RegionPredetectionModesIndex\":0},\"TextAreaNameArray\":[\"T1\"]},\"TextArea\":{\"Name\":\"T1\",\"CharacterModelName\":\"Number\"}}", errorMessage, 256);
DLR_DestroyInstance(recognizer);
```




&nbsp;

### DLR_AppendSettingsFromFile
Appends LabelRecognizerParameter settings in a file to the SDK object.

```c
int DLR_AppendSettingsFromFile (void* recognizer, const char* filePath, char errorMsgBuffer[], const int errorMsgBufferLen)
```   
   
**Parameters**

`[in] recognizer` Handle of the label recognition instance.  
`[in] filePath` The settings file path.   
`[in,out] errorMsgBuffer` The buffer is allocated by caller and the recommending length is 256. The error message will be copied to the buffer.  
`[in] errorMsgBufferLen` The length of allocated buffer.


**Return value**

Returns error code (returns 0 if the function operates successfully).    
*You can call [`DLR_GetErrorString`](#dlr_geterrorstring) to get detailed error message.*

**Code Snippet**

```c
char errorMessage[256];
DLR_InitLicense("t0260NwAAAHV***************", errorMessage, 256);

void* recognizer = DLR_CreateInstance();
DLR_AppendSettingsFromFile(recognizer, "your file path", errorMessage, 256);
DLR_DestroyInstance(recognizer);
```




&nbsp;

### DLR_OutputSettingsToFile
Outputs runtime settings and save them into a settings file (JSON file).  

```c
int DLR_OutputSettingsToFile (void* recognizer, const char* filePath, const char* templateName)
```   
   
**Parameters**

`[in] recognizer` Handle of the label recognition instance.  
`[in]	filePath` The path of the output file which stores current settings.  
`[in]	templateName` A unique name for declaring current runtime settings.  


**Return value**

Returns error code (returns 0 if the function operates successfully).    
*You can call [`DLR_GetErrorString`](#dlr_geterrorstring) to get detailed error message.*

**Code Snippet**

```c
char errorMessage[256];
DLR_InitLicense("t0260NwAAAHV***************", errorMessage, 256);

void* recognizer = DLR_CreateInstance();
DLR_AppendSettingsFromString(recognizer, "{\"LabelRecognizerParameter\":{\"Name\":\"P1\", \"RegionPredetectionModes\":[{\"Mode\":\"RPM_GENERAL_HSV_CONTRAST\"}], \"ReferenceRegionNameArray\": [\"R1\"]},\"ReferenceRegion\":{\"Name\":\"R1\",\"Localization\":{\"SourceType\":\"LST_PREDETECTED_REGION\",\"RegionPredetectionModesIndex\":0},\"TextAreaNameArray\":[\"T1\"]},\"TextArea\":{\"Name\":\"T1\",\"CharacterModelName\":\"Number\"}}", errorMessage, 256);
DLR_OutputSettingsToFile(recognizer, "C:\\Program Files (x86)\\Dynamsoft\\{Version number}\\Templates\\CurrentRuntimeSettings.json", "currentRuntimeSettings");
DLR_DestroyInstance(recognizer);
```

&nbsp;

### DLR_OutputSettingsToString
Outputs runtime settings and save them into a settings file (JSON file).  

```c
int DLR_OutputSettingsToString (void* recognizer, char content[], const int contentLen, const char* pSettingsName)
```   

**Parameters**

`[in] recognizer` Handle of the label recognition instance.  
`[in,out]	content` The output string which stores the contents of current settings.   
`[in]	contentLen` The length of output string.   
`[in]	pSettingsName` A unique name for declaring current runtime settings.  


**Return value**

Returns error code (returns 0 if the function operates successfully).    
*You can call [`DLR_GetErrorString`](#dlr_geterrorstring) to get detailed error message.*

**Code Snippet**

```c
char errorMessage[256];
DLR_InitLicense("t0260NwAAAHV***************", errorMessage, 256);

void* recognizer = DLR_CreateInstance();
char conent[2048] = {0};
DLR_OutputSettingsToString(recognizer, content, 2048, "currentRuntimeSettings");
DLR_DestroyInstance(recognizer);
```


&nbsp;

### DLR_ClearAppendedSettings
Clear all appended parameter settings of the current label recognition instance.

```c
void DLR_ClearAppendedSettings (void* recognizer)	
```   
   
**Parameters**

`[in]	recognizer` Handle of the Dynamsoft Label Recognizer instance.

**Code Snippet**

```c
char errorMessage[256];
DLR_InitLicense("t0260NwAAAHV***************", errorMessage, 256);

void* recognizer = DLR_CreateInstance();
DLR_ClearAppendedSettings(recognizer);
```

&nbsp;

### DLR_UpdateReferenceRegionFromBarcodeResults
Updates reference region which is defined with source type DLR_LST_BARCODE.  

```c
int DLR_UpdateReferenceRegionFromBarcodeResults (void* recognizer, const BarcodeResultArray* barcodeResults, const char* templateName)
```   
   
**Parameters**

`[in]	recognizer` Handle of the Dynamsoft Label Recognizer instance.  
`[in]	barcodeResults` The barcode results used to localize reference region.  See also [`BarcodeResultArray`](barcode-result-array.md).
`[in]	templateName` The template name. A template name is the value of key LabelRecognizerParameter.Name defined in JSON formatted settings. If no template name is specified, current runtime settings will be used.


**Return value**

Returns error code (returns 0 if the function operates successfully).    
*You can call [`DLR_GetErrorString`](#dlr_geterrorstring) to get detailed error message.*

**Code Snippet**

```c
char errorMessage[256];
DLR_InitLicense("t0260NwAAAHV***************", errorMessage, 256);

void* recognizer = DLR_CreateInstance();
DLR_AppendSettingsFromString(recognizer, "{\"LabelRecognizerParameter\":{\"Name\":\"P1\", \"RegionPredetectionModes\":[{\"Mode\":\"RPM_GENERAL_HSV_CONTRAST\"}], \"ReferenceRegionNameArray\": [\"R1\"]},\"ReferenceRegion\":{\"Name\":\"R1\",\"Localization\":{\"SourceType\":\"LST_BARCODE\"},\"TextAreaNameArray\":[\"T1\"]},\"TextArea\":{\"Name\":\"T1\",\"CharacterModelName\":\"Number\"}}", errorMessage, 256);
//Get barcodeResults from Dynamsoft Barcode Reader SDK
DLR_UpdateReferenceRegionFromBarcodeResults(recognizer, barcodeResults, "P1");
DLR_DestroyInstance(recognizer);
```



&nbsp;

### DLR_SetModeArgument

Set argument value for the specified mode parameter.


```c
int DLR_SetModeArgument (void* recognizer, const char* modesName, const int index, const char* argumentName, const char* argumentValue, char errorMsgBuffer[],  const int errorMsgBufferLen)	
```   
**Parameters**

`[in] recognizer` Handle of the label recognition instance.  
`[in]	modesName` The mode parameter name to set argument.  
`[in]	index` The array index of mode parameter to indicate a specific mode.  
`[in]	argumentName` The name of the argument to set.  
`[in]	argumentValue` The value of the argument to set.  
`[in,out]	errorMsgBuffer` The buffer is allocated by the caller and the recommended length is 256. The error message will be copied to the buffer.  
`[in]	errorMsgBufferLen` The length of the allocated buffer.  

**Return value**

Returns error code (returns 0 if the function operates successfully).  
*You can call [`DLR_GetErrorString`](#dlr_geterrorstring) to get detailed error message.*


**Remark**

Check follow link for available modes and arguments:
- [`RegionPredetectionModes`]({{ site.parameters-reference }}label-recognition-parameter/region-predetection-modes.html#regionpredetectionmodes)

**Code Snippet**

```c
char errorMessage[256];
DLR_InitLicense("t0260NwAAAHV***************", errorMessage, 256);

void* recognizer = DLR_CreateInstance();
DLR_RuntimeSettings settings;
int errorCode = DLR_GetRuntimeSettings(recognizer, &settings);
settings.furtherModes.regionPredetectionModes[0] = RPM_GENERAL_RGB_CONTRAST;
DLR_UpdateRuntimeSettings(recognizer, &settings, errorMessage, 256);
DLR_SetModeArgument(recognizer, "RegionPredetectionModes", 0, "AspectRatioRange", "100", errorMessage, 256);
DLR_DestroyInstance(recognizer);
```




&nbsp;

### DLR_GetModeArgument

Get argument value for the specified mode parameter.

```c
int DLR_GetModeArgument (void* recognizer, const char* modesName, const int index, const char* argumentName, char valueBuffer[], const int valueBufferLen, char errorMsgBuffer[], const int errorMsgBufferLen)	
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

**Return value**

Returns error code (returns 0 if the function operates successfully).  
*You can call [`DLR_GetErrorString`](#dlr_geterrorstring) to get detailed error message.*

&nbsp;

**Remark**

Check follow link for available modes and arguments:
- [`RegionPredetectionModes`]({{ site.parameters-reference }}label-recognition-parameter/region-predetection-modes.html#regionpredetectionmodes)

**Code Snippet**

```c
char errorMessage[256];
DLR_InitLicense("t0260NwAAAHV***************", errorMessage, 256);

void* recognizer = DLR_CreateInstance();
DLR_RuntimeSettings settings;
int errorCode = DLR_GetRuntimeSettings(recognizer, &settings);
settings.furtherModes.regionPredetectionModes[0] = RPM_GENERAL_RGB_CONTRAST;
DLR_UpdateRuntimeSettings(recognizer, &settings, errorMessage, 256);
DLR_SetModeArgument(recognizer, "RegionPredetectionModes", 0, "AspectRatioRange", "100", errorMessage, 256);
DLR_GetModeArgument(recognizer, "RegionPredetectionModes", 0, "AspectRatioRange", argumentValue, 480, errorMessage, 256);
DLR_DestroyInstance(recognizer);
```

 
   
## Recognizing
   
  | Method               | Description |
  |----------------------|-------------|
  | [`DLR_RecognizeByBuffer`](#dlr_recognizebybuffer) | Recognizes text from memory buffer containing image pixels in defined format. |
  | [`DLR_RecognizeByFile`](#dlr_recognizebyfile) | Recognizes text from a specified image file. |
  | [`DLR_RecognizeFileInMemory`](#dlr_recognizefileinmemory) | Recognizes text from an image file in memory. |


&nbsp;

### DLR_RecognizeByBuffer
Recognizes text from the memory buffer containing image pixels in defined format.

```c
int DLR_RecognizeByBuffer(void* recognizer, const ImageData* imageData, const char* templateName)
```   
   
**Parameters**

`[in] recognizer` Handle of the label recognition instance.  
`[in]	imageData` A struct of [`ImageData`](image-data.md) that represents an image.  
`[in]	templateName` The template name. A template name is the value of key LabelRecognizerParameter.Name defined in JSON formatted settings. If no template name is specified, current runtime settings will be used.

**Return value**

Returns error code (returns 0 if the function operates successfully).    
*You can call [`DLR_GetErrorString`](#dlr_geterrorstring) to get detailed error message.*

**Code Snippet**

```c
char errorMessage[256];
DLR_InitLicense("t0260NwAAAHV***************", errorMessage, 256);

void* recognizer = DLR_CreateInstance();

//Generate imageData from somewhere else
int errorCode = DLR_RecognizeByBuffer(recognizer, imageData, "");
DLR_DestroyInstance(recognizer);
```




&nbsp;

### DLR_RecognizeByFile
Recognizes text from a specified image file.

```c
int DLR_RecognizeByFile (void* recognizer, const char* fileName, const char* templateName)	
```   
   
**Parameters**

`[in] recognizer` Handle of the label recognition instance.  
`[in]	fileName` A string defining the file name.  
`[in]	templateName` The template name. A template name is the value of key LabelRecognizerParameter.Name defined in JSON formatted settings. If no template name is specified, current runtime settings will be used.

**Return value**

Returns error code (returns 0 if the function operates successfully).    
*You can call [`DLR_GetErrorString`](#dlr_geterrorstring) to get detailed error message.*

**Code Snippet**

```c
char errorMessage[256];
DLR_InitLicense("t0260NwAAAHV***************", errorMessage, 256);

void* recognizer = DLR_CreateInstance();
int errorCode = DLR_RecognizeByFile(recognizer, "C:\\Program Files (x86)\\Dynamsoft\\{Version number}\\Images\\AllSupportedBarcodeTypes.tif", "");
DLR_DestroyInstance(recognizer);
```

 
&nbsp;

### DLR_RecognizeFileInMemory
Recognizes text from a specified image file in memory.

```c
int DLR_RecognizeFileInMemory (void* recognizer, const unsigned char* pFileBytes, const int fileSize, const char* pTemplateName)	
```  
   
**Parameters**  
`[in] recognizer` Handle of the label recognition instance.  
`[in]	pFileBytes` The image file bytes in memory.  
`[in]	fileSize`	The length of the file bytes in memory.  
`[in]	pTemplateName` The template name.  

**Return Value**  
Returns error code (returns 0 if the function operates successfully).    
*You can call [`DLR_GetErrorString`](#dlr_geterrorstring) to get detailed error message.*

**Code Snippet**  
```c
char errorMessage[256];
DLR_InitLicense("t0260NwAAAHV***************", errorMessage, 256);

void* recognizer = DLR_CreateInstance();

unsigned char* pFileBytes;
int nFileSize = 0;
GetFileStream("C:\\Program Files (x86)\\Dynamsoft\\{Version number}\\Images\\AllSupportedBarcodeTypes.tif", &pFileBytes, &nFileSize);

int errorCode = DLR_RecognizeFileInMemory(recognizer, pFileBytes, nFileSize, "");
DLR_DestroyInstance(recognizer);
```


   
## Result
   
  | Method               | Description |
  |----------------------|-------------|
  | [`DLR_GetAllResults`](#dlr_getallresults) | Gets all recognized results. |
  | [`DLR_FreeResults`](#dlr_freeresults) | Frees memory allocated for recognized results. |
   

&nbsp;

### DLR_GetAllResults
Get all recognized results.

```c
int DLR_GetAllResults (void* recognizer, DLR_ResultArray** results)	
```   
   
**Parameters**

`[in] recognizer` Handle of the label recognition instance.  
`[out] results`	Recognized results returned by last calling function [`DLR_RecognizeByBuffer`](#dlr_recognizebybuffer) / [`DLR_RecognizeByFile`](#dlr_recognizebyfile). The results is allocated by SDK and should be freed by calling function [`DLR_FreeResults`](#dlr_freeresults).

**Return value**

Returns error code (returns 0 if the function operates successfully).    
*You can call [`DLR_GetErrorString`](#dlr_geterrorstring) to get detailed error message.*

**Code Snippet**

```c
char errorMessage[256];
DLR_InitLicense("t0260NwAAAHV***************", errorMessage, 256);

void* recognizer = DLR_CreateInstance();
DLR_ResultArray * results = NULL;
int errorCode = DLR_RecognizeByFile(recognizer, "C:\\Program Files (x86)\\Dynamsoft\\{Version number}\\Images\\AllSupportedBarcodeTypes.tif", "");
DLR_GetAllResults(recognizer, &results);
DLR_FreeResults(&results);
DLR_DestroyInstance(recognizer);
```



&nbsp;

### DLR_FreeResults
Free memory allocated for text results.

```c
void DLR_FreeResults (DLR_ResultArray ** results)	
```   
   
**Parameters**

`[in]	results` Recognized results.

**Code Snippet**

```c
char errorMessage[256];
DLR_InitLicense("t0260NwAAAHV***************", errorMessage, 256);

void* recognizer = DLR_CreateInstance();
DLR_InitLicense(recognizer, "t0260NwAAAHV***************");
DLR_ResultArray * results = NULL;
int errorCode = DLR_RecognizeByFile(recognizer, "C:\\Program Files (x86)\\Dynamsoft\\{Version number}\\Images\\AllSupportedBarcodeTypes.tif", "");
DLR_GetAllResults(recognizer, &results);
DLR_FreeResults(&results);
DLR_DestroyInstance(recognizer);
```

## General
   
  | Method               | Description |
  |----------------------|-------------|
  | [`DLR_GetErrorString`](#dlr_geterrorstring) | Returns the error string. |
  | [`DLR_GetVersion`](#dlr_getversion) | Returns the version number string for the SDK. |
   
&nbsp;

### DLR_GetErrorString

Get error message by error code.

```c
const char* DLR_GetErrorString (int errorCode)	
```   
   
**Parameters**


`[in]	errorCode` The error code.
 

**Return value**


The error message.

**Code Snippet**


```c
const char* errorString = DLR_GetErrorString(errorCode);
```

&nbsp;

### DLR_GetVersion

Get version information of SDK.

```c
const char* DLR_GetVersion ()
```   

**Return value**

The version information string.

**Code Snippet**


```c
const char* versionInfo = DLR_GetVersion();
```

 

