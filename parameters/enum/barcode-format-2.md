---
layout: default-layout
title: Dynamsoft Core Enumerations - BarcodeFormat_2
description: This article shows the BarcodeFormat_2 enumeration of Dynamsoft Core.
keywords: enumerations, BarcodeFormat_2
needAutoGenerateSidebar: true
needGenerateH3Content: true
noTitleIndex: true
---

# BarcodeFormat_2
Describes the barcode types in BarcodeFormat group 2. 
>Note: The barcode format our library supported is composed of [BarcodeFormat group 1](barcode-format.md) and [BarcodeFormat group 2](#barcodeformat_2), so you need to specify the barcode format in group 1 and group 2 individually.


## Declarations
   
| Language | Declaration |
| -------- | ----------- |
| C / C++ | `enum BarcodeFormat_2` |
| .Net | `enum Dynamsoft.Core.EnumBarcodeFormat_2` |
| Android | `class com.dynamsoft.core.EnumBarcodeFormat_2` |
| ObjC / Swift | `enum EnumBarcodeFormat_2` |
| Java | `class com.dynamsoft.core.EnumBarcodeFormat_2` |


## Members
   
| Member (except ObjC/Swift) | Member (ObjC/Swift) | Value | Description |
| -------------------------- | ------------------- | ----- | ----------- |
| BF2_POSTALCODE | EnumBarcodeFormat2POSTALCODE | 0x01F00000 | Combined value of BF2_USPSINTELLIGENTMAIL, BF2_POSTNET, BF2_PLANET, BF2_AUSTRALIANPOST, BF2_RM4SCC. |
| BF2_NULL | EnumBarcodeFormat2NULL | 0x00 | No barcode format in [BarcodeFormat group 2](#barcodeformat_2). |
| BF2_NONSTANDARD_BARCODE | EnumBarcodeFormat2NONSTANDARDBARCODE | 0x01 | Nonstandard barcode |
| BF2_USPSINTELLIGENTMAIL | EnumBarcodeFormat2USPSINTELLIGENTMAIL | 0x00100000 | USPS Intelligent Mail |
| BF2_POSTNET | EnumBarcodeFormat2POSTNET | 0x00200000 | Postnet |
| BF2_PLANET | EnumBarcodeFormat2PLANET | 0x00400000 | Planet |
| BF2_AUSTRALIANPOST | EnumBarcodeFormat2AUSTRALIANPOST | 0x00800000 | Australian Post |
| BF2_RM4SCC | EnumBarcodeFormat2RM4SCC | 0x01000000 | Royal Mail 4-State Customer Barcode |
| BF2_DOTCODE | EnumBarcodeFormat2DOTCODE | 0x02 | DotCode |
