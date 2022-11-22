---
layout: default-layout
title: LabelRecognition Class - Dynamsoft Label Recognizer Java Edition
description: This page shows LabelRecognition methods of Dynamsoft Label Recognition for Java API Reference.
keywords: api reference, java
needAutoGenerateSidebar: true
needGenerateH3Content: true
---


# LabelRecognition

```java
class com.dynamsoft.dlr.LabelRecognition
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

**Return Value**

The version information string.

**Code Snippet**

```java
LabelRecognition recognizer = new LabelRecognition();
String versionInfo = recognizer.getVersion();
recognizer.destroy();
``` 

&nbsp; 

## Initialization
  
  | Method               | Description |
  |----------------------|-------------|
  | [`LabelRecognition`](#labelrecognition) | Initialization of `LabelRecognition` object.|
  | [`destroy`](#destroy) | Destroys an instance of `LabelRecognition` object.|   
  | [`initLicense`](#initlicense) | Sets the license and activates the SDK. |
  | [`initLicenseFromLTS`](#initlicensefromlts) | Initializes the label recognition license and connects to the specified server for online verification. |

### LabelRecognition

Initialization of `LabelRecognition` object without or with a license.

```java
LabelRecognition() throws LabelRecognitionException;
LabelRecognition(String license) throws LabelRecognitionException;
```

**Exceptions**

[`LabelRecognitionException`](label-recognition-exception.md)


**Remarks**

If you initialize DynamsoftLabelRecognition without a license, the recognition results may be unreliable.

**Code Snippet**

```java
LabelRecognition recognizer = new LabelRecognition();
LabelRecognition recognizer = new LabelRecognition("t0260NwAAAHV***************");
```

&nbsp;


### destroy

Destroys an instance of `LabelRecognition` object.

```java
void destroy()	
```

**Code Snippet**

```java
LabelRecognition recognizer = new LabelRecognition("t0260NwAAAHV***************");
recognizer.destroy();
```


### initLicense
Sets product key and activate the SDK.

```java
void initLicense(String license) throws LabelRecognitionException
```   

**Parameters**
`license`: The product keys.

**Exceptions**

[`LabelRecognitionException`](label-recognition-exception.md)

**Code Snippet**
```java
LabelRecognition recognizer = new LabelRecognition();
recognizer.initLicense("t0260NwAAAHV***************");
```

&nbsp;


### initLicenseFromLTS
Initializes the label recognition license and connects to the specified server for online verification.

```java
void initLicenseFromLTS(DMLTSConnectionParameters ltsInfo) throws LabelRecognitionException
```   

**Parameters**
- `ltsInfo`: The struct DMLTSConnectionParameters with customized settings.  

**Exceptions**

[`LabelRecognitionException`](label-recognition-exception.md)

**Code Snippet**
```java
LabelRecognition recognizer = new LabelRecognition();
DMLTSConnectionParameters info = new DMLTSConnectionParameters();
info.organiztionID = "<your organization id got from Dynamsoft>";
recognizer.initLicenseFromLTS(info);
```

&nbsp; 

## Settings

  | Method               | Description |
  |----------------------|-------------|
  | [`getRuntimeSettings`](#getruntimesettings) | Gets the current settings and saves it into a struct. |
  | [`updateRuntimeSettings`](#updateruntimesettings) | Updates runtime settings with a given struct. |
  | [`resetRuntimeSettings`](#resetruntimesettings) | Resets the runtime settings. |
  | [`appendSettingsFromString`](#appendsettingsfromstring) | Appends LabelRecognitionParameter settings in a string to the SDK object. |
  | [`appendSettingsFromFile`](#appendsettingsfromFile) | Appends LabelRecognitionParameter settings from a file to the SDK object. |
  | [`outputSettingsToFile`](#outputsettingstofile) | Outputs LabelRecognitionParameter settings into a file (JSON file). |
  | [`clearAppendedSettings`](#clearappendedsettings) | Clear all appended LabelRecognitionParameter settings in the SDK object. |
  | [`updateReferenceRegionFromBarcodeResults`](#updatereferenceregionfrombarcoderesults) | Updates reference region which is defined with source type DLR_LST_BARCODE. |
  | [`getModeArgument`](#getmodeargument) | Get argument value for the specified mode parameter. |
  | [`setModeArgument`](#setmodeargument) | Set argument value for the specified mode parameter. |



### getRuntimeSettings
Get current settings and save them into a [`DLRRuntimeSettings`](dlr-runtime-settings.html) class object.

```java
PublicRuntimeSettings getRuntimeSettings () throws LabelRecognitionException
```   
   
**Return Value**

The class object of template settings.

**Exceptions**

[`LabelRecognitionException`](label-recognition-exception.md)

**Code Snippet**
```java
LabelRecognition recognizer = new LabelRecognition();
DLRRuntimeSettings settings = recognizer.getRuntimeSettings();
recognizer.destroy();
```

&nbsp;

### updateRuntimeSettings
Update runtime settings with a given [`DLRRuntimeSettings`](dlr-runtime-settings.html) class object.

```java
void updateRuntimeSettings (DLRRuntimeSettings settings) throws LabelRecognitionException
```   
   
**Parameters**
`settings` The class object of template settings.  

**Exceptions**

[`LabelRecognitionException`](label-recognition-exception.md)

**Code Snippet**
```java
LabelRecognition recognizer = new LabelRecognition();

