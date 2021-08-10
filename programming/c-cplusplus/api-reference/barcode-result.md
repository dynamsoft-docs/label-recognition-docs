---
layout: default-layout
title: Dynamsoft Core C & C++ Struct - BarcodeResult
description: This page shows the BarcodeResult struct of Dynamsoft Core for C & C++ Language.
keywords: BarcodeResult, struct, c, c++
needAutoGenerateSidebar: true
needGenerateH3Content: true
noTitleIndex: true
---


# BarcodeResult
Stores the barcode result.

```cpp
typedef struct tagBarcodeResult  BarcodeResult
typedef struct tagBarcodeResult*  PBarcodeResult
```  
  

## Attributes
  
| Attribute | Type |
|---------- | ---- |
| [`barcodeFormat`](#barcodeformat) | [`BarcodeFormat`]({{ site.enumerations }}barcode-format.html) |
| [`barcodeFormat_2`](#barcodeformat_2) | [`BarcodeFormat_2`]({{ site.enumerations }}barcode-format-2.html) |
| [`text`](#text) | *const char \** |
| [`bytes`](#bytes) | *unsigned char \** |
| [`bytesLength`](#byteslength) | *int* |
| [`location`](#location) | [`Quadrilateral`](quadrilateral.md)\* |
| [`moduleSize`](#modulesize) | *int* |
| [`pageNumber`](#pagenumber) | *int* |
| [`reserved`](#reserved) | *char\[64\]* |



&nbsp;

### barcodeFormat
Barcode type in BarcodeFormat group 1.
```cpp
BarcodeFormat barcodeFormat
```

&nbsp;

### barcodeFormat_2
Barcode type in BarcodeFormat group 2.
```cpp
BarcodeFormat_2 barcodeFormat_2
```

&nbsp;

### text
The barcode text, ends by '\0'.
```cpp
const char* text
```

&nbsp;

### bytes
The barcode content in a byte array.
```cpp
unsigned char* bytes
```

&nbsp;

### bytesLength
The length of the byte array.
```cpp
int bytesLength
```

&nbsp;

### location
The location of current recognized text.
```cpp
Quadrilateral location
```

&nbsp;

### moduleSize
The barcode module size (the minimum bar width in pixel).
```cpp
int moduleSize
```

&nbsp;

### pageNumber
The page number the barcode located in. The index is 0-based.
```cpp
int pageNumber
```

&nbsp;

### reserved
Reserved memory for the struct. The length of this array indicates the size of the memory reserved for this struct.
```cpp
char reserved[64]
```
