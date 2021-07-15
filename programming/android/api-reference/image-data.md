---
layout: default-layout
title: Dynamsoft Label Recognizer Android Class - ImageData
description: This page shows the ImageData struct of Dynamsoft Label Recognizer for Android Language.
keywords: ImageData, android
needAutoGenerateSidebar: true
needGenerateH3Content: true
---


# class com.dynamsoft.core.ImageData
Stores the image data.  


## Attributes
    
| Attribute | Type |
|---------- | ---- |
| [`bytes`](#bytes) | *byte[]* |
| [`width`](#width) | *int* |
| [`height`](#height) | *int* |
| [`stride`](#stride) | *int* |
| [`format`](#format) | [`EnumImagePixelFormat`]({{ site.enumerations }}other-enums.html#imagepixelformat) |


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
ImagePixelFormat format
```
  

