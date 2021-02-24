---
layout: default-layout
title: Dynamsoft Label Recognition C & C++ Struct - DLRImageData
description: This page shows the DLRImageData struct of Dynamsoft Label Recognition for C & C++ Language.
keywords: DLRImageData, struct, c, c++
needAutoGenerateSidebar: true
---


# DLRImageData
Stores the image data.  

## Typedefs

```cpp
typedef struct tagDLRImageData  DLRImageData
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
| [`format`](#format) | [`DLRImagePixelFormat`]({{ site.enumerations }}other-enums.html#dlrimagepixelformat) |


### bytesLength
The length of the image data byte array. 
```cpp
int tagDLRImageData::bytesLength
```
### bytes
The image data content in a byte array. 
```cpp
unsigned char* tagDLRImageData::bytes
```

### width
The width of the image in pixels.  
```cpp
int tagDLRImageData::width
```

### height
The height of the image in pixels.  
```cpp
int tagDLRImageData::height
```

### stride
The stride (or scan width) of the image. 
```cpp
int tagDLRImageData::stride
```

### format
The image pixel format used in the image byte array. 
```cpp
DLRImagePixelFormat tagDLRImageData::format
```
  

