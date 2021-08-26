---
layout: default-layout
title: Dynamsoft Label Recognizer - Objective-C & Swift User Guide
description: This is a supplement to the user guide page of Dynamsoft Label Recognizer for iOS SDK.
keywords: a, user guide supplement
needAutoGenerateSidebar: true
---

#  Dynamsoft Label Recognizer - Objective-C & Swift User Guide Code Snippets

## Load Photo from Photo Gallery and OCR
The following code snippet showcases a simple application that contains three main components: an image viewer, a button to load a photo from the photo gallery, and another button to OCR the photo.

Objective-C

```objc
#import "ViewController.h"
#import <DynamsoftLabelRecognizer/DynamsoftLabelRecognizer.h>
#import <UIKit/UIKit.h>

@interface ViewController ()
@property (nonatomic, strong) IBOutlet UIImageView *rectLayerImage;
@property (nonatomic, strong) UIButton *openGalleryButton;
@property (nonatomic, strong) UIButton *readDLRButton;
@end

@implementation ViewController

#pragma mark - Open up Photo Gallery
/* Uses the UIImagePickerController library to display the photo gallery*/
-(IBAction)showLibraryAction:(id)sender
{
	UIImagePickerController *imagePickController=[[UIImagePickerController alloc]init];
	imagePickController.sourceType=UIImagePickerControllerSourceTypePhotoLibrary;
	imagePickController.delegate=self;
	imagePickController.allowsEditing=FALSE;
	[self presentViewController:imagePickController animated:YES completion:nil];
}

#pragma mark - OCR the photo using DLR
-(IBAction)readImageDLR:(id)sender
{
	/* First, image needs to be converted to a byte stream in order to generate the iDLRImageData for the recognizeByBuffer method. */
	CGDataProviderRef provider = CGImageGetDataProvider(_rectLayerImage.image.CGImage);
	NSData* data = (id)CFBridgingRelease(CGDataProviderCopyData(provider));
	NSUInteger bytesPerPixel = 4;
	NSUInteger stride = bytesPerPixel * _rectLayerImage.image.size.width; // bytes per row
	
	// Generating the iDLRImageData object using the image data
	iDLRImageData* DLRdata = [[iDLRImageData alloc] init];
	DLRdata.bytes  = data;
	DLRdata.format = EnumDLRImagePixelFormatARGB8888;
	DLRdata.width  = _rectLayerImage.image.size.width;
	DLRdata.height = _rectLayerImage.image.size.height;
	DLRdata.stride = stride;
	/*NSString *localFilePath = _imageURL.absoluteString;
	NSLog(@"localFilePath: %@",localFilePath); // check that the path is valid via the console*/
	
	// Initialize the DLR instance - using initLicense since we are using a trial key.
	DynamsoftLabelRecognizer *recognizer;
	recognizer = [[DynamsoftLabelRecognizer alloc] initWithLicense:@"t0068UwAAAJJAsvaTWDbWVqODE9awtia4Ijv6yoby/tlUTABTvsGsjlZzcANX3FAvxZdCFOAWdH0YzkDLH34F047k39kB8F8="];
	
	NSError __autoreleasing *  error;
	
	// Get the results using the recognizeByBuffer method (recognizeByFile currently not working)
	//result = [recognizer recognizeByFile:localFilePath templateName:@"" error:&error];
	NSArray<iDLRResult*>* results = [recognizer recognizeByBuffer:DLRdata templateName:@"" error:&error];
	NSString *msgText = @"";

	for (NSInteger i = 0; i < [results count]; i++) {
		for (iDLRLineResult* lineResult in results[i].lineResults) {
			msgText = [msgText stringByAppendingString:[NSString stringWithFormat:@"\nValue: %@\n",lineResult.text]];
		}
	}
	NSLog(@"msgText.%@",msgText); // Printing the DLR result in the debugger console
	
	_readDLRButton.enabled=FALSE;
}

#pragma  mark - Loading Image into Image Viewer once selected.
-(void)imagePickerController:(UIImagePickerController *)picker didFinishPickingMediaWithInfo:(NSDictionary *)info
{
	UIImage *image=[info objectForKey:UIImagePickerControllerEditedImage]; // Get edited image
	if(image==nil)
	{
		image = [info objectForKey:UIImagePickerControllerOriginalImage]; // If not edited, grab original image
	}
	
	_rectLayerImage.image=image;
	
	// Get the image URL to make the file path string
	//_imageURL = [info valueForKey:(@"UIImagePickerControllerReferenceURL")];
	
	_openGalleryButton.enabled=TRUE;
	
	[self dismissViewControllerAnimated:YES completion:nil];
}

#pragma mark - Memory warning

- (void)didReceiveMemoryWarning
{
	[super didReceiveMemoryWarning];
	// Release any cached data, images, etc that aren't in use.
}

#pragma mark - Creating the main vertical stack view
- (UIStackView*)createStackView
{
	UIStackView *stack = [[UIStackView alloc] init];
	stack.translatesAutoresizingMaskIntoConstraints = NO;
	stack.distribution = UIStackViewDistributionEqualSpacing;
	stack.axis = UIAxisVertical;
	stack.spacing = 30;
	return stack;
}

#pragma mark - Creating the button horizontal stack view
- (UIStackView*)createButtonStackView
{
	UIStackView *stack = [[UIStackView alloc] init];
	stack.distribution = UIStackViewDistributionFillEqually;
	stack.alignment = UIStackViewAlignmentFill;
	stack.spacing = 9;
	return stack;
}

#pragma mark - View lifecycle

- (void)viewDidLoad
{
	[super viewDidLoad];
	
	// Create the main stack view and add it to the viewer, and declare its constraints.
	UIStackView* stackView = [self createStackView];
	
	[self.view addSubview:stackView];
	[stackView.heightAnchor constraintEqualToConstant:self.view.bounds.size.height - 100].active = true;
	[stackView.widthAnchor constraintEqualToConstant:self.view.bounds.size.width - 40].active = true;
	[stackView.centerXAnchor constraintEqualToAnchor:self.view.centerXAnchor].active = true;
	[stackView.centerYAnchor constraintEqualToAnchor:self.view.centerYAnchor].active = true;
	
	// Create the main image view to display the image selected
	_rectLayerImage =[[UIImageView alloc] initWithFrame:self.view.bounds];
	
	// Creating the load image button and defining its action
	_openGalleryButton = [UIButton buttonWithType:UIButtonTypeRoundedRect];
	[_openGalleryButton addTarget:self action:@selector(showLibraryAction:) forControlEvents:(UIControlEventTouchUpInside)];
	[_openGalleryButton setFrame:(CGRectMake(0, self.view.bounds.size.height * 0.6, self.view.bounds.size.width * 0.6, self.view.bounds.size.height))];
	[_openGalleryButton setTitle:@"Load an Image" forState:UIControlStateNormal];
	[_openGalleryButton setExclusiveTouch:YES];
	_openGalleryButton.translatesAutoresizingMaskIntoConstraints = NO;
	
	// Creating the DLR button and defining its action
	_readDLRButton = [UIButton buttonWithType:UIButtonTypeRoundedRect];
	[_readDLRButton addTarget:self action:@selector(readImageDLR:) forControlEvents:(UIControlEventTouchUpInside)];
	[_readDLRButton setFrame:(CGRectMake(0, self.view.bounds.size.height * 0.6, self.view.bounds.size.width * 0.6, self.view.bounds.size.height))];
	[_readDLRButton setTitle:@"DLR Me" forState:UIControlStateNormal];
	[_readDLRButton setExclusiveTouch:YES];
	_readDLRButton.translatesAutoresizingMaskIntoConstraints = NO;

	// Create the horizontal stack view that will hold the two buttons
	// Addding the buttons to a horizontal stack view
	UIStackView* buttonStackView = [self createButtonStackView];
	[buttonStackView addArrangedSubview:_openGalleryButton];
	[buttonStackView addArrangedSubview:_readDLRButton];
	
	// Adding the button stack view and image view to the main vertical stack view.
	[stackView addArrangedSubview:_rectLayerImage];
	[stackView addArrangedSubview:buttonStackView];


	// Ensuring that the image fits within the image viewer
	_rectLayerImage.contentMode = UIViewContentModeScaleAspectFill;
	_rectLayerImage.clipsToBounds = YES;
}

- (void)viewWillAppear:(BOOL)animated
{
	[super viewWillAppear:animated];
}

- (void)viewDidAppear:(BOOL)animated
{
	[super viewDidAppear:animated];
}

- (void)viewWillDisappear:(BOOL)animated
{
 [super viewWillDisappear:animated];
}

- (void)viewDidDisappear:(BOOL)animated
{
 [super viewDidDisappear:animated];
}

- (BOOL)shouldAutorotate:(UIInterfaceOrientation)interfaceOrientation
{
	return YES;
}

@end
```
