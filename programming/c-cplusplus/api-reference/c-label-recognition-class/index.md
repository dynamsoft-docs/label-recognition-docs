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
  | [`GetErrorString`](general.md#dlr_geterrorstring) | Returns the error string. |
  | [`GetVersion`](general.md#dlr_getversion) | Returns the version number string for the SDK. |
   
&nbsp; 

## Initialization
  
  | Method               | Description |
  |----------------------|-------------|
  | [`InitLicense`](initialization.md#dlr_initlicense) | Sets the license and activates the SDK. |
  | [`InitLTSConnectionParameters`](initialization.md#initltsconnectionparameters) | Initializes a DM_LTSConnectionParameters struct with default values. |
  | [`InitLicenseFromLTS`](initialization.md#initlicensefromlts) | Initializes the label recognition license and connects to the specified server for online verification. |

&nbsp; 

## Settings

  | Method               | Description |
  |----------------------|-------------|
  | [`GetRuntimeSettings`](settings.md#dlr_getruntimesettings) | Gets the current settings and saves it into a struct. |
  | [`UpdateRuntimeSettings`](settings.md#dlr_updateruntimesettings) | Updates runtime settings with a given struct. |
  | [`ResetRuntimeSettings`](settings.md#dlr_resetruntimesettings) | Resets the runtime settings. |
  | [`AppendSettingsFromString`](settings.md#dlr_appendsettingsfromstring) | Appends LabelRecognitionParameter settings in a string to the SDK object. |
  | [`OutputSettingsToFile`](settings.md#dlr_outputsettingstofile) | Outputs LabelRecognitionParameter settings into a file (JSON file). |
  | [`ClearAppendedSettings`](settings.md#dlr_clearappendedsettings) | Clear all appended LabelRecognitionParameter settings in the SDK object. |

&nbsp; 
   
## Recognizing
   
  | Method               | Description |
  |----------------------|-------------|
  | [`RecognizeByBuffer`](recognizing.md#dlr_recognizebybuffer) | Recognizes text from memory buffer containing image pixels in defined format. |
  | [`RecognizeByFile`](recognizing.md#dlr_recognizebyfile) | Recognizes text from a specified image file. |
  | [`RecognizeBasedOnDBRResultsByBuffer`](recognizing.md#dlr_RecognizeBasedOnDBRResultsByBuffer) | Recognizes text from memory buffer containing image pixels in defined format according to barcode results from DBR SDK. |
  | [`RecognizeBasedOnDBRResultsByFile`](recognizing.md#dlr_RecognizeBasedOnDBRResultsByFile) |Recognizes text from a specified image file according to barcode results from DBR SDK. |
   
&nbsp; 
   
## Result
   
  | Method               | Description |
  |----------------------|-------------|
  | [`GetAllDLRResults`](result.md#dlr_getalldlrresults) | Gets all recognized results. |
  | [`FreeDLRResults`](result.md#dlr_freedlrresults) | Frees memory allocated for recognized results. |
       
&nbsp; 

