---
layout: default-layout
title: Dynamsoft Label Recognizer .Net SDK - Release Notes 2.x
description: This is the release notes page of Dynamsoft Label Recognizer for .Net SDK version 2.x.
keywords: release notes, .Net
needAutoGenerateSidebar: false
---

# Release Notes - .Net 2.x

## 2.0 (08/26/2021)

### New
- Added auto-deskew algorithm to improve the performance on recognizing the skewed characters.
- Added library `Dynamsoft.Core.dll`. Migrated the Dynamsoft core classes/enums from library `Dynamsoft.LabelRecognizer.dll` and `DynamsoftCommon.dll` to library ` Dynamsoft.Core.dll`.
- Added class `BarcodeResult` for users to interact with Dynamsoft Barcode Reader SDK.
- Added `DLR_RuntimeSettings` property `DictionaryPath` and `DictionaryCorrectionThresholds` for users to further improve the recognizing accuracy by referencing dictionary files.
- Added class `DLR_DictionaryCorrectionThreshold`.
- Added class `DLR_FurtherModes` and property `DLR_RuntimeSettings.FurtherModes` for users to config more processing modes.
- Added enumeration `TextureDetectionMode` and property `DLR_FurtherModes.TextureDetectionModes` for users to detect and remove the texture background. 
- Added enumeration `ColourConversionModes` and property `DLR_FurtherModes.ColourConversionModes` for users to convert color images to grayscale images in differenct ways. 
- Added enumeration `BinarizationMode` and property `DLR_RuntimeSettings.B inarizationModes` for users to convert grayscale images to binary images in different ways. 
- Added enumeration `GrayscaleEnhancementMode` and property `DLR_FurtherModes.G rayscaleEnhancementModes` for users to enable grayscale images preprocessing.  
- Added `CharaterHConfidence`, `CharaterMConfidence` and `CharaterLConfidence` properties in `DLR_CharacterResult` class so that more alternative results will be available for users.

### Improved
- Improved the neural network performance by replacing Caffe engine with OpenCV DNN engine.

### Fixed
- Fixed a bug that might cause wrong line number matching when using `LineSpecification.LineNumber`.

### API Changes
- Modified the InitLicense(string) to static InitLicense(string)
- Modified the parameter type of the method `UpdateReferenceRegionFromBarcodeResults` from `TextResult[]` to `BarcodeResult[]`.
- Modified the parameters `LabelRecognizerParameter.LetterHeightRange` and `TextArea.LetterHeightRange`. The value unit of the parameters are modified from percentage to thousandth. The available range of the value and the default value are updated as well.
- Renamed class LabelRecognition to LableRecognizer
- Renamed exception DLR_Exception to LabelRecognizerException
- Removed method `InitLicenseFromLTS`.
- Removed method `InitLTSConnectionParameters`.
- Removed class `DMLTSConnectionParameters`.


