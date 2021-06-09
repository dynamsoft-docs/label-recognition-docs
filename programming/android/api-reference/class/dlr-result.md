---
layout: default-layout
title: Dynamsoft Label Recognition Android Class - DLRResult
description: This page shows the DLRResult struct of Dynamsoft Label Recognition for Android Language.
keywords: DLRResult, struct, android
needAutoGenerateSidebar: true
---


# DLRResult
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
String com.dynamsoft.dlr.DLRResult.referenceRegionName
```

### textAreaName
The name of the text area used to recognize current result.
```java
String com.dynamsoft.dlr.DLRResult.textAreaName
```

### location
The location of current recognized text.
```java
DLRQuadrilateral com.dynamsoft.dlr.DLRResult.location
```


### confidence
The confidence of the result. It ranges from 0 to 100.
```java
int com.dynamsoft.dlr.DLRResult.confidence
```


### lineResults
The line results array.
```java
DLRLineResult[] com.dynamsoft.dlr.DLRResult.lineResults
```

### pageNumber
The page number the result located in. The index is 0-based.
```java
int com.dynamsoft.dlr.DLRResult.pageNumber
```
