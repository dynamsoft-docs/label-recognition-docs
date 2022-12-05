---
layout: default-layout
title: DLRCharacterResult - Dynamsoft Label Recognition C & C++ Struct
description: This page shows the DLRCharacterResult struct of Dynamsoft Label Recognition for C & C++ Language.
keywords: DLRCharacterResult, struct, c, c++
needAutoGenerateSidebar: true
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
| [`location`](#location) | [`DLRQuadrilateral`](dlr-quadrilateral.md)\* |
| [`reserved`](#reserved) | *char\[32\]* |


### characterH
The recognized character with highest confidence.
```cpp
char tagDLRCharacterResult::characterH
```

### characterM
The recognized character with middle confidence.
```cpp
char tagDLRCharacterResult::characterM
```

### characterL
The recognized character with lowest confidence.
```cpp
char tagDLRCharacterResult::characterL
```

### location
The location of current character.
```cpp
DLRQuadrilateral* tagDLRCharacterResult::location
```


### reserved
Reserved memory for the struct. The length of this array indicates the size of the memory reserved for this struct.
```cpp
char tagDLRCharacterResult::reserved[32]
```
