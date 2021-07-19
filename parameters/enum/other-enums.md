---
layout: default-layout
title: Dynamsoft Label Recognizer Enumerations - Other Enumerations
description: This article shows other Enumerations of Dynamsoft Label Recognizer.
keywords: DM_ChargeWay, DM_DeploymentType, DM_LicenseModule, DM_UUIDGenerationMethod, ImagePixelFormat, other enumeration, enumeration
needAutoGenerateSidebar: true
needGenerateH3Content: true
---


# Dynamsoft Label Recognizer Enumeration - Other Enumeration

  | Enumeration | Description |
  |-------------|-------------|
  | [`BarcodeFormat`](#barcodeformat) | Describes the barcode formats in BarcodeFormat group 1. |
  | [`BarcodeFormat_2`](#barcodeformat_2) | Describes the barcode formats in BarcodeFormat group 2. |
  | [`ImagePixelFormat`](#imagepixelformat) | Describes the image pixel format. |
  | [`LocalizationSourceType`](#localizationsourcetype) | Describes the source type used to localize the reference region(s). |
  | [`DM_ChargeWay`](#dm_chargeway) | Describes the charge way. |
  | [`DM_DeploymentType`](#dm_deploymenttype) | Describes the deployment type. |
  | [`DM_LicenseModule`](#dm_licensemodule) | Describes Dynamsoft license modules. |
  | [`DM_UUIDGenerationMethod`](#dm_uuidgenerationmethod) | Describes the UUID generation method. |
  | [`Product`](#product) | Describes Dynamsoft products.   |

---

## BarcodeFormat
Describes the barcode types in BarcodeFormat group 1. All the formats can be combined, such as BF_CODE_39 | BF_CODE_128. Note: The barcode format our library supported is composed of [BarcodeFormat group 1](#barcodeformat) and [BarcodeFormat group 2](#barcodeformat_2), so you need to specify the barcode format in group 1 and group 2 individually.

### Declarations
   
| Language | Declaration |
| -------- | ----------- |
| C / C++ | `enum BarcodeFormat` |
| .Net | `enum Dynamsoft.Core.EnumBarcodeFormat ` |
| Android | `class com.dynamsoft.core.EnumBarcodeFormat` |
| ObjC / Swift | `enum EnumBarcodeFormat` |
| Java | `class com.dynamsoft.core.EnumBarcodeFormat` |


### Members
   
| Member (except ObjC/Swift) | Member (ObjC/Swift) | Value | Description |
| -------------------------- | ------------------- | ----- | ----------- |
| BF_ALL | EnumBarcodeFormatALL | -31457281 | All supported formats in [BarcodeFormat group 1](#barcodeformat). |
| BF_ONED | EnumBarcodeFormatONED  | 0x001007FF | Combined value of BF_CODABAR, BF_CODE_128, BF_CODE_39, BF_CODE_39_Extended, BF_CODE_93, BF_EAN_13, BF_EAN_8, INDUSTRIAL_25, BF_ITF, BF_UPC_A, BF_UPC_E, BF_MSI_CODE. |
| BF_GS1_DATABAR | EnumBarcodeFormatGS1DATABAR | 0x0003F800 | Combined value of BF_GS1_DATABAR_OMNIDIRECTIONAL, BF_GS1_DATABAR_TRUNCATED, BF_GS1_DATABAR_STACKED, BF_GS1_DATABAR_STACKED_OMNIDIRECTIONAL, BF_GS1_DATABAR_EXPANDED, BF_GS1_DATABAR_EXPANDED_STACKED, BF_GS1_DATABAR_LIMITED. | 
| BF_NULL | EnumBarcodeFormatNULL | 0x00 | No barcode format in [BarcodeFormat group 1](#barcodeformat). |
| BF_CODE_39 | EnumBarcodeFormatCODE39 | 0x01 | Code 39 |
| BF_CODE_128 | EnumBarcodeFormatCODE128 | 0x02 | Code 128 |
| BF_CODE_93 | EnumBarcodeFormatCODE93 | 0x04 | Code 93 |
| BF_CODABAR | EnumBarcodeFormatCODABAR | 0x08 | Codabar |
| BF_ITF  | EnumBarcodeFormatITF | 0x10 | ITF |
| BF_EAN_13 | EnumBarcodeFormatEAN13 | 0x20 | EAN-13 |
| BF_EAN_8 | EnumBarcodeFormatEAN8 | 0x40 | EAN-8 |
| BF_UPC_A | EnumBarcodeFormatUPCA | 0x80 | UPC-A |
| BF_UPC_E | EnumBarcodeFormatUPCE | 0x100 | UPC-E |
| BF_INDUSTRIAL_25 | EnumBarcodeFormatINDUSTRIAL | 0x200 | Industrial 2 of 5 |
| BF_MSI_CODE | EnumBarcodeFormatMSICODE | 0x100000 | MSI Code |
| BF_CODE_39_EXTENDED | EnumBarcodeFormatCODE39EXTENDED | 0x400 | Code 39 Extended |
| BF_GS1_DATABAR_OMNIDIRECTIONAL | EnumBarcodeFormatGS1DATABAROMNIDIRECTIONAL | 0x800 | GS1 Databar Omnidirectional |
| BF_GS1_DATABAR_TRUNCATED | EnumBarcodeFormatGS1DATABARTRUNCATED | 0x1000 | GS1 Databar Truncated |
| BF_GS1_DATABAR_STACKED | EnumBarcodeFormatGS1DATABARSTACKED | 0x2000 | GS1 Databar Stacked |
| BF_GS1_DATABAR_STACKED_OMNIDIRECTIONAL | EnumBarcodeFormatGS1DATABARSTACKEDOMNIDIRECTIONAL | 0x4000 | GS1 Databar Stacked Omnidirectional |
| BF_GS1_DATABAR_EXPANDED | EnumBarcodeFormatGS1DATABAREXPANDED | 0x8000 | GS1 Databar Expanded |
| BF_GS1_DATABAR_EXPANDED_STACKED | EnumBarcodeFormatGS1DATABAREXPANDEDSTACKED | 0x10000 | GS1 Databar Expaned Stacked |
| BF_GS1_DATABAR_LIMITED | EnumBarcodeFormatGS1DATABARLIMITED | 0x20000 | GS1 Databar Limited |
| BF_PATCHCODE | EnumBarcodeFormatPATCHCODE | 0x00040000 | Patch code |
| BF_MICRO_PDF417 | EnumBarcodeFormatMICROPDF417 | 0x00080000 | Micro PDF417 |
| BF_PDF417 | EnumBarcodeFormatPDF417 | 0x02000000 | PDF417 |
| BF_QR_CODE | EnumBarcodeFormatQRCODE | 0x04000000 | QRCode |
| BF_DATAMATRIX | EnumBarcodeFormatDATAMATRIX | 0x08000000 | DataMatrix |
| BF_AZTEC | EnumBarcodeFormatAZTEC | 0x10000000 | AZTEC |
| BF_MAXICODE | EnumBarcodeFormatMAXICODE | 0x20000000 | MAXICODE |
| BF_MICRO_QR | EnumBarcodeFormatMICROQR | 0x40000000 | Micro QR Code |
| BF_GS1_COMPOSITE | EnumBarcodeFormatGS1COMPOSITE | -2147483648 | GS1 Composite Code |


&nbsp;


## BarcodeFormat_2
Describes the barcode types in BarcodeFormat group 2. Note: The barcode format our library supported is composed of [BarcodeFormat group 1](#barcodeformat) and [BarcodeFormat group 2](#barcodeformat_2), so you need to specify the barcode format in group 1 and group 2 individually.


### Declarations
   
| Language | Declaration |
| -------- | ----------- |
| C / C++ | `enum BarcodeFormat_2` |
| .Net | `enum Dynamsoft.Core.EnumBarcodeFormat_2` |
| Android | `class com.dynamsoft.core.EnumBarcodeFormat_2` |
| ObjC / Swift | `enum EnumBarcodeFormat_2` |
| Java | `class com.dynamsoft.core.EnumBarcodeFormat_2` |


### Members
   
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

&nbsp;

## ImagePixelFormat
Describes the image pixel format.


### Declarations
   
| Language | Declaration |
| -------- | ----------- |
| C / C++ | `enum ImagePixelFormat` |
| .Net | `enum Dynamsoft.Core.EnumImagePixelFormat` |
| Android | `class com.dynamsoft.core.EnumImagePixelFormat` |
| ObjC / Swift | `enum EnumImagePixelFormat` |
| Java | `class com.dynamsoft.core.EnumImagePixelFormat` |



### Members
   
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


&nbsp;

## LocalizationSourceType
Describes the source type used to localize the reference region(s).

### Declarations
   
| Language | Declaration |
| -------- | ----------- |
| C / C++ | `enum LocalizationSourceType` |
| .Net | `enum Dynamsoft.DLR.EnumLocalizationSourceType` |
| Android | `class com.dynamsoft.dlr.EnumLocalizationSourceType` |
| ObjC / Swift | `enum EnumLocalizationSourceType` |
| Java | `class com.dynamsoft.dlr.EnumLocalizationSourceType` |


### Members
   
| Member (except ObjC/Swift) | Member (ObjC/Swift) | Value | Description |
| -------------------------- | ------------------- | ----- | ----------- |
| LST_MANUAL_SPECIFICATION | EnumLocalizationSourceTypeManualSpecification | 0x01 | Define the reference region using the manually specified location. |
| LST_PREDETECTED_REGION | EnumLocalizationSourceTypePredetectedRegion | 0x02 | Define the reference region using the result(s) of region predetection process. |
| LST_BARCODE | EnumLocalizationSourceTypeBarcode | 0x04 | Define the reference region using the barcode info. |



&nbsp;


## DM_ChargeWay
Describes charge way.


### Declarations
   
| Language | Declaration |
| -------- | ----------- |
| C / C++ | `enum DM_ChargeWay` |
| .Net | `enum Dynamsoft.Core.EnumDMChargeWay` |
| Android | `class com.dynamsoft.core.EnumDMChargeWay` |
| ObjC / Swift | `enum EnumDMChargeWay` |
| Java | `class com.dynamsoft.core.EnumDMChargeWay` |


### Members
   
| Member (except ObjC/Swift) | Member (ObjC/Swift) | Value | Description |
| -------------------------- | ------------------- | ----- | ----------- |
| DM_CW_AUTO | EnumDMChargeWayAuto | 0 | The charge way automatically determined by the license server. |
| DM_CW_DEVICE_COUNT | EnumDMChargeWayDeviceCount | 1 | Charges by the count of devices. |
| DM_CW_SCAN_COUNT | EnumDMChargeWayScanCount | 2 | Charges by the count of barcode scans.|
| DM_CW_CONCURRENT_DEVICE_COUNT | EnumDMChargeWayConcurrentDeviceCount | 3 | Charges by the count of concurrent devices. |
| DM_CW_APP_DOMAIN_COUNT | EnumDMChargeWayAppDomainCount | 6 | Charges by the count of app domains. |
| DM_CW_ACTIVE_DEVICE_COUNT | EnumDMChargeWayActiveDeviceCount | 8 | Charges by the count of active devices. |
| DM_CW_INSTANCE_COUNT | EnumDMChargeWayInstanceCount | 9 | Charges by the count of instances. |
| DM_CW_CONCURRENT_INSTANCE_COUNT | EnumDMChargeWayConcurrentInstanceCount | 10 | Charges by the count of concurrent instances. |




&nbsp;

## DM_DeploymentType
Describes the deployment type.


### Declarations
   
| Language | Declaration |
| -------- | ----------- |
| C / C++ | `enum DM_DeploymentType` |
| .Net | `enum EnumDMDeploymentType` |
| Android | `N/A` |
| ObjC / Swift | `N/A` |
| Java | `N/A` |


### Members
   
| Member | Value | Description |
| -------------------------- | ----- | ----------- |
| DM_DT_SERVER | 1 | Server deployment type |
| DM_DT_DESKTOP | 2 | Desktop |
| DM_DT_EMBEDDED_DEVICE | 6 | Embedded device deployment type |
| DM_DT_OEM | 7 | OEM deployment type |



&nbsp;

## DM_LicenseModule
Describes Dynamsoft license modules.


### Declarations
   
| Language | Declaration |
| -------- | ----------- |
| C / C++ | `enum DM_LicenseModule` |
| .Net | `enum Dynamsoft.Core.EnumDMLicenseModule` |
| Android | `class com.dynamsoft.core.EnumDMLicenseModule` |
| ObjC / Swift | `enum EnumDMLicenseModule` |
| Java | `class com.dynamsoft.core.EnumDMLicenseModule` |


### Members
   
| Member (except ObjC/Swift) | Member (ObjC/Swift) | Value | Description |
| -------------------------- | ------------------- | ----- | ----------- |
| DM_LM_ONED | EnumDMLicenseModuleONED | 1 | One-D barcodes license module |
| DM_LM_QR_CODE | EnumDMLicenseModuleQRCODE | 2 | QR Code barcodes license module |
| DM_LM_PDF417 | EnumDMLicenseModulePDF417 | 3 | PDF417 barcodes license module |
| DM_LM_DATAMATRIX | EnumDMLicenseModuleDATAMATRIX | 4 | DATAMATRIX barcodes license module |
| DM_LM_AZTEC | EnumDMLicenseModuleAZTEC | 5 | Aztec barcodes license module |
| DM_LM_MAXICODE | EnumDMLicenseModuleMAXICODE | 6 | MAXICODE barcodes license module|
| DM_LM_PATCHCODE | EnumDMLicenseModulePatchCode | 7 |Patch code barcodes license module |
| DM_LM_GS1_DATABAR | EnumDMLicenseModuleGS1DATABAR | 8 | GS1 Databar barcodes license module |
| DM_LM_GS1_COMPOSITE | EnumDMLicenseModuleGS1COMPOSITE | 9 | GS1 Composite Code barcodes license module |
| DM_LM_POSTALCODE | EnumDMLicenseModulePOSTALCODE | 10 | Postal code barcodes license module |
| DM_LM_DOTCODE | EnumDMLicenseModuleDOTCODE | 11 | DotCode barcodes license module|
| DM_LM_DDM_LM_INTERMEDIATE_RESULTATAMATRIX | EnumDMLicenseModuleINTERMEDIATERESULT | 12 | Intermediate result license module |
| DM_LM_DPM | EnumDMLicenseModuleDPM | 13 |DATAMATRIX DPM (Direct Part Marking) license module |
| DM_LM_NONSTANDARD_BARCODE | EnumDMLicenseModuleNONSTANDARDBARCODE | 16 | Nonstandard barcodes license module|


&nbsp;

## DM_UUIDGenerationMethod
Describes UUID generation method.


### Declarations
   
| Language | Declaration |
| -------- | ----------- |
| C / C++ | `enum DM_UUIDGenerationMethod` |
| .Net | `enum Dynamsoft.Core.EnumDMUUIDGenerationMethod` |
| Android | `class com.dynamsoft.core.EnumDMUUIDGenerationMethod` |
| ObjC / Swift | `enum EnumDMUUIDGenerationMethod` |
| Java | `class com.dynamsoft.core.EnumDMUUIDGenerationMethod` |


### Members
   
| Member (except ObjC/Swift) | Member (ObjC/Swift) | Value | Description |
| -------------------------- | ------------------- | ----- | ----------- |
| DM_UUIDGM_RANDOM | EnumDMUUIDGenerationMethodRandom | 1 | Generates UUID with random values. |
| DM_UUIDGM_HARDWARE | EnumDMUUIDGenerationMethodHardware | 2 | Generates UUID based on hardware info. |



## Product
Describes Dynamsoft products.


### Declarations
   
| Language | Declaration |
| -------- | ----------- |
| C / C++ | `enum Product` |
| .Net | `enum Dynamsoft.Core.EnumProduct` |
| Android | `class com.dynamsoft.core.EnumProduct` |
| ObjC / Swift | `enum EnumProduct` |
| Java | `class com.dynamsoft.core.EnumProduct` |

### Members
   
| Member (except ObjC/Swift) | Member (ObjC/Swift) | Value | Description |
| -------------------------- | ------------------- | ----- | ----------- |
| PROD_DBR | EnumProductDBR | 0x0001 | Dynamsoft Barcode Reader |
| PROD_DLR | EnumProductDLR | 0x0002 | Dynamsoft Label Recognizer |
| PROD_DWT | EnumProductDWT | 0x0004 | Dynamic Web Twain |
| PROD_DCE | EnumProductDCE | 0x0008 | Dynamsoft Camera Enhancer |
| PROD_DPS | EnumProductDPS | 0x0010 | Dynamsoft Panorama |
| PROD_ALL | EnumProductALL | 0xFFFF | All Dynamsoft products |

&nbsp;



