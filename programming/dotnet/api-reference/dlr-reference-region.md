---
layout: default-layout
title: Dynamsoft Label Recognizer .Net Class - DLR_ReferenceRegion
description: This page shows the DLR_ReferenceRegion struct of Dynamsoft Label Recognizer for .Net Language.
keywords: DLR_ReferenceRegion, struct, .Net
needAutoGenerateSidebar: true
needGenerateH3Content: true
noTitleIndex: true
---


# DLR_ReferenceRegion
Stores the reference region information.  

```csharp
class Dynamsoft.DLR.DLR_ReferenceRegion
``` 

## Attributes
  
| Attribute | Type |
|---------- | ---- |
| [`LocalizationSourceType`](#localizationsourcetype) | [`EnumLocalizationSourceType`]({{ site.enumerations }}localization-source-type.html) |
| [`Location`](#location) | [`Quadrilateral`](quadrilateral.md) |
| [`RegionMeasuredByPercentage`](#regionmeasuredbypercentage) | *int* |
| [`RegionPredetectionModesIndex`](#regionpredetectionmodesindex) | *int* |
| [`BarcodeFormatIds`](#barcodeformatids) | *int* |
| [`BarcodeFormatIds_2`](#barcodeformatids_2) | *int* |
| [`BarcodeTextRegExPattern`](#barcodetextregexpattern) | *string* |

&nbsp;

### LocalizationSourceType
The source type used to localize the reference region(s).
```csharp
int LocalizationSourceType
```
- **Value range**   
    A value of [`EnumLocalizationSourceType`]({{ site.enumerations }}localization-source-type.html) Enumeration items.
      
- **Default value**   
    `LST_MANUAL_SPECIFICATION`
    
- **Remarks**  
    

&nbsp;

### Location
Four vertexes in a clockwise direction of a quadrilateral. Index 0 represents the left-most vertex. 
```csharp
Quadrilateral Location
```
- **Remarks**   
    It works only when [LocalizationSourceType](#localizationsourcetype) is setting to LST_MANUAL_SPECIFICATION.<br>
    The library will localize reference region(s) based on the quadrilateral set by current setting.<br>

&nbsp;

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
    It works only when [LocalizationSourceType](#localizationsourcetype) is setting to LST_MANUAL_SPECIFICATION.<br>
    0: not by percentage<br>
    1: by percentage<br>
    When it's set to 1, the values of points indicate percentage (from 0 to 100); Otherwise, they indicate coordinates in pixel.  


&nbsp;

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
    It works only when [LocalizationSourceType](#localizationsourcetype) is setting to LST_PREDETECTED_REGION.<br>
    The library will localize reference region(s) based on the detected regions from the specified region predetection mode.<br>
    -1: all region predetection modes in the regionPredetectionModes parameter
    

&nbsp;

### BarcodeFormatIds
The formats of the barcode in BarcodeFormat group 1.
```csharp
int BarcodeFormatIds
```
- **Value range**   
    A combined value of [`EnumBarcodeFormat`]({{ site.enumerations }}barcode-format.html) Enumeration items
      
- **Default value**   
    BF_ALL
    
- **Remarks**   
    Barcode formats in BarcodeFormat group 1 can be combined.<br>
    It works only when [LocalizationSourceType](#localizationsourcetype) is setting to LST_BARCODE.<br>
    The library will localize reference region(s) based on the barcodes whose format meets current setting.  
    

&nbsp;

### BarcodeFormatIds_2
The formats of the barcode in BarcodeFormat group 2.
```csharp
int BarcodeFormatIds_2
```
- **Value range**   
    A combined value of [`EnumBarcodeFormat_2`]({{ site.enumerations }}barcode-format-2.html) Enumeration items
      
- **Default value**   
    BF2_NULL
    
- **Remarks**   
    Barcode formats in BarcodeFormat group 2 can be combined.<br>
    It works only when [LocalizationSourceType](#localizationsourcetype) is setting to LST_BARCODE.<br>
    The library will localize reference region(s) based on the barcodes whose format meets current setting.
    
&nbsp;

### BarcodeTextRegExPattern
The regular express pattern of barcode text.
```csharp
string BarcodeTextRegExPattern
```

- **Remarks**   
    It works only when [LocalizationSourceType](#localizationsourcetype) is setting to LST_BARCODE.<br>
    The library will localize reference region(s) based on the barcodes whose text meets current setting.
