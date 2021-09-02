---
layout: default-layout
title: Dynamsoft Label Recoginizer C/C++ SDK - Release Notes 2.x
description: This is the release notes page of Dynamsoft Label Recoginizer for C/C++ SDK version 2.x.
keywords: release notes, c, c++
needAutoGenerateSidebar: false
---

# Release Notes - C/C++ 2.x

## 2.0 (08/26/2021)

### Highlights

<div class="fold-panel-prefix"></div>

#### Product Highlights <i class="fa fa-caret-down"></i>

<div class="fold-panel-start"></div>

{%- include release-notes/product-highlight-2.0.md -%}

<div class="fold-panel-end"></div>

### Changelog
#### New
- Added auto-deskew algorithm to improve the performance on recognizing the skewed characters. 
- Added header file `DynamsoftCore.h` to replace the header file `DynamsoftCommon.h`. All the core structs/enums in `DynamsoftLabelRecognizer.h` and `DynamsoftCommon.h` are migrated to the header file `DynamsoftCore.h`.
- Added struct [`BarcodeResultArray`](../api-reference/barcode-result-array.md) and [`BarcodeResult`](../api-reference/barcode-result.md) for users to interact with Dynamsoft Barcode Reader SDK.
- Added [`DLR_RuntimeSettings`](../api-reference/dlr-runtime-settings.md) property [`dictionaryPath`](../api-reference/dlr-runtime-settings.md#dictionarypath) and [`dictionaryCorrectionThreshold`](../api-reference/dlr-runtime-settings.md#dictionarycorrectionthreshold) for users to further improve the recognizing accuracy by referencing dictionary files.
- Added struct [`DLR_DictionaryCorrectionThreshold`](../api-reference/dlr-dictionary-correction-threshold.md).
- Added struct [`DLR_FurtherModes`](../api-reference/dlr-further-modes.md) and property [`DLR_RuntimeSettings.furtherModes`](../api-reference/dlr-runtime-settings.md#furthermodes) for users to config more processing modes.
- Added enumeration [`TextureDetectionMode`]({{ site.enumerations }}texture-detection-mode.html) and property [`DLR_FurtherModes.textureDetectionModes`](../api-reference/dlr-further-modes.md#texturedetectionmodes) for users to detect and remove the texture background.
- Added enumeration [`ColourConversionMode`]({{ site.enumerations }}colour-conversion-mode.html) and property [`DLR_FurtherModes.colourConversionModes`](../api-reference/dlr-further-modes.md#colourconversionmodes) for users to convert color images to grayscale images in differenct ways.
- Added enumeration [`BinarizationMode`]({{ site.enumerations }}binarization-mode.html) and property [`DLR_RuntimeSettings.binarizationModes`](../api-reference/dlr-runtime-settings.md#binarizationmodes) for users to convert grayscale images to binary images in different ways.
- Added enumeration [`GrayscaleEnhancementMode`]({{ site.enumerations }}grayscale-enhancement-mode.html) and property [`DLR_FurtherModes.grayscaleEnhancementModes`](../api-reference/dlr-further-modes.md#grayscaleenhancementmodes) for users to enable grayscale images preprocessing. 
- Added [`charaterHConfidence`](../api-reference/dlr-character-result.md#characterhconfidence), [`charaterMConfidence`](../api-reference/dlr-character-result.md#charactermconfidence) and [`charaterLConfidence`](../api-reference/dlr-character-result.md#characterlconfidence) properties in [`DLRCharacterResult`](../api-reference/dlr-character-result.md) struct so that more alternative results will be available for users.


#### Improved
- Improved the neural network performance by replacing Caffe engine with OpenCV DNN engine.

#### Fixed
- Fixed a bug that might cause wrong line number matching when using [`LineSpecification.LineNumber`]({{ site.parameters-reference }}line-specification/parameter-control.html#linenumber).

#### API Changes
- Modified the function `DLR_InitLicense(void*, const char*)` to [`DLR_InitLicense(const char*,char errorMsgBuffer[], const int errorMsgBufferLen)`](../api-reference/label-recognizer-functions.md#dlr_initlicense) (C).
- Modified the method `InitLicense(const char*)` to static [`InitLicense(const char*,char errorMsgBuffer[] = NULL, const int errorMsgBufferLen = 0)`](../api-reference/label-recognizer.md#initlicense) (C++).
- Modified the first parameter type of the method [`UpdateReferenceRegionFromBarcodeResults`](../api-reference/label-recognizer.md#updatereferenceregionfrombarcoderesults) from `TextResultArray` to `BarcodeResultArray`.
- Modified the parameters [`LabelRecognizerParameter.LetterHeightRange`]({{ site.parameters-reference }}label-recognition-parameter/parameter-control.html#letterheightrange) and [`TextArea.LetterHeightRange`]({{ site.parameters-reference }}text-area/parameter-control.html#letterheightrange). The value unit of the parameters are modified from percentage to thousandth. The available range of the value and the default value are updated as well.
- Renamed class `CLabelRecognition` to [`CLableRecognizer`](../api-reference/label-recognizer.md).
- Renamed function `DLR_GetAllDLRResults` to [`DLR_GetAllResults`](../api-reference/label-recognizer-functions.md#dlr_getallresults).
- Renamed function `DLR_FreeDLRResults` to [`DLR_FreeResults`](../api-reference/label-recognizer-functions.md#dlr_freeresults).
- Renamed method `GetAllDLRResults` to [`GetAllResults`](../api-reference/label-recognizer.md#getallresults).
- Renamed method `FreeDLRResults` to [`FreeResults`](../api-reference/label-recognizer.md#freeresults).
- Renamed enum `DLRLocalizationSourceType` to [`LocalizationSourceType`]({{ site.enumerations }}localization-source-type.html).
- Renamed struct `DLRReferenceRegion` to [`DLR_ReferenceRegion`](../api-reference/dlr-reference-region.md).
- Renamed struct `DLRRuntimeSettings` to [`DLR_RuntimeSettings`](../api-reference/dlr-runtime-settings.md).
- Renamed struct `DLRCharacterResult` to [`DLR_CharacterResult`](../api-reference/dlr-character-result.md).
- Renamed struct `DLRLineResult` to [`DLR_LineResult`](../api-reference/dlr-line-result.md).
- Renamed struct `DLRResult` to [`DLR_Result`](../api-reference/dlr-result.md).
- Renamed struct `DLRResultArray` to [`DLR_ResultArray`](../api-reference/dlr-result-array.md).
- Removed function `DLR_InitLicenseFromLTS`.
- Removed function `DLR_InitLTSConnectionParameters`.
- Removed struct `DM_LTSConnectionParameters`.

