---
layout: default-layout
title: Dynamsoft Core .Net Class - BarcodeResult
description: This page shows the BarcodeResult Class of Dynamsoft Core for .Net Language.
keywords: BarcodeResult, .Net
needAutoGenerateSidebar: true
needGenerateH3Content: true
---


# class Dynamsoft.Core.BarcodeResult
Stores the barcode result.


## Attributes
  
| Attribute | Type |
|---------- | ---- |
| [`BarcodeFormat`](#barcodeformat) | [`EnumBarcodeFormat`]({{ site.enumerations }}barcode-format.html) |
| [`BarcodeFormat_2`](#barcodeformat_2) | [`EnumBarcodeFormat_2`]({{ site.enumerations }}barcode-format-2.html) |
| [`Text`](#text) | *string* |
| [`Bytes`](#bytes) | *byte[]* |
| [`Location`](#location) | [`Quadrilateral`](quadrilateral.md)\* |
| [`ModuleSize`](#modulesize) | *int* |
| [`PageNumber`](#pagenumber) | *int* |



### BarcodeFormat
Barcode type in BarcodeFormat group 1.
```csharp
EnumBarcodeFormat barcodeFormat
```

### BarcodeFormat_2
Barcode type in BarcodeFormat group 2.
```csharp
EnumBarcodeFormat_2 BarcodeFormat_2
```

### Text
The barcode text, ends by '\0'.
```csharp
string Text
```

### Bytes
The barcode content in a byte array.
```csharp
byte[] Bytes
```

### Location
The location of current recognized barcode.
```csharp
Quadrilateral Location
```

### ModuleSize
The barcode module size (the minimum bar width in pixel).
```csharp
int ModuleSize
```

### PageNumber
The page number the barcode located in. The index is 0-based.
```csharp
int PageNumber
```

