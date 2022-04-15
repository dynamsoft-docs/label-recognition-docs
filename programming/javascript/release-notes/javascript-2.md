---
layout: default-layout
title: Dynamsoft Label Recognizer - JavaScript 2.x Release Notes 
description: This is the Release Notes page for Dynamsoft Label Recognizer JavaScript SDK.
keywords:  label recognizer, release notes, javascript
needAutoGenerateSidebar: true
noTitleIndex: true
breadcrumbText: v2.x Release Notes
---

# Release Notes - JavaScript 2.x

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
  * `lineFillStyle`
  * `lineStrokeStyle`
  * `lineLineWidth`
  * `regionMaskFillStyle`
  * `regionMaskStrokeStyle`
  * `regionMaskLineWidth`

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

<div class="fold-panel-prefix"></div>

### Version Highlights <i class="fa fa-caret-down"></i>

<div class="fold-panel-start"></div>

{%- include release-notes/product-highlight-2.0.md -%}

<div class="fold-panel-end"></div>

### Edition Highlights

* Developed with pure web technologies (WebAssembly, JavaScript, HTML and CSS) and work across browsers and platforms with no installation required.
* Based on the algorithm of Dynamsoft Label Recognizer v2.2.0.
* Supports decoding of various formats of source data.
* Integrated with Dynamsoft Camera Enhancer v2.0.3 to support continuous label scanning of frames from a video input.
* Supports various use cases with multiple built-in templates.
* Supports verification of Passport MRZ, Visa MRZ and North American VIN.
