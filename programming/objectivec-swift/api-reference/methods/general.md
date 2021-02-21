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

### Return value
The version information string.

### Code Snippet

```objc
DynamsoftLabelRecognition *recognizer;
recognizer = [[DynamsoftLabelRecognition alloc] initWithLicense:@"t0260NwAAAHV***************"];
NSString* versionInfo = [recognizer getVersion];
```
