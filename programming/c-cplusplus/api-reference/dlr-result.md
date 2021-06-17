---
layout: default-layout
title: Dynamsoft Label Recognizer C & C++ Struct - DLRResult
description: This page shows the DLRResult struct of Dynamsoft Label Recognizer for C & C++ Language.
keywords: DLRResult, struct, c, c++
needAutoGenerateSidebar: true
needGenerateH3Content: true
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
| [`referenceRegionName`](#referenceregionname) | *char \** |
| [`textAreaName`](#textareaname) | *char \** |
| [`location`](#location) | [`DLRQuadrilateral`](dlr-quadrilateral.md) |
| [`confidence`](#confidence) | *int* |
| [`lineResultsCount`](#lineresultscount) | *int* |
| [`lineResults`](#lineresults) | [`PDLRLineResult`](dlr-line-result.md)\* |
| [`pageNumber`](#pagenumber) | *int* |
| [`reserved`](#reserved) | *char\[60\]* |


### referenceRegionName
The name of the reference region which is used to recognize the current result.
```cpp
char* referenceRegionName
```

### textAreaName
The name of the text area used to recognize current result.
```cpp
char* textAreaName
```

### location
The location of current recognized text.
```cpp
DLRQuadrilateral location
```


### confidence
The confidence of the result. It ranges from 0 to 100.
```cpp
int confidence
```


### lineResultsCount
The line result count.
```cpp
int lineResultsCount
```

### lineResults
The line results array.
```cpp
PDLRLineResult* lineResults
```


### pageNumber
The page number the result located in. The index is 0-based.
```cpp
int pageNumber
```


### reserved
Reserved memory for the struct. The length of this array indicates the size of the memory reserved for this struct.
```cpp
char reserved[60]
```
