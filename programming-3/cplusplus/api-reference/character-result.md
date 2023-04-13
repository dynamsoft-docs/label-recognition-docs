---
layout: default-layout
Title: CCharacterResult - Dynamsoft Label Recognizer Classes
Description: The class CCharacterResult of Dynamsoft Label Recognizer represents the result of a character recognition process.
Keywords: Character result
needGenerateH3Content: true
needAutoGenerateSidebar: true
noTitleIndex: true
breadcrumbText: CCharacterResult
---

# CCharacterResult

The `CCharacterResult` class represents the result of a character recognition process. It contains the characters recognized (high, medium, and low confidence), their respective confidences, and the location of the character in a quadrilateral shape.

```cpp
class dynamsoft::dlr::CCharacterResult
```

## Attributes Summary
  
| Attribute | Type |
|---------- | ---- |
| [`characterH`](#characterh) | *char* |
| [`characterM`](#characterm) | *char* |
| [`characterL`](#characterl) | *char* |
| [`location`](#location) | *CQuadrilateral* |
| [`characterHConfidence`](#characterhconfidence) | *int* |
| [`characterMConfidence`](#charactermconfidence) | *int* |
| [`characterLConfidence`](#characterlconfidence) | *int* |

## Methods Summary

None.

### characterH

The character with high confidence.

```cpp
char characterH
```

### characterM

The character with medium confidence.

```cpp
char characterM
```

### characterL

The character with low confidence.

```cpp
char characterL
```

### location

The location of the character in a quadrilateral shape.

```cpp
CQuadrilateral location
```

### characterHConfidence

The confidence of the character with high confidence.

```cpp
int characterHConfidence
```

### characterMConfidence

The confidence of the character with medium confidence.

```cpp
int characterMConfidence
```

### characterLConfidence

The confidence of the character with low confidence.

```cpp
int characterLConfidence
```
