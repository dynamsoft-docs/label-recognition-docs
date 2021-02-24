---
layout: default-layout
title: Dynamsoft Label Recognition Android API Reference - Initialization
description: This is the initialization functions of Dynamsoft Label Recognition for Android API Reference.
keywords: api reference, android
needAutoGenerateSidebar: true
---

# Android API Reference - Initialization

| Method               | Description |
|----------------------|-------------|
  | [`LabelRecognition`](#labelrecognition) | Initialization of `LabelRecognition` object.|
  | [`destroy`](#destroy) | Destroys an instance of `LabelRecognition` object.|   
  | [`initLicense`](#initlicense) | Sets product key and activates the SDK. |
  | [`initLicenseFromLTS`](#initlicensefromlts) | Initializes the label recognition license and connects to the specified server for online verification. |

  ---

## LabelRecognition Initialization

Initialization of `LabelRecognition` object without a license.

```java
com.dynamsoft.dlr.LabelRecognition.LabelRecognition() throws LabelRecognitionException
```

Initialization of `LabelRecognition` with a license.

```java
com.dynamsoft.dlr.LabelRecognition.LabelRecognition(String license)	throws Exception
```

### Exceptions

[`LabelRecognitionException`](../class/label-recognition-exception.md)


### Remarks

If you initialize DynamsoftLabelRecognition without a license, the recognition results may be unreliable.

### Code Snippet

```java
LabelRecognition recognizer = new LabelRecognition();
```

```java
LabelRecognition recognizer = new LabelRecognition("t0260NwAAAHV***************");
```

&nbsp;


## Destroy

```java
void com.dynamsoft.dlr.LabelRecognition.destroy()	
```

### Code Snippet

```java
LabelRecognition recognizer = new LabelRecognition("t0260NwAAAHV***************");
recognizer.destroy();
```


## initLicense
Sets product key and activate the SDK.

```java
void com.dynamsoft.dlr.LabelRecognition.initLicense(String license) throws LabelRecognitionException
```   

### Parameters
`license`: The product keys.

### Exceptions

[`LabelRecognitionException`](../class/label-recognition-exception.md)

### Code Snippet
```java
LabelRecognition recognizer = new LabelRecognition();
recognizer.initLicense("t0260NwAAAHV***************");
recognizer.destroy();
```

&nbsp;


## initLicenseFromLTS
Initializes the label recognition license and connects to the specified server for online verification.

```java
void com.dynamsoft.dlr.LabelRecognition.initLicenseFromLTS(DMLTSConnectionParameters ltsInfo, DLRLTSLicenseVerificationListener listener)
```   

### Parameters
- `ltsInfo`: The struct DMLTSConnectionParameters with customized settings.  
- `listener`: The delegate to handle callback when license server returns.

### Code Snippet
```java
LabelRecognition recognizer = new LabelRecognition();
DMLTSConnectionParameters info = new DMLTSConnectionParameters();
info.handShakeCode = "*****-hs-****";
info.sessionPassword = "******";
recognizer.initLicenseFromLTS(info, new DLRLTSLicenseVerificationListener() {
   @Override
   public void LTSLicenseVerificationCallback(boolean b, Exception e) {
      if (!b && e != null) {
         e.printStackTrace();
      }
   }
}
```

&nbsp;

