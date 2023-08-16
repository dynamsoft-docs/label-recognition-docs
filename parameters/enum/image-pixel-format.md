---
layout: default-layout
title: Dynamsoft Core Enumerations - ImagePixelFormat
description: This article shows the ImagePixelFormat enumeration of Dynamsoft Core.
keywords: enumerations, ImagePixelFormat
needAutoGenerateSidebar: true
needGenerateH3Content: true
noTitleIndex: true
---

# ImagePixelFormat
Describes the image pixel format.


## Declarations
   
| Language | Declaration |
| -------- | ----------- |
| JavaScript | `enum EnumDLRImagePixelFormat` |
| C / C++ | `enum ImagePixelFormat` |
| .Net | `enum Dynamsoft.Core.EnumImagePixelFormat` |
| Android | `class com.dynamsoft.core.EnumImagePixelFormat` |
| ObjC / Swift | `enum EnumImagePixelFormat` |
| Java | `class com.dynamsoft.core.EnumImagePixelFormat` |



## Members
   
| Member (except ObjC/Swift) | Member (ObjC/Swift) | Value | Description |
| -------------------------- | ------------------- | ----- | ----------- |
| IPF_BINARY | EnumImagePixelFormatBinary | 0 | 0: Black, 1: White |
| IPF_BINARYINVERTED | EnumImagePixelFormatBinaryInverted | 1 | 0: Black, 1: White |
| IPF_GRAYSCALED | EnumImagePixelFormatGrayScaled | 2 | 8 bit gray |
| IPF_NV21 | EnumImagePixelFormatNV21 | 3 | NV21 |
| IPF_RGB_565 | EnumImagePixelFormatRGB_565 | 4 | 16bit with RGB channel order stored in memory from high to low address |
| IPF_RGB_555 | EnumImagePixelFormatRGB_555 | 5 | 16bit with RGB channel order stored in memory from high to low address |
| IPF_RGB_888 | EnumImagePixelFormatRGB_888 | 6 | 24bit with RGB channel order stored in memory from high to low address |
| IPF_ARGB_8888 | EnumImagePixelFormatARGB_8888 | 7 | 32bit with ARGB channel order stored in memory from high to low address |
| IPF_RGB_161616 | EnumImagePixelFormatRGB_161616 | 8 | 48bit with RGB channel order stored in memory from high to low address |
| IPF_ARGB_16161616 | EnumImagePixelFormatARGB_16161616 | 9 | 64bit with ARGB channel order stored in memory from high to low address |
| IPF_ABGR_8888 | EnumImagePixelFormatABGR_8888 | 10 | 32bit with ABGR channel order stored in memory from high to low address |
| IPF_ABGR_16161616 | EnumImagePixelFormatABGR_8888 | 11 | 64bit with ABGR channel order stored in memory from high to low address |
| IPF_BGR_888 | EnumImagePixelFormatBGR_888 | 12 | 24bit with BGR channel order stored in memory from high to low address |

