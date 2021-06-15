---
layout: default-layout
title: Dynamsoft Label Recognizer C & C++ Struct - DLRCharacterResult
description: This page shows the DLRCharacterResult struct of Dynamsoft Label Recognizer for C & C++ Language.
keywords: DLRCharacterResult, struct, c, c++
needAutoGenerateSidebar: true
needGenerateH3Content: true
---


# DLRCharacterResult
Stores the character result.

## Typedefs

```cpp
typedef struct tagDLRCharacterResult  DLRCharacterResult
typedef struct tagDLRCharacterResult*  PDLRCharacterResult
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
| [`location`](#location) | [`DLRQuadrilateral`](dlr-quadrilateral.md)\* |
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
DLRQuadrilateral* location
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
