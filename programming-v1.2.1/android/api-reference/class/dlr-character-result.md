---
layout: default-layout
title: Dynamsoft Label Recognition Android Class - DLRCharacterResult
description: This page shows the DLRCharacterResult struct of Dynamsoft Label Recognition for Android Language.
keywords: DLRCharacterResult, android
needAutoGenerateSidebar: true
---


# DLRCharacterResult
Stores the character result.
  

## Attributes
  
| Attribute | Type |
|---------- | ---- |
| [`characterH`](#characterh) | *char* |
| [`characterM`](#characterm) | *char* |
| [`characterL`](#characterl) | *char* |
| [`location`](#location) | [`DLRQuadrilateral`](dlr-quadrilateral.md) |


### characterH
The recognized character with highest confidence.
```java
char com.dynamsoft.dlr.DLRCharacterResult.characterH
```

### characterM
The recognized character with middle confidence.
```java
char com.dynamsoft.dlr.DLRCharacterResult.characterM
```

### characterL
The recognized character with lowest confidence.
```java
char com.dynamsoft.dlr.DLRCharacterResult.characterL
```

### location
The location of current character.
```java
DLRQuadrilateral com.dynamsoft.dlr.DLRCharacterResult.location
```
