---
layout: default-layout
title: Dynamsoft Core Enumerations - ColourConversionMode
description: This article shows the ColourConversionMode enumeration of Dynamsoft Core.
keywords: enumerations, ColourConversionMode
needAutoGenerateSidebar: true
needGenerateH3Content: true
noTitleIndex: true
---




# ColourConversionMode
Describes the colour conversion mode.


## Declarations
   
| Language | Declaration |
| -------- | ----------- |
| JavaScript | `enum EnumDLRColourConversionMode` |
| C / C++ | `enum ColourConversionMode` |
| .Net | `enum Dynamsoft.Core.EnumColourConversionMode` |
| Android | `class com.dynamsoft.core.EnumColourConversionMode` |
| ObjC / Swift | `enum EnumColourConversionMode` |
| Java | `class com.dynamsoft.core.EnumColourConversionMode` |


## Members
   
| Member (except ObjC/Swift) | Member (ObjC/Swift) | Value | Description | Valid Argument(s) |
| -------------------------- | ------------------- | ----- | ----------- | ----------------- |
| CICM_SKIP | EnumColourConversionModeSkip | 0x00 | Skip the colour conversion. | `N/A` |
| CICM_GENERAL | EnumColourConversionModeGeneral | 0x01 | Converts a colour image to a grayscale image using the general algorithm. | [`BlueChannelWeight`]({{ site.parameters-reference }}label-recognition-parameter/colour-conversion-modes.html#bluechannelweight)<br>[`GreenChannelWeight`]({{ site.parameters-reference }}label-recognition-parameter/colour-conversion-modes.html#greenchannelweight)<br>[`RedChannelWeight`]({{ site.parameters-reference }}label-recognition-parameter/colour-conversion-modes.html#redchannelweight) |
| CICM_HSV | EnumColourConversionModeHSV | 0x02 | Converts a colour image to a grayscale image using one of the HSV channels. | [`ReferChannel`]({{ site.parameters-reference }}label-recognition-parameter/colour-conversion-modes.html#referchannel) |
