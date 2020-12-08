---
layout: default-layout
title: Dynamsoft Label Recognition C API Reference - Recognizing
description: This is the recognizing functions of Dynamsoft Label Recognition for C API Reference.
keywords: api reference, c
needAutoGenerateSidebar: true
---

# C API Reference - Recognizing

| Method               | Description |
|----------------------|-------------|
  | [`DLR_RecognizeByBuffer`](#dlr_recognizebybuffer) | Recognizes text from memory buffer containing image pixels in defined format. |
  | [`DLR_RecognizeByFile`](#dlr_recognizebyfile) | Recognizes text from a specified image file. |
  | [`DLR_RecognizeBasedOnDBRResultsByBuffer`](#dlr_RecognizeBasedOnDBRResultsByBuffer) | Recognizes text from memory buffer containing image pixels in defined format according to barcode results from DBR SDK. |
  | [`DLR_RecognizeBasedOnDBRResultsByFile`](#dlr_RecognizeBasedOnDBRResultsByFile) | Recognizes text from a specified image file according to barcode results from DBR SDK.. |

---

## DLR_RecognizeByBuffer
Recognizes text from the memory buffer containing image pixels in defined format.

```c
DLR_API int DLR_RecognizeByBuffer(void* recognizer, const DLRImageData* imageData, const char* templateName)
```   
   
#### Parameters
`[in] recognizer` Handle of the label recognition instance.  
`[in]	imageData` A struct of DLRImageData that represents an image.  
`[in]	templateName` The template name.

#### Return value
Returns error code (returns 0 if the function operates successfully).    
*You can call [`DLR_GetErrorString`](general.md#dlr_geterrorstring) to get detailed error message.*

#### Code Snippet
```c
void* recognizer = DLR_CreateInstance();
DLR_InitLicense(recognizer, "t0260NwAAAHV***************");
//Generate imageData from somewhere else
int errorCode = DLR_RecognizeByBuffer(recognizer, imageData, "");
DLR_DestroyInstance(recognizer);
```

&nbsp;


## DLR_RecognizeByFile
Recognizes text from a specified image file.

```c
DLR_API int DLR_RecognizeByFile (void* recognizer, const char* fileName, const char* templateName)	
```   
   
#### Parameters
`[in] recognizer` Handle of the label recognition instance.  
`[in]	fileName` A string defining the file name.  
`[in]	templateName` The template name.

#### Return value
Returns error code (returns 0 if the function operates successfully).    
*You can call [`DLR_GetErrorString`](general.md#dlr_geterrorstring) to get detailed error message.*

#### Code Snippet
```c
void* recognizer = DLR_CreateInstance();
DLR_InitLicense(recognizer, "t0260NwAAAHV***************");
int errorCode = DLR_RecognizeByFile(recognizer, "C:\\Program Files (x86)\\Dynamsoft\\{Version number}\\Images\\AllSupportedBarcodeTypes.tif", "");
DLR_DestroyInstance(recognizer);
```

&nbsp;






## DLR_RecognizeBasedOnDBRResultsByBuffer
Recognizes text from memory buffer containing image pixels in defined format according to barcode results from DBR SDK.

```c
DLR_API int DLR_RecognizeBasedOnDBRResultsByBuffer(void* recognizer, const DLRImageData* imageData, TextResultArray* DBRTextResultArray)
```   
   
#### Parameters
`[in] recognizer` Handle of the label recognition instance.  
`[in]	imageData` A struct of DLRImageData that represents an image.  
`[in]	DBRTextResultArray` Barcode Text result array returned by Dynamsoft Barcode Reader SDK.  

#### Return value
Returns error code (returns 0 if the function operates successfully).    
*You can call [`DLR_GetErrorString`](general.md#dlr_geterrorstring) to get detailed error message.*


&nbsp;


## DLR_RecognizeBasedOnDBRResultsByFile
Recognizes text from a specified image file.

```c
DLR_API int DLR_RecognizeBasedOnDBRResultsByFile (void* recognizer, const char* fileName, TextResultArray* DBRTextResultArray)	
```   
   
#### Parameters
`[in] recognizer` Handle of the label recognition instance.  
`[in]	fileName` A string defining the file name.  
`[in]	DBRTextResultArray` Barcode Text result array returned by Dynamsoft Barcode Reader SDK.  

#### Return value
Returns error code (returns 0 if the function operates successfully).    
*You can call [`DLR_GetErrorString`](general.md#dlr_geterrorstring) to get detailed error message.*


&nbsp;





