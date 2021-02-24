---
layout: default-layout
title: Dynamsoft Label Recognition Objective-C & Swift API Reference - Settings
description: This is the settings functions of Dynamsoft Label Recognition for Objective-C & Swift API Reference.
keywords: api reference, objective-c, oc, swift
needAutoGenerateSidebar: true
---

# Objective-C & Swift API Reference - Settings

| Method               | Description |
|----------------------|-------------|
  | [`appendCharacterModel`](#appendCharacterModel) | Appends CharacterModel to the SDK object. |
  | [`appendSettingsFromString`](#appendsettingsfromstring) | Appends LabelRecognitionParameter settings in a string to the SDK object. |
  | [`clearAppendedSettings`](#clearappendedsettings) | Clears appended LabelRecognitionParameter settings. |
  | [`eraseAllCharacterModels`](#appendCharacterModel) | Erases all CharacterModels the SDK object currently loaded. |
  | [`eraseCharacterModelByName`](#appendCharacterModel) | Erases a name specified CharacterModel from the SDK object. |
  | [`getModeArgument`](#getmodeargument) | Get argument value for the specified mode parameter. |
  | [`getRuntimeSettings`](#getruntimesettings) | Gets the current settings and saves it into a class object. |
  | [`outputSettingsToFile`](#outputsettingstofile) | Outputs LabelRecognitionParameter settings into a file (JSON file). |
  | [`resetRuntimeSettings`](#resetruntimesettings) | Resets the runtime settings. |
  | [`setModeArgument`](#setmodeargument) | Set argument value for the specified mode parameter. |
  | [`updateReferenceRegionFromBarcodeResults`](#updatereferenceregionfrombarcoderesults) | Updates reference region which is defined with source type DLR_LST_BARCODE. |
  | [`updateRuntimeSettings`](#updateruntimesettings) | Updates runtime settings with a given class object. |

---

## appendCharacterModel
Appends CharacterModel to the SDK object.

```objc
- (void)appendCharacterModel:(NSString*)name prototxtBuffer:(NSData*)prototxtBuffer txtBuffer:(NSData*)txtBuffer characterModelBuffer:(NSData*)characterModelBuffer
```   
   
### Parameters
`name` A unique name for the appended CharacterModel.   
`prototxtBuffer` The .prototxt file data of the CharacterModel in a byte array.   
`txtBuffer` The .txt file data of the CharacterModel in a byte array.   
`characterModelBuffer` The .caffemodel file data of the CharacterModel in a byte array.   


### Code Snippet
Objective-C:
```objc
DynamsoftLabelRecognition *recognizer;
recognizer = [[DynamsoftLabelRecognition alloc] initWithLicense:@"t0260NwAAAHV***************"];
//construct prototxtBuffer, txtBuffer and characterModelBuffer
[recognizer appendCharacterModel:@"your model name" prototxtBuffer: prototxtBuffer txtBuffer: txtBuffer characterModelBuffer: characterModelBuffer];
```
Swift:
```Swift
let recognizer = DynamsoftLabelRecognition.initWithLicense(license: "t0260NwAAAHV***************")
//construct prototxtBuffer, txtBuffer and characterModelBuffer
recognizer.appendCharacterModel("your model name", prototxtBuffer: prototxtBuffer, txtBuffer: txtBuffer, characterModelBuffer: characterModelBuffer)
```

&nbsp;


## appendSettingsFromString
Append a new template string to the current label recognition instance.

```objc
- (void)appendSettingsFromString:(NSString*)content error:(NSError**)error
```   
   
### Parameters
`content` A JSON string that represents the content of the settings.   
`[in,out] error` Input a pointer to an error object. If an error occurs, this pointer is set to an actual error object containing the error information. You may specify nil for this parameter if you do not want the error information.


### Code Snippet
Objective-C:
```objc
DynamsoftLabelRecognition *recognizer;
recognizer = [[DynamsoftLabelRecognition alloc] initWithLicense:@"t0260NwAAAHV***************"];
NSError __autoreleasing *  error;
[recognizer appendSettingsFromString:@"{\"LabelRecognitionParameter\":{\"Name\":\"P1\", \"RegionPredetectionModes\":[{\"Mode\":\"DLR_RPM_GENERAL_HSV_CONTRAST\"}], \"ReferenceRegionNameArray\": [\"R1\"]},\"ReferenceRegion\":{\"Name\":\"R1\",\"Localization\":{\"SourceType\":\"DLR_LST_PREDETECTED_REGION\",\"RegionPredetectionModesIndex\":0},\"TextAreaNameArray\":[\"T1\"]},\"TextArea\":{\"Name\":\"T1\",\"CharacterModelName\":\"Number\"}}" error:&error];
```
Swift:
```Swift
let recognizer = DynamsoftLabelRecognition.initWithLicense(license: "t0260NwAAAHV***************")
let error: NSError? = NSError()
recognizer.appendSettingsFromString("{\"LabelRecognitionParameter\":{\"Name\":\"P1\", \"RegionPredetectionModes\":[{\"Mode\":\"DLR_RPM_GENERAL_HSV_CONTRAST\"}], \"ReferenceRegionNameArray\": [\"R1\"]},\"ReferenceRegion\":{\"Name\":\"R1\",\"Localization\":{\"SourceType\":\"DLR_LST_PREDETECTED_REGION\",\"RegionPredetectionModesIndex\":0},\"TextAreaNameArray\":[\"T1\"]},\"TextArea\":{\"Name\":\"T1\",\"CharacterModelName\":\"Number\"}}", error:&error)
```

&nbsp;


## clearAppendedSettings
Clear all appended parameter settings of the current label recognition instance.

```objc
- (void)clearAppendedSettings:(NSError**)error;
```   

### Parameters
`[in,out] error` Input a pointer to an error object. If an error occurs, this pointer is set to an actual error object containing the error information. You may specify nil for this parameter if you do not want the error information.

### Code Snippet
Objective-C:
```objc
DynamsoftLabelRecognition *recognizer;
recognizer = [[DynamsoftLabelRecognition alloc] initWithLicense:@"t0260NwAAAHV***************"];
NSError __autoreleasing *  error;
[recognizer clearAppendedSettings:&error];
```
Swift:
```Swift
let recognizer = DynamsoftLabelRecognition.initWithLicense(license: "t0260NwAAAHV***************")
let error: NSError? = NSError()
recognizer.clearAppendedSettings(&error)
```
&nbsp;


## eraseAllCharacterModels
Erases all CharacterModels the SDK object currently loaded.

```objc
- (void)eraseAllCharacterModels;
```   
   
### Code Snippet
Objective-C:
```objc
DynamsoftLabelRecognition *recognizer;
recognizer = [[DynamsoftLabelRecognition alloc] initWithLicense:@"t0260NwAAAHV***************"];
[recognizer eraseAllCharacterModels];
```
Swift:
```Swift
let recognizer = DynamsoftLabelRecognition.initWithLicense(license: "t0260NwAAAHV***************")
recognizer.eraseAllCharacterModels()
```

&nbsp;


## eraseCharacterModelByName
Clear all appended parameter settings of the current label recognition instance.

```objc
- (void)eraseCharacterModelByName:(NSString*)name
```   

### Parameters
`name` A unique name representing the CharacterModel to erase.   
  
### Code Snippet
Objective-C:
```objc
DynamsoftLabelRecognition *recognizer;
recognizer = [[DynamsoftLabelRecognition alloc] initWithLicense:@"t0260NwAAAHV***************"];
[recognizer eraseCharacterModelByName:@"your model name"];
```
Swift:
```Swift
let recognizer = DynamsoftLabelRecognition.initWithLicense(license: "t0260NwAAAHV***************")
recognizer.eraseCharacterModelByName("your model name")
```

&nbsp;


## getModeArgument

Get argument value for the specified mode parameter.

```objc
- (NSString* _Nonnull)getModeArgument:(NSString* _Nonnull)modeName index:(NSInteger)index argumentName:(NSString* _Nonnull)argumentName error:(NSError* _Nullable * _Nullable)error;
```   
   
### Parameters  
`modeName`: The mode parameter name to get argument.  
`index`: The array index of mode parameter to indicate a specific mode.  
`argumentName`: The name of the argument to get.
`[in,out] error` Input a pointer to an error object. If an error occurs, this pointer is set to an actual error object containing the error information. You may specify nil for this parameter if you do not want the error information.

### Return value
the optional argument for a specified mode in Modes parameters.

### Remark
Check follow link for available modes and arguments:
- [`RegionPredetectionModes`]({{ site.parameters-reference }}label-recognition-parameter/region-predetection-modes.html#regionpredetectionmodes)

### Code Snippet
Objective-C:
```objc
DynamsoftLabelRecognition *recognizer;
recognizer = [[DynamsoftLabelRecognition alloc] initWithLicense:@"t0260NwAAAHV***************"];
NSError __autoreleasing *  error;
NSString *argumentValue = [recognizer getModeArgument:@"RegionPredetectionModes" index:0 argumentName:@"AspectRatioRange" error:&error];
```
Swift:
```Swift
let recognizer = DynamsoftLabelRecognition.initWithLicense(license: "t0260NwAAAHV***************")
let error: NSError? = NSError()
let argumentValue = recognizer.getModeArgument("RegionPredetectionModes", index:0, argumentName:"AspectRatioRange", error:&error)
```

&nbsp;


## getRuntimeSettings
Get current settings and save them into a [`DLRRuntimeSettings`](../class/dlr-runtime-settings.html) class object.

```objc
- (iDLRRuntimeSettings*)getRuntimeSettings:(NSError**)error;
```   

### Parameters  
`[in,out] error` Input a pointer to an error object. If an error occurs, this pointer is set to an actual error object containing the error information. You may specify nil for this parameter if you do not want the error information.
   
### Return value

The class object of runtime settings.

### Code Snippet
Objective-C:
```objc
DynamsoftLabelRecognition *recognizer;
recognizer = [[DynamsoftLabelRecognition alloc] initWithLicense:@"t0260NwAAAHV***************"];
NSError __autoreleasing *  error;
iDLRRuntimeSettings* settings = [recognizer getRuntimeSettings:&error];
```
Swift:
```Swift
let recognizer = DynamsoftLabelRecognition.initWithLicense(license: "t0260NwAAAHV***************")
let error: NSError? = NSError()
let settings = recognizer.getRuntimeSettings(&error)
```

&nbsp;

## outputSettingsToFile
Outputs runtime settings and save them into a settings file (JSON file).  

```objc
- (void)outputSettingsToFile:(NSString*)filePath templateName:(NSString*)templateName error:(NSError**)error
```   
   
### Parameters
`filePath` The path of the output file which stores current settings.  
`templateName` A unique name for declaring current runtime settings.  
`[in,out] error` Input a pointer to an error object. If an error occurs, this pointer is set to an actual error object containing the error information. You may specify nil for this parameter if you do not want the error information.


### Code Snippet
Objective-C:
```objc
DynamsoftLabelRecognition *recognizer;
NSString *settingsName;
recognizer = [[DynamsoftLabelRecognition alloc] initWithLicense:@"t0260NwAAAHV***************"];
NSError __autoreleasing *  error;
[recognizer outputSettingsToFile:@"your saving file path" templateName:@"currentRuntimeSettings" error:&error];
```
Swift:
```Swift
let recognizer = DynamsoftLabelRecognition.initWithLicense(license: "t0260NwAAAHV***************")
let error: NSError? = NSError()
recognizer.outputSettingsToFile("your saving file path", templateName:"currentRuntimeSettings", error:&error)
```

&nbsp;


## resetRuntimeSettings
Reset all runtime settings to default values.

```objc
- (void)resetRuntimeSettings:(NSError**)error;
```   
   
### Parameters
`[in,out] error` Input a pointer to an error object. If an error occurs, this pointer is set to an actual error object containing the error information. You may specify nil for this parameter if you do not want the error information.

### Code Snippet
Objective-C:
```objc
DynamsoftLabelRecognition *recognizer;
recognizer = [[DynamsoftLabelRecognition alloc] initWithLicense:@"t0260NwAAAHV***************"];
NSError __autoreleasing *  error;
[recognizer resetRuntimeSettings:&error];
```
Swift:
```Swift
let recognizer = DynamsoftLabelRecognition.initWithLicense(license: "t0260NwAAAHV***************")
let error: NSError? = NSError()
recognizer.resetRuntimeSettings(error:&error)
```


&nbsp;


## setModeArgument

Set argument value for the specified mode parameter.


```objc
- (void)setModeArgument:(NSString* _Nonnull)modeName index:(NSInteger)index argumentName:(NSString* _Nonnull)argumentName argumentValue:(NSString* _Nonnull)argumentValue error:(NSError* _Nullable * _Nullable)error;
```   
### Parameters
`modeName`: The mode parameter name to set argument.
`index`: The array index of mode parameter to indicate a specific mode.  
`argumentName`: The name of the argument to set.  
`argumentValue`: The value of the argument to set. 
`[in,out] error` Input a pointer to an error object. If an error occurs, this pointer is set to an actual error object containing the error information. You may specify nil for this parameter if you do not want the error information.


### Remark
Check follow link for available modes and arguments:
- [`RegionPredetectionModes`]({{ site.parameters-reference }}label-recognition-parameter/region-predetection-modes.html#regionpredetectionmodes)

### Code Snippet
Objective-C:
```objc
DynamsoftLabelRecognition *recognizer;
recognizer = [[DynamsoftLabelRecognition alloc] initWithLicense:@"t0260NwAAAHV***************"];
iDLRRuntimeSettings *settings;
NSError __autoreleasing * _Nullable error;   
[recognizer setModeArgument:@"RegionPredetectionModes" index:0 argumentName:@"AspectRatioRange" argumentValue:"100" error:&error];
```
Swift:
```Swift
let recognizer = DynamsoftLabelRecognition.initWithLicense(license: "t0260NwAAAHV***************")
let error: NSError? = NSError()
recognizer.setModeArgument("RegionPredetectionModes", index:0, argumentName:"AspectRatioRange", argumentValue:"100", error:&error)
```

&nbsp;


## updateReferenceRegionFromBarcodeResults
Updates reference region which is defined with source type DLR_LST_BARCODE.  

```objc
- (void)updateReferenceRegionFromBarcodeResults:(NSArray<iTextResult*>*)barcodeResults templateName:(NSString *)templateName error:(NSError**)error
```   
   
### Parameters
`barcodeResults` The barcode results used to localize reference region.  
`templateName` The template name. A template name is the value of key LabelRecognitionParameter.Name defined in JSON formatted settings. If no template name is specified, current runtime settings will be used.
`[in,out] error` Input a pointer to an error object. If an error occurs, this pointer is set to an actual error object containing the error information. You may specify nil for this parameter if you do not want the error information.


### Code Snippet
Objective-C:
```objc
DynamsoftLabelRecognition *recognizer;
recognizer = [[DynamsoftLabelRecognition alloc] initWithLicense:@"t0260NwAAAHV***************"];
NSArray<iTextResult*> *textResults;
//get textResults from Dynamsoft Barcode Reader SDK
NSError __autoreleasing *error;
[recognizer appendSettingsFromString:@"{\"LabelRecognitionParameter\":{\"Name\":\"P1\", \"RegionPredetectionModes\":[{\"Mode\":\"DLR_RPM_GENERAL_HSV_CONTRAST\"}], \"ReferenceRegionNameArray\": [\"R1\"]},\"ReferenceRegion\":{\"Name\":\"R1\",\"Localization\":{\"SourceType\":\"DLR_LST_BARCODE\"},\"TextAreaNameArray\":[\"T1\"]},\"TextArea\":{\"Name\":\"T1\",\"CharacterModelName\":\"Number\"}}" error:&error];
[recognizer updateReferenceRegionFromBarcodeResults:textResults templateName:@"P1" error:&error];
```
Swift:
```Swift
let recognizer = DynamsoftLabelRecognition.initWithLicense(license: "t0260NwAAAHV***************")
var textResults = [iTextResult]()
//get textResults from Dynamsoft Barcode Reader SDK
let error: NSError? = NSError()
recognizer.appendSettingsFromString("{\"LabelRecognitionParameter\":{\"Name\":\"P1\", \"RegionPredetectionModes\":[{\"Mode\":\"DLR_RPM_GENERAL_HSV_CONTRAST\"}], \"ReferenceRegionNameArray\": [\"R1\"]},\"ReferenceRegion\":{\"Name\":\"R1\",\"Localization\":{\"SourceType\":\"DLR_LST_BARCODE\"},\"TextAreaNameArray\":[\"T1\"]},\"TextArea\":{\"Name\":\"T1\",\"CharacterModelName\":\"Number\"}}", error:&error)
recognizer.updateReferenceRegionFromBarcodeResults(textResults, templateName:"P1", error:&error)
```

&nbsp;

## updateRuntimeSettings
Update runtime settings with a given [`DLRRuntimeSettings`](../class/dlr-runtime-settings.html) class object.

```objc
- (void)updateRuntimeSettings:(iDLRRuntimeSettings*)settings error:(NSError**)error
```   
   
### Parameters
`settings` The class object of template settings.  
`[in,out] error` Input a pointer to an error object. If an error occurs, this pointer is set to an actual error object containing the error information. You may specify nil for this parameter if you do not want the error information.


### Code Snippet
Objective-C:
```objc
DynamsoftLabelRecognition *recognizer;
recognizer = [[DynamsoftLabelRecognition alloc] initWithLicense:@"t0260NwAAAHV***************"];
NSError __autoreleasing *  error;
iDLRRuntimeSettings *settings;
settings.linesCount = 1;
[recognizer updateRuntimeSettings:settings error:&error];
```
Swift:
```Swift
let recognizer = DynamsoftLabelRecognition.initWithLicense(license: "t0260NwAAAHV***************")
let error: NSError? = NSError()
let settings = recognizer.getRuntimeSettings(&error)
settings.linesCount = 1;
recognizer.updateRuntimeSettings(settings, error:&error);
```
&nbsp;

