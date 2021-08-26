---
layout: default-layout
title: Dynamsoft Label Recognizer iOS SDK - Release Notes 2.x
description: This is the release notes page of Dynamsoft Label Recognizer for iOS SDK version 2.x.
keywords: release notes, objective-c, oc, swift
needAutoGenerateSidebar: false
---

# Release Notes - iOS 2.x

## 2.0 (08/26/2021)

### New
- Added auto-deskew algorithm to improve the performance on recognizing the skewed characters.
- Added framework `DynamsoftCore.framework`. Migrated the Dynamsoft core classes from framework `DynamsoftLabelRecognizer.framework` to ` DynamsoftCore.framework`.
- Added class  `iBarcodeResult` for users to interact with Dynamsoft Barcode Reader SDK.
- Added `iDLRRuntimeSettings` property `dictionaryPath` and `dictionaryCorrectionThresholds` for users to further improve the recognizing accuracy by referencing dictionary files.
- Added class `iDLRDictionaryCorrectionThreshold`
- Added class `iDLRFurtherModes` and property `iDLRRuntimeSettings.furtherModes` for users to config more processing modes.
- Added enumeration `TextureDetectionMode` and property `iDLRFurtherModes.textureDetectionModes` for users to detect and remove the texture background. 
- Added enumeration `ColourConversionModes` and property `iDLRFurtherModes.colourConversionModes` for users to convert color images to grayscale images in differenct ways. 
- Added enumeration `BinarizationMode` and property `iDLRRuntimeSettings.binarizationModes` for users to convert grayscale images to binary images in different ways. 
- Added enumeration `GrayscaleEnhancementMode` and property `iDLRFurtherModes.grayscaleEnhancementModes` for users to enable grayscale images preprocessing.  
- Added `charaterHConfidence`, `charaterMConfidence` and `charaterLConfidence` properties in `iDLRCharacterResult` class so that more alternative results will be available for users.
- Added API `recognizeByImage`.
- Added static method `initLicense` to replace the old license activation APIs.

### Improved
- Improved the neural network performance by replacing Caffe engine with OpenCV DNN engine.

### Fixed
- Fixed a bug that might cause wrong line number matching when using `LineSpecification.LineNumber`.

### API Changes
- Modified the parameter type of the method `UpdateReferenceRegionFromBarcodeResults` from ` NSArray<iTextResult*>*` to ` NSArray<iBarcodeResult*>*`.
- Modified the parameters `LabelRecognizerParameter.LetterHeightRange` and `TextArea.LetterHeightRange`. The value unit of the parameters are modified from percentage to thousandth. The available range of the value and the default value are updated as well.
- Renamed framework DynamsoftLabelRecognition to DynamsoftLableRecognizer
- Renamed protocol DLRLTSLicenseVerificationDelegate to DLRLicenseVerificationDelegate
- Renamed protocol method DLRLTSLicenseVerificationCallback to DLRLicenseVerificationCallback
- Removed property `license`
- Removed method `initWithLicense`
- Removed method `initLicenseFromLTS`.
- Removed class `iDLRLTSConnectionParameters`.

