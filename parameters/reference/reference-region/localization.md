---
layout: default-layout
title: Dynamsoft Label Recognizer Parameter Reference for ReferenceRegion Object
description: This page shows Dynamsoft Label Recognizer Parameter Reference for ReferenceRegion Object.
keywords: ReferenceRegion, parameter reference, parameter
needAutoGenerateSidebar: true
needGenerateH3Content: true
---

# ReferenceRegion Object

## Localization
A JSON object containing the following settings.

### SourceType
The source type used to localize the reference region(s).  

**As Json Parameter**

| Json Object |	Json Parameter Name | Value Type | Value Range | Default Value |
| ----------- | ------------------- | ---------- | ----------- | ------------- |
| Localization | SourceType | *string* | "LST_MANUAL_SPECIFICATION"<br>"LST_PREDETECTED_REGION"<br>"LST_BARCODE". | "LST_MANUAL_SPECIFICATION" |

**Json Parameter Example**   
```json
ReferenceRegion:  
{
"Name": "R1",
"Localization": 
    {
        "SourceType": "LST_PREDETECTED_REGION",
        "RegionPredetectionModesIndex": 1
    }
}
```




### FirstPoint
The first point of the reference region, which is usually the top-left corner.

**Remarks**    
View the texts in 0 degree, the first point is the top-left point of the area defined by ReferenceRegion, and the other three points are in a clockwise direction.<br>

When MeasuredByPercentage=0, the valid value range for x-coordinate/y-coordinate is [0, 0x7fffffff]
When MeasuredByPercentage=1, the valid value range for x-coordinate/y-coordinate is [0, 100]

