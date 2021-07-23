---
layout: default-layout
title: Dynamsoft Label Recognizer C & C++ Struct - DLR_CharacterResult
description: This page shows the DLR_CharacterResult struct of Dynamsoft Label Recognizer for C & C++ Language.
keywords: DLR_CharacterResult, struct, c, c++
needAutoGenerateSidebar: true
needGenerateH3Content: true
noTitleIndex: true
---


# DLR_CharacterResult
Stores the character result.

## Typedefs

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


### characterH
The recognized character with highest confidence.
```cpp
char characterH
```

### characterM
The recognized character with middle confidence.
```cpp
char characterM
```

### characterL
The recognized character with lowest confidence.
```cpp
char characterL
```

### location
The location of current character.
```cpp
Quadrilateral location
```

### characterHConfidence
The confidence of the recognized character with the highest confidence.
```cpp
int characterHConfidence
```

### characterMConfidence
The confidence of the recognized character with the middle confidence.
```cpp
int characterMConfidence
```

### characterLConfidence
The confidence of the recognized character with the lowest confidence.
```cpp
int characterLConfidence
```

### reserved
Reserved memory for the struct. The length of this array indicates the size of the memory reserved for this struct.
```cpp
char reserved[32]
```
