---
layout: default-layout
title: Dynamsoft Label Recognition Android SDK - Release Notes 1.x
description: This is the release notes page of Dynamsoft Label Recognition for Android SDK version 1.x.
keywords: release notes, android
needAutoGenerateSidebar: false
---

# Release Notes for Android - 1.x

## 1.2 (05/11/2021)

### New

- Added a new parameter `LabelRecognitionParameter.Timeout`({{site.label-recognition-parameter-control}}parameter-control-v1.1.html#timeout). Should the recognition time pass the value of this parameter, a new error code `DLRERR_RECOGNITION_TIMEOUT`({{site.enumerations}}error-code-v1.1.html) will be returned.

- Added a new parameter `LabelRecognitionParameter.Pages`({{site.label-recognition-parameter-control}}parameter-control-v1.1.html#page) that specifies a page or a subset of pages of a single file to run the recognition process on.

- Added a new parameter `LabelRecognitionParameter.ScaleUpModes`({{site.label-recognition-parameter-control}}scale-up-modes-v1.1.html#page) and enum `DLRScaleUpMode`({{ site.enumerations }}parameter-mode-enums-v1.1.html#dlrscaleupmode) to control the scale-up process for text lines with a small letter height.

- Added the following error codes: `DLRERR_TIFF_READ_FAILED`({{site.enumerations}}error-code-v1.1.html) , `DLRERR_PDF_READ_FAILED`({{site.enumerations}}error-code-v1.1.html) and `DLRERR_PDF_DLL_MISSING`({{site.enumerations}}error-code-v1.1.html). These error codes will be returned when the recognizer fails to read a TIFF file, a PDF file, or if the PDF DLL is missing, respectively.

- Added a new property `pageNumber`({{site.android-structs}}dlr-result-v1.1.html#pagenumber) to `DLRResult` to identify the page on which the result is located.

- Added parameters `TextStringLengthRange` and `LineStringLengthRange` that can be used t to define the minimum and maximum string length when running the recognition process on a text area or a specific line, respectively. They are available as:
  - `LabelRecognitionParameter.TextStringLengthRange`({{site.label-recognition-parameter-control}}parameter-control-v1.1.html#textstringlengthrange)
  - `LabelRecognitionParameter.LineStringLengthRange`({{site.label-recognition-parameter-control}}parameter-control-v1.1.html#linestringlengthrange)
  - `TextArea.TextStringLengthRange`({{site.parameter-text-area}}parameter-control-v1.1.html#textstringlengthrange)
  - `TextArea.LineStringLengthRange`({{site.parameter-text-area}}parameter-control-v1.1.html#linestringlengthrange)
  - `LineSpecification.LineStringLengthRange`({{site.parameter-line-specification}}parameter-control-v1.1.html#linestringlengthrange)

- Added parameters `LineSpecification.FirstPoint`({{site.parameter-line-specification}}parameter-control-v1.1.html#firstpoint), `LineSpecification.SecondPoint`({{site.parameter-line-specification}}parameter-control-v1.1.html#secondpoint), `LineSpecification.ThirdPoint`({{site.parameter-line-specification}}parameter-control-v1.1.html#thirdpoint), and `LineSpecification.FourthPoint`({{site.parameter-line-specification}}parameter-control-v1.1.html#fourthpoint) to specify the coordinates of a line.

- Add a new API `appendSettingsFromFile`({{site.android-api-methods}}settings-v1.1.html#appendsettingsfromfile) to allow appending settings directly from a JSON file.

### Improved

- Improved recognition performance.

- Improved the Regular expression parameter by supporting more [RegEx pattern syntaxes](http://www.cplusplus.com/reference/regex/ECMAScript/).

- Improved the SDK’s performance when dealing with skewed and italics characters.

## 1.0 (02/24/2021)

- Supports recognition of `A-Z`, `a-z`, `0-9`, `.`, `-`, `_`, `(blank space)`, `/` and `:` characters. 
- Supports text recognition from BMP, JPEG, PNG and single-page TIFF files.
- Supports zonal OCR and provides three ways to localize text areas:
    - Pre-define an area manually in pixel or percentage.
    - Specify an area relative to the barcode zone, which allows you to recognize accompanying texts near the barcode. 
    - Specify an area relative to blocks which share the same colour or uses the same font colour. A common example would be a price tag, where the text of interest is always on a yellow square background, the yellow square can serve as the reference region.
- Supports specifying a regular expression to improve recognition accuracy and robustness.
