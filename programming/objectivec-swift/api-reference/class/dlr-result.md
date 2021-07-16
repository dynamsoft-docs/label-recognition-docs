---
layout: default-layout
title: Dynamsoft Label Recognition Objective-C & Swift Class - iDLRResult
description: This page shows the iDLRResult class of Dynamsoft Label Recognition for iOS SDK.
keywords: iDLRResult, class, objective-c, oc, swift
needAutoGenerateSidebar: true
---


# iDLRResult
Stores the recognized result.

  

## Attributes
  
| Attribute | Type |
|---------- | ---- |
| [`referenceRegionName`](#referenceregionname) | *NSString\** |
| [`textAreaName`](#textareaname) | *NSString\** |
| [`location`](#location) | [`iDLRQuadrilateral`](dlr-quadrilateral.md)\* |
| [`confidence`](#confidence) | *NSInteger* |
| [`lineResults`](#lineresults) | NSArray<[`iDLRLineResult`](dlr-line-result.md)\*>\* |
| [`pageNumber`](#pagenumber) | *NSInteger* |


### referenceRegionName
The name of the reference region which is used to recognize the current result.
```objc
NSString* referenceRegionName
```

### textAreaName
The name of the text area used to recognize current result.
```objc
NSString* textAreaName
```

### location
The location of current recognized text.
```objc
iDLRQuadrilateral* location
```


### confidence
The confidence of the result. It ranges from 0 to 100.
```objc
NSInteger confidence
```


### lineResults
The line results array.
```objc
NSArray<iDLRLineResult*>* lineResults
```

### pageNumber
The page number the result located in. The index is 0-based.
```objc
NSInteger pageNumber
```
