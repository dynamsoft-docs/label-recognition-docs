---
layout: default-layout
title: Dynamsoft Core Enumerations - TextureDetectionMode
description: This article shows the TextureDetectionMode enumeration of Dynamsoft Core.
keywords: enumerations, TextureDetectionMode
needAutoGenerateSidebar: true
needGenerateH3Content: true
noTitleIndex: true
---


# TextureDetectionMode
Describes the texture detection mode.


## Declarations
   
| Language | Declaration |
| -------- | ----------- |
| JavaScript | `enum EnumDLRTextureDetectionMode` |
| C / C++ | `enum TextureDetectionMode` |
| .Net | `enum Dynamsoft.Core.EnumTextureDetectionMode` |
| Android | `class com.dynamsoft.core.EnumTextureDetectionMode` |
| ObjC / Swift | `enum EnumTextureDetectionMode` |
| Java | `class com.dynamsoft.core.EnumTextureDetectionMode` |


## Members
   
| Member (except ObjC/Swift) | Member (ObjC/Swift) | Value | Description | Valid Argument(s) |
| -------------------------- | ------------------- | ----- | ----------- | ----------------- |
| TDM_SKIP  | EnumTextureDetectionModeSkip | 0x00 | Skips texture detection. | `N/A` |
| TDM_AUTO  | EnumTextureDetectionModeAuto | 0x01 | Not supported yet. | `N/A` |
| TDM_GENERAL_WIDTH_CONCENTRATION  | EnumTextureDetectionModeGeneralWidthConcentration | 0x02 | Detects texture using the general algorithm. | [`Sensitivity`]({{ site.parameters-reference }}label-recognition-parameter/texture-detection-modes.html#sensitivity) |

