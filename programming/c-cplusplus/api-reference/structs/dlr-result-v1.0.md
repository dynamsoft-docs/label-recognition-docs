---
layout: default-layout
title: DLRResult - Dynamsoft Label Recognition C & C++ Struct
description: This page shows the DLRResult struct of Dynamsoft Label Recognition for C & C++ Language.
keywords: DLRResult, struct, c, c++
needAutoGenerateSidebar: true
---


# DLRResult
Stores the recognized result.

## Typedefs

```cpp
typedef struct tagDLRResult  DLRResult
typedef struct tagDLRResult*  PDLRResult
```  
  
---
  

## Attributes
  
| Attribute | Type |
|---------- | ---- |
| [`referenceRegionName`](#referenceregionname) | *const char \** |
| [`textAreaName`](#textareaname) | *const char \** |
| [`location`](#location) | [`DLRQuadrilateral`](dlr-quadrilateral.md)\* |
| [`confidence`](#confidence) | *int* |
| [`lineResultsCount`](#lineresultscount) | *int* |
| [`lineResults`](#lineresults) | [`PDLRLineResult`](dlr-line-result.md)\* |
| [`reserved`](#reserved) | *char\[64\]* |


### referenceRegionName
The name of the reference region which is used to recognize the current result.
```cpp
const char* tagDLRResult::referenceRegionName
```

### textAreaName
The name of the text area used to recognize current result.
```cpp
const char* tagDLRResult::textAreaName
```

### location
The location of current recognized text.
```cpp
DLRQuadrilateral* tagDLRResult::location
```


### confidence
The confidence of the result. It ranges from 0 to 100.
```cpp
int tagDLRResult::confidence
```


### lineResultsCount
The line result count.
```cpp
int tagDLRResult::lineResultsCount
```

### lineResults
The line results array.
```cpp
PDLRLineResult* tagDLRResult::lineResults
```

### reserved
Reserved memory for the struct. The length of this array indicates the size of the memory reserved for this struct.
```cpp
char tagDLRResult::reserved[64]
```
