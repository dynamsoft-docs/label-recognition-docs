---
layout: default-layout
title: Dynamsoft Core C & C++ Struct - ImageData
description: This page shows the ImageData struct of Dynamsoft Core for C & C++ Language.
keywords: ImageData, struct, c, c++
needAutoGenerateSidebar: true
needGenerateH3Content: true
noTitleIndex: true
---


# ImageData
Stores the image data.  

```cpp
typedef struct tagImageData  ImageData
```


## Attributes
    
| Attribute | Type |
|---------- | ---- |
| [`bytesLength`](#byteslength) | *int* |
| [`bytes`](#bytes) | *unsigned char\** |
| [`width`](#width) | *int* |
| [`height`](#height) | *int* |
| [`stride`](#stride) | *int* |
| [`format`](#format) | [`ImagePixelFormat`]({{ site.enumerations }}image-pixel-format.html) |


&nbsp;

### bytesLength
The length of the image data byte array. 
```cpp
int bytesLength
```
&nbsp;

### bytes
The image data content in a byte array. 
```cpp
unsigned char* bytes
```

&nbsp;

### width
The width of the image in pixels.  
```cpp
int width
```

&nbsp;

### height
The height of the image in pixels.  
```cpp
int height
```

&nbsp;

### stride
The stride (or scan width) of the image. 
```cpp
int stride
```

&nbsp;

### format
The image pixel format used in the image byte array. 
```cpp
ImagePixelFormat format
```
  

