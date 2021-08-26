---
layout: default-layout
title: Dynamsoft Label Recognizer Java Class - DLRReferenceRegion
description: This page shows the DLRReferenceRegion struct of Dynamsoft Label Recognizer for Java Language.
keywords: DLRReferenceRegion, struct, java
needAutoGenerateSidebar: true
needGenerateH3Content: true
noTitleIndex: true
---


# DLRReferenceRegion
Stores the reference region information.  
  

```java
class com.dynamsoft.dlr.DLRReferenceRegion
```

## Attributes
  
| Attribute | Type |
|---------- | ---- |
| [`localizationSourceType`](#localizationsourcetype) | [`EnumLocalizationSourceType`]({{ site.enumerations }}localization-source-type.html) |
| [`location`](#location) | [`Quadrilateral`](quadrilateral.md) |
| [`regionMeasuredByPercentage`](#regionmeasuredbypercentage) | *int* |
| [`regionPredetectionModesIndex`](#regionpredetectionmodesindex) | *int* |
| [`barcodeFormatIds`](#barcodeformatids) | *int* |
| [`barcodeFormatIds_2`](#barcodeformatids_2) | *int* |
| [`barcodeTextRegExPattern`](#barcodetextregexpattern) | *String* |

&nbsp;

### localizationSourceType
The source type used to localize the reference region(s).
```java
int localizationSourceType
```
- **Value range**   
    A value of [`EnumLocalizationSourceType`]({{ site.enumerations }}localization-source-type.html) Enumeration items.
      
- **Default value**   
    `LST_MANUAL_SPECIFICATION`
    
- **Remarks**  
    

&nbsp;

### location
Four vertexes in a clockwise direction of a quadrilateral. Index 0 represents the left-most vertex. 
```java
Quadrilateral location
```
- **Remarks**   
    It works only when [localizationSourceType](#localizationsourcetype) is setting to LST_MANUAL_SPECIFICATION.<br>
    The library will localize reference region(s) based on the quadrilateral set by current setting.<br>

&nbsp;

### regionMeasuredByPercentage
Whether or not to use percentage to measure the coordinate.
```java
int regionMeasuredByPercentage
```
- **Value range**   
    [0, 1]
      
- **Default value**   
    1
    
- **Remarks**   
    It works only when [localizationSourceType](#localizationsourcetype) is setting to LST_MANUAL_SPECIFICATION.<br>
    0: not by percentage<br>
    1: by percentage<br>
    When it's set to 1, the values of points indicate percentage (from 0 to 100); Otherwise, they indicate coordinates in pixel.  


&nbsp;

### regionPredetectionModesIndex
The index of a specific region predetection mode in the regionPredetectionModes parameter.
```java
int regionPredetectionModesIndex
```
- **Value range**   
    [-1, 0x7fffffff]
      
- **Default value**   
    -1
    
- **Remarks**   
    It works only when [localizationSourceType](#localizationsourcetype) is setting to LST_PREDETECTED_REGION.<br>
    The library will localize reference region(s) based on the detected regions from the specified region predetection mode.<br>
    -1: all region predetection modes in the regionPredetectionModes parameter
    

&nbsp;

### barcodeFormatIds
The formats of the barcode in BarcodeFormat group 1.
```java
int barcodeFormatIds
```
- **Value range**   
    A combined value of [`EnumBarcodeFormat`]({{ site.enumerations }}barcode-format.html) Enumeration items
      
- **Default value**   
    BF_ALL
    
- **Remarks**   
    Barcode formats in EnumBarcodeFormat group 1 can be combined.<br>
    It works only when [localizationSourceType](#localizationsourcetype) is setting to LST_BARCODE.<br>
    The library will localize reference region(s) based on the barcodes whose format meets current setting.  
    

&nbsp;

### barcodeFormatIds_2
The formats of the barcode in BarcodeFormat group 2.
```java
int barcodeFormatIds_2
```
- **Value range**   
    A combined value of [`EnumBarcodeFormat_2`]({{ site.enumerations }}barcode-format-2.html) Enumeration items
      
- **Default value**   
    BF2_NULL
    
- **Remarks**   
    Barcode formats in EnumBarcodeFormat group 2 can be combined.<br>
    It works only when [localizationSourceType](#localizationsourcetype) is setting to LST_BARCODE.<br>
    The library will localize reference region(s) based on the barcodes whose format meets current setting.
    
&nbsp;

### barcodeTextRegExPattern
The regular express pattern of barcode text.
```java
String barcodeTextRegExPattern
```

- **Remarks**   
    It works only when [localizationSourceType](#localizationsourcetype) is setting to LST_BARCODE.<br>
    The library will localize reference region(s) based on the barcodes whose text meets current setting.
