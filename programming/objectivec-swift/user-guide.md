---
layout: default-layout
title: Dynamsoft Label Recognizer - Objective-C & Swift User Guide
description: This is the user guide page of Dynamsoft Label Recognizer for iOS SDK.
keywords: iOS, swift, objective-c, user guide
needAutoGenerateSidebar: true
needGenerateH3Content: true
---

# User Guide - iOS

* [Requirements](#requirements)
* [Add the SDK](#add-the-sdk)
* [Build Your First Application](#build-your-first-application)
  * [Create a New Project](#create-a-new-project)
  * [Include the Library](#include-the-library)
  * [Initialize Camera Module](#initialize-the-camera-module)
  * [Initialize Label Recognizer](#initialize-the-label-recognizer)
  * [Start Recognition Process](#start-recognition-process)
  * [Obtain and Display Recognized Result](#obtain-and-display-recognized-results)
  * [Build and Run the Project](#build-and-run-the-project)

## Requirements

* Operating systems:
  * macOS 10.11 and above.
  * iOS 9.0 and above.
* Environment: Xcode 7.1 - 11.5 and above.  
* Recommended: macOS 10.15.4+, Xcode 11.5+, iOS 11+

## Add the SDK

The Dynamsoft Label Recognizer (DLR) Android SDK comes with three modules:

* **DynamsoftLabelRecognizer.frameork**: Main module. Provides APIs to recognize text from image files and camera video.
* **DynamsoftCore.framework**: The core library of Dynamsoft’s capture vision SDKs, including common basic structure and license related APIs.
* **DynamsoftCameraEnhancer.frameork** (Optional): Dynamsoft Camera Enhancer (DCE) module for getting video frames from mobile cameras. Provides APIs for camera control, camera preview, and other advanced features.

There are several ways to add the SDK into your project.

### Add the Library Manually

1. Download the SDK package from the <a href="https://www.dynamsoft.com/survey/dlr/?utm_source=docs" target="_blank">Dynamsoft website</a>. After unzipping, three **framework** files can be found in the **DynamsoftLabelRecognizer\Libs** directory:

   * **DynamsoftLabelRecognizer.frameork**
   * **DynamsoftCore.framework**
   * **DynamsoftCameraEnhancer.frameork**

   > Note:
   > If you want to use Android Camera SDK or your own sdk to control camera, please ignore **DynamsoftCameraEnhancer.frameork** in the following steps.

2. Drag and drop the above **frameworks** into your Xcode project. Make sure to check Copy items if needed and Create groups to copy the framework into your project's folder.
3. Click on the project settings then go to **General –> Frameworks, Libraries, and Embedded Content**. Set the **Embed** field to **Embed & Sign** for **DynamsoftLabelRecognizer** and **DynamsoftCameraEnhancer**.

### Add the Frameworks via CocoaPods

1. Add the frameworks in your **Podfile**, replace `TargetName` with your real target name.

   ```pod
   target 'TargetName' do
   use_frameworks!

   pod 'DynamsoftLabelRecognizer','2.2.20'
   
   # Remove the following line if you want to use iOS AVFoundation framework or your own sdk to control camera.   
   pod 'DynamsoftCameraEnhancer','3.0.1'

   end
   ```

2. Execute the pod command to install the frameworks and generate workspace(**HelloWorld.xcworkspace**):

   ```bash
   pod install
   ```

## Build Your First Application

The following sample will demonstrate how to take a picture and recognize it.

>Note:
>
>* The following steps are completed in XCode 12.2
>* You can download the entire Objective-C source code from [here](https://github.com/Dynamsoft/label-recognizer-mobile-samples/tree/master/ios/HelloWorldObjC)
>* You can download the entire Swift source code from [here](https://github.com/Dynamsoft/label-recognizer-mobile-samples/tree/master/ios/HelloWorldSwift)

### Create a New Project

1. Open XCode and select New Project… in the File > New > New Project… menu to create a new project.

2. Select **iOS -> App** for your application.

3. Input your product name (Helloworld), interface (StoryBoard) and language (Objective-C/Swift)

4. Click on the **Next** button and select the location to save the project.

5. Click on the **Create** button to finish.

### Include the Library

Add the SDK to your new project. Please read [Add the SDK](#add-the-sdk) section for more details.

### Initialize the License

1. Use the `LicenseManager` class and initialize the license in the file **AppDelegate**.

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
      [DynamsoftLabelRecognizer initLicense:@"Put Your License Here" verificationDelegate:self];
   }
   - (void)licenseVerificationCallback:(bool)isSuccess error:(NSError *)error {
      // Add code to execute when license verification is approved or failed.
   }
   ```
   2. 
   ```swift
   class AppDelegate: UIResponder, UIApplicationDelegate, LicenseVerificationListener {
      func application(_ application: UIApplication, didFinishLaunchingWithOptions launchOptions: [UIApplication.LaunchOptionsKey: Any]?) -> Bool {
             DynamsoftLabelRecognizer.initLicense("Put Your License Here",verificationDelegate:self)
      }
      func licenseVerificationCallback(_ isSuccess: Bool, error: Error?) {
             // Add code to execute when license verification is approved or failed.
      }
   }
   ```

   >Note:  
   >  
   >* Network connection is required for the license to work.
   >* The license string here will grant you a time-limited trial license.
   >* If the license has expired, you can go to the <a href="https://www.dynamsoft.com/customer/license/trialLicense?utm_source=docs" target="_blank">customer portal</a> to request for an extension.

### Initialize the Camera Module

1. Go to the file **ViewController**, create the instances of CameraEnhancer and CameraView.

   <div class="sample-code-prefix"></div>
   >- Objective-C
   >- Swift
   >
   >1. 
   ```objc
   @property (nonatomic, strong) DynamsoftCameraEnhancer *cameraEnhancer;
   @property (nonatomic, strong) DCECameraView *dceView;
   - (void)configureDLR {
      self.dceView = [[DCECameraView alloc] initWithFrame:self.view.bounds];
      self.cameraEnhancer = [[DynamsoftCameraEnhancer alloc] initWithView:self.dceView];
      [self.view addSubview:self.dceView];
      [self.cameraEnhancer open];
   }
   ```
   2. 
   ```swift
   class ViewController: BaseViewController{
      var cameraEnhancer: DynamsoftCameraEnhancer!
      var dceView: DCECameraView!
      ...
      func configureDLR() -> Void {
             dceView = DCECameraView.init(frame: self.view.bounds)
             cameraEnhancer = DynamsoftCameraEnhancer.init(view: self.dceView)
             self.view.addSubview(self.dceView)
             cameraEnhancer.open()
      }
   }
   ```

2. Define a scan region for recognition.

   <div class="sample-code-prefix"></div>
   >- Objective-C
   >- Swift
   >
   >1. 
   ```objc
   - (void)configureDLR {
      ...
      iRegionDefinition *region = [[iRegionDefinition alloc] init];
      region.regionLeft = 5;
      region.regionRight = 95;
      region.regionTop = 30;
      region.regionBottom = 50;
      region.regionMeasuredByPercentage = 1;
   }
   ```
   2. 
   ```swift
   func configureDLR() -> Void {
      ...
      let region = iRegionDefinition.init()
      region.regionLeft = 5
      region.regionRight = 95
      region.regionTop = 30
      region.regionBottom = 50
      region.regionMeasuredByPercentage = 1
      try? cameraEnhancer.setScanRegion(region)
   }
   ```

### Initialize the Label Recognizer

1. Create an instance of `DynamsoftLabelRecognizer`, bind it with the instance of `DynamsoftCameraEnhancer`.

   <div class="sample-code-prefix"></div>
   >- Objective-C
   >- Swift
   >
   >1. 
   ```objc
   @property (nonatomic, strong) DynamsoftLabelRecognizer *labelRecognizer;
   - (void)configureDLR {
      self.labelRecognizer = [[DynamsoftLabelRecognizer alloc] init];
      [self.labelRecognizer setImageSource:self.cameraEnhancer];
   }
   ```
   2. 
   ```swift
   class ViewController: BaseViewController{
      var labelRecognizer: DynamsoftLabelRecognizer!
      ...
      func configureDLR() -> Void {
             labelRecognizer = DynamsoftLabelRecognizer.init()
             labelRecognizer.setImageSource(self.cameraEnhancer)
      }
   }
   ```

### Start Recognition Process

1. Setup result callback and start scanning.

   <div class="sample-code-prefix"></div>
   >- Objective-C
   >- Swift
   >
   >1. 
   ```objc
   // Add LabelResultListener to the class.
   @interface ViewController ()<LabelResultListener>
   - (void)configureDLR {
      [self.labelRecognizer setLabelResultListener:self];
      [self.labelRecognizer startScanning];
   }
   - (void)labelResultCallback:(NSInteger)frameId imageData:(iImageData *)imageData results:(NSArray<iDLRResult *> *)results {
      // Add your code to execute on results are received.
   }
   ```
   2. 
   ```swift
   // Add LabelResultListener to the class.
   class ViewController: BaseViewController, LabelResultListener {
      ...
      func configureDLR() -> Void {
             ...
             // Set result listener.
             labelRecognizer.setLabelResultListener(self)
             // Start the label recognition thread.
             labelRecognizer.startScanning()
      }
      func labelResultCallback(_ frameId: Int, imageData: iImageData, results: [iDLRResult]?) {
             // Add your code to execute on results are received.
      }
   }
   ```

    >The variable `data` represents the temporary photo taken by camera app, which will be explained later.

### Obtain And Display Recognized Results

1. You can obtain the label recognition results via `labelResultCallback`. Add code to display the label recognition results on the view.

   <div class="sample-code-prefix"></div>
   >- Objective-C
   >- Swift
   >
   >1. 
   ```objc
   - (void)labelResultCallback:(NSInteger)frameId imageData:(iImageData *)imageData results:(NSArray<iDLRResult *> *)results {
      if (results.count > 0) {
             [self.labelRecognizer stopScanning];
             NSMutableString *msgString = [NSMutableString string];
             int index = 0;
             for (iDLRResult *dlrResult in results) {
                for (iDLRLineResult *lineResult in dlrResult.lineResults) {
                   index++;
                   [msgString appendString:[NSString stringWithFormat:@"Result %d:%@\n", index, lineResult.text]];
                }
             }
             UIAlertController *alertVC = [UIAlertController alertControllerWithTitle:@"Result" message:msgString preferredStyle:UIAlertControllerStyleAlert];
             UIAlertAction *okAction = [UIAlertAction actionWithTitle:@"OK" style:UIAlertActionStyleDefault handler:^(UIAlertAction * _Nonnull action) {
                [self.labelRecognizer startScanning];
             }];
             [alertVC addAction:okAction];
             dispatch_async(dispatch_get_main_queue(), ^{
                [self presentViewController:alertVC animated:YES completion:nil];
             });
      }
   }
   ```
   2. 
   ```swift
   func labelResultCallback(_ frameId: Int, imageData: iImageData, results: [iDLRResult]?) {
      if let results = results {
             guard results.count > 0 else {
                return
             }
             labelRecognizer.stopScanning()
             var msgString = ""
             var index = 0
             for dlrResult in results {
                if let dlrLineResults = dlrResult.lineResults {
                   for lineResult in dlrLineResults {
                      index+=1
                      msgString += String(format: "Result %d:%@\n", index, lineResult.text ?? "")
                   }
                }
             }
             let alertVC = UIAlertController.init(title: "Results", message: msgString, preferredStyle: .alert)
             let okAction = UIAlertAction.init(title: "OK", style: .default) { _ in
                self.labelRecognizer.startScanning()
             }
             alertVC.addAction(okAction)
             DispatchQueue.main.async {
                self.present(alertVC, animated: true, completion: nil)
             }
      }
   }
   ```

   The recognition results of SDK are organized into a four-tier structure:

   * `iDLRResult[]` corresponds to the results of an `image`.
   * `iDLRResult` corresponds to the result of a `TextArea` (also called Label).
   * `iDLRLineResult` corresponds to the result of each `TextLine` in the Label.
   * `iDLRCharacterResult` corresponds to the result of each `Character` in the `TextLine`.

   The structure is shown in the figure below:

   <div align="center">
   <img src="../assets/dlr_result2.png" alt="DLR Result Structure" width="80%"/>
   <p>Figure 1 – DLR Result Structure</p>
   </div>

### Build and Run the Project

1. Select the device that you want to run your app on.
2. Run the project, then your app will be installed on your device.

>Note:
>
>* You can get the source code of the HelloWord app from the following link
>  * <a href="https://github.com/Dynamsoft/label-recognizer-mobile-samples/tree/master/ios/HelloWorldObjC" target="_blank">Objective-C</a>
>  * <a href="https://github.com/Dynamsoft/label-recognizer-mobile-samples/tree/master/ios/HelloWorldSwift" target="_blank">Swift</a>
