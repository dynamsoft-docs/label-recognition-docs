---
layout: default-layout
title: DLRLineResult - Dynamsoft Label Recognition C & C++ Struct
description: This page shows the DLRLineResult struct of Dynamsoft Label Recognition for C & C++ Language.
keywords: DLRLineResult, struct, c, c++
needAutoGenerateSidebar: true
---


# DLRLineResult
Stores the line result.

## Typedefs

```cpp
typedef struct tagDLRLineResult  DLRLineResult
typedef struct tagDLRLineResult*  PDLRLineResult
```  
  
---
  

## Attributes
  
| Attribute | Type |
|---------- | ---- |
| [`lineSpecificationName`](#linespecificationname) | *const char \** |
| [`text`](#text) | *const char \** |
| [`characterModelName`](#charactermodelname) | *const char \** |
| [`location`](#location) | [`DLRQuadrilateral`](dlr-quadrilateral.md)\* |
| [`confidence`](#confidence) | *int* |
| [`characterResultsCount`](#characterresultscount) | *int* |
| [`characterResults`](#characterresults) | [`PDLRCharacterResult`](dlr-character-result.md)\* |
| [`reserved`](#reserved) | *char\[64\]* |


### lineSpecificationName
The name of the line specification used to recognize current line result.
```cpp
const char* tagDLRLineResult::lineSpecificationName
```

### text
The recognized text, ends by '\0'.
```cpp
const char* tagDLRLineResult::text
```

### characterModelName
The character model used to recognize the text.
```cpp
const char* tagDLRLineResult::characterModelName
```

### location
The location of current line.
```cpp
DLRQuadrilateral* tagDLRLineResult::location
```


### confidence
The confidence of the result. It ranges from 0 to 100.
```cpp
int tagDLRLineResult::confidence
```


### characterResultsCount
The character result count.
```cpp
int tagDLRLineResult::characterResultsCount
```

### characterResults
The character results array.
```cpp
PDLRCharacterResult* tagDLRLineResult::characterResults
```

### reserved
Reserved memory for the struct. The length of this array indicates the size of the memory reserved for this struct.
```cpp
char tagDLRLineResult::reserved[64]
```
