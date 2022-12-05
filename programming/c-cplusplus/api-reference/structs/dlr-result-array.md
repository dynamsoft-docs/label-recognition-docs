---
layout: default-layout
title: DLRResultArray - Dynamsoft Label Recognition C & C++ Struct
description: This page shows the DLRResultArray struct of Dynamsoft Label Recognition for C & C++ Language.
keywords: DLRResultArray, struct, c, c++
needAutoGenerateSidebar: true
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
