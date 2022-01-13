---
layout: default-layout
title: Dynamsoft Label Recognizer - License initialization
description: This is the documentation - License initialization page of Dynamsoft Label Recognizer.
keywords:  Label Recognizer, License initialization
needAutoGenerateSidebar: true
breadcrumbText: License Initialization
---

# License initialization

## Get a trial key

- A 7-day public trial key is available for every new device for first use of Dynamsoft Label Recognizer. The public trial key is the default key used in samples. You can also find the public trial key on the following parts of this page.
- If your free key is expired, please visit <a href="https://www.dynamsoft.com/customer/license/trialLicense?product=dlr&utm_source=docs" target="_blank">Private Trial License Page</a> to get a 30-day trial extension.

## Get a full license

- [Contact us](https://www.dynamsoft.com/company/contact/)  to purchase a full license

## Initialize the license

The following code snippets are using the public trial key to initialize the license. You can replace the public trial key with your own license key.

**JavaScript Code Snippet**

```javascript
Dynamsoft.DLR.LabelRecognizer.initLicense("DLS2eyJvcmdhbml6YXRpb25JRCI6IjIwMDAwNSJ9");
```
      
**Android Java Code Snippet**

```java
LabelRecognizer.initLicense("DLS2eyJvcmdhbml6YXRpb25JRCI6IjIwMDAwMSJ9", new DLRLicenseVerificationListener() {
    @Override
    public void DLRLicenseVerificationCallback(boolean b, Exception e) {
        if(!b && e != null){
            e.printStackTrace();
        }
    }
});
```

**iOS Objective-C Code Snippet**

```objc
[DynamsoftLabelRecognizer initLicense:@"DLS2eyJvcmdhbml6YXRpb25JRCI6IjIwMDAwMSJ9" verificationDelegate:self];

- (void)DLRLicenseVerificationCallback:(bool)isSuccess error:(NSError *)error{
    if(!isSuccess && error != nil){
        NSString* msg = error.userInfo[NSUnderlyingErrorKey];
        NSLog(@"%@", msg);
    }
}
```

**iOS Swift Code Snippet**

```swift
DynamsoftLabelRecognizer.initLicense("DLS2eyJvcmdhbml6YXRpb25JRCI6IjIwMDAwMSJ9",verificationDelegate:self)

func dlrLicenseVerificationCallback(_ isSuccess: Bool, error: Error?) {
    if(!isSuccess && error != nil){
        let err = error as NSError?
        let msg = err!.userInfo[NSUnderlyingErrorKey] as? String
        print(msg ?? "")
    }
}
```

**Java Code Snippet**

```java
LabelRecognizer.initLicense("DLS2eyJvcmdhbml6YXRpb25JRCI6IjIwMDAwNSJ9");
```
    
**C# Code Snippet**

```csharp
LabelRecognizer.InitLicense("DLS2eyJvcmdhbml6YXRpb25JRCI6IjIwMDAwNSJ9");
```
    
**C Code Snippet**

```c
char errorMessage[256];
DLR_InitLicense("DLS2eyJvcmdhbml6YXRpb25JRCI6IjIwMDAwNSJ9", errorMessage, 256);
```

**C++ Code Snippet**

```cpp
char errorMessage[256];
CLabelRecognizer::InitLicense("DLS2eyJvcmdhbml6YXRpb25JRCI6IjIwMDAwNSJ9", errorMessage, 256);
```


