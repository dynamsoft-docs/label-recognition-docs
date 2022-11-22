---
layout: default-layout
title: Class DLRCharacterResult - Dynamsoft Label Recognizer Java Edition
description: This page shows the DLRCharacterResult struct of Dynamsoft Label Recognition for Java Language.
keywords: DLRCharacterResult, java
needAutoGenerateSidebar: true
needGenerateH3Content: true
---


# class com.dynamsoft.dlr.DLRCharacterResult
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
char characterH
```

### characterM
The recognized character with middle confidence.

```java
char characterM
```

### characterL
The recognized character with lowest confidence.

```java
char characterL
```

### location
The location of current character.

```java
DLRQuadrilateral location
```
