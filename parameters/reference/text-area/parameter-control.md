---
layout: default-layout
title: Dynamsoft Label Recognizer Parameter Reference for TextArea Object
description: This page shows Dynamsoft Label Recognizer Parameter Reference for TextArea Object.
keywords: TextArea, parameter reference, parameter
needAutoGenerateSidebar: true
needGenerateH3Content: true
---

# TextArea Object

 | Parameter Name | Description |
 | -------------- | ----------- | 
 | [`TextArea.Name`](#name) | The name of the TextArea object. |
 | [`TextArea.FirstPoint`](#firstpoint) | The first point of the text area, which is usually the top-left corner. |
 | [`TextArea.SecondPoint`](#secondpoint) | The second point of the text area, which is usually the top-right corner. |
 | [`TextArea.ThirdPoint`](#thirdpoint) | The third point of the text area, which is usually the bottom-right corner. |
 | [`TextArea.FourthPoint`](#fourthpoint) | The fourth point of the text area, which is usually the bottom-left  corner. |
 | [`TextArea.CharacterModelName`](#charactermodelname) | Sets the name of a white list of recognizable characters. |
 | [`TextArea.GrayscaleTransformationModes`](#grayscaletransformationmodes) | Sets the mode and priority for the grayscale image conversion. |
 | [`TextArea.LetterHeightRange`](#letterheightrange) | Sets the range of letter height (in pixel or a percentage value relative to the height of the text area). |
 | [`TextArea.LineSpecificationNameArray `](#LineSpecificationnamearray ) | Specifies the name array of the LineSpecification objects which is relative to current TextArea. |
 | [`TextArea.LineStringLengthRange`](#linestringlengthrange) | Sets the range of string length for each recognized line. |
 | [`TextArea.LineStringRegExPattern`](#linestringregexpattern) | Specifies the regular expression pattern of each line string text in current text area to recognize. |
 | [`TextArea.MaxLineCharacterSpacing`](#maxlinecharacterspacing) | Sets the maximum spacing between characters treated as one line. |
 | [`TextArea.TextStringLengthRange`](#textstringlengthrange) | Sets the range of string length for each recognized text area. |
 | [`TextArea.TextRegExPattern`](#textregexpattern) | Specifies the regular expression pattern of the text to recognize. |
 | [`TextArea.DictionaryPath`](#dictionarypath) | Sets the path of the dictionary file. |
 | [`TextArea.DictionaryCorrectionThresholds`](#dictionarycorrectionthresholds) | Sets the threshold of dictionary error correction. |
 | [`TextArea.BinarizationModes`](#binarizationmodes) | 	Sets the mode and priority for binarization. |
 | [`TextArea.ColourConversionModes`](#colourconversionmodes) | Sets the mode and priority for converting a colour image to a grayscale image. |
 | [`TextArea.GrayscaleEnhancementModes`](#grayscaleenhancementmodes) | Sets the mode and priority for grayscale image preprocessing algorithms. |
 | [`TextArea.TextureDetectionModes`](#texturedetectionmodes) | 	Sets the mode and priority for texture detection. |

---


## Name
The name of the TextArea object.  

**Remarks**    
It must be a unique name.

**As Json Parameter**

| Json Object |	Json Parameter Name | Value Type | Default Value |
| ----------- | ------------------- | ---------- | ------------- |
| TextArea | Name | *string* | It must be a mandatory setting value. |

**Json Parameter Example**   
```json
{
    "Name":"TextArea1"
}
```





## FirstPoint
The first point of the text area, which is usually the top-left corner.

**Remarks**    
View the texts in 0 degree, the first point is the top-left point of the area defined by TextArea, and the other three points are in a clockwise direction.<br>
The ordinate origin is the top-left corner of the ReferenceRegion.<br>
The value of x is a percentage value relative to the width of the ReferenceRegion.<br>
The value of y is a percentage value relative to the height of the ReferenceRegion.<br>
The allowed values for x/y: [-10000, 10000]<br>


**As Json Parameter**

| Json Object |	Json Parameter Name | Value Type | Default Value |
| ----------- | ------------------- | ---------- | ------------- |
| TextArea | FirstPoint | *int array* | [0, 0] |


**Json Parameter Example**   
```json
{
    "FirstPoint":[0, 10]
}
```



## SecondPoint
The second point of the text area, which is usually the top-right corner.

**Remarks**    
View the texts in 0 degree, the first point is the top-left point of the area defined by TextArea, and the other three points are in a clockwise direction.<br>
The ordinate origin is the top-left corner of the ReferenceRegion.<br>
The value of x is a percentage value relative to the width of the ReferenceRegion.<br>
The value of y is a percentage value relative to the height of the ReferenceRegion.<br>
The allowed values for x/y: [-10000, 10000]<br>


**As Json Parameter**

| Json Object |	Json Parameter Name | Value Type | Default Value |
| ----------- | ------------------- | ---------- | ------------- |
| TextArea | SecondPoint | *int array* | [100, 0] |


**Json Parameter Example**   
```json
{
    "SecondPoint":[10, 10]
}
```



## ThirdPoint
The third point of the text area, which is usually the bottom-right corner.

**Remarks**    
View the texts in 0 degree, the first point is the top-left point of the area defined by TextArea, and the other three points are in a clockwise direction.<br>
The ordinate origin is the top-left corner of the ReferenceRegion.<br>
The value of x is a percentage value relative to the width of the ReferenceRegion.<br>
The value of y is a percentage value relative to the height of the ReferenceRegion.<br>
The allowed values for x/y: [-10000, 10000]<br>


**As Json Parameter**

| Json Object |	Json Parameter Name | Value Type | Default Value |
| ----------- | ------------------- | ---------- | ------------- |
| TextArea | ThirdPoint | *int array* | [100, 100] |


**Json Parameter Example**   
```json
{
    "ThirdPoint":[0, 10]
}
```



## FourthPoint
The fourth point of the text area, which is usually the bottom-left corner.

**Remarks**    
View the texts in 0 degree, the first point is the top-left point of the area defined by TextArea, and the other three points are in a clockwise direction.<br>
The ordinate origin is the top-left corner of the ReferenceRegion.<br>
The value of x is a percentage value relative to the width of the ReferenceRegion.<br>
The value of y is a percentage value relative to the height of the ReferenceRegion.<br>
The allowed values for x/y: [-10000, 10000]<br>


**As Json Parameter**

| Json Object |	Json Parameter Name | Value Type | Default Value |
| ----------- | ------------------- | ---------- | ------------- |
| TextArea | FourthPoint | *int array* | [0, 100] |


**Json Parameter Example**   
```json
{
    "FourthPoint":[10, 20]
}
```



## CharacterModelName
Sets the name of a white list of recognizable characters.  

**Remarks**    
If you set a character model, the result will only contain characters within the model.  


**As Json Parameter**

| Json Object |	Json Parameter Name | Value Type | Default Value |
| ----------- | ------------------- | ---------- | ------------- |
| TextArea | CharacterModelName | *string* | "" |

**Json Parameter Example**   
```json
{
    "CharacterModelName":"CharacterModel_Name1"
}
```



## GrayscaleTransformationModes
Please check [LabelRecognizerParameter.GrayscaleTransformationModes](../label-recognition-parameter/grayscale-transformation-modes.md#grayscaletransformationmodes) for reference.



## LetterHeightRange
Sets the range of letter height (in pixel or a percentage value relative to the height of the text area).  

**Remarks**    
Format: [MinHeight, MaxHeight, ByPercentage]  
The allowed values for MinHeight/MaxHeight:  
ByPercentage=0, [1, 0x7fffffff]  
ByPercentage=1, [1, 100]  
The allowed values for ByPercentage: [0,1]  


**As Json Parameter**

| Json Object |	Json Parameter Name | Value Type | Default Value |
| ----------- | ------------------- | ---------- | ------------- |
| TextArea | LetterHeightRange | *int array* | [1,100,1] |

**Json Parameter Example**   
```json
{
    "LetterHeightRange":[40,60,1]
}
```



## LineSpecificationNameArray
Specifies the name array of the LineSpecification objects which is relative to current text area. 

**Remarks**   
An array item is a name of any available `LineSpecification`.    

**As Json Parameter**

| Json Object |	Json Parameter Name |	Value Type | Default Value |
| ----------- | ------------------- | ---------- | ------------- |
| TextArea | LineSpecificationNameArray | *string Array* | `null` |


**Json Parameter Example**   
```json
{
    "LineSpecificationNameArray":[
        "LineSpecification1",
        "LineSpecification2"
    ]
}
```


## LineStringLengthRange
Sets the range of string length for each recognized line.

**As Json Parameter**
`LineStringLengthRange` as a JSON parameter is a JSON Object with two keys `MinValue` and `MaxValue` for setting the range of string length for each recognized line. Default values will be used if there is no manual setting. 


| Json Object |	Json Parameter Name | Value Type | Default Value |
| ----------- | ------------------- | ---------- | ------------- |
| TextArea | LineStringLengthRange | *JSON Object* | `null` |

- **Remarks** 
 - Value range of `MinValue` and `MaxValue`: [0, 0x7fffffff]<br>
 - MaxValue >= MinValue

**Json Parameter Example**   
```json
{
    "LineStringLengthRange": 
    {
        "MinValue": 4,
        "MaxValue": 200
    }
}
```




## LineStringRegExPattern
Specifies the regular expression pattern of each line string text in current text area to recognize.  

**Remarks**    
 - All LineSpecification Objects without LineStringRegExPattern set will be set from this setting.
 - Supported regular expressions pattern syntax is same as [`TextRegExPattern`]({{ site.parameters-reference }}label-recognition-parameter/parameter-control.html#textregexpattern).


**As Json Parameter**

| Json Object |	Json Parameter Name | Value Type | Default Value |
| ----------- | ------------------- | ---------- | ------------- |
| TextArea | LineStringRegExPattern | *string* | "" |

**Json Parameter Example**   
```json
{
    "LineStringRegExPattern":""
}
```



## MaxLineCharacterSpacing
Sets the maximum spacing between characters treated as one line.

**Remarks**   
- 0: means automatically set by the library.
- It is a percentage value relative to the average letter height of each line.

**As Json Parameter**

| Json Object |	Json Parameter Name | Value Type | Value Range | Default Value |
| ----------- | ------------------- | ---------- | ----------- | ------------- |
| TextArea | MaxLineCharacterSpacing | *int* | [0, 0x7fffffff] | 0 |


**Json Parameter Example**   
```json
{
    "MaxLineCharacterSpacing":200
}
```



## TextStringLengthRange
Sets the range of string length for each recognized text area.

**As Json Parameter**
`TextStringLengthRange` as a JSON parameter is a JSON Object with two keys `MinValue` and `MaxValue` for setting the range of string length for each recognized text area. Default values will be used if there is no manual setting. 


| Json Object |	Json Parameter Name | Value Type | Default Value |
| ----------- | ------------------- | ---------- | ------------- |
| TextArea | TextStringLengthRange | *JSON Object* | `null` |

- **Remarks** 
 - Value range of `MinValue` and `MaxValue`: [0, 0x7fffffff]<br>
 - MaxValue >= MinValue

**Json Parameter Example**   
```json
{
    "TextStringLengthRange": 
    {
        "MinValue": 4,
        "MaxValue": 200
    }
}
```




## TextRegExPattern
Specifies the regular expression pattern of the text to recognize.  

**Remarks**    
Supported regular expressions pattern syntax is same as [`TextRegExPattern`]({{ site.parameters-reference }}label-recognition-parameter/parameter-control.html#textregexpattern).


**As Json Parameter**

| Json Object |	Json Parameter Name | Value Type | Default Value |
| ----------- | ------------------- | ---------- | ------------- |
| TextArea | TextRegExPattern | *string* | "" |

**Json Parameter Example**   
```json
{
    "TextRegExPattern":""
}
```



## DictionaryPath
Sets the path of the dictionary file.

**As Json Parameter**


| Json Object |	Json Parameter Name | Value Type | Default Value |
| ----------- | ------------------- | ---------- | ------------- |
| TextArea | DictionaryPath | *string* | "" |

**Json Parameter Example**   
```json
{
    "DictionaryPath":"D:\\DictModel\\nutrition.txt"
}
```




## DictionaryCorrectionThresholds
Sets the threshold of dictionary error correction.

**Remarks**   
It supports segmentation threshold. 

**As Json Parameter**

| Json Object |	Json Parameter Name |	Value Type | Default Value |
| ----------- | ------------------- | ---------- | ------------- |
| TextArea | DictionaryCorrectionThresholds | *Array* | `null` |

- MinWordLength: The minimum value of word length. 
- MaxWordLength: The maximum value of word length.
- Threshold: The threshold for the number of error correction characters.

**Json Parameter Example**   
```json
{
    "DictionaryCorrectionThresholds": [
        {
            "MinWordLength": 3,
            "MaxWordLength": 5,
            "Threshold": 1
        },
        {
            "MinWordLength": 6,
            "MaxWordLength": 10,
            "Threshold": 2
        },
        {
            "MinWordLength": 11,
            "Threshold": 3
        }
    ]

}
```

## BinarizationModes
Please check [LabelRecognizerParameter.BinarizationModes](../label-recognition-parameter/binarization-modes.md#binarizationmodes) for reference.

## ColourConversionModes
Please check [LabelRecognizerParameter.ColourConversionModes](../label-recognition-parameter/colour-conversion-modes.md#colourconversionmodes) for reference.

## GrayscaleEnhancementModes
Please check [LabelRecognizerParameter.GrayscaleEnhancementModes](../label-recognition-parameter/grayscale-enhancement-modes.md#grayscaleenhancementmodes) for reference.

## TextureDetectionModes
Please check [LabelRecognizerParameter.TextureDetectionModes](../label-recognition-parameter/texture-detection-modes.md#texturedetectionmodes) for reference.
