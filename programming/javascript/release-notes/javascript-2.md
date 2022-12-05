---
layout: default-layout
title: JavaScript 2.x Release Notes  - Dynamsoft Label Recognizer
description: This is the Release Notes page for Dynamsoft Label Recognizer JavaScript SDK.
keywords:  label recognizer, release notes, javascript
needAutoGenerateSidebar: true
noTitleIndex: true
breadcrumbText: v2.x Release Notes
---

# Release Notes - JavaScript 2.x

## 2.2.11 (08/08/2022)

### ADDED

* Added option `captureAndRecognizeInParallel` to the interface `ScanSettings` to control whether to speed up the recognition by capturing the next frame in advance.

### CHANGED

* The method `setImageSource()` now takes an additional parameter `options` which helps to pass the information needed by the `LabelRecognizer` object, such as the definition (`Dynamsoft.DCE.DrawingItem`) for creating the shapes that highlight barcodes.
* The method `pauseScanning()` now accepts an optional parameter `options`, which can control the behavior of the pause, such as whether to keep results highlighted (`keepResultsHighlighted`).
* This version uses [Dynamsoft Camera Enhancer version 3.0.1](https://www.dynamsoft.com/camera-enhancer/docs/programming/javascript/release-note/release-notes-3.x.html?ver=latest#301-08042022).

### FIXED

* Fix a bug with VIN result verification, which may lead to errors when the VIN code start and end with the character "1".

## 2.2.10 (06/21/2022)

### ADDED

* Added event [`onVINRead`](../api-reference/recognize.md#onvinread). This event is used when the SDK is configured with the template "VIN" or "video-VIN" in which case extra processing is applied for better recognition of VIN codes.

### IMPROVED

* Reduced the size of MRZ model from 10MB to 2.56MB. This significantly reduces the time for the initialization of the SDK for MRZ recognition.
* Improved single-line text confidence. This enables users to perform confidence filtering on the generated results to improve recognition accuracy.
* Improved character segmentation when dealing with some connected characters. This improves the recognition accuracy.

## 2.2.4 (04/14/2022)

### ADDED

* Added method `setImageSource()` to specify an Image Source which provides images of the type [`DSImage`](../api-reference/interface/dsimage.md) for continuous scanning.

### IMPROVED

* Improved the built-in sound which is played when recognition succeeds. Check out more on [`whenToPlaySoundforSuccessfulRead`](../api-reference/interface/dlr-scansettings.md#whentoplaysoundforsuccessfulread-string) and [`soundOnSuccessfullRead`](../api-reference/interface/dlr-scansettings.md#soundonsuccessfullread-string).

### CHANGED

* Renamed event `onFrameRead` to `onImageRead`.
* Moved the following properties to [`ScanSettings`](../api-reference/interface/dlr-scansettings.md).
  * `whenToPlaySoundforSuccessfulRead`
  * `soundOnSuccessfullRead`
  * `whenToVibrateforSuccessfulRead`
  * `vibrateDuration`

### REMOVED

* Removed property `singeleFrameMode` which should be taken care of by a CameraEnhancer instance.
* Removed method `RecognizeCurrentFrame()`.
* Removed the following UI related APIs, use the bound CameraEnhancer instance to manipulate UI instead.
  * `getUIElement()`
  * `setUIElement()`
  * `defaultUIElementURL`
  * `highlightFillStyle`
  * `highlightStrokeStyle`
  * `highlightLineWidth`
  * `regionMaskFillStyle`
  * `regionMaskStrokeStyle`
  * `regionMaskLineWidth`

## 2.2.2 (03/03/2022)

### ADDED

* Added event `onResourcesLoadProgress` which is triggered multiple times when the resource file for a particular template is beling loaded.
* Added event [`onMRZRead`](../api-reference/recognize.md#onmrzread). This event is used when the SDK is configured with one of the templates `passportMRZ` , `video-passportMRZ` , `visaMRZ` , `video-visaMRZ` , `MRZ` or `video-MRZ` in which case extra processing is applied for better recognition of MRZ strings.

### CHANGED

* Changed event `onUniqueRead` to return only the result of one line.

## 2.2.1 (02/23/2022)

### ADDED

* Added a new template `MRZ` for recognizing Passports, Visas and IDs with Machine-readable zones.
* Added property `isCheckDigitMatched` to the interface `DLRLineResult`.
* Added events `onResourcesLoadStarted` / `onResourcesLoaded` which gets triggered when the resource file for a particular template starts to be loaded / finishes loading.
* Added method `updateReferenceRegionFromBarcodeResults` to make it possible for a DLR instance to use the results of DBR as the reference region.

### IMPROVED

* Renamed the template `visaMRZ_A` to `visaMRZ` and updated it to support both Format-A machine readable visas (MRV-A) and Format-B machine readable visas (MRV-B).
* Improved the method `recognize()` to support `DCEFrame` objects.

## 2.2.0 (12/07/2021)

* Developed with pure web technologies (WebAssembly, JavaScript, HTML and CSS) and work across browsers and platforms with no installation required.
* Based on the algorithm of [Dynamsoft Label Recognizer v2.2.0](../../../release-notes/index.md#22).
* Supports decoding of various formats of source data.
* Integrated with Dynamsoft Camera Enhancer v2.0.3 to support continuous label scanning of frames from a video input.
* Supports various use cases with multiple built-in templates.
* Supports verification of Passport MRZ, Visa MRZ and North American VIN.
