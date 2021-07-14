---
layout: default-layout
title: Dynamsoft Label Recognition Android API Reference - General
description: This is the general functions of Dynamsoft Label Recognition for Android API Reference.
keywords: api reference, android
needAutoGenerateSidebar: true
---

# Android API Reference - General

| Method               | Description |
|----------------------|-------------|
| [`getVersion`](#getversion) | Returns the version number string for the SDK. |


## getVersion

Get version information of SDK.

```java
String com.dynamsoft.dlr.LabelRecognition.getVersion()	
```

### Return value

The version information string.

### Code Snippet

```java
LabelRecognition recognizer = new LabelRecognition();
String versionInfo = recognizer.getVersion();
recognizer.destroy();
```
