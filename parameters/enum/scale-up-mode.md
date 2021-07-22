---
layout: default-layout
title: Dynamsoft Core Enumerations - ScaleUpMode
description: This article shows the ScaleUpMode enumeration of Dynamsoft Core.
keywords: enumerations, ScaleUpMode
needAutoGenerateSidebar: true
needGenerateH3Content: true
noTitleIndex: true
---


# ScaleUpMode
Describes the scale up mode. 


## Declarations
   
| Language | Declaration |
| -------- | ----------- |
| C / C++ | `enum ScaleUpMode` |
| .Net | `enum Dynamsoft.Core.EnumScaleUpMode` |
| Android | `class com.dynamsoft.core.EnumScaleUpMode` |
| ObjC / Swift | `enum EnumScaleUpMode` |
| Java | `class com.dynamsoft.core.EnumScaleUpMode` |


## Members
   
| Member (except ObjC/Swift) | Member (ObjC/Swift) | Value | Description | Valid Argument(s) |
| -------------------------- | ------------------- | ----- | ----------- | ----------------- |
| SUM_SKIP | EnumScaleUpModeSkip | 0x00 | Skip the scale-up process. | `N/A` |
| SUM_AUTO | EnumScaleUpModeAuto | 0x01 | The library chooses an interpolation method automatically to scale up. | `N/A` |
| SUM_LINEAR_INTERPOLATION | EnumScaleUpModeLinearInterpolation | 0x02 | Scales up using the linear interpolation method. | [`LetterHeightThreshold`]({{ site.parameters-reference }}label-recognition-parameter/scale-up-modes.html#letterheightthreshold)<br>[`TargetLetterHeight`]({{ site.parameters-reference }}label-recognition-parameter/scale-up-modes.html#targetletterheight) |
| SUM_NEAREST_NEIGHBOUR_INTERPOLATION | EnumScaleUpModeNearestNeighbourInterpolation | 0x04 | Scales up using the nearest-neighbour interpolation method. | [`LetterHeightThreshold`]({{ site.parameters-reference }}label-recognition-parameter/scale-up-modes.html#letterheightthreshold)<br>[`TargetLetterHeight`]({{ site.parameters-reference }}label-recognition-parameter/scale-up-modes.html#targetletterheight) |

