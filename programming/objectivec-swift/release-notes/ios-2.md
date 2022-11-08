---
layout: default-layout
title: Dynamsoft Label Recognizer iOS SDK - Release Notes 2.x
description: This is the release notes page of Dynamsoft Label Recognizer for iOS SDK version 2.x.
keywords: release notes, objective-c, oc, swift
needAutoGenerateSidebar: false
---

# Release Notes - iOS 2.x

## 2.2.20 (09/29/2022)

<div class="fold-panel-prefix"></div>

### Version Highlights <i class="fa fa-caret-down"></i>

<div class="fold-panel-start"></div>

{%- include release-notes/product-highlight-2.2.md -%}

<div class="fold-panel-end"></div>

### Changelog

#### New

- Added methods in `DynamsoftLabelRecognizer` class to support video streaming recognition.
  - [`setImageSource`](../api-reference/label-recognizer.md#setimagesource): Set the source of image/video.
  - [`setLabelResultListener`](../api-reference/label-recognizer.md#setlabelresultlistener): Register a listener to receive label recognizing results.
  - [`startScanning`](../api-reference/label-recognizer.md#startscanning): Start the label recognizing processes.
  - [`stopScanning`](../api-reference/label-recognizer.md#stopscanning): Stop the label recognizing processes.
- Added methods in `DynamsoftLabelRecognizer` class to configure settings.
  - [`initRuntimeSettings`](../api-reference/label-recognizer.md#initruntimesettings)
  - [`initRuntimeSettingsFromFile`](../api-reference/label-recognizer.md#initruntimesettingsfromfile)
  - [`outputRuntimeSettings`](../api-reference/label-recognizer.md#outputruntimesettings)
  - [`outputRuntimeSettingsFromFile`](../api-reference/label-recognizer.md#outputruntimesettingstofile)
- Added a new recognition method [`recognizeFileInMemory`](../api-reference/label-recognizer.md#recognizefileinmemory) in `DynamsoftLabelRecognizer` class.
- Added a protocol [`LabelResultListener`](../api-reference/label-result-listener.md) to obtain video label recognition results.
- Added a new parameter [`timeout`](../api-reference/dlr-runtime-settings.md#timeout) to `iDLRRuntimeSettings` class.

#### Rename

- The following methods of `DynamsoftLabelRecognizer` class are renamed
  - Renamed `recognizeByFile` to [`recognizeFile`](../api-reference/label-recognizer.md#recognizefile)
  - Renamed `recognizeByBuffer` to [`recognizeBuffer`](../api-reference/label-recognizer.md#recognizebuffer)
  - Renamed `recognizeByImage` to [`recognizeImage`](../api-reference/label-recognizer.md#recognizeimage)
  - Renamed `outputSettingsToFile` to [`outputRuntimeSettingsToFile`](../api-reference/label-recognizer.md#outputruntimesettingstofile)

#### Removed

- The following methods of `DynamsoftLabelRecognizer` class are removed
  - `initLicense`. The method is replaced by `DynamsoftLicenseManager.initLicense` under `DynamsoftCore`.
  - `appendSettingsFromString`
  - `appendSettingsFromFile`
  - `clearAppendedSettings`
  - `destory`

## 2.0 (08/26/2021)

<div class="fold-panel-prefix"></div>

### Version Highlights <i class="fa fa-caret-down"></i>

<div class="fold-panel-start"></div>

{%- include release-notes/product-highlight-2.0.md -%}

<div class="fold-panel-end"></div>

### Changelog

#### New

- Added auto-deskew algorithm to improve the performance on recognizing the skewed characters.
- Added framework `DynamsoftCore.framework`. Migrated the Dynamsoft core classes from framework `DynamsoftLabelRecognizer.framework` to `DynamsoftCore.framework`.
- Added class  [`iBarcodeResult`]({{site.objectivec-swift-api}}barcode-result.html) for users to interact with Dynamsoft Barcode Reader SDK.
- Added [`iDLRRuntimeSettings`]({{site.objectivec-swift-api}}dlr-runtime-settings.html) property [`dictionaryPath`]({{site.objectivec-swift-api}}dlr-runtime-settings.html#dictionarypath) and [`dictionaryCorrectionThreshold`]({{site.objectivec-swift-api}}dlr-runtime-settings.html#dictionarycorrectionthreshold) for users to further improve the recognizing accuracy by referencing dictionary files.
- Added class [`iDLRDictionaryCorrectionThreshold`]({{site.objectivec-swift-api}}dlr-dictionary-correction-threshold.html).
- Added class [`iDLRFurtherModes`]({{site.objectivec-swift-api}}dlr-further-modes.html) and property [`iDLRRuntimeSettings.furtherModes`]({{site.objectivec-swift-api}}dlr-runtime-settings.html#furthermodes) for users to config more processing modes.
- Added enumeration [`TextureDetectionMode`]({{ site.enumerations }}texture-detection-mode.html) and property [`iDLRFurtherModes.textureDetectionModes`]({{site.objectivec-swift-api}}dlr-further-modes.html#texturedetectionmodes) for users to detect and remove the texture background.
- Added enumeration [`ColourConversionMode`]({{ site.enumerations }}colour-conversion-mode.html) and property [`iDLRFurtherModes.colourConversionModes`]({{site.objectivec-swift-api}}dlr-further-modes.html#colourconversionmodes) for users to convert color images to grayscale images in differenct ways.
- Added enumeration [`BinarizationMode`]({{ site.enumerations }}binarization-mode.html) and property [`iDLRRuntimeSettings.binarizationModes`]({{site.objectivec-swift-api}}dlr-runtime-settings.html#binarizationmodes) for users to convert grayscale images to binary images in different ways.
- Added enumeration [`GrayscaleEnhancementMode`]({{ site.enumerations }}grayscale-enhancement-mode.html) and property [`iDLRFurtherModes.grayscaleEnhancementModes`]({{site.objectivec-swift-api}}dlr-further-modes.html#grayscaleenhancementmodes) for users to enable grayscale images preprocessing. 
- Added [`characterHConfidence`]({{site.objectivec-swift-api}}dlr-character-result.html#characterhconfidence), [`characterMConfidence`]({{site.objectivec-swift-api}}dlr-character-result.html#charactermconfidence) and [`characterLConfidence`]({{site.objectivec-swift-api}}dlr-character-result.html#characterlconfidence) properties in [`iDLRCharacterResult`]({{site.objectivec-swift-api}}dlr-character-result.html) class so that more alternative results will be available for users.
- Added API [`recognizeByImage`]({{site.objectivec-swift-api}}label-recognizer.html#recognizebyimage).
- Added static method [`initLicense`]({{site.objectivec-swift-api}}label-recognizer.html#initlicense) to replace the old license activation APIs.

#### Improved

- Improved the neural network performance by replacing Caffe engine with OpenCV DNN engine.

#### Fixed

- Fixed a bug that might cause wrong line number matching when using [`LineSpecification.LineNumber`]({{ site.parameters-reference }}line-specification/parameter-control.html#linenumber).

#### API Changes

- Modified the parameter type of the method [`UpdateReferenceRegionFromBarcodeResults`]({{site.objectivec-swift-api}}label-recognizer.html#updatereferenceregionfrombarcoderesults) from `NSArray<iTextResult*>*` to `NSArray<iBarcodeResult*>*`.
- Modified the parameters [`LabelRecognizerParameter.LetterHeightRange`]({{ site.parameters-reference }}label-recognition-parameter/parameter-control.html#letterheightrange) and [`TextArea.LetterHeightRange`]({{ site.parameters-reference }}text-area/parameter-control.html#letterheightrange). The value unit of the parameters are modified from percentage to thousandth. The available range of the value and the default value are updated as well.
- Renamed framework `DynamsoftLabelRecognition` to `DynamsoftLableRecognizer`.
- Renamed protocol `DLRLTSLicenseVerificationDelegate` to `DLRLicenseVerificationDelegate`.
- Renamed protocol method `DLRLTSLicenseVerificationCallback` to `DLRLicenseVerificationCallback`.
- Removed property `license`.
- Removed method `initWithLicense`.
- Removed method `initLicenseFromLTS`.
- Removed class `iDLRLTSConnectionParameters`.
