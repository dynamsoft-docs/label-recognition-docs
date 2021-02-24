---
layout: default-layout
title: Dynamsoft Label Recognition Objective-C & Swift Class - iDLRLineResult
description: This page shows the iDLRLineResult class of Dynamsoft Label Recognition for iOS SDK.
keywords: iDLRLineResult, class, objective-c, oc, swift
needAutoGenerateSidebar: true
---


# iDLRLineResult
Stores the line result.
  

## Attributes
  
| Attribute | Type |
|---------- | ---- |
| [`lineSpecificationName`](#linespecificationname) | *NSString\** |
| [`text`](#text) | *NSString\** |
| [`characterModelName`](#charactermodelname) | *NSString\** |
| [`location`](#location) | [`DLRQuadrilateral`](dlr-quadrilateral.md)\* |
| [`confidence`](#confidence) | *NSInteger* |
| [`characterResults`](#characterresults) | NSArray<[`iDLRCharacterResult`](dlr-character-result.md)\*>\*|


### lineSpecificationName
The name of the line specification used to recognize current line result.
```objc
NSString* lineSpecificationName
```

### text
The recognized text, ends by '\0'.
```objc
NSString* text
```

### characterModelName
The character model used to recognize the text.
```objc
NSString* characterModelName
```

### location
The location of current line.
```objc
iDLRQuadrilateral* location
```


### confidence
The confidence of the result. It ranges from 0 to 100.
```objc
NSInteger confidence
```

### characterResults
The character results array.
```objc
NSArray<iDLRCharacterResult*>* characterResults
```

