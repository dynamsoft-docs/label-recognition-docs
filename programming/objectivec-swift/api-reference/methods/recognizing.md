---
layout: default-layout
title: Dynamsoft Label Recognition Objective-C & Swift API Reference - Recognizing
description: This is the recognizing functions of Dynamsoft Label Recognition for Objective-C & Swift API Reference.
keywords: api reference, objective-c, oc, swift
needAutoGenerateSidebar: true
---

# Objective-C & Swift API Reference - Recognizing

| Method               | Description |
|----------------------|-------------|
  | [`recognizeByBuffer`](#recognizebybuffer) | Recognizes text from memory buffer containing image pixels in defined format. |
  | [`recognizeByFile`](#recognizebyfile) | Recognizes text from a specified image file. |

---

## recognizeByBuffer
Recognizes text from the memory buffer containing image pixels in defined format.

```objc
- (NSArray<iDLRResult*>*)recognizeByBuffer:(iDLRImageData*)imageData templateName:(NSString*)templateName error:(NSError**)error
```   
   
### Parameters
`[in]	imageData` An object of iDLRImageData that represents an image.  
`[in]	templateName` The template name. A template name is the value of key LabelRecognitionParameter.Name defined in JSON formatted settings. If no template name is specified, current runtime settings will be used.
`[in,out] error` Input a pointer to an error object. If an error occurs, this pointer is set to an actual error object containing the error information. You may specify nil for this parameter if you do not want the error information.

### Return value
All results recognized successfully.

### Code Snippet
Objective-C:
```objc
DynamsoftLabelRecognition *recognizer;
recognizer = [[DynamsoftLabelRecognition alloc] initWithLicense:@"t0260NwAAAHV***************"];
iDLRResult *result;
iDLRImageData *imageData = [[iDLRImageData alloc] init];
//construct imageData
NSError __autoreleasing *  error;
result = [recognizer recognizeByBuffer:imageData templateName:@"" error:&error];
```
Swift:
```Swift
let recognizer = DynamsoftLabelRecognition.initWithLicense(license: "t0260NwAAAHV***************")
let imageData = iDLRImageData.init()
let error: NSError? = NSError()
//construct imageData
let result = recognizer.recognizeByBuffer(imageData:imageData, templateName:"", error:&error)
```
&nbsp;


## recognizeByFile
Recognizes text from a specified image file.

```objc
- (NSArray<iDLRResult*>*)recognizeByFile:(NSString*)name templateName:(NSString*)templateName error:(NSError**)error
```   
   
### Parameters
`name` A string defining the file name.  
`templateName` The template name. A template name is the value of key LabelRecognitionParameter.Name defined in JSON formatted settings. If no template name is specified, current runtime settings will be used.
`[in,out] error` Input a pointer to an error object. If an error occurs, this pointer is set to an actual error object containing the error information. You may specify nil for this parameter if you do not want the error information.

### Return value
All results recognized successfully.


### Code Snippet
Objective-C:
```objc
DynamsoftLabelRecognition *recognizer;
recognizer = [[DynamsoftLabelRecognition alloc] initWithLicense:@"t0260NwAAAHV***************"];
iDLRResult *result;
NSError __autoreleasing *  error;
result = [recognizer recognizeByFile:@"your file path" templateName:@"" error:&error];
```
Swift:
```Swift
let recognizer = DynamsoftLabelRecognition.initWithLicense(license: "t0260NwAAAHV***************")
let error: NSError? = NSError()
//construct imageData
let result = recognizer.recognizeByFile("your file path", templateName:"", error:&error)
```

&nbsp;


