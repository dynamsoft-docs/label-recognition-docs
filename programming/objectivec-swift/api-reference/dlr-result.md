---
layout: default-layout
title: Dynamsoft Label Recognizer Objective-C & Swift Class - iDLRResult
description: This page shows the iDLRResult class of Dynamsoft Label Recognizer for iOS SDK.
keywords: iDLRResult, class, objective-c, oc, swift
needAutoGenerateSidebar: true
needGenerateH3Content: true
noTitleIndex: true
---


# iDLRResult
Stores the recognized result.

```objc
@interface iDLRResult : NSObject 
```
  

## Attributes
  
| Attribute | Type |
|---------- | ---- |
| [`referenceRegionName`](#referenceregionname) | *NSString\** |
| [`textAreaName`](#textareaname) | *NSString\** |
| [`location`](#location) | [`iQuadrilateral`](quadrilateral.md)\* |
| [`confidence`](#confidence) | *NSInteger* |
| [`lineResults`](#lineresults) | NSArray<[`iDLRLineResult`](dlr-line-result.md)\*>\* |
| [`pageNumber`](#pagenumber) | *NSInteger* |


&nbsp;

### referenceRegionName
The name of the reference region which is used to recognize the current result.
```objc
NSString* referenceRegionName
```

&nbsp;

### textAreaName
The name of the text area used to recognize current result.
```objc
NSString* textAreaName
```

&nbsp;

### location
The location of current recognized text.
```objc
iQuadrilateral* location
```


&nbsp;

### confidence
The confidence of the result. It ranges from 0 to 100.
```objc
NSInteger confidence
```


&nbsp;

### lineResults
The line results array.
```objc
NSArray<iDLRLineResult*>* lineResults
```

&nbsp;

### pageNumber
The page number the result located in. The index is 0-based.
```objc
NSInteger pageNumber
```
