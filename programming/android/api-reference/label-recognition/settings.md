---
layout: default-layout
title: Dynamsoft Label Recognition Android API Reference - Settings
description: This is the settings functions of Dynamsoft Label Recognition for Android API Reference.
keywords: api reference, android
needAutoGenerateSidebar: true
---

# Android API Reference - Settings

| Method               | Description |
|----------------------|-------------|
  | [`appendSettingsFromString`](#appendsettingsfromstring) | Appends LabelRecognitionParameter settings in a string to the SDK object. |
  | [`clearAppendedSettings`](#clearappendedsettings) | Clears appended LabelRecognitionParameter settings. |
  | [`getModeArgument`](#getmodeargument) | Get argument value for the specified mode parameter. |
  | [`getRuntimeSettings`](#getruntimesettings) | Gets the current settings and saves it into a class object. |
  | [`outputSettingsToFile`](#outputsettingstofile) | Outputs LabelRecognitionParameter settings into a file (JSON file). |
  | [`resetRuntimeSettings`](#resetruntimesettings) | Resets the runtime settings. |
  | [`setModeArgument`](#setmodeargument) | Set argument value for the specified mode parameter. |
  | [`updateReferenceRegionFromBarcodeResults`](#updatereferenceregionfrombarcoderesults) | Updates reference region which is defined with source type DLR_LST_BARCODE. |
  | [`updateRuntimeSettings`](#updateruntimesettings) | Updates runtime settings with a given class object. |

---

## getRuntimeSettings
Get current settings and save them into a [`DLRRuntimeSettings`](../class/dlr-runtime-settings.html) class object.

```java
PublicRuntimeSettings com.dynamsoft.dlr.LabelRecognition.getRuntimeSettings () throws LabelRecognitionException
```   
   
### Return value

The class object of template settings.

### Exceptions

[`LabelRecognitionException`](../class/label-recognition-exception.md)

#### Code Snippet
```java
LabelRecognition recognizer = new LabelRecognition();
recognizer.initLicense("t0260NwAAAHV***************");
DLRRuntimeSettings settings = recognizer.getRuntimeSettings();
recognizer.destroy();
```

&nbsp;

## updateRuntimeSettings
Update runtime settings with a given [`DLRRuntimeSettings`](../class/dlr-runtime-settings.html) class object.

```java
void com.dynamsoft.dlr.LabelRecognition.updateRuntimeSettings (DLRRuntimeSettings settings) throws LabelRecognitionException
```   
   
#### Parameters
`settings` The class object of template settings.  

### Exceptions

[`LabelRecognitionException`](../class/label-recognition-exception.md)

#### Code Snippet
```java
LabelRecognition recognizer = new LabelRecognition();
recognizer.initLicense("t0260NwAAAHV***************");
DLRRuntimeSettings settings = recognizer.getRuntimeSettings();
settings.linesCount = 1;
recognizer.updateRuntimeSettings(settings);
recognizer.destroy();
```

&nbsp;

## resetRuntimeSettings
Reset all runtime settings to default values.

```java
void com.dynamsoft.dlr.LabelRecognition.resetRuntimeSettings () throws LabelRecognitionException
```   
   
### Exceptions
[`LabelRecognitionException`](../class/label-recognition-exception.md)

#### Code Snippet
```java
LabelRecognition recognizer = new LabelRecognition();
recognizer.initLicense("t0260NwAAAHV***************");
DLRRuntimeSettings settings = recognizer.getRuntimeSettings();
settings.linesCount = 1;
recognizer.updateRuntimeSettings(settings);
recognizer.resetRuntimeSettings();
recognizer.destroy();
```


&nbsp;


## appendSettingsFromString
Append a new template string to the current label recognition instance.

```java
void com.dynamsoft.dlr.LabelRecognition.appendSettingsFromString (String content) throws LabelRecognitionException
```   
   
#### Parameters
`content` A JSON string that represents the content of the settings.   


### Exceptions

[`LabelRecognitionException`](../class/label-recognition-exception.md)

#### Code Snippet
```java
LabelRecognition recognizer = new LabelRecognition();
recognizer.initLicense("t0260NwAAAHV***************");
recognizer.appendSettingsFromString("{\"LabelRecognitionParameter\":{\"Name\":\"P1\", \"RegionPredetectionModes\":[{\"Mode\":\"DLR_RPM_GENERAL_HSV_CONTRAST\"}], \"ReferenceRegionNameArray\": [\"R1\"]},\"ReferenceRegion\":{\"Name\":\"R1\",\"Localization\":{\"SourceType\":\"DLR_LST_PREDETECTED_REGION\",\"RegionPredetectionModesIndex\":0}},\"TextArea\":{\"Name\":\"T1\",\"CharacterModelName\":\"Number\"}}");
recognizer.destroy();
```

&nbsp;


## outputSettingsToFile
Outputs runtime settings and save them into a settings file (JSON file).  

```java
void com.dynamsoft.dlr.LabelRecognition.outputSettingsToFile (String filePath, String templateName) throws LabelRecognitionException
```   
   
#### Parameters
`filePath` The path of the output file which stores current settings.  
`templateName` A unique name for declaring current runtime settings.  


### Exceptions

[`LabelRecognitionException`](../class/label-recognition-exception.md)

#### Code Snippet
```java
LabelRecognition recognizer = new LabelRecognition();
recognizer.initLicense("t0260NwAAAHV***************");
recognizer.appendSettingsFromString("{\"LabelRecognitionParameter\":{\"Name\":\"P1\", \"RegionPredetectionModes\":[{\"Mode\":\"DLR_RPM_GENERAL_HSV_CONTRAST\",\"RelativeTextAreaNames\":\"T1\"}]},\"TextArea\":{\"Name\":\"T1\",\"CharacterModelName\":\"Number\"}}");
recognizer.outputSettingsToFile("your saving file path", "currentRuntimeSettings");
recognizer.destroy();
```

&nbsp;


## clearAppendedSettings
Clear all appended parameter settings of the current label recognition instance.

```java
void com.dynamsoft.dlr.LabelRecognition.clearAppendedSettings () throws LabelRecognitionException
```   
   
#### Code Snippet
```java
LabelRecognition recognizer = new LabelRecognition();
recognizer.initLicense("t0260NwAAAHV***************");
recognizer.clearAppendedSettings();
```

## updateReferenceRegionFromBarcodeResults
Updates reference region which is defined with source type DLR_LST_BARCODE.  

```java
void com.dynamsoft.dlr.LabelRecognition.updateReferenceRegionFromBarcodeResults (TextResult[] barcodeResults, String templateName) throws LabelRecognitionException
```   
   
#### Parameters
`barcodeResults` The barcode results used to localize reference region.  
`templateName` The template name. A template name is the value of key LabelRecognitionParameter.Name defined in JSON formatted settings. If no template name is specified, current runtime settings will be used.


### Exceptions

[`LabelRecognitionException`](../class/label-recognition-exception.md)


#### Code Snippet
```java
LabelRecognition recognizer = new LabelRecognition();
recognizer.initLicense("t0260NwAAAHV***************");
recognizer.appendSettingsFromString("{\"LabelRecognitionParameter\":{\"Name\":\"P1\", \"RegionPredetectionModes\":[{\"Mode\":\"DLR_RPM_GENERAL_HSV_CONTRAST\"}], \"ReferenceRegionNameArray\": [\"R1\"]},\"ReferenceRegion\":{\"Name\":\"R1\",\"Localization\":{\"SourceType\":\"DLR_LST_PREDETECTED_REGION\",\"RegionPredetectionModesIndex\":0}},\"TextArea\":{\"Name\":\"T1\",\"CharacterModelName\":\"Number\"}}");
//Get barcodeResults from Dynamsoft Barcode Reader SDK
recognizer.updateReferenceRegionFromBarcodeResults(barcodeResults, "P1");
recognizer.destroy();
```

&nbsp;

## setModeArgument

Set argument value for the specified mode parameter.


```java
void com.dynamsoft.dlr.LabelRecognition.setModeArgument (String modesName, int index, String argumentName, String argumentValue)	throws LabelRecognitionException	
```   
#### Parameters
- `modesName`: The mode parameter name to set argument.
- `index`: The array index of mode parameter to indicate a specific mode.  
- `argumentName`: The name of the argument to set.  
- `argumentValue`: The value of the argument to set. 

### Exceptions
[`LabelRecognitionException`](../class/label-recognition-exception.md)


#### Remark
Check follow link for available modes and arguments:
- [`BinarizationModes`]({{ site.parameters_reference }}label-recognition-parameter/binarization-modes.html#binarizationmodes)
- [`RegionPredetectionModes`]({{ site.parameters_reference }}label-recognition-parameter/region-predetection-modes.html#regionpredetectionmodes)

#### Code Snippet
```java
LabelRecognition recognizer = new LabelRecognition();
recognizer.initLicense("t0260NwAAAHV***************");
DLRRuntimeSettings settings = recognizer.getRuntimeSettings();
settings.regionPredetectionModes[0] = EnumRegionPredetectionMode.DLR_RPM_GENERAL_RGB_CONTRAST;
recognizer.updateRuntimeSettings(settings);
recognizer.setModeArgument("RegionPredetectionModes", 0, "AspectRatioRange", "100");
recognizer.destroy();
```

&nbsp;


## getModeArgument

Get argument value for the specified mode parameter.

```java
String com.dynamsoft.dlr.LabelRecognition.getModeArgument (String modesName, int index, String argumentName) throws LabelRecognitionException	
```   
   
#### Parameters  
- `modesName`: The mode parameter name to get argument.  
- `index`: The array index of mode parameter to indicate a specific mode.  
- `argumentName`: The name of the argument to get.

#### Return value
the optional argument for a specified mode in Modes parameters.

### Exceptions
[`LabelRecognitionException`](../class/label-recognition-exception.md)

#### Remark
Check follow link for available modes and arguments:
- [`BinarizationModes`]({{ site.parameters_reference }}label-recognition-parameter/binarization-modes.html#binarizationmodes)
- [`RegionPredetectionModes`]({{ site.parameters_reference }}label-recognition-parameter/region-predetection-modes.html#regionpredetectionmodes)

#### Code Snippet
```java
LabelRecognition recognizer = new LabelRecognition();
recognizer.initLicense("t0260NwAAAHV***************");
DLRRuntimeSettings settings = recognizer.getRuntimeSettings();
settings.regionPredetectionModes[0] = EnumRegionPredetectionMode.DLR_RPM_GENERAL_RGB_CONTRAST;
recognizer.updateRuntimeSettings(settings);
recognizer.setModeArgument("RegionPredetectionModes", 0, "AspectRatioRange", "100");
String argumentValue = recognizer.getModeArgument("RegionPredetectionModes", 0, "AspectRatioRange");
recognizer.destroy();
```

&nbsp;

