---
layout: default-layout
title: Dynamsoft Label Recognizer Parameter Reference for LabelRecognizerParameter Object - CharacterNormalizationModes 
description: This page shows Dynamsoft Label Recognizer Parameter Reference for LabelRecognizerParameter Object - CharacterNormalizationModes .
keywords: CharacterNormalizationModes, LabelRecognizerParameter, parameter reference, parameter
needAutoGenerateSidebar: true
needGenerateH3Content: true
---

# LabelRecognizerParameter Object

## CharacterNormalizationModes 

### Mode Properties
`CharacterNormalizationModes` is a parameter for setting the mode  for character normalization. It consisits of one or more `CharacterNormalizationMode` items and each item has its own arguments. The array index represents the priority of the item. The smaller index is, the higher priority is.

| Value Type | Value Range | Default Value |
| ---------- | ----------- | ------------- |
| *`CharacterNormalizationMode` array* | "CNM_SKIP"<br>"CNM_AUTO"<br>"CNM_MORPH" | ["CNM_AUTO"] |

#### Mode Arguments
- [MorphOperation](#morphoperation)
- [MorphArgument](#morphargument)

##### MorphOperation 
Sets the morph operation for the morphology process. 

| Value Type | Value Range | Default Value | 
| ---------- | ----------- | ------------- |
| *string* | "Erode"<br>"Dilate"<br>"Open"<br>"Close" | "Close" |         

**Remarks**  
   - "Erode": Perform erosion process.
   - "Dilate": Perform dilation process.
   - "Open": Perform erosion first, then perform dilation.
   - "Close": Perform dilation first, then perform erosion.
   
   For more information, please check out [Image Processing in OpenCV - Morphological Transformations](https://docs.opencv.org/master/d9/d61/tutorial_py_morphological_ops.html) for reference.


##### MorphArgument  
 Sets the morph argument for the morphology process. 

| Value Type | Value Range | Default Value | 
| ---------- | ----------- | ------------- |
| *string* | A string value representing morph argument. Now it only indicates Morph kernel size. | "3" |         


### Setting Methods

#### As JSON Parameter
`CharacterNormalizationModes` as a JSON parameter is a JSON Object array. Each JSON Object has several keys for setting the mode and the value of arguments. The array index decides the priority the mode  for  character normalization. Default values will be used if there is no manual setting.   


| Json Object |	Json Parameter Name | Value Type |
| ----------- | ------------------- | ---------- |
| LabelRecognizerParameter | CharacterNormalizationModes | *JSON Object Array* | 

**Json Parameter Example**   
```json
{
    "CharacterNormalizationModes": [
        {
            "Mode": "CNM_MORPH",
            "MorphOperation": "Close",
            "MorphArgument": "3",
        }
    ]
}
```

