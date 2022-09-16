---
layout: default-layout
title: DynamsoftLicenseManager class of DynamsoftCore iOS Edition
description: This page shows DynamsoftLicenseManager class of DynamsoftCore for iOS edition.
keywords: initLicense, DynamsoftLicenseManager, api reference, ios
needAutoGenerateSidebar: true
noTitleIndex: true
pageStartVer: 2.2.20
---

# DynamsoftLicenseManager

The DynamsoftLicenseManager class unlocks the Dynamsoft SDK with a purchased full license or a provided trial license to allow you to develop your application.

```objc
@interface DynamsoftLicenseManager
```

## Methods

  | Method               | Description |
  |----------------------|-------------|
  | [`initLicense`](#initlicense) | Read the license key and activate the SDK. |

  ---

### initLicense

Read the license key and activate the SDK.

```objc
+ (void)initLicense:(NSString* _Nonnull)license verificationDelegate:(id _Nullable)connectionDelegate;
```

**Parameters**

`[in] license`: The license key.  
`[in] verificationDelegate`: The listener that handles callback when the license server returns.

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
