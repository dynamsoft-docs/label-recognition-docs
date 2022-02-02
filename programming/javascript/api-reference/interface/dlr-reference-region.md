---
layout: default-layout
title: Dynamsoft Label Recognizer JavaScript Interface - DLRReferenceRegion
description: This page shows the DLRReferenceRegion interface of Dynamsoft Label Recognizer for JavaScript.
keywords: DLRReferenceRegion, javascript, interface
needAutoGenerateSidebar: false
noTitleIndex: true
breadcrumbText: DLRReferenceRegion
---

# DLRReferenceRegion

Stores the reference region information.

## Attributes

| Attribute | Type |
|---------- | ---- |
| [`localizationSourceType`](#localizationsourcetype) | [`DLRLocalizationSourceType`]({{ site.enumerations }}other-enums.html#dlrlocalizationsourcetype) |
| [`points`](#points) | [`Point`](point.md)[4] |
| [`regionMeasuredByPercentage`](#regionmeasuredbypercentage) | *number* |
| [`regionPredetectionModesIndex`](#regionpredetectionmodesindex) | *number* |
| [`barcodeFormatIds`](#barcodeformatids) | *number* |
| [`barcodeFormatIds_2`](#barcodeformatids_2) | *number* |
| [`barcodeTextRegExPattern`](#barcodetextregexpattern) | *string* |

### localizationSourceType

The source type used to localize the reference region(s).

- **Value range**   
    A value of [`DLRLocalizationSourceType`]({{ site.enumerations }}other-enums.html#dlrlocalizationsourcetype) Enumeration items.
      
- **Default value**   
    `DLR_LST_MANUAL_SPECIFICATION`
    
### points

Four vertices in a clockwise direction of a quadrilateral. Index 0 represents the left-most vertex. 

- **Remarks**   
    It works only when [localizationSourceType](#localizationsourcetype) is setting to DLR_LST_MANUAL_SPECIFICATION.<br>
    The library will localize reference region(s) based on the quadrilateral set by current setting.<br>

### regionMeasuredByPercentage

Whether or not to use percentage to measure the coordinate.

- **Value range**   
    [0, 1]
      
- **Default value**   
    1
    
- **Remarks**   
    It works only when [localizationSourceType](#localizationsourcetype) is setting to DLR_LST_MANUAL_SPECIFICATION.<br>
    0: not by percentage<br>
    1: by percentage<br>
    When it's set to 1, the values of points indicate percentage (from 0 to 100); Otherwise, they indicate coordinates in pixel.  

### regionPredetectionModesIndex

The index of a specific region predetection mode in the regionPredetectionModes parameter.

- **Value range**   
    [-1, 0x7fffffff]
      
- **Default value**   
    -1
    
- **Remarks**   
    It works only when [localizationSourceType](#localizationsourcetype) is setting to DLR_LST_PREDETECTED_REGION.<br>
    The library will localize reference region(s) based on the detected regions from the specified region predetection mode.<br>
    -1: all region predetection modes in the regionPredetectionModes parameter

### barcodeFormatIds

The formats of the barcode in BarcodeFormat group 1.

- **Value range**   
    A combined value of [`DLRBarcodeFormat`]({{ site.enumerations }}other-enums.html#dlrbarcodeformat) Enumeration items
      
- **Default value**   
    DLR_BF_ALL
    
- **Remarks**   
    Barcode formats in DLRBarcodeFormat group 1 can be combined.<br>
    It works only when [localizationSourceType](#localizationsourcetype) is setting to DLR_LST_BARCODE.<br>
    The library will localize reference region(s) based on the barcodes whose format meets current setting.  
    
### barcodeFormatIds_2

The formats of the barcode in BarcodeFormat group 2.

- **Value range**   
    A combined value of [`DLRBarcodeFormat_2`]({{ site.enumerations }}other-enums.html#dlrbarcodeformat_2) Enumeration items
      
- **Default value**   
    DLR_BF2_NULL
    
- **Remarks**   
    Barcode formats in DLRBarcodeFormat group 2 can be combined.<br>
    It works only when [localizationSourceType](#localizationsourcetype) is setting to DLR_LST_BARCODE.<br>
    The library will localize reference region(s) based on the barcodes whose format meets current setting.
    
### barcodeTextRegExPattern

The regular express pattern of barcode text.

- **Remarks**   
    It works only when [localizationSourceType](#localizationsourcetype) is setting to DLR_LST_BARCODE.<br>
    The library will localize reference region(s) based on the barcodes whose text meets current setting.