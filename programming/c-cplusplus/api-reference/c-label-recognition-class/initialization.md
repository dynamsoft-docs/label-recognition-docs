---
layout: default-layout
title: Initialization - Dynamsoft Label Recognition C++ API Reference
description: This is the initialization functions of Dynamsoft Label Recognition for C++ API Reference.
keywords: api reference, cpp
needAutoGenerateSidebar: true
---

# C++ API Reference - Initialization

| Method               | Description |
|----------------------|-------------|
  | [`InitLicense`](#initlicense) | Sets product key and activates the SDK. |
  | [`InitLTSConnectionParameters`](#initltsconnectionparameters) | Initializes a DM_LTSConnectionParameters struct with default values. |
  | [`InitLicenseFromLTS`](#initlicensefromlts) | Initializes the label recognition license and connects to the specified server for online verification. |

  ---


## InitLicense
Sets product key and activate the SDK.

```cpp
int InitLicense (const char *license)
```   

**Parameters**
`[in]	license`	The product key.

**Return Value**
Returns error code. Returns 0 if the function completed successfully, otherwise call [`GetErrorString`](general.md#geterrorstring) to get detailed message. 

Possible returns are:
`DLR_OK`;

**Code Snippet**
```cpp
CLabelRecognition* recognizer = new CLabelRecognition();
recognizer->InitLicense("t0260NwAAAHV***************");
delete recognizer;
```

## InitLTSConnectionParameters
Initializes a DM_LTSConnectionParameters struct with default values.

```cpp
static int dynamsoft::dlr::CLabelRecognition::InitLTSConnectionParameters (DM_LTSConnectionParameters *pLTSConnectionParameters)
```   

**Parameters**
`[in, out] pLTSConnectionParameters` The struct of [`DM_LTSConnectionParameters`]({{ site.c-cplusplus-structs }}dm-lts-connection-parameters.html).   

**Return Value**
Returns error code (returns 0 if the function operates successfully).    
*You can call [`GetErrorString`](general.md#geterrorstring) to get detailed error message.*

**Code Snippet**
```cpp
char errorBuf[512];
DMLTSConnectionParameters paramters;
InitLTSConnectionParameters(&paramters);
paramters.handshakeCode = "Your handshake code";
InitLicenseFromLTS(&paramters, errorBuf, 512);
```

&nbsp;

## InitLicenseFromLTS
Initializes the label recognition license and connects to the specified server for online verification.

```cpp
static int dynamsoft::dlr::CLabelRecognition::InitLicenseFromLTS(DM_LTSConnectionParameters *pLTSConnectionParameters, char errorMsgBuffer[], const int errorMsgBufferLen)
```   

**Parameters**
`[in] pLTSConnectionParameters` The struct [`DM_LTSConnectionParameters`]({{ site.c-cplusplus-structs }}dm-lts-connection-parameters.html) with customized settings.   
`[in, out] errorMsgBuffer` The buffer is allocated by caller and the recommending length is 256. The error message will be copied to the buffer.  
`[in]	errorMsgBufferLen` The length of allocated buffer.  

**Return Value**
Returns error code (returns 0 if the function operates successfully).    
*You can call [`GetErrorString`](general.md#geterrorstring) to get detailed error message.*

**Code Snippet**
```cpp
char errorBuf[512];
DMLTSConnectionParameters paramters;
InitLTSConnectionParameters(&paramters);
paramters.handshakeCode = "Your handshake code";
InitLicenseFromLTS(&paramters, errorBuf, 512);
```

&nbsp;

