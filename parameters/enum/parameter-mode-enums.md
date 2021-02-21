---
layout: default-layout
title: Dynamsoft Label Recognition Enumerations - Parameter Mode Enumerations
description: This article shows Parameter Mode Enumerations of Dynamsoft Label Recognition.
keywords: DLRBinarizationMode, DLRGrayscaleTransformationMode, DLRRegionPredetectionMode, parameter mode enumeration, enumeration
needAutoGenerateSidebar: true
needGenerateH3Content: false
---

# Dynamsoft Label Recognition Enumeration - Parameter Mode Enumeration

  | Enumeration | Description |
  |-------------|-------------|
  | [`DLRBinarizationMode`](#dlrbinarizationmode) | Describes the binarization mode. |
  | [`DLRGrayscaleTransformationMode`](#dlrgrayscaletransformationmode) | Describes the grayscale transformation mode. |
  | [`DLRRegionPredetectionMode`](#dlrregionpredetectionmode) | Describes the region predetection mode. |

  
---


## DLRBinarizationMode
Describes the binarization mode.


### Declarations
   
| Language | Declaration |
| -------- | ----------- |
| C / C++ | `enum DLRBinarizationMode` |
| .Net | `enum Dynamsoft.DLR.EnumDLRBinarizationMode` |
| Android | `class EnumDLRBinarizationMode` |
| ObjC / Swift | `enum EnumDLRBinarizationMode` |


### Members
   
| Member (except ObjC/Swift) | Member (ObjC/Swift) | Value | Description |
| -------------------------- | ------------------- | ----- | ----------- |
| DLR_BM_SKIP | EnumDLRBinarizationModeSkip | 0x00 | Skips the binarization. |
| DLR_BM_AUTO | EnumDLRBinarizationModeAuto | 0x01 | **Not supported yet.** |
| DLR_BM_LOCAL_BLOCK | EnumDLRBinarizationModeLocalBlock | 0x02 | Binarizes the image based on the local block. |
| DLR_BM_THRESHOLD | EnumDLRBinarizationModeThreshold | 0x04 | Binarizes the image based on given threshold. |

### Remarks
Check arguments of [`DLRBinarizationModes`]({{ site.parameters-reference }}label-recognition-parameter/binarization-modes.html#mode-arguments) for available argument settings.

&nbsp;



## DLRGrayscaleTransformationMode
Describes the grayscale transformation mode.


### Declarations
   
| Language | Declaration |
| -------- | ----------- |
| C / C++ | `enum DLRGrayscaleTransformationMode` |
| .Net | `enum Dynamsoft.DLR.EnumDLRGrayscaleTransformationMode` |
| Android | `class EnumDLRGrayscaleTransformationMode` |
| ObjC / Swift | `enum EnumDLRGrayscaleTransformationMode` |


### Members
   
| Member (except ObjC/Swift) | Member (ObjC/Swift) | Value | Description |
| -------------------------- | ------------------- | ----- | ----------- |
| DLR_GTM_SKIP  | EnumDLRGrayscaleTransformationModeSkip | 0x00 | Skips grayscale transformation. |
| DLR_GTM_INVERTED  | EnumDLRGrayscaleTransformationModeInverted | 0x01 | Transforms to inverted grayscale. Recommended for light on dark images. |
| DLR_GTM_ORIGINAL | EnumDLRGrayscaleTransformationModeOriginal | 0x02 | Keeps the original grayscale. Recommended for dark on light images. |
| DLR_GTM_AUTO | EnumDLRGrayscaleTransformationModeAuto | 0x04 | Lets the library choose an algorithm automatically for grayscale transformation. |



&nbsp;



## DLRRegionPredetectionMode
Describes the region predetection mode.


### Declarations
   
| Language | Declaration |
| -------- | ----------- |
| C / C++ | `enum DLRRegionPredetectionMode` |
| .Net | `enum Dynamsoft.DLR.EnumDLRRegionPredetectionMode` |
| Android | `class EnumDLRRegionPredetectionMode` |
| ObjC / Swift | `enum EnumDLRRegionPredetectionMode` |


### Members
   
| Member (except ObjC/Swift) | Member (ObjC/Swift) | Value | Description |
| -------------------------- | ------------------- | ----- | ----------- |
| DLR_RPM_SKIP | EnumDLRRegionPredetectionModeSkip | 0x00 | Skips region detection. |
| DLR_RPM_AUTO | EnumDLRRegionPredetectionModeAuto | 0x01 | Lets the library choose an algorithm automatically to detect region. |
| DLR_RPM_GENERAL | EnumDLRRegionPredetectionModeGeneral | 0x02 | Takes the whole image as a region. |
| DLR_RPM_GENERAL_RGB_CONTRAST | EnumDLRRegionPredetectionModeGeneralRGBContrast | 0x04 | Detects region using the general algorithm based on RGB colour contrast. |
| DLR_RPM_GENERAL_GRAY_CONTRAST | EnumDLRRegionPredetectionModeGeneralGrayContrast | 0x08 | Detects region using the general algorithm based on gray contrast. |
| DLR_RPM_GENERAL_HSV_CONTRAST | EnumDLRRegionPredetectionModeGeneralHSVContrast | 0x10 | Detects region using the general algorithm based on HSV colour contrast. |

### Remarks
Check arguments of [`DLRRegionPredetectionModes`]({{ site.parameters-reference }}label-recognition-parameter/region-predetection-modes.html#mode-arguments) for available argument settings.

&nbsp;



