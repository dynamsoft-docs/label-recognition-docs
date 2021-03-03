---
layout: default-layout
title: Dynamsoft Label Recognition Parameter Reference for LabelRecognitionParameter Object - RegionPredetectionModes
description: This page shows Dynamsoft Label Recognition Parameter Reference for LabelRecognitionParameter Object - RegionPredetectionModes.
keywords: RegionPredetectionModes, LabelRecognitionParameter, parameter reference, parameter
needAutoGenerateSidebar: true
---

# LabelRecognitionParameter Object

 | Parameter Name | Description |
 | -------------- | ----------- | 
 | [`LabelRecognitionParameter.Name`](parameter-control.md#name) | The name of the LabelRecognitionParameter object. |
 | [`LabelRecognitionParameter.BinarizationModes`](binarization-modes.md#binarizationmodes) | 	Sets the mode and priority for binarization. |
 | [`LabelRecognitionParameter.CharacterModelName`](parameter-control.md#charactermodelname) | Sets the name of a white list of recognizable characters. |
 | [`LabelRecognitionParameter.GrayscaleTransformationModes`](grayscale-transformation-modes.md#grayscaletransformationmodes) | Sets the mode and priority for the grayscale image conversion. |
 | [`LabelRecognitionParameter.LetterHeightRange`](parameter-control.md#letterheightrange) | Sets the range of letter height (in pixel or a percentage value relative to the height of the text area). |
 | [`LabelRecognitionParameter.LinesCount`](parameter-control.md#linescount) | Sets the text lines count of the text area. |
 | [`LabelRecognitionParameter.LineStringRegExPattern`](parameter-control.md#linestringregexpattern) | Specifies the regular expression pattern of each line string text in current image to recognize. |
 | [`LabelRecognitionParameter.MaxThreadCount`](parameter-control.md#maxthreadcount) | Sets the maximum number of threads the algorithm will use to recognize text. |
 | [`LabelRecognitionParameter.ReferenceRegionNameArray`](parameter-control.md#referenceregionnamearray) | The name array of the ReferenceRegion object(s). |
 | [`LabelRecognitionParameter.RegionPredetectionModes`](#regionpredetectionmodes) | Sets the region pre-detection mode for barcodes search. |
 | [`LabelRecognitionParameter.TextRegExPattern`](parameter-control.md#textregexpattern) | Specifies the regular expression pattern of the text to recognize. |

---


## RegionPredetectionModes

**Remarks**   
If the image is large and the barcode on the image is very small, it is recommended to enable region predetection to speed up the localization process and recognition accuracy.   

### Mode Properties
`RegionPredetectionModes` is a parameter for setting the mode for region pre-detection. It consisits of one or more `DLRRegionPredetectionMode` items and each item has its own arguments. The array index represents the priority of the item. The smaller index is, the higher priority is.

| Value Type | Value Range | Default Value |
| ---------- | ----------- | ------------- |
| *[`DLRRegionPredetectionMode`]({{ site.enumerations }}parameter-mode-enums.html#dlrregionpredetectionmode) array* | "DLR_RPM_SKIP"<br>"DLR_RPM_AUTO"<br>"DLR_RPM_GENERAL"<br>"DLR_RPM_GENERAL_RGB_CONTRAST"<br>"DLR_RPM_GENERAL_GRAY_CONTRAST"<br>"DLR_RPM_GENERAL_HSV_CONTRAST" | ["DLR_RPM_GENERAL", "DLR_RPM_SKIP", "DLR_RPM_SKIP", "DLR_RPM_SKIP", "DLR_RPM_SKIP", "DLR_RPM_SKIP", "DLR_RPM_SKIP", "DLR_RPM_SKIP"] |

- **See also**:   
    [`DLRRegionPredetectionMode` Enumeration]({{ site.enumerations }}parameter-mode-enums.html#dlrregionpredetectionmode)
    
#### Mode Arguments
- [AspectRatioRange](#aspectratiorange )
- [ForeAndBackgroundColours](#foreandbackgroundcolours )
- [HeightRange](#heightrange)
- [MinImageDimension](#minimagedimension)
- [FindAccurateBoundary](#findaccurateboundary)
- [Sensitivity](#sensitivity)
- [SpatialIndexBlockSize](#spatialindexblocksize)
- [WidthRange](#widthrange)
- [LibraryFileName](#libraryfilename)
- [LibraryParameters](#libraryparameters)
 
##### AspectRatioRange 
Sets the aspect ratio range of the bounding rectangle of the predetected region.

| Value Type | Value Range | Default Value | Valid Modes | 
| ---------- | ----------- | ------------- | ----------- |
| *string* | A string value representing aspect ratio range. | "" | "DLR_RPM_GENERAL_HSV_CONTRAST" |         


- **Remarks**     
  -  The aspect ratio range need to be defined as [`MinAspectRatio`, `MaxAspectRatio`]. There will be no limitation without manual setting.
  - Aspect ratio equals to *height/width\*100*. `MinAspectRatio` and `MaxAspectRatio` are used for limiting the aspect ratio range of the predetected region.
  - Value range of `MinAspectRatio`, `MaxAspectRatio`: [1,10000]
  
  
##### ForeAndBackgroundColours 
Specifies a set (or multiple sets) of the foreground and background colours used for region predetection algorithm.

| Value Type | Value Range | Default Value | Valid Modes | 
| ---------- | ----------- | ------------- | ----------- |
| *string* | A string value representing one or more colour sets. | "" | "DLR_RPM_GENERAL_HSV_CONTRAST" |         


- **Remarks**     
  - Each set of the foreground and background colours need to be defined as [`ForegroundColour`, `BackgroundColour`, `Tolerance`]. If you want to define multiple sets, you can use a "";"" to separate them. This argument is **mandatory**. If there is no manual setting, no region can be detected.
  - `ForegroundColour`and `BackgroundColour` are the Hue values in the HSV colour space for defining the foreground and background colours of the regions you want to predetect. The value -1 means black, gray, white.
  - `Tolerance` is the allowable deviation of the Hue value defined by `ForegroundColour`. 
  - Value range of `ForegroundColour`, `BackgroundColour`: [-1,360]
  - Value range of `Tolerance`: [0, 360]
  
 
 
##### HeightRange 
Sets the height range of the bounding rectangle of the predetected region.

| Value Type | Value Range | Default Value | Valid Modes | 
| ---------- | ----------- | ------------- | ----------- |
| *string* | A string value representing height range. | "" | "DLR_RPM_GENERAL_HSV_CONTRAST" |         


- **Remarks**     
  - The height range need to be defined as [`MinHeight`, `MaxHeight`]. There will be no limitation without manual setting.
  - Value range of `MinHeight`, `MaxHeight`: [1,0x7fffffff]


  
##### MinImageDimension 
Sets the minimum image dimension (in pixels) to pre-detect barcode regions.

| Value Type | Value Range | Default Value | Valid Modes | 
| ---------- | ----------- | ------------- | ----------- |
| *int* | [16384, 0x7fffffff] | 262144 | "DLR_RPM_GENERAL_GRAY_CONTRAST"<br>"DLR_RPM_GENERAL_HSV_CONTRAST"<br>"DLR_RPM_GENERAL_RGB_CONTRAST" |         

- **Remarks**     
  If the image dimension is larger than the given value, the library will enable the feature of pre-detecting barcode regions. Otherwise, it will skip this step when searching for barcodes.  


##### FindAccurateBoundary 
Sets whether to enable finding accurate boundary.

| Value Type | Value Range | Default Value | Valid Modes | 
| ---------- | ----------- | ------------- | ----------- |
| *int* | [0, 1] | 0 | "DLR_RPM_GENERAL_HSV_CONTRAST" |         

- **Remarks**     
  0: disable.<br>
  1: enable.
 
##### Sensitivity 
Sets the sensitivity used for region predetection algorithm.

| Value Type | Value Range | Default Value | Valid Modes | 
| ---------- | ----------- | ------------- | ----------- |
| *int* | [1, 9] | 1 | "DLR_RPM_GENERAL_GRAY_CONTRAST"<br>"DLR_RPM_GENERAL_HSV_CONTRAST"<br>"DLR_RPM_GENERAL_RGB_CONTRAST" |         

- **Remarks**     
  A larger value means the library will take more effort to detect regions.  
 
##### SpatialIndexBlockSize 
Sets the spatial index block size used for region predetection algorithm.

| Value Type | Value Range | Default Value | Valid Modes | 
| ---------- | ----------- | ------------- | ----------- |
| *int* | [1, 32] | 5 | "DLR_RPM_GENERAL_GRAY_CONTRAST"<br>"DLR_RPM_GENERAL_HSV_CONTRAST"<br>"DLR_RPM_GENERAL_RGB_CONTRAST" |         

- **Remarks**     
  The block size used for region predetection would be 2 to the power of N. The allowed values of SpatialIndexBlockSize is the power number (N=1,2,3...).


  
##### WidthRange 
Sets the width range of the bounding rectangle of the predetected region.

| Value Type | Value Range | Default Value | Valid Modes | 
| ---------- | ----------- | ------------- | ----------- |
| *string* | A string value representing width range. | "" | "DLR_RPM_GENERAL_HSV_CONTRAST" |         


- **Remarks**     
  - The width range need to be defined as [`MinWidth`, `MaxWidth`]. There will be no limitation without manual setting.
  - Value range of `MinWidth`, `MaxWidth`: [1,0x7fffffff]


##### LibraryFileName 
Sets the file name of the library to load dynamically.

| Value Type | Value Range | Default Value | Valid Modes | 
| ---------- | ----------- | ------------- | ----------- |
| *string* | A string value representing file name. | "" | All `DLRRegionPredetectionMode` items except DLR_RPM_SKIP and DLR_RPM_AUTO |         


- **Remarks**     
  - The library must be in the same place with Dynamsoft Label Recognition Library.


##### LibraryParameters 
Sets the parameters passed to the library to load dynamically.

| Value Type | Value Range | Default Value | Valid Modes | 
| ---------- | ----------- | ------------- | ----------- |
| *string* | A string value representing parameters. | "" | All `DLRRegionPredetectionMode` items except DLR_RPM_SKIP and DLR_RPM_AUTO |         



### Setting Methods

#### As JSON Parameter
`RegionPredetectionModes` as a JSON parameter is a JSON Object array. Each JSON Object has several keys for setting the mode and the value of arguments. The array index decides the priority the region pre-detection mode for barcodes search. Default values will be used if there is no manual setting.   


| Json Object |	Json Parameter Name | Value Type |
| ----------- | ------------------- | ---------- |
| LabelRecognitionParameter | RegionPredetectionModes | *JSON Object Array* | 

**Json Parameter Example**   
```json
{
    "RegionPredetectionModes": [
        {
            "Mode": "DLR_RPM_GENERAL_GRAY_CONTRAST",
            "Sensitivity": 5,
            "MinImageDimension":262144
        }
    ]
}
```


&nbsp;



#### As `DLRRuntimeSettings` Member
`regionPredetectionModes` is a [`DLRRegionPredetectionMode`]({{ site.enumerations }}parameter-mode-enums.html#dlrregionpredetectionmode) array defines in `DLRRuntimeSettings`. It is used for setting the modes and the priority for region pre-detection. Default value will be used if there is no manual setting.

| Struct |	Struct Member Name | Value Type |
| ------ | ------------------ | ---------- |
| [`DLRRuntimeSettings`]({{ site.c-cplusplus-structs }}dlr-runtime-settings.html) | [`regionPredetectionModes`]({{ site.c-cplusplus-structs }}dlr-runtime-settings.html#regionpredetectionmodes) | [`DLRRegionPredetectionMode`]({{ site.enumerations }}parameter-mode-enums.html#dlrregionpredetectionmode)[8] |


**See Also**    
- [`DLRRuntimeSettings` Struct]({{ site.c-cplusplus-structs }}dlr-runtime-settings.html)
- [`DLRRegionPredetectionMode` Enumeration]({{ site.enumerations }}parameter-mode-enums.html#dlrregionpredetectionmode)
