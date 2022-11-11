---
layout: default-layout
title: LicenseVerificationListener of DynamsoftCore for iOS Edition
description: This page shows protocol LicenseVerificationListener of DynamsoftCore for iOS edition.
keywords: api reference, objective-c, oc, swift
needAutoGenerateSidebar: true
needGenerateH3Content: true
noTitleIndex: true
---

# LicenseVerificationListener

`LicenseVerificationListener` is the protocol to handle callback when message is output by license server.

```objc
@protocol LicenseVerificationListener
```

| Method | Description |
| ------ | ----------- |
| `licenseVerificationCallback` | The callback of license server. It contains error message when license verification is failed. |

## licenseVerificationCallback

```objc
-(void)licenseVerificationCallback:(BOOL)isSuccess error:(NSError * _Nullable)error;
```

**Parameters**

`[in] isSuccess` Whether the license verification was successful.  
`[in] error` The error message from license server.

**Code Snippet**

<div class="sample-code-prefix"></div>
>- Objective-C
>- Swift
>
>1. 
```objc
@interface AppDelegate ()<LicenseVerificationListener>
...
- (BOOL)application:(UIApplication *)application didFinishLaunchingWithOptions:(NSDictionary *)launchOptions {
   ...
   [DynamsoftLicenseManager initLicense:@"DLS2eyJvcmdhbml6YXRpb25JRCI6IjIwMDAwMSJ9" verificationDelegate:self];
}
- (void)licenseVerificationCallback:(bool)isSuccess error:(NSError *)error {
   // Add code to do when license server returns.
}
```
2. 
```swift
class AppDelegate: UIResponder, UIApplicationDelegate, LicenseVerificationListener {
   ...
   DynamsoftLicenseManager.initLicense("DLS2eyJvcmdhbml6YXRpb25JRCI6IjIwMDAwMSJ9", verificationDelegate: self)
   ...
   func licenseVerificationCallback(_ isSuccess: Bool, error: Error?) {
          // Add code to do when license server returns.
   }
}
```
