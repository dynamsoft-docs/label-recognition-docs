---
layout: default-layout
title: DLR_LineResult - Dynamsoft Label Recognizer C & C++ Struct
description: This page shows the DLR_LineResult struct of Dynamsoft Label Recognizer for C & C++ Language.
keywords: DLR_LineResult, struct, c, c++
needAutoGenerateSidebar: true
needGenerateH3Content: true
noTitleIndex: true
---


# DLR_LineResult
Stores the line result.

```cpp
typedef struct tagDLR_LineResult  DLR_LineResult
typedef struct tagDLR_LineResult*  PDLR_LineResult
```  

  

## Attributes
  
| Attribute | Type |
|---------- | ---- |
| [`lineSpecificationName`](#linespecificationname) | *const char \** |
| [`text`](#text) | *const char \** |
| [`characterModelName`](#charactermodelname) | *const char \** |
| [`location`](#location) | [`Quadrilateral`](quadrilateral.md)\* |
| [`confidence`](#confidence) | *int* |
| [`characterResultsCount`](#characterresultscount) | *int* |
| [`characterResults`](#characterresults) | [`PDLR_CharacterResult`](dlr-character-result.md)\* |
| [`reserved`](#reserved) | *char\[64\]* |


&nbsp;

### lineSpecificationName
The name of the line specification used to recognize current line result.
```cpp
const char* lineSpecificationName
```

&nbsp;

### text
The recognized text, ends by '\0'.
```cpp
const char* text
```

&nbsp;

### characterModelName
The character model used to recognize the text.
```cpp
const char* characterModelName
```

&nbsp;

### location
The location of current line.
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

### characterResultsCount
The character result count.
```cpp
int characterResultsCount
```

&nbsp;

### characterResults
The character results array.
```cpp
PDLR_CharacterResult* characterResults
```

&nbsp;

### reserved
Reserved memory for the struct. The length of this array indicates the size of the memory reserved for this struct.
```cpp
char reserved[64]
```
