---
layout: default-layout
title: Dynamsoft Label Recognition Parameter Reference for TextArea Object
description: This page shows Dynamsoft Label Recognition Parameter Reference for TextArea Object.
keywords: TextArea, parameter reference, parameter
needAutoGenerateSidebar: true
needGenerateH3Content: false
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
 | [`TextArea.LinesCount`](#linescount) | Sets the text lines count of the text area. |
 | [`TextArea.LineSpecificationNameArray `](#LineSpecificationnamearray ) | Specifies the name array of the LineSpecification objects which is relative to current TextArea. |
 | [`TextArea.LineStringLengthRange`](#linestringlengthrange) | Sets the range of string length for each recognized line. |
 | [`TextArea.LineStringRegExPattern`](#linestringregexpattern) | Specifies the regular expression pattern of each line string text in current text area to recognize. |
 | [`TextArea.MaxLineCharacterSpacing`](#maxlinecharacterspacing) | Sets the maximum spacing between characters treated as one line. |
 | [`TextArea.TextAreaNameArray `](#textareanamearray ) | Specifies the name array of the TextAreas which is relative to current text area. |
 | [`TextArea.TextStringLengthRange`](#textstringlengthrange) | Sets the range of string length for each recognized text area. |
 | [`TextArea.TextRegExPattern`](#textregexpattern) | Specifies the regular expression pattern of the text to recognize. |

---


## Name
The name of the TextArea object.  

**Remarks**    
It must be a unique name.

### As Json Parameter

| Json Object |	Json Parameter Name | Value Type | Default Value |
| ----------- | ------------------- | ---------- | ------------- |
| TextArea | Name | *string* | It must be a mandatory setting value. |

**Json Parameter Example**   
```json
{
    "Name":"TextArea1"
}
```


&nbsp;


## FirstPoint
The first point of the text area, which is usually the top-left corner.

**Remarks**    
View the texts in 0 degree, the first point is the top-left point of the area defined by TextArea, and the other three points are in a clockwise direction.<br>
The ordinate origin is the top-left corner of the ReferenceRegion.<br>
The value of x is a percentage value relative to the width of the ReferenceRegion.<br>
The value of y is a percentage value relative to the height of the ReferenceRegion.<br>
The allowed values for x/y: [-10000, 10000]<br>


### As Json Parameter

| Json Object |	Json Parameter Name | Value Type | Default Value |
| ----------- | ------------------- | ---------- | ------------- |
| TextArea | FirstPoint | *int array* | [0, 0] |


**Json Parameter Example**   
```json
{
    "FirstPoint":[0, 10]
}
```

&nbsp;

## SecondPoint
The second point of the text area, which is usually the top-right corner.

**Remarks**    
View the texts in 0 degree, the first point is the top-left point of the area defined by TextArea, and the other three points are in a clockwise direction.<br>
The ordinate origin is the top-left corner of the ReferenceRegion.<br>
The value of x is a percentage value relative to the width of the ReferenceRegion.<br>
The value of y is a percentage value relative to the height of the ReferenceRegion.<br>
The allowed values for x/y: [-10000, 10000]<br>


### As Json Parameter

| Json Object |	Json Parameter Name | Value Type | Default Value |
| ----------- | ------------------- | ---------- | ------------- |
| TextArea | SecondPoint | *int array* | [100, 0] |


**Json Parameter Example**   
```json
{
    "SecondPoint":[10, 10]
}
```

&nbsp;

## ThirdPoint
The third point of the text area, which is usually the bottom-right corner.

**Remarks**    
View the texts in 0 degree, the first point is the top-left point of the area defined by TextArea, and the other three points are in a clockwise direction.<br>
The ordinate origin is the top-left corner of the ReferenceRegion.<br>
The value of x is a percentage value relative to the width of the ReferenceRegion.<br>
The value of y is a percentage value relative to the height of the ReferenceRegion.<br>
The allowed values for x/y: [-10000, 10000]<br>


### As Json Parameter

| Json Object |	Json Parameter Name | Value Type | Default Value |
| ----------- | ------------------- | ---------- | ------------- |
| TextArea | ThirdPoint | *int array* | [100, 100] |


**Json Parameter Example**   
```json
{
    "ThirdPoint":[0, 10]
}
```

&nbsp;

## FourthPoint
The fourth point of the text area, which is usually the bottom-left corner.

**Remarks**    
View the texts in 0 degree, the first point is the top-left point of the area defined by TextArea, and the other three points are in a clockwise direction.<br>
The ordinate origin is the top-left corner of the ReferenceRegion.<br>
The value of x is a percentage value relative to the width of the ReferenceRegion.<br>
The value of y is a percentage value relative to the height of the ReferenceRegion.<br>
The allowed values for x/y: [-10000, 10000]<br>


### As Json Parameter

| Json Object |	Json Parameter Name | Value Type | Default Value |
| ----------- | ------------------- | ---------- | ------------- |
| TextArea | FourthPoint | *int array* | [0, 100] |


**Json Parameter Example**   
```json
{
    "FourthPoint":[10, 20]
}
```

&nbsp;

## CharacterModelName
Sets the name of a white list of recognizable characters.  

**Remarks**    
If you set a character model, the result will only contain characters within the model.  


### As Json Parameter

| Json Object |	Json Parameter Name | Value Type | Default Value |
| ----------- | ------------------- | ---------- | ------------- |
| TextArea | CharacterModelName | *string* | "" |

**Json Parameter Example**   
```json
{
    "CharacterModelName":"CharacterModel_Name1"
}
```

&nbsp;

## GrayscaleTransformationModes
Please check [LabelRecognitionParameter.GrayscaleTransformationModes](../label-recognition-parameter/grayscale-transformation-modes.md#GrayscaleTransformationModes) for reference.

&nbsp;

## LetterHeightRange
Sets the range of letter height (in pixel or a percentage value relative to the height of the text area).  

**Remarks**    
Format: [MinHeight, MaxHeight, ByPercentage]  
The allowed values for MinHeight/MaxHeight:  
ByPercentage=0, [1, 0x7fffffff]  
ByPercentage=1, [1, 100]  
The allowed values for ByPercentage: [0,1]  


### As Json Parameter

| Json Object |	Json Parameter Name | Value Type | Default Value |
| ----------- | ------------------- | ---------- | ------------- |
| TextArea | LetterHeightRange | *int array* | [1,100,1] |

**Json Parameter Example**   
```json
{
    "LetterHeightRange":[40,60,1]
}
```

&nbsp;


## LinesCount
Sets the text lines count of the text area.

**Remarks**   
0: line count is not certain.  

### As Json Parameter

| Json Object |	Json Parameter Name | Value Type | Value Range | Default Value |
| ----------- | ------------------- | ---------- | ----------- | ------------- |
| TextArea | LinesCount | *int* | [0, 200] | 0 |


**Json Parameter Example**   
```json
{
    "LinesCount":1
}
```

&nbsp;

## LineSpecificationNameArray
Specifies the name array of the LineSpecification objects which is relative to current text area. 

**Remarks**   
An array item is a name of any available `LineSpecification`.    

### As Json Parameter

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
&nbsp;

## LineStringLengthRange
Sets the range of string length for each recognized line.

### As Json Parameter
`LineStringLengthRange` as a JSON parameter is a JSON Object with two keys `MinValue` and `MaxValue` for setting the range of string length for each recognized line. Default values will be used if there is no manual setting. 


| Json Object |	Json Parameter Name | Value Type | Default Value |
| ----------- | ------------------- | ---------- | ------------- |
| TextArea | LineStringLengthRange | *JSON Object* | `null` |

- **Remarks** 
 - Value range of `MinValue` and `MaxValue`: [0, 0x7fffffff]<br>
 - MaxValue >= MinValue

**Json Parameter Example**   
```
{
    "LineStringLengthRange": 
    {
        "MinValue": 4,
        "MaxValue": 200
    }
}
```

&nbsp;


## LineStringRegExPattern
Specifies the regular expression pattern of each line string text in current text area to recognize.  

**Remarks**    
 - All LineSpecification Objects without LineStringRegExPattern set will be set from this setting.
 - Supported regular expressions pattern syntax is same as [`TextRegExPattern`]({{ site.parameters-reference }}label-recognition-parameter/parameter-control.html#textregexpattern).


### As Json Parameter

| Json Object |	Json Parameter Name | Value Type | Default Value |
| ----------- | ------------------- | ---------- | ------------- |
| TextArea | LineStringRegExPattern | *string* | "" |

**Json Parameter Example**   
```json
{
    "LineStringRegExPattern":""
}
```

&nbsp;

## MaxLineCharacterSpacing
Sets the maximum spacing between characters treated as one line.

**Remarks**   
- 0: means automatically set by the library.
- It is a percentage value relative to the average letter height of each line.

### As Json Parameter

| Json Object |	Json Parameter Name | Value Type | Value Range | Default Value |
| ----------- | ------------------- | ---------- | ----------- | ------------- |
| TextArea | MaxLineCharacterSpacing | *int* | [0, 0x7fffffff] | 0 |


**Json Parameter Example**   
```json
{
    "MaxLineCharacterSpacing":200
}
```

&nbsp;

## TextStringLengthRange
Sets the range of string length for each recognized text area.

### As Json Parameter
`TextStringLengthRange` as a JSON parameter is a JSON Object with two keys `MinValue` and `MaxValue` for setting the range of string length for each recognized text area. Default values will be used if there is no manual setting. 


| Json Object |	Json Parameter Name | Value Type | Default Value |
| ----------- | ------------------- | ---------- | ------------- |
| TextArea | TextStringLengthRange | *JSON Object* | `null` |

- **Remarks** 
 - Value range of `MinValue` and `MaxValue`: [0, 0x7fffffff]<br>
 - MaxValue >= MinValue

**Json Parameter Example**   
```
{
    "TextStringLengthRange": 
    {
        "MinValue": 4,
        "MaxValue": 200
    }
}
```

&nbsp;


## TextRegExPattern
Specifies the regular expression pattern of the text to recognize.  

**Remarks**    
Supported regular expressions pattern syntax is same as [`TextRegExPattern`]({{ site.parameters-reference }}label-recognition-parameter/parameter-control.html#textregexpattern).


### As Json Parameter

| Json Object |	Json Parameter Name | Value Type | Default Value |
| ----------- | ------------------- | ---------- | ------------- |
| TextArea | TextRegExPattern | *string* | "" |

**Json Parameter Example**   
```json
{
    "TextRegExPattern":""
}
```

&nbsp;

## TextAreaNameArray
Specifies the name array of the TextArea objects which is relative to current text area. 

**Remarks**   
An array item is a name of any available `TextArea`.    

### As Json Parameter

| Json Object |	Json Parameter Name |	Value Type | Default Value |
| ----------- | ------------------- | ---------- | ------------- |
| TextArea | TextAreaNameArray | *string Array* | `null` |


**Json Parameter Example**   
```json
{
    "TextAreaNameArray":[
        "TextArea1",
        "TextArea2"
    ]
}
```
&nbsp;