DLRRuntimeSettings settings = recognizer.getRuntimeSettings();
settings.linesCount = 1;
recognizer.updateRuntimeSettings(settings);
recognizer.destroy();
```

&nbsp; 


### resetRuntimeSettings
Reset all runtime settings to default values.

```java
void resetRuntimeSettings () throws LabelRecognitionException
```   
   
**Exceptions**
[`LabelRecognitionException`](label-recognition-exception.md)

**Code Snippet**
```java
LabelRecognition recognizer = new LabelRecognition();
DLRRuntimeSettings settings = recognizer.getRuntimeSettings();
settings.linesCount = 1;
recognizer.updateRuntimeSettings(settings);
recognizer.resetRuntimeSettings();
recognizer.destroy();
```


&nbsp;

### outputSettingsToFile
Outputs runtime settings and save them into a settings file (JSON file).  

```java
void outputSettingsToFile (String filePath, String templateName) throws LabelRecognitionException
```   
   
**Parameters**
`filePath` The path of the output file which stores current settings.  
`templateName` A unique name for declaring current runtime settings.  


**Exceptions**

[`LabelRecognitionException`](label-recognition-exception.md)

**Code Snippet**
```java
LabelRecognition recognizer = new LabelRecognition();
recognizer.appendSettingsFromString("{\"LabelRecognitionParameter\":{\"Name\":\"P1\", \"RegionPredetectionModes\":[{\"Mode\":\"DLR_RPM_GENERAL_HSV_CONTRAST\"}], \"ReferenceRegionNameArray\": [\"R1\"]},\"ReferenceRegion\":{\"Name\":\"R1\",\"Localization\":{\"SourceType\":\"DLR_LST_PREDETECTED_REGION\",\"RegionPredetectionModesIndex\":0},\"TextAreaNameArray\":[\"T1\"]},\"TextArea\":{\"Name\":\"T1\",\"CharacterModelName\":\"Number\"}}");
recognizer.outputSettingsToFile("your saving file path", "currentRuntimeSettings");
recognizer.destroy();
```

&nbsp;



### appendSettingsFromFile
Appends LabelRecognitionParameter settings in a file to the SDK object.

```java
void appendSettingsFromFile (String filePath) throws LabelRecognitionException
```   
   
**Parameters**
`filePath` The settings file path.   


**Exceptions**

[`LabelRecognitionException`](label-recognition-exception.md)

**Code Snippet**
```java
LabelRecognition recognizer = new LabelRecognition();
recognizer.appendSettingsFromFile("your file path");
recognizer.destroy();
```

&nbsp;


### appendSettingsFromString
Append a new template string to the current label recognition instance.

```java
void appendSettingsFromString (String content) throws LabelRecognitionException
```   
   
**Parameters**
`content` A JSON string that represents the content of the settings.   

**Exceptions**

[`LabelRecognitionException`](label-recognition-exception.md)

**Code Snippet**
```java
LabelRecognition recognizer = new LabelRecognition();
recognizer.appendSettingsFromString("{\"LabelRecognitionParameter\":{\"Name\":\"P1\", \"RegionPredetectionModes\":[{\"Mode\":\"DLR_RPM_GENERAL_HSV_CONTRAST\"}], \"ReferenceRegionNameArray\": [\"R1\"]},\"ReferenceRegion\":{\"Name\":\"R1\",\"Localization\":{\"SourceType\":\"DLR_LST_PREDETECTED_REGION\",\"RegionPredetectionModesIndex\":0},\"TextAreaNameArray\":[\"T1\"]},\"TextArea\":{\"Name\":\"T1\",\"CharacterModelName\":\"Number\"}}");
recognizer.destroy();
```

&nbsp;

### clearAppendedSettings
Clear all appended parameter settings of the current label recognition instance.

```java
void clearAppendedSettings () throws LabelRecognitionException
```   
   
**Code Snippet**
```java
LabelRecognition recognizer = new LabelRecognition();
recognizer.clearAppendedSettings();
```

&nbsp;


### getModeArgument

Get argument value for the specified mode parameter.

```java
String getModeArgument (String modesName, int index, String argumentName) throws LabelRecognitionException	
```   
   
**Parameters**  
- `modesName`: The mode parameter name to get argument.  
- `index`: The array index of mode parameter to indicate a specific mode.  
- `argumentName`: The name of the argument to get.

**Return Value**
the optional argument for a specified mode in Modes parameters.

**Exceptions**
[`LabelRecognitionException`](label-recognition-exception.md)

#### Remark
Check follow link for available modes and arguments:
- [`RegionPredetectionModes`]({{ site.parameters-reference }}label-recognition-parameter/region-predetection-modes.html#regionpredetectionmodes)

**Code Snippet**
```java
LabelRecognition recognizer = new LabelRecognition();
DLRRuntimeSettings settings = recognizer.getRuntimeSettings();
settings.regionPredetectionModes[0] = EnumRegionPredetectionMode.DLR_RPM_GENERAL_RGB_CONTRAST;
recognizer.updateRuntimeSettings(settings);
recognizer.setModeArgument("RegionPredetectionModes", 0, "AspectRatioRange", "100");
String argumentValue = recognizer.getModeArgument("RegionPredetectionModes", 0, "AspectRatioRange");
recognizer.destroy();
```

&nbsp;




### setModeArgument

Set argument value for the specified mode parameter.


```java
void setModeArgument (String modesName, int index, String argumentName, String argumentValue)	throws LabelRecognitionException	
```   
**Parameters**
- `modesName`: The mode parameter name to set argument.
- `index`: The array index of mode parameter to indicate a specific mode.  
- `argumentName`: The name of the argument to set.  
- `argumentValue`: The value of the argument to set. 

**Exceptions**
[`LabelRecognitionException`](label-recognition-exception.md)


#### Remark
Check follow link for available modes and arguments:
- [`RegionPredetectionModes`]({{ site.parameters-reference }}label-recognition-parameter/region-predetection-modes.html#regionpredetectionmodes)

**Code Snippet**
```java
LabelRecognition recognizer = new LabelRecognition();
DLRRuntimeSettings settings = recognizer.getRuntimeSettings();
settings.regionPredetectionModes[0] = EnumRegionPredetectionMode.DLR_RPM_GENERAL_RGB_CONTRAST;
recognizer.updateRuntimeSettings(settings);
recognizer.setModeArgument("RegionPredetectionModes", 0, "AspectRatioRange", "100");
recognizer.destroy();
```

&nbsp;


### updateReferenceRegionFromBarcodeResults
Updates reference region which is defined with source type DLR_LST_BARCODE.  

```java
void updateReferenceRegionFromBarcodeResults (TextResult[] barcodeResults, String templateName) throws LabelRecognitionException
```   
   
**Parameters**
`barcodeResults` The barcode results used to localize reference region.  
`templateName` The template name. A template name is the value of key LabelRecognitionParameter.Name defined in JSON formatted settings. If no template name is specified, current runtime settings will be used.


**Exceptions**

[`LabelRecognitionException`](label-recognition-exception.md)


**Code Snippet**
```java
LabelRecognition recognizer = new LabelRecognition();

