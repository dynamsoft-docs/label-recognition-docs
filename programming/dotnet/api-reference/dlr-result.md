---
layout: default-layout
title: DLR_Result - Dynamsoft Label Recognizer .Net Class
description: This page shows the DLR_Result struct of Dynamsoft Label Recognizer for .Net Language.
keywords: DLR_Result, struct, .Net
needAutoGenerateSidebar: true
needGenerateH3Content: true
noTitleIndex: true
---


# DLR_Result
Stores the recognized result.

```csharp
class Dynamsoft.DLR.DLR_Result
```   

## Attributes
  
| Attribute | Type |
|---------- | ---- |
| [`ReferenceRegionName`](#referenceregionname) | *string* |
| [`TextAreaName`](#textareaname) | *string* |
| [`Location`](#location) | [`Quadrilateral`](quadrilateral.md) |
| [`Confidence`](#confidence) | *int* |
| [`LineResults`](#lineresults) | [`DLR_LineResult[]`](dlr-line-result.md) |
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
DLR_LineResult[] LineResults
```

&nbsp;

### PageNumber
The page number the result located in. The index is 0-based.
```csharp
int PageNumber
```
