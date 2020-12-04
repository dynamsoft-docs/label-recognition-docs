---
layout: default-layout
title: Dynamsoft Label Recognition C API Reference - Initialization
description: This is the initialization functions of Dynamsoft Label Recognition for C API Reference.
keywords: api reference, c
needAutoGenerateSidebar: false
---

# C API Reference - Initialization

| Method               | Description |
|----------------------|-------------|
  | [`DLR_CreateInstance`](#dlr_createinstance) | Creates a Dynamsoft Label Recognition instance. |
  | [`DLR_DestroyInstance`](#dlr_destroyinstance) | Destroys an instance of Dynamsoft Label Recognition. |
  | [`DLR_InitLicense`](#dlr_initlicense) | Sets the license and activates the SDK. |

  ---


## DLR_CreateInstance
Create an instance of Dynamsoft Label Recognition.


```c
DLR_API void* DLR_CreateInstance ()	
```   

#### Return value
Returns an instance of Dynamsoft Label Recognition. If failed, returns NULL.


#### Remark
Partial of the decoding result will be masked with "\*" without a valid license key.

#### Code Snippet
```c
void* labelRecognizer = DLR_CreateInstance();
DLR_InitLicense(labelRecognizer, "t0260NwAAAHV***************");
DLR_DestroyInstance(labelRecognizer);
```


&nbsp;





## DLR_DestroyInstance
Destroy the instance of Dynamsoft Label Recognition.

```c
DLR_API void DLR_DestroyInstance (void* recognizer)	
```   
   
#### Parameters
`[in]	recognizer` Handle of the Dynamsoft Label Recognition instance.

#### Code Snippet
```c
void* labelRecognizer = DLR_CreateInstance();
DLR_InitLicense(labelRecognizer, "t0260NwAAAHV***************");
DLR_DestroyInstance(labelRecognizer);
```