recognizer.appendSettingsFromString("{\"LabelRecognitionParameter\":{\"Name\":\"P1\", \"RegionPredetectionModes\":[{\"Mode\":\"DLR_RPM_GENERAL_HSV_CONTRAST\"}], \"ReferenceRegionNameArray\": [\"R1\"]},\"ReferenceRegion\":{\"Name\":\"R1\",\"Localization\":{\"SourceType\":\"DLR_LST_BARCODE\"},\"TextAreaNameArray\":[\"T1\"]},\"TextArea\":{\"Name\":\"T1\",\"CharacterModelName\":\"Number\"}}");

//Get barcodeResults from Dynamsoft Barcode Reader SDK
recognizer.updateReferenceRegionFromBarcodeResults(barcodeResults, "P1");
recognizer.destroy();
```

&nbsp;


   
## Recognizing
   
  | Method               | Description |
  |----------------------|-------------|
  | [`recognizeByBuffer`](#recognizebybuffer) | Recognizes text from memory buffer containing image pixels in defined format. |
  | [`recognizeByFile`](#recognizebyfile) | Recognizes text from a specified image file. |
   

### recognizeByBuffer
Recognizes text from the memory buffer containing image pixels in defined format.

```java
DLRResult[] recognizeByBuffer(DLRImageData imageData, String templateName) throws LabelRecognitionException
```   
   
**Parameters**
`[in]	imageData` An object of DLRImageData that represents an image.  
`[in]	templateName` The template name. A template name is the value of key LabelRecognitionParameter.Name defined in JSON formatted settings. If no template name is specified, current runtime settings will be used.

**Return Value**
All results recognized successfully.

**Exceptions**

[`LabelRecognitionException`](label-recognition-exception.md)

**Code Snippet**
```java
LabelRecognition recognizer = new LabelRecognition();
// 1. init license...
// 2. Generate imageData from somewhere else...
DLRResult[] result = recognizer.recognizeByBuffer(imageData, "");
recognizer.destroy();
```

&nbsp;


### recognizeByFile
Recognizes text from a specified image file.

```java
DLRResult[] recognizeByFile (String fileName, String templateName) throws LabelRecognitionException	
```   
   
**Parameters**
`fileName` A string defining the file name.  
`templateName` The template name. A template name is the value of key LabelRecognitionParameter.Name defined in JSON formatted settings. If no template name is specified, current runtime settings will be used.

**Return Value**
All results recognized successfully.

**Exceptions**

[`LabelRecognitionException`](label-recognition-exception.md)

**Code Snippet**
```java
LabelRecognition recognizer = new LabelRecognition();
// 1. init license...
DLRResult[] result = recognizer.recognizeByFile("full file path", "");
recognizer.destroy();
```

&nbsp; 
   