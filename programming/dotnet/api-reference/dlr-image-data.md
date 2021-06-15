---
layout: default-layout
title: Dynamsoft Label Recognizer .Net Class - DLR_ImageData
description: This page shows the DLR_ImageData struct of Dynamsoft Label Recognizer for .Net Language.
keywords: DLR_ImageData, .Net
needAutoGenerateSidebar: true
needGenerateH3Content: true
---


# class Dynamsoft.DLR.DLR_ImageData
Stores the image data.  


## Attributes
    
| Attribute | Type |
|---------- | ---- |
| [`Bytes`](#bytes) | *byte[]* |
| [`Width`](#width) | *int* |
| [`Height`](#height) | *int* |
| [`Stride`](#stride) | *int* |
| [`Format`](#format) | [`EnumDLRImagePixelFormat`]({{ site.enumerations }}other-enums.html#dlrimagepixelformat) |


### Bytes
The image data content in a byte array. 
```csharp
byte[] Bytes
```

### Width
The width of the image in pixels.  
```csharp
int Width
```

### Height
The height of the image in pixels.  
```csharp
int Height
```

### Stride
The stride (or scan width) of the image. 
```csharp
int Stride
```

### Format
The image pixel format used in the image byte array. 
```csharp
EnumDLRImagePixelFormat Format
```
  

