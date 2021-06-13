---
layout: default-layout
title: Dynamsoft Label Recognizer Android Class - DLRCharacterResult
description: This page shows the DLRCharacterResult struct of Dynamsoft Label Recognizer for Android Language.
keywords: DLRCharacterResult, android
needAutoGenerateSidebar: true
---


# com.dynamsoft.dlr.DLRCharacterResult
Stores the character result.
  

## Attributes
  
| Attribute | Type |
|---------- | ---- |
| [`characterH`](#characterh) | *char* |
| [`characterM`](#characterm) | *char* |
| [`characterL`](#characterl) | *char* |
| [`characterHConfidence`](#characterhconfidence) | *int* |
| [`characterMConfidence`](#charactermconfidence) | *int* |
| [`characterLConfidence`](#characterlconfidence) | *int* |
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


### characterHConfidence
The confidence of the recognized character with the highest confidence.
```java
int characterHConfidence
```

### characterMConfidence
The confidence of the recognized character with the middle confidence.
```java
int characterMConfidence
```

### characterLConfidence
The confidence of the recognized character with the lowest confidence.
```java
int characterLConfidence
```

### location
The location of current character.
```java
DLRQuadrilateral location
```
