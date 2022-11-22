---
layout: default-layout
title: Class DLRLineResult - Dynamsoft Label Recognizer Java Edition
description: This page shows the DLRLineResult struct of Dynamsoft Label Recognition for Java Language.
keywords: DLRLineResult, struct, java
needAutoGenerateSidebar: true
needGenerateH3Content: true
---


# class com.dynamsoft.dlr.DLRLineResult
Stores the line result.
  

## Attributes
  
| Attribute | Type |
|---------- | ---- |
| [`lineSpecificationName`](#linespecificationname) | *String* |
| [`text`](#text) | *String* |
| [`characterModelName`](#charactermodelname) | *String* |
| [`location`](#location) | [`DLRQuadrilateral`](dlr-quadrilateral.md) |
| [`confidence`](#confidence) | *int* |
| [`characterResults`](#characterresults) | [`DLRCharacterResult[]`](dlr-character-result.md) |


### lineSpecificationName
The name of the line specification used to recognize current line result.

```java
String lineSpecificationName
```

### text
The recognized text, ends by '\0'.

```java
String text
```

### characterModelName
The character model used to recognize the text.

```java
String characterModelName
```

### location
The location of current line.

```java
DLRQuadrilateral location
```


### confidence
The confidence of the result. It ranges from 0 to 100.

```java
int confidence
```

### characterResults
The character results array.

```java
DLRCharacterResult[] characterResults
```

