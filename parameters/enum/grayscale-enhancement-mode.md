---
layout: default-layout
title: Dynamsoft Core Enumerations - GrayscaleEnhancementMode
description: This article shows the GrayscaleEnhancementMode enumeration of Dynamsoft Core.
keywords: enumerations, GrayscaleEnhancementMode
needAutoGenerateSidebar: true
needGenerateH3Content: true
noTitleIndex: true
---


# GrayscaleEnhancementMode
Describes the grayscale image preprocessing mode.

## Declarations
   
| Language | Declaration |
| -------- | ----------- |
| JavaScript | `enum EnumDLRGrayscaleEnhancementMode` |
| C / C++ | `enum GrayscaleEnhancementMode` |
| .Net | `enum Dynamsoft.Core.EnumGrayscaleEnhancementMode` |
| Android | `class com.dynamsoft.core.EnumGrayscaleEnhancementMode` |
| ObjC / Swift | `enum EnumGrayscaleEnhancementMode` |
| Java | `class com.dynamsoft.core.EnumGrayscaleEnhancementMode` |


## Members
   
| Member (except ObjC/Swift) | Member (ObjC/Swift) | Value | Description | Valid Argument(s) |
| -------------------------- | ------------------- | ----- | ----------- | ----------------- |
| GEM_SKIP | EnumGrayscaleEnhancementModeSkip | 0x00 | Skips image preprocessing. | `N/A` |
| GEM_AUTO | EnumGrayscaleEnhancementModeAuto | 0x01 | **Not supported yet.** | `N/A` |
| GEM_GENERAL | EnumGrayscaleEnhancementModeGeneral | 0x02 | Takes the unpreprocessed image for following operations. | `N/A` |
| GEM_GRAY_EQUALIZE | EnumGrayscaleEnhancementModeGrayEqualize | 0x04 | Preprocesses the image using the gray equalization algorithm. | [`Sensitivity`]({{ site.parameters-reference }}label-recognition-parameter/grayscale-enhancement-modes.html#sensitivity) |
| GEM_GRAY_SMOOTH | EnumGrayscaleEnhancementModeGraySmooth | 0x08 | Preprocesses the image using the gray smoothing algorithm. | [`SmoothBlockSizeX`]({{ site.parameters-reference }}label-recognition-parameter/grayscale-enhancement-modes.html#smoothblocksizex)<br>[`SmoothBlockSizeY`]({{ site.parameters-reference }}label-recognition-parameter/grayscale-enhancement-modes.html#smoothblocksizey) |
| GEM_SHARPEN_SMOOTH | EnumGrayscaleEnhancementModeSharpenSmooth | 0x10 | Preprocesses the image using the sharpening and smoothing algorithm. | [`SmoothBlockSizeX`]({{ site.parameters-reference }}label-recognition-parameter/grayscale-enhancement-modes.html#smoothblocksizex)<br>[`SmoothBlockSizeY`]({{ site.parameters-reference }}label-recognition-parameter/grayscale-enhancement-modes.html#smoothblocksizey)<br>[`SharpenBlockSizeX`]({{ site.parameters-reference }}label-recognition-parameter/grayscale-enhancement-modes.html#sharpenblocksizex)<br>[`SharpenBlockSizeY`]({{ site.parameters-reference }}label-recognition-parameter/grayscale-enhancement-modes.html#sharpenblocksizey) |
