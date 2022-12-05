---
layout: default-layout
title: DLR_LineResult - Dynamsoft Label Recognition .Net Class
description: This page shows the DLR_LineResult struct of Dynamsoft Label Recognition for .Net Language.
keywords: DLR_LineResult, struct, .Net
needAutoGenerateSidebar: true
---


# DLR_LineResult
Stores the line result.
  

## Attributes
  
| Attribute | Type |
|---------- | ---- |
| [`LineSpecificationName`](#linespecificationname) | *string* |
| [`Text`](#text) | *string* |
| [`CharacterModelName`](#charactermodelname) | *string* |
| [`Location`](#location) | [`DLR_Quadrilateral`](dlr-quadrilateral.md) |
| [`Confidence`](#confidence) | *int* |
| [`CharacterResults`](#characterresults) | [`DLR_CharacterResult[]`](dlr-character-result.md) |


### LineSpecificationName
The name of the line specification used to recognize current line result.
```csharp
string Dynamsoft.DLR.DLR_LineResult.LineSpecificationName
```

### Text
The recognized text, ends by '\0'.
```csharp
string Dynamsoft.DLR.DLR_LineResult.Text
```

### CharacterModelName
The character model used to recognize the text.
```csharp
string Dynamsoft.DLR.DLR_LineResult.CharacterModelName
```

### Location
The location of current line.
```csharp
DLR_Quadrilateral Dynamsoft.DLR.DLR_LineResult.Location
```


### Confidence
The confidence of the result. It ranges from 0 to 100.
```csharp
int Dynamsoft.DLR.DLR_LineResult.Confidence
```

### CharacterResults
The character results array.
```csharp
DLR_CharacterResult[] Dynamsoft.DLR.DLR_LineResult.CharacterResults
```

