---
layout: default-layout
title: Dynamsoft Label Recognizer Parameter Reference for LabelRecognizerParameter Object - RegionPredetectionModes
description: This page shows Dynamsoft Label Recognizer Parameter Reference for LabelRecognizerParameter Object - RegionPredetectionModes.
keywords: RegionPredetectionModes, LabelRecognizerParameter, parameter reference, parameter
needAutoGenerateSidebar: true
needGenerateH3Content: true
---

# LabelRecognizerParameter Object

## RegionPredetectionModes

**Remarks**   
If the image is large and the barcode on the image is very small, it is recommended to enable region predetection to speed up the localization process and recognition accuracy.   

### Mode Properties
`RegionPredetectionModes` is a parameter for setting the mode for region pre-detection. It consisits of one or more `RegionPredetectionMode` items and each item has its own arguments. The array index represents the priority of the item. The smaller index is, the higher priority is.

| Value Type | Value Range | Default Value |
| ---------- | ----------- | ------------- |
| *[`RegionPredetectionMode`]({{ site.enumerations }}region-predetection-mode.html) array* | "RPM_SKIP"<br>"RPM_AUTO"<br>"RPM_GENERAL"<br>"RPM_GENERAL_RGB_CONTRAST"<br>"RPM_GENERAL_GRAY_CONTRAST"<br>"RPM_GENERAL_HSV_CONTRAST" | ["RPM_GENERAL", "RPM_SKIP", "RPM_SKIP", "RPM_SKIP", "RPM_SKIP", "RPM_SKIP", "RPM_SKIP", "RPM_SKIP"] |

- **See also**:   
    [`RegionPredetectionMode` Enumeration]({{ site.enumerations }}region-predetection-mode.html)
    
