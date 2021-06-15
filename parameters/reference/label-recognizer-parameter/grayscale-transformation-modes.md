---
layout: default-layout
title: Dynamsoft Label Recognizer Parameter Reference for LabelRecognizerParameter Object - GrayscaleTransformationModes
description: This page shows Dynamsoft Label Recognizer Parameter Reference for LabelRecognizerParameter Object - GrayscaleTransformationModes.
keywords: GrayscaleTransformationModes, LabelRecognizerParameter, parameter reference, parameter
needAutoGenerateSidebar: true
---


# LabelRecognizerParameter Object

## GrayscaleTransformationModes

### Mode Properties
`GrayscaleTransformationModes` is a parameter for setting the mode for the grayscale image conversion. It consisits of one or more `DLRGrayscaleTransformationMode` items. The array index represents the priority of the item. The smaller index is, the higher priority is.

| Value Type | Value Range | Default Value |
| ---------- | ----------- | ------------- |
| *[`DLRGrayscaleTransformationMode`]({{ site.enumerations }}parameter-mode-enums.html#dlrgrayscaletransformationmode) array* | "DLR_GTM_SKIP"<br>"DLR_GTM_INVERTED"<br>"DLR_GTM_ORIGINAL" | ["DLR_GTM_ORIGINAL", "DLR_GTM_SKIP", "DLR_GTM_SKIP", "DLR_GTM_SKIP", "DLR_GTM_SKIP", "DLR_GTM_SKIP", "DLR_GTM_SKIP", "DLR_GTM_SKIP"] |

- **See also**:   
    [`DLRGrayscaleTransformationMode` Enumeration]({{ site.enumerations }}parameter-mode-enums.html#dlrgrayscaletransformationmode)
    

### Setting Methods

#### As JSON Parameter
`GrayscaleTransformationModes` as a JSON parameter is a JSON Object array. ach JSON Object has a key `Mode` for setting the mode, and the array index decides the priority of the mode for the grayscale image conversion. Default values will be used if there is no manual setting.


| Json Object |	Json Parameter Name | Value Type |
| ----------- | ------------------- | ---------- |
| LabelRecognitionParameter | GrayscaleTransformationModes | *JSON Object Array* | 

**Json Parameter Example**   
```json
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
`GrayscaleTransformationModes` is a [`DLRGrayscaleTransformationMode`]({{ site.enumerations }}parameter-mode-enums.html#dlrgrayscaletransformationmode) array defines in `DLRRuntimeSettings`. It is used for setting the modes and the priority for the grayscale image conversion. Default value will be used if there is no manual setting.

| Struct |	Struct Member Name | Value Type |
| ------ | ------------------ | ---------- |
| [`DLRRuntimeSettings`]({{ site.c-cplusplus-structs }}dlr-runtime-settings.html) | [`grayscaleTransformationModes`]({{ site.c-cplusplus-structs }}dlr-runtime-settings.html#grayscaletransformationmodes) | [`DLRGrayscaleTransformationMode`]({{ site.enumerations }}parameter-mode-enums.html#dlrgrayscaletransformationmode)[8] |

**See Also**    
- [`DLRRuntimeSettings` Struct]({{ site.c-cplusplus-structs }}dlr-runtime-settings.html)
- [`DLRGrayscaleTransformationMode` Enumeration]({{ site.enumerations }}parameter-mode-enums.html#dlrgrayscaletransformationmode)
