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
- Added library `Dynamsoft.Core.dll`. Migrated the Dynamsoft core classes/enums from library `Dynamsoft.LabelRecognizer.dll` and `DynamsoftCommon.dll` to library `Dynamsoft.Core.dll`.
- Added class [`BarcodeResult`]({{site.dotnet_api}}barcode-result.html) for users to interact with Dynamsoft Barcode Reader SDK.
- Added [`DLR_RuntimeSettings`]({{site.dotnet_api}}dlr-runtime-settings.html) property [`DictionaryPath`]({{site.dotnet_api}}dlr-runtime-settings.html#dictionarypath) and [`DictionaryCorrectionThreshold`]({{site.dotnet_api}}dlr-runtime-settings.html#dictionarycorrectionthreshold) for users to further improve the recognizing accuracy by referencing dictionary files.
- Added class [`DLR_DictionaryCorrectionThreshold`]({{site.dotnet_api}}dlr-dictionary-correction-threshold.html).
- Added class [`DLR_FurtherModes`]({{site.dotnet_api}}dlr-further-modes.html) and property [`DLR_RuntimeSettings.FurtherModes`]({{site.dotnet_api}}dlr-runtime-settings.html#furthermodes) for users to config more processing modes.
- Added enumeration [`TextureDetectionMode`]({{ site.enumerations }}texture-detection-mode.html) and property [`DLR_FurtherModes.TextureDetectionModes`]({{site.dotnet_api}}dlr-further-modes.html#texturedetectionmodes) for users to detect and remove the texture background.
- Added enumeration [`ColourConversionModes`]({{ site.enumerations }}colour-conversion-mode.html) and property [`DLR_FurtherModes.ColourConversionModes`]({{site.dotnet_api}}dlr-further-modes.html#colourconversionmodes) for users to convert color images to grayscale images in differenct ways.
- Added enumeration [`BinarizationMode`]({{ site.enumerations }}binarization-mode.html) and property [`DLR_RuntimeSettings.BinarizationModes`]({{site.dotnet_api}}dlr-runtime-settings.html#binarizationmodes) for users to convert grayscale images to binary images in different ways.
- Added enumeration [`GrayscaleEnhancementMode`]({{ site.enumerations }}grayscale-enhancement-mode.html) and property [`DLR_FurtherModes.GrayscaleEnhancementModes`]({{site.dotnet_api}}dlr-further-modes.html#grayscaleenhancementmodes) for users to enable grayscale images preprocessing.  
- Added [`CharacterHConfidence`]({{site.dotnet_api}}dlr-character-result.html#characterhconfidence), [`CharacterMConfidence`]({{site.dotnet_api}}dlr-character-result.html#charactermconfidence) and [`CharacterLConfidence`]({{site.dotnet_api}}dlr-character-result.html#characterlconfidence) properties in [`DLR_CharacterResult`]({{site.dotnet_api}}dlr-character-result.html) class so that more alternative results will be available for users.

### Improved

- Improved the neural network performance by replacing Caffe engine with OpenCV DNN engine.

### Fixed

- Fixed a bug that might cause wrong line number matching when using [`LineSpecification.LineNumber`]({{ site.parameters-reference }}line-specification/parameter-control.html#linenumber).

### API Changes

- Modified the `InitLicense(string)` to static [`InitLicense(string)`]({{site.dotnet_api}}label-recognizer.html#initlicense).
- Modified the parameter type of the method [`UpdateReferenceRegionFromBarcodeResults`]({{site.dotnet_api}}label-recognizer.html#updatereferenceregionfrombarcoderesults) from `TextResult[]` to `BarcodeResult[]`.
- Modified the parameters [`LabelRecognizerParameter.LetterHeightRange`]({{ site.parameters-reference }}label-recognition-parameter/parameter-control.html#letterheightrange) and [`TextArea.LetterHeightRange`]({{ site.parameters-reference }}text-area/parameter-control.html#letterheightrange). The value unit of the parameters are modified from percentage to thousandth. The available range of the value and the default value are updated as well.
- Renamed class `LabelRecognition` to [`LableRecognizer`]({{site.dotnet_api}}label-recognizer.html).
- Renamed exception `DLR_Exception` to [`LabelRecognizerException`](({{site.dotnet_api}}label-recognizer-exception.html)).
- Removed method `InitLicenseFromLTS`.
- Removed method `InitLTSConnectionParameters`.
- Removed class `DMLTSConnectionParameters`.
