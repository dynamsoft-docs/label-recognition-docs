---
layout: default-layout
title: Dynamsoft Label Recognizer .Net Class - DLRCharacterResult
description: This page shows the DLRCharacterResult struct of Dynamsoft Label Recognizer for .Net Language.
keywords: DLRCharacterResult, .Net
needAutoGenerateSidebar: true
needGenerateH3Content: true
noTitleIndex: true
---


# class Dynamsoft.DLR.DLRCharacterResult
Stores the character result.
  

## Attributes
  
| Attribute | Type |
|---------- | ---- |
| [`CharacterH`](#characterh) | *char* |
| [`CharacterM`](#characterm) | *char* |
| [`CharacterL`](#characterl) | *char* |
| [`CharacterHConfidence`](#characterhconfidence) | *int* |
| [`CharacterMConfidence`](#charactermconfidence) | *int* |
| [`CharacterLConfidence`](#characterlconfidence) | *int* |
| [`Location`](#location) | [`Quadrilateral`](quadrilateral.md) |


&nbsp;

### CharacterH
The recognized character with highest confidence.
```csharp
char CharacterH
```

&nbsp;

### CharacterM
The recognized character with middle confidence.
```csharp
char CharacterM
```

&nbsp;

### CharacterL
The recognized character with lowest confidence.
```csharp
char CharacterL
```

&nbsp;

### CharacterHConfidence
The confidence of the recognized character with the highest confidence.
```csharp
int CharacterHConfidence
```

&nbsp;

### CharacterMConfidence
The confidence of the recognized character with the middle confidence.
```csharp
int characterMConfidence
```

&nbsp;

### CharacterLConfidence
The confidence of the recognized character with the lowest confidence.
```csharp
int CharacterLConfidence
```

&nbsp;

### Location
The location of current character.
```csharp
Quadrilateral Location
```
