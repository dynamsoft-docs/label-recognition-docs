---
layout: default-layout
title: Dynamsoft Label Recoginizer SDK - Release Notes
description: This is the release notes page of Dynamsoft Label Recoginizer SDK.
keywords: release notes
needAutoGenerateSidebar: false
---

# Release Notes

## [2.0 (08/26/2021)](v2.md#20-08262021)

### Highlights
- Added image processing modes to enhance the usage scenarios like MRZ reading: 
  - Texture area detection
  - Color Conversion
  - Binarization
  - Grayscale image processing
	
- Added dictionary-based correction. The dictionary is minimal and customizable to only cover a scenario-oriented vocabulary.
	
- Improved the overall performance by replacing Caffe engine with OpenCV dnn engine
	
- Improved the readability of recognizing skewed characters.
	
- Improved the MRZ reading performance.
	
- Added a `core` library. Migrated the core structs/classes from the LabelRecognizer library to the `core` library.

### Editions

- [C/C++](../programming/c-cplusplus/release-notes/c-cpp-2.md#20-08262021)
- [DotNet](../programming/dotnet/release-notes/dotnet-2.md#20-08262021)
- [Java](../programming/java/release-notes/java-2.md#20-08262021)
- [Android](../programming/android/release-notes/android-2.md#20-08262021)
- [iOS](../programming/objectivec-swift/release-notes/ios-2.md#20-08262021)


## [1.2.1 (06/08/2021)](v1.md#121-06082021)
## [1.2   (05/18/2021)](v1.md#12-05182021)
## [1.0   (02/24/2021)](v1.md#10-02242021)
## [1.0 Beta   (12/10/2020)](v1.md#10-beta-12102020)