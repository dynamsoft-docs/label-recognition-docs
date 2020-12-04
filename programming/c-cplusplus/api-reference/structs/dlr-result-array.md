---
layout: default-layout
title: Dynamsoft Barcode Reader C & C++ Struct - DLRResultArray
description: This page shows the DLRResultArray struct of Dynamsoft Barcode Reader for C & C++ Language.
keywords: DLRResultArray, struct, c, c++
needAutoGenerateSidebar: false
---

# DLRResultArray
Stores the DLRRresult array.  

## Typedefs

```cpp
typedef struct tagDLRResultArray  DLRResultArray
```  
  
---
  

## Attributes
  
| Attribute | Type |
|---------- | ---- |
| [`results`](#results) | [`PDLRResult`](dlr-result.md)\* |
| [`resultsCount`](#resultscount) | *int* |



### results
The DLRResult array.
```cpp
PDLRResult* tagDLRResultArray::results
```

### resultsCount
The total count of DLRResult.
```cpp
int tagDLRResultArray::resultsCount
```
