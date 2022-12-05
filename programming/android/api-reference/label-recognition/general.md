---
layout: default-layout
title: General - Dynamsoft Label Recognition Android API Reference
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

**Return Value**

The version information string.

**Code Snippet**

```java
LabelRecognition recognizer = new LabelRecognition();
String versionInfo = recognizer.getVersion();
recognizer.destroy();
```
