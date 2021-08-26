---
layout: default-layout
title: Dynamsoft Label Recognizer Android SDK - Release Notes 2.x
description: This is the release notes page of Dynamsoft Label Recognizer for Android SDK version 2.x.
keywords: release notes, android
needAutoGenerateSidebar: false
---

# Release Notes - Android 2.x

## 2.0 (08/26/2021)

### New

- Added auto-deskew algorithm to improve the performance on recognizing the skewed characters.
- Added package `DynamsoftCoreAndroid.aar`. Migrated the Dynamsoft core classes/enums from package `DynamsoftLabelRecognizerAndroid.aar` to ` DynamsoftCoreAndroid.aar`.
- Added class `BarcodeResult` for users to interact with Dynamsoft Barcode Reader SDK.
- Added `DLRRuntimeSettings` property `dictionaryPath` and `dictionaryCorrectionThresholds` for users to further improve the recognizing accuracy by referencing dictionary files.
- Added class `DLRDictionaryCorrectionThreshold`.
- Added class `DLRFurtherModes` and property `DLRRuntimeSettings.furtherModes` for users to config more processing modes.
- Added enumeration `TextureDetectionMode` and property `DLRFurtherModes.textureDetectionModes` for users to detect and remove the texture background. 
- Added enumeration `ColourConversionModes` and property `DLRFurtherModes.colourConversionModes` for users to convert color images to grayscale images in differenct ways. 
- Added enumeration `BinarizationMode` and property `DLRRuntimeSettings.binarizationModes` for users to convert grayscale images to binary images in different ways. 
- Added enumeration `GrayscaleEnhancementMode` and property `DLRFurtherModes.grayscaleEnhancementModes` for users to enable grayscale images preprocessing.  
- Added `charaterHConfidence`, `charaterMConfidence` and `charaterLConfidence` properties in `DLRCharacterResult` class so that more alternative results will be available for users.
- Added API `recognizeByImage`.

### Improved

- Improved the neural network performance by replacing Caffe engine with OpenCV DNN engine. 

### Fixed

- Fixed a bug that might cause wrong line number matching when using `LineSpecification.LineNumber`.

### API Changes

- Modified the method InitLicense(String) to static InitLicense(String, DLRLicenseVerificationListener)
- Modified the parameter type of the method `UpdateReferenceRegionFromBarcodeResults` from `TextResult[]` to `BarcodeResult[]`.
- Modified the parameters `LabelRecognizerParameter.LetterHeightRange` and `TextArea.LetterHeightRange`. The value unit of the parameters are modified from percentage to thousandth. The available range of the value and the default value are updated as well.
- Renamed class LabelRecognition to LableRecognizer
- Renamed interface DLRLTSLicenseVerificationListener to DLRLicenseVerificationListener
- Renamed interface method LTSLicenseVerificationCallback to DLRLicenseVerificationCallback.
- Removed method `initLicenseFromLTS`.
- Removed method LabelRecognizer(string license).
- Removed class `DMLTSConnectionParameters`.



