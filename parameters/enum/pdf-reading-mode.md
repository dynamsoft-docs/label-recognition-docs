---
layout: default-layout
title: Dynamsoft Core Enumerations - PDFReadingMode
description: This article shows the PDFReadingMode enumeration of Dynamsoft Core.
keywords: enumerations, PDFReadingMode
needAutoGenerateSidebar: true
needGenerateH3Content: true
noTitleIndex: true
---


# PDFReadingMode
Describes the PDF reading mode. 


## Declarations
   
| Language | Declaration |
| -------- | ----------- |
| C / C++ | `enum PDFReadingMode` |
| .Net | `enum Dynamsoft.Core.EnumPDFReadingMode` |
| Android | `class com.dynamsoft.core.EnumPDFReadingMode` |
| ObjC / Swift | `enum EnumPDFReadingMode` |
| Java | `class com.dynamsoft.core.EnumPDFReadingMode` |



## Members
   
| Member (except ObjC/Swift) | Member (ObjC/Swift) | Value | Description |
| -------------------------- | ------------------- | ----- | ----------- |
| PDFRM_AUTO | EnumPDFReadingModeAuto | 0x01 | Lets the library choose the reading mode automatically. |
| PDFRM_VECTOR | EnumPDFReadingModeVector | 0x02 | Recognize text from vector data in PDF file. |
| PDFRM_RASTER | EnumPDFReadingModeRaster | 0x04 | Converts the PDF file to image(s) first, then perform text recognition. |



