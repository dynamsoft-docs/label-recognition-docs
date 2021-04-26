---
layout: default-layout
title: Dynamsoft Label Recognition Parameter Reference for LabelRecognitionParameter Object - ScaleUpModes
description: This page shows Dynamsoft Label Recognition Parameter Reference for LabelRecognitionParameter Object - ScaleUpModes.
keywords: ScaleUpModes, LabelRecognitionParameter, parameter reference, parameter
needAutoGenerateSidebar: true
---
# ImageParameter Object | ScaleUpModes



## ScaleUpModes  

### Mode Properties
`ScaleUpModes` is a parameter for setting the mode to control the scale-up process for text line with small letter height. It consisits of one or more `DLRScaleUpMode` items and each item has its own arguments. The array index represents the priority of the item. The smaller index is, the higher priority is.

| Value Type | Value Range | Default Value |
| ---------- | ----------- | ------------- |
| *string array* or *[`DLRScaleUpMode`]({{ site.enumerations }}parameter-mode-enums.html#dlrscaleupmode) array* | "DLR_SUM_SKIP"<br>"DLR_SUM_AUTO"<br>"DLR_SUM_LINEAR_INTERPOLATION"<br>"DLR_SUM_NEAREST_NEIGHBOUR_INTERPOLATION" | ["DLR_SUM_AUTO", "DLR_SUM_SKIP", "DLR_SUM_SKIP", "DLR_SUM_SKIP", "DLR_SUM_SKIP", "DLR_SUM_SKIP", "DLR_SUM_SKIP", "DLR_SUM_SKIP"] |

- **See also**:   
    [`ScaleUpMode` Enumeration]({{ site.enumerations }}parameter-mode-enums.html#scaleupmode)
    
#### Mode Arguments
- [LetterHeightThreshold](#letterheightthreshold)
- [TargetLetterHeight](#targetletterheight)

 
##### LetterHeightThreshold 
Sets the letter height threshold for scale-up.


| Value Type | Value Range | Default Value | 
| ---------- | ----------- | ------------- |
| *int* | [0, 0x7fffffff] | 0 |         

- **Remarks**     
  0 : means automatically set by the library.
  If the average letter height of a text line is smaller than the [LetterHeightThreshold](#letterheightthreshold), the image will be enlarged to N times (N=2,4,8…) till N * LetterHeight >= [TargetLetterHeight](#targetletterheight).


##### TargetLetterHeight 
Sets the target letter height for scale-up.


| Value Type | Value Range | Default Value |
| ---------- | ----------- | ------------- |
| *int* | [0, 0x7fffffff] | 0 |         

- **Remarks**     
  0 : means automatically set by the library.

### Setting Methods

#### As JSON Parameter
`ScaleUpModes` as a JSON parameter is a JSON Object array. Each JSON Object has several keys for setting the mode and the value of arguments. The array index decides the priority and the mode to control the scale-up process for text line with small letter height. Default values will be used if there is no manual setting.   


| Json Object |	Json Parameter Name | Value Type |
| ----------- | ------------------- | ---------- |
| ImageParameter | ScaleUpModes | *JSON Object Array* | 

**Json Parameter Example**   
```
{
    "ScaleUpModes": [
        {
            "Mode": "DLR_SUM_AUTO",
            "LetterHeightThreshold": 10,
            "TargetLetterHeight": 50
        }
]
}
```


&nbsp;



