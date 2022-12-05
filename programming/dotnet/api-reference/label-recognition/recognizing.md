---
layout: default-layout
title: Recognizing - Dynamsoft Label Recognition .Net API Reference
description: This is the recognizing functions of Dynamsoft Label Recognition for .Net API Reference.
keywords: api reference, .Net
needAutoGenerateSidebar: true
---

# .Net API Reference - Recognizing

| Method               | Description |
|----------------------|-------------|
  | [`RecognizeByBuffer`](#recognizebybuffer) | Recognizes text from memory buffer containing image pixels in defined format. |
  | [`RecognizeByFile`](#recognizebyfile) | Recognizes text from a specified image file. |

---

## RecognizeByBuffer
Recognizes text from the memory buffer containing image pixels in defined format.

```csharp
DLR_Result[] Dynamsoft.DLR.LabelRecognition.RecognizeByBuffer(DLR_ImageData imageData, string templateName)
```   
   
**Parameters**
`[in]	imageData` An object of [`DLR_ImageData`](../class/dlr-image-data.md) that represents an image.  
`[in]	templateName` The template name. A template name is the value of key LabelRecognitionParameter.Name defined in JSON formatted settings. If no template name is specified, current runtime settings will be used.

**Return Value**
All results recognized successfully.

**Exceptions**
[`DLR_Exception`](../class/label-recognition-exception.md)

**Code Snippet**
```csharp
LabelRecognition recognizer = new LabelRecognition();
recognizer.InitLicense("t0260NwAAAHV***************");
//Generate imageData from somewhere else
DLR_Result[] result = recognizer.RecognizeByBuffer(imageData, "");
recognizer.Dispose();
```

&nbsp;


## RecognizeByFile
Recognizes text from a specified image file.

```csharp
DLR_Result[] Dynamsoft.DLR.LabelRecognition.RecognizeByFile (string fileName, string templateName)	
```   
   
**Parameters**
`fileName` A string defining the file name.  
`templateName` The template name. A template name is the value of key LabelRecognitionParameter.Name defined in JSON formatted settings. If no template name is specified, current runtime settings will be used.

**Return Value**
All results recognized successfully.

**Exceptions**
[`DLR_Exception`](../class/label-recognition-exception.md)

**Code Snippet**
```csharp
LabelRecognition recognizer = new LabelRecognition();
recognizer.InitLicense("t0260NwAAAHV***************");
DLR_Result[] result = recognizer.RecognizeByFile("full file path", "");
recognizer.Dispose();
```

&nbsp;


