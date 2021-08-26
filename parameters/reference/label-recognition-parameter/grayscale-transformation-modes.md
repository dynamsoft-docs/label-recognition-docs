---
layout: default-layout
title: Dynamsoft Label Recognizer Parameter Reference for LabelRecognizerParameter Object - GrayscaleTransformationModes
description: This page shows Dynamsoft Label Recognizer Parameter Reference for LabelRecognizerParameter Object - GrayscaleTransformationModes.
keywords: GrayscaleTransformationModes, LabelRecognizerParameter, parameter reference, parameter
needAutoGenerateSidebar: true
needGenerateH3Content: true
---


# LabelRecognizerParameter Object

## GrayscaleTransformationModes

### Mode Properties
`GrayscaleTransformationModes` is a parameter for setting the mode for the grayscale image conversion. It consisits of one or more `GrayscaleTransformationMode` items. The array index represents the priority of the item. The smaller index is, the higher priority is.

| Value Type | Value Range | Default Value |
| ---------- | ----------- | ------------- |
| *[`GrayscaleTransformationMode`]({{ site.enumerations }}grayscale-transformation-mode.html) array* | "GTM_SKIP"<br>"GTM_INVERTED"<br>"GTM_ORIGINAL" | ["GTM_ORIGINAL", "GTM_SKIP", "GTM_SKIP", "GTM_SKIP", "GTM_SKIP", "GTM_SKIP", "GTM_SKIP", "GTM_SKIP"] |

- **See also**:   
    [`GrayscaleTransformationMode` Enumeration]({{ site.enumerations }}grayscale-transformation-mode.html)
    

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
            "Mode": "GTM_INVERTED"
        },
        {
            "Mode": "GTM_ORIGINAL"
        }
    ]
}
```



#### As `DLR_RuntimeSettings` Member
`GrayscaleTransformationModes` is a [`GrayscaleTransformationMode`]({{ site.enumerations }}grayscale-transformation-mode.html) array defines in `DLRRuntimeSettings`. It is used for setting the modes and the priority for the grayscale image conversion. Default value will be used if there is no manual setting.

| Struct |	Struct Member Name | Value Type |
| ------ | ------------------ | ---------- |
| [`DLR_RuntimeSettings`]({{ site.c-cplusplus-api-reference }}dlr-runtime-settings.html)->[`furtherModes`]({{ site.c-cplusplus-api-reference }}dlr-runtime-settings.html#furthermodes) | [`grayscaleTransformationModes`]({{ site.c-cplusplus-api-reference }}dlr-further-modes.html#grayscaletransformationmodes) | [`GrayscaleTransformationMode`]({{ site.enumerations }}grayscale-transformation-mode.html)[8] |

**See Also**    
- [`DLR_RuntimeSettings` Struct]({{ site.c-cplusplus-api-reference }}dlr-runtime-settings.html)
- [`GrayscaleTransformationMode` Enumeration]({{ site.enumerations }}grayscale-transformation-mode.html)
