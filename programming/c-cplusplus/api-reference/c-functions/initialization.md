---
layout: default-layout
title: Initialization - Dynamsoft Label Recognition C API Reference
description: This is the initialization functions of Dynamsoft Label Recognition for C API Reference.
keywords: api reference, c
needAutoGenerateSidebar: true
---

# C API Reference - Initialization

| Method               | Description |
|----------------------|-------------|
  | [`DLR_CreateInstance`](#dlr_createinstance) | Creates a Dynamsoft Label Recognition instance. |
  | [`DLR_DestroyInstance`](#dlr_destroyinstance) | Destroys an instance of Dynamsoft Label Recognition. |
  | [`DLR_InitLicense`](#dlr_initlicense) | Sets product key and activates the SDK. |
  | [`DLR_InitLTSConnectionParameters`](#dlr_initltsconnectionparameters) | Initializes a DM_LTSConnectionParameters struct with default values. |
  | [`DLR_InitLicenseFromLTS`](#dlr_initlicensefromlts) | Initializes the label recognition license and connects to the specified server for online verification. |

  ---


## DLR_CreateInstance
Create an instance of Dynamsoft Label Recognition.


```c
DLR_API void* DLR_CreateInstance ()	
```   

**Return Value**
Returns an instance of Dynamsoft Label Recognition. If failed, returns NULL.



**Code Snippet**
```c
void* recognizer = DLR_CreateInstance();
DLR_InitLicense(recognizer, "t0260NwAAAHV***************");
DLR_DestroyInstance(recognizer);
```


&nbsp;





## DLR_DestroyInstance
Destroy the instance of Dynamsoft Label Recognition.

```c
DLR_API void DLR_DestroyInstance (void* recognizer)	
```   
   
**Parameters**
`[in]	recognizer` Handle of the Dynamsoft Label Recognition instance.

**Code Snippet**
```c
void* recognizer = DLR_CreateInstance();
DLR_InitLicense(recognizer, "t0260NwAAAHV***************");
DLR_DestroyInstance(recognizer);
```

## DLR_InitLicense
Sets product key and activate the SDK.

```c
DLR_API int DLR_InitLicense (void* recognizer, const char* pLicense)
```   
   
**Parameters**
`[in] recognizer` Handle of the label recognition instance.   
`[in]	pLicense` The product keys.

**Return Value**
Returns error code (returns 0 if the function operates successfully).    
*You can call [`DLR_GetErrorString`](general.md#dlr_geterrorstring) to get detailed error message.*

**Code Snippet**
```c
void* recognizer = DLR_CreateInstance();
DLR_InitLicense(recognizer, "t0260NwAAAHV***************");
DLR_DestroyInstance(recognizer);
```

&nbsp;


## DLR_InitLTSConnectionParameters
Initializes a DM_LTSConnectionParameters struct with default values.

```c
DLR_API int DLR_InitLTSConnectionParameters (DM_LTSConnectionParameters *pLTSConnectionParameters)
```   

**Parameters**
`[in, out] pLTSConnectionParameters` The struct of [`DM_LTSConnectionParameters`]({{ site.c-cplusplus-structs }}dm-lts-connection-parameters.html).   

**Return Value**
Returns error code (returns 0 if the function operates successfully).    
*You can call [`DLR_GetErrorString`](general.md#dlr_geterrorstring) to get detailed error message.*

**Code Snippet**
```c
char errorBuf[512];
DMLTSConnectionParameters paramters;
DLR_InitLTSConnectionParameters(&paramters);
paramters.handshakeCode = "Your handshake code";
DLR_InitLicenseFromLTS(&paramters, errorBuf, 512);
```

&nbsp;

## DLR_InitLicenseFromLTS
Initializes the label recognition license and connects to the specified server for online verification.

```c
DLR_API int DLR_InitLicenseFromLTS(DM_LTSConnectionParameters *pLTSConnectionParameters, char errorMsgBuffer[], const int errorMsgBufferLen)
```   

**Parameters**
`[in] pLTSConnectionParameters` The struct [`DM_LTSConnectionParameters`]({{ site.c-cplusplus-structs }}dm-lts-connection-parameters.html) with customized settings.   
`[in, out] errorMsgBuffer` The buffer is allocated by caller and the recommending length is 256. The error message will be copied to the buffer.  
`[in]	errorMsgBufferLen` The length of allocated buffer.  

**Return Value**
Returns error code (returns 0 if the function operates successfully).    
*You can call [`DLR_GetErrorString`](general.md#dlr_geterrorstring) to get detailed error message.*

**Code Snippet**
```c
char errorBuf[512];
DMLTSConnectionParameters paramters;
DLR_InitLTSConnectionParameters(&paramters);
paramters.handshakeCode = "Your handshake code";
DLR_InitLicenseFromLTS(&paramters, errorBuf, 512);
```

&nbsp;

