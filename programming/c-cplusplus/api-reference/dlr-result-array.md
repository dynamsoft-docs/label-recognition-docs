---
layout: default-layout
title: Dynamsoft Label Recognizer C & C++ Struct - DLRResultArray
description: This page shows the DLRResultArray struct of Dynamsoft Label Recognizer for C & C++ Language.
keywords: DLRResultArray, struct, c, c++
needAutoGenerateSidebar: true
needGenerateH3Content: true
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
PDLRResult* results
```

### resultsCount
The total count of DLRResult.
```cpp
int resultsCount
```
