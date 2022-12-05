---
layout: default-layout
title: DLR_Result - Dynamsoft Label Recognition .Net Class
description: This page shows the DLR_Result struct of Dynamsoft Label Recognition for .Net Language.
keywords: DLR_Result, struct, .Net
needAutoGenerateSidebar: true
---


# DLR_Result
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
string Dynamsoft.DLR.DLR_Result.ReferenceRegionName
```

### TextAreaName
The name of the text area used to recognize current result.
```csharp
string Dynamsoft.DLR.DLR_Result.TextAreaName
```

### Location
The location of current recognized text.
```csharp
DLR_Quadrilateral Dynamsoft.DLR.DLR_Result.Location
```


### Confidence
The confidence of the result. It ranges from 0 to 100.
```csharp
int Dynamsoft.DLR.DLR_Result.Confidence
```


### LineResults
The line results array.
```csharp
DLR_LineResult[] Dynamsoft.DLR.DLR_Result.LineResults
```

### PageNumber
The page number the result located in. The index is 0-based.
```csharp
int Dynamsoft.DLR.DLR_Result.PageNumber
```
