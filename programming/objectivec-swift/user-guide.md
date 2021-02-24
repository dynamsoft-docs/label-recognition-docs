---
layout: default-layout
title: Dynamsoft Label Recognition - Objective-C & Swift User Guide
description: This is the user guide page of Dynamsoft Label Recognition for iOS SDK.
keywords: a, user guide
needAutoGenerateSidebar: true
---

# Dynamsoft Label Recognition - Objective-C & Swift User Guide

Accurately read alphanumeric characters and standard symbols from images of varying background colour, font, or text size. Additional characters can be trained.

## System Requirements

- Operating systems:
   - macOS 10.11 and above.
   - iOS 9.0 and above. 
- Environment: Xcode 7.1 - 11.5 and above.  

- Recommended: macOS 10.15.4+, Xcode 11.5+, iOS 11+


## Installation

Download the Dynamsoft Label Recognition SDK from the [Dynamsoft website](https://www.dynamsoft.com/label-recognition/downloads) and unzip the package. The trial package includes a free trial license valid for 30 days.   

## Getting Started: HelloWorld

1. Create a new iOS project in Xcode.
2. Add the Dynamsoft Label Recognition framework to your project

   - Unzip the downloaded ZIP file `dlr-ios-1.0.zip` and you'll see `DynamsoftLabelRecognition.framework`.

   - Drag and drop the framework into your Xcode project. Make sure to check Copy items if needed and Create groups to copy the framework into your project's folder.
   
3. Add the required `.tbd/.dylib` file to your project.
   Go to the `Build Phases` tab of your Xcode project, under `Link Binary with Libraries` section, click + button. Search for the file `libc++.tbd`, select it and click Add button. Then the libc++.tbd file will be copied to your project.

4. Import the framework's header.

   Objective-C:

   ```objc
    #import <DynamsoftLabelRecognition/DynamsoftLabelRecognition.h>
   ```

   Swift:
   ```Swift
   import DynamsoftLabelRecognition
   ```   
5. Add code for OCR

   After setting up the basic project, you can now move on to coding.

   The following code demonstrates initializing DynamsoftLabelRecognition and starting the text recognition process.

   Objective-C:

   ```objc
    #import "ViewController.h"
    #import <DynamsoftLabelRecognition/DynamsoftLabelRecognition.h>

    @interface ViewController ()
    @end
    @implementation ViewController

    - (void)viewDidLoad {
        [super viewDidLoad];
        // Do any additional setup after loading the view, typically from a nib.

        DynamsoftLabelRecognition *recognition;
        // Please replace "t0068MgAAAE4Y***kiJWrYg=" with your own license.
        // Request a trial license here: https://www.dynamsoft.com/customer/license/trialLicense
        recognition = [[DynamsoftLabelRecognition alloc] initWithLicense:@"t0068MgAAAE4Y***kiJWrYg="];

        iDLRResult *result;
        NSError __autoreleasing *  error;

        result = [recognizer recognizeByFile:@"your file path" templateName:@"" error:&error];

        for (NSInteger i = 0; i < [results count]; i++) {
            for (iDLRLineResult* lineResult in results[i].lineResults) {
                msgText = [msgText stringByAppendingString:[NSString stringWithFormat:@"\nValue: %@\n",lineResult.text]];
            }
        }

   - (void)didReceiveMemoryWarning {
      // Dispose of any resources that can be recreated.
      [super didReceiveMemoryWarning];
   }

   @end
   ```
   
   