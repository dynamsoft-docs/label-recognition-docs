---
layout: default-layout
title: Dynamsoft Label Recognition Parameter Reference for ReferenceRegion Object
description: This page shows Dynamsoft Label Recognition Parameter Reference for ReferenceRegion Object.
keywords: ReferenceRegion, parameter reference, parameter
needAutoGenerateSidebar: true
needGenerateH3Content: false
---

# ReferenceRegion Object

 | Parameter Name | Description |
 | -------------- | ----------- | 
 | [`ReferenceRegion.Name`](#name) | The name of the ReferenceRegion object. |
 | [`ReferenceRegion.FirstPoint`](#firstpoint) | The first point of the reference region, which is usually the top-left corner. |
 | [`ReferenceRegion.SecondPoint`](#secondpoint) | The second point of the reference region, which is usually the top-right corner. |
 | [`ReferenceRegion.ThirdPoint`](#thirdpoint) | The third point of the reference region, which is usually the bottom-right corner. |
 | [`ReferenceRegion.FourthPoint`](#fourthpoint) | The fourth point of the reference region, which is usually the bottom-left  corner. |
 | [`ReferenceRegion.MeasuredByPercentage`](#measuredbypercentage) | Sets whether or not to use percentages to measure the coordinate. |
 | [`ReferenceRegion.TextAreaNameArray `](#textareanamearray ) | Specifies the name array of the TextAreas which is relative to current reference region. |

---


## Name
The name of the ReferenceRegion object.  

**Remarks**    
It must be a unique name.

### As Json Parameter

| Json Object |	Json Parameter Name | Value Type | Default Value |
| ----------- | ------------------- | ---------- | ------------- |
| ReferenceRegion | Name | *string* | It must be a mandatory setting value. |

**Json Parameter Example**   
```
{
    "Name":"ReferenceRegion1"
}
```

&nbsp;


## FirstPoint
The first point of the reference region, which is usually the top-left corner.

**Remarks**    
View the texts in 0 degree, the first point is the top-left point of the area defined by ReferenceRegion, and the other three points are in a clockwise direction.<br>
The allowed values for x/y:<br>
MeasuredByPercentage=0:  [0, 0x7fffffff]
MeasuredByPercentage=1: [0, 100]


### As Json Parameter

| Json Object |	Json Parameter Name | Value Type | Default Value |
| ----------- | ------------------- | ---------- | ------------- |
| ReferenceRegion | FirstPoint | *int array* | [0, 0] |


**Json Parameter Example**   
```
{
    "FirstPoint":[0, 10]
}
```

&nbsp;

## SecondPoint
The second point of the reference region, which is usually the top-right corner.

**Remarks**    
View the texts in 0 degree, the first point is the top-left point of the area defined by ReferenceRegion, and the other three points are in a clockwise direction.<br>
The allowed values for x/y:<br>
MeasuredByPercentage=0:  [0, 0x7fffffff]
MeasuredByPercentage=1: [0, 100]


### As Json Parameter

| Json Object |	Json Parameter Name | Value Type | Default Value |
| ----------- | ------------------- | ---------- | ------------- |
| ReferenceRegion | SecondPoint | *int array* | [100, 0] |


**Json Parameter Example**   
```
{
    "SecondPoint":[10, 10]
}
```

&nbsp;

## ThirdPoint
The third point of the reference region, which is usually the bottom-right corner.

**Remarks**    
View the texts in 0 degree, the first point is the top-left point of the area defined by ReferenceRegion, and the other three points are in a clockwise direction.<br>
The allowed values for x/y:<br>
MeasuredByPercentage=0:  [0, 0x7fffffff]
MeasuredByPercentage=1: [0, 100]


### As Json Parameter

| Json Object |	Json Parameter Name | Value Type | Default Value |
| ----------- | ------------------- | ---------- | ------------- |
| ReferenceRegion | ThirdPoint | *int array* | [100, 100] |


**Json Parameter Example**   
```
{
    "ThirdPoint":[0, 10]
}
```

&nbsp;

## FourthPoint
The fourth point of the reference region, which is usually the bottom-left corner.

**Remarks**    
View the texts in 0 degree, the first point is the top-left point of the area defined by ReferenceRegion, and the other three points are in a clockwise direction.<br>
The allowed values for x/y:<br>
MeasuredByPercentage=0:  [0, 0x7fffffff]
MeasuredByPercentage=1: [0, 100]


### As Json Parameter

| Json Object |	Json Parameter Name | Value Type | Default Value |
| ----------- | ------------------- | ---------- | ------------- |
| ReferenceRegion | FourthPoint | *int array* | [0, 100] |


**Json Parameter Example**   
```
{
    "FourthPoint":[10, 20]
}
```

&nbsp;

## MeasuredByPercentage
Sets whether or not to use percentages to measure the coordinate.

**Remarks**   
- 0: not by percentage<br>
- 1: by percentage

### As Json Parameter

| Json Object |	Json Parameter Name | Value Type | Value Range | Default Value |
| ----------- | ------------------- | ---------- | ----------- | ------------- |
| ReferenceRegion | MeasuredByPercentage | *int* | [0, 1] | 1 |


**Json Parameter Example**   
```
{
    "MeasuredByPercentage":0
}
```

&nbsp;


## TextAreaNameArray
Specifies the name array of the TextArea objects which is relative to current reference region. 

**Remarks**   
An array item is a name of any available `TextArea`.    

### As Json Parameter

| Json Object |	Json Parameter Name |	Value Type | Default Value |
| ----------- | ------------------- | ---------- | ------------- |
| ReferenceRegion | TextAreaNameArray | *string Array* | `null` |


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

