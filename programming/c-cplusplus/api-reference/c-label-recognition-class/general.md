---
layout: default-layout
title: General - Dynamsoft Label Recognition C++ API Reference
description: This is the general functions of Dynamsoft Label Recognition for C++ API Reference.
keywords: api reference, cpp
needAutoGenerateSidebar: true
---

# C++ API Reference - General

| Method               | Description |
|----------------------|-------------|
| [`GetErrorString`](#geterrorstring) | Returns the error string. |
| [`GetVersion`](#getversion) | Returns the version number string for the SDK. |


## GetErrorString

Get error message by error code.

```c++
static const char* dynamsoft::dlr::CLabelRecognition::GetErrorString (const int errorCode)	
```   
   
**Parameters**

`[in]	errorCode` The error code.
 

**Return Value**

The error message.

**Code Snippet**

```c++
const char* errorString = GetErrorString(errorCode);
```

&nbsp;

## GetVersion

Get version information of SDK.

```c++
static const char* dynamsoft::dlr::CLabelRecognition::GetVersion ()
```   

**Return Value**
The version information string.

**Code Snippet**

```c++
const char* versionInfo = GetVersion();
```

