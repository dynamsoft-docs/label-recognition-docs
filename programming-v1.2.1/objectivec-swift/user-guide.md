---
layout: default-layout
title: Dynamsoft Label Recognition - Objective-C & Swift User Guide
description: This is the user guide page of Dynamsoft Label Recognition for iOS SDK.
keywords: a, user guide
needAutoGenerateSidebar: true
---

# Dynamsoft Label Recognition - Objective-C & Swift User Guide

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

4. Import the framework's header in the file ViewController.m. For a basic project, most of the operations will be defined there. Should you choose to use the Label Recognition API in another file, please include the import statement there as well.

   Objective-C:

   ```objc
	#import <DynamsoftLabelRecognition/DynamsoftLabelRecognition.h>
   ```

   Swift:

   ```Swift
   import DynamsoftLabelRecognition
   ```   
5. After setting up the basic project, let's now move on to coding.

    The following code demonstrates initializing DynamsoftLabelRecognition and starting the text recognition process. Overall, this piece of code will not do anything as is, but once integrated with an image viewer and a few buttons in the view controller, you can easily set up a simple iOS app that allows the user to OCR any image from their photo gallery. If you are interested in the larger code snippet, please refer to [User Guide Code Snippets](user-guide-code-snippets.md).

    Objective-C:

    ```objc
    #import "ViewController.h"
    #import <DynamsoftLabelRecognition/DynamsoftLabelRecognition.h>

    @interface ViewController ()
    @end
    @implementation ViewController
    
	-(IBAction)readImageDLR:(id)sender
	{
		// First, image needs to be converted to a byte stream in order to generate the iDLRImageData for the recognizeByBuffer method.
		
		CGDataProviderRef provider = CGImageGetDataProvider(_rectLayerImage.image.CGImage);
		NSData* data = (id)CFBridgingRelease(CGDataProviderCopyData(provider));
		NSUInteger bytesPerPixel = 4;
		NSUInteger stride = bytesPerPixel * _rectLayerImage.image.size.width; // bytes per row
		
		// Generating the iDLRImageData object for recognizeByBuffer using the image data
		
		iDLRImageData* DLRdata = [[iDLRImageData alloc] init];
		DLRdata.bytes  = data;
		DLRdata.format = EnumDLRImagePixelFormatARGB8888;
		DLRdata.width  = _rectLayerImage.image.size.width;
		DLRdata.height = _rectLayerImage.image.size.height;
		DLRdata.stride = stride;
		
		/* If you choose to use the recognizeByFile method instead, extract the path of the image that was just loaded in.
		
		NSURL* _imageURL = [info valueForKey:(@"UIImagePickerControllerReferenceURL")]; // this line should be called in the callback function of UIImagePickerController
		NSString *localFilePath = _imageURL.absoluteString;
		NSLog(@"localFilePath: %@",localFilePath); // check that the path is valid via the console */
		
		// Initialize the DLR instance - using initLicense since we are using a trial key.
		
		DynamsoftLabelRecognition *recognizer;
		recognizer = [[DynamsoftLabelRecognition alloc] initWithLicense:@"t0068MgAAAE4Y***kiJWrYg="];
		
		NSError __autoreleasing *  error;
		
		// Get the results using the recognizeByBuffer method
		
		NSArray<iDLRResult*>* results = [recognizer recognizeByBuffer:DLRdata templateName:@"" error:&error];
		
		//If using recognizeByFile instead, it's called as follows
		//result = [recognizer recognizeByFile:localFilePath templateName:@"" error:&error];

		NSString *msgText = @"";

		for (NSInteger i = 0; i < [results count]; i++) {
			for (iDLRLineResult* lineResult in results[i].lineResults) {
				msgText = [msgText stringByAppendingString:[NSString stringWithFormat:@"\nValue: %@\n",lineResult.text]];
			}
		}
		NSLog(@"msgText.%@",msgText); // Printing the DLR result in the debugger console
	}
	
    @end
    ```


	Swift:

	```swift
	import DynamsoftLabelRecognition

	class ViewController {
		
		// MARK: - OCR the photo using DLR

		@IBAction func readImageDLR(_ sender: Any) {
			let provider = rectLayerImage.image.cgImage?.dataProvider
			let data = CFBridgingRelease(provider?.data) as? Data
			let bytesPerPixel = 4
			let stride = bytesPerPixel * rectLayerImage.image.size.width // bytes per row

			let DLRdata = iDLRImageData.init()
			DLRdata?.bytes = data
			DLRdata?.format = EnumDLRImagePixelFormatARGB8888
			DLRdata?.width = rectLayerImage.image.size.width
			DLRdata?.height = rectLayerImage.image.size.height
			DLRdata?.stride = stride

			let recognizer = DynamsoftLabelRecognition.initWithLicense(license: "t0068MgAAAE4Y***kiJWrYg=")

			var error: Error?
			let result = recognizer.recognizeByBuffer(imageData:DLRdata, templateName:"", error:&error)
			var msgText = ""

			for i in 0..<(results?.count ?? 0) {
				if let lineResults = results?[i].lineResults {
					for lineResult in lineResults {
						guard let lineResult = lineResult as? iDLRLineResult else {
							continue
						}
						msgText = msgText + "\nValue: \(lineResult.text)\n"
					}
				}
			}
			print("msgText.\(msgText)") // Printing the DLR result in the debugger console
		}
	}
	```

