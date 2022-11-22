---
layout: default-layout
title: Class DLRLineResult - Dynamsoft Label Recognizer Java Edition
description: This page shows the DLRLineResult struct of Dynamsoft Label Recognizer for Java Language.
keywords: DLRLineResult, struct, java
needAutoGenerateSidebar: true
needGenerateH3Content: true
noTitleIndex: true
---


# DLRLineResult
Stores the line result.
  
```java
class com.dynamsoft.dlr.DLRLineResult
```

## Attributes
  
| Attribute | Type |
|---------- | ---- |
| [`lineSpecificationName`](#linespecificationname) | *String* |
| [`text`](#text) | *String* |
| [`characterModelName`](#charactermodelname) | *String* |
| [`location`](#location) | [`Quadrilateral`](quadrilateral.md) |
| [`confidence`](#confidence) | *int* |
| [`characterResults`](#characterresults) | [`DLRCharacterResult[]`](dlr-character-result.md) |


&nbsp;

### lineSpecificationName
The name of the line specification used to recognize current line result.

```java
String lineSpecificationName
```

&nbsp;

### text
The recognized text, ends by '\0'.

```java
String text
```

&nbsp;

### characterModelName
The character model used to recognize the text.

```java
String characterModelName
```

&nbsp;

### location
The location of current line.

```java
Quadrilateral location
```


&nbsp;

### confidence
The confidence of the result. It ranges from 0 to 100.

```java
int confidence
```

&nbsp;

### characterResults
The character results array.

```java
DLRCharacterResult[] characterResults
```

