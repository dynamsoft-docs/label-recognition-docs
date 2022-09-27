---
layout: default-layout
title: Dynamsoft Label Recognizer Objective-C & Swift API Reference - DynamsoftLabelRecognizer Class
description: This page shows DynamsoftLabelRecognizer methods of Dynamsoft Label Recognizer for Objective-C & Swift API Reference.
keywords: api reference, objective-c, oc, swift
needAutoGenerateSidebar: true
needGenerateH3Content: true
noTitleIndex: true
---


# DynamsoftLabelRecognizer

```objc
@interface DynamsoftLabelRecognizer : NSObject 
```

## Initialization Method Summary
  
  | Method               | Description |
  |----------------------|-------------|
  | [`init`](#init) | Create an instance of Dynamsoft Label Recognizer. |
  | [`initLicense`](#initlicense) | Initializes the label Recognizer license. |

## Settings Method Summary

  | Method               | Description |
  |----------------------|-------------|
  | [`getRuntimeSettings`](#getruntimesettings) | Gets the current settings and saves it into a class. |
  | [`updateRuntimeSettings`](#updateruntimesettings) | Updates runtime settings with a given class. |
  | [`resetRuntimeSettings`](#resetruntimesettings) | Resets the runtime settings. |
  | [`appendSettingsFromString`](#appendsettingsfromstring) | Appends LabelRecognizerParameter settings in a string to the SDK object. |
  | [`appendSettingsFromFile`](#appendsettingsfromfile) | Appends LabelRecognizerParameter settings from a file to the SDK object. |
  | [`outputSettingsToFile`](#outputsettingstofile) | Outputs LabelRecognizerParameter settings into a file (JSON file). |
  | [`clearAppendedSettings`](#clearappendedsettings) | Clear all appended LabelRecognizerParameter settings in the SDK object. |
  | [`updateReferenceRegionFromBarcodeResults`](#updatereferenceregionfrombarcoderesults) | Updates reference region which is defined with source type LST_BARCODE. |
  | [`getModeArgument`](#getmodeargument) | Get argument value for the specified mode parameter. |
  | [`setModeArgument`](#setmodeargument) | Set argument value for the specified mode parameter. |
  | [`appendCharacterModel`](#appendcharactermodel) | Appends CharacterModel to the SDK object. |
  | [`eraseAllCharacterModels`](#eraseallcharactermodels) | Erases all CharacterModels the SDK object currently loaded. |
  | [`eraseCharacterModelByName`](#erasecharactermodelbyname) | Erases a name specified CharacterModel from the SDK object. |

## Video Scanning Method Summary

  | Method               | Description |
  |----------------------|-------------|
  | [`setImageSource`](#setimagesource) | Set an instance of `ImageSource` as the source of video label scanning. User can either implement the interface `ImageSource` or use `DynamsoftCameraEnhancer`. |
  | [`setLabelResultListener`](#setlabelresultlistener) | Register a LabelResultListener to obtain video label recognition results. |
  | [`startScanning`](#startscanning) | Start video label recognition. |
  | [`stopScanning`](#stopscanning) | Stop video label recognition. |

## Recognizing Method Summary

  | Method               | Description |
  |----------------------|-------------|
  | [`recognizeBuffer`](#recognizebybuffer) | Recognizes text from memory buffer containing image pixels in defined format. |
  | [`recognizeFile`](#recognizebyfile) | Recognizes text from a specified image file. |
  | [`recognizeImage`](#recognizebyimage) | Recognizes text from an image in memory. |

## General Method Summary

  | Method               | Description |
  |----------------------|-------------|
  | [`getVersion`](#getversion) | Returns the version number string for the SDK. |

&nbsp;
## Initialization Method Details

### init

Initializes DynamsoftLabelRecognizer.

```objc
- (instancetype _Nonnull)init;
```

**Return value**

The instance of DynamsoftLabelRecognizer.

**Code Snippet**

<div class="sample-code-prefix"></div>
>- Objective-C
>- Swift
>
>1. 
```objc
DynamsoftLabelRecognizer *recognizer;
recognizer = [[DynamsoftLabelRecognizer alloc] init];
```
2. 
```swift
let recognizer = DynamsoftLabelRecognizer.init()
```

&nbsp;
### initLicense

Initializes the label Recognizer license.

```objc
+ (void)initLicense:(NString* _Nullable)license verificationDelegate:(id _Nullable)connectionDelegate;
```

**Parameters**

`[in] license` The product keys.  
`[in,out] connectionDelegate` The delegate to handle callback when license server returns.

**Code Snippet**

<div class="sample-code-prefix"></div>
>- Objective-C
>- Swift
>
>1. 
```objc
[DynamsoftLabelRecognizer initLicense:@"t0260NwAAAHV***************" verificationDelegate:self];

- (void)DLRLicenseVerificationCallback:(bool)isSuccess error:(NSError * )error
{
    //TODO: add your code for license verification
}
```
2. 
```swift
DynamsoftLabelRecognizer.initLicense(license:"t0260NwAAAHV***************", verificationDelegate: self)

func DLRLicenseVerificationCallback(_ isSuccess: Bool, error: Error?)
{
    //TODO: add your code for license verification
}
```

## Settings Method Details

### appendCharacterModel
Appends CharacterModel to the SDK object.

```objc
+ (void)appendCharacterModel:(NSString*)name prototxtBuffer:(NSData*)prototxtBuffer txtBuffer:(NSData*)txtBuffer characterModelBuffer:(NSData*)characterModelBuffer
```

**Parameters**

`name` A unique name for the appended CharacterModel.  
`prototxtBuffer` The .prototxt file data of the CharacterModel in a byte array.  
`txtBuffer` The .txt file data of the CharacterModel in a byte array.  
`characterModelBuffer` The .caffemodel file data of the CharacterModel in a byte array.

**Code Snippet**

<div class="sample-code-prefix"></div>
>- Objective-C
>- Swift
>
>1. 
```objc
//construct prototxtBuffer, txtBuffer and characterModelBuffer
[DynamsoftLabelRecognizer appendCharacterModel:@"your model name" prototxtBuffer: prototxtBuffer txtBuffer: txtBuffer characterModelBuffer: characterModelBuffer];
```
2. 
```swift
//construct prototxtBuffer, txtBuffer and characterModelBuffer
DynamsoftLabelRecognizer.appendCharacterModel("your model name", prototxtBuffer: prototxtBuffer, txtBuffer: txtBuffer, characterModelBuffer: characterModelBuffer)
```

&nbsp;
### eraseAllCharacterModels
Erases all CharacterModels the SDK object currently loaded.

```objc
+ (void)eraseAllCharacterModels;
```

**Code Snippet**

<div class="sample-code-prefix"></div>
>- Objective-C
>- Swift
>
>1. 
```objc
[DynamsoftLabelRecognizer eraseAllCharacterModels];
```
2. 
```swift
DynamsoftLabelRecognizer.eraseAllCharacterModels()
```

&nbsp;
### eraseCharacterModelByName

Erases a name specified CharacterModel from the SDK object.

```objc
+ (void)eraseCharacterModelByName:(NSString*)name
```

**Parameters**

`name` A unique name representing the CharacterModel to erase.
  
**Code Snippet**

<div class="sample-code-prefix"></div>
>- Objective-C
>- Swift
>
>1. 
```objc
[DynamsoftLabelRecognizer eraseCharacterModelByName:@"your model name"];
```
2. 
```swift
DynamsoftLabelRecognizer.eraseCharacterModelByName("your model name")
```

&nbsp;
### appendSettingsFromFile
Appends LabelRecognizerParameter settings in a file to the SDK object.

```objc
- (void)appendSettingsFromFile:(NSString*)filePath error:(NSError**)error
```

**Parameters**

`filePath` The settings file path.  
`[in,out] error` Input a pointer to an error object. If an error occurs, this pointer is set to an actual error object containing the error information. You may specify nil for this parameter if you do not want the error information.

**Code Snippet**

<div class="sample-code-prefix"></div>
>- Objective-C
>- Swift
>
>1. 
```objc
DynamsoftLabelRecognizer *recognizer;
recognizer = [[DynamsoftLabelRecognizer alloc] init];

NSError __autoreleasing *  error;
[recognizer appendSettingsFromFile:@"your file path" error:&error];
```
2. 
```swift
let recognizer = DynamsoftLabelRecognizer()
let error: NSError? = NSError()
recognizer.appendSettingsFromFile("your file path", error:&error)
```

&nbsp;
### appendSettingsFromString
Append a new template string to the current label Recognizer instance.

```objc
- (void)appendSettingsFromString:(NSString*)content error:(NSError**)error
```

**Parameters**

`content` A JSON string that represents the content of the settings.  
`[in,out] error` Input a pointer to an error object. If an error occurs, this pointer is set to an actual error object containing the error information. You may specify nil for this parameter if you do not want the error information.

**Code Snippet**

<div class="sample-code-prefix"></div>
>- Objective-C
>- Swift
>
>1. 
```objc
DynamsoftLabelRecognizer *recognizer;
recognizer = [[DynamsoftLabelRecognizer alloc] init];

NSError __autoreleasing *  error;
[recognizer appendSettingsFromString:@"{\"LabelRecognizerParameter\":{\"Name\":\"P1\", \"RegionPredetectionModes\":[{\"Mode\":\"RPM_GENERAL_HSV_CONTRAST\"}], \"ReferenceRegionNameArray\": [\"R1\"]},\"ReferenceRegion\":{\"Name\":\"R1\",\"Localization\":{\"SourceType\":\"LST_PREDETECTED_REGION\",\"RegionPredetectionModesIndex\":0},\"TextAreaNameArray\":[\"T1\"]},\"TextArea\":{\"Name\":\"T1\",\"CharacterModelName\":\"Number\"}}" error:&error];
```
2. 
```swift
let recognizer = DynamsoftLabelRecognizer()
let error: NSError? = NSError()
recognizer.appendSettingsFromString("{\"LabelRecognizerParameter\":{\"Name\":\"P1\", \"RegionPredetectionModes\":[{\"Mode\":\"RPM_GENERAL_HSV_CONTRAST\"}], \"ReferenceRegionNameArray\": [\"R1\"]},\"ReferenceRegion\":{\"Name\":\"R1\",\"Localization\":{\"SourceType\":\"LST_PREDETECTED_REGION\",\"RegionPredetectionModesIndex\":0},\"TextAreaNameArray\":[\"T1\"]},\"TextArea\":{\"Name\":\"T1\",\"CharacterModelName\":\"Number\"}}", error:&error)
```

&nbsp;
### clearAppendedSettings

Clear all appended parameter settings of the current label Recognizer instance.

```objc
- (void)clearAppendedSettings:(NSError**)error;
```

**Parameters**

`[in,out] error` Input a pointer to an error object. If an error occurs, this pointer is set to an actual error object containing the error information. You may specify nil for this parameter if you do not want the error information.

**Code Snippet**

<div class="sample-code-prefix"></div>
>- Objective-C
>- Swift
>
>1. 
```objc
DynamsoftLabelRecognizer *recognizer;
recognizer = [[DynamsoftLabelRecognizer alloc] init];
NSError __autoreleasing *  error;
[recognizer clearAppendedSettings:&error];
```
2. 
```swift
let recognizer = DynamsoftLabelRecognizer()
let error: NSError? = NSError()
recognizer.clearAppendedSettings(&error)
```

&nbsp;
### getModeArgument

Get argument value for the specified mode parameter.

```objc
- (NSString* _Nonnull)getModeArgument:(NSString* _Nonnull)modeName index:(NSInteger)index argumentName:(NSString* _Nonnull)argumentName error:(NSError* _Nullable * _Nullable)error;
```

**Parameters**
  
`modeName`: The mode parameter name to get argument.  
`index`: The array index of mode parameter to indicate a specific mode.  
`argumentName`: The name of the argument to get.  
`[in,out] error` Input a pointer to an error object. If an error occurs, this pointer is set to an actual error object containing the error information. You may specify nil for this parameter if you do not want the error information.

**Return value**

the optional argument for a specified mode in Modes parameters.

**Remark**

Check follow link for available modes and arguments:

- [`RegionPredetectionModes`]({{ site.parameters-reference }}label-recognition-parameter/region-predetection-modes.html#regionpredetectionmodes)

**Code Snippet**

<div class="sample-code-prefix"></div>
>- Objective-C
>- Swift
>
>1. 
```objc
DynamsoftLabelRecognizer *recognizer;
recognizer = [[DynamsoftLabelRecognizer alloc] init];

NSError __autoreleasing *  error;
NSString *argumentValue = [recognizer getModeArgument:@"RegionPredetectionModes" index:0 argumentName:@"AspectRatioRange" error:&error];
```
2. 
```swift
let recognizer = DynamsoftLabelRecognizer()
let error: NSError? = NSError()
let argumentValue = recognizer.getModeArgument("RegionPredetectionModes", index:0, argumentName:"AspectRatioRange", error:&error)
```

&nbsp;

### getRuntimeSettings

Get current settings and save them into a [`iDLRRuntimeSettings`](dlr-runtime-settings.md) class object.

```objc
- (iDLRRuntimeSettings*)getRuntimeSettings:(NSError**)error;
```

**Parameters**
  
`[in,out] error` Input a pointer to an error object. If an error occurs, this pointer is set to an actual error object containing the error information. You may specify nil for this parameter if you do not want the error information.

**Return value**

The class object of runtime settings.

**Code Snippet**

<div class="sample-code-prefix"></div>
>- Objective-C
>- Swift
>
>1. 
```objc
DynamsoftLabelRecognizer *recognizer;
recognizer = [[DynamsoftLabelRecognizer alloc] init];
NSError __autoreleasing *  error;
iDLRRuntimeSettings* settings = [recognizer getRuntimeSettings:&error];
```
2. 
```swift
let recognizer = DynamsoftLabelRecognizer()
let error: NSError? = NSError()
let settings = recognizer.getRuntimeSettings(&error)
```

&nbsp;

### outputSettingsToFile

Outputs runtime settings and save them into a settings file (JSON file).  

```objc
- (void)outputSettingsToFile:(NSString*)filePath templateName:(NSString*)templateName error:(NSError**)error
```

**Parameters**

`filePath` The path of the output file which stores current settings.  
`templateName` A unique name for declaring current runtime settings.  
`[in,out] error` Input a pointer to an error object. If an error occurs, this pointer is set to an actual error object containing the error information. You may specify nil for this parameter if you do not want the error information.

**Code Snippet**

<div class="sample-code-prefix"></div>
>- Objective-C
>- Swift
>
>1. 
```objc
DynamsoftLabelRecognizer *recognizer;
recognizer = [[DynamsoftLabelRecognizer alloc] init];
NSError __autoreleasing *  error;
[recognizer outputSettingsToFile:@"your saving file path" templateName:@"currentRuntimeSettings" error:&error];
```
2. 
```swift
let recognizer = DynamsoftLabelRecognizer()
let error: NSError? = NSError()
recognizer.outputSettingsToFile("your saving file path", templateName:"currentRuntimeSettings", error:&error)
```

&nbsp;

### resetRuntimeSettings

Reset all runtime settings to default values.

```objc
- (void)resetRuntimeSettings:(NSError**)error;
```

**Parameters**

`[in,out] error` Input a pointer to an error object. If an error occurs, this pointer is set to an actual error object containing the error information. You may specify nil for this parameter if you do not want the error information.

**Code Snippet**

<div class="sample-code-prefix"></div>
>- Objective-C
>- Swift
>
>1. 
```objc
DynamsoftLabelRecognizer *recognizer;
recognizer = [[DynamsoftLabelRecognizer alloc] init];

NSError __autoreleasing *  error;
[recognizer resetRuntimeSettings:&error];
```
2. 
```swift
let recognizer = DynamsoftLabelRecognizer()
let error: NSError? = NSError()
recognizer.resetRuntimeSettings(error:&error)
```

&nbsp;

### setModeArgument

Set argument value for the specified mode parameter.

```objc
- (void)setModeArgument:(NSString* _Nonnull)modeName index:(NSInteger)index argumentName:(NSString* _Nonnull)argumentName argumentValue:(NSString* _Nonnull)argumentValue error:(NSError* _Nullable * _Nullable)error;
```

**Parameters**

`modeName`: The mode parameter name to set argument.  
`index`: The array index of mode parameter to indicate a specific mode.  
`argumentName`: The name of the argument to set.  
`argumentValue`: The value of the argument to set.  
`[in,out] error` Input a pointer to an error object. If an error occurs, this pointer is set to an actual error object containing the error information. You may specify nil for this parameter if you do not want the error information.

**Remark**

Check follow link for available modes and arguments:

- [`RegionPredetectionModes`]({{ site.parameters-reference }}label-recognition-parameter/region-predetection-modes.html#regionpredetectionmodes)

**Code Snippet**

<div class="sample-code-prefix"></div>
>- Objective-C
>- Swift
>
>1. 
```objc
DynamsoftLabelRecognizer *recognizer;
recognizer = [[DynamsoftLabelRecognizer alloc] init];
NSError __autoreleasing * _Nullable error;
[recognizer setModeArgument:@"RegionPredetectionModes" index:0 argumentName:@"AspectRatioRange" argumentValue:"100" error:&error];
```
2. 
```swift
let recognizer = DynamsoftLabelRecognizer()
let error: NSError? = NSError()
recognizer.setModeArgument("RegionPredetectionModes", index:0, argumentName:"AspectRatioRange", argumentValue:"100", error:&error)
```

&nbsp;
### updateReferenceRegionFromBarcodeResults

Updates reference region which is defined with source type LST_BARCODE.  

```objc
- (void)updateReferenceRegionFromBarcodeResults:(NSArray<iBarcodeResult*>*)barcodeResults templateName:(NSString *)templateName error:(NSError**)error
```

**Parameters**

`barcodeResults` The barcode results used to localize reference region.  See also [`iBarcodeResult`](barcode-result.md).  
`templateName` The template name. A template name is the value of key LabelRecognizerParameter.Name defined in JSON formatted settings. If no template name is specified, current runtime settings will be used.  
`[in,out] error` Input a pointer to an error object. If an error occurs, this pointer is set to an actual error object containing the error information. You may specify nil for this parameter if you do not want the error information.

**Code Snippet**

<div class="sample-code-prefix"></div>
>- Objective-C
>- Swift
>
>1. 
```objc
DynamsoftLabelRecognizer *recognizer;
recognizer = [[DynamsoftLabelRecognizer alloc] init];
NSArray<iBarcodeResult*> *textResults;
//get textResults from Dynamsoft Barcode Reader SDK
NSError __autoreleasing *error;
[recognizer appendSettingsFromString:@"{\"LabelRecognizerParameter\":{\"Name\":\"P1\", \"RegionPredetectionModes\":[{\"Mode\":\"RPM_GENERAL_HSV_CONTRAST\"}], \"ReferenceRegionNameArray\": [\"R1\"]},\"ReferenceRegion\":{\"Name\":\"R1\",\"Localization\":{\"SourceType\":\"LST_BARCODE\"},\"TextAreaNameArray\":[\"T1\"]},\"TextArea\":{\"Name\":\"T1\",\"CharacterModelName\":\"Number\"}}" error:&error];
[recognizer updateReferenceRegionFromBarcodeResults:textResults templateName:@"P1" error:&error];
```
2. 
```swift
let recognizer = DynamsoftLabelRecognizer()
var textResults = [iBarcodeResult]()
//get textResults from Dynamsoft Barcode Reader SDK
let error: NSError? = NSError()
recognizer.appendSettingsFromString("{\"LabelRecognizerParameter\":{\"Name\":\"P1\", \"RegionPredetectionModes\":[{\"Mode\":\"RPM_GENERAL_HSV_CONTRAST\"}], \"ReferenceRegionNameArray\": [\"R1\"]},\"ReferenceRegion\":{\"Name\":\"R1\",\"Localization\":{\"SourceType\":\"LST_BARCODE\"},\"TextAreaNameArray\":[\"T1\"]},\"TextArea\":{\"Name\":\"T1\",\"CharacterModelName\":\"Number\"}}", error:&error)
recognizer.updateReferenceRegionFromBarcodeResults(textResults, templateName:"P1", error:&error)
```

&nbsp;

### updateRuntimeSettings

Update runtime settings with a given [`iDLRRuntimeSettings`](dlr-runtime-settings.md) class object.

```objc
- (void)updateRuntimeSettings:(iDLRRuntimeSettings*)settings error:(NSError**)error
```

**Parameters**

`settings` The class object of template settings.  
`[in,out] error` Input a pointer to an error object. If an error occurs, this pointer is set to an actual error object containing the error information. You may specify nil for this parameter if you do not want the error information.

**Code Snippet**

<div class="sample-code-prefix"></div>
>- Objective-C
>- Swift
>
>1. 
```objc
DynamsoftLabelRecognizer *recognizer;
recognizer = [[DynamsoftLabelRecognizer alloc] init];
NSError __autoreleasing *  error;
iDLRRuntimeSettings *settings;
settings.maxThreadCount = 4;
[recognizer updateRuntimeSettings:settings error:&error];
```
2. 
```swift
let recognizer = DynamsoftLabelRecognizer()
let error: NSError? = NSError()
let settings = recognizer.getRuntimeSettings(&error)
settings.maxThreadCount = 4;
recognizer.updateRuntimeSettings(settings, error:&error);
```

&nbsp;

## Video Scanning Method Details

### setImageSource

Set an instance of `ImageSource` as the source of video label scanning. User can either implement the interface `ImageSource` or use `DynamsoftCameraEnhancer`.

```objc
- (void)setImageSource:(id<ImageSource>)source;
```

**Parameters**

`[in] source` A instance of protocol `ImageSource`.

**Code Snippet**

### setLabelResultListener

Register a LabelResultListener to obtain video label recognition results.

```objc
- (void)setLabelResultListener:(nullable id<LabelResultListener>)listener
```

**Parameters**

`[in] source` A instance of protocol `LabelResultListener`.

**Code Snippet**

### startScanning

Start video label recognition.

```objc
- (void)startScanning;
```

### stopScanning

Stop video label recognition.

```objc
- (void)stopScanning;
```

## Recognizing Method Details

### recognizeBuffer

Recognizes text from the memory buffer containing image pixels in defined format.

```objc
- (NSArray<iDLRResult*>*)recognizeBuffer:(iImageData*)imageData templateName:(NSString*)templateName error:(NSError**)error
```

**Parameters**

`[in] imageData` An object of `iImageData` that represents an image.  
`[in,out] error` Input a pointer to an error object. If an error occurs, this pointer is set to an actual error object containing the error information. You may specify nil for this parameter if you do not want the error information.

**Return value**

All results recognized successfully.

**Code Snippet**

<div class="sample-code-prefix"></div>
>- Objective-C
>- Swift
>
>1. 
```objc
DynamsoftLabelRecognizer *recognizer;
recognizer = [[DynamsoftLabelRecognizer alloc] init];
iImageData *imageData = [[iImageData alloc] init];
//construct imageData
NSError __autoreleasing *  error;
NSArray<iDLRResult*>* result = [recognizer recognizeBuffer:imageData templateName:@"" error:&error];
```
2. 
```swift
let recognizer = DynamsoftLabelRecognizer()
let imageData = iImageData.init()
let error: NSError? = NSError()
//construct imageData
let result = recognizer.recognizeBuffer(imageData:imageData, templateName:"", error:&error)
```

&nbsp;

### recognizeFile

Recognizes text from a specified image file.

```objc
- (NSArray<iDLRResult*>*)recognizeFile:(NSString*)name templateName:(NSString*)templateName error:(NSError**)error
```

**Parameters**

`[in] name` A string defining the file path.  
`[in,out] error` Input a pointer to an error object. If an error occurs, this pointer is set to an actual error object containing the error information. You may specify nil for this parameter if you do not want the error information.

**Return value**

All results recognized successfully.

**Code Snippet**

<div class="sample-code-prefix"></div>
>- Objective-C
>- Swift
>
>1. 
```objc
DynamsoftLabelRecognizer *recognizer;
recognizer = [[DynamsoftLabelRecognizer alloc] init];
NSError __autoreleasing *  error;
NSArray<iDLRResult*>* result = [recognizer recognizeFile:@"your file path" templateName:@"" error:&error];
```
2. 
```swift
let recognizer = DynamsoftLabelRecognizer()
let error: NSError? = NSError()
let result = recognizer.recognizeFile("your file path", templateName:"", error:&error)
```

&nbsp;
### recognizeImage

Recognizes text from a `UIImage`.

```objc
- (NSArray<iDLRResult*>* _Nullable)recognizeImage:(UIImage* _Nonnull)image
                                            error:(NSError* _Nullable * _Nullable)error;
```  

**Parameters**

`[in] image` An object of `UIImage`.  
`[in, out] error` Input a pointer to an error object. If an error occurs, this pointer is set to an actual error object containing the error information. You may specify nil for this parameter if you do not want the error information.

**Return value**

All results recognized successfully.

**Code Snippet**

<div class="sample-code-prefix"></div>
>- Objective-C
>- Swift
>
>1. 
```objc
DynamsoftLabelRecognizer *recognizer;
recognizer = [[DynamsoftLabelRecognizer alloc] init];
NSError __autoreleasing *  error;
UIImage *image = [[UIImage alloc] init];
NSArray<iDLRResult*>* result = [recognizer recognizeImage:image withTemplate:@"" error:&error];
```
2. 
```swift
let recognizer = DynamsoftLabelRecognizer()
let error: NSError? = NSError()
let image: UIImage? = UIImage()
let result = recognizer.recognizeImage(image:image withTemplate:"" error:&error)
```

&nbsp;
### recognizeFileInMemory

Recognizes text from an image file in memory.

```objc
- (NSArray<iDLRResult*>* _Nullable)recognizeFileInMemory:(NSData* _Nonnull)fileBytes
                                                   error:(NSError**)error
```

**Parameters**

`[in] fileBytes` The image file in memory.  
`[in, out] error` Input a pointer to an error object. If an error occurs, this pointer is set to an actual error object containing the error information. You may specify nil for this parameter if you do not want the error information.

**Return value**

All results recognized successfully.

**Code Snippet**

## General Method Details

### getVersion

Get version information of SDK.

```objc
- (NSString*)getVersion;
```

**Return value**

The version information string.

**Code Snippet**

<div class="sample-code-prefix"></div>
>- Objective-C
>- Swift
>
>1. 
```objc
DynamsoftLabelRecognizer *recognizer;
recognizer = [[DynamsoftLabelRecognizer alloc] init];
NSString* versionInfo = [recognizer getVersion];
```
2. 
```swift
let recognizer = DynamsoftLabelRecognizer.init()
let versionInfo = recognizer.getVersion();
```
