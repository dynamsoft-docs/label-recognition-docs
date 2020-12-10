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
 | [`TextArea.LinesSpecificationNameArray `](#linesspecificationnamearray ) | Specifies the name array of the LinesSpecification objects which is relative to current TextArea. |
 | [`TextArea.LineStringRegExPattern`](#linestringregexpattern) | Specifies the regular expression pattern of each line string text in current text area to recognize. |
 | [`TextArea.TextAreaNameArray `](#textareanamearray ) | Specifies the name array of the TextAreas which is relative to current text area. |
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
```
{
    "Name":"TextArea1"
}
```


&nbsp;


## FirstPoint
The first point of the text area, which is usually the top-left corner.

**Remarks**    
View the texts in 0 degree, the first point is the top-left point of the area defined by TextArea, and the other three points are in a clockwise direction.<br>
The allowed values for x/y:<br>
MeasuredByPercentage=0:  [0, 0x7fffffff]
MeasuredByPercentage=1: [0, 100]


### As Json Parameter

| Json Object |	Json Parameter Name | Value Type | Default Value |
| ----------- | ------------------- | ---------- | ------------- |
| TextArea | FirstPoint | *int array* | [0, 0] |


**Json Parameter Example**   
```
{
    "FirstPoint":[0, 10]
}
```

&nbsp;

## SecondPoint
The second point of the text area, which is usually the top-right corner.

**Remarks**    
View the texts in 0 degree, the first point is the top-left point of the area defined by TextArea, and the other three points are in a clockwise direction.<br>
The allowed values for x/y:<br>
MeasuredByPercentage=0:  [0, 0x7fffffff]
MeasuredByPercentage=1: [0, 100]


### As Json Parameter

| Json Object |	Json Parameter Name | Value Type | Default Value |
| ----------- | ------------------- | ---------- | ------------- |
| TextArea | SecondPoint | *int array* | [100, 0] |


**Json Parameter Example**   
```
{
    "SecondPoint":[10, 10]
}
```

&nbsp;

## ThirdPoint
The third point of the text area, which is usually the bottom-right corner.

**Remarks**    
View the texts in 0 degree, the first point is the top-left point of the area defined by TextArea, and the other three points are in a clockwise direction.<br>
The allowed values for x/y:<br>
MeasuredByPercentage=0:  [0, 0x7fffffff]
MeasuredByPercentage=1: [0, 100]


### As Json Parameter

| Json Object |	Json Parameter Name | Value Type | Default Value |
| ----------- | ------------------- | ---------- | ------------- |
| TextArea | ThirdPoint | *int array* | [100, 100] |


**Json Parameter Example**   
```
{
    "ThirdPoint":[0, 10]
}
```

&nbsp;

## FourthPoint
The fourth point of the text area, which is usually the bottom-left corner.

**Remarks**    
View the texts in 0 degree, the first point is the top-left point of the area defined by TextArea, and the other three points are in a clockwise direction.<br>
The allowed values for x/y:<br>
MeasuredByPercentage=0:  [0, 0x7fffffff]
MeasuredByPercentage=1: [0, 100]


### As Json Parameter

| Json Object |	Json Parameter Name | Value Type | Default Value |
| ----------- | ------------------- | ---------- | ------------- |
| TextArea | FourthPoint | *int array* | [0, 100] |


**Json Parameter Example**   
```
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
```
{
    "CharacterModelName":"CharacterModel_Name1"
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
```
{
    "LinesCount":1
}
```

&nbsp;

## LinesSpecificationNameArray
Specifies the name array of the LinesSpecification objects which is relative to current text area. 

**Remarks**   
An array item is a name of any available `LinesSpecification`.    

### As Json Parameter

| Json Object |	Json Parameter Name |	Value Type | Default Value |
| ----------- | ------------------- | ---------- | ------------- |
| TextArea | LinesSpecificationNameArray | *string Array* | `null` |


**Json Parameter Example**   
```
{
    "LinesSpecificationNameArray":[
        "LinesSpecification1",
        "LinesSpecification2"
    ]
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
```
{
    "LetterHeightRange":[40,60,1]
}
```

&nbsp;



## TextRegExPattern
Specifies the regular expression pattern of the text to recognize.  


### As Json Parameter

| Json Object |	Json Parameter Name | Value Type | Default Value |
| ----------- | ------------------- | ---------- | ------------- |
| TextArea | TextRegExPattern | *string* | "" |

**Json Parameter Example**   
```
{
    "TextRegExPattern":""
}
```

&nbsp;


## LineStringRegExPattern
Specifies the regular expression pattern of each line string text in current text area to recognize.  


### As Json Parameter

| Json Object |	Json Parameter Name | Value Type | Default Value |
| ----------- | ------------------- | ---------- | ------------- |
| TextArea | LineStringRegExPattern | *string* | "" |

**Json Parameter Example**   
```
{
    "LineStringRegExPattern":""
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
```
{
    "TextAreaNameArray":[
        "TextArea1",
        "TextArea2"
    ]
}
```
&nbsp;

