---
layout: default-layout
title: Dynamsoft Label Recoginizer C/C++ SDK - Release Notes 2.x
description: This is the release notes page of Dynamsoft Label Recoginizer for C/C++ SDK version 2.x.
keywords: release notes, c, c++
needAutoGenerateSidebar: false
---

# Release Notes - C/C++ 2.x

## 2.0 (06/28/2021)

### New
- Added auto-deskew algorithm to improve the performance on recognizing the skewed characters. 
- Added header file `DynamsoftCore.h` to replace the header file `DynamsoftCommon.h`. All the core structs/enums in `DynamsoftLabelRecognizer.h` and `DynamsoftCommon.h` are migrated to the header file `DynamsoftCore.h`.
- Added struct `BarcodeResultArray` and `BarcodeResult` for users to interact with Dynamsoft Barcode Reader SDK.
- Added `DLR_RuntimeSettings` property `dictionaryPath` and `dictionaryCorrectionThresholds` for users to further improve the recognizing accuracy by referencing dictionary files.
- Added struct `DLR_DictionaryCorrectionThreshold`.
- Added struct `DLR_FurtherModes` and property `DLR_RuntimeSettings.furtherModes` for users to config more processing modes.
- Added enumeration `TextureDetectionMode` and property `DLR_FurtherModes.textureDetectionModes` for users to detect and remove the texture background.
- Added enumeration `ColourConversionModes` and property `DLR_FurtherModes.colourConversionModes` for users to convert color images to grayscale images in differenct ways.
- Added enumeration `BinarizationMode` and property `DLR_RuntimeSettings.binarizationModes` for users to convert grayscale images to binary images in different ways.
- Added enumeration `GrayscaleEnhancementMode` and property `DLR_FurtherModes.grayscaleEnhancementModes` for users to enable grayscale images preprocessing. 
- Added `charaterHConfidence`, `charaterMConfidence` and `charaterLConfidence` properties in `DLRCharacterResult` struct so that more alternative results will be available for users.


### Improved
- Improved the neural network performance by replacing Caffe engine with OpenCV DNN engine.

### Fixed
- Fixed a bug that might cause wrong line number matching when using `LineSpecification.LineNumber`.

### API Changes
- Modified the function DLR_InitLicense(void*, const char*) to DLR_InitLicense(const char*,char errorMsgBuffer[], const int errorMsgBufferLen). (C)
- Modified the method InitLicense(const char*) to static InitLicense(const char*,char errorMsgBuffer[] = NULL, const int errorMsgBufferLen = 0). (C++)
- Modified the first parameter type of the method `UpdateReferenceRegionFromBarcodeResults` from `TextResultArray` to `BarcodeResultArray`.
- Modified the parameters `LabelRecognizerParameter.LetterHeightRange` and `TextArea.LetterHeightRange`. The value unit of the parameters are modified from percentage to thousandth. The available range of the value and the default value are updated as well.
- Renamed class CLabelRecognition to CLableRecognizer.
- Renamed function DLR_GetAllDLRResults to DLR_GetAllResults
- Renamed function DLR_FreeDLRResults to DLR_FreeResults
- Renamed method CLabelRecognizer::GetAllDLRResults to CLabelRecognizer::GetAllResults
- Renamed method CLabelRecognizer::FreeDLRResults to CLabelRecognizer::FreeResults
- Renamed enum DLRLocalizationSourceType to LocalizationSourceType
- Renamed struct DLRReferenceRegion to DLR_ReferenceRegion
- Renamed struct DLRRuntimeSettings to DLR_RuntimeSettings
- Renamed struct DLRCharacterResult to DLR_CharacterResult
- Renamed struct DLRLineResult to DLR_LineResult
- Renamed struct DLRResult to DLR_Result
- Renamed struct DLRResultArray to DLR_ResultArray
- Removed function `DLR_InitLicenseFromLTS`.
- Removed function `DLR_InitLTSConnectionParameters`.
- Removed struct `DM_LTSConnectionParameters`.

