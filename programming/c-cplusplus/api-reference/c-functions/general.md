---
layout: default-layout
title: General - Dynamsoft Label Recognition C API Reference
description: This is the general functions of Dynamsoft Label Recognition for C API Reference.
keywords: api reference, c
needAutoGenerateSidebar: true
---

# C API Reference - General

| Method               | Description |
|----------------------|-------------|
| [`DLR_GetErrorString`](#dlr_geterrorstring) | Returns the error string. |
| [`DLR_GetVersion`](#dlr_getversion) | Returns the version number string for the SDK. |


## DLR_GetErrorString

Get error message by error code.

```c
DLR_API const char* DLR_GetErrorString (int errorCode)	
```   
   
**Parameters**

`[in]	errorCode` The error code.
 

**Return Value**

The error message.

**Code Snippet**

```c
const char* errorString = DLR_GetErrorString(errorCode);
```

&nbsp;

## DLR_GetVersion

Get version information of SDK.

```c
DLR_API const char* DLR_GetVersion ()
```   

**Return Value**
The version information string.

**Code Snippet**

```c
const char* versionInfo = DLR_GetVersion();
```

