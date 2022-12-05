---
layout: default-layout
title: Settings - Dynamsoft Label Recognition .Net API Reference
description: This is the settings functions of Dynamsoft Label Recognition for .Net API Reference.
keywords: api reference, .Net
needAutoGenerateSidebar: true
---

# .Net API Reference - Settings

| Method               | Description |
|----------------------|-------------|
  | [`AppendSettingsFromString`](#appendsettingsfromstring) | Appends LabelRecognitionParameter settings in a string to the SDK object. |
  | [`ClearAppendedSettings`](#clearappendedsettings) | Clears appended LabelRecognitionParameter settings. |
  | [`GetModeArgument`](#getmodeargument) | Get argument value for the specified mode parameter. |
  | [`GetRuntimeSettings`](#getruntimesettings) | Gets the current settings and saves it into a class object. |
  | [`OutputSettingsToFile`](#outputsettingstofile) | Outputs LabelRecognitionParameter settings into a file (JSON file). |
  | [`ResetRuntimeSettings`](#resetruntimesettings) | Resets the runtime settings. |
  | [`SetModeArgument`](#setmodeargument) | Set argument value for the specified mode parameter. |
  | [`UpdateReferenceRegionFromBarcodeResults`](#updatereferenceregionfrombarcoderesults) | Updates reference region which is defined with source type DLR_LST_BARCODE. |
  | [`UpdateRuntimeSettings`](#updateruntimesettings) | Updates runtime settings with a given class object. |

---

## GetRuntimeSettings
Get current settings and save them into a [`DLR_RuntimeSettings`](../class/dlr-runtime-settings.html) class object.

```csharp
PublicRuntimeSettings Dynamsoft.DLR.LabelRecognition.GetRuntimeSettings ()
```   
   
**Return Value**

The class object of runtime settings.

**Exceptions**
[`DLR_Exception`](../class/label-recognition-exception.md)

**Code Snippet**
```csharp
LabelRecognition recognizer = new LabelRecognition();
recognizer.InitLicense("t0260NwAAAHV***************");
DLR_RuntimeSettings settings = recognizer.GetRuntimeSettings();
recognizer.Dispose();
```

&nbsp;

## UpdateRuntimeSettings
Update runtime settings with a given [`DLR_RuntimeSettings`](../class/dlr-runtime-settings.html) class object.

```csharp
void Dynamsoft.DLR.LabelRecognition.UpdateRuntimeSettings (DLR_RuntimeSettings settings)
```   
   
**Parameters**
`settings` The class object of runtime settings.  

**Exceptions**

[`DLR_Exception`](../class/label-recognition-exception.md)

**Code Snippet**
```csharp
LabelRecognition recognizer = new LabelRecognition();
recognizer.InitLicense("t0260NwAAAHV***************");
DLR_RuntimeSettings settings = recognizer.GetRuntimeSettings();
settings.linesCount = 1;
recognizer.UpdateRuntimeSettings(settings);
recognizer.Dispose();
```

&nbsp;

## ResetRuntimeSettings
Reset all runtime settings to default values.

```csharp
void Dynamsoft.DLR.LabelRecognition.ResetRuntimeSettings ()
```   
   
**Exceptions**
[`DLR_Exception`](../class/label-recognition-exception.md)

**Code Snippet**
```csharp
LabelRecognition recognizer = new LabelRecognition();
recognizer.InitLicense("t0260NwAAAHV***************");
DLR_RuntimeSettings settings = recognizer.GetRuntimeSettings();
settings.linesCount = 1;
recognizer.UpdateRuntimeSettings(settings);
recognizer.ResetRuntimeSettings();
recognizer.Dispose();
```


&nbsp;


## AppendSettingsFromString
Append a new template string to the current label recognition instance.

```csharp
void Dynamsoft.DLR.LabelRecognition.AppendSettingsFromString (string content)
```   
   
**Parameters**
`content` A JSON string that represents the content of the settings.   


**Exceptions**
[`DLR_Exception`](../class/label-recognition-exception.md)

**Code Snippet**
```csharp
LabelRecognition recognizer = new LabelRecognition();
recognizer.InitLicense("t0260NwAAAHV***************");
recognizer.AppendSettingsFromString("{\"LabelRecognitionParameter\":{\"Name\":\"P1\", \"RegionPredetectionModes\":[{\"Mode\":\"DLR_RPM_GENERAL_HSV_CONTRAST\"}], \"ReferenceRegionNameArray\": [\"R1\"]},\"ReferenceRegion\":{\"Name\":\"R1\",\"Localization\":{\"SourceType\":\"DLR_LST_PREDETECTED_REGION\",\"RegionPredetectionModesIndex\":0},\"TextAreaNameArray\":[\"T1\"]},\"TextArea\":{\"Name\":\"T1\",\"CharacterModelName\":\"Number\"}}");
recognizer.Dispose();
```

&nbsp;


## OutputSettingsToFile
Outputs runtime settings and save them into a settings file (JSON file).  

```csharp
void Dynamsoft.DLR.LabelRecognition.OutputSettingsToFile (string filePath, string templateName)
```   
   
**Parameters**
`filePath` The path of the output file which stores current settings.  
`templateName` A unique name for declaring current runtime settings.  


**Exceptions**
[`DLR_Exception`](../class/label-recognition-exception.md)

**Code Snippet**
```csharp
LabelRecognition recognizer = new LabelRecognition();
recognizer.InitLicense("t0260NwAAAHV***************");
recognizer.AppendSettingsFromString("{\"LabelRecognitionParameter\":{\"Name\":\"P1\", \"RegionPredetectionModes\":[{\"Mode\":\"DLR_RPM_GENERAL_HSV_CONTRAST\"}], \"ReferenceRegionNameArray\": [\"R1\"]},\"ReferenceRegion\":{\"Name\":\"R1\",\"Localization\":{\"SourceType\":\"DLR_LST_PREDETECTED_REGION\",\"RegionPredetectionModesIndex\":0},\"TextAreaNameArray\":[\"T1\"]},\"TextArea\":{\"Name\":\"T1\",\"CharacterModelName\":\"Number\"}}");
recognizer.OutputSettingsToFile("your saving file path", "currentRuntimeSettings");
recognizer.Dispose();
```

&nbsp;


## ClearAppendedSettings
Clear all appended parameter settings of the current label recognition instance.

```csharp
void Dynamsoft.DLR.LabelRecognition.ClearAppendedSettings ()
```   
   
**Code Snippet**
```csharp
LabelRecognition recognizer = new LabelRecognition();
recognizer.InitLicense("t0260NwAAAHV***************");
recognizer.ClearAppendedSettings();
```

&nbsp;

## UpdateReferenceRegionFromBarcodeResults
Updates reference region which is defined with source type DLR_LST_BARCODE.  

```csharp
void Dynamsoft.DLR.LabelRecognition.UpdateReferenceRegionFromBarcodeResults (TextResult[] barcodeResults, string templateName)
```   
   
**Parameters**
`barcodeResults` The barcode results used to localize reference region.  
`templateName` The template name. A template name is the value of key LabelRecognitionParameter.Name defined in JSON formatted settings. If no template name is specified, current runtime settings will be used.


**Exceptions**
[`DLR_Exception`](../class/label-recognition-exception.md)


**Code Snippet**
```csharp
LabelRecognition recognizer = new LabelRecognition();
recognizer.InitLicense("t0260NwAAAHV***************");
recognizer.AppendSettingsFromString("{\"LabelRecognitionParameter\":{\"Name\":\"P1\", \"RegionPredetectionModes\":[{\"Mode\":\"DLR_RPM_GENERAL_HSV_CONTRAST\"}], \"ReferenceRegionNameArray\": [\"R1\"]},\"ReferenceRegion\":{\"Name\":\"R1\",\"Localization\":{\"SourceType\":\"DLR_LST_BARCODE\"},\"TextAreaNameArray\":[\"T1\"]},\"TextArea\":{\"Name\":\"T1\",\"CharacterModelName\":\"Number\"}}");
//Get barcodeResults from Dynamsoft Barcode Reader SDK
recognizer.UpdateReferenceRegionFromBarcodeResults(barcodeResults, "P1");
recognizer.Dispose();
```

&nbsp;

## SetModeArgument

Set argument value for the specified mode parameter.

```csharp
void Dynamsoft.DLR.LabelRecognition.SetModeArgument (string modesName, int index, string argumentName, string argumentValue)	
```   
**Parameters**
- `modesName`: The mode parameter name to set argument.
- `index`: The array index of mode parameter to indicate a specific mode.  
- `argumentName`: The name of the argument to set.  
- `argumentValue`: The value of the argument to set. 

**Exceptions**
[`DLR_Exception`](../class/label-recognition-exception.md)


### Remark
Check follow link for available modes and arguments:
- [`RegionPredetectionModes`]({{ site.parameters-reference }}label-recognition-parameter/region-predetection-modes.html#regionpredetectionmodes)

**Code Snippet**
```csharp
LabelRecognition recognizer = new LabelRecognition();
recognizer.InitLicense("t0260NwAAAHV***************");
DLR_RuntimeSettings settings = recognizer.GetRuntimeSettings();
settings.regionPredetectionModes[0] = EnumRegionPredetectionMode.DLR_RPM_GENERAL_RGB_CONTRAST;
recognizer.UpdateRuntimeSettings(settings);
recognizer.SetModeArgument("RegionPredetectionModes", 0, "AspectRatioRange", "100");
recognizer.Dispose();
```

&nbsp;


## GetModeArgument

Get argument value for the specified mode parameter.

```csharp
string Dynamsoft.DLR.LabelRecognition.GetModeArgument (string modesName, int index, string argumentName)	
```   
   
**Parameters**  
- `modesName`: The mode parameter name to get argument.  
- `index`: The array index of mode parameter to indicate a specific mode.  
- `argumentName`: The name of the argument to get.

**Return Value**
the optional argument for a specified mode in Modes parameters.

**Exceptions**
[`DLR_Exception`](../class/label-recognition-exception.md)

### Remark
Check follow link for available modes and arguments:
- [`RegionPredetectionModes`]({{ site.parameters-reference }}label-recognition-parameter/region-predetection-modes.html#regionpredetectionmodes)

**Code Snippet**
```csharp
LabelRecognition recognizer = new LabelRecognition();
recognizer.InitLicense("t0260NwAAAHV***************");
DLR_RuntimeSettings settings = recognizer.GetRuntimeSettings();
settings.regionPredetectionModes[0] = EnumRegionPredetectionMode.DLR_RPM_GENERAL_RGB_CONTRAST;
recognizer.UpdateRuntimeSettings(settings);
recognizer.SetModeArgument("RegionPredetectionModes", 0, "AspectRatioRange", "100");
string argumentValue = recognizer.GetModeArgument("RegionPredetectionModes", 0, "AspectRatioRange");
recognizer.Dispose();
```

&nbsp;

