---
layout: default-layout
title: Dynamsoft Label Recognizer .Net Class - DLR_Result
description: This page shows the DLR_Result struct of Dynamsoft Label Recognizer for .Net Language.
keywords: DLR_Result, struct, .Net
needAutoGenerateSidebar: true
needGenerateH3Content: true
---


# class Dynamsoft.DLR.DLR_Result
Stores the recognized result.

  

## Attributes
  
| Attribute | Type |
|---------- | ---- |
| [`ReferenceRegionName`](#referenceregionname) | *string* |
| [`TextAreaName`](#textareaname) | *string* |
| [`Location`](#location) | [`DLR_Quadrilateral`](dlr-quadrilateral.md) |
| [`Confidence`](#confidence) | *int* |
| [`LineResults`](#lineresults) | [`DLR_LineResult[]`](dlr-line-result.md) |
| [`PageNumber`](#pagenumber) | *int* |


### ReferenceRegionName
The name of the reference region which is used to recognize the current result.
```csharp
string ReferenceRegionName
```

### TextAreaName
The name of the text area used to recognize current result.
```csharp
string TextAreaName
```

### Location
The location of current recognized text.
```csharp
DLR_Quadrilateral Location
```


### Confidence
The confidence of the result. It ranges from 0 to 100.
```csharp
int Confidence
```


### LineResults
The line results array.
```csharp
DLR_LineResult[] LineResults
```

### PageNumber
The page number the result located in. The index is 0-based.
```csharp
int PageNumber
```
