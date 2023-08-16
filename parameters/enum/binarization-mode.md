---
layout: default-layout
title: Dynamsoft Core Enumerations - BinarizationMode
description: This article shows the BinarizationMode enumeration of Dynamsoft Core.
keywords: enumerations, BinarizationMode
needAutoGenerateSidebar: true
needGenerateH3Content: true
noTitleIndex: true
---


# BinarizationMode
Describes the binarization mode.


## Declarations
   
| Language | Declaration |
| -------- | ----------- |
| JavaScript | `enum EnumDLRBinarizationMode` |
| C / C++ | `enum BinarizationMode` |
| .Net | `enum Dynamsoft.Core.EnumBinarizationMode` |
| Android | `class com.dynamsoft.core.EnumBinarizationMode` |
| ObjC / Swift | `enum EnumBinarizationMode` |
| Java | `class com.dynamsoft.core.EnumBinarizationMode` |


## Members
   
| Member (except ObjC/Swift) | Member (ObjC/Swift) | Value | Description | Valid Argument(s) |
| -------------------------- | ------------------- | ----- | ----------- | ----------------- |
| BM_SKIP | EnumBinarizationModeSkip | 0x00 | Skips the binarization. | `N/A` |
| BM_AUTO | EnumBinarizationModeAuto | 0x01 | **Not supported yet.** | `N/A` |
| BM_LOCAL_BLOCK | EnumBinarizationModeLocalBlock | 0x02 | Binarizes the image based on the local block. | [`BlockSizeX`]({{ site.parameters-reference }}label-recognition-parameter/binarization-modes.html#blocksizex)<br>[`BlockSizeY`]({{ site.parameters-reference }}label-recognition-parameter/binarization-modes.html#blocksizey)<br>[`EnableFillBinaryVacancy`]({{ site.parameters-reference }}label-recognition-parameter/binarization-modes.html#enablefillbinaryvacancy)<br>[`ThreshValueCoefficient`]({{ site.parameters-reference }}label-recognition-parameter/binarization-modes.html#threshvaluecoefficient)<br> |
| BM_THRESHOLD | EnumBinarizationModeThreshold | 0x04 | Binarizes the image based on given threshold. | [`BinarizationThreshold`]({{ site.parameters-reference }}label-recognition-parameter/binarization-modes.html#binarizationThreshold) |

