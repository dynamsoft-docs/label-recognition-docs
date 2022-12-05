---
layout: default-layout
title: CLabelRecognition Class - Dynamsoft Label Recognition C++ API Reference
description: This page shows CLabelRecognition methods of Dynamsoft Label Recognition for C++ API Reference.
keywords: api reference, c++
needAutoGenerateSidebar: false
---


# Dynamsoft Label Recognition - CLabelRecognition Class

## General
   
  | Method               | Description |
  |----------------------|-------------|
  | [`GetErrorString`](general.md#geterrorstring) | Returns the error string. |
  | [`GetVersion`](general.md#getversion) | Returns the version number string for the SDK. |
   
&nbsp; 

## Initialization
  
  | Method               | Description |
  |----------------------|-------------|
  | [`InitLicense`](initialization.md#initlicense) | Sets the license and activates the SDK. |
  | [`InitLTSConnectionParameters`](initialization.md#initltsconnectionparameters) | Initializes a DM_LTSConnectionParameters struct with default values. |
  | [`InitLicenseFromLTS`](initialization.md#initlicensefromlts) | Initializes the label recognition license and connects to the specified server for online verification. |

&nbsp; 

## Setting

  | Method               | Description |
  |----------------------|-------------|
  | [`GetRuntimeSettings`](settings.md#getruntimesettings) | Gets the current settings and saves it into a struct. |
  | [`UpdateRuntimeSettings`](settings.md#updateruntimesettings) | Updates runtime settings with a given struct. |
  | [`ResetRuntimeSettings`](settings.md#resetruntimesettings) | Resets the runtime settings. |
  | [`AppendSettingsFromString`](settings.md#appendsettingsfromstring) | Appends LabelRecognitionParameter settings in a string to the SDK object. |
  | [`OutputSettingsToFile`](settings.md#outputsettingstofile) | Outputs LabelRecognitionParameter settings into a file (JSON file). |
  | [`ClearAppendedSettings`](settings.md#clearappendedsettings) | Clear all appended LabelRecognitionParameter settings in the SDK object. |
  | [`UpdateReferenceRegionFromBarcodeResults`](settings.md#updatereferenceregionfrombarcoderesults) | Updates reference region which is defined with source type DLR_LST_BARCODE. |
  | [`GetModeArgument`](settings.md#getmodeargument) | Get argument value for the specified mode parameter. |
  | [`SetModeArgument`](settings.md#setmodeargument) | Set argument value for the specified mode parameter. |

&nbsp; 
   
## Recognizing
   
  | Method               | Description |
  |----------------------|-------------|
  | [`RecognizeByBuffer`](recognizing.md#recognizebybuffer) | Recognizes text from memory buffer containing image pixels in defined format. |
  | [`RecognizeByFile`](recognizing.md#recognizebyfile) | Recognizes text from a specified image file. |
   
&nbsp; 
   
## Result
   
  | Method               | Description |
  |----------------------|-------------|
  | [`GetAllDLRResults`](result.md#getalldlrresults) | Gets all recognized results. |
  | [`FreeDLRResults`](result.md#freedlrresults) | Frees memory allocated for recognized results. |
   
&nbsp; 

