---
layout: default-layout
title: Dynamsoft Label Recognition Java Class - DLRImageData
description: This page shows the DLRImageData struct of Dynamsoft Label Recognition for Java Language.
keywords: DLRImageData, java
needAutoGenerateSidebar: true
---


# class com.dynamsoft.dlr.DLRImageData
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
byte[] bytes
```

### width
The width of the image in pixels.  
```java
int width
```

### height
The height of the image in pixels.  
```java
int height
```

### stride
The stride (or scan width) of the image. 
```java
int stride
```

### format
The image pixel format used in the image byte array. 
```java
DLRImagePixelFormat format
```
  

