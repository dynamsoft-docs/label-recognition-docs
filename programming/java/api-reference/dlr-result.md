---
layout: default-layout
title: Class DLRResult - Dynamsoft Label Recognizer Java Edition
description: This page shows the DLRResult struct of Dynamsoft Label Recognizer for Java Language.
keywords: DLRResult, struct, java
needAutoGenerateSidebar: true
needGenerateH3Content: true
noTitleIndex: true
---


# DLRResult
Stores the recognized result.

```java
class com.dynamsoft.dlr.DLRResult
```  

## Attributes
  
| Attribute | Type |
|---------- | ---- |
| [`referenceRegionName`](#referenceregionname) | *String* |
| [`textAreaName`](#textareaname) | *String* |
| [`location`](#location) | [`Quadrilateral`](quadrilateral.md) |
| [`confidence`](#confidence) | *int* |
| [`lineResults`](#lineresults) | [`DLRLineResult[]`](dlr-line-result.md) |
| [`pageNumber`](#pagenumber) | *int* |


&nbsp;

### referenceRegionName
The name of the reference region which is used to recognize the current result.

```java
String referenceRegionName
```

&nbsp;

### textAreaName
The name of the text area used to recognize current result.

```java
String textAreaName
```

&nbsp;

### location
The location of current recognized text.

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

### lineResults
The line results array.

```java
DLRLineResult[] lineResults
```

&nbsp;

### pageNumber
The page number the result located in. The index is 0-based.

```java
int pageNumber
```
