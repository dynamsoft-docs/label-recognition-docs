---
layout: default-layout
title: Dynamsoft Core .Net Class - ImageData
description: This page shows the ImageData Class of Dynamsoft Core for .Net Language.
keywords: ImageData, .Net
needAutoGenerateSidebar: true
needGenerateH3Content: true
---


# class Dynamsoft.Core.ImageData
Stores the image data.  


## Attributes
    
| Attribute | Type |
|---------- | ---- |
| [`Bytes`](#bytes) | *byte[]* |
| [`Width`](#width) | *int* |
| [`Height`](#height) | *int* |
| [`Stride`](#stride) | *int* |
| [`Format`](#format) | [`EnumImagePixelFormat`]({{ site.enumerations }}other-enums.html#imagepixelformat) |


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
EnumImagePixelFormat Format
```
  

