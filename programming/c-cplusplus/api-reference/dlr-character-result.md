---
layout: default-layout
title: DLR_CharacterResult - Dynamsoft Label Recognizer C & C++ Struct
description: This page shows the DLR_CharacterResult struct of Dynamsoft Label Recognizer for C & C++ Language.
keywords: DLR_CharacterResult, struct, c, c++
needAutoGenerateSidebar: true
needGenerateH3Content: true
noTitleIndex: true
---


# DLR_CharacterResult
Stores the character result.

```cpp
typedef struct tagDLR_CharacterResult  DLR_CharacterResult
typedef struct tagDLR_CharacterResult*  PDLR_CharacterResult
```  
  
---
  

## Attributes
  
| Attribute | Type |
|---------- | ---- |
| [`characterH`](#characterh) | *char* |
| [`characterM`](#characterm) | *char* |
| [`characterL`](#characterl) | *char* |
| [`characterHConfidence`](#characterhconfidence) | *int* |
| [`characterMConfidence`](#charactermconfidence) | *int* |
| [`characterLConfidence`](#characterlconfidence) | *int* |
| [`location`](#location) | [`Quadrilateral`](quadrilateral.md)\* |
| [`reserved`](#reserved) | *char\[32\]* |


&nbsp;

### characterH
The recognized character with highest confidence.
```cpp
char characterH
```

&nbsp;

### characterM
The recognized character with middle confidence.
```cpp
char characterM
```

&nbsp;

### characterL
The recognized character with lowest confidence.
```cpp
char characterL
```

&nbsp;

### location
The location of current character.
```cpp
Quadrilateral location
```

&nbsp;

### characterHConfidence
The confidence of the recognized character with the highest confidence.
```cpp
int characterHConfidence
```

&nbsp;

### characterMConfidence
The confidence of the recognized character with the middle confidence.
```cpp
int characterMConfidence
```

&nbsp;

### characterLConfidence
The confidence of the recognized character with the lowest confidence.
```cpp
int characterLConfidence
```

&nbsp;

### reserved
Reserved memory for the struct. The length of this array indicates the size of the memory reserved for this struct.
```cpp
char reserved[32]
```
