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

## Initialization
  
  | Method               | Description |
  |----------------------|-------------|
  | [`init`](#init) | Create an instance of Dynamsoft Label Recognizer. |
  | [`initWithLicense`](#initwithlicense) | Sets the license and activates the SDK. |
  | [`initLicenseFromDLS`](#initlicensefromdls) | Initializes the label Recognizer license and connects to the specified server for online verification. |

### init

Initializes DynamsoftLabelRecognizer.

```objc
- (instancetype _Nonnull)init;
```

**Return value**
The instance of DynamsoftLabelRecognizer.

**Code Snippet**

Objective-C:

```objc
DynamsoftLabelRecognizer *recognizer;
recognizer = [[DynamsoftLabelRecognizer alloc] init];
```

Swift:

```Swift
let recognizer = DynamsoftLabelRecognizer.init()
```




### initWithLicense
Sets the license and activates the SDK.

```objc
- (instancetype _Nonnull)initWithLicense:(NSString* _Nonnull)license;
```   

**Parameters**
`[in] license`: The product keys.


**Code Snippet**
Objective-C:
```objc
DynamsoftLabelRecognizer *recognizer;
recognizer = [[DynamsoftLabelRecognizer alloc] initWithLicense:@"t0260NwAAAHV***************"];
```

Swift:
```Swift
let recognizer = DynamsoftLabelRecognizer.initWithLicense(license: "t0260NwAAAHV***************")
```




### initLicenseFromDLS
Initializes the label Recognizer license and connects to the specified server for online verification.

```objc
- (instancetype _Nonnull)initLicenseFromDLS:(iDMDLSConnectionParameters* _Nullable)ltsConnectionParameters verificationDelegate:(id _Nullable)connectionDelegate;
```   

**Parameters**
`[in] ltsConnectionParameters` The struct iDMDLSConnectionParameters with customized settings.  
`[in,out] connectionDelegate` The delegate to handle callback when license server returns.

**Code Snippet**
Objective-C:
```objc
DynamsoftLabelRecognizer *recognizer;
iDMDLSConnectionParameters* lts = [[iDMDLSConnectionParameters alloc] init];
lts.organizationID = "200005";
recognizer = [[DynamsoftLabelRecognizer alloc] initLicenseFromDLS:lts verificationDelegate:self];
- (void)DLSLicenseVerificationCallback:(bool)isSuccess error:(NSError * )error
{
    //TODO add your code for license verification
}
```

Swift:
```Swift
let lts = iDMDLSConnectionParameters()
lts.organizationID = "200005"
let recognizer = DynamsoftLabelRecognizer(licenseFromDLS: lts, verificationDelegate: self)
func ltsLicenseVerificationCallback(_ isSuccess: Bool, error: Error?)
{
    print("isSuccess : \(isSuccess) error : \(String(describing: error))")
}
```

 


## Settings

  | Method               | Description |
  |----------------------|-------------|
  | [`getRuntimeSettings`](#getruntimesettings) | Gets the current settings and saves it into a class. |
  | [`updateRuntimeSettings`](#updateruntimesettings) | Updates runtime settings with a given class. |
  | [`resetRuntimeSettings`](#resetruntimesettings) | Resets the runtime settings. |
  | [`appendSettingsFromString`](#appendsettingsfromstring) | Appends LabelRecognizerParameter settings in a string to the SDK object. |
  | [`appendSettingsFromFile`](#appendsettingsfromFile) | Appends LabelRecognizerParameter settings from a file to the SDK object. |
  | [`outputSettingsToFile`](#outputsettingstofile) | Outputs LabelRecognizerParameter settings into a file (JSON file). |
  | [`clearAppendedSettings`](#clearappendedsettings) | Clear all appended LabelRecognizerParameter settings in the SDK object. |
  | [`updateReferenceRegionFromBarcodeResults`](#updatereferenceregionfrombarcoderesults) | Updates reference region which is defined with source type LST_BARCODE. |
  | [`getModeArgument`](#getmodeargument) | Get argument value for the specified mode parameter. |
  | [`setModeArgument`](#setmodeargument) | Set argument value for the specified mode parameter. |
  | [`appendCharacterModel`](#appendCharacterModel) | Appends CharacterModel to the SDK object. |
  | [`eraseAllCharacterModels`](#appendCharacterModel) | Erases all CharacterModels the SDK object currently loaded. |
  | [`eraseCharacterModelByName`](#appendCharacterModel) | Erases a name specified CharacterModel from the SDK object. |


### appendCharacterModel
Appends CharacterModel to the SDK object.

```objc
- (void)appendCharacterModel:(NSString*)name prototxtBuffer:(NSData*)prototxtBuffer txtBuffer:(NSData*)txtBuffer characterModelBuffer:(NSData*)characterModelBuffer
```   
   
**Parameters**
`name` A unique name for the appended CharacterModel.   
`prototxtBuffer` The .prototxt file data of the CharacterModel in a byte array.   
`txtBuffer` The .txt file data of the CharacterModel in a byte array.   
`characterModelBuffer` The .caffemodel file data of the CharacterModel in a byte array.   


**Code Snippet**
Objective-C:
```objc
DynamsoftLabelRecognizer *recognizer;
iDMDLSConnectionParameters* lts = [[iDMDLSConnectionParameters alloc] init];
lts.organizationID = @"200001";
recognizer = [[DynamsoftLabelRecognizer alloc] initLicenseFromDLS:lts verificationDelegate:self];
- (void)DLSLicenseVerificationCallback:(bool)isSuccess error:(NSError * )error
{
    //TODO add your code for license verification
}
//construct prototxtBuffer, txtBuffer and characterModelBuffer
[recognizer appendCharacterModel:@"your model name" prototxtBuffer: prototxtBuffer txtBuffer: txtBuffer characterModelBuffer: characterModelBuffer];
```

Swift:
```Swift
let lts = iDMDLSConnectionParameters()
lts.organizationID = "200001"
let recognizer = DynamsoftLabelRecognizer(licenseFromDLS: lts, verificationDelegate: self)
//construct prototxtBuffer, txtBuffer and characterModelBuffer
recognizer.appendCharacterModel("your model name", prototxtBuffer: prototxtBuffer, txtBuffer: txtBuffer, characterModelBuffer: characterModelBuffer)
```




### appendSettingsFromFile
Appends LabelRecognizerParameter settings in a file to the SDK object.

```objc
- (void)appendSettingsFromFile:(NSString*)filePath error:(NSError**)error
```   
   
**Parameters**
`filePath` The settings file path.   
`[in,out] error` Input a pointer to an error object. If an error occurs, this pointer is set to an actual error object containing the error information. You may specify nil for this parameter if you do not want the error information.


**Code Snippet**
Objective-C:
```objc
DynamsoftLabelRecognizer *recognizer;
iDMDLSConnectionParameters* lts = [[iDMDLSConnectionParameters alloc] init];
lts.organizationID = @"200001";
recognizer = [[DynamsoftLabelRecognizer alloc] initLicenseFromDLS:lts verificationDelegate:self];
- (void)DLSLicenseVerificationCallback:(bool)isSuccess error:(NSError * )error
{
    //TODO add your code for license verification
}
NSError __autoreleasing *  error;
[recognizer appendSettingsFromFile:@"your file path" error:&error];
```

Swift:
```Swift
let lts = iDMDLSConnectionParameters()
lts.organizationID = "200001"
let recognizer = DynamsoftLabelRecognizer(licenseFromDLS: lts, verificationDelegate: self)
let error: NSError? = NSError()
recognizer.appendSettingsFromFile("your file path", error:&error)
```



### appendSettingsFromString
Append a new template string to the current label Recognizer instance.

```objc
- (void)appendSettingsFromString:(NSString*)content error:(NSError**)error
```   
   
**Parameters**
`content` A JSON string that represents the content of the settings.   
`[in,out] error` Input a pointer to an error object. If an error occurs, this pointer is set to an actual error object containing the error information. You may specify nil for this parameter if you do not want the error information.


**Code Snippet**
Objective-C:
```objc
DynamsoftLabelRecognizer *recognizer;
iDMDLSConnectionParameters* lts = [[iDMDLSConnectionParameters alloc] init];
lts.organizationID = @"200001";
recognizer = [[DynamsoftLabelRecognizer alloc] initLicenseFromDLS:lts verificationDelegate:self];
- (void)DLSLicenseVerificationCallback:(bool)isSuccess error:(NSError * )error
{
    //TODO add your code for license verification
}
NSError __autoreleasing *  error;
[recognizer appendSettingsFromString:@"{\"LabelRecognizerParameter\":{\"Name\":\"P1\", \"RegionPredetectionModes\":[{\"Mode\":\"RPM_GENERAL_HSV_CONTRAST\"}], \"ReferenceRegionNameArray\": [\"R1\"]},\"ReferenceRegion\":{\"Name\":\"R1\",\"Localization\":{\"SourceType\":\"LST_PREDETECTED_REGION\",\"RegionPredetectionModesIndex\":0},\"TextAreaNameArray\":[\"T1\"]},\"TextArea\":{\"Name\":\"T1\",\"CharacterModelName\":\"Number\"}}" error:&error];
```

Swift:
```Swift
let lts = iDMDLSConnectionParameters()
lts.organizationID = "200001"
let recognizer = DynamsoftLabelRecognizer(licenseFromDLS: lts, verificationDelegate: self)
let error: NSError? = NSError()
recognizer.appendSettingsFromString("{\"LabelRecognizerParameter\":{\"Name\":\"P1\", \"RegionPredetectionModes\":[{\"Mode\":\"RPM_GENERAL_HSV_CONTRAST\"}], \"ReferenceRegionNameArray\": [\"R1\"]},\"ReferenceRegion\":{\"Name\":\"R1\",\"Localization\":{\"SourceType\":\"LST_PREDETECTED_REGION\",\"RegionPredetectionModesIndex\":0},\"TextAreaNameArray\":[\"T1\"]},\"TextArea\":{\"Name\":\"T1\",\"CharacterModelName\":\"Number\"}}", error:&error)
```




### clearAppendedSettings
Clear all appended parameter settings of the current label Recognizer instance.

```objc
- (void)clearAppendedSettings:(NSError**)error;
```   

**Parameters**
`[in,out] error` Input a pointer to an error object. If an error occurs, this pointer is set to an actual error object containing the error information. You may specify nil for this parameter if you do not want the error information.

**Code Snippet**
Objective-C:
```objc
DynamsoftLabelRecognizer *recognizer;
iDMDLSConnectionParameters* lts = [[iDMDLSConnectionParameters alloc] init];
lts.organizationID = @"200001";
recognizer = [[DynamsoftLabelRecognizer alloc] initLicenseFromDLS:lts verificationDelegate:self];
- (void)DLSLicenseVerificationCallback:(bool)isSuccess error:(NSError * )error
{
    //TODO add your code for license verification
}
NSError __autoreleasing *  error;
[recognizer clearAppendedSettings:&error];
```

Swift:
```Swift
let lts = iDMDLSConnectionParameters()
lts.organizationID = "200001"
let recognizer = DynamsoftLabelRecognizer(licenseFromDLS: lts, verificationDelegate: self)
let error: NSError? = NSError()
recognizer.clearAppendedSettings(&error)
```



### eraseAllCharacterModels
Erases all CharacterModels the SDK object currently loaded.

```objc
- (void)eraseAllCharacterModels;
```   
   
**Code Snippet**
Objective-C:
```objc
DynamsoftLabelRecognizer *recognizer;
iDMDLSConnectionParameters* lts = [[iDMDLSConnectionParameters alloc] init];
lts.organizationID = @"200001";
recognizer = [[DynamsoftLabelRecognizer alloc] initLicenseFromDLS:lts verificationDelegate:self];
- (void)DLSLicenseVerificationCallback:(bool)isSuccess error:(NSError * )error
{
    //TODO add your code for license verification
}
[recognizer eraseAllCharacterModels];
```

Swift:
```Swift
let lts = iDMDLSConnectionParameters()
lts.organizationID = "200001"
let recognizer = DynamsoftLabelRecognizer(licenseFromDLS: lts, verificationDelegate: self)
recognizer.eraseAllCharacterModels()
```




### eraseCharacterModelByName
Erases a name specified CharacterModel from the SDK object.

```objc
- (void)eraseCharacterModelByName:(NSString*)name
```   

**Parameters**
`name` A unique name representing the CharacterModel to erase.   
  
**Code Snippet**
Objective-C:
```objc
DynamsoftLabelRecognizer *recognizer;
iDMDLSConnectionParameters* lts = [[iDMDLSConnectionParameters alloc] init];
lts.organizationID = @"200001";

recognizer = [[DynamsoftLabelRecognizer alloc] initLicenseFromDLS:lts verificationDelegate:self];
- (void)DLSLicenseVerificationCallback:(bool)isSuccess error:(NSError * )error
{
    //TODO add your code for license verification
}
[recognizer eraseCharacterModelByName:@"your model name"];
```

Swift:
```Swift
let lts = iDMDLSConnectionParameters()
lts.organizationID = "200001"
let recognizer = DynamsoftLabelRecognizer(licenseFromDLS: lts, verificationDelegate: self)
recognizer.eraseCharacterModelByName("your model name")
```




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

#### Remark
Check follow link for available modes and arguments:
- [`RegionPredetectionModes`]({{ site.parameters-reference }}label-Recognizer-parameter/region-predetection-modes.html#regionpredetectionmodes)

**Code Snippet**
Objective-C:
```objc
DynamsoftLabelRecognizer *recognizer;
iDMDLSConnectionParameters* lts = [[iDMDLSConnectionParameters alloc] init];
lts.organizationID = @"200001";
recognizer = [[DynamsoftLabelRecognizer alloc] initLicenseFromDLS:lts verificationDelegate:self];
- (void)DLSLicenseVerificationCallback:(bool)isSuccess error:(NSError * )error
{
    //TODO add your code for license verification
}
NSError __autoreleasing *  error;
NSString *argumentValue = [recognizer getModeArgument:@"RegionPredetectionModes" index:0 argumentName:@"AspectRatioRange" error:&error];
```

Swift:
```Swift
let lts = iDMDLSConnectionParameters()
lts.organizationID = "200001"
let recognizer = DynamsoftLabelRecognizer(licenseFromDLS: lts, verificationDelegate: self)
let error: NSError? = NSError()
let argumentValue = recognizer.getModeArgument("RegionPredetectionModes", index:0, argumentName:"AspectRatioRange", error:&error)
```




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
Objective-C:
```objc
DynamsoftLabelRecognizer *recognizer;
iDMDLSConnectionParameters* lts = [[iDMDLSConnectionParameters alloc] init];
lts.organizationID = @"200001";
recognizer = [[DynamsoftLabelRecognizer alloc] initLicenseFromDLS:lts verificationDelegate:self];
- (void)DLSLicenseVerificationCallback:(bool)isSuccess error:(NSError * )error
{
    //TODO add your code for license verification
}
NSError __autoreleasing *  error;
iDLRRuntimeSettings* settings = [recognizer getRuntimeSettings:&error];
```

Swift:
```Swift
let lts = iDMDLSConnectionParameters()
lts.organizationID = "200001"
let recognizer = DynamsoftLabelRecognizer(licenseFromDLS: lts, verificationDelegate: self)
let error: NSError? = NSError()
let settings = recognizer.getRuntimeSettings(&error)
```



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
Objective-C:
```objc
DynamsoftLabelRecognizer *recognizer;
NSString *settingsName;
iDMDLSConnectionParameters* lts = [[iDMDLSConnectionParameters alloc] init];
lts.organizationID = @"200001";
recognizer = [[DynamsoftLabelRecognizer alloc] initLicenseFromDLS:lts verificationDelegate:self];
- (void)DLSLicenseVerificationCallback:(bool)isSuccess error:(NSError * )error
{
    //TODO add your code for license verification
}
NSError __autoreleasing *  error;
[recognizer outputSettingsToFile:@"your saving file path" templateName:@"currentRuntimeSettings" error:&error];
```

Swift:
```Swift
let lts = iDMDLSConnectionParameters()
lts.organizationID = "200001"
let recognizer = DynamsoftLabelRecognizer(licenseFromDLS: lts, verificationDelegate: self)
let error: NSError? = NSError()
recognizer.outputSettingsToFile("your saving file path", templateName:"currentRuntimeSettings", error:&error)
```




### resetRuntimeSettings
Reset all runtime settings to default values.

```objc
- (void)resetRuntimeSettings:(NSError**)error;
```   
   
**Parameters**
`[in,out] error` Input a pointer to an error object. If an error occurs, this pointer is set to an actual error object containing the error information. You may specify nil for this parameter if you do not want the error information.

**Code Snippet**
Objective-C:
```objc
DynamsoftLabelRecognizer *recognizer;
iDMDLSConnectionParameters* lts = [[iDMDLSConnectionParameters alloc] init];
lts.organizationID = @"200001";
recognizer = [[DynamsoftLabelRecognizer alloc] initLicenseFromDLS:lts verificationDelegate:self];
- (void)DLSLicenseVerificationCallback:(bool)isSuccess error:(NSError * )error
{
    //TODO add your code for license verification
}
NSError __autoreleasing *  error;
[recognizer resetRuntimeSettings:&error];
```

Swift:
```Swift
let lts = iDMDLSConnectionParameters()
lts.organizationID = "200001"
let recognizer = DynamsoftLabelRecognizer(licenseFromDLS: lts, verificationDelegate: self)
let error: NSError? = NSError()
recognizer.resetRuntimeSettings(error:&error)
```




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


#### Remark
Check follow link for available modes and arguments:
- [`RegionPredetectionModes`]({{ site.parameters-reference }}label-Recognizer-parameter/region-predetection-modes.html#regionpredetectionmodes)

**Code Snippet**
Objective-C:
```objc
DynamsoftLabelRecognizer *recognizer;
iDMDLSConnectionParameters* lts = [[iDMDLSConnectionParameters alloc] init];
lts.organizationID = @"200001";
recognizer = [[DynamsoftLabelRecognizer alloc] initLicenseFromDLS:lts verificationDelegate:self];
- (void)DLSLicenseVerificationCallback:(bool)isSuccess error:(NSError * )error
{
    //TODO add your code for license verification
}
iDLRRuntimeSettings *settings;
NSError __autoreleasing * _Nullable error;   
[recognizer setModeArgument:@"RegionPredetectionModes" index:0 argumentName:@"AspectRatioRange" argumentValue:"100" error:&error];
```

Swift:
```Swift
let lts = iDMDLSConnectionParameters()
lts.organizationID = "200001"
let recognizer = DynamsoftLabelRecognizer(licenseFromDLS: lts, verificationDelegate: self)
let error: NSError? = NSError()
recognizer.setModeArgument("RegionPredetectionModes", index:0, argumentName:"AspectRatioRange", argumentValue:"100", error:&error)
```




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
Objective-C:
```objc
DynamsoftLabelRecognizer *recognizer;
iDMDLSConnectionParameters* lts = [[iDMDLSConnectionParameters alloc] init];
lts.organizationID = @"200001";
recognizer = [[DynamsoftLabelRecognizer alloc] initLicenseFromDLS:lts verificationDelegate:self];
- (void)DLSLicenseVerificationCallback:(bool)isSuccess error:(NSError * )error
{
    //TODO add your code for license verification
}
NSArray<iTextResult*> *textResults;
//get textResults from Dynamsoft Barcode Reader SDK
NSError __autoreleasing *error;
[recognizer appendSettingsFromString:@"{\"LabelRecognizerParameter\":{\"Name\":\"P1\", \"RegionPredetectionModes\":[{\"Mode\":\"RPM_GENERAL_HSV_CONTRAST\"}], \"ReferenceRegionNameArray\": [\"R1\"]},\"ReferenceRegion\":{\"Name\":\"R1\",\"Localization\":{\"SourceType\":\"LST_BARCODE\"},\"TextAreaNameArray\":[\"T1\"]},\"TextArea\":{\"Name\":\"T1\",\"CharacterModelName\":\"Number\"}}" error:&error];
[recognizer updateReferenceRegionFromBarcodeResults:textResults templateName:@"P1" error:&error];
```

Swift:
```Swift
let lts = iDMDLSConnectionParameters()
lts.organizationID = "200001"
let recognizer = DynamsoftLabelRecognizer(licenseFromDLS: lts, verificationDelegate: self)
var textResults = [iTextResult]()
//get textResults from Dynamsoft Barcode Reader SDK
let error: NSError? = NSError()
recognizer.appendSettingsFromString("{\"LabelRecognizerParameter\":{\"Name\":\"P1\", \"RegionPredetectionModes\":[{\"Mode\":\"RPM_GENERAL_HSV_CONTRAST\"}], \"ReferenceRegionNameArray\": [\"R1\"]},\"ReferenceRegion\":{\"Name\":\"R1\",\"Localization\":{\"SourceType\":\"LST_BARCODE\"},\"TextAreaNameArray\":[\"T1\"]},\"TextArea\":{\"Name\":\"T1\",\"CharacterModelName\":\"Number\"}}", error:&error)
recognizer.updateReferenceRegionFromBarcodeResults(textResults, templateName:"P1", error:&error)
```



### updateRuntimeSettingsi
Update runtime settings with a given [`iDLRRuntimeSettings`](dlr-runtime-settings.md) class object.

```objc
- (void)updateRuntimeSettings:(iDLRRuntimeSettings*)settings error:(NSError**)error
```   
   
**Parameters**
`settings` The class object of template settings.  
`[in,out] error` Input a pointer to an error object. If an error occurs, this pointer is set to an actual error object containing the error information. You may specify nil for this parameter if you do not want the error information.


**Code Snippet**
Objective-C:
```objc
DynamsoftLabelRecognizer *recognizer;
iDMDLSConnectionParameters* lts = [[iDMDLSConnectionParameters alloc] init];
lts.organizationID = @"200001";
recognizer = [[DynamsoftLabelRecognizer alloc] initLicenseFromDLS:lts verificationDelegate:self];
- (void)DLSLicenseVerificationCallback:(bool)isSuccess error:(NSError * )error
{
    //TODO add your code for license verification
}
NSError __autoreleasing *  error;
iDLRRuntimeSettings *settings;
settings.linesCount = 1;
[recognizer updateRuntimeSettings:settings error:&error];
```

Swift:
```Swift
let lts = iDMDLSConnectionParameters()
lts.organizationID = "200001"
let recognizer = DynamsoftLabelRecognizer(licenseFromDLS: lts, verificationDelegate: self)
let error: NSError? = NSError()
let settings = recognizer.getRuntimeSettings(&error)
settings.linesCount = 1;
recognizer.updateRuntimeSettings(settings, error:&error);
```

 
   
## Recognizing
   
  | Method               | Description |
  |----------------------|-------------|
  | [`recognizeByBuffer`](#recognizebybuffer) | Recognizes text from memory buffer containing image pixels in defined format. |
  | [`recognizeByFile`](#recognizebyfile) | Recognizes text from a specified image file. |
  | [`recognizeByImage`](#recognizebyimage) | Recognizes text from an image in memory. |

### recognizeByBuffer
Recognizes text from the memory buffer containing image pixels in defined format.

```objc
- (NSArray<iDLRResult*>*)recognizeByBuffer:(iImageData*)imageData templateName:(NSString*)templateName error:(NSError**)error
```   
   
**Parameters**
`[in]	imageData` An object of iImageData that represents an image.  
`[in]	templateName` The template name. A template name is the value of key LabelRecognizerParameter.Name defined in JSON formatted settings. If no template name is specified, current runtime settings will be used.
`[in,out] error` Input a pointer to an error object. If an error occurs, this pointer is set to an actual error object containing the error information. You may specify nil for this parameter if you do not want the error information.

**Return value**
All results recognized successfully.

**Code Snippet**
Objective-C:
```objc
DynamsoftLabelRecognizer *recognizer;
iDMDLSConnectionParameters* lts = [[iDMDLSConnectionParameters alloc] init];
lts.organizationID = @"200001";
recognizer = [[DynamsoftLabelRecognizer alloc] initLicenseFromDLS:lts verificationDelegate:self];
- (void)DLSLicenseVerificationCallback:(bool)isSuccess error:(NSError * )error
{
    //TODO add your code for license verification
}
iDLRResult *result;
iImageData *imageData = [[iImageData alloc] init];
//construct imageData
NSError __autoreleasing *  error;
result = [recognizer recognizeByBuffer:imageData templateName:@"" error:&error];
```

Swift:
```Swift
let lts = iDMDLSConnectionParameters()
lts.organizationID = "200001"
lts.sessionPassword = "******"
let recognizer = DynamsoftLabelRecognizer(licenseFromDLS: lts, verificationDelegate: self)
let imageData = iImageData.init()
let error: NSError? = NSError()
//construct imageData
let result = recognizer.recognizeByBuffer(imageData:imageData, templateName:"", error:&error)
```


### recognizeByFile
Recognizes text from a specified image file.

```objc
- (NSArray<iDLRResult*>*)recognizeByFile:(NSString*)name templateName:(NSString*)templateName error:(NSError**)error
```   
   
**Parameters**
`[in] name` A string defining the file name.  
`[in] templateName` The template name. A template name is the value of key LabelRecognizerParameter.Name defined in JSON formatted settings. If no template name is specified, current runtime settings will be used.
`[in,out] error` Input a pointer to an error object. If an error occurs, this pointer is set to an actual error object containing the error information. You may specify nil for this parameter if you do not want the error information.

**Return value**
All results recognized successfully.


**Code Snippet**
Objective-C:
```objc
DynamsoftLabelRecognizer *recognizer;
iDMDLSConnectionParameters* lts = [[iDMDLSConnectionParameters alloc] init];
lts.organizationID = @"200001";
recognizer = [[DynamsoftLabelRecognizer alloc] initLicenseFromDLS:lts verificationDelegate:self];
- (void)DLSLicenseVerificationCallback:(bool)isSuccess error:(NSError * )error
{
    //TODO add your code for license verification
}
iDLRResult *result;
NSError __autoreleasing *  error;
result = [recognizer recognizeByFile:@"your file path" templateName:@"" error:&error];

```
Swift:
```Swift
let lts = iDMDLSConnectionParameters()
lts.organizationID = "200001"
let recognizer = DynamsoftLabelRecognizer(licenseFromDLS: lts, verificationDelegate: self)
let error: NSError? = NSError()
let result = recognizer.recognizeByFile("your file path", templateName:"", error:&error)
```

 
### recognizeByImage
Recognizes text from an image in memory.

```objc
- (NSArray<iDLRResult*>* _Nullable)recognizeByImage:(UIImage* _Nonnull)image withTemplate:(NSString* _Nonnull)templateName error:(NSError* _Nullable * _Nullable)error;
```  

**Parameters**

`[in] image` The image file in memory.
`[in] templateName` The template name.
`[in, out] error` Input a pointer to an error object. If an error occurs, this pointer is set to an actual error object containing the error information. You may specify nil for this parameter if you do not want the error information.

**Return value**

All results recognized successfully.

**Code Snippet**

Objective-C:

```objc
DynamsoftLabelRecognizer *recognizer;
iDMDLSConnectionParameters* lts = [[iDMDLSConnectionParameters alloc] init];
lts.organizationID = @"200001";
recognizer = [[DynamsoftLabelRecognizer alloc] initLicenseFromDLS:lts verificationDelegate:self];
- (void)DLSLicenseVerificationCallback:(bool)isSuccess error:(NSError * )error
{
    //TODO add your code for license verification
}
iDLRResult *result;
NSError __autoreleasing *  error;
UIImage *image = [[UIImage alloc] init];
NSArray<iDLRResult*>* result = [recognizer recognizeByImage:image withTemplate:@"" error:&error];
```

Swift:

```Swift
let lts = iDMDLSConnectionParameters()
lts.organizationID = "200001"
let recognizer = DynamsoftLabelRecognizer(licenseFromDLS: lts, verificationDelegate: self)
let error: NSError? = NSError()
let image: UIImage? = UIImage()
let result = recognizer.recognizeByImage(image:image withTemplate:"" error:&error)
```
   


## General
   
  | Method               | Description |
  |----------------------|-------------|
  | [`getVersion`](#getversion) | Returns the version number string for the SDK. |
   
### getVersion

Get version information of SDK.

```objc
- (NSString*)getVersion;
```

**Return value**
The version information string.

**Code Snippet**
Objective-C:
```objc
DynamsoftLabelRecognizer *recognizer;
recognizer = [[DynamsoftLabelRecognizer alloc] init];
NSString* versionInfo = [recognizer getVersion];
```

Swift:

```Swift
let recognizer = DynamsoftLabelRecognizer.init()
let versionInfo = recognizer.getVersion();
```

 
