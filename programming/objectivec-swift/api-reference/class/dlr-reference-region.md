---
layout: default-layout
title: Dynamsoft Label Recognition Objective-C & Swift Class - iDLRReferenceRegion
description: This page shows the iDLRReferenceRegion class of Dynamsoft Label Recognition for iOS SDK.
keywords: iDLRReferenceRegion, class, objective-c, oc, swift
needAutoGenerateSidebar: true
---


# iDLRReferenceRegion
Stores the reference region information.  
  

## Attributes
  
| Attribute | Type |
|---------- | ---- |
| [`localizationSourceType`](#localizationsourcetype) | [`EnumDLRLocalizationSourceType`]({{ site.enumerations }}other-enums.html#dlrlocalizationsourcetype) |
| [`points`](#points) | *NSArray\** |
| [`regionMeasuredByPercentage`](#regionmeasuredbypercentage) | *NSInteger* |
| [`regionPredetectionModesIndex`](#regionpredetectionmodesindex) | *NSInteger* |
| [`barcodeFormatIds`](#barcodeformatids) | *NSInteger* |
| [`barcodeFormatIds_2`](#barcodeformatids_2) | *NSInteger* |
| [`barcodeTextRegExPattern`](#barcodetextregexpattern) | *NSString\** |

### localizationSourceType
The source type used to localize the reference region(s).
```objc
NSInteger localizationSourceType
```
- **Value range**   
    A value of [`EnumDLRLocalizationSourceType`]({{ site.enumerations }}other-enums.html#dlrlocalizationsourcetype) Enumeration items.
      
- **Default value**   
    `EnumDLRLocalizationSourceTypeManualSpecification`
    
- **Remarks**  
    

### points
Four vertexes in a clockwise direction of a quadrilateral. Index 0 represents the left-most vertex. 
```objc
NSArray* points
```
- **Remarks**   
    It works only when [localizationSourceType](#localizationsourcetype) is setting to EnumDLRLocalizationSourceTypeManualSpecification.<br>
    The library will localize reference region(s) based on the quadrilateral set by current setting.<br>

### regionMeasuredByPercentage
Whether or not to use percentage to measure the coordinate.
```objc
NSInteger regionMeasuredByPercentage
```
- **Value range**   
    [0, 1]
      
- **Default value**   
    1
    
- **Remarks**   
    When it's set to 1, the values of points indicate percentage (from 0 to 100); Otherwise, they indicate coordinates in pixel.<br> 
    0: not by percentage<br>
    1: by percentage<br>
    It works only when [localizationSourceType](#localizationsourcetype) is setting to EnumDLRLocalizationSourceTypeManualSpecification.<br>


### regionPredetectionModesIndex
The index of a specific region predetection mode in the regionPredetectionModes parameter.
```objc
NSInteger regionPredetectionModesIndex
```
- **Value range**   
    [-1, 0x7fffffff]
      
- **Default value**   
    -1
    
- **Remarks**   
    It works only when [localizationSourceType](#localizationsourcetype) is setting to EnumDLRLocalizationSourceTypePredetectedRegion.<br>
    The library will localize reference region(s) based on the detected regions from the specified region predetection mode.<br>
    -1: all region predetection modes in the regionPredetectionModes parameter
    

### barcodeFormatIds
The formats of the barcode in BarcodeFormat group 1.
```objc
NSInteger barcodeFormatIds
```
- **Value range**   
    A combined value of [`EnumBarcodeFormat`]({{ site.enumerations }}other-enums.html#dlrbarcodeformat) Enumeration items
      
- **Default value**   
    EnumBarcodeFormatALL
    
- **Remarks**   
    Barcode formats in DLRBarcodeFormat group 1 can be combined.<br>
    It works only when [localizationSourceType](#localizationsourcetype) is setting to EnumDLRLocalizationSourceTypeBarcode.<br>
    The library will localize reference region(s) based on the barcodes whose format meets current setting.  
    

### barcodeFormatIds_2
The formats of the barcode in BarcodeFormat group 2.
```objc
NSInteger barcodeFormatIds_2
```
- **Value range**   
    A combined value of [`EnumBarcodeFormat_2`]({{ site.enumerations }}other-enums.html#dlrbarcodeformat_2) Enumeration items
      
- **Default value**   
    EnumBarcodeFormat2NULL
    
- **Remarks**   
    Barcode formats in DLRBarcodeFormat group 2 can be combined.<br>
    It works only when [localizationSourceType](#localizationsourcetype) is setting to EnumDLRLocalizationSourceTypeBarcode.<br>
    The library will localize reference region(s) based on the barcodes whose format meets current setting.
    
### barcodeTextRegExPattern
The regular express pattern of barcode text.
```objc
NSString* barcodeTextRegExPattern
```

- **Remarks**   
    It works only when [localizationSourceType](#localizationsourcetype) is setting to EnumDLRLocalizationSourceTypeBarcode.<br>
    The library will localize reference region(s) based on the barcodes whose text meets current setting.
