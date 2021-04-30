---
layout: default-layout
title: Dynamsoft Label Recognition C/C++ SDK - Release Notes 1.x
description: This is the release notes page of Dynamsoft Label Recognition for C/C++ SDK version 1.x.
keywords: release notes, c, c++
needAutoGenerateSidebar: false
needGenerateH3Content: false
noTitleIndex: true
---

# Release Notes for C/C++ - 1.x

## 1.2 (05/11/2021)

### New

- Added a new parameter `LabelRecognitionParameter.Timeout`({{site.label-recognition-parameter-control}}parameter-control.html#timeout). Should the recognition time pass the value of this parameter, a new error code `DLRERR_RECOGNITION_TIMEOUT`() will be returned.

- Added a new parameter `LabelRecognitionParameter.Pages`() that specifies a page or a subset of pages of a single file to run the recognition process on.

- Added the following error codes: `DLRERR_TIFF_READ_FAILED`() , `DLRERR_PDF_READ_FAILED`() and `DLRERR_PDF_DLL_MISSING`(). These error codes will be returned when the recognizer fails to read a TIFF file, a PDF file, or if the PDF DLL is missing, respectively.

- Added a new property `pageNumber`() to `DLRResult`() to identify the page on which the result is located.

- Added parameters `TextStringLengthRange` and `LineStringLengthRange` that can be used t to define the minimum and maximum string length when running the recognition process on a text area or a specific line, respectively. They are available as:
  - `LabelRecognitionParameter.TextStringLengthRange`()
  - `LabelRecognitionParameter.LineStringLengthRange`()
  - `TextArea.TextStringLengthRange`()
  - `TextArea.LineStringLengthRange`()
  - `LineSpecification.LineStringLengthRange`()

- Added parameters `LineSpecification.FirstPoint`(), `LineSpecification.SecondPoint`(), `LineSpecification.ThirdPoint`(), and `LineSpecification.FourthPoint`() to specify the coordinates of a line.

- Add a new API `AppendSettingsFromFile`(Link to API) to allow appending settings directly from a JSON file.

### Improved

- Improved recognition performance.

- Improved the Regular expression parameter by supporting more RegEx pattern syntaxes. (There will be a link to RegEx)

- Improved the SDK’s performance when dealing with skewed and italics characters.

## 1.0 (02/24/2021)

- Supports text recognition from BMP, JPEG, PNG and single-page TIFF files.
- Supports zonal OCR and provides three ways to localize text areas:
  - Pre-define an area manually in pixel or percentage.
  - Specify an area relative to the barcode zone, which allows you to recognize accompanying texts near the barcode.
  - Specify an area relative to blocks which share the same colour or uses the same font colour. A common example would be a price tag, where the text of interest is always on a yellow square background, the yellow square can serve as the reference region.
- Supports specifying a regular expression to improve recognition accuracy and robustness.

## 1.0 Beta (12/10/2020)

- Supports recognition of `A-Z`, `a-z`, `0-9`, `.`, `-`, `_`, `(blank space)`, `/` and `:` characters.
