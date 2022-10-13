---
layout: default-layout
title: Dynamsoft Label Recognition Objective-C & Swift API Reference - General
description: This is the general functions of Dynamsoft Label Recognition for Objective-C & Swift API Reference.
keywords: api reference, objective-c, oc, swift
needAutoGenerateSidebar: true
---

# Objective-C & Swift API Reference - General

| Method               | Description |
|----------------------|-------------|
| [`getVersion`](#getversion) | Returns the version number string for the SDK. |


## getVersion

Get version information of SDK.

```objc
- (NSString*)getVersion;
```

**Return Value**
The version information string.

**Code Snippet**

<div class="sample-code-prefix"></div>
>- Objective-C
>- Swift
>
>1. 
```objc
DynamsoftLabelRecognition *recognizer;
recognizer = [[DynamsoftLabelRecognition alloc] init];
NSString* versionInfo = [recognizer getVersion];
```
2. 
```swift
let recognizer = DynamsoftLabelRecognition.init()
let versionInfo = recognizer.getVersion();
```
