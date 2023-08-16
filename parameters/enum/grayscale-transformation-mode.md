---
layout: default-layout
title: Dynamsoft Core Enumerations - GrayscaleTransformationMode
description: This article shows the GrayscaleTransformationMode enumeration of Dynamsoft Core.
keywords: enumerations, GrayscaleTransformationMode
needAutoGenerateSidebar: true
needGenerateH3Content: true
noTitleIndex: true
---

# GrayscaleTransformationMode
Describes the grayscale transformation mode.


## Declarations
   
| Language | Declaration |
| -------- | ----------- |
| JavaScript | `enum EnumDLRGrayscaleTransformationMode` |
| C / C++ | `enum GrayscaleTransformationMode` |
| .Net | `enum Dynamsoft.Core.EnumGrayscaleTransformationMode` |
| Android | `class com.dynamsoft.core.EnumGrayscaleTransformationMode` |
| ObjC / Swift | `enum EnumGrayscaleTransformationMode` |
| Java | `class com.dynamsoft.core.EnumGrayscaleTransformationMode` |


## Members
   
| Member (except ObjC/Swift) | Member (ObjC/Swift) | Value | Description |
| -------------------------- | ------------------- | ----- | ----------- |
| GTM_SKIP  | EnumGrayscaleTransformationModeSkip | 0x00 | Skips grayscale transformation. |
| GTM_INVERTED  | EnumGrayscaleTransformationModeInverted | 0x01 | Transforms to inverted grayscale. Recommended for light on dark images. |
| GTM_ORIGINAL | EnumGrayscaleTransformationModeOriginal | 0x02 | Keeps the original grayscale. Recommended for dark on light images. |
| GTM_AUTO | EnumGrayscaleTransformationModeAuto | 0x04 | Lets the library choose an algorithm automatically for grayscale transformation. |

