---
layout: default-layout
title: Dynamsoft Label Recognizer - Objective-C & Swift User Guide
description: This is the user guide page of Dynamsoft Label Recognizer for iOS SDK.
keywords: iOS, swift, objective-c, user guide
needAutoGenerateSidebar: true
needGenerateH3Content: true
---

# User Guide - iOS

## Requirements

- Operating systems:
   - macOS 10.11 and above.
   - iOS 9.0 and above. 
- Environment: Xcode 7.1 - 11.5 and above.  

- Recommended: macOS 10.15.4+, Xcode 11.5+, iOS 11+


## Installation

If you don’t have SDK yet, please download the Dynamsoft Label Recognizer(DLR) SDK from the <a href="https://www.dynamsoft.com/label-recognition/downloads/?utm_source=docs" target="_blank">Dynamsoft website</a> and unzip the package. After decompression, the root directory of the DLR installation package is `DynamsoftLabelRecognizer`, which is represented by `[INSTALLATION FOLDER]`.

## Build Your First Application

The following sample will demonstrate how to take a picture and recognize it.
>Note: 
>1.The following steps are completed in XCode 12.2
<!-- >2.You can download the entire source code from [Here]. -->

### Create a New Project 

1. Open XCode and select New Project… in the File > New > New Project… menu to create a new project.

2. Choose the correct template for your project. In this sample, we’ll use `iOS > App`.

3. When prompted, choose your product name (`DLRiOSSample`), Interface (`StoryBoard`), Language (`Swift` or `Objective-C`)

4. Click on the Next button and select the location to save the project.

5. Click on the Create button to finish.

### Include the Library

1. Add the Dynamsoft Label Recognizer framework to your project.
    - Drag and drop the frameworks(`[INSTALLATION FOLDER]\DynamsoftCore.framework` and `[INSTALLATION FOLDER]\DynamsoftLabelRecognizer.framework`) into your Xcode project. Make sure to check `Copy items if needed` and `Create groups` to copy the framework into your project's folder.
    - Click on the project, go to the `General` > `Frameworks, Libraries, and Embedded Content`, set the embed type to `Embed & Sign`.
   
2. Import the framework in the file `ViewController.m`
    
    - Objective-C

    ```objc
    #import <DynamsoftLabelRecognizer/DynamsoftLabelRecognizer.h>
    ```
    - Swift

    ```Swift
    import DynamsoftLabelRecognizer
    ```       

### Initialize the Dynamsoft Label Recognizer

1. Initialize the license connection parameters.

    - Objective-C

    ```objc
    [DynamsoftLabelRecognizer initLicense:@"DLS2eyJvcmdhbml6YXRpb25JRCI6IjIwMDAwMSIsInByb2R1Y3RzIjoyfQ==" verificationDelegate:self];
    ```
    - Swift

    ```swift
    DynamsoftLabelRecognizer.initLicense("DLS2eyJvcmdhbml6YXRpb25JRCI6IjIwMDAwMSIsInByb2R1Y3RzIjoyfQ==",verificationDelegate:self)
    ```       

    >Note:
    >- Network connection is required for the license to work.
    >- "DLS2***" is a default 7-day trial license used in the sample.
    >- If the license has expired, please request a trial license through the <a href="https://www.dynamsoft.com/customer/license/trialLicense?utm_source=docs" target="_blank">customer portal</a>.

2. Create an instance of Dynamsoft Label Recognizer

    - Objective-C

    ```objc
    DynamsoftLabelRecognizer *dlr = [[DynamsoftLabelRecognizer alloc] init];
    ```

    - Swift

    ```swift
    let dlr = DynamsoftLabelRecognition.init()
    ```

### Recognizing and Output Results

1. Recognizing text
    
    - Objective-C

    ```objc
    NSError* error = [[NSError alloc] init];
    NSArray<iDLRResult*>* results = [dlr recognizeByImage:self.imgView.image templateName:@"" error:&error];
    ```

    - Swift

    ```swift
    var error : NSError? = NSError()
    let results = dlr.recognizeByBuffer(image: imgView.image!, templateName: "", error: &error)
    ```

    >The variable `data` represents the temporary photo taken by camera app, which will be explained later.

2. Get and output the recognition results

    - Objective-C

    ```objc
    NSString* msgText = @"";
    
    if (results.count > 0) {
        for (NSInteger i = 0; i < [results count]; i++) {
            for (iDLRLineResult* lineResult in results[i].lineResults) {
                msgText = [msgText stringByAppendingString:[NSString stringWithFormat:@"\nValue: %@\n",lineResult.text]];
            }
        }
    }else{
        msgText = error.code == 0 ? @"No data detected." : error.userInfo[NSUnderlyingErrorKey];
    }
    ```

    - Swift

    ```swift
    var msgText:String = ""
    
    for item in results
    {
        if item.lineResults!.count > 0 {
            for lineResult in item.lineResults! {
                msgText = "\(msgText)\nValue: \(lineResult.text ?? "nil")\n"
            }
        }
    }
    ```

    The recognition results of SDK are organized into a four-tier structure: 
    - `iDLRResult[]` corresponds to the results of an `image`
    - `iDLRResult` corresponds to the result of a `TextArea` (also called Label) 
    - `iDLRLineResult` corresponds to the result of each `TextLine` in the Label
    - `iDLRCharacterResult` corresponds to the result of each `Character` in the `TextLine`

    The structure is shown in the figure below:

    <div align="center">
    <img src="../assets/dlr_result2.png" alt="DLR Result Structure" width="80%"/>
    <p>Figure 1 – DLR Result Structure</p>
    </div> 

