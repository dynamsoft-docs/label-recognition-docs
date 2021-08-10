---
layout: default-layout
title: Dynamsoft Core .Net Class - ImageData
description: This page shows the ImageData Class of Dynamsoft Core for .Net Language.
keywords: ImageData, .Net
needAutoGenerateSidebar: true
needGenerateH3Content: true
noTitleIndex: true
---


# ImageData
Stores the image data.  

```csharp
class Dynamsoft.Core.ImageData
``` 

## Attributes
    
| Attribute | Type |
|---------- | ---- |
| [`Bytes`](#bytes) | *byte[]* |
| [`Width`](#width) | *int* |
| [`Height`](#height) | *int* |
| [`Stride`](#stride) | *int* |
| [`Format`](#format) | [`EnumImagePixelFormat`]({{ site.enumerations }}image-pixel-format.html) |


&nbsp;

### Bytes
The image data content in a byte array. 
```csharp
byte[] Bytes
```

&nbsp;

### Width
The width of the image in pixels.  
```csharp
int Width
```

&nbsp;

### Height
The height of the image in pixels.  
```csharp
int Height
```

&nbsp;

### Stride
The stride (or scan width) of the image. 
```csharp
int Stride
```

&nbsp;

### Format
The image pixel format used in the image byte array. 
```csharp
EnumImagePixelFormat Format
```
  

