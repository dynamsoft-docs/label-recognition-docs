---
layout: default-layout
title: Dynamsoft Core C++ Class - CImageData
description: This page shows the CImageData class of Dynamsoft Core for C & C++ Language.
keywords: CImageData, class, c++
needAutoGenerateSidebar: true
needGenerateH3Content: true
noTitleIndex: true
---

# CImageData

Stores the image data.  

```cpp
class dynamsoft::core::CImageData;
```

| Method | Description |
|--------|-------------|
|[`CImageData`](#cimagedata-constructor)| Constructor function. |
|[`~CImageData`](#cimagedata-destructor)| Destructor function. |
|[`GetBytes`](#getbytes)| Gets the bytes of the image data. |
|[`GetBytesLength`](#getbyteslength)| Gets the bytes length of the image data. |
|[`GetWidth`](#getwidth)| Gets the width of the image data (measured in pixels). |
|[`GetHeight`](#getheight)| Gets the height of the image data (measured in pixels). |
|[`GetStride`](#getstride)| Gets the stride length of the image data (measured in bytes). |
|[`GetImagePixelFormat`](#getimagepixelformat)| Gets the [`pixel format`]({{ site.enumerations }}image-pixel-format.html) of the image data. |

&nbsp;

## CImageData Constructor

The length of the image data byte array.

```cpp
CImageData();
CImageData(int bytesLength, unsigned char* bytes, int width, int height, int stride, ImagePixelFormat format);
```

&nbsp;

## CImageData Destructor

```cpp
~CImageData();
```

&nbsp;

## GetBytes

Gets the bytes of the image data.

```cpp
const unsigned char* const GetBytes() const;
```

&nbsp;

## GetBytesLength

Gets the bytes length of the image data.

```cpp
int GetBytesLength() const;
```

&nbsp;

## GetWidth

Gets the width of the image data (measured in pixels).

```cpp
int GetWidth() const;
```

&nbsp;

## GetHeight

Gets the height of the image data (measured in pixels).

```cpp
int GetHeight() const;
```

&nbsp;

## GetStride

Gets the stride length of the image data (measured in bytes).

```cpp
int GetStride() const;
```

&nbsp;

## GetImagePixelFormat

Gets the [`pixel format`]({{ site.enumerations }}image-pixel-format.html) of the image data.

```cpp
ImagePixelFormat GetImagePixelFormat() const;
```
