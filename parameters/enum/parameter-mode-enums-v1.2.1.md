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
| Java | `class EnumDLRBinarizationMode` |


### Members
   
| Member (except ObjC/Swift) | Member (ObjC/Swift) | Value | Description | Valid Argument(s) |
| -------------------------- | ------------------- | ----- | ----------- | ----------------- |
| DLR_BM_SKIP | EnumDLRBinarizationModeSkip | 0x00 | Skips the binarization. | `N/A` |
| DLR_BM_AUTO | EnumDLRBinarizationModeAuto | 0x01 | **Not supported yet.** | `N/A` |
| DLR_BM_LOCAL_BLOCK | EnumDLRBinarizationModeLocalBlock | 0x02 | Binarizes the image based on the local block. | [`BlockSizeX`]({{ site.parameters-reference }}label-recognition-parameter/binarization-modes.html#blocksizex)<br>[`BlockSizeY`]({{ site.parameters-reference }}label-recognition-parameter/binarization-modes.html#blocksizey)<br>[`EnableFillBinaryVacancy`]({{ site.parameters-reference }}label-recognition-parameter/binarization-modes.html#enablefillbinaryvacancy)<br>[`ThreshValueCoefficient`]({{ site.parameters-reference }}label-recognition-parameter/binarization-modes.html#threshvaluecoefficient)<br> |
| DLR_BM_THRESHOLD | EnumDLRBinarizationModeThreshold | 0x04 | Binarizes the image based on given threshold. | [`BinarizationThreshold`]({{ site.parameters-reference }}label-recognition-parameter/binarization-modes.html#binarizationThreshold) |

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
| Java | `class EnumDLRGrayscaleTransformationMode` |


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
| Java | `class EnumDLRRegionPredetectionMode` |


### Members
   
| Member (except ObjC/Swift) | Member (ObjC/Swift) | Value | Description | Valid Argument(s) |
| -------------------------- | ------------------- | ----- | ----------- | ----------------- |
| DLR_RPM_SKIP | EnumDLRRegionPredetectionModeSkip | 0x00 | Skips region detection. | `N/A` |
| DLR_RPM_AUTO | EnumDLRRegionPredetectionModeAuto | 0x01 | Lets the library choose an algorithm automatically to detect region. | `N/A` |
| DLR_RPM_GENERAL | EnumDLRRegionPredetectionModeGeneral | 0x02 | Takes the whole image as a region. | `N/A` |
| DLR_RPM_GENERAL_RGB_CONTRAST | EnumDLRRegionPredetectionModeGeneralRGBContrast | 0x04 | Detects region using the general algorithm based on RGB colour contrast. | [`MinImageDimension`]({{ site.parameters-reference }}label-recognition-parameter/region-predetection-modes.html#minimagedimension)<br>[`Sensitivity`]({{ site.parameters-reference }}label-recognition-parameter/region-predetection-modes.html#sensitivity)<br>[`SpatialIndexBlockSize`]({{ site.parameters-reference }}label-recognition-parameter/region-predetection-modes.html#spatialindexblocksize) |
| DLR_RPM_GENERAL_GRAY_CONTRAST | EnumDLRRegionPredetectionModeGeneralGrayContrast | 0x08 | Detects region using the general algorithm based on gray contrast. | [`MinImageDimension`]({{ site.parameters-reference }}label-recognition-parameter/region-predetection-modes.html#minimagedimension)<br>[`Sensitivity`]({{ site.parameters-reference }}label-recognition-parameter/region-predetection-modes.html#sensitivity)<br>[`SpatialIndexBlockSize`]({{ site.parameters-reference }}label-recognition-parameter/region-predetection-modes.html#spatialindexblocksize) |
| DLR_RPM_GENERAL_HSV_CONTRAST | EnumDLRRegionPredetectionModeGeneralHSVContrast | 0x10 | Detects region using the general algorithm based on HSV colour contrast. | [`AspectRatioRange`]({{ site.parameters-reference }}label-recognition-parameter/region-predetection-modes.html#aspectratiorange)<br>[`FindAccurateBoundary`]({{ site.parameters-reference }}label-recognition-parameter/region-predetection-modes.html#findaccurateboundary)<br>[`ForeAndBackgroundColours`]({{ site.parameters-reference }}label-recognition-parameter/region-predetection-modes.html#foreandbackgroundcolours)<br>[`HeightRange`]({{ site.parameters-reference }}label-recognition-parameter/region-predetection-modes.html#heightrange)<br>[`MinImageDimension`]({{ site.parameters-reference }}label-recognition-parameter/region-predetection-modes.html#minimagedimension)<br>[`Sensitivity`]({{ site.parameters-reference }}label-recognition-parameter/region-predetection-modes.html#sensitivity)<br>[`SpatialIndexBlockSize`]({{ site.parameters-reference }}label-recognition-parameter/region-predetection-modes.html#spatialindexblocksize)<br>[`WidthRange`]({{ site.parameters-reference }}label-recognition-parameter/region-predetection-modes.html#widthrange) |


&nbsp;

## DLRScaleUpMode
Describes the scale up mode. 


### Declarations
   
| Language | Declaration |
| -------- | ----------- |
| C / C++ | `enum DLRScaleUpMode` |
| .Net | `enum Dynamsoft.DLR.EnumDLRScaleUpMode` |
| Android | `class EnumDLRScaleUpMode` |
| ObjC / Swift | `enum EnumDLRScaleUpMode` |
| Java | `class EnumDLRScaleUpMode` |


### Members
   
| Member (except ObjC/Swift) | Member (ObjC/Swift) | Value | Description | Valid Argument(s) |
| -------------------------- | ------------------- | ----- | ----------- | ----------------- |
| DLR_SUM_SKIP | EnumDLRScaleUpModeSkip | 0x00 | Skip the scale-up process. | `N/A` |
| DLR_SUM_AUTO | EnumDLRScaleUpModeAuto | 0x01 | The library chooses an interpolation method automatically to scale up. | `N/A` |
| DLR_SUM_LINEAR_INTERPOLATION | EnumDLRScaleUpModeLinearInterpolation | 0x02 | Scales up using the linear interpolation method. | [`LetterHeightThreshold`]({{ site.parameters-reference }}label-recognition-parameter/scale-up-modes.html#letterheightthreshold)<br>[`TargetLetterHeight`]({{ site.parameters-reference }}label-recognition-parameter/scale-up-modes.html#targetletterheight) |
| DLR_SUM_NEAREST_NEIGHBOUR_INTERPOLATION | EnumDLRScaleUpModeNearestNeighbourInterpolation | 0x04 | Scales up using the nearest-neighbour interpolation method. | [`LetterHeightThreshold`]({{ site.parameters-reference }}label-recognition-parameter/scale-up-modes.html#letterheightthreshold)<br>[`TargetLetterHeight`]({{ site.parameters-reference }}label-recognition-parameter/scale-up-modes.html#targetletterheight) |


&nbsp;



