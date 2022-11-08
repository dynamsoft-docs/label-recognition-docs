---
layout: default-layout
title: MRZ Scanner (iOS) Dynamsoft Label Recognizer
description: This is the page of Dynamsoft Label Recognizer iOS MRZ Scanner sample.
keywords: MRZ Scanner, iOS
needAutoGenerateSidebar: true
---

# MRZ Scanner Sample

MRZScanner sample shows you how to develop with Dynamsoft Label Recognizer to create a simple app to scan machine-readable zome (MRZ).

View the samples:

- <a href="https://github.com/Dynamsoft/label-recognizer-mobile-samples/tree/master/ios/Objective-C/MRZScannerObjC" target="_blank">MRZScanner (Objective-C)</a>
- <a href="https://github.com/Dynamsoft/label-recognizer-mobile-samples/tree/master/ios/Swift/MRZScannerSwift" target="_blank">MRZScanner (Swift)</a>

In the MRZScanner sample, we include an additional library **MRZRecognizer.framework**, which is developed from Dynamsoft Label Recognizer. MRZ models or parameters are preset in the library. As a result, you don't need to add additional settings.

The following APIs are available in the MRZScanner sample

- `MRZRecognizer`: The class extended from `DynamsoftLabelRecognizer`.
- `MRZResult`: The class that stores MRZ result information. When using **MRZRecognizer.framework**, you can obtain `MRZResult` as the output of the library instead of `DLRResult`.
- `MRZResultListener`: The listener to handle callbacks when MRZResults are returned.

## How to use MRZRecognizer

### Setup Camera Module

In this sample, we use Dynamsoft Camera Enhancer to set up the camera module and capture video frames.

<div class="sample-code-prefix"></div>
>- Objective-C
>- Swift
>
>1. 
```objc
@property (nonatomic, strong) DynamsoftCameraEnhancer *cameraEnhancer;
@property (nonatomic, strong) DCECameraView *dceView;
...
- (void)configureMRZ {
   self.dceView = [[DCECameraView alloc] initWithFrame:self.view.bounds];
   self.cameraEnhancer = [[DynamsoftCameraEnhancer alloc] initWithView:self.dceView];
   [self.view addSubview:self.dceView];
   [self.cameraEnhancer open];
}
```
2. 
```swift
var cameraEnhancer: DynamsoftCameraEnhancer!
var dceView: DCECameraView!
...
func configureMRZ() -> Void {
   dceView = DCECameraView.init(frame: self.view.bounds)
   cameraEnhancer = DynamsoftCameraEnhancer.init(view: dceView)
   self.view.addSubview(dceView)
   cameraEnhancer.open()
}
```

### Initialize MRZ Recognizer and Bind the Camera Module

Create an instance of `MRZRecognizer`. Use the method `setImageSource` to bind the `MRZRecognizer` and the camera module you created. After that, the instance of `MRZRecognizer` will be able to obtain video frames from the camera continuously.

<div class="sample-code-prefix"></div>
>- Objective-C
>- Swift
>
>1. 
```objc
@property (nonatomic, strong) DynamsoftMRZRecognizer *mrzRecognizer;
...
- (void)configureMRZ {
   self.mrzRecognizer = [[DynamsoftMRZRecognizer alloc] init];
   // Use setImageSource to bind MRZRecognizer with the camera enhancer.
   // You can also implement the interface ImageSource by yourself.
   [self.mrzRecognizer setImageSource:self.cameraEnhancer];
}
```
2. 
```swift
var mrzRecognizer: DynamsoftMRZRecognizer!
...
func configureMRZ() -> Void {
   mrzRecognizer = DynamsoftMRZRecognizer.init()
   // Use setImageSource to bind MRZRecognizer with the camera enhancer.
   // You can also implement the interface ImageSource by yourself.
   mrzRecognizer.setImageSource(cameraEnhancer)
}
```

### Obtain Results

Use `setMRZResultListener` to Register a `MRZResultListener`. Trigger `startScanning`. So that you can obtain the MRZ results from `mrzResultCallback`.

<div class="sample-code-prefix"></div>
>- Objective-C
>- Swift
>
>1. 
```objc
@interface ViewController ()<MRZResultListener>
[self.mrzRecognizer setMRZResultListener:self];
[self.mrzRecognizer startScanning];
- (void)mrzResultCallback:(NSInteger)frameId imageData:(iImageData *)imageData result:(iMRZResult *)result {
   // Implement the mrzResultCallback.
}
```
2. 
```swift
class ViewController: BaseViewController, MRZResultListener {
   func configureMRZ() -> Void {
          mrzRecognizer.setMRZResultListener(self)
          mrzRecognizer.startScanning()
   }
   ...
   func mrzResultCallback(_ frameId: Int, imageData: iImageData, result: iMRZResult?) {
          // Implement the mrzResultCallback.
   }
}
```
