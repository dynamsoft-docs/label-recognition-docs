---
layout: default-layout
title: Result - Dynamsoft Label Recognition C API Reference
description: This is the result functions of Dynamsoft Label Recognition for C API Reference.
keywords: api reference, c
needAutoGenerateSidebar: true
---

# C API Reference - Result

| Method               | Description |
|----------------------|-------------|
  | [`DLR_GetAllDLRResults`](#dlr_getalldlrresults) | Gets all recognized results. |
  | [`DLR_FreeDLRResults`](#dlr_freedlrresults) | Frees memory allocated for recognized results. |

---

## DLR_GetAllDLRResults
Get all recognized results.

```c
DLR_API int DLR_GetAllDLRResults (void* recognizer, DLRResultArray** results)	
```   
   
**Parameters**
`[in] recognizer` Handle of the label recognition instance.  
`[out] results`	Recognized results returned by last calling function [`DLR_RecognizeByBuffer`](recognizing.md#dlr_recognizebybuffer) / [`DLR_RecognizeByFile`](recognizing.md#dlr_recognizebyfile). The results is allocated by SDK and should be freed by calling function [`DLR_FreeDLRResults`](#dlr_freedlrresults).

**Return Value**
Returns error code (returns 0 if the function operates successfully).    
*You can call [`DLR_GetErrorString`](general.md#dlr_geterrorstring) to get detailed error message.*

**Code Snippet**
```c
void* recognizer = DLR_CreateInstance();
DLR_InitLicense(recognizer, "t0260NwAAAHV***************");
DLRResultArray * results = NULL;
int errorCode = DLR_RecognizeByFile(recognizer, "C:\\Program Files (x86)\\Dynamsoft\\{Version number}\\Images\\AllSupportedBarcodeTypes.tif", "");
DLR_GetAllDLRResults(recognizer, &results);
DLR_FreeDLRResults(&results);
DLR_DestroyInstance(recognizer);
```

&nbsp;

## DLR_FreeDLRResults
Free memory allocated for text results.

```c
DLR_API void DLR_FreeDLRResults (DLRResultArray ** results)	
```   
   
**Parameters**
`[in]	results` Recognized results.

**Code Snippet**
```c
void* recognizer = DLR_CreateInstance();
DLR_InitLicense(recognizer, "t0260NwAAAHV***************");
DLRResultArray * results = NULL;
int errorCode = DLR_RecognizeByFile(recognizer, "C:\\Program Files (x86)\\Dynamsoft\\{Version number}\\Images\\AllSupportedBarcodeTypes.tif", "");
DLR_GetAllDLRResults(recognizer, &results);
DLR_FreeDLRResults(&results);
DLR_DestroyInstance(recognizer);
```

&nbsp;





