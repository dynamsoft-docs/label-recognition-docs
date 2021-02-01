---
layout: default-layout
title: Dynamsoft Label Recognition C++ API Reference - CLabelRecognition Class
description: This page shows CLabelRecognition methods of Dynamsoft Label Recognition for C++ API Reference.
keywords: api reference, c++
needAutoGenerateSidebar: false
breadcrumbText: CLabelRecognition Class
---


# Dynamsoft Label Recognition - CLabelRecognition Class

## General
   
  | Method               | Description |
  |----------------------|-------------|
  | [`GetErrorString`](general.mdgeterrorstring) | Returns the error string. |
  | [`GetVersion`](general.mdgetversion) | Returns the version number string for the SDK. |
   
&nbsp; 

## Initialization
  
  | Method               | Description |
  |----------------------|-------------|
  | [`InitLicense`](initialization.mdinitlicense) | Sets the license and activates the SDK. |
  | [`InitLTSConnectionParameters`](initialization.md#initltsconnectionparameters) | Initializes a DM_LTSConnectionParameters struct with default values. |
  | [`InitLicenseFromLTS`](initialization.md#initlicensefromlts) | Initializes the label recognition license and connects to the specified server for online verification. |

&nbsp; 

## Settings

  | Method               | Description |
  |----------------------|-------------|
  | [`GetRuntimeSettings`](settings.mdgetruntimesettings) | Gets the current settings and saves it into a struct. |
  | [`UpdateRuntimeSettings`](settings.mdupdateruntimesettings) | Updates runtime settings with a given struct. |
  | [`ResetRuntimeSettings`](settings.mdresetruntimesettings) | Resets the runtime settings. |
  | [`AppendSettingsFromString`](settings.mdappendsettingsfromstring) | Appends LabelRecognitionParameter settings in a string to the SDK object. |
  | [`OutputSettingsToFile`](settings.mdoutputsettingstofile) | Outputs LabelRecognitionParameter settings into a file (JSON file). |
  | [`ClearAppendedSettings`](settings.mdclearappendedsettings) | Clear all appended LabelRecognitionParameter settings in the SDK object. |
  | [`UpdateReferenceRegionFromBarcodeResults`](settings.md#updatereferenceregionfrombarcoderesults) | Updates reference region which is defined with source type DLR_LST_BARCODE. |
  | [`GetModeArgument`](settings.md#getmodeargument) | Get argument value for the specified mode parameter. |
  | [`SetModeArgument`](settings.md#setmodeargument) | Set argument value for the specified mode parameter. |

&nbsp; 
   
## Recognizing
   
  | Method               | Description |
  |----------------------|-------------|
  | [`RecognizeByBuffer`](recognizing.mdrecognizebybuffer) | Recognizes text from memory buffer containing image pixels in defined format. |
  | [`RecognizeByFile`](recognizing.mdrecognizebyfile) | Recognizes text from a specified image file. |
   
&nbsp; 
   
## Result
   
  | Method               | Description |
  |----------------------|-------------|
  | [`GetAllDLRResults`](result.mdgetalldlrresults) | Gets all recognized results. |
  | [`FreeDLRResults`](result.mdfreedlrresults) | Frees memory allocated for recognized results. |
       
&nbsp; 

