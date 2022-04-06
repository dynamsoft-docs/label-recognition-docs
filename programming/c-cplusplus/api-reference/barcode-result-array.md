---
layout: default-layout
title: Dynamsoft Core C & C++ Struct - BarcodeResultArray
description: This page shows the BarcodeResultArray struct of Dynamsoft Core for C & C++ Language.
keywords: BarcodeResultArray, struct, c, c++
needAutoGenerateSidebar: true
needGenerateH3Content: true
noTitleIndex: true
---

# BarcodeResultArray
Stores the BarcodeResult array.  

```cpp
typedef struct tagBarcodeResultArray  BarcodeResultArray
```  
  
  

## Attributes
  
| Attribute | Type |
|---------- | ---- |
| [`results`](#results) | [`PBarcodeResult`](barcode-result.md)\* |
| [`resultsCount`](#resultscount) | *int* |



&nbsp;

### results
The BarcodeResult array.
```cpp
PBarcodeResult* results
```

&nbsp;

### resultsCount
The total count of BarcodeResult.
```cpp
int resultsCount
```
