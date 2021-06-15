---
layout: default-layout
title: Dynamsoft Label Recognizer .Net Class - DLR_LineResult
description: This page shows the DLR_LineResult struct of Dynamsoft Label Recognizer for .Net Language.
keywords: DLR_LineResult, struct, .Net
needAutoGenerateSidebar: true
needGenerateH3Content: true
---


# class Dynamsoft.DLR.DLR_LineResult
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
string LineSpecificationName
```

### Text
The recognized text, ends by '\0'.
```csharp
string Text
```

### CharacterModelName
The character model used to recognize the text.
```csharp
string CharacterModelName
```

### Location
The location of current line.
```csharp
DLR_Quadrilateral Location
```


### Confidence
The confidence of the result. It ranges from 0 to 100.
```csharp
int Confidence
```

### CharacterResults
The character results array.
```csharp
DLR_CharacterResult[] CharacterResults
```

