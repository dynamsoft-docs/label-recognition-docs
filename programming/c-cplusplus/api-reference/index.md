---
layout: default-layout
title: Dynamsoft Label Recognition C++ API Reference - Main Page
description: This is the main page of Dynamsoft Label Recognition for C/C++ API Reference.
keywords: api reference, c, c++
needAutoGenerateSidebar: false
breadcrumbText: API Reference
---

# Dynamsoft Label Recognition - C/C++ API Reference

- [`CLabelRecognition` Class](#clabelrecognition-class) 
- [C Functions](#c-functions)
- [Error Code](#error-code)
- [Structs](#structs)  
- [Enumerations](#enumerations)

## CBarcodeReader Class

### General
   
  | Method               | Description |
  |----------------------|-------------|
  | [`GetErrorString`](clabelrecognition-class/general.md#geterrorstring) | Returns the error string. |
  | [`GetVersion`](clabelrecognition-class/general.md#getversion) | Returns the version number string for the SDK. |
   
&nbsp; 

### Initialization
  
  | Method               | Description |
  |----------------------|-------------|
  | [`InitLicense`](clabelrecognition-class/initialization.md#initlicense) | Sets the license and activates the SDK. |

&nbsp; 

### Settings

  | Method               | Description |
  |----------------------|-------------|
  | [`GetRuntimeSettings`](clabelrecognition-class/settings.md#getruntimesettings) | Gets the current settings and saves it into a struct. |
  | [`UpdateRuntimeSettings`](clabelrecognition-class/settings.md#updateruntimesettings) | Updates runtime settings with a given struct. |
  | [`ResetRuntimeSettings`](clabelrecognition-class/settings.md#resetruntimesettings) | Resets the runtime settings. |
  | [`GetModeArgument`](clabelrecognition-class/settings.md#getmodeargument) | Gets the optional argument for a specified mode in Modes parameters. |
  | [`SetModeArgument`](clabelrecognition-class/settings.md#setmodeargument) | Sets the optional argument for a specified mode in Modes parameters. |
  | [`AppendSettingsFromString`](clabelrecognition-class/settings.md#appendsettingsfromstring) | Appends LabelRecognitionParameter settings in a string to the SDK object. |
  | [`OutputSettingsToFile`](clabelrecognition-class/settings.md#outputsettingstofile) | Outputs LabelRecognitionParameter settings into a file (JSON file). |

&nbsp; 
   
### Recognizing
   
  | Method               | Description |
  |----------------------|-------------|
  | [`RecognizeByBuffer`](clabelrecognition-class/recognizing.md#recognizebybuffer) | Recognizes text from memory buffer containing image pixels in defined format. |
  | [`RecognizeByFile`](clabelrecognition-class/recognizing.md#recognizebyfile) | Recognizes text from a specified image file. |
  | [`RecognizeBasedOnDBRResultByBuffer`](clabelrecognition-class/recognizing.md#recognizebasedondbrresultbybuffer) | Recognizes text from memory buffer containing image pixels in defined format according to barcode results from DBR SDK. |
  | [`RecognizeBasedOnDBRResultByFile`](clabelrecognition-class/recognizing.md#recognizebasedondbrresultbyfile) |Recognizes text from a specified image file according to barcode results from DBR SDK. |
   
&nbsp; 
   
### Result
   
  | Method               | Description |
  |----------------------|-------------|
  | [`GetAllDLRResults`](clabelrecognition-class/result.md#getalldlrresults) | Gets all recognized results. |
  | [`FreeDLRResults`](clabelrecognition-class/result.md#freedlrresults) | Frees memory allocated for recognized results. |
       
&nbsp; 

## C Functions
  
### General
   
  | Method               | Description |
  |----------------------|-------------|
  | [`DLR_GetErrorString`](c-functions/general.md#geterrorstring) | Returns the error string. |
  | [`DLR_GetVersion`](c-functions/general.md#getversion) | Returns the version number string for the SDK. |
   
&nbsp; 

### Initialization
  
  | Method               | Description |
  |----------------------|-------------|
  | [`DLR_CreateInstance`](c-functions/initialization.md#createinstance) | Creates a Dynamsoft Label Recognition instance. |
  | [`DLR_DestroyInstance`](c-functions/initialization.md#destroyinstance) | Destroys an instance of Dynamsoft Label Recognition. |
  | [`InitLicense`](c-functions/initialization.md#initlicense) | Sets the license and activates the SDK. |

&nbsp; 

### Settings

  | Method               | Description |
  |----------------------|-------------|
  | [`DLR_GetRuntimeSettings`](c-functions/settings.md#getruntimesettings) | Gets the current settings and saves it into a struct. |
  | [`DLR_UpdateRuntimeSettings`](c-functions/settings.md#updateruntimesettings) | Updates runtime settings with a given struct. |
  | [`DLR_ResetRuntimeSettings`](c-functions/settings.md#resetruntimesettings) | Resets the runtime settings. |
  | [`DLR_GetModeArgument`](c-functions/settings.md#getmodeargument) | Gets the optional argument for a specified mode in Modes parameters. |
  | [`DLR_SetModeArgument`](c-functions/settings.md#setmodeargument) | Sets the optional argument for a specified mode in Modes parameters. |
  | [`DLR_ClearAppendedSettings`](c-functions/settings.md#appendsettingsfromstring) | Clears appended LabelRecognitionParameter settings. |
  | [`DLR_AppendSettingsFromString`](c-functions/settings.md#appendsettingsfromstring) | Appends LabelRecognitionParameter settings in a string to the SDK object. |
  | [`DLR_OutputSettingsToFile`](c-functions/settings.md#outputsettingstofile) | Outputs LabelRecognitionParameter settings into a file (JSON file). |

&nbsp; 
   
### Recognizing
   
  | Method               | Description |
  |----------------------|-------------|
  | [`DLR_RecognizeByBuffer`](c-functions/recognizing.md#recognizebybuffer) | Decode barcodes from a specified image file. |
  | [`DLR_RecognizeByFile`](c-functions/recognizing.md#recognizebyfile) | Decode barcodes from an image file in memory. |
  | [`DLR_RecognizeBasedOnDBRResultByBuffer`](c-functions/recognizing.md#recognizebasedondbrresultbybuffer) | Decode barcodes from raw buffer. |
  | [`DLR_RecognizeBasedOnDBRResultByFile`](c-functions/recognizing.md#recognizebasedondbrresultbyfile) | Decode barcodes from a base64 encoded string. |
   
&nbsp; 
   
### Result
   
  | Method               | Description |
  |----------------------|-------------|
  | [`DLR_GetAllDLRResults`](c-functions/result.md#getalldlrresults) | Gets all recognized results. |
  | [`DLR_FreeDLRResults`](c-functions/result.md#freedlrresults) | Frees memory allocated for recognized results. |
   
&nbsp; 

## Enumerations
- [`DLRImagePixelFormat`]()
- [`DLRTextColourMode`]()
- [`DLRRegionPredetectionMode`]()
- [`DLRBinarizationMode`]()
- [`DLRDenoisingMode`]()
- [`DLRGrayscaleTransformationMode`]()
- [`DLRCharacterSegmentationMode`]()


## [Error Code](errorcode.md)
		


## [Structs](structs/index.md)
- [`DLRRuntimeSettings`](structs/dlrruntimesettings.md)	
- [`DLRQuadrilateral`](structs/dlrquadrilateral.md)	
- [`DLRRegion`](structs/dlrregion.md)	
- [`DLRResultArray`](structs/dlrresultarray.md)		
- [`DLRResult`](structs/dlrresult.md)		
- [`DLRLineResult`](structs/dlrlineResult.md)	
- [`DLRCharacterResult`](structs/dlrcharacterresult.md)		
- [`DLRPoint`](structs/dlrpoint.md)		
- [`DLRImageData`](structs/dlrimagedata.md)		