It works only when [SourceType](#sourcetype) is setting to LST_MANUAL_SPECIFICATION<br>

**As Json Parameter**

| Json Object |	Json Parameter Name | Value Type | Default Value |
| ----------- | ------------------- | ---------- | ------------- |
| Localization | FirstPoint | *int array* | [0, 0] |


**Json Parameter Example**   
```json
ReferenceRegion:  
{
"Name": "R1",
"Localization": 
    {
        "SourceType": "LST_MANUAL_SPECIFICATION",
        "FirstPoint": [0, 0],
        "SecondPoint": [100, 0],
        "ThirdPoint": [100, 100],
        "FourthPoint": [0, 100],
        "MeasuredByPercentage":1
    }
}
```



### SecondPoint
The second point of the reference region, which is usually the top-right corner.

**Remarks**    
View the texts in 0 degree, the first point is the top-left point of the area defined by ReferenceRegion, and the other three points are in a clockwise direction.<br>

When MeasuredByPercentage=0, the valid value range for x-coordinate/y-coordinate is [0, 0x7fffffff]
When MeasuredByPercentage=1, the valid value range for x-coordinate/y-coordinate is [0, 100]

It works only when [SourceType](#sourcetype) is setting to LST_MANUAL_SPECIFICATION<br>


**As Json Parameter**

| Json Object |	Json Parameter Name | Value Type | Default Value |
| ----------- | ------------------- | ---------- | ------------- |
| Localization | SecondPoint | *int array* | [100, 0] |


**Json Parameter Example**   
```json
ReferenceRegion:  
{
"Name": "R1",
"Localization": 
    {
        "SourceType": "LST_MANUAL_SPECIFICATION",
        "FirstPoint": [0, 0],
        "SecondPoint": [100, 0],
        "ThirdPoint": [100, 100],
        "FourthPoint": [0, 100],
        "MeasuredByPercentage":1
    }
}
```



### ThirdPoint
The third point of the reference region, which is usually the bottom-right corner.

**Remarks**    
View the texts in 0 degree, the first point is the top-left point of the area defined by ReferenceRegion, and the other three points are in a clockwise direction.<br>

When MeasuredByPercentage=0, the valid value range for x-coordinate/y-coordinate is [0, 0x7fffffff]
When MeasuredByPercentage=1, the valid value range for x-coordinate/y-coordinate is [0, 100]

It works only when [SourceType](#sourcetype) is setting to LST_MANUAL_SPECIFICATION<br>


**As Json Parameter**

| Json Object |	Json Parameter Name | Value Type | Default Value |
| ----------- | ------------------- | ---------- | ------------- |
| Localization | ThirdPoint | *int array* | [100, 100] |


**Json Parameter Example**   
```json
ReferenceRegion:  
{
"Name": "R1",
"Localization": 
    {
        "SourceType": "LST_MANUAL_SPECIFICATION",
        "FirstPoint": [0, 0],
        "SecondPoint": [100, 0],
        "ThirdPoint": [100, 100],
        "FourthPoint": [0, 100],
        "MeasuredByPercentage":1
    }
}
```



### FourthPoint
The fourth point of the reference region, which is usually the bottom-left corner.

**Remarks**    
View the texts in 0 degree, the first point is the top-left point of the area defined by ReferenceRegion, and the other three points are in a clockwise direction.<br>

When MeasuredByPercentage=0, the valid value range for x-coordinate/y-coordinate is [0, 0x7fffffff]
When MeasuredByPercentage=1, the valid value range for x-coordinate/y-coordinate is [0, 100]

It works only when [SourceType](#sourcetype) is setting to LST_MANUAL_SPECIFICATION<br>


**As Json Parameter**

| Json Object |	Json Parameter Name | Value Type | Default Value |
| ----------- | ------------------- | ---------- | ------------- |
| Localization | FourthPoint | *int array* | [0, 100] |


**Json Parameter Example**   
```json
ReferenceRegion:  
{
"Name": "R1",
"Localization": 
    {
        "SourceType": "LST_MANUAL_SPECIFICATION",
        "FirstPoint": [0, 0],
        "SecondPoint": [100, 0],
        "ThirdPoint": [100, 100],
        "FourthPoint": [0, 100],
        "MeasuredByPercentage":1
    }
}
```



### MeasuredByPercentage
Sets whether or not to use percentages to measure the coordinate.

**Remarks**   
0: not by percentage<br>
1: by percentage<br>
It works only when [SourceType](#sourcetype) is setting to LST_MANUAL_SPECIFICATION<br>

**As Json Parameter**

| Json Object |	Json Parameter Name | Value Type | Value Range | Default Value |
| ----------- | ------------------- | ---------- | ----------- | ------------- |
| Localization | MeasuredByPercentage | *int* | [0, 1] | 1 |


**Json Parameter Example**   
```json
ReferenceRegion:  
{
"Name": "R1",
"Localization": 
    {
        "SourceType": "LST_MANUAL_SPECIFICATION",
        "FirstPoint": [0, 0],
        "SecondPoint": [100, 0],
        "ThirdPoint": [100, 100],
        "FourthPoint": [0, 100],
        "MeasuredByPercentage":1
    }
}
```




### RegionPredetectionModesIndex
The index of a specific region predetection mode in the regionPredetectionModes parameter. 

**Remarks**   
-1: all region predetection modes in the regionPredetectionModes parameter<br>
It works only when [SourceType](#sourcetype) is setting to LST_PREDETECTED_REGION<br>
The library will localize reference region(s) based on the detected regions from the specified region predetection mode.<br>

**As Json Parameter**

| Json Object |	Json Parameter Name | Value Type | Value Range | Default Value |
| ----------- | ------------------- | ---------- | ----------- | ------------- |
| Localization | RegionPredetectionModesIndex | *int* | [-1, 0x7fffffff] | -1 |


**Json Parameter Example**   
```json
ReferenceRegion:  
{
"Name": "R1",
"Localization": 
    {
        "SourceType": "LST_PREDETECTED_REGION",
        "RegionPredetectionModesIndex": 1
    }
}
```



### BarcodeFormatIds
The formats of the barcode in BarcodeFormat group 1. 

**Remarks**   
It works only when [SourceType](#sourcetype) is setting to LST_BARCODE.<br>
The library will localize reference region(s) based on the barcodes whose format meets current setting.  

**As Json Parameter**

| Json Object |	Json Parameter Name | Value Type | Value Range | Default Value |
| ----------- | ------------------- | ---------- | ----------- | ------------- |
| Localization | BarcodeFormatIds | *string Array* | An array item can be any one of the [`BarcodeFormat` Enumeration]({{ site.enumerations }}barcode-format.html) items | "BF_ALL" |

**Json Parameter Example**   
```json
ReferenceRegion:  
{
"Name": "R1",
 "Localization": 
   {
        "SourceType": "LST_BARCODE",
        "BarcodeFormatIds": ["BF_ALL"],
        "BarcodeFormatIds_2": ["BF2_NULL"],
        "BarcodeTextRegExPattern":""
    }
}
```






### BarcodeFormatIds_2 
The formats of the barcode in BarcodeFormat group 2.

**Remarks**   
It works only when [SourceType](#sourcetype) is setting to LST_BARCODE.<br>
The library will localize reference region(s) based on the barcodes whose format meets current setting.  

**As Json Parameter**

| Json Object |	Json Parameter Name | Value Type | Value Range | Default Value |
| ----------- | ------------------- | ---------- | ----------- | ------------- |
| Localization | BarcodeFormatIds_2 | *string Array* | An array item can be any one of the [`BarcodeFormat_2` Enumeration]({{ site.enumerations }}barcode-format-2.html) items | "BF2_NULL" |

**Json Parameter Example**   
```json
ReferenceRegion:  
{
"Name": "R1",
 "Localization": 
   {
        "SourceType": "LST_BARCODE",
        "BarcodeFormatIds": ["BF_ALL"],
        "BarcodeFormatIds_2": ["BF2_NULL"],
        "BarcodeTextRegExPattern":""
    }
}
```





### BarcodeTextRegExPattern
The regular express pattern of barcode text.

**Remarks**   
It works only when [SourceType](#sourcetype) is setting to LST_BARCODE<br>

**As Json Parameter**

| Json Object |	Json Parameter Name | Value Type | Value Range | Default Value |
| ----------- | ------------------- | ---------- | ----------- | ------------- |
| Localization | BarcodeTextRegExPattern | *string* | regular express pattern as string. | "" |

**Json Parameter Example**   
```json
ReferenceRegion:  
{
"Name": "R1",
 "Localization": 
   {
        "SourceType": "LST_BARCODE",
        "BarcodeFormatIds": ["BF_ALL"],
        "BarcodeFormatIds_2": ["BF2_NULL"],
        "BarcodeTextRegExPattern":""
    }
}
```





