---
layout: default-layout
title: Initialization - Dynamsoft Label Recognition iOS API Reference
description: This is the initialization functions of Dynamsoft Label Recognition for iOS API Reference.
keywords: api reference, objective-c, oc, swift
needAutoGenerateSidebar: true
---

# iOS API Reference - Initialization

| Method               | Description |
|----------------------|-------------|
  | [`init`](#init) | Create an instance of Dynamsoft Label Recognition. |
  | [`initWithLicense`](#initWithLicense) | Sets the license and activates the SDK. |
  | [`initLicenseFromLTS`](#initlicensefromlts) | Initializes the label recognition license and connects to the specified server for online verification. |

  ---

## init

Initializes DynamsoftLabelRecognition.

```objc
- (instancetype _Nonnull)init;
```

**Return Value**
The instance of DynamsoftLabelRecognition.

**Code Snippet**

<div class="sample-code-prefix"></div>
>- Objective-C
>- Swift
>
>1. 
```objc
DynamsoftLabelRecognition *recognizer;
recognizer = [[DynamsoftLabelRecognition alloc] init];
```
Swift:

```Swift
let recognizer = DynamsoftLabelRecognition.init()
```


&nbsp;


## initWithLicense
Sets the license and activates the SDK.

```objc
- (instancetype _Nonnull)initWithLicense:(NSString* _Nonnull)license;
```   

**Parameters**
`[in] license`: The product keys.


**Code Snippet**

<div class="sample-code-prefix"></div>
>- Objective-C
>- Swift
>
>1. 
```objc
DynamsoftLabelRecognition *recognizer;
recognizer = [[DynamsoftLabelRecognition alloc] initWithLicense:@"t0260NwAAAHV***************"];
```
2. 
```swift
let recognizer = DynamsoftLabelRecognition.initWithLicense(license: "t0260NwAAAHV***************")
```

&nbsp;


## initLicenseFromLTS
Initializes the label recognition license and connects to the specified server for online verification.

```objc
- (instancetype _Nonnull)initLicenseFromLTS:(iDMLTSConnectionParameters* _Nullable)ltsConnectionParameters verificationDelegate:(id _Nullable)connectionDelegate;
```   

**Parameters**
`[in] ltsConnectionParameters` The struct iDMLTSConnectionParameters with customized settings.  
`[in,out] connectionDelegate` The delegate to handle callback when license server returns.

**Code Snippet**

<div class="sample-code-prefix"></div>
>- Objective-C
>- Swift
>
>1. 
```objc
DynamsoftLabelRecognition *recognizer;
iDMLTSConnectionParameters* lts = [[iDMLTSConnectionParameters alloc] init];
lts.handshakeCode = @"*****-hs-****";
lts.sessionPassword = @"******";
recognizer = [[DynamsoftLabelRecognition alloc] initLicenseFromLTS:lts verificationDelegate:self];
- (void)LTSLicenseVerificationCallback:(bool)isSuccess error:(NSError * )error
{
    //TODO add your code for license verification
}
```
2. 
```swift
let lts = iDMLTSConnectionParameters()
lts.handshakeCode = "200***001-1000*****"
lts.sessionPassword = "******"
let recognizer = DynamsoftLabelRecognition(licenseFromLTS: lts, verificationDelegate: self)
func ltsLicenseVerificationCallback(_ isSuccess: Bool, error: Error?)
{
    print("isSuccess : \(isSuccess) error : \(String(describing: error))")
}
```

&nbsp;

