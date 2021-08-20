---
layout: default-layout
title: Dynamsoft Label Recognizer Objective-C & Swift Class - iDLRReferenceRegion
description: This page shows the iDLRReferenceRegion class of Dynamsoft Label Recognition for iOS SDK.
keywords: iDLRReferenceRegion, class, objective-c, oc, swift
needAutoGenerateSidebar: true
needGenerateH3Content: true
noTitleIndex: true
---


# iDLRReferenceRegion
Stores the reference region information.  
  
```objc
@interface iDLRReferenceRegion : NSObject 
```

## Attributes
  
| Attribute | Type |
|---------- | ---- |
| [`localizationSourceType`](#localizationsourcetype) | [`EnumLocalizationSourceType`]({{ site.enumerations }}localization-source-type.html) |
| [`location`](#location) | [`iQuadrilateral`](quadrilateral.md)\* |
| [`regionMeasuredByPercentage`](#regionmeasuredbypercentage) | *NSInteger* |
| [`regionPredetectionModesIndex`](#regionpredetectionmodesindex) | *NSInteger* |
| [`barcodeFormatIds`](#barcodeformatids) | *NSInteger* |
| [`barcodeFormatIds_2`](#barcodeformatids_2) | *NSInteger* |
| [`barcodeTextRegExPattern`](#barcodetextregexpattern) | *NSString\** |

&nbsp;

### localizationSourceType
The source type used to localize the reference region(s).
```objc
NSInteger localizationSourceType
```
- **Value range**   
    A value of [`EnumLocalizationSourceType`]({{ site.enumerations }}localization-source-type.html) Enumeration items.
      
- **Default value**   
    `EnumLocalizationSourceTypeManualSpecification`
    
- **Remarks**  
    

&nbsp;

### location
Four vertexes in a clockwise direction of a quadrilateral. Index 0 represents the left-most vertex. 
```objc
iQuadrilateral* location
```
- **Remarks**   
    It works only when [localizationSourceType](#localizationsourcetype) is setting to EnumLocalizationSourceTypeManualSpecification.<br>
    The library will localize reference region(s) based on the quadrilateral set by current setting.<br>

&nbsp;

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
    It works only when [localizationSourceType](#localizationsourcetype) is setting to EnumLocalizationSourceTypeManualSpecification.<br>


&nbsp;

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
    It works only when [localizationSourceType](#localizationsourcetype) is setting to EnumLocalizationSourceTypePredetectedRegion.<br>
    The library will localize reference region(s) based on the detected regions from the specified region predetection mode.<br>
    -1: all region predetection modes in the regionPredetectionModes parameter
    

&nbsp;

### barcodeFormatIds
The formats of the barcode in BarcodeFormat group 1.
```objc
NSInteger barcodeFormatIds
```
- **Value range**   
    A combined value of [`EnumBarcodeFormat`]({{ site.enumerations }}barcode-format.html) Enumeration items
      
- **Default value**   
    EnumBarcodeFormatALL
    
- **Remarks**   
    Barcode formats in BarcodeFormat group 1 can be combined.<br>
    It works only when [localizationSourceType](#localizationsourcetype) is setting to EnumLocalizationSourceTypeBarcode.<br>
    The library will localize reference region(s) based on the barcodes whose format meets current setting.  
    

&nbsp;

### barcodeFormatIds_2
The formats of the barcode in BarcodeFormat group 2.
```objc
NSInteger barcodeFormatIds_2
```
- **Value range**   
    A combined value of [`EnumBarcodeFormat_2`]({{ site.enumerations }}barcode-format-2.html) Enumeration items
      
- **Default value**   
    EnumBarcodeFormat2NULL
    
- **Remarks**   
    Barcode formats in BarcodeFormat group 2 can be combined.<br>
    It works only when [localizationSourceType](#localizationsourcetype) is setting to EnumLocalizationSourceTypeBarcode.<br>
    The library will localize reference region(s) based on the barcodes whose format meets current setting.
    
&nbsp;

### barcodeTextRegExPattern
The regular express pattern of barcode text.
```objc
NSString* barcodeTextRegExPattern
```

- **Remarks**   
    It works only when [localizationSourceType](#localizationsourcetype) is setting to EnumLocalizationSourceTypeBarcode.<br>
    The library will localize reference region(s) based on the barcodes whose text meets current setting.
