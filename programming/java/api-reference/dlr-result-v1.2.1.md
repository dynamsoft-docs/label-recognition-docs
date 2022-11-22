---
layout: default-layout
title: Class DLRResult - Dynamsoft Label Recognizer Java Edition
description: This page shows the DLRResult struct of Dynamsoft Label Recognition for Java Language.
keywords: DLRResult, struct, java
needAutoGenerateSidebar: true
needGenerateH3Content: true
---


# class com.dynamsoft.dlr.DLRResult
Stores the recognized result.

  

## Attributes
  
| Attribute | Type |
|---------- | ---- |
| [`referenceRegionName`](#referenceregionname) | *String* |
| [`textAreaName`](#textareaname) | *String* |
| [`location`](#location) | [`DLRQuadrilateral`](dlr-quadrilateral.md) |
| [`confidence`](#confidence) | *int* |
| [`lineResults`](#lineresults) | [`DLRLineResult[]`](dlr-line-result.md) |
| [`pageNumber`](#pagenumber) | *int* |


### referenceRegionName
The name of the reference region which is used to recognize the current result.

```java
String referenceRegionName
```

### textAreaName
The name of the text area used to recognize current result.

```java
String textAreaName
```

### location
The location of current recognized text.

```java
DLRQuadrilateral location
```


### confidence
The confidence of the result. It ranges from 0 to 100.

```java
int confidence
```


### lineResults
The line results array.

```java
DLRLineResult[] lineResults
```

### pageNumber
The page number the result located in. The index is 0-based.

```java
int pageNumber
```
