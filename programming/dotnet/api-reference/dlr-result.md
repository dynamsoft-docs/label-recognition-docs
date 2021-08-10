---
layout: default-layout
title: Dynamsoft Label Recognizer .Net Class - DLRResult
description: This page shows the DLRResult struct of Dynamsoft Label Recognizer for .Net Language.
keywords: DLRResult, struct, .Net
needAutoGenerateSidebar: true
needGenerateH3Content: true
noTitleIndex: true
---


# DLRResult
Stores the recognized result.

```csharp
class Dynamsoft.DLR.DLRResult
```   

## Attributes
  
| Attribute | Type |
|---------- | ---- |
| [`ReferenceRegionName`](#referenceregionname) | *string* |
| [`TextAreaName`](#textareaname) | *string* |
| [`Location`](#location) | [`Quadrilateral`](quadrilateral.md) |
| [`Confidence`](#confidence) | *int* |
| [`LineResults`](#lineresults) | [`DLRLineResult[]`](dlr-line-result.md) |
| [`PageNumber`](#pagenumber) | *int* |


&nbsp;

### ReferenceRegionName
The name of the reference region which is used to recognize the current result.
```csharp
string ReferenceRegionName
```

&nbsp;

### TextAreaName
The name of the text area used to recognize current result.
```csharp
string TextAreaName
```

&nbsp;

### Location
The location of current recognized text.
```csharp
Quadrilateral Location
```


&nbsp;

### Confidence
The confidence of the result. It ranges from 0 to 100.
```csharp
int Confidence
```


&nbsp;

### LineResults
The line results array.
```csharp
DLRLineResult[] LineResults
```

&nbsp;

### PageNumber
The page number the result located in. The index is 0-based.
```csharp
int PageNumber
```
