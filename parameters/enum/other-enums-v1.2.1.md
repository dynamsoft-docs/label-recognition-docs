---
layout: default-layout
title: Dynamsoft Label Recognition Enumerations - Other Enumerations
description: This article shows other Enumerations of Dynamsoft Label Recognition.
keywords: DM_ChargeWay, DM_DeploymentType, DM_LicenseModule, DM_UUIDGenerationMethod, DLRImagePixelFormat, other enumeration, enumeration
needAutoGenerateSidebar: true
needGenerateH3Content: false
---


# Dynamsoft Label Recognition Enumeration - Other Enumeration

  | Enumeration | Description |
  |-------------|-------------|
  | [`DLRBarcodeFormat`](#dlrbarcodeformat) | Describes the barcode formats in DLRBarcodeFormat group 1. |
  | [`DLRBarcodeFormat_2`](#dlrbarcodeformat_2) | Describes the barcode formats in DLRBarcodeFormat group 2. |
  | [`DLRImagePixelFormat`](#dlrimagepixelformat) | Describes the image pixel format. |
  | [`DLRLocalizationSourceType`](#dlrlocalizationsourcetype) | Describes the source type used to localize the reference region(s). |
  | [`DM_ChargeWay`](#dm_chargeway) | Describes the charge way. |
  | [`DM_DeploymentType`](#dm_deploymenttype) | Describes the deployment type. |
  | [`DM_LicenseModule`](#dm_licensemodule) | Describes Dynamsoft license modules. |
  | [`DM_UUIDGenerationMethod`](#dm_uuidgenerationmethod) | Describes the UUID generation method. |
  | [`Product`](#product) | Describes Dynamsoft products.   |

---

## DLRBarcodeFormat
Describes the barcode types in DLRBarcodeFormat group 1. All the formats can be combined, such as DLR_BF_CODE_39 | DLR_BF_CODE_128. Note: The barcode format our library supported is composed of [DLRBarcodeFormat group 1](#dlrbarcodeformat) and [DLRBarcodeFormat group 2](#dlrbarcodeformat_2), so you need to specify the barcode format in group 1 and group 2 individually.

### Declarations
   
| Language | Declaration |
| -------- | ----------- |
| C / C++ | `enum DLRBarcodeFormat` |
| .Net | `enum Dynamsoft.DLR.EnumDLRBarcodeFormat ` |
| Android | `class EnumDLRBarcodeFormat` |
| ObjC / Swift | `enum EnumBarcodeFormat` |
| Java | `class EnumDLRBarcodeFormat` |


### Members
   
| Member (except ObjC/Swift) | Member (ObjC/Swift) | Value | Description |
| -------------------------- | ------------------- | ----- | ----------- |
| DLR_BF_ALL | EnumBarcodeFormatALL | -31457281 | All supported formats in [DLRBarcodeFormat group 1](#dlrbarcodeformat). |
| DLR_BF_ONED | EnumBarcodeFormatONED  | 0x001007FF | Combined value of DLR_BF_CODABAR, DLR_BF_CODE_128, DLR_BF_CODE_39, DLR_BF_CODE_39_Extended, DLR_BF_CODE_93, DLR_BF_EAN_13, DLR_BF_EAN_8, INDUSTRIAL_25, DLR_BF_ITF, DLR_BF_UPC_A, DLR_BF_UPC_E, DLR_BF_MSI_CODE. |
| DLR_BF_GS1_DATABAR | EnumBarcodeFormatGS1DATABAR | 0x0003F800 | Combined value of DLR_BF_GS1_DATABAR_OMNIDIRECTIONAL, DLR_BF_GS1_DATABAR_TRUNCATED, DLR_BF_GS1_DATABAR_STACKED, DLR_BF_GS1_DATABAR_STACKED_OMNIDIRECTIONAL, DLR_BF_GS1_DATABAR_EXPANDED, DLR_BF_GS1_DATABAR_EXPANDED_STACKED, DLR_BF_GS1_DATABAR_LIMITED. | 
| DLR_BF_NULL | EnumBarcodeFormatNULL | 0x00 | No barcode format in [DLRBarcodeFormat group 1](#dlrbarcodeformat). |
| DLR_BF_CODE_39 | EnumBarcodeFormatCODE39 | 0x01 | Code 39 |
| DLR_BF_CODE_128 | EnumBarcodeFormatCODE128 | 0x02 | Code 128 |
| DLR_BF_CODE_93 | EnumBarcodeFormatCODE93 | 0x04 | Code 93 |
| DLR_BF_CODABAR | EnumBarcodeFormatCODABAR | 0x08 | Codabar |
| DLR_BF_ITF  | EnumBarcodeFormatITF | 0x10 | ITF |
| DLR_BF_EAN_13 | EnumBarcodeFormatEAN13 | 0x20 | EAN-13 |
| DLR_BF_EAN_8 | EnumBarcodeFormatEAN8 | 0x40 | EAN-8 |
| DLR_BF_UPC_A | EnumBarcodeFormatUPCA | 0x80 | UPC-A |
| DLR_BF_UPC_E | EnumBarcodeFormatUPCE | 0x100 | UPC-E |
| DLR_BF_INDUSTRIAL_25 | EnumBarcodeFormatINDUSTRIAL | 0x200 | Industrial 2 of 5 |
| DLR_BF_MSI_CODE | EnumBarcodeFormatMSICODE | 0x100000 | MSI Code |
| DLR_BF_CODE_39_EXTENDED | EnumBarcodeFormatCODE39EXTENDED | 0x400 | Code 39 Extended |
| DLR_BF_GS1_DATABAR_OMNIDIRECTIONAL | EnumBarcodeFormatGS1DATABAROMNIDIRECTIONAL | 0x800 | GS1 Databar Omnidirectional |
| DLR_BF_GS1_DATABAR_TRUNCATED | EnumBarcodeFormatGS1DATABARTRUNCATED | 0x1000 | GS1 Databar Truncated |
| DLR_BF_GS1_DATABAR_STACKED | EnumBarcodeFormatGS1DATABARSTACKED | 0x2000 | GS1 Databar Stacked |
| DLR_BF_GS1_DATABAR_STACKED_OMNIDIRECTIONAL | EnumBarcodeFormatGS1DATABARSTACKEDOMNIDIRECTIONAL | 0x4000 | GS1 Databar Stacked Omnidirectional |
| DLR_BF_GS1_DATABAR_EXPANDED | EnumBarcodeFormatGS1DATABAREXPANDED | 0x8000 | GS1 Databar Expanded |
| DLR_BF_GS1_DATABAR_EXPANDED_STACKED | EnumBarcodeFormatGS1DATABAREXPANDEDSTACKED | 0x10000 | GS1 Databar Expaned Stacked |
| DLR_BF_GS1_DATABAR_LIMITED | EnumBarcodeFormatGS1DATABARLIMITED | 0x20000 | GS1 Databar Limited |
| DLR_BF_PATCHCODE | EnumBarcodeFormatPATCHCODE | 0x00040000 | Patch code |
| DLR_BF_MICRO_PDF417 | EnumBarcodeFormatMICROPDF417 | 0x00080000 | Micro PDF417 |
| DLR_BF_PDF417 | EnumBarcodeFormatPDF417 | 0x02000000 | PDF417 |
| DLR_BF_QR_CODE | EnumBarcodeFormatQRCODE | 0x04000000 | QRCode |
| DLR_BF_DATAMATRIX | EnumBarcodeFormatDATAMATRIX | 0x08000000 | DataMatrix |
| DLR_BF_AZTEC | EnumBarcodeFormatAZTEC | 0x10000000 | AZTEC |
| DLR_BF_MAXICODE | EnumBarcodeFormatMAXICODE | 0x20000000 | MAXICODE |
| DLR_BF_MICRO_QR | EnumBarcodeFormatMICROQR | 0x40000000 | Micro QR Code |
| DLR_BF_GS1_COMPOSITE | EnumBarcodeFormatGS1COMPOSITE | -2147483648 | GS1 Composite Code |


&nbsp;


## DLRBarcodeFormat_2
Describes the barcode types in DLRBarcodeFormat group 2. Note: The barcode format our library supported is composed of [DLRBarcodeFormat group 1](#dlrbarcodeformat) and [DLRBarcodeFormat group 2](#dlrbarcodeformat_2), so you need to specify the barcode format in group 1 and group 2 individually.


### Declarations
   
| Language | Declaration |
| -------- | ----------- |
| C / C++ | `enum DLRBarcodeFormat_2` |
| .Net | `enum Dynamsoft.DLR.EnumDLRBarcodeFormat_2` |
| Android | `class EnumDLRBarcodeFormat_2` |
| ObjC / Swift | `enum EnumBarcodeFormat_2` |
| Java | `class EnumDLRBarcodeFormat_2` |


### Members
   
| Member (except ObjC/Swift) | Member (ObjC/Swift) | Value | Description |
| -------------------------- | ------------------- | ----- | ----------- |
| DLR_BF2_POSTALCODE | EnumBarcodeFormat2POSTALCODE | 0x01F00000 | Combined value of DLR_BF2_USPSINTELLIGENTMAIL, DLR_BF2_POSTNET, DLR_BF2_PLANET, DLR_BF2_AUSTRALIANPOST, DLR_BF2_RM4SCC. |
| DLR_BF2_NULL | EnumBarcodeFormat2NULL | 0x00 | No barcode format in [DLRBarcodeFormat group 2](#dlrbarcodeformat_2). |
| DLR_BF2_NONSTANDARD_BARCODE | EnumBarcodeFormat2NONSTANDARDBARCODE | 0x01 | Nonstandard barcode |
| DLR_BF2_USPSINTELLIGENTMAIL | EnumBarcodeFormat2USPSINTELLIGENTMAIL | 0x00100000 | USPS Intelligent Mail |
| DLR_BF2_POSTNET | EnumBarcodeFormat2POSTNET | 0x00200000 | Postnet |
| DLR_BF2_PLANET | EnumBarcodeFormat2PLANET | 0x00400000 | Planet |
| DLR_BF2_AUSTRALIANPOST | EnumBarcodeFormat2AUSTRALIANPOST | 0x00800000 | Australian Post |
| DLR_BF2_RM4SCC | EnumBarcodeFormat2RM4SCC | 0x01000000 | Royal Mail 4-State Customer Barcode |
| DLR_BF2_DOTCODE | EnumBarcodeFormat2DOTCODE | 0x02 | DotCode |

&nbsp;

## DLRImagePixelFormat
Describes the image pixel format.


### Declarations
   
| Language | Declaration |
| -------- | ----------- |
| C / C++ | `enum DLRImagePixelFormat` |
| .Net | `enum Dynamsoft.DLR.EnumDLRImagePixelFormat` |
| Android | `class EnumDLRImagePixelFormat` |
| ObjC / Swift | `enum EnumDLRImagePixelFormat` |
| Java | `class EnumDLRImagePixelFormat` |



### Members
   
| Member (except ObjC/Swift) | Member (ObjC/Swift) | Value | Description |
| -------------------------- | ------------------- | ----- | ----------- |
| DLR_IPF_BINARY | EnumDLRImagePixelFormatBinary | 0 | 0: Black, 1: White |
| DLR_IPF_BINARYINVERTED | EnumDLRImagePixelFormatBinaryInverted | 1 | 0: Black, 1: White |
| DLR_IPF_GRAYSCALED | EnumDLRImagePixelFormatGrayScaled | 2 | 8 bit gray |
| DLR_IPF_NV21 | EnumDLRImagePixelFormatNV21 | 3 | NV21 |
| DLR_IPF_RGB_565 | EnumDLRImagePixelFormatRGB_565 | 4 | 16bit with RGB channel order stored in memory from high to low address |
| DLR_IPF_RGB_555 | EnumDLRImagePixelFormatRGB_555 | 5 | 16bit with RGB channel order stored in memory from high to low address |
| DLR_IPF_RGB_888 | EnumDLRImagePixelFormatRGB_888 | 6 | 24bit with RGB channel order stored in memory from high to low address |
| DLR_IPF_ARGB_8888 | EnumDLRImagePixelFormatARGB_8888 | 7 | 32bit with ARGB channel order stored in memory from high to low address |
| DLR_IPF_RGB_161616 | EnumDLRImagePixelFormatRGB_161616 | 8 | 48bit with RGB channel order stored in memory from high to low address |
| DLR_IPF_ARGB_16161616 | EnumDLRImagePixelFormatARGB_16161616 | 9 | 64bit with ARGB channel order stored in memory from high to low address |
| DLR_IPF_ABGR_8888 | EnumDLRImagePixelFormatABGR_8888 | 10 | 32bit with ABGR channel order stored in memory from high to low address |
| DLR_IPF_ABGR_16161616 | EnumDLRImagePixelFormatABGR_8888 | 11 | 64bit with ABGR channel order stored in memory from high to low address |
| DLR_IPF_BGR_888 | EnumDLRImagePixelFormatBGR_888 | 12 | 24bit with BGR channel order stored in memory from high to low address |


&nbsp;

## DLRLocalizationSourceType
Describes the source type used to localize the reference region(s).

### Declarations
   
| Language | Declaration |
| -------- | ----------- |
| C / C++ | `enum DLRLocalizationSourceType` |
| .Net | `enum EnumDLRLocalizationSourceType` |
| Android | `class EnumDLRLocalizationSourceType` |
| ObjC / Swift | `enum EnumDLRLocalizationSourceType` |
| Java | `class EnumDLRLocalizationSourceType` |


### Members
   
| Member (except ObjC/Swift) | Member (ObjC/Swift) | Value | Description |
| -------------------------- | ------------------- | ----- | ----------- |
| DLR_LST_MANUAL_SPECIFICATION | EnumDLRLocalizationSourceTypeManualSpecification | 0x01 | Define the reference region using the manually specified location. |
| DLR_LST_PREDETECTED_REGION | EnumDLRLocalizationSourceTypePredetectedRegion | 0x02 | Define the reference region using the result(s) of region predetection process. |
| DLR_LST_BARCODE | EnumDLRLocalizationSourceTypeBarcode | 0x04 | Define the reference region using the barcode info. |



&nbsp;


## DM_ChargeWay
Describes charge way.


### Declarations
   
| Language | Declaration |
| -------- | ----------- |
| C / C++ | `enum DM_ChargeWay` |
| .Net | `enum Dynamsoft.DLR.EnumDMChargeWay` |
| Android | `class EnumDMChargeWay` |
| ObjC / Swift | `enum EnumDMChargeWay` |
| Java | `class EnumDMChargeWay` |


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
| .Net | `enum Dynamsoft.DLR.EnumDMLicenseModule` |
| Android | `class EnumDMLicenseModule` |
| ObjC / Swift | `enum EnumDMLicenseModule` |
| Java | `class EnumDMLicenseModule` |


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
| .Net | `enum Dynamsoft.DLR.EnumDMUUIDGenerationMethod` |
| Android | `class EnumDMUUIDGenerationMethod` |
| ObjC / Swift | `enum EnumDMUUIDGenerationMethod` |
| Java | `class EnumDMUUIDGenerationMethod` |


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
| .Net | `enum Dynamsoft.EnumProduct` |
| Android | `class EnumProduct` |
| ObjC / Swift | `enum EnumProduct` |
| Java | `class EnumProduct` |

### Members
   
| Member (except ObjC/Swift) | Member (ObjC/Swift) | Value | Description |
| -------------------------- | ------------------- | ----- | ----------- |
| PROD_DBR | EnumProductDBR | 0x0001 | Dynamsoft Barcode Reader |
| PROD_DLR | EnumProductDLR | 0x0002 | Dynamsoft Label Recognition |
| PROD_DWT | EnumProductDWT | 0x0004 | Dynamic Web Twain |
| PROD_DCE | EnumProductDCE | 0x0008 | Dynamsoft Camera Enhancer |
| PROD_DPS | EnumProductDPS | 0x0010 | Dynamsoft Panorama |
| PROD_ALL | EnumProductALL | 0xFFFF | All Dynamsoft products |

&nbsp;