#### Mode Arguments
- [AspectRatioRange](#aspectratiorange)
- [ForeAndBackgroundColours](#foreandbackgroundcolours)
- [HeightRange](#heightrange)
- [MinImageDimension](#minimagedimension)
- [FindAccurateBoundary](#findaccurateboundary)
- [Sensitivity](#sensitivity)
- [SpatialIndexBlockSize](#spatialindexblocksize)
- [WidthRange](#widthrange)
 
##### AspectRatioRange 
Sets the aspect ratio range of the bounding rectangle of the predetected region.

| Value Type | Value Range | Default Value | 
| ---------- | ----------- | ------------- |
| *string* | A string value representing aspect ratio range. | "" |         


- **Remarks**     
  -  The aspect ratio range need to be defined as [`MinAspectRatio`, `MaxAspectRatio`]. There will be no limitation without manual setting.
  - Aspect ratio equals to *height/width\*100*. `MinAspectRatio` and `MaxAspectRatio` are used for limiting the aspect ratio range of the predetected region.
  - Value range of `MinAspectRatio`, `MaxAspectRatio`: [1,10000]
  
  
##### ForeAndBackgroundColours 
Specifies a set (or multiple sets) of the foreground and background colours used for region predetection algorithm.

| Value Type | Value Range | Default Value | 
| ---------- | ----------- | ------------- |
| *string* | A string value representing one or more colour sets. | "" |         


- **Remarks**     
  - Each set of the foreground and background colours need to be defined as [`ForegroundColour`, `BackgroundColour`, `Tolerance`]. If you want to define multiple sets, you can use a "";"" to separate them. This argument is **mandatory**. If there is no manual setting, no region can be detected.
  - `ForegroundColour`and `BackgroundColour` are the Hue values in the HSV colour space for defining the foreground and background colours of the regions you want to predetect. The value -1 means black, gray, white.
  - `Tolerance` is the allowable deviation of the Hue value defined by `ForegroundColour`. 
  - Value range of `ForegroundColour`, `BackgroundColour`: [-1,360]
  - Value range of `Tolerance`: [0, 360]
  
 
 
##### HeightRange 
Sets the height range of the bounding rectangle of the predetected region.

| Value Type | Value Range | Default Value | 
| ---------- | ----------- | ------------- |
| *string* | A string value representing height range. | "" |         


- **Remarks**     
  - The height range need to be defined as [`MinHeight`, `MaxHeight`]. There will be no limitation without manual setting.
  - Value range of `MinHeight`, `MaxHeight`: [1,0x7fffffff]


  
##### MinImageDimension 
Sets the minimum image dimension (in pixels) to pre-detect barcode regions.

| Value Type | Value Range | Default Value | 
| ---------- | ----------- | ------------- |
| *int* | [16384, 0x7fffffff] | 262144 |         

- **Remarks**     
  If the image dimension is larger than the given value, the library will enable the feature of pre-detecting barcode regions. Otherwise, it will skip this step when searching for barcodes.  


##### FindAccurateBoundary 
Sets whether to enable finding accurate boundary.

| Value Type | Value Range | Default Value | 
| ---------- | ----------- | ------------- |
| *int* | [0, 1] | 0 |         

- **Remarks**     
  0: disable.<br>
  1: enable.
 
##### Sensitivity 
Sets the sensitivity used for region predetection algorithm.

| Value Type | Value Range | Default Value | 
| ---------- | ----------- | ------------- |
| *int* | [1, 9] | 1 |         

- **Remarks**     
  A larger value means the library will take more effort to detect regions.  
 
##### SpatialIndexBlockSize 
Sets the spatial index block size used for region predetection algorithm.

| Value Type | Value Range | Default Value | 
| ---------- | ----------- | ------------- |
| *int* | [1, 32] | 5 |         

- **Remarks**     
  The block size used for region predetection would be 2 to the power of N. The allowed values of SpatialIndexBlockSize is the power number (N=1,2,3...).


  
##### WidthRange 
Sets the width range of the bounding rectangle of the predetected region.

| Value Type | Value Range | Default Value | 
| ---------- | ----------- | ------------- |
| *string* | A string value representing width range. | "" |         


- **Remarks**     
  - The width range need to be defined as [`MinWidth`, `MaxWidth`]. There will be no limitation without manual setting.
  - Value range of `MinWidth`, `MaxWidth`: [1,0x7fffffff]


### Setting Methods

#### As JSON Parameter
`RegionPredetectionModes` as a JSON parameter is a JSON Object array. Each JSON Object has several keys for setting the mode and the value of arguments. The array index decides the priority the region pre-detection mode for barcodes search. Default values will be used if there is no manual setting.   


| Json Object |	Json Parameter Name | Value Type |
| ----------- | ------------------- | ---------- |
| LabelRecognizerParameter | RegionPredetectionModes | *JSON Object Array* | 

**Json Parameter Example**   
```json
{
    "RegionPredetectionModes": [
        {
            "Mode": "RPM_GENERAL_GRAY_CONTRAST",
            "Sensitivity": 5,
            "MinImageDimension":262144
        }
    ]
}
```




#### As `DLR_RuntimeSettings` Member
`regionPredetectionModes` is a [`RegionPredetectionMode`]({{ site.enumerations }}region-predetection-mode.html) array defines in `DLR_RuntimeSettings`. It is used for setting the modes and the priority for region pre-detection. Default value will be used if there is no manual setting.

| Struct |	Struct Member Name | Value Type |
| ------ | ------------------ | ---------- |
| [`DLR_RuntimeSettings`]({{ site.c-cplusplus-api-reference }}dlr-runtime-settings.html)->[`furtherModes`]({{ site.c-cplusplus-api-reference }}dlr-runtime-settings.html#furthermodes) | [`regionPredetectionModes`]({{ site.c-cplusplus-api-reference }}dlr-further-modes.html#regionpredetectionmodes) | [`RegionPredetectionMode`]({{ site.enumerations }}region-predetection-mode.html)[8] |


**See Also**    
- [`DLR_RuntimeSettings` Struct]({{ site.c-cplusplus-api-reference }}dlr-runtime-settings.html)
- [`RegionPredetectionMode` Enumeration]({{ site.enumerations }}region-predetection-mode.html)
