---
layout: default-layout
title: Dynamsoft Core C & C++ Struct - ImageData
description: This page shows the ImageData struct of Dynamsoft Core for C & C++ Language.
keywords: ImageData, struct, c, c++
needAutoGenerateSidebar: true
needGenerateH3Content: true
---


# ImageData
Stores the image data.  

## Typedefs

```cpp
typedef struct tagImageData  ImageData
```

---

## Attributes
    
| Attribute | Type |
|---------- | ---- |
| [`bytesLength`](#byteslength) | *int* |
| [`bytes`](#bytes) | *unsigned char\** |
| [`width`](#width) | *int* |
| [`height`](#height) | *int* |
| [`stride`](#stride) | *int* |
| [`format`](#format) | [`ImagePixelFormat`]({{ site.enumerations }}image-pixel-format.html) |


### bytesLength
The length of the image data byte array. 
```cpp
int bytesLength
```
### bytes
The image data content in a byte array. 
```cpp
unsigned char* bytes
```

### width
The width of the image in pixels.  
```cpp
int width
```

### height
The height of the image in pixels.  
```cpp
int height
```

### stride
The stride (or scan width) of the image. 
```cpp
int stride
```

### format
The image pixel format used in the image byte array. 
```cpp
ImagePixelFormat format
```
  

