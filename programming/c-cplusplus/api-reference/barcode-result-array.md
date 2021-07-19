---
layout: default-layout
title: Dynamsoft Core C & C++ Struct - BarcodeResultArray
description: This page shows the BarcodeResultArray struct of Dynamsoft Core for C & C++ Language.
keywords: BarcodeResultArray, struct, c, c++
needAutoGenerateSidebar: true
needGenerateH3Content: true
---

# BarcodeResultArray
Stores the BarcodeResult array.  

## Typedefs

```cpp
typedef struct tagBarcodeResultArray  BarcodeResultArray
```  
  
---
  

## Attributes
  
| Attribute | Type |
|---------- | ---- |
| [`results`](#results) | [`PBarcodeResult`](barcoderesult.md)\* |
| [`resultsCount`](#resultscount) | *int* |



### results
The BarcodeResult array.
```cpp
PBarcodeResult* results
```

### resultsCount
The total count of BarcodeResult.
```cpp
int resultsCount
```
