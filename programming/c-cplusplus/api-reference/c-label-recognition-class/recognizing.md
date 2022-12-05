---
layout: default-layout
title: Recognizing - Dynamsoft Label Recognition C++ API Reference
description: This is the recognizing functions of Dynamsoft Label Recognition for C++ API Reference.
keywords: api reference, cpp
needAutoGenerateSidebar: true
---

# C++ API Reference - Recognizing

| Method               | Description |
|----------------------|-------------|
  | [`RecognizeByBuffer`](#recognizebybuffer) | Recognizes text from memory buffer containing image pixels in defined format. |
  | [`RecognizeByFile`](#recognizebyfile) | Recognizes text from a specified image file. |

---

## RecognizeByBuffer
Recognizes text from the memory buffer containing image pixels in defined format.

```cpp
int dynamsoft::dlr::CLabelRecognition::RecognizeByBuffer(const DLRImageData* imageData, const char* templateName)
```   
   
**Parameters**
`[in]	imageData` A struct of [`DLRImageData`]({{ site.c-cplusplus-structs }}dlr-image-data.html) that represents an image.  
`[in]	templateName` The template name. A template name is the value of key LabelRecognitionParameter.Name defined in JSON formatted settings. If no template name is specified, current runtime settings will be used.

**Return Value**
Returns error code (returns 0 if the function operates successfully).    
*You can call [`GetErrorString`](general.md#geterrorstring) to get detailed error message.*

**Code Snippet**
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
   
**Parameters**
`[in]	fileName` A string defining the file name.  
`[in]	templateName` The template name. A template name is the value of key LabelRecognitionParameter.Name defined in JSON formatted settings. If no template name is specified, current runtime settings will be used.

**Return Value**
Returns error code (returns 0 if the function operates successfully).    
*You can call [`GetErrorString`](general.md#geterrorstring) to get detailed error message.*

**Code Snippet**
```cpp
CLabelRecognition* recognizer = new CLabelRecognition();
recognizer->InitLicense("t0260NwAAAHV***************");
int errorCode = recognizer->RecognizeByFile("C:\\Program Files (x86)\\Dynamsoft\\{Version number}\\Images\\AllSupportedBarcodeTypes.tif", "");
delete recognizer;
```

&nbsp;


