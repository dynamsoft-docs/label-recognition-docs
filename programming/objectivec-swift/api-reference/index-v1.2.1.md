---
layout: default-layout
title: Dynamsoft Label Recognition Objective-C & Swift API Reference - Main Page
description: This is the main page of Dynamsoft Label Recognition for Objective-C & Swift API Reference.
keywords: api reference, objective-c, oc, swift
needAutoGenerateSidebar: false
---

# Dynamsoft Label Recognition - Objective-C & Swift API Reference

- [Methods](#methods) 
- [Classes](#classes)  
- [Enumerations](#enumerations)
- [Error Code](#error-code)

## Methods

### General
   
  | Method               | Description |
  |----------------------|-------------|
  | [`getVersion`](methods/general.md#getversion) | Returns the version number string for the SDK. |
   
&nbsp; 

### Initialization
  
  | Method               | Description |
  |----------------------|-------------|
  | [`init`](methods/initialization.md#init) | Create an instance of Dynamsoft Label Recognition. |
  | [`initWithLicense`](methods/initialization.md#initWithLicense) | Sets the license and activates the SDK. |
  | [`initLicenseFromLTS`](methods/initialization.md#initlicensefromlts) | Initializes the label recognition license and connects to the specified server for online verification. |

&nbsp; 

### Setting

  | Method               | Description |
  |----------------------|-------------|
  | [`getRuntimeSettings`](methods/settings.md#getruntimesettings) | Gets the current settings and saves it into a class. |
  | [`updateRuntimeSettings`](methods/settings.md#updateruntimesettings) | Updates runtime settings with a given class. |
  | [`resetRuntimeSettings`](methods/settings.md#resetruntimesettings) | Resets the runtime settings. |
  | [`appendSettingsFromString`](methods/settings.md#appendsettingsfromstring) | Appends LabelRecognitionParameter settings in a string to the SDK object. | 
  | [`appendSettingsFromFile`](methods/settings.md#appendsettingsfromFile) | Appends LabelRecognitionParameter settings from a file to the SDK object. |
  | [`outputSettingsToFile`](methods/settings.md#outputsettingstofile) | Outputs LabelRecognitionParameter settings into a file (JSON file). |
  | [`clearAppendedSettings`](methods/settings.md#clearappendedsettings) | Clear all appended LabelRecognitionParameter settings in the SDK object. |
  | [`updateReferenceRegionFromBarcodeResults`](methods/settings.md#updatereferenceregionfrombarcoderesults) | Updates reference region which is defined with source type DLR_LST_BARCODE. |
  | [`getModeArgument`](methods/settings.md#getmodeargument) | Get argument value for the specified mode parameter. |
  | [`setModeArgument`](methods/settings.md#setmodeargument) | Set argument value for the specified mode parameter. |
  | [`appendCharacterModel`](methods/settings.md#appendCharacterModel) | Appends CharacterModel to the SDK object. |
  | [`eraseAllCharacterModels`](methods/settings.md#appendCharacterModel) | Erases all CharacterModels the SDK object currently loaded. |
  | [`eraseCharacterModelByName`](methods/settings.md#appendCharacterModel) | Erases a name specified CharacterModel from the SDK object. |

&nbsp; 
   
### Recognizing
   
  | Method               | Description |
  |----------------------|-------------|
  | [`recognizeByBuffer`](methods/recognizing.md#recognizebybuffer) | Recognizes text from memory buffer containing image pixels in defined format. |
  | [`recognizeByFile`](methods/recognizing.md#recognizebyfile) | Recognizes text from a specified image file. |
   
&nbsp; 

## [Classes](class/index.md)
- [`iDLRLTSConnectionParameters`](dlr-lts-connection-parameters.md)
- [`iDLRCharacterResult`](class/dlr-character-result.md)		
- [`iDLRImageData`](class/dlr-image-data.md)		
- [`iDLRLineResult`](class/dlr-line-result.md)	
- [`iDLRQuadrilateral`](class/dlr-quadrilateral.md)	
- [`iDLRReferenceRegion`](class/dlr-reference-region.md)	
- [`iDLRResult`](class/dlr-result.md)		
- [`iDLRRuntimeSettings`](class/dlr-runtime-settings.md)	

&nbsp; 

## [Enumerations]({{ site.enumerations }})
- [`EnumBarcodeFormat`]({{ site.enumerations }}other-enums.html#dlrbarcodeformat)
- [`EnumBarcodeFormat_2`]({{ site.enumerations }}other-enums.html#dlrbarcodeformat_2)
- [`EnumDLRBinarizationMode`]({{ site.enumerations }}parameter-mode-enums.html#dlrbinarizationmode)
- [`EnumDLRGrayscaleTransformationMode`]({{ site.enumerations }}parameter-mode-enums.html#dlrgrayscaletransformationmode)
- [`EnumDLRImagePixelFormat`]({{ site.enumerations }}other-enums.html#dlrimagepixelformat)
- [`EnumDLRLocalizationSourceType`]({{ site.enumerations }}other-enums.html#dlrlocalizationsourcetype)
- [`EnumDLRRegionPredetectionMode`]({{ site.enumerations }}parameter-mode-enums.html#dlrregionpredetectionmode)
- [`EnumDMChargeWay`]({{ site.enumerations }}other-enums.html#dm_chargeway)	
- [`EnumDMLicenseModule`]({{ site.enumerations }}other-enums.html#dm_licensemodule)	
- [`EnumDMUUIDGenerationMethod`]({{ site.enumerations }}other-enums.html#dm_uuidgenerationmethod)	
- [`EnumProduct`]({{ site.enumerations }}other-enums.html#product)	

&nbsp; 

## [Error Code]({{ site.enumerations }}error-code.html)
		
