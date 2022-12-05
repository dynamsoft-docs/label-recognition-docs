---
layout: default-layout
title: LabelResultListener of Dynamsoft Label Recognizer iOS API Reference
description: This page shows protocol LabelResultListener of Dynamsoft Label Recognizer for iOS edition.
keywords: api reference, objective-c, oc, swift
needAutoGenerateSidebar: true
needGenerateH3Content: true
noTitleIndex: true
---

# LabelResultListener

`LabelResultListener` is the protocol to handle callback when label recognition results are output.

```objc
@protocol LabelResultListener
```

| Method | Description |
| ------ | ----------- |
| `labelResultCallback` | If `ImageSource` is correctly configured, the callback is triggered each time when label recognition results are output. |

## labelResultCallback

```objc
- (void)labelResultCallback:(NSInteger)frameId imageData:(iImageData *_Nonnull)imageData results:(NSArray<iDLRResult*>* _Nullable)results;
```

**Parameters**

`[in] frameId` The ID of the frame.  
`[in] imageData` The image data of frame.  
`[in] results` Recognized label results of the frame.

**Code Snippet**

<div class="sample-code-prefix"></div>
>- Objective-C
>- Swift
>
>1. 
```objc
@interface ViewController ()<LabelResultListener>
@property (nonatomic, strong) DynamsoftLabelRecognizer *labelRecognizer;
@property (nonatomic, strong) DynamsoftCameraEnhancer *cameraEnhancer;
@property (nonatomic, strong) DCECameraView *dceView;
- (void)configureDLR {
   // Setup Dynamsoft Camera Enhancer
   self.dceView = [[DCECameraView alloc] initWithFrame:self.view.bounds];
   self.cameraEnhancer = [[DynamsoftCameraEnhancer alloc] initWithView:self.dceView];
   [self.view addSubview:self.dceView];
   // Initialize Dynamsoft Label Recognizer
   recognizer = [[DynamsoftLabelRecognizer alloc] init];
   // Trigger setImageSource
   [self.labelRecognizer setImageSource:self.cameraEnhancer];
   [self.labelRecognizer setLabelResultListener:self];
   [self.cameraEnhancer open];
   [self.labelRecognizer startScanning];
}
- (void)labelResultCallback:(NSInteger)frameId imageData:(iImageData *)imageData results:(NSArray<iDLRResult *> *)results {
   // Add your code to do with label recognition results
}
```
2. 
```swift
class ViewController: BaseViewController, LabelResultListener {
   var labelRecognizer: DynamsoftLabelRecognizer!
   var cameraEnhancer: DynamsoftCameraEnhancer!
   var dceView: DCECameraView!
   func configureDLR() -> Void {
          // Setup Dynamsoft Camera Enhancer
          dceView = DCECameraView.init(frame: self.view.bounds)
          cameraEnhancer = DynamsoftCameraEnhancer.init(view: self.dceView)
          self.view.addSubview(self.dceView)
          // Initialize Dynamsoft Label Recognizer
          let recognizer = DynamsoftLabelRecognizer()
          // Trigger setImageSource
          labelRecognizer.setImageSource(self.cameraEnhancer)
          labelRecognizer.setLabelResultListener(self)
          cameraEnhancer.open()
          labelRecognizer.startScanning()
   }
   func labelResultCallback(_ frameId: Int, imageData: iImageData, results: [iDLRResult]?) {
          // Add your code to do with label recognition results
   }
}
```
