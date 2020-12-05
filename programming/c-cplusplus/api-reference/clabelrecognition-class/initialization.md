---
layout: default-layout
title: Dynamsoft Label Recognition C++ API Reference - Initialization
description: This is the initialization functions of Dynamsoft Label Recognition for C++ API Reference.
keywords: api reference, cpp
needAutoGenerateSidebar: false
---

# C++ API Reference - Initialization

| Method               | Description |
|----------------------|-------------|
  | [`DLR_InitLicense`](#dlr_initlicense) | Sets the license and activates the SDK. |
  ---


## DLR_InitLicense
Description	Sets the license and activates the SDK.

```cpp
int InitLicense (const char *license)
```   

#### Parameters
`[in]	license`	The license key.

#### Return value
Returns error code. Returns 0 if the function completed successfully, otherwise call [`GetErrorString`](general.md#DLR_GetErrorString) to get detailed message. 

Possible returns are:
`DLR_OK`;

#### Code Snippet
```cpp
void* labelRecognizer = DLR_CreateInstance();
DLR_InitLicense(labelRecognizer, "t0260NwAAAHV***************");
DLR_DestroyInstance(labelRecognizer);
```