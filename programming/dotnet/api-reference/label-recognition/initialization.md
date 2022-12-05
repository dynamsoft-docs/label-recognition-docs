---
layout: default-layout
title: Initialization - Dynamsoft Label Recognition .Net API Reference
description: This is the initialization functions of Dynamsoft Label Recognition for .Net API Reference.
keywords: api reference, .Net
needAutoGenerateSidebar: true
---

# .Net API Reference - Initialization

| Method               | Description |
|----------------------|-------------|
  | [`LabelRecognition`](#labelrecognition) | Initialization of `LabelRecognition` object.|
  | [`Dispose`](#dispose) | Destroys an instance of `LabelRecognition` object.|   
  | [`InitLicense`](#initlicense) | Sets product key and activates the SDK. |
  | [`InitLicenseFromLTS`](#initlicensefromlts) | Initializes the label recognition license and connects to the specified server for online verification. |
  | [`InitLTSConnectionParameters`](#initltsconnectionparameters) | Initializes a DMLTSConnectionParameters struct with default values. |

  ---

## LabelRecognition()

Initialization of `LabelRecognition` object.

```csharp
Dynamsoft.DLR.LabelRecognition.LabelRecognition()
```

**Exceptions**

[`DLR_Exception`](../class/label-recognition-exception.md)


**Code Snippet**
```csharp
LabelRecognition recognizer = new LabelRecognition();
recognizer.InitLicense("t0260NwAAAHV***************");
```

&nbsp;


## Dispose
Destroys an instance of Dynamsoft Label Recognizer.

```csharp
void Dynamsoft.DLR.LabelRecognition.Dispose()	
```

**Code Snippet**

```csharp
LabelRecognition recognizer = new LabelRecognition();
recognizer.InitLicense("t0260NwAAAHV***************");
recognizer.Dispose();
```


## InitLicense
Sets product key and activate the SDK.

```csharp
void Dynamsoft.DLR.LabelRecognition.InitLicense(string license)
```   

**Parameters**
`license`: The product keys.

**Exceptions**

[`DLR_Exception`](../class/label-recognition-exception.md)

**Code Snippet**
```csharp
LabelRecognition recognizer = new LabelRecognition();
recognizer.InitLicense("t0260NwAAAHV***************");
recognizer.Dispose();
```

&nbsp;

## InitLTSConnectionParameters
Initializes a DMLTSConnectionParameters struct with default values.

```csharp
static DMLTSConnectionParameters Dynamsoft.DLR.LabelRecognition.InitLTSConnectionParameters()
```   

**Code Snippet**
```csharp
DMLTSConnectionParameters ltsInfo = LabelRecognition.InitLTSConnectionParameters();
ltsInfo.HandShake = "*****-hs-****";
ltsInfo.SessionPassword = "******";
LabelRecognition.InitLicenseFromLTS(info);
LabelRecognition recognizer = new LabelRecognition();
recognizer.Dispose();
```

&nbsp;


## InitLicenseFromLTS
Initializes the label recognition license and connects to the specified server for online verification.

```csharp
static void Dynamsoft.DLR.LabelRecognition.InitLicenseFromLTS(DMLTSConnectionParameters ltsConnectionParameters)
```   

**Parameters**
- `ltsConnectionParameters`: The struct DMLTSConnectionParameters with customized settings.  

**Exceptions**
[`DLR_Exception`](../class/label-recognition-exception.md)

**Code Snippet**
```csharp
DMLTSConnectionParameters ltsInfo = LabelRecognition.InitLTSConnectionParameters();
info.handShakeCode = "*****-hs-****";
info.sessionPassword = "******";
LabelRecognition.InitLicenseFromLTS(info);
LabelRecognition recognizer = new LabelRecognition();
recognizer.Dispose();
```

&nbsp;

