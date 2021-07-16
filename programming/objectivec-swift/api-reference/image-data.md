---
layout: default-layout
title: Dynamsoft Label Recognizer Objective-C & Swift Class - iImageData
description: This page shows the iImageData class of Dynamsoft Label Recognizer for iOS SDK.
keywords: iImageData, objective-c, oc, swift
needAutoGenerateSidebar: true
needGenerateH3Content: true
---


# iImageData
Stores the image data.  


## Attributes
    
| Attribute | Type |
|---------- | ---- |
| [`bytes`](#bytes) | *NSData\** |
| [`width`](#width) | *NSInteger* |
| [`height`](#height) | *NSInteger* |
| [`stride`](#stride) | *NSInteger* |
| [`format`](#format) | [`EnumImagePixelFormat`]({{ site.enumerations }}other-enums.html#imagepixelformat) |


### bytes
The image data content in a byte array. 
```objc
NSData* bytes
```

### width
The width of the image in pixels.  
```objc
NSInteger width
```

### height
The height of the image in pixels.  
```objc
NSInteger height
```

### stride
The stride (or scan width) of the image. 
```objc
NSInteger stride
```

### format
The image pixel format used in the image byte array. 
```objc
EnumImagePixelFormat format
```
  

