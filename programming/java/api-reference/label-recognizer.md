---
layout: default-layout
title: Dynamsoft Label Recognizer Java API Reference - LabelRecognizer Class
description: This page shows LabelRecognizer of Dynamsoft Label Recognizer for Java API Reference.
keywords: api reference, java
needAutoGenerateSidebar: true
needGenerateH3Content: true
noTitleIndex: true
---


# class com.dynamsoft.dlr.LabelRecognizer



## Initialization
  
  | Method               | Description |
  |----------------------|-------------|
  | [`LabelRecognizer`](#labelrecognizer) | Initialization of `LabelRecognizer` object.|
  | [`destroy`](#destroy) | Destroys an instance of `LabelRecognizer` object.|   
  | [`initLicense`](#initlicense) | Sets the license and activates the SDK. |
  | [`initDLSConnectionParameters`](#initdlsconnectionparameters) | Initializes a DMDLSConnectionParameters struct with default values. |  
  | [`initLicenseFromDLS`](#initlicensefromdls) | Initializes the label recognizer license and connects to the specified server for online verification. |



### LabelRecognizer

Initialization of `LabelRecognizer` object without or with a license.

```java
LabelRecognizer() throws LabelRecognizerException;
LabelRecognizer(String license) throws LabelRecognizerException;
```

**Exceptions**

[`LabelRecognizerException`](label-recognizer-exception.md)


**Remarks**

If you initialize DynamsoftLabelRecognizer without a license, the recognizer results may be unreliable.

**Code Snippet**

```java
LabelRecognizer recognizer = new LabelRecognizer();
LabelRecognizer recognizer = new LabelRecognizer("t0260NwAAAHV***************");
```




### destroy

Destroys an instance of `LabelRecognizer` object.

```java
void destroy()	
```

**Code Snippet**

```java
LabelRecognizer recognizer = new LabelRecognizer("t0260NwAAAHV***************");
recognizer.destroy();
```


### initLicense
Sets product key and activate the SDK.

```java
void initLicense(String license) throws LabelRecognizerException
```   

**Parameters**
`license`: The product keys.

**Exceptions**

[`LabelRecognizerException`](label-recognizer-exception.md)

**Code Snippet**
```java
LabelRecognizer recognizer = new LabelRecognizer();
recognizer.initLicense("t0260NwAAAHV***************");
```




### initDLSConnectionParameters
Initializes a DMDLSConnectionParameters struct with default values.

```java
static DMDLSConnectionParameters initDLSConnectionParameters() throws LabelRecognizerException
```   

**Return value**

An instance of DMDLSConnectionParameters.

**Exceptions**

[`LabelRecognizerException`](label-recognizer-exception.md)

**Code Snippet**
```java
DMDLSConnectionParameters info = LabelRecognizer.initDLSConnectionParameters();
info.organiztionID = "<your organization id got from Dynamsoft>";
LabelRecognizer.initLicenseFromDLS(info);
```


### initLicenseFromDLS
Initializes the label recognizer license and connects to the specified server for online verification.

```java
static void initLicenseFromDLS(DMDLSConnectionParameters ltsInfo) throws LabelRecognizerException
```   

**Parameters**
- `ltsInfo`: The struct DMDLSConnectionParameters with customized settings.  

**Exceptions**

[`LabelRecognizerException`](label-recognizer-exception.md)

**Code Snippet**
```java
DMDLSConnectionParameters info = LabelRecognizer.initDLSConnectionParameters();
info.organiztionID = "<your organization id got from Dynamsoft>";
LabelRecognizer.initLicenseFromDLS(info);
```



## Settings

  | Method               | Description |
  |----------------------|-------------|
  | [`getRuntimeSettings`](#getruntimesettings) | Gets the current settings and saves it into a struct. |
  | [`updateRuntimeSettings`](#updateruntimesettings) | Updates runtime settings with a given struct. |
  | [`resetRuntimeSettings`](#resetruntimesettings) | Resets the runtime settings. |
  | [`appendSettingsFromString`](#appendsettingsfromstring) | Appends LabelRecognizerParameter settings in a string to the SDK object. |
  | [`appendSettingsFromFile`](#appendsettingsfromFile) | Appends LabelRecognizerParameter settings from a file to the SDK object. |
  | [`outputSettingsToFile`](#outputsettingstofile) | Outputs LabelRecognizerParameter settings into a file (JSON file). |
  | [`clearAppendedSettings`](#clearappendedsettings) | Clear all appended LabelRecognizerParameter settings in the SDK object. |
  | [`updateReferenceRegionFromBarcodeResults`](#updatereferenceregionfrombarcoderesults) | Updates reference region which is defined with source type LST_BARCODE. |
  | [`getModeArgument`](#getmodeargument) | Get argument value for the specified mode parameter. |
  | [`setModeArgument`](#setmodeargument) | Set argument value for the specified mode parameter. |



### getRuntimeSettings
Get current settings and save them into a [`DLRRuntimeSettings`](dlr-runtime-settings.html) class object.

```java
PublicRuntimeSettings getRuntimeSettings () throws LabelRecognizerException
```   
   
**Return value**

The class object of template settings.

**Exceptions**

[`LabelRecognizerException`](label-recognizer-exception.md)

**Code Snippet**
```java
LabelRecognizer recognizer = new LabelRecognizer();
DLRRuntimeSettings settings = recognizer.getRuntimeSettings();
recognizer.destroy();
```



### updateRuntimeSettings
Update runtime settings with a given [`DLRRuntimeSettings`](dlr-runtime-settings.html) class object.

```java
void updateRuntimeSettings (DLRRuntimeSettings settings) throws LabelRecognizerException
```   
   
**Parameters**
`settings` The class object of template settings.  

**Exceptions**

[`LabelRecognizerException`](label-recognizer-exception.md)

**Code Snippet**
```java
LabelRecognizer recognizer = new LabelRecognizer();

DLRRuntimeSettings settings = recognizer.getRuntimeSettings();
settings.linesCount = 1;
recognizer.updateRuntimeSettings(settings);
recognizer.destroy();
```




### resetRuntimeSettings
Reset all runtime settings to default values.

```java
void resetRuntimeSettings () throws LabelRecognizerException
```   
   
**Exceptions**
[`LabelRecognizerException`](label-recognizer-exception.md)

**Code Snippet**
```java
LabelRecognizer recognizer = new LabelRecognizer();
DLRRuntimeSettings settings = recognizer.getRuntimeSettings();
settings.linesCount = 1;
recognizer.updateRuntimeSettings(settings);
recognizer.resetRuntimeSettings();
recognizer.destroy();
```




### outputSettingsToFile
Outputs runtime settings and save them into a settings file (JSON file).  

```java
void outputSettingsToFile (String filePath, String templateName) throws LabelRecognizerException
```   
   
**Parameters**
`filePath` The path of the output file which stores current settings.  
`templateName` A unique name for declaring current runtime settings.  


**Exceptions**

[`LabelRecognizerException`](label-recognizer-exception.md)

**Code Snippet**
```java
LabelRecognizer recognizer = new LabelRecognizer();
recognizer.appendSettingsFromString("{\"LabelRecognizerParameter\":{\"Name\":\"P1\", \"RegionPredetectionModes\":[{\"Mode\":\"RPM_GENERAL_HSV_CONTRAST\"}], \"ReferenceRegionNameArray\": [\"R1\"]},\"ReferenceRegion\":{\"Name\":\"R1\",\"Localization\":{\"SourceType\":\"LST_PREDETECTED_REGION\",\"RegionPredetectionModesIndex\":0},\"TextAreaNameArray\":[\"T1\"]},\"TextArea\":{\"Name\":\"T1\",\"CharacterModelName\":\"Number\"}}");
recognizer.outputSettingsToFile("your saving file path", "currentRuntimeSettings");
recognizer.destroy();
```





### appendSettingsFromFile
Appends LabelRecognizerParameter settings in a file to the SDK object.

```java
void appendSettingsFromFile (String filePath) throws LabelRecognizerException
```   
   
**Parameters**
`filePath` The settings file path.   


**Exceptions**

[`LabelRecognizerException`](label-recognizer-exception.md)

**Code Snippet**
```java
LabelRecognizer recognizer = new LabelRecognizer();
recognizer.appendSettingsFromFile("your file path");
recognizer.destroy();
```




### appendSettingsFromString
Append a new template string to the current label recognizer instance.

```java
void appendSettingsFromString (String content) throws LabelRecognizerException
```   
   
**Parameters**
`content` A JSON string that represents the content of the settings.   

**Exceptions**

[`LabelRecognizerException`](label-recognizer-exception.md)

**Code Snippet**
```java
LabelRecognizer recognizer = new LabelRecognizer();
recognizer.appendSettingsFromString("{\"LabelRecognizerParameter\":{\"Name\":\"P1\", \"RegionPredetectionModes\":[{\"Mode\":\"RPM_GENERAL_HSV_CONTRAST\"}], \"ReferenceRegionNameArray\": [\"R1\"]},\"ReferenceRegion\":{\"Name\":\"R1\",\"Localization\":{\"SourceType\":\"LST_PREDETECTED_REGION\",\"RegionPredetectionModesIndex\":0},\"TextAreaNameArray\":[\"T1\"]},\"TextArea\":{\"Name\":\"T1\",\"CharacterModelName\":\"Number\"}}");
recognizer.destroy();
```



### clearAppendedSettings
Clear all appended parameter settings of the current label recognizer instance.

```java
void clearAppendedSettings () throws LabelRecognizerException
```   
   
**Code Snippet**
```java
LabelRecognizer recognizer = new LabelRecognizer();
recognizer.clearAppendedSettings();
```




### getModeArgument

Get argument value for the specified mode parameter.

```java
String getModeArgument (String modesName, int index, String argumentName) throws LabelRecognizerException	
```   
   
**Parameters**  
- `modesName`: The mode parameter name to get argument.  
- `index`: The array index of mode parameter to indicate a specific mode.  
- `argumentName`: The name of the argument to get.

**Return value**
the optional argument for a specified mode in Modes parameters.

**Exceptions**
[`LabelRecognizerException`](label-recognizer-exception.md)

#### Remark
Check follow link for available modes and arguments:
- [`RegionPredetectionModes`]({{ site.parameters-reference }}label-recognizer-parameter/region-predetection-modes.html#regionpredetectionmodes)

**Code Snippet**
```java
LabelRecognizer recognizer = new LabelRecognizer();
DLRRuntimeSettings settings = recognizer.getRuntimeSettings();
settings.regionPredetectionModes[0] = EnumRegionPredetectionMode.RPM_GENERAL_RGB_CONTRAST;
recognizer.updateRuntimeSettings(settings);
recognizer.setModeArgument("RegionPredetectionModes", 0, "AspectRatioRange", "100");
String argumentValue = recognizer.getModeArgument("RegionPredetectionModes", 0, "AspectRatioRange");
recognizer.destroy();
```






### setModeArgument

Set argument value for the specified mode parameter.


```java
void setModeArgument (String modesName, int index, String argumentName, String argumentValue)	throws LabelRecognizerException	
```   
**Parameters**
- `modesName`: The mode parameter name to set argument.
- `index`: The array index of mode parameter to indicate a specific mode.  
- `argumentName`: The name of the argument to set.  
- `argumentValue`: The value of the argument to set. 

**Exceptions**
[`LabelRecognizerException`](label-recognizer-exception.md)


#### Remark
Check follow link for available modes and arguments:
- [`RegionPredetectionModes`]({{ site.parameters-reference }}label-recognizer-parameter/region-predetection-modes.html#regionpredetectionmodes)

**Code Snippet**
```java
LabelRecognizer recognizer = new LabelRecognizer();
DLRRuntimeSettings settings = recognizer.getRuntimeSettings();
settings.regionPredetectionModes[0] = EnumRegionPredetectionMode.RPM_GENERAL_RGB_CONTRAST;
recognizer.updateRuntimeSettings(settings);
recognizer.setModeArgument("RegionPredetectionModes", 0, "AspectRatioRange", "100");
recognizer.destroy();
```




### updateReferenceRegionFromBarcodeResults
Updates reference region which is defined with source type LST_BARCODE.  

```java
void updateReferenceRegionFromBarcodeResults (BarcodeResult[] barcodeResults, String templateName) throws LabelRecognizerException
```   
   
**Parameters**
`barcodeResults` The barcode results used to localize reference region. See also [`BarcodeResult`](barcode-result.md).
`templateName` The template name. A template name is the value of key LabelRecognizerParameter.Name defined in JSON formatted settings. If no template name is specified, current runtime settings will be used.


**Exceptions**

[`LabelRecognizerException`](label-recognizer-exception.md)


**Code Snippet**
```java
LabelRecognizer recognizer = new LabelRecognizer();

recognizer.appendSettingsFromString("{\"LabelRecognizerParameter\":{\"Name\":\"P1\", \"RegionPredetectionModes\":[{\"Mode\":\"RPM_GENERAL_HSV_CONTRAST\"}], \"ReferenceRegionNameArray\": [\"R1\"]},\"ReferenceRegion\":{\"Name\":\"R1\",\"Localization\":{\"SourceType\":\"LST_BARCODE\"},\"TextAreaNameArray\":[\"T1\"]},\"TextArea\":{\"Name\":\"T1\",\"CharacterModelName\":\"Number\"}}");

//Get barcodeResults from Dynamsoft Barcode Reader SDK
recognizer.updateReferenceRegionFromBarcodeResults(barcodeResults, "P1");
recognizer.destroy();
```




   
## Recognizing
   
  | Method               | Description |
  |----------------------|-------------|
  | [`recognizeByBuffer`](#recognizebybuffer) | Recognizes text from memory buffer containing image pixels in defined format. |
  | [`recognizeByFile`](#recognizebyfile) | Recognizes text from a specified image file. |
   

### recognizeByBuffer
Recognizes text from the memory buffer containing image pixels in defined format.

```java
DLRResult[] recognizeByBuffer(DLRImageData imageData, String templateName) throws LabelRecognizerException
```   
   
**Parameters**
`[in]	imageData` An object of DLRImageData that represents an image.  
`[in]	templateName` The template name. A template name is the value of key LabelRecognizerParameter.Name defined in JSON formatted settings. If no template name is specified, current runtime settings will be used.

**Return value**
All results recognized successfully.

**Exceptions**

[`LabelRecognizerException`](label-recognizer-exception.md)

**Code Snippet**
```java
LabelRecognizer recognizer = new LabelRecognizer();
// 1. init license...
// 2. Generate imageData from somewhere else...
DLRResult[] result = recognizer.recognizeByBuffer(imageData, "");
recognizer.destroy();
```




### recognizeByFile
Recognizes text from a specified image file.

```java
DLRResult[] recognizeByFile (String fileName, String templateName) throws LabelRecognizerException	
```   
   
**Parameters**
`fileName` A string defining the file name.  
`templateName` The template name. A template name is the value of key LabelRecognizerParameter.Name defined in JSON formatted settings. If no template name is specified, current runtime settings will be used.

**Return value**
All results recognized successfully.

**Exceptions**

[`LabelRecognizerException`](label-recognizer-exception.md)

**Code Snippet**
```java
LabelRecognizer recognizer = new LabelRecognizer();
// 1. init license...
DLRResult[] result = recognizer.recognizeByFile("full file path", "");
recognizer.destroy();
```


   

   
## General
   
  | Method               | Description |
  |----------------------|-------------|
  | [`getVersion`](#getversion) | Returns the version number string for the SDK. |

### getVersion

Get version information of SDK.

```java
String getVersion()	
```

**Return value**

The version information string.

**Code Snippet**

```java
LabelRecognizer recognizer = new LabelRecognizer();
String versionInfo = recognizer.getVersion();
recognizer.destroy();
``` 
