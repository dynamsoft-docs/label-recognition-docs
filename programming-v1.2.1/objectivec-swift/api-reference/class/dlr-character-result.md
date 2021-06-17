---
layout: default-layout
title: Dynamsoft Label Recognition Objective-C & Swift Class - iDLRCharacterResult
description: This page shows the DLRCharacterResult class of Dynamsoft Label Recognition for iOS SDK.
keywords: iDLRCharacterResult, objective-c, oc, swift
needAutoGenerateSidebar: true
---


# iDLRCharacterResult
Stores the character result.
  

## Attributes
  
| Attribute | Type |
|---------- | ---- |
| [`characterH`](#characterh) | *NSString \** |
| [`characterM`](#characterm) | *NSString \** |
| [`characterL`](#characterl) | *NSString \** |
| [`location`](#location) | [`iDLRQuadrilateral`](dlr-quadrilateral.md)\* |


### characterH
The recognized character with highest confidence.
```objc
NSString* characterH
```

### characterM
The recognized character with middle confidence.
```objc
NSString* characterM
```

### characterL
The recognized character with lowest confidence.
```objc
NSString* characterL
```

### location
The location of current character.
```objc
iDLRQuadrilateral* location
```
