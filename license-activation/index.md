---
layout: default-layout
title: License initialization - Dynamsoft Label Recognizer
description: This is the documentation - License initialization page of Dynamsoft Label Recognizer.
keywords:  Label Recognizer, License initialization
needAutoGenerateSidebar: true
breadcrumbText: License Initialization
---

# License initialization

## Get a trial key

- A free public trial license is available for every new device for first use of Dynamsoft Label Recognizer. The public trial license is the default key used in samples. You can also find the public trial license on the following parts of this page.
- If your free key is expired, please visit <a href="https://www.dynamsoft.com/customer/license/trialLicense?product=dlr&utm_source=docs" target="_blank">Private Trial License Page</a> to get a 30-day trial extension.

## Get a full license

- [Contact us](https://www.dynamsoft.com/company/contact/)  to purchase a full license

## Initialize the license

The following code snippets are using the public trial license to initialize the license. You can replace the public trial license with your own license key.

<div class="sample-code-prefix"></div>
>- JavaScript
>- Java-Android
>- Objective-C
>- Swift
>- C
>- C++
>- C#
>- Java
>
>1. 
```javascript
Dynamsoft.DLR.LabelRecognizer.license = "DLS2eyJvcmdhbml6YXRpb25JRCI6IjIwMDAwNSJ9";
```
2. 
```java
LicenseManager.initLicense("YOUR-LICENSE-KEY", this, (isSuccess, error) -> {
   if (!isSuccess) {
          error.printStackTrace();
   }
});
```
3. 
```objc
[DSLicenseManager initLicense:@"DLS2eyJvcmdhbml6YXRpb25JRCI6IjIwMDAwMSJ9" verificationDelegate:self];
- (void)onLicenseVerified:(BOOL)isSuccess error:(nullable NSError *)error {
    if (!isSuccess && error != nil) {
        NSLog(@"error: %@", error);
    }
}
```
4. 
```swift
LicenseManager.initLicense("DLS2eyJvcmdhbml6YXRpb25JRCI6IjIwMDAwMSJ9", verificationDelegate: self)
func onLicenseVerified(_ isSuccess: Bool, error: Error?) {
   if !isSuccess {
          if let error = error {
             print("\(error.localizedDescription)")
          }
   }
}
```
5. 
```c
char errorMessage[256];
DLR_InitLicense("DLS2eyJvcmdhbml6YXRpb25JRCI6IjIwMDAwNSJ9", errorMessage, 256);
```
6. 
```cpp
char errorMessage[256];
CLicenseManager::InitLicense("DLS2eyJvcmdhbml6YXRpb25JRCI6IjIwMDAwNSJ9", errorMessage, 256);
```   
7. 
```csharp
LabelRecognizer.InitLicense("DLS2eyJvcmdhbml6YXRpb25JRCI6IjIwMDAwNSJ9");
```
8. 
```java
LabelRecognizer.initLicense("DLS2eyJvcmdhbml6YXRpb25JRCI6IjIwMDAwNSJ9");
```

