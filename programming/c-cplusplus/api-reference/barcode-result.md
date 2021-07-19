---
layout: default-layout
title: Dynamsoft Core C & C++ Struct - BarcodeResult
description: This page shows the BarcodeResult struct of Dynamsoft Core for C & C++ Language.
keywords: BarcodeResult, struct, c, c++
needAutoGenerateSidebar: true
needGenerateH3Content: true
---


# BarcodeResult
Stores the barcode result.

## Typedefs

```cpp
typedef struct tagBarcodeResult  BarcodeResult
typedef struct tagBarcodeResult*  PBarcodeResult
```  
  
---
  

## Attributes
  
| Attribute | Type |
|---------- | ---- |
| [`barcodeFormat`](#barcodeformat) | [`BarcodeFormat`]({{ site.enumerations }}other-enums.html#barcodeformat) |
| [`barcodeFormat_2`](#barcodeformat_2) | [`BarcodeFormat_2`]({{ site.enumerations }}other-enums.html#barcodeformat_2) |
| [`text`](#text) | *const char \** |
| [`bytes`](#bytes) | *unsigned char \** |
| [`bytesLength`](#byteslength) | *int* |
| [`location`](#location) | [`Quadrilateral`](quadrilateral.md)\* |
| [`moduleSize`](#modulesize) | *int* |
| [`pageNumber`](#pagenumber) | *int* |
| [`reserved`](#reserved) | *char\[64\]* |



### barcodeFormat
Barcode type in BarcodeFormat group 1.
```cpp
BarcodeFormat barcodeFormat
```

### barcodeFormat_2
Barcode type in BarcodeFormat group 2.
```cpp
BarcodeFormat_2 barcodeFormat_2
```

### text
The barcode text, ends by '\0'.
```cpp
const char* text
```

### bytes
The barcode content in a byte array.
```cpp
unsigned char* bytes
```

### bytesLength
The length of the byte array.
```cpp
int bytesLength
```

### location
The location of current recognized text.
```cpp
Quadrilateral location
```

### moduleSize
The barcode module size (the minimum bar width in pixel).
```cpp
int moduleSize
```

### pageNumber
The page number the barcode located in. The index is 0-based.
```cpp
int pageNumber
```

### reserved
Reserved memory for the struct. The length of this array indicates the size of the memory reserved for this struct.
```cpp
char reserved[64]
```
