---
layout: default-layout
title: Dynamsoft Label Recognition C++ API Reference - Recognizing
description: This is the recognizing functions of Dynamsoft Label Recognition for C++ API Reference.
keywords: api reference, cpp
needAutoGenerateSidebar: true
---

# C++ API Reference - Recognizing

| Method               | Description |
|----------------------|-------------|
  | [`RecognizeByBuffer`](#recognizebybuffer) | Recognizes text from memory buffer containing image pixels in defined format. |
  | [`RecognizeByFile`](#recognizebyfile) | Recognizes text from a specified image file. |
  | [`RecognizeBasedOnDBRResultsByBuffer`](#RecognizeBasedOnDBRResultsByBuffer) | Recognizes text from memory buffer containing image pixels in defined format according to barcode results from DBR SDK. |
  | [`RecognizeBasedOnDBRResultsByFile`](#RecognizeBasedOnDBRResultsByFile) | Recognizes text from a specified image file according to barcode results from DBR SDK. |

---

## RecognizeByBuffer
Recognizes text from the memory buffer containing image pixels in defined format.

```cpp
int dynamsoft::dlr::CLabelRecognition::RecognizeByBuffer(const DLRImageData* imageData, const char* templateName)
```   
   
#### Parameters
`[in]	imageData` A struct of DLRImageData that represents an image.  
`[in]	templateName` The template name.

#### Return value
Returns error code (returns 0 if the function operates successfully).    
*You can call [`GetErrorString`](general.md#geterrorstring) to get detailed error message.*

#### Code Snippet
```cpp
CLabelRecognition* recognizer = new CLabelRecognition();
recognizer->InitLicense("t0260NwAAAHV***************");
//Generate imageData from somewhere else
int errorCode = recognizer->RecognizeByBuffer(imageData, "");
delete recognizer;
```

&nbsp;


## RecognizeByFile
Recognizes text from a specified image file.

```cpp
int dynamsoft::dlr::CLabelRecognition::RecognizeByFile (const char* fileName, const char* templateName)	
```   
   
#### Parameters
`[in]	fileName` A string defining the file name.  
`[in]	templateName` The template name.

#### Return value
Returns error code (returns 0 if the function operates successfully).    
*You can call [`GetErrorString`](general.md#geterrorstring) to get detailed error message.*

#### Code Snippet
```cpp
CLabelRecognition* recognizer = new CLabelRecognition();
recognizer->InitLicense("t0260NwAAAHV***************");
int errorCode = recognizer->RecognizeByFile("C:\\Program Files (x86)\\Dynamsoft\\{Version number}\\Images\\AllSupportedBarcodeTypes.tif", "");
delete recognizer;
```

&nbsp;


## RecognizeBasedOnDBRResultsByBuffer
Recognizes text from memory buffer containing image pixels in defined format according to barcode results from DBR SDK.

```cpp
int dynamsoft::dlr::CLabelRecognition::RecognizeBasedOnDBRResultsByBuffer(const DLRImageData* imageData, TextResultArray* DBRTextResultArray)
```   
   
#### Parameters
`[in]	imageData` A struct of DLRImageData that represents an image.  
`[in]	DBRTextResultArray` Barcode Text result array returned by Dynamsoft Barcode Reader SDK.  

#### Return value
Returns error code (returns 0 if the function operates successfully).    
*You can call [`GetErrorString`](general.md#geterrorstring) to get detailed error message.*


&nbsp;


## RecognizeBasedOnDBRResultsByFile
Recognizes text from a specified image file according to barcode results from DBR SDK.

```cpp
int dynamsoft::dlr::CLabelRecognition::RecognizeBasedOnDBRResultsByFile (const char* fileName, TextResultArray* DBRTextResultArray)	
```   
   
#### Parameters
`[in]	fileName` A string defining the file name.  
`[in]	DBRTextResultArray` Barcode Text result array returned by Dynamsoft Barcode Reader SDK.  

#### Return value
Returns error code (returns 0 if the function operates successfully).    
*You can call [`GetErrorString`](general.md#geterrorstring) to get detailed error message.*


&nbsp;





