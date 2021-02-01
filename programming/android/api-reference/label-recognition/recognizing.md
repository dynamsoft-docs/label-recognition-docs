---
layout: default-layout
title: Dynamsoft Label Recognition Android API Reference - Recognizing
description: This is the recognizing functions of Dynamsoft Label Recognition for Android API Reference.
keywords: api reference, android
needAutoGenerateSidebar: true
---

# Android API Reference - Recognizing

| Method               | Description |
|----------------------|-------------|
  | [`recognizeByBuffer`](#recognizebybuffer) | Recognizes text from memory buffer containing image pixels in defined format. |
  | [`recognizeByFile`](#recognizebyfile) | Recognizes text from a specified image file. |

---

## recognizeByBuffer
Recognizes text from the memory buffer containing image pixels in defined format.

```java
DLRResult[] com.dynamsoft.dlr.LabelRecognition.recognizeByBuffer(DLRImageData imageData, String templateName) throws LabelRecognitionException
```   
   
### Parameters
`[in]	imageData` An object of DLRImageData that represents an image.  
`[in]	templateName` The template name. A template name is the value of key LabelRecognitionParameter.Name defined in JSON formatted settings. If no template name is specified, current runtime settings will be used.

### Return value
All results recognized successfully.

### Exceptions

[`LabelRecognitionException`](../class/label-recognition-exception.md)

### Code Snippet
```java
LabelRecognition recognizer = new LabelRecognition();
recognizer.initLicense("t0260NwAAAHV***************");
//Generate imageData from somewhere else
DLRResult[] result = recognizer.recognizeByBuffer(imageData, "");
recognizer.destroy();
```

&nbsp;


## recognizeByFile
Recognizes text from a specified image file.

```java
DLRResult[] com.dynamsoft.dlr.LabelRecognition.recognizeByFile (String fileName, String templateName) throws LabelRecognitionException	
```   
   
### Parameters
`fileName` A string defining the file name.  
`templateName` The template name. A template name is the value of key LabelRecognitionParameter.Name defined in JSON formatted settings. If no template name is specified, current runtime settings will be used.

### Return value
All results recognized successfully.

### Exceptions

[`LabelRecognitionException`](../class/label-recognition-exception.md)

### Code Snippet
```java
LabelRecognition recognizer = new LabelRecognition();
recognizer.initLicense("t0260NwAAAHV***************");
DLRResult[] result = recognizer.recognizeByFile("full file path", "");
recognizer.destroy();
```

&nbsp;


