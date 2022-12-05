---
layout: default-layout
title: General - Dynamsoft Label Recognition .Net API Reference
description: This is the general functions of Dynamsoft Label Recognition for .Net API Reference.
keywords: api reference, .Net
needAutoGenerateSidebar: true
---

# .Net API Reference - General

| Method               | Description |
|----------------------|-------------|
| [`GetVersion`](#getversion) | Returns the version number string for the SDK. |


## GetVersion

Get version information of SDK.

```csharp
string Dynamsoft.DLR.LabelRecognition.GetVersion()	
```

**Return Value**

The version information string.

**Code Snippet**

```csharp
LabelRecognition recognizer = new LabelRecognition();
recognizer.InitLicense("t0260NwAAAHV***************");
string versionInfo = recognizer.GetVersion();
recognizer.Dispose();
```
