---
layout: default-layout
title: DLR_Result - Dynamsoft Label Recognizer C & C++ Struct
description: This page shows the DLR_Result struct of Dynamsoft Label Recognizer for C & C++ Language.
keywords: DLR_Result, struct, c, c++
needAutoGenerateSidebar: true
needGenerateH3Content: true
noTitleIndex: true
---


# DLR_Result
Stores the recognized result.

```cpp
typedef struct tagDLR_Result  DLR_Result
typedef struct tagDLR_Result*  PDLR_Result
```  
  

## Attributes
  
| Attribute | Type |
|---------- | ---- |
| [`referenceRegionName`](#referenceregionname) | *const char \** |
| [`textAreaName`](#textareaname) | *const char \** |
| [`location`](#location) | [`Quadrilateral`](quadrilateral.md) |
| [`confidence`](#confidence) | *int* |
| [`lineResultsCount`](#lineresultscount) | *int* |
| [`lineResults`](#lineresults) | [`PDLR_LineResult`](dlr-line-result.md)\* |
| [`pageNumber`](#pagenumber) | *int* |
| [`reserved`](#reserved) | *char\[60\]* |


&nbsp;

### referenceRegionName
The name of the reference region which is used to recognize the current result.
```cpp
const char* referenceRegionName
```

&nbsp;

### textAreaName
The name of the text area used to recognize current result.
```cpp
const char* textAreaName
```

&nbsp;

### location
The location of current recognized text.
```cpp
Quadrilateral location
```


&nbsp;

### confidence
The confidence of the result. It ranges from 0 to 100.
```cpp
int confidence
```


&nbsp;

### lineResultsCount
The line result count.
```cpp
int lineResultsCount
```

&nbsp;

### lineResults
The line results array.
```cpp
PDLR_LineResult* lineResults
```


&nbsp;

### pageNumber
The page number the result located in. The index is 0-based.
```cpp
int pageNumber
```


&nbsp;

### reserved
Reserved memory for the struct. The length of this array indicates the size of the memory reserved for this struct.
```cpp
char reserved[60]
```
