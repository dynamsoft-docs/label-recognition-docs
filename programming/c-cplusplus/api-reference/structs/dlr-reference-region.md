---
layout: default-layout
title: Dynamsoft Label Recognition C & C++ Struct - DLRReferenceRegion
description: This page shows the DLRReferenceRegion struct of Dynamsoft Label Recognition for C & C++ Language.
keywords: DLRReferenceRegion, struct, c, c++
needAutoGenerateSidebar: true
---


# DLRReferenceRegion
Stores the reference region information.  

## Typedefs

```cpp
typedef struct tagDLRReferenceRegion  DLRReferenceRegion 
```  
  
---
  

## Attributes
  
| Attribute | Type |
|---------- | ---- |
| [`localizationSourceType`](#localizationsourcetype) | [`DLRLocalizationSourceType`]({{ site.enumerations }}other-enums.html#dlrlocalizationsourcetype) |
| [`points`](#points) | [`DLRPoint`](dlr-point.md)[4] |
| [`regionMeasuredByPercentage`](#regionmeasuredbypercentage) | *int* |
| [`regionPredetectionModesIndex`](#regionpredetectionmodesindex) | *int* |
| [`barcodeFormatIds`](#barcodeformatids) | *int* |
| [`barcodeFormatIds_2`](#barcodeformatids_2) | *int* |
| [`barcodeTextRegExPattern`](#barcodetextregexpattern) | *char\[64\]* |
| [`reserved`](#reserved) | *char\[64\]* |

### localizationSourceType
The source type used to localize the reference region(s).
```cpp
DLRLocalizationSourceType tagDLRReferenceRegion::localizationSourceType
```
- **Value range**   
    A value of [`DLRLocalizationSourceType`]({{ site.enumerations }}other-enums.html#dlrlocalizationsourcetype) Enumeration items.
      
- **Default value**   
    `DLR_LST_MANUAL_SPECIFICATION`
    
- **Remarks**  
    

### points
Four vertexes in a clockwise direction of a quadrilateral. Index 0 represents the left-most vertex. 
```cpp
DLRPoint tagDLRReferenceRegion::points[4]
```
- **Remarks**   
    It works only when [localizationSourceType](#localizationsourcetype) is setting to DLR_LST_MANUAL_SPECIFICATION.<br>
    The library will localize reference region(s) based on the quadrilateral set by current setting.<br>

### regionMeasuredByPercentage
Whether or not to use percentage to measure the coordinate.
```cpp
int tagDLRReferenceRegion::regionMeasuredByPercentage
```
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
```cpp
int tagDLRReferenceRegion::regionPredetectionModesIndex
```
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
```cpp
int tagDLRReferenceRegion::barcodeFormatIds
```
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
```cpp
int tagDLRReferenceRegion::barcodeFormatIds_2
```
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
```cpp
char tagDLRReferenceRegion::barcodeTextRegExPattern[64]
```

- **Remarks**   
    It works only when [localizationSourceType](#localizationsourcetype) is setting to DLR_LST_BARCODE.<br>
    The library will localize reference region(s) based on the barcodes whose text meets current setting.


### reserved
Reserved memory for struct. The length of this array indicates the size of the memory reserved for this struct.
```cpp
char tagDLRReferenceRegion::reserved[64]
```
