---
layout: default-layout
title: LabelRecognizer Class - Dynamsoft Label Recognizer .Net API Reference
description: This page shows LabelRecognizer methods of Dynamsoft Label Recognizer for .Net API Reference.
keywords: api reference, .Net
needAutoGenerateSidebar: true
needGenerateH3Content: true
noTitleIndex: true
---


# LabelRecognizer

```csharp
class Dynamsoft.DLR.LabelRecognizer
```   

## Initialization
  
  | Method               | Description |
  |----------------------|-------------|
  | [`LabelRecognizer`](#labelrecognizer) | Initialization of `LabelRecognizer` object.|
  | [`Dispose`](#dispose) | Destroys an instance of `LabelRecognizer` object.|   
  | [`InitLicense`](#initlicense) | Sets the license and activates the SDK. |



&nbsp;

### LabelRecognizer()

Initialization of `LabelRecognizer` object.

```csharp
LabelRecognizer()
```

**Exceptions**


[`LabelRecognizerException`](label-recognizer-exception.md)


**Code Snippet**

```csharp
LabelRecognizer recognizer = new LabelRecognizer();
```




&nbsp;

### Dispose
Destroys an instance of Dynamsoft Label Recognizer.

```csharp
void Dispose()	
```

**Code Snippet**


```csharp
LabelRecognizer recognizer = new LabelRecognizer();
recognizer.Dispose();
```


&nbsp;

### InitLicense
Sets product key and activate the SDK.

```csharp
static void InitLicense(string license)
```   

**Parameters**

`license`: The product keys.

**Exceptions**


[`LabelRecognizerException`](label-recognizer-exception.md)

**Code Snippet**

```csharp
LabelRecognizer.InitLicense("t0260NwAAAHV***************");

LabelRecognizer recognizer = new LabelRecognizer();
recognizer.Dispose();
```

 

## Settings

  | Method               | Description |
  |----------------------|-------------|
  | [`GetRuntimeSettings`](#getruntimesettings) | Gets the current settings and saves it into a struct. |
  | [`UpdateRuntimeSettings`](#updateruntimesettings) | Updates runtime settings with a given struct. |
  | [`ResetRuntimeSettings`](#resetruntimesettings) | Resets the runtime settings. |
  | [`AppendSettingsFromString`](#appendsettingsfromstring) | Appends LabelRecognizerParameter settings in a string to the SDK object. |
  | [`AppendSettingsFromFile`](#appendsettingsfromfile) | Appends LabelRecognizerParameter settings in a file to the SDK object. |
  | [`OutputSettingsToFile`](#outputsettingstofile) | Outputs LabelRecognizerParameter settings into a file (JSON file). |
  | [`ClearAppendedSettings`](#clearappendedsettings) | Clear all appended LabelRecognizerParameter settings in the SDK object. |
  | [`UpdateReferenceRegionFromBarcodeResults`](#updatereferenceregionfrombarcoderesults) | Updates reference region which is defined with source type LST_BARCODE. |
  | [`GetModeArgument`](#getmodeargument) | Get argument value for the specified mode parameter. |
  | [`SetModeArgument`](#setmodeargument) | Set argument value for the specified mode parameter. |


&nbsp;

### GetRuntimeSettings
Get current settings and save them into a [`DLR_RuntimeSettings`](dlr-runtime-settings.html) class object.

```csharp
DLR_RuntimeSettings GetRuntimeSettings()
```   
   
**Return value**


The class object of runtime settings.

**Exceptions**

[`LabelRecognizerException`](label-recognizer-exception.md)

**Code Snippet**

```csharp
LabelRecognizer.InitLicense("t0260NwAAAHV***************");

LabelRecognizer recognizer = new LabelRecognizer();
DLR_RuntimeSettings settings = recognizer.GetRuntimeSettings();
recognizer.Dispose();
```



&nbsp;

### UpdateRuntimeSettings
Update runtime settings with a given [`DLR_RuntimeSettings`](dlr-runtime-settings.html) class object.

```csharp
void UpdateRuntimeSettings(DLR_RuntimeSettings settings)
```   
   
**Parameters**

`settings` The class object of runtime settings.  

**Exceptions**


[`LabelRecognizerException`](label-recognizer-exception.md)

**Code Snippet**

```csharp
LabelRecognizer.InitLicense("t0260NwAAAHV***************");

LabelRecognizer recognizer = new LabelRecognizer();
DLR_RuntimeSettings settings = recognizer.GetRuntimeSettings();
settings.MaxThreadCount = 4;
recognizer.UpdateRuntimeSettings(settings);
recognizer.Dispose();
```



&nbsp;

### ResetRuntimeSettings
Reset all runtime settings to default values.

```csharp
void ResetRuntimeSettings ()
```   
   
**Exceptions**

[`LabelRecognizerException`](label-recognizer-exception.md)

**Code Snippet**

```csharp
LabelRecognizer.InitLicense("t0260NwAAAHV***************");

LabelRecognizer recognizer = new LabelRecognizer();
DLR_RuntimeSettings settings = recognizer.GetRuntimeSettings();
settings.MaxThreadCount = 4;
recognizer.UpdateRuntimeSettings(settings);
recognizer.ResetRuntimeSettings();
recognizer.Dispose();
```





&nbsp;

### AppendSettingsFromString
Append a new template string to the current label Recognizer instance.

```csharp
void AppendSettingsFromString (string content)
```   
   
**Parameters**

`content` A JSON string that represents the content of the settings.   


**Exceptions**

[`LabelRecognizerException`](label-recognizer-exception.md)

**Code Snippet**

```csharp
LabelRecognizer.InitLicense("t0260NwAAAHV***************");

LabelRecognizer recognizer = new LabelRecognizer();
recognizer.AppendSettingsFromString("{\"LabelRecognizerParameter\":{\"Name\":\"P1\", \"RegionPredetectionModes\":[{\"Mode\":\"RPM_GENERAL_HSV_CONTRAST\"}], \"ReferenceRegionNameArray\": [\"R1\"]},\"ReferenceRegion\":{\"Name\":\"R1\",\"Localization\":{\"SourceType\":\"LST_PREDETECTED_REGION\",\"RegionPredetectionModesIndex\":0},\"TextAreaNameArray\":[\"T1\"]},\"TextArea\":{\"Name\":\"T1\",\"CharacterModelName\":\"Number\"}}");
recognizer.Dispose();
```




&nbsp;

### AppendSettingsFromFile
Appends LabelRecognizerParameter settings in a file to the SDK object.

```csharp
void AppendSettingsFromFile (string filePath)
```   
   
**Parameters**

`filePath` The settings file path.   


**Exceptions**

[`LabelRecognizerException`](label-recognizer-exception.md)

**Code Snippet**

```csharp
LabelRecognizer.InitLicense("t0260NwAAAHV***************");

LabelRecognizer recognizer = new LabelRecognizer();
recognizer.AppendSettingsFromFile("your file path");
recognizer.Dispose();
```




&nbsp;

### OutputSettingsToFile
Outputs runtime settings and save them into a settings file (JSON file).  

```csharp
void OutputSettingsToFile(string filePath, string templateName)
```   
   
**Parameters**

`filePath` The path of the output file which stores current settings.  
`templateName` A unique name for declaring current runtime settings.  


**Exceptions**

[`LabelRecognizerException`](label-recognizer-exception.md)

**Code Snippet**

```csharp
LabelRecognizer.InitLicense("t0260NwAAAHV***************");

LabelRecognizer recognizer = new LabelRecognizer();
recognizer.AppendSettingsFromString("{\"LabelRecognizerParameter\":{\"Name\":\"P1\", \"RegionPredetectionModes\":[{\"Mode\":\"RPM_GENERAL_HSV_CONTRAST\"}], \"ReferenceRegionNameArray\": [\"R1\"]},\"ReferenceRegion\":{\"Name\":\"R1\",\"Localization\":{\"SourceType\":\"LST_PREDETECTED_REGION\",\"RegionPredetectionModesIndex\":0},\"TextAreaNameArray\":[\"T1\"]},\"TextArea\":{\"Name\":\"T1\",\"CharacterModelName\":\"Number\"}}");
recognizer.OutputSettingsToFile("your saving file path", "currentRuntimeSettings");
recognizer.Dispose();
```




&nbsp;

### ClearAppendedSettings
Clear all appended parameter settings of the current label Recognizer instance.

```csharp
void ClearAppendedSettings ()
```   
   
**Code Snippet**

```csharp
LabelRecognizer.InitLicense("t0260NwAAAHV***************");

LabelRecognizer recognizer = new LabelRecognizer();
recognizer.ClearAppendedSettings();
```



&nbsp;

### UpdateReferenceRegionFromBarcodeResults
Updates reference region which is defined with source type LST_BARCODE.  

```csharp
void UpdateReferenceRegionFromBarcodeResults(BarcodeResult[] barcodeResults, string templateName)
```   
   
**Parameters**

`barcodeResults` The barcode results used to localize reference region. See also [`BarcodeResult`](barcode-result.md).
`templateName` The template name. A template name is the value of key LabelRecognizerParameter.Name defined in JSON formatted settings. If no template name is specified, current runtime settings will be used.


**Exceptions**

[`LabelRecognizerException`](label-recognizer-exception.md)


**Code Snippet**

```csharp
LabelRecognizer.InitLicense("t0260NwAAAHV***************");

LabelRecognizer recognizer = new LabelRecognizer();
recognizer.AppendSettingsFromString("{\"LabelRecognizerParameter\":{\"Name\":\"P1\", \"RegionPredetectionModes\":[{\"Mode\":\"RPM_GENERAL_HSV_CONTRAST\"}], \"ReferenceRegionNameArray\": [\"R1\"]},\"ReferenceRegion\":{\"Name\":\"R1\",\"Localization\":{\"SourceType\":\"LST_BARCODE\"},\"TextAreaNameArray\":[\"T1\"]},\"TextArea\":{\"Name\":\"T1\",\"CharacterModelName\":\"Number\"}}");
//Get barcodeResults from Dynamsoft Barcode Reader SDK
recognizer.UpdateReferenceRegionFromBarcodeResults(barcodeResults, "P1");
recognizer.Dispose();
```



&nbsp;

### SetModeArgument

Set argument value for the specified mode parameter.

```csharp
void SetModeArgument(string modesName, int index, string argumentName, string argumentValue)	
```   
**Parameters**

- `modesName`: The mode parameter name to set argument.
- `index`: The array index of mode parameter to indicate a specific mode.  
- `argumentName`: The name of the argument to set.  
- `argumentValue`: The value of the argument to set. 

**Exceptions**

[`LabelRecognizerException`](label-recognizer-exception.md)




**Remark**

Check follow link for available modes and arguments:
- [`RegionPredetectionModes`]({{ site.parameters-reference }}label-recognition-parameter/region-predetection-modes.html#regionpredetectionmodes)

**Code Snippet**

```csharp
LabelRecognizer.InitLicense("t0260NwAAAHV***************");

LabelRecognizer recognizer = new LabelRecognizer();
DLR_RuntimeSettings settings = recognizer.GetRuntimeSettings();
settings.FurtherModes.RegionPredetectionModes[0] = EnumRegionPredetectionMode.RPM_GENERAL_RGB_CONTRAST;
recognizer.UpdateRuntimeSettings(settings);
recognizer.SetModeArgument("RegionPredetectionModes", 0, "AspectRatioRange", "100");
recognizer.Dispose();
```




&nbsp;

### GetModeArgument

Get argument value for the specified mode parameter.

```csharp
string GetModeArgument (string modesName, int index, string argumentName)	
```   
   
**Parameters**
  
- `modesName`: The mode parameter name to get argument.  
- `index`: The array index of mode parameter to indicate a specific mode.  
- `argumentName`: The name of the argument to get.

**Return value**

the optional argument for a specified mode in Modes parameters.

**Exceptions**

[`LabelRecognizerException`](label-recognizer-exception.md)



**Remark**

Check follow link for available modes and arguments:
- [`RegionPredetectionModes`]({{ site.parameters-reference }}label-recognition-parameter/region-predetection-modes.html#regionpredetectionmodes)

**Code Snippet**

```csharp
LabelRecognizer.InitLicense("t0260NwAAAHV***************");

LabelRecognizer recognizer = new LabelRecognizer();
DLR_RuntimeSettings settings = recognizer.GetRuntimeSettings();
settings.FurtherModes.RegionPredetectionModes[0] = EnumRegionPredetectionMode.RPM_GENERAL_RGB_CONTRAST;
recognizer.UpdateRuntimeSettings(settings);
recognizer.SetModeArgument("RegionPredetectionModes", 0, "AspectRatioRange", "100");
string argumentValue = recognizer.GetModeArgument("RegionPredetectionModes", 0, "AspectRatioRange");
recognizer.Dispose();
```

 
   
## Recognition Methods
   
  | Method               | Description |
  |----------------------|-------------|
  | [`RecognizeByBuffer`](#recognizebybuffer) | Recognizes text from memory buffer containing image pixels in defined format. |
  | [`RecognizeByFile`](#recognizebyfile) | Recognizes text from a specified image file. |


&nbsp;

### RecognizeByBuffer
Recognizes text from the memory buffer containing image pixels in defined format.

```csharp
DLR_Result[] RecognizeByBuffer(ImageData imageData, string templateName)
```   
   
**Parameters**

`[in]	imageData` An object of [`ImageData`](image-data.md) that represents an image.  
`[in]	templateName` The template name. A template name is the value of key LabelRecognizerParameter.Name defined in JSON formatted settings. If no template name is specified, current runtime settings will be used.

**Return value**

All results organized in a [DLR_Result](dlr-result.md) array.

**Exceptions**

[`LabelRecognizerException`](label-recognizer-exception.md)

**Code Snippet**

```csharp
LabelRecognizer.InitLicense("t0260NwAAAHV***************");

LabelRecognizer recognizer = new LabelRecognizer();
//Generate imageData from somewhere else
DLR_Result[] result = recognizer.RecognizeByBuffer(imageData, "");
recognizer.Dispose();
```




&nbsp;

### RecognizeByFile
Recognizes text from a specified image file.

```csharp
DLR_Result[] RecognizeByFile (string fileName, string templateName)	
```   
   
**Parameters**

`fileName` A string defining the file name.  
`templateName` The template name. A template name is the value of key LabelRecognizerParameter.Name defined in JSON formatted settings. If no template name is specified, current runtime settings will be used.

**Return value**

All results organized in a [DLR_Result](dlr-result.md) array.

**Exceptions**

[`LabelRecognizerException`](label-recognizer-exception.md)

**Code Snippet**

```csharp
LabelRecognizer.InitLicense("t0260NwAAAHV***************");

LabelRecognizer recognizer = new LabelRecognizer();
DLR_Result[] result = recognizer.RecognizeByFile("full file path", "");
recognizer.Dispose();
```

## General
   
  | Method               | Description |
  |----------------------|-------------|
  | [`GetVersion`](#getversion) | Returns the version number string for the SDK. |
   
&nbsp;

### GetVersion

Get version information of SDK.

```csharp
string GetVersion()	
```

**Return value**


The version information string.

**Code Snippet**


```csharp
LabelRecognizer recognizer = new LabelRecognizer();
string versionInfo = recognizer.GetVersion();
recognizer.Dispose();
```

  
   