---
layout: default-layout
title: Dynamsoft Core .Net Class - BarcodeResult
description: This page shows the BarcodeResult Class of Dynamsoft Core for .Net Language.
keywords: BarcodeResult, .Net
needAutoGenerateSidebar: true
needGenerateH3Content: true
noTitleIndex: true
---


# BarcodeResult
Stores the barcode result.

```csharp
class Dynamsoft.Core.BarcodeResult
```

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



&nbsp;

### BarcodeFormat
Barcode type in BarcodeFormat group 1.
```csharp
EnumBarcodeFormat barcodeFormat
```

&nbsp;

### BarcodeFormat_2
Barcode type in BarcodeFormat group 2.
```csharp
EnumBarcodeFormat_2 BarcodeFormat_2
```

&nbsp;

### Text
The barcode text, ends by '\0'.
```csharp
string Text
```

&nbsp;

### Bytes
The barcode content in a byte array.
```csharp
byte[] Bytes
```

&nbsp;

### Location
The location of current recognized barcode.
```csharp
Quadrilateral Location
```

&nbsp;

### ModuleSize
The barcode module size (the minimum bar width in pixel).
```csharp
int ModuleSize
```

&nbsp;

### PageNumber
The page number the barcode located in. The index is 0-based.
```csharp
int PageNumber
```

