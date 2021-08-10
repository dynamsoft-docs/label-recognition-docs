---
layout: default-layout
title: Dynamsoft Label Recognizer Objective-C & Swift Class - iDLRCharacterResult
description: This page shows the DLRCharacterResult class of Dynamsoft Label Recognizer for iOS SDK.
keywords: iDLRCharacterResult, objective-c, oc, swift
needAutoGenerateSidebar: true
needGenerateH3Content: true
noTitleIndex: true
---


# iDLRCharacterResult
Stores the character result.
  
```objc
@interface iDLRCharacterResult : NSObject 
```

## Attributes
  
| Attribute | Type |
|---------- | ---- |
| [`characterH`](#characterh) | *NSString \** |
| [`characterM`](#characterm) | *NSString \** |
| [`characterL`](#characterl) | *NSString \** |
| [`characterHConfidence`](#characterhconfidence) | *NSInteger* |
| [`characterMConfidence`](#charactermconfidence) | *NSInteger* |
| [`characterLConfidence`](#characterlconfidence) | *NSInteger* |
| [`location`](#location) | [`iQuadrilateral`](quadrilateral.md)\* |


&nbsp;

### characterH
The recognized character with highest confidence.
```objc
NSString* characterH
```

&nbsp;

### characterM
The recognized character with middle confidence.
```objc
NSString* characterM
```

&nbsp;

### characterL
The recognized character with lowest confidence.
```objc
NSString* characterL
```


&nbsp;

### characterHConfidence
The confidence of the recognized character with the highest confidence.
```objc
NSInteger characterHConfidence
```

&nbsp;

### characterMConfidence
The confidence of the recognized character with the middle confidence.
```objc
NSInteger characterMConfidence
```

&nbsp;

### characterLConfidence
The confidence of the recognized character with the lowest confidence.
```objc
NSInteger characterLConfidence
```

&nbsp;

### location
The location of current character.
```objc
iQuadrilateral* location
```
