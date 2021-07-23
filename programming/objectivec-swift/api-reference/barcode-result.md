---
layout: default-layout
title: Dynamsoft Core iOS Class - iBarcodeResult
description: This page shows the iBarcodeResult Class of Dynamsoft Core for iOS Language.
keywords: iBarcodeResult, iOS
needAutoGenerateSidebar: true
needGenerateH3Content: true
noTitleIndex: true
---


# iBarcodeResult
Stores the barcode result.

  
## Attributes
  
| Attribute | Type |
|---------- | ---- |
| [`barcodeFormat`](#barcodeformat) | [`EnumBarcodeFormat`]({{ site.enumerations }}barcode-format.html) |
| [`barcodeFormat_2`](#barcodeformat_2) | [`EnumBarcodeFormat_2`]({{ site.enumerations }}barcode-format-2.html) |
| [`text`](#text) | *NSString\** |
| [`bytes`](#bytes) | *NSData\** |
| [`location`](#location) | [`iQuadrilateral`](quadrilateral.md)\* |
| [`moduleSize`](#modulesize) | *int* |
| [`pageNumber`](#pagenumber) | *int* |


### barcodeFormat
Barcode type in BarcodeFormat group 1.
```objc
EnumBarcodeFormat barcodeFormat
```

### barcodeFormat_2
Barcode type in BarcodeFormat group 2.
```objc
EnumBarcodeFormat_2 barcodeFormat_2
```

### text
The barcode text, ends by '\0'.
```objc
NSString* text
```

### bytes
The barcode content in a byte array.
```objc
NSData* bytes
```

### location
The location of current recognized text.
```objc
iQuadrilateral* location
```

### moduleSize
The barcode module size (the minimum bar width in pixel).
```objc
int moduleSize
```

### pageNumber
The page number the barcode located in. The index is 0-based.
```objc
int pageNumber
```