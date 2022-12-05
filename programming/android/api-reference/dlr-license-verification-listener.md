---
layout: default-layout
title: DLRLicenseVerificationListener - Dynamsoft Label Recognizer Android API Reference
description: This page shows the DLRLicenseVerificationListener Interface of Dynamsoft Label Recognizer for Android SDK.
keywords: DLRLicenseVerificationListener, Android
needAutoGenerateSidebar: true
needGenerateH3Content: true
noTitleIndex: true
---


# DLRLicenseVerificationListener

A delegate to handle callback when Dynamsoft License Server returns.

```java
interface com.dynamsoft.dlr.DLRLicenseVerificationListener
```

## Methods

| Method               | Description |
|----------------------|-------------|
| [`DLRLicenseVerificationCallback`](#dlrlicenseverificationcallback) | The callback of Dynamsoft License Server.|

&nbsp;

### DLRLicenseVerificationCallback

The callback of Dynamsoft License Server.

```java
void DLRLicenseVerificationCallback(boolean isSuccess, Exception error);
```

**Parameters**

`isSuccess`: Whether the license verification was successful.  
`error`: The error message from dynamsoft license server.

**Code Snippet**

```java
LabelRecognizer.initLicense("t0260NwAAAHV***************", new DLRLicenseVerificationListener() {
   @Override
   public void DLRLicenseVerificationCallback(boolean b, Exception e) {
      if (!b && e != null) {
         e.printStackTrace();
      }
   }
}
```
