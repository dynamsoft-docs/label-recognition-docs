---
layout: default-layout
title: Dynamsoft Label Recognition C/C++ API Reference - Main Page
description: This is the main page of Dynamsoft Label Recognition for C/C++ API Reference.
keywords: api reference, c, c++
needAutoGenerateSidebar: false
---

# Dynamsoft Label Recognition - C/C++ API Reference

- [`CLabelRecognition` Class](#clabelrecognition-class) 
- [C Functions](#c-functions)
- [Enumerations](#enumerations)
- [Error Code](#error-code)
- [Structs](#structs)  

## CLabelRecognition Class

### General
   
  | Method               | Description |
  |----------------------|-------------|
  | [`GetErrorString`](c-label-recognition-class/general.md#geterrorstring) | Returns the error string. |
  | [`GetVersion`](c-label-recognition-class/general.md#getversion) | Returns the version number string for the SDK. |
   
&nbsp; 

### Initialization
  
  | Method               | Description |
  |----------------------|-------------|
  | [`InitLicense`](c-label-recognition-class/initialization.md#initlicense) | Sets the license and activates the SDK. |
  | [`InitLTSConnectionParameters`](c-label-recognition-class/initialization.md#initltsconnectionparameters) | Initializes a DM_LTSConnectionParameters struct with default values. |
  | [`InitLicenseFromLTS`](c-label-recognition-class/initialization.md#initlicensefromlts) | Initializes the label recognition license and connects to the specified server for online verification. |

&nbsp; 

### Setting

  | Method               | Description |
  |----------------------|-------------|
  | [`GetRuntimeSettings`](c-label-recognition-class/settings.md#getruntimesettings) | Gets the current settings and saves it into a struct. |
  | [`UpdateRuntimeSettings`](c-label-recognition-class/settings.md#updateruntimesettings) | Updates runtime settings with a given struct. |
  | [`ResetRuntimeSettings`](c-label-recognition-class/settings.md#resetruntimesettings) | Resets the runtime settings. |
  | [`AppendSettingsFromString`](c-label-recognition-class/settings.md#appendsettingsfromstring) | Appends LabelRecognitionParameter settings in a string to the SDK object. |
  | [`OutputSettingsToFile`](c-label-recognition-class/settings.md#outputsettingstofile) | Outputs LabelRecognitionParameter settings into a file (JSON file). |
  | [`ClearAppendedSettings`](c-label-recognition-class/settings.md#clearappendedsettings) | Clear all appended LabelRecognitionParameter settings in the SDK object. |
  | [`UpdateReferenceRegionFromBarcodeResults`](c-label-recognition-class/settings.md#updatereferenceregionfrombarcoderesults) | Updates reference region which is defined with source type DLR_LST_BARCODE. |
  | [`GetModeArgument`](c-label-recognition-class/settings.md#getmodeargument) | Get argument value for the specified mode parameter. |
  | [`SetModeArgument`](c-label-recognition-class/settings.md#setmodeargument) | Set argument value for the specified mode parameter. |

&nbsp; 
   
### Recognizing
   
  | Method               | Description |
  |----------------------|-------------|
  | [`RecognizeByBuffer`](c-label-recognition-class/recognizing.md#recognizebybuffer) | Recognizes text from memory buffer containing image pixels in defined format. |
  | [`RecognizeByFile`](c-label-recognition-class/recognizing.md#recognizebyfile) | Recognizes text from a specified image file. |
   
&nbsp; 
   
### Result
   
  | Method               | Description |
  |----------------------|-------------|
  | [`GetAllDLRResults`](c-label-recognition-class/result.md#getalldlrresults) | Gets all recognized results. |
  | [`FreeDLRResults`](c-label-recognition-class/result.md#freedlrresults) | Frees memory allocated for recognized results. |
       
&nbsp; 

## C Functions
  
### General
   
  | Method               | Description |
  |----------------------|-------------|
  | [`DLR_GetErrorString`](c-functions/general.md#dlr_geterrorstring) | Returns the error string. |
  | [`DLR_GetVersion`](c-functions/general.md#dlr_getversion) | Returns the version number string for the SDK. |
   
&nbsp; 

### Initialization
  
  | Method               | Description |
  |----------------------|-------------|
  | [`DLR_CreateInstance`](c-functions/initialization.md#dlr_createinstance) | Creates a Dynamsoft Label Recognition instance. |
  | [`DLR_DestroyInstance`](c-functions/initialization.md#dlr_destroyinstance) | Destroys an instance of Dynamsoft Label Recognition. |
  | [`DLR_InitLicense`](c-functions/initialization.md#dlr_initlicense) | Sets the license and activates the SDK. |
  | [`DLR_InitLTSConnectionParameters`](c-functions/initialization.md#dlr_initltsconnectionparameters) | Initializes a DM_LTSConnectionParameters struct with default values. |
  | [`DLR_InitLicenseFromLTS`](c-functions/initialization.md#dlr_initlicensefromlts) | Initializes the label recognition license and connects to the specified server for online verification. |

&nbsp; 

### Setting

  | Method               | Description |
  |----------------------|-------------|
  | [`DLR_GetRuntimeSettings`](c-functions/settings.md#dlr_getruntimesettings) | Gets the current settings and saves it into a struct. |
  | [`DLR_UpdateRuntimeSettings`](c-functions/settings.md#dlr_updateruntimesettings) | Updates runtime settings with a given struct. |
  | [`DLR_ResetRuntimeSettings`](c-functions/settings.md#dlr_resetruntimesettings) | Resets the runtime settings. |
  | [`DLR_AppendSettingsFromString`](c-functions/settings.md#dlr_appendsettingsfromstring) | Appends LabelRecognitionParameter settings in a string to the SDK object. |
  | [`DLR_OutputSettingsToFile`](c-functions/settings.md#dlr_outputsettingstofile) | Outputs LabelRecognitionParameter settings into a file (JSON file). |
  | [`DLR_ClearAppendedSettings`](c-functions/settings.md#dlr_appendsettingsfromstring) | Clears appended LabelRecognitionParameter settings. |
  | [`DLR_GetModeArgument`](c-functions/settings.md#dlr_getmodeargument) | Get argument value for the specified mode parameter. |
  | [`DLR_SetModeArgument`](c-functions/settings.md#dlr_setmodeargument) | Set argument value for the specified mode parameter. |

&nbsp; 
   
### Recognizing
   
  | Method               | Description |
  |----------------------|-------------|
  | [`DLR_RecognizeByBuffer`](c-functions/recognizing.md#dlr_recognizebybuffer) | Recognizes text from memory buffer containing image pixels in defined format. |
  | [`DLR_RecognizeByFile`](c-functions/recognizing.md#dlr_recognizebyfile) | Recognizes text from a specified image file. |
   
&nbsp; 
   
### Result
   
  | Method               | Description |
  |----------------------|-------------|
  | [`DLR_GetAllDLRResults`](c-functions/result.md#dlr_getalldlrresults) | Gets all recognized results. |
  | [`DLR_FreeDLRResults`](c-functions/result.md#dlr_freedlrresults) | Frees memory allocated for recognized results. |
   
&nbsp; 

## [Enumerations]({{ site.enumerations }})
- [`DLRBarcodeFormat`]({{ site.enumerations }}other-enums.html#dlrbarcodeformat)
- [`DLRBarcodeFormat_2`]({{ site.enumerations }}other-enums.html#dlrbarcodeformat_2)
- [`DLRBinarizationMode`]({{ site.enumerations }}parameter-mode-enums.html#dlrbinarizationmode)
- [`DLRGrayscaleTransformationMode`]({{ site.enumerations }}parameter-mode-enums.html#dlrgrayscaletransformationmode)
- [`DLRImagePixelFormat`]({{ site.enumerations }}other-enums.html#dlrimagepixelformat)
- [`DLRLocalizationSourceType`]({{ site.enumerations }}other-enums.html#dlrlocalizationsourcetype)
- [`DLRRegionPredetectionMode`]({{ site.enumerations }}parameter-mode-enums.html#dlrregionpredetectionmode)
- [`DM_ChargeWay`]({{ site.enumerations }}other-enums.html#dm_chargeway)	
- [`DM_DeploymentType`]({{ site.enumerations }}other-enums.html#dm_deploymenttype)	
- [`DM_LicenseModule`]({{ site.enumerations }}other-enums.html#dm_licensemodule)	
- [`DM_UUIDGenerationMethod`]({{ site.enumerations }}other-enums.html#dm_uuidgenerationmethod)	


## [Error Code]({{ site.enumerations }}error-code.html)
		
## [Structs](structs/index.md)
- [`DLRRuntimeSettings`](structs/dlr-runtime-settings.md)	
- [`DLRQuadrilateral`](structs/dlr-quadrilateral.md)	
- [`DLRReferenceRegion`](structs/dlr-reference-region.md)	
- [`DLRResultArray`](structs/dlr-result-array.md)		
- [`DLRResult`](structs/dlr-result.md)		
- [`DLRLineResult`](structs/dlr-line-result.md)	
- [`DLRCharacterResult`](structs/dlr-character-result.md)		
- [`DLRPoint`](structs/dlr-point.md)		
- [`DLRImageData`](structs/dlr-image-data.md)		