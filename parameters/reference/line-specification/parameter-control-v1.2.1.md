---
layout: default-layout
title: Dynamsoft Label Recognition Parameter Reference for LineSpecification Object
description: This page shows Dynamsoft Label Recognition Parameter Reference for LineSpecification Object.
keywords: LineSpecification, parameter reference, parameter
needAutoGenerateSidebar: true
needGenerateH3Content: false
---

# LineSpecification Object

 | Parameter Name | Description |
 | -------------- | ----------- | 
 | [`LineSpecification.Name`](#name) | The name of the LineSpecification object. |
 | [`LineSpecification.LineNumber`](#linenumber) | The line number of the line targeted by the LineSpecification object. |
 | [`LineSpecification.FirstPoint`](#firstpoint) | The first point of the line, which is usually the top-left corner. |
 | [`LineSpecification.SecondPoint`](#secondpoint) | The second point of the line, which is usually the top-right corner. |
 | [`LineSpecification.ThirdPoint`](#thirdpoint) | The third point of the line, which is usually the bottom-right corner. |
 | [`LineSpecification.FourthPoint`](#fourthpoint) | The fourth point of the line, which is usually the bottom-left  corner. |
 | [`LineSpecification.CharacterModelName`](#charactermodelname) | Sets the name of a white list of recognizable characters. |
 | [`LineSpecification.LineStringLengthRange`](#linestringlengthrange) | Sets the range of string length for each recognized line. |
 | [`LineSpecification.LineStringRegExPattern`](#linestringregexpattern) | Specifies the regular expression pattern of the string within a line. |

---


## Name
The name of the LineSpecification object.  

**Remarks**    
It must be a unique name.

### As Json Parameter

| Json Object |	Json Parameter Name | Value Type | Default Value |
| ----------- | ------------------- | ---------- | ------------- |
| LineSpecification | Name | *string* | It must be a mandatory setting value. |

**Json Parameter Example**   
```json
{
    "Name":"LineSpecification1"
}
```

&nbsp;

## LineNumber
The line number of the line targeted by the LineSpecification object.

**Remarks**   
1. The value is 1-based;
2. "" represents all lines.


### As Json Parameter

| Json Object |	Json Parameter Name | Value Type | Value Range | Default Value |
| ----------- | ------------------- | ---------- | ----------- | ------------- |
| LineSpecification | LineNumber | *string* | A string of one or more of the following data,separated by commas:<br>1. One int value which represents a specified line index;<br>2. One Expression, start index and stop index connected with ""-"", which represents a specified line index range; | "" |


**Json Parameter Example**   
```json
{
    "LineNumber": "1,3,5,7-10"
}
```

&nbsp;

## FirstPoint
The first point of the line, which is usually the top-left corner.

**Remarks**    
View the texts in 0 degree, the first point is the top-left point of the area defined by LineSpecification, and the other three points are in a clockwise direction.<br>
The ordinate origin is the top-left corner of the TextArea.<br>
The value of x is a percentage value relative to the width of the TextArea.<br>
The value of y is a percentage value relative to the height of the TextArea.<br>
The allowed values for x/y: [0, 100].<br>
It is valid only when 'LineNumber' is setting to one specified line number.<br>


### As Json Parameter

| Json Object |	Json Parameter Name | Value Type | Default Value |
| ----------- | ------------------- | ---------- | ------------- |
| LineSpecification | FirstPoint | *int array* | [0, 0] |


**Json Parameter Example**   
```json
{
    "FirstPoint":[0, 10]
}
```

&nbsp;

## SecondPoint
The second point of the line, which is usually the top-right corner.

**Remarks**    
View the texts in 0 degree, the first point is the top-left point of the area defined by LineSpecification, and the other three points are in a clockwise direction.<br>
The ordinate origin is the top-left corner of the TextArea.<br>
The value of x is a percentage value relative to the width of the TextArea.<br>
The value of y is a percentage value relative to the height of the TextArea.<br>
The allowed values for x/y: [0, 100].<br>
It is valid only when 'LineNumber' is setting to one specified line number.<br>


### As Json Parameter

| Json Object |	Json Parameter Name | Value Type | Default Value |
| ----------- | ------------------- | ---------- | ------------- |
| LineSpecification | SecondPoint | *int array* | [100, 0] |


**Json Parameter Example**   
```json
{
    "SecondPoint":[10, 10]
}
```

&nbsp;

## ThirdPoint
The third point of the line, which is usually the bottom-right corner.

**Remarks**    
View the texts in 0 degree, the first point is the top-left point of the area defined by LineSpecification, and the other three points are in a clockwise direction.<br>
The ordinate origin is the top-left corner of the TextArea.<br>
The value of x is a percentage value relative to the width of the TextArea.<br>
The value of y is a percentage value relative to the height of the TextArea.<br>
The allowed values for x/y: [0, 100].<br>
It is valid only when 'LineNumber' is setting to one specified line number.<br>


### As Json Parameter

| Json Object |	Json Parameter Name | Value Type | Default Value |
| ----------- | ------------------- | ---------- | ------------- |
| LineSpecification | ThirdPoint | *int array* | [100, 100] |


**Json Parameter Example**   
```json
{
    "ThirdPoint":[0, 10]
}
```

&nbsp;

## FourthPoint
The fourth point of the line, which is usually the bottom-left corner.

**Remarks**    
View the texts in 0 degree, the first point is the top-left point of the area defined by LineSpecification, and the other three points are in a clockwise direction.<br>
The ordinate origin is the top-left corner of the TextArea.<br>
The value of x is a percentage value relative to the width of the TextArea.<br>
The value of y is a percentage value relative to the height of the TextArea.<br>
The allowed values for x/y: [0, 100].<br>
It is valid only when 'LineNumber' is setting to one specified line number.<br>


### As Json Parameter

| Json Object |	Json Parameter Name | Value Type | Default Value |
| ----------- | ------------------- | ---------- | ------------- |
| LineSpecification | FourthPoint | *int array* | [0, 100] |


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
| LineSpecification | CharacterModelName | *string* | "" |

**Json Parameter Example**   
```json
{
    "CharacterModelName":"CharacterModel_Name1"
}
```

&nbsp;

## LineStringLengthRange
Sets the range of string length for each recognized line.

### As Json Parameter
`LineStringLengthRange` as a JSON parameter is a JSON Object with two keys `MinValue` and `MaxValue` for setting the range of string length for each recognized line. Default values will be used if there is no manual setting. 


| Json Object |	Json Parameter Name | Value Type | Default Value |
| ----------- | ------------------- | ---------- | ------------- |
| LineSpecification | LineStringLengthRange | *JSON Object* | `null` |

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
Specifies the regular expression pattern of the string within a line.  

**Remarks**    
Supported regular expressions pattern syntax is same as [`TextRegExPattern`]({{ site.parameters-reference }}label-recognition-parameter/parameter-control.html#textregexpattern).


### As Json Parameter

| Json Object |	Json Parameter Name | Value Type | Default Value |
| ----------- | ------------------- | ---------- | ------------- |
| LineSpecification | LineStringRegExPattern | *string* | "" |

**Json Parameter Example**   
```json
{
    "LineStringRegExPattern":""
}
```

&nbsp;

