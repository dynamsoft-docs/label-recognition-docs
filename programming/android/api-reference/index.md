---
layout: default-layout
title: Dynamsoft Label Recognition Android API Reference - Main Page
description: This is the main page of Dynamsoft Label Recognition for Android API Reference.
keywords: api reference, android
needAutoGenerateSidebar: false
breadcrumbText: API Reference
---

# Dynamsoft Label Recognition - Android API Reference

- [`LabelRecognition` Methods](#label-recognition-methods) 
- [Classes](#classes)  
- [Enumerations](#enumerations)
- [Error Code](#error-code)

## LabelRecognition Methods

### General
   
  | Method               | Description |
  |----------------------|-------------|
  | [`getVersion`](label-recognition/general.md#getversion) | Returns the version number string for the SDK. |
   
&nbsp; 

### Initialization
  
  | Method               | Description |
  |----------------------|-------------|
  | [`LabelRecognition`](label-recognition/initialization.md#labelrecognition) | Initialization of `LabelRecognition` object.|
  | [`destroy`](label-recognition/initialization.md#destroy) | Destroys an instance of `LabelRecognition` object.|   
  | [`initLicense`](label-recognition/initialization.md#initlicense) | Sets the license and activates the SDK. |
  | [`initLicenseFromLTS`](label-recognition/initialization.md#initlicensefromlts) | Initializes the label recognition license and connects to the specified server for online verification. |

&nbsp; 

### Settings

  | Method               | Description |
  |----------------------|-------------|
  | [`getRuntimeSettings`](label-recognition/settings.md#getruntimesettings) | Gets the current settings and saves it into a struct. |
  | [`updateRuntimeSettings`](label-recognition/settings.md#updateruntimesettings) | Updates runtime settings with a given struct. |
  | [`resetRuntimeSettings`](label-recognition/settings.md#resetruntimesettings) | Resets the runtime settings. |
  | [`appendSettingsFromString`](label-recognition/settings.md#appendsettingsfromstring) | Appends LabelRecognitionParameter settings in a string to the SDK object. |
  | [`outputSettingsToFile`](label-recognition/settings.md#outputsettingstofile) | Outputs LabelRecognitionParameter settings into a file (JSON file). |
  | [`clearAppendedSettings`](label-recognition/settings.md#clearappendedsettings) | Clear all appended LabelRecognitionParameter settings in the SDK object. |
  | [`updateReferenceRegionFromBarcodeResults`](label-recognition/settings.md#updatereferenceregionfrombarcoderesults) | Updates reference region which is defined with source type DLR_LST_BARCODE. |
  | [`getModeArgument`](label-recognition/settings.md#getmodeargument) | Get argument value for the specified mode parameter. |
  | [`setModeArgument`](label-recognition/settings.md#setmodeargument) | Set argument value for the specified mode parameter. |

&nbsp; 
   
### Recognizing
   
  | Method               | Description |
  |----------------------|-------------|
  | [`recognizeByBuffer`](label-recognition/recognizing.md#recognizebybuffer) | Recognizes text from memory buffer containing image pixels in defined format. |
  | [`recognizeByFile`](label-recognition/recognizing.md#recognizebyfile) | Recognizes text from a specified image file. |
   
&nbsp; 

## [Class](class/index.md)
- [`DLRRuntimeSettings`](class/dlr-runtime-settings.md)	
- [`DLRQuadrilateral`](class/dlr-quadrilateral.md)	
- [`DLRReferenceRegion`](class/dlr-reference-region.md)	
- [`DLRResult`](class/dlr-result.md)		
- [`DLRLineResult`](class/dlr-line-Result.md)	
- [`DLRCharacterResult`](class/dlr-character-result.md)		
- [`DLRPoint`](class/dlr-point.md)		
- [`DLRImageData`](class/dlr-image-data.md)		

&nbsp; 

## [Enumerations]({{ site.enumerations }})
- [`EnumDLRImagePixelFormat`]({{ site.enumerations }}other-enums.html#enumdlrimagepixelformat)
- [`EnumDLRRegionPredetectionMode`]({{ site.enumerations }}parameter-mode-enums.html#enumdlrregionpredetectionmode)
- [`EnumDLRBinarizationMode`]({{ site.enumerations }}parameter-mode-enums.html#enumdlrbinarizationmode)
- [`EnumDLRGrayscaleTransformationMode`]({{ site.enumerations }}parameter-mode-enums.html#enumdlrgrayscaletransformationmode)
- [`EnumDMChargeWay`]({{ site.enumerations }}other-enums.html#enumdmchargeway)	
- [`EnumDMLicenseModule`]({{ site.enumerations }}other-enums.html#enumdmlicensemodule)	
- [`EnumDMUUIDGenerationMethod`]({{ site.enumerations }}other-enums.html#enumdmuuidgenerationmethod)	

&nbsp; 

## [Error Code]({{ site.enumerations }}error-code.html)
		
