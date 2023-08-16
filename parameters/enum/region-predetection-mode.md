---
layout: default-layout
title: Dynamsoft Core Enumerations - RegionPredetectionMode
description: This article shows the RegionPredetectionMode enumeration of Dynamsoft Core.
keywords: enumerations, RegionPredetectionMode
needAutoGenerateSidebar: true
needGenerateH3Content: true
noTitleIndex: true
---


# RegionPredetectionMode
Describes the region predetection mode.


## Declarations
   
| Language | Declaration |
| -------- | ----------- |
| JavaScript | `enum EnumDLRRegionPredetectionMode` |
| C / C++ | `enum RegionPredetectionMode` |
| .Net | `enum Dynamsoft.Core.EnumRegionPredetectionMode` |
| Android | `class com.dynamsoft.core.EnumRegionPredetectionMode` |
| ObjC / Swift | `enum EnumRegionPredetectionMode` |
| Java | `class com.dynamsoft.core.EnumRegionPredetectionMode` |


## Members
   
| Member (except ObjC/Swift) | Member (ObjC/Swift) | Value | Description | Valid Argument(s) |
| -------------------------- | ------------------- | ----- | ----------- | ----------------- |
| RPM_SKIP | EnumRegionPredetectionModeSkip | 0x00 | Skips region detection. | `N/A` |
| RPM_AUTO | EnumRegionPredetectionModeAuto | 0x01 | Lets the library choose an algorithm automatically to detect region. | `N/A` |
| RPM_GENERAL | EnumRegionPredetectionModeGeneral | 0x02 | Takes the whole image as a region. | `N/A` |
| RPM_GENERAL_RGB_CONTRAST | EnumRegionPredetectionModeGeneralRGBContrast | 0x04 | Detects region using the general algorithm based on RGB colour contrast. | [`MinImageDimension`]({{ site.parameters-reference }}label-recognition-parameter/region-predetection-modes.html#minimagedimension)<br>[`Sensitivity`]({{ site.parameters-reference }}label-recognition-parameter/region-predetection-modes.html#sensitivity)<br>[`SpatialIndexBlockSize`]({{ site.parameters-reference }}label-recognition-parameter/region-predetection-modes.html#spatialindexblocksize) |
| RPM_GENERAL_GRAY_CONTRAST | EnumRegionPredetectionModeGeneralGrayContrast | 0x08 | Detects region using the general algorithm based on gray contrast. | [`MinImageDimension`]({{ site.parameters-reference }}label-recognition-parameter/region-predetection-modes.html#minimagedimension)<br>[`Sensitivity`]({{ site.parameters-reference }}label-recognition-parameter/region-predetection-modes.html#sensitivity)<br>[`SpatialIndexBlockSize`]({{ site.parameters-reference }}label-recognition-parameter/region-predetection-modes.html#spatialindexblocksize) |
| RPM_GENERAL_HSV_CONTRAST | EnumRegionPredetectionModeGeneralHSVContrast | 0x10 | Detects region using the general algorithm based on HSV colour contrast. | [`AspectRatioRange`]({{ site.parameters-reference }}label-recognition-parameter/region-predetection-modes.html#aspectratiorange)<br>[`FindAccurateBoundary`]({{ site.parameters-reference }}label-recognition-parameter/region-predetection-modes.html#findaccurateboundary)<br>[`ForeAndBackgroundColours`]({{ site.parameters-reference }}label-recognition-parameter/region-predetection-modes.html#foreandbackgroundcolours)<br>[`HeightRange`]({{ site.parameters-reference }}label-recognition-parameter/region-predetection-modes.html#heightrange)<br>[`MinImageDimension`]({{ site.parameters-reference }}label-recognition-parameter/region-predetection-modes.html#minimagedimension)<br>[`Sensitivity`]({{ site.parameters-reference }}label-recognition-parameter/region-predetection-modes.html#sensitivity)<br>[`SpatialIndexBlockSize`]({{ site.parameters-reference }}label-recognition-parameter/region-predetection-modes.html#spatialindexblocksize)<br>[`WidthRange`]({{ site.parameters-reference }}label-recognition-parameter/region-predetection-modes.html#widthrange) |