### Additional Auxiliary Steps

1. Change the class declaration and add the property `imagePickerController`
    
    - Objective-C

    ```objc
    @interface ViewController : UIViewController <UIImagePickerControllerDelegate, UINavigationControllerDelegate>

    @property (nonatomic) UIImagePickerController *imagePickerController;

    @end
    ```

    - Swift

    ```swift
    class ViewController: UIViewController, UIImagePickerControllerDelegate, UINavigationControllerDelegate {
    
    var imagePickerController : UIImagePickerController?

    }
    ```

2. Click on the `Main.storyboard`, add three controls(one `ImageView` and two `Buttons`) 

3. Select the Assistant Editor and make sure the `ViewController.m` or `ViewController.swift` is visible. 

4. Ctrl and drag from the `ImageView` control to the ViewController class and create the following Outlet.
    - Objective-C

    ```objc
    @property (weak, nonatomic) IBOutlet UIImageView *imgView;
    ```

    - Swift

    ```swift
    @IBOutlet weak var imgView: UIImageView!
    ```

5. Ctrl an drag from the Button(`Take a Photo`) to the ViewController class and create the following Action.
    - Objective-C

    ```objc
    - (IBAction)onTakePhoto:(id)sender {
        UIImagePickerController *imgCtrl = [[UIImagePickerController alloc]init];
        
        imgCtrl.sourceType = UIImagePickerControllerSourceTypeCamera;
        imgCtrl.cameraDevice = UIImagePickerControllerCameraDeviceRear;
        
        imgCtrl.delegate = self;
        
        self.imagePickerController = imgCtrl;
        
        [self presentViewController:imgCtrl animated:YES completion:nil];
    }
    
    - (void)imagePickerController:(UIImagePickerController *) picker
        didFinishPickingMediaWithInfo:(NSDictionary<UIImagePickerControllerInfoKey,id> *) info{
        [picker dismissViewControllerAnimated:YES completion:nil];

        UIImage *img = [info objectForKey:UIImagePickerControllerOriginalImage];
        self.imgView.image = img;
    }
    ```

    - Swift

    ```swift
    @IBAction func onTakePhoto(_ sender: Any) {

        imagePickerController.sourceType = .camera
        imagePickerController.cameraDevice = .rear
        imagePickerController.delegate = self
        
        present(imagePickerController, animated: true, completion: nil)
    }

    func imagePickerController(_ picker: UIImagePickerController, didFinishPickingMediaWithInfo info: [UIImagePickerController.InfoKey : Any]) {
        
        imgView.image = info[UIImagePickerController.InfoKey.originalImage] as? UIImage
        
        self.dismiss(animated: true, completion: nil)
    }
    ```

4. Ctrl an drag from the Button(`Recognize Text`) to the ViewController class and create the following Action.
    - Objective-C

    ```objc
    - (IBAction)onRecognizeText:(id)sender {
        NSString* msgText = @"";

        dispatch_async(dispatch_get_global_queue(0, 0), ^{
            msgText = recognizeText();
        });

        dispatch_async(dispatch_get_main_queue(), ^{
            UIAlertController *alert = [UIAlertController alertControllerWithTitle:@"Results" message:msgText preferredStyle:UIAlertControllerStyleAlert];

            [alert addAction:[UIAlertAction actionWithTitle:@"OK" style:UIAlertActionStyleDefault handler:nil]];
            [self presentViewController:alert animated:YES completion:nil];
        });
    }
    ```

    - Swift

    ```swift
    @IBAction func onRecognizeText(_ sender: Any) {
        var msgText:String = ""

        DispatchQueue.global().async {
            msgText = recognizeText()
        }

        DispatchQueue.main.async {
            let ac = UIAlertController(title: "Results", message: msgText, preferredStyle: .alert)
            ac.addAction(UIAlertAction(title: "Ok", style: .default, handler: nil))
            self.present(ac, animated: true, completion: nil)
        }        
    }
    ```

	>Note: The implementation of the `recognizeText` function has been explained in [Initialize the Dynamsoft Label Recognizer](#initialize-the-dynamsoft-label-recognizer) and [Recognizing and output results](#recognizing-and-output-results).


    <!-- >Note: 
    > - You can download the entire Objective-C source code from [here]()
    > - You can download the entire Swift source code from [here]() -->

### Build and Run the Project

1. Select the device that you want to run your app on.

2. Click `Build and then run the current scheme` button, then XCode installs your app on your connected device and starts it.