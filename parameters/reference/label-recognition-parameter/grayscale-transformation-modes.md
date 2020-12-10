---
layout: default-layout
title: Dynamsoft Label Recognition Parameter Reference for LabelRecognitionParameter Object - GrayscaleTransformationModes
description: This page shows Dynamsoft Label Recognition Parameter Reference for LabelRecognitionParameter Object - GrayscaleTransformationModes.
keywords: GrayscaleTransformationModes, LabelRecognitionParameter, parameter reference, parameter
needAutoGenerateSidebar: true
---


# LabelRecognitionParameter Object

 | Parameter Name | Description |
 | -------------- | ----------- | 
 | [`LabelRecognitionParameter.Name`](parameter-control.md#name) | The name of the LabelRecognitionParameter object. |
 | [`LabelRecognitionParameter.BinarizationModes`](binarization-modes.md#binarizationmodes) | 	Sets the mode and priority for binarization. |
 | [`LabelRecognitionParameter.CharacterModelName`](parameter-control.md#charactermodelname) | Sets the name of a white list of recognizable characters. |
 | [`LabelRecognitionParameter.GrayscaleTransformationModes`](#grayscaletransformationmodes) | Sets the mode and priority for the grayscale image conversion. |
 | [`LabelRecognitionParameter.LetterHeightRange`](parameter-control.md#letterheightrange) | Sets the range of letter height (in pixel or a percentage value relative to the height of the text area). |
 | [`LabelRecognitionParameter.LinesCount`](parameter-control.md#linescount) | Sets the text lines count of the text area. |
 | [`LabelRecognitionParameter.LineStringRegExPattern`](parameter-control.md#linestringregexpattern) | Specifies the regular expression pattern of each line string text in current image to recognize. |
 | [`LabelRecognitionParameter.MaxThreadCount`](parameter-control.md#maxthreadcount) | Sets the maximum number of threads the algorithm will use to recognize text. |
 | [`LabelRecognitionParameter.ReferenceRegionNameArray`](parameter-control.md#referenceregionnamearray) | The name array of the ReferenceRegion object(s). |
 | [`LabelRecognitionParameter.RegionPredetectionModes`](region-predetection-modes.md#regionpredetectionmodes) | Sets the region pre-detection mode for barcodes search. |
 | [`LabelRecognitionParameter.TextRegExPattern`](parameter-control.md#textregexpattern) | Specifies the regular expression pattern of the text to recognize. |

---


## GrayscaleTransformationModes

### Mode Properties
`GrayscaleTransformationModes` is a parameter for setting the mode for the grayscale image conversion. It consisits of one or more `DLRGrayscaleTransformationMode` items. The array index represents the priority of the item. The smaller index is, the higher priority is.

| Value Type | Value Range | Default Value |
| ---------- | ----------- | ------------- |
| *[`DLRGrayscaleTransformationMode`]({{ site.enumerations }}parameter-mode-enums.html#dlrgrayscaletransformationmode) array* | "DLR_GTM_SKIP"<br>"DLR_GTM_INVERTED"<br>"DLR_GTM_ORIGINAL" | ["DLR_GTM_ORIGINAL", "DLR_GTM_SKIP", "DLR_GTM_SKIP", "DLR_GTM_SKIP", "DLR_GTM_SKIP", "DLR_GTM_SKIP", "DLR_GTM_SKIP", "DLR_GTM_SKIP"] |

- **See also**:   
    [`DLRGrayscaleTransformationMode` Enumeration]({{ site.enumerations }}parameter-mode-enums.html#dlrgrayscaletransformationmode)
    
#### Mode Arguments
- [LibraryFileName](#libraryfilename)
- [LibraryParameters](#libraryparameters)

##### LibraryFileName 
Sets the file name of the library to load dynamically.

| Value Type | Value Range | Default Value | Valid Modes | 
| ---------- | ----------- | ------------- | ----------- |
| *string* | A string value representing file name. | "" | All `DLRGrayscaleTransformationMode` items except DLR_GTM_SKIP |         


- **Remarks**     
  - The library must be in the same place with Dynamsoft Label Recognition Library.


##### LibraryParameters 
Sets the parameters passed to the library to load dynamically.

| Value Type | Value Range | Default Value | Valid Modes | 
| ---------- | ----------- | ------------- | ----------- |
| *string* | A string value representing parameters. | "" | All `DLRGrayscaleTransformationMode` items except DLR_GTM_SKIP |         


### Setting Methods

#### As JSON Parameter
`GrayscaleTransformationModes` as a JSON parameter is a JSON Object array. ach JSON Object has a key `Mode` for setting the mode, and the array index decides the priority of the mode for the grayscale image conversion. Default values will be used if there is no manual setting.


| Json Object |	Json Parameter Name | Value Type |
| ----------- | ------------------- | ---------- |
| LabelRecognitionParameter | GrayscaleTransformationModes | *JSON Object Array* | 

**Json Parameter Example**   
```
{
    "GrayscaleTransformationModes": [
        {
            "Mode": "DLR_GTM_INVERTED"
        },
        {
            "Mode": "DLR_GTM_ORIGINAL"
        }
    ]
}
```

&nbsp;


#### As `DLRRuntimeSettings` Member
`GrayscaleTransformationModes` is a [`DLRGrayscaleTransformationMode`]({{ site.enumerations }}parameter-mode-enums.html#dlrgrayscaletransformationmode) array defines in `furtherModes` which is a struct member of `DLRRuntimeSettings`. It is used for setting the modes and the priority for the grayscale image conversion. Default value will be used if there is no manual setting.

| Struct |	Struct Member Name | Value Type |
| ------ | ------------------ | ---------- |
| [`DLRRuntimeSettings`]({{ site.c-cplusplus-structs }}dlr-runtime-settings.html) | [`grayscaleTransformationModes`]({{ site.c-cplusplus-structs }}FurtherModes.html#grayscaletransformationmodes) | [`DLRGrayscaleTransformationMode`]({{ site.enumerations }}parameter-mode-enums.html#dlrgrayscaletransformationmode)[8] |

**See Also**    
- [`DLRRuntimeSettings` Struct]({{ site.c-cplusplus-structs }}dlr-runtime-settings.html)
- [`DLRGrayscaleTransformationMode` Enumeration]({{ site.enumerations }}parameter-mode-enums.html#dlrgrayscaletransformationmode)
