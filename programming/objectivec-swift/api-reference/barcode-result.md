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

```objc
@interface iBarcodeResult : NSObject 
```

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


&nbsp;

### barcodeFormat
Barcode type in BarcodeFormat group 1.
```objc
EnumBarcodeFormat barcodeFormat
```

&nbsp;

### barcodeFormat_2
Barcode type in BarcodeFormat group 2.
```objc
EnumBarcodeFormat_2 barcodeFormat_2
```

&nbsp;

### text
The barcode text, ends by '\0'.
```objc
NSString* text
```

&nbsp;

### bytes
The barcode content in a byte array.
```objc
NSData* bytes
```

&nbsp;

### location
The location of current recognized text.
```objc
iQuadrilateral* location
```

&nbsp;

### moduleSize
The barcode module size (the minimum bar width in pixel).
```objc
int moduleSize
```

&nbsp;

### pageNumber
The page number the barcode located in. The index is 0-based.
```objc
int pageNumber
```