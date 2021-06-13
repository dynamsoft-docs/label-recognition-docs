---
layout: default-layout
title: Dynamsoft Label Recognizer .Net Class - DLR_ReferenceRegion
description: This page shows the DLR_ReferenceRegion struct of Dynamsoft Label Recognizer for .Net Language.
keywords: DLR_ReferenceRegion, struct, .Net
needAutoGenerateSidebar: true
---


# Dynamsoft.DLR.DLR_ReferenceRegion
Stores the reference region information.  
  

## Attributes
  
| Attribute | Type |
|---------- | ---- |
| [`LocalizationSourceType`](#localizationsourcetype) | [`EnumDLRLocalizationSourceType`]({{ site.enumerations }}other-enums.html#dlrlocalizationsourcetype) |
| [`Points`](#points) | *Point\[\]* |
| [`RegionMeasuredByPercentage`](#regionmeasuredbypercentage) | *int* |
| [`RegionPredetectionModesIndex`](#regionpredetectionmodesindex) | *int* |
| [`BarcodeFormatIds`](#barcodeformatids) | *int* |
| [`BarcodeFormatIds_2`](#barcodeformatids_2) | *int* |
| [`BarcodeTextRegExPattern`](#barcodetextregexpattern) | *string* |

### LocalizationSourceType
The source type used to localize the reference region(s).
```csharp
int LocalizationSourceType
```
- **Value range**   
    A value of [`EnumDLRLocalizationSourceType`]({{ site.enumerations }}other-enums.html#dlrlocalizationsourcetype) Enumeration items.
      
- **Default value**   
    `DLR_LST_MANUAL_SPECIFICATION`
    
- **Remarks**  
    

### Points
Four vertexes in a clockwise direction of a quadrilateral. Index 0 represents the left-most vertex. 
```csharp
DLRPoint[] Points
```
- **Remarks**   
    It works only when [LocalizationSourceType](#localizationsourcetype) is setting to DLR_LST_MANUAL_SPECIFICATION.<br>
    The library will localize reference region(s) based on the quadrilateral set by current setting.<br>

### RegionMeasuredByPercentage
Whether or not to use percentage to measure the coordinate.
```csharp
int RegionMeasuredByPercentage
```
- **Value range**   
    [0, 1]
      
- **Default value**   
    1
    
- **Remarks**   
    It works only when [LocalizationSourceType](#localizationsourcetype) is setting to DLR_LST_MANUAL_SPECIFICATION.<br>
    0: not by percentage<br>
    1: by percentage<br>
    When it's set to 1, the values of points indicate percentage (from 0 to 100); Otherwise, they indicate coordinates in pixel.  


### RegionPredetectionModesIndex
The index of a specific region predetection mode in the regionPredetectionModes parameter.
```csharp
int RegionPredetectionModesIndex
```
- **Value range**   
    [-1, 0x7fffffff]
      
- **Default value**   
    -1
    
- **Remarks**   
    It works only when [LocalizationSourceType](#localizationsourcetype) is setting to DLR_LST_PREDETECTED_REGION.<br>
    The library will localize reference region(s) based on the detected regions from the specified region predetection mode.<br>
    -1: all region predetection modes in the regionPredetectionModes parameter
    

### BarcodeFormatIds
The formats of the barcode in BarcodeFormat group 1.
```csharp
int BarcodeFormatIds
```
- **Value range**   
    A combined value of [`EnumDLRBarcodeFormat`]({{ site.enumerations }}other-enums.html#dlrbarcodeformat) Enumeration items
      
- **Default value**   
    DLR_BF_ALL
    
- **Remarks**   
    Barcode formats in DLRBarcodeFormat group 1 can be combined.<br>
    It works only when [LocalizationSourceType](#localizationsourcetype) is setting to DLR_LST_BARCODE.<br>
    The library will localize reference region(s) based on the barcodes whose format meets current setting.  
    

### BarcodeFormatIds_2
The formats of the barcode in BarcodeFormat group 2.
```csharp
int BarcodeFormatIds_2
```
- **Value range**   
    A combined value of [`EnumDLRBarcodeFormat_2`]({{ site.enumerations }}other-enums.html#dlrbarcodeformat_2) Enumeration items
      
- **Default value**   
    DLR_BF2_NULL
    
- **Remarks**   
    Barcode formats in DLRBarcodeFormat group 2 can be combined.<br>
    It works only when [LocalizationSourceType](#localizationsourcetype) is setting to DLR_LST_BARCODE.<br>
    The library will localize reference region(s) based on the barcodes whose format meets current setting.
    
### BarcodeTextRegExPattern
The regular express pattern of barcode text.
```csharp
string BarcodeTextRegExPattern
```

- **Remarks**   
    It works only when [LocalizationSourceType](#localizationsourcetype) is setting to DLR_LST_BARCODE.<br>
    The library will localize reference region(s) based on the barcodes whose text meets current setting.
