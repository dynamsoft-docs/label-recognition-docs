---
layout: default-layout
title: Dynamsoft Label Recognizer .Net Class - DLRLineResult
description: This page shows the DLRLineResult struct of Dynamsoft Label Recognizer for .Net Language.
keywords: DLRLineResult, struct, .Net
needAutoGenerateSidebar: true
needGenerateH3Content: true
noTitleIndex: true
---


# class Dynamsoft.DLR.DLRLineResult
Stores the line result.
  

## Attributes
  
| Attribute | Type |
|---------- | ---- |
| [`LineSpecificationName`](#linespecificationname) | *string* |
| [`Text`](#text) | *string* |
| [`CharacterModelName`](#charactermodelname) | *string* |
| [`Location`](#location) | [`Quadrilateral`](quadrilateral.md) |
| [`Confidence`](#confidence) | *int* |
| [`CharacterResults`](#characterresults) | [`DLRCharacterResult[]`](dlr-character-result.md) |


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
Quadrilateral Location
```


### Confidence
The confidence of the result. It ranges from 0 to 100.
```csharp
int Confidence
```

### CharacterResults
The character results array.
```csharp
DLRCharacterResult[] CharacterResults
```

