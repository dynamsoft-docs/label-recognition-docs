---
layout: default-layout
title: Dynamsoft Label Recognition Objective-C & Swift Class - iDLRImageData
description: This page shows the iDLRImageData class of Dynamsoft Label Recognition for iOS SDK.
keywords: iDLRImageData, objective-c, oc, swift
needAutoGenerateSidebar: true
---


# iDLRImageData
Stores the image data.  


## Attributes
    
| Attribute | Type |
|---------- | ---- |
| [`bytes`](#bytes) | *NSData\** |
| [`width`](#width) | *NSInteger* |
| [`height`](#height) | *NSInteger* |
| [`stride`](#stride) | *NSInteger* |
| [`format`](#format) | [`EnumDLRImagePixelFormat`]({{ site.enumerations }}other-enums.html#dlrimagepixelformat) |


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
EnumDLRImagePixelFormat format
```
  

