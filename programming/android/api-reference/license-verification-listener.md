---
layout: default-layout
title: Interface LicenseVerificationListener - Dynamsoft Core Module Android API Reference
description: This page shows interface LicenseVerificationListener of Dynamsoft Core Module for Android SDK.
keywords: initLicense, LicenseVerificationListener, api reference, android
needAutoGenerateSidebar: true
noTitleIndex: true
pageStartVer: 1.0
---

# LicenseVerificationListener

`LicenseVerificationListener` is the protocol to handle callback when message is output by license server.

```java
interface com.dynamsoft.core.LicenseVerificationListener
```

## Methods

| Method               | Description |
|----------------------|-------------|
| [`LicenseVerificationCallback`](#licenseverificationcallback) | The callback of license server. It contains error message when license verification is failed. |

### LicenseVerificationCallback

Read the license key and activate the SDK.

```java
void licenseVerificationCallback(boolean var1, CoreException var2);
```

**Parameters**

`[in] var1` Whether the license verification was successful.  
`[in out] var2` The error message from license server.

**Code Snippet**

```java
LicenseManager.initLicense("DLS2eyJvcmdhbml6YXRpb25JRCI6IjIwMDAwMSJ9", MainActivity.this, new LicenseVerificationListener() {
   @Override
   public void LicenseVerificationCallback(boolean isSuccess, Exception error) {
      if(!isSuccess){
         error.printStackTrace();
      }
   }
});
```
