---
layout: default-layout
title: Dynamsoft Label Recognition Objective-C & Swift API Reference - Initialization
description: This is the initialization functions of Dynamsoft Label Recognition for Objective-C & Swift API Reference.
keywords: api reference, objective-c, oc, swift
needAutoGenerateSidebar: true
---

# Objective-C & Swift API Reference - Initialization

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

### Return value
The instance of DynamsoftLabelRecognition.

### Code Snippet

Objective-C:

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

### Parameters
`[in] license`: The product keys.


### Code Snippet
Objective-C:
```objc
DynamsoftLabelRecognition *recognizer;
recognizer = [[DynamsoftLabelRecognition alloc] initWithLicense:@"t0260NwAAAHV***************"];
```
Swift:
```Swift
let recognizer = DynamsoftLabelRecognition.initWithLicense(license: "t0260NwAAAHV***************")
```

&nbsp;


## initLicenseFromLTS
Initializes the label recognition license and connects to the specified server for online verification.

```objc
- (instancetype _Nonnull)initLicenseFromLTS:(iDMLTSConnectionParameters* _Nullable)ltsConnectionParameters verificationDelegate:(id _Nullable)connectionDelegate;
```   

### Parameters
`[in] ltsConnectionParameters` The struct iDMLTSConnectionParameters with customized settings.  
`[in,out] connectionDelegate` The delegate to handle callback when license server returns.

### Code Snippet
Objective-C:
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
Swift:
```Swift
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

