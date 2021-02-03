---
layout: default-layout
title: Dynamsoft Label Recognition Android Class - DLRImageData
description: This page shows the DLRImageData struct of Dynamsoft Label Recognition for Android Language.
keywords: DLRImageData, android
needAutoGenerateSidebar: true
---


# DLRImageData
Stores the image data.  


## Attributes
    
| Attribute | Type |
|---------- | ---- |
| [`bytes`](#bytes) | *byte[]* |
| [`width`](#width) | *int* |
| [`height`](#height) | *int* |
| [`stride`](#stride) | *int* |
| [`format`](#format) | [`DLRImagePixelFormat`]({{ site.enumerations }}other-enums.html#dlrimagepixelformat) |


### bytes
The image data content in a byte array. 
```java
byte[] com.dynamsoft.dlr.DLRImageData.bytes
```

### width
The width of the image in pixels.  
```java
int com.dynamsoft.dlr.DLRImageData.width
```

### height
The height of the image in pixels.  
```java
int com.dynamsoft.dlr.DLRImageData.height
```

### stride
The stride (or scan width) of the image. 
```java
int com.dynamsoft.dlr.DLRImageData.stride
```

### format
The image pixel format used in the image byte array. 
```java
DLRImagePixelFormat com.dynamsoft.dlr.DLRImageData.format
```
  

