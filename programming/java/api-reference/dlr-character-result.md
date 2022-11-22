---
layout: default-layout
title: Class DLRCharacterResult - Dynamsoft Label Recognizer Java Edition
description: This page shows the DLRCharacterResult struct of Dynamsoft Label Recognizer for Java Language.
keywords: DLRCharacterResult, java
needAutoGenerateSidebar: true
needGenerateH3Content: true
noTitleIndex: true
---


# DLRCharacterResult
Stores the character result.
  
```java
class com.dynamsoft.dlr.DLRCharacterResult
```

## Attributes
  
| Attribute | Type |
|---------- | ---- |
| [`characterH`](#characterh) | *char* |
| [`characterM`](#characterm) | *char* |
| [`characterL`](#characterl) | *char* |
| [`characterHConfidence`](#characterhconfidence) | *int* |
| [`characterMConfidence`](#charactermconfidence) | *int* |
| [`characterLConfidence`](#characterlconfidence) | *int* |
| [`location`](#location) | [`Quadrilateral`](quadrilateral.md) |


&nbsp;

### characterH
The recognized character with highest confidence.

```java
char characterH
```

&nbsp;

### characterM
The recognized character with middle confidence.

```java
char characterM
```

&nbsp;

### characterL
The recognized character with lowest confidence.

```java
char characterL
```

&nbsp;

### characterHConfidence
The confidence of the recognized character with the highest confidence.

```java
int characterHConfidence
```

&nbsp;

### characterMConfidence
The confidence of the recognized character with the middle confidence.

```java
int characterMConfidence
```

&nbsp;

### characterLConfidence
The confidence of the recognized character with the lowest confidence.

```java
int characterLConfidence
```

&nbsp;

### location
The location of current character.

```java
Quadrilateral location
```
