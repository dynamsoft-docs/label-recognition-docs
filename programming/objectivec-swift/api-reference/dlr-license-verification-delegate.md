---
layout: default-layout
title: DLRLicenseVerificationDelegate - Dynamsoft Label Recognizer iOS API Reference
description: This page shows DLRLicenseVerificationDelegate of Dynamsoft Label Recognizer for iOS API Reference.
keywords: api reference, objective-c, oc, swift
needAutoGenerateSidebar: true
needGenerateH3Content: true
noTitleIndex: true
---

# DLRLicenseVerificationDelegate

A delegate to handle callback when Dynamsoft License Server returns.

```objc
@protocol DLRLicenseVerificationDelegate <NSObject>
```

## Methods
  
| Method               | Description |
|----------------------|-------------|
| [`DLRLicenseVerificationCallback`](#dlrlicenseverificationcallback) | The callback of Dynamsoft License Server.|

&nbsp;

### DLRLicenseVerificationCallback

Initializes the label Recognizer license.

```objc
- (void)DLRLicenseVerificationCallback:(bool)isSuccess error:(NSError * _Nullable)error;
```

**Parameters**

- `[in] isSuccess`: Whether the license verification was successful.
- `[in,out] error`: The error message from dynamsoft license server.

**Code Snippet**

<div class="sample-code-prefix"></div>
>- Objective-C
>- Swift
>
>1. 
```objc
[DynamsoftLabelRecognizer initLicense:@"t0260NwAAAHV***************" verificationDelegate:self];

- (void)DLRLicenseVerificationCallback:(bool)isSuccess error:(NSError * )error
{
    //TODO: add your code for license verification
}
```
2. 
```swift
DynamsoftLabelRecognizer.initLicense(license:"t0260NwAAAHV***************", verificationDelegate: self)

func DLRLicenseVerificationCallback(_ isSuccess: Bool, error: Error?)
{
    //TODO: add your code for license verification
}
```
