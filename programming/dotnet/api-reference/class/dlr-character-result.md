---
layout: default-layout
title: DLR_CharacterResult - Dynamsoft Label Recognition .Net Class
description: This page shows the DLR_CharacterResult struct of Dynamsoft Label Recognition for .Net Language.
keywords: DLR_CharacterResult, .Net
needAutoGenerateSidebar: true
---


# DLR_CharacterResult
Stores the character result.
  

## Attributes
  
| Attribute | Type |
|---------- | ---- |
| [`CharacterH`](#characterh) | *char* |
| [`CharacterM`](#characterm) | *char* |
| [`CharacterL`](#characterl) | *char* |
| [`Location`](#location) | [`DLR_Quadrilateral`](dlr-quadrilateral.md) |


### CharacterH
The recognized character with highest confidence.
```csharp
char Dynamsoft.DLR.DLR_CharacterResult.CharacterH
```

### CharacterM
The recognized character with middle confidence.
```csharp
char Dynamsoft.DLR.DLR_CharacterResult.CharacterM
```

### CharacterL
The recognized character with lowest confidence.
```csharp
char Dynamsoft.DLR.DLR_CharacterResult.CharacterL
```

### Location
The location of current character.
```csharp
DLR_Quadrilateral Dynamsoft.DLR.DLR_CharacterResult.Location
```
