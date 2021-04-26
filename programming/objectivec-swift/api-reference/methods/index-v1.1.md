---
layout: default-layout
title: Dynamsoft Label Recognition Objective-C & Swift API Reference - LabelRecognition Class
description: This page shows LabelRecognition methods of Dynamsoft Label Recognition for Objective-C & Swift API Reference.
keywords: api reference, objective-c, oc, swift
needAutoGenerateSidebar: false
---


# Dynamsoft Label Recognition - Objective-C & Swift Methods

## General
   
  | Method               | Description |
  |----------------------|-------------|
  | [`getVersion`](general.md#getversion) | Returns the version number string for the SDK. |
   
&nbsp; 

## Initialization
  
  | Method               | Description |
  |----------------------|-------------|
  | [`init`](initialization.md#init) | Create an instance of Dynamsoft Label Recognition. |
  | [`initWithLicense`](initialization.md#initWithLicense) | Sets the license and activates the SDK. |
  | [`initLicenseFromLTS`](initialization.md#initlicensefromlts) | Initializes the label recognition license and connects to the specified server for online verification. |

&nbsp; 

## Setting

  | Method               | Description |
  |----------------------|-------------|
  | [`getRuntimeSettings`](settings.md#getruntimesettings) | Gets the current settings and saves it into a class. |
  | [`updateRuntimeSettings`](settings.md#updateruntimesettings) | Updates runtime settings with a given class. |
  | [`resetRuntimeSettings`](settings.md#resetruntimesettings) | Resets the runtime settings. |
  | [`appendSettingsFromString`](settings.md#appendsettingsfromstring) | Appends LabelRecognitionParameter settings in a string to the SDK object. |
  | [`appendSettingsFromFile`](settings.md#appendsettingsfromFile) | Appends LabelRecognitionParameter settings from a file to the SDK object. |
  | [`outputSettingsToFile`](settings.md#outputsettingstofile) | Outputs LabelRecognitionParameter settings into a file (JSON file). |
  | [`clearAppendedSettings`](settings.md#clearappendedsettings) | Clear all appended LabelRecognitionParameter settings in the SDK object. |
  | [`updateReferenceRegionFromBarcodeResults`](settings.md#updatereferenceregionfrombarcoderesults) | Updates reference region which is defined with source type DLR_LST_BARCODE. |
  | [`getModeArgument`](settings.md#getmodeargument) | Get argument value for the specified mode parameter. |
  | [`setModeArgument`](settings.md#setmodeargument) | Set argument value for the specified mode parameter. |
  | [`appendCharacterModel`](settings.md#appendCharacterModel) | Appends CharacterModel to the SDK object. |
  | [`eraseAllCharacterModels`](settings.md#appendCharacterModel) | Erases all CharacterModels the SDK object currently loaded. |
  | [`eraseCharacterModelByName`](settings.md#appendCharacterModel) | Erases a name specified CharacterModel from the SDK object. |

&nbsp; 
   
## Recognizing
   
  | Method               | Description |
  |----------------------|-------------|
  | [`recognizeByBuffer`](recognizing.md#recognizebybuffer) | Recognizes text from memory buffer containing image pixels in defined format. |
  | [`recognizeByFile`](recognizing.md#recognizebyfile) | Recognizes text from a specified image file. |
   
&nbsp; 
   