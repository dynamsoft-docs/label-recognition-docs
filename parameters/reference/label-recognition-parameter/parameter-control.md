---
layout: default-layout
title: Dynamsoft Label Recognition Parameter Reference for LabelRecognitionParameter Object
description: This page shows Dynamsoft Label Recognition Parameter Reference for LabelRecognitionParameter Object.
keywords: LabelRecognitionParameter, parameter reference, parameter
needAutoGenerateSidebar: true
needGenerateH3Content: false
---

# LabelRecognitionParameter Object

 | Parameter Name | Description |
 | -------------- | ----------- | 
 | [`LabelRecognitionParameter.Name`](#name) | The name of the LabelRecognitionParameter object. |
 | [`LabelRecognitionParameter.BinarizationModes`](binarization-modes.md#binarizationmodes) | 	Sets the mode and priority for binarization. |
 | [`LabelRecognitionParameter.CharacterModelName`](#charactermodelname) | Sets the name of a white list of recognizable characters. |
 | [`LabelRecognitionParameter.GrayscaleTransformationModes`](grayscale-transformation-modes.md#grayscaletransformationmodes) | Sets the mode and priority for the grayscale image conversion. |
 | [`LabelRecognitionParameter.LetterHeightRange`](#letterheightrange) | Sets the range of letter height (in pixel or a percentage value relative to the height of the text area). |
 | [`LabelRecognitionParameter.LinesCount`](#linescount) | Sets the text lines count of the text area. |
 | [`LabelRecognitionParameter.LineStringRegExPattern`](#linestringregexpattern) | Specifies the regular expression pattern of each line string text in current image to recognize. |
 | [`LabelRecognitionParameter.MaxThreadCount`](#maxthreadcount) | Sets the maximum number of threads the algorithm will use to recognize text. |
 | [`LabelRecognitionParameter.ReferenceRegionNameArray`](#referenceregionnamearray) | The name array of the ReferenceRegion object(s). |
 | [`LabelRecognitionParameter.RegionPredetectionModes`](region-predetection-modes.md#regionpredetectionmodes) | Sets the region pre-detection mode for barcodes search. |
 | [`LabelRecognitionParameter.TextRegExPattern`](#textregexpattern) | Specifies the regular expression pattern of the text to recognize. |


---


## Name
The name of the LabelRecognitionParameter object.  

**Remarks**    
It must be a unique name.

### As Json Parameter

| Json Object |	Json Parameter Name | Value Type | Default Value |
| ----------- | ------------------- | ---------- | ------------- |
| LabelRecognitionParameter | Name | *string* | It must be a mandatory setting value. |

**Json Parameter Example**   
```
{
    "Name":"LabelRecognitionParameter1"
}
```

&nbsp;


## CharacterModelName
Sets the name of a white list of recognizable characters.  

**Remarks**    
If you set a character model, the result will only contain characters within the model.  
All TextArea Objects without CharacterModelName set will be set from this setting.


### As Json Parameter

| Json Object |	Json Parameter Name | Value Type | Default Value |
| ----------- | ------------------- | ---------- | ------------- |
| LabelRecognitionParameter | CharacterModelName | *string* | "" |

**Json Parameter Example**   
```
{
    "CharacterModelName":"CharacterModel_Name1"
}
```

&nbsp;

## LetterHeightRange
Sets the range of letter height (in pixel or a percentage value relative to the height of the text area).  

**Remarks**    
Format: [MinHeight, MaxHeight, ByPercentage]  
The allowed values for MinHeight/MaxHeight:  
ByPercentage=0, [1, 0x7fffffff]  
ByPercentage=1, [1, 100]  
The allowed values for ByPercentage: [0,1]  
All TextArea Objects without LetterHeightRange set will be set from this setting.


### As Json Parameter

| Json Object |	Json Parameter Name | Value Type | Default Value |
| ----------- | ------------------- | ---------- | ------------- |
| LabelRecognitionParameter | LetterHeightRange | *int array* | [1,100,1] |

**Json Parameter Example**   
```
{
    "LetterHeightRange":[40,60,1]
}
```

&nbsp;


## LinesCount
Sets the text lines count of the text area.

**Remarks**   
0: line count is not certain.  
All TextArea Objects without LinesCount set will be set from this setting.


### As Json Parameter

| Json Object |	Json Parameter Name | Value Type | Value Range | Default Value |
| ----------- | ------------------- | ---------- | ----------- | ------------- |
| LabelRecognitionParameter | LinesCount | *int* | [0, 200] | 0 |


**Json Parameter Example**   
```
{
    "LinesCount":1
}
```

&nbsp;

## LineStringRegExPattern
Specifies the regular expression pattern of each line string text in current image to recognize.  

**Remarks**    
All TextArea Objects without LineStringRegExPattern set will be set from this setting.


### As Json Parameter

| Json Object |	Json Parameter Name | Value Type | Default Value |
| ----------- | ------------------- | ---------- | ------------- |
| LabelRecognitionParameter | LineStringRegExPattern | *string* | "" |

**Json Parameter Example**   
```
{
    "LineStringRegExPattern":""
}
```

&nbsp;

## MaxThreadCount
Sets the maximum number of threads the algorithm will use to recognize text.


### As Json Parameter

| Json Object |	Json Parameter Name | Value Type | Value Range | Default Value |
| ----------- | ------------------- | ---------- | ----------- | ------------- |
| LabelRecognitionParameter | MaxThreadCount | *int* | [1, 4] | 4 |


**Json Parameter Example**   
```
{
    "MaxThreadCount":1
}
```

&nbsp;

## ReferenceRegionNameArray
The name array of the ReferenceRegion object(s). 

**Remarks**   
An array item is a name of any available `ReferenceRegion`.    

### As Json Parameter

| Json Object |	Json Parameter Name |	Value Type | Default Value |
| ----------- | ------------------- | ---------- | ------------- |
| LabelRecognitionParameter | ReferenceRegionNameArray | *string Array* | `null` |


**Json Parameter Example**   
```
{
    "ReferenceRegionNameArray":[
        "Region1",
        "Region2"
    ]
}
```
&nbsp;

## TextRegExPattern
Specifies the regular expression pattern of the text to recognize.  

**Remarks**    
All TextArea Objects without TextRegExPattern set will be set from this setting.


### As Json Parameter

| Json Object |	Json Parameter Name | Value Type | Default Value |
| ----------- | ------------------- | ---------- | ------------- |
| LabelRecognitionParameter | TextRegExPattern | *string* | "" |

**Json Parameter Example**   
```
{
    "TextRegExPattern":""
}
```

&nbsp;

