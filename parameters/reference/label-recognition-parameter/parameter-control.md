---
layout: default-layout
title: Dynamsoft Label Recognizer Parameter Reference for LabelRecognizerParameter Object
description: This page shows Dynamsoft Label Recognizer Parameter Reference for LabelRecognizerParameter Object.
keywords: LabelRecognizerParameter, parameter reference, parameter
needAutoGenerateSidebar: true
needGenerateH3Content: true
---

# LabelRecognizerParameter Object

 | Parameter Name | Description |
 | -------------- | ----------- | 
 | [`LabelRecognizerParameter.Name`](#name) | The name of the LabelRecognizerParameter object. |
 | [`LabelRecognizerParameter.CharacterModelName`](#charactermodelname) | Sets the name of a white list of recognizable characters. |
 | [`LabelRecognizerParameter.DictionaryCorrectionThresholds`](#dictionarycorrectionthresholds) | Sets the threshold of dictionary error correction. |
 | [`LabelRecognizerParameter.DictionaryPath`](#dictionarypath) | Sets the path of the dictionary file. |
 | [`LabelRecognizerParameter.LetterHeightRange`](#letterheightrange) | Sets the range of letter height (in pixel or a percentage value relative to the height of the text area). |
 | [`LabelRecognizerParameter.LineStringLengthRange`](#linestringlengthrange) | Sets the range of string length for each recognized line. |
 | [`LabelRecognizerParameter.LineStringRegExPattern`](#linestringregexpattern) | Specifies the regular expression pattern of each line string text in current image to recognize. |
 | [`LabelRecognizerParameter.MaxLineCharacterSpacing`](#maxlinecharacterspacing) | Sets the maximum spacing between characters treated as one line. |
 | [`LabelRecognizerParameter.MaxThreadCount`](#maxthreadcount) | Sets the maximum number of threads the algorithm will use to recognize text. |
 | [`LabelRecognizerParameter.Pages`](#pages) | Sets the specific pages or the range of pages of a file (.tiff or .pdf) for label recognition. |
 | [`LabelRecognizerParameter.ReferenceRegionNameArray`](#referenceregionnamearray) | The name array of the ReferenceRegion object(s). |
 | [`LabelRecognizerParameter.TextStringLengthRange`](#textstringlengthrange) | Sets the range of string length for each recognized text area. |
 | [`LabelRecognizerParameter.TextRegExPattern`](#textregexpattern) | Specifies the regular expression pattern of the text to recognize. |
 | [`LabelRecognizerParameter.Timeout`](#timeout) | Sets the maximum amount of time (in milliseconds) that should be spent searching for labels on each page. |

---


## Name
The name of the LabelRecognizerParameter object.  

**Remarks**    
It must be a unique name.

**As Json Parameter**

| Json Object |	Json Parameter Name | Value Type | Default Value |
| ----------- | ------------------- | ---------- | ------------- |
| LabelRecognizerParameter | Name | *string* | It must be a mandatory setting value. |

**Json Parameter Example**   
```json
{
    "Name":"LabelRecognizerParameter1"
}
```


## CharacterModelName
Sets the name of a white list of recognizable characters.  

**Remarks**    
If you set a character model, the result will only contain characters within the model.  
All TextArea Objects without CharacterModelName set will be set from this setting.


**As Json Parameter**

| Json Object |	Json Parameter Name | Value Type | Default Value |
| ----------- | ------------------- | ---------- | ------------- |
| LabelRecognizerParameter | CharacterModelName | *string* | "" |

**Json Parameter Example**   
```json
{
    "CharacterModelName":"CharacterModel_Name1"
}
```


## LetterHeightRange
Sets the range of letter height (in pixel or a percentage value relative to the height of the text area).  

**Remarks**    
Format: [MinHeight, MaxHeight, ByThousandth]  
The allowed values for MinHeight/MaxHeight:  
ByThousandth=0, [1, 0x7fffffff]  
ByThousandth=1, [1, 1000]  
The allowed values for ByThousandth: [0,1]  
All TextArea Objects without LetterHeightRange set will be set from this setting.


**As Json Parameter**

| Json Object |	Json Parameter Name | Value Type | Default Value |
| ----------- | ------------------- | ---------- | ------------- |
| LabelRecognizerParameter | LetterHeightRange | *int array* | [1,1000,1] |

**Json Parameter Example**   
```json
{
    "LetterHeightRange":[40,60,1]
}
```


## LineStringLengthRange
Sets the range of string length for each recognized line.

**As Json Parameter**
`LineStringLengthRange` as a JSON parameter is a JSON Object with two keys `MinValue` and `MaxValue` for setting the range of string length for each recognized line. Default values will be used if there is no manual setting. 


| Json Object |	Json Parameter Name | Value Type | Default Value |
| ----------- | ------------------- | ---------- | ------------- |
| LabelRecognizerParameter | LineStringLengthRange | *JSON Object* | `null` |

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
Specifies the regular expression pattern of each line string text in current image to recognize.  

**Remarks**    
 - All TextArea Objects without LineStringRegExPattern set will be set from this setting.
 - Supported regular expressions pattern syntax is same as [`TextRegExPattern`](#textregexpattern).


**As Json Parameter**

| Json Object |	Json Parameter Name | Value Type | Default Value |
| ----------- | ------------------- | ---------- | ------------- |
| LabelRecognizerParameter | LineStringRegExPattern | *string* | "" |

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
- All TextArea Objects without MaxLineCharacterSpacing set will be set from this setting.

**As Json Parameter**

| Json Object |	Json Parameter Name | Value Type | Value Range | Default Value |
| ----------- | ------------------- | ---------- | ----------- | ------------- |
| LabelRecognizerParameter | MaxLineCharacterSpacing | *int* | [0, 0x7fffffff] | 0 |


**Json Parameter Example**   
```json
{
    "MaxLineCharacterSpacing":200
}
```



## MaxThreadCount
Sets the maximum number of threads the algorithm will use to recognize text.


**As Json Parameter**

| Json Object |	Json Parameter Name | Value Type | Value Range | Default Value |
| ----------- | ------------------- | ---------- | ----------- | ------------- |
| LabelRecognizerParameter | MaxThreadCount | *int* | [1, 4] | 4 |


**Json Parameter Example**   
```json
{
    "MaxThreadCount":1
}
```



## Pages
Sets the specific pages or the range of pages of a file (.tiff or .pdf) for label recognition.

**Remarks**   
1. The value is 0-based;
2. "" represents all pages.


**As Json Parameter**

| Json Object |	Json Parameter Name | Value Type | Value Range | Default Value |
| ----------- | ------------------- | ---------- | ----------- | ------------- |
| LabelRecognizerParameter | Pages | *string* | A string of one or more of the following data, separated by commas:<br>1. One int value which represents a specified page index;<br>2. One Expression, start index and stop index connected with ""-"", which represents a specified page index range; | "" |


**Json Parameter Example**   
```json
{
    "Pages": "0,3,5,7-10"
}
```




## ReferenceRegionNameArray
The name array of the ReferenceRegion object(s). 

**Remarks**   
An array item is a name of any available `ReferenceRegion`.    

**As Json Parameter**

| Json Object |	Json Parameter Name |	Value Type | Default Value |
| ----------- | ------------------- | ---------- | ------------- |
| LabelRecognizerParameter | ReferenceRegionNameArray | *string Array* | `null` |


**Json Parameter Example**   
```json
{
    "ReferenceRegionNameArray":[
        "Region1",
        "Region2"
    ]
}
```

## TextStringLengthRange
Sets the range of string length for each recognized text area.

**As Json Parameter**
`TextStringLengthRange` as a JSON parameter is a JSON Object with two keys `MinValue` and `MaxValue` for setting the range of string length for each recognized text area. Default values will be used if there is no manual setting. 


| Json Object |	Json Parameter Name | Value Type | Default Value |
| ----------- | ------------------- | ---------- | ------------- |
| LabelRecognizerParameter | TextStringLengthRange | *JSON Object* | `null` |

**Remarks** 
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
 - All TextArea Objects without TextRegExPattern set will be set from this setting.
 - Supported regular expressions pattern syntax：

| characters | matches |
| ---------- | ------- |
| \d         | a decimal digit character (same as "[0-9]"). |
| \D         | any character that is not a decimal digit character (same as "[^0-9]"). |
| \s         | a whitespace character (same as " " or "[ ]"). |
| \S         | any character that is not a whitespace character (same as "[^ ]"). |
| \w         | an alphanumeric or underscore character (same as "[0-9A-z_]"). |
| \W         | any character that is not an alphanumeric or underscore character (same as "[^0-9A-z_]"). |
| [class]    | any character that is part of the class. |
| [^class]   | any character that is not part of the class. |
| *          | The preceding atom is matched 0 or more times. |
| +          | The preceding atom is matched 1 or more times. |
| ?          | The preceding atom is optional (matched either 0 times or once). |
| (subpattern) | Groups a sequence of subpatterns as a matching atom. |
| {`n`}        | The preceding atom is matched exactly `n` times. |
| {`min`,}     | The preceding atom is matched `min` or more times. |
| {,`max`}     | The preceding atom is matched at least 0 times, but not more than `max`. |
| {`min`,`max`}  | The preceding atom is matched at least `min` times, but not more than `max`. |
| {(`n`)}       | The preceding atom matches exactly `n` characters. |
| {(`min`,)}    | The preceding atom matches `min` or more characters. |
| {(,`max`)}    | The preceding atom matches at least 0 characters, but not more than `max`. |
| {(`min`,`max`)} | The preceding atom matches at least `min` characters, but not more than `max`. |
| [(`string1`,`string2`,...)] | any case insensitive string that is one of the listed strings separated by commas (,). For example: [(CAN,USA)] matches CAN, USA or can. |
| [(`minnumericstring`-`maxnumericstring`)] | a numeric string that is between `minnumericstring` and `maxnumericstring`. For example: [(01-12)] matches 01, 02, 03, ... until 12). |


**As Json Parameter**

| Json Object |	Json Parameter Name | Value Type | Default Value |
| ----------- | ------------------- | ---------- | ------------- |
| LabelRecognizerParameter | TextRegExPattern | *string* | "" |

**Json Parameter Example**   
```json
{
    "TextRegExPattern":""
}
```



## Timeout
Sets the maximum amount of time (in milliseconds) that should be spent searching for labels on each page. It does not include the time taken to load/decode an image (Tiff, PNG, etc) from disk into memory.   

**Remarks**   
If you want to stop searching for labels after a specified amount of time, you can use this parameter to set a timeout.

**As Json Parameter**

| Json Object |	Json Parameter Name |	Value Type | Value Range | Default Value |
| ----------- | ------------------- | ---------- | ----------- | ------------- |
| LabelRecognizerParameter | Timeout | *int* | [0,0x7fffffff] | 10000 |

**Json Parameter Example**   
```json
{
    "Timeout":10000
}
```





## DictionaryPath
Sets the path of the dictionary file.

**Remarks**
If the parameter is not defined in `TextArea`, it will be inherited. Otherwise, the value will be overwritten.

**As Json Parameter**


| Json Object |	Json Parameter Name | Value Type | Default Value |
| ----------- | ------------------- | ---------- | ------------- |
| LabelRecognizerParameter | DictionaryPath | *string* | "" |

**Json Parameter Example**   
```json
{
    "DictionaryPath":"D:\\DictModel\\nutrition.txt"
}
```




## DictionaryCorrectionThresholds
Sets the threshold of dictionary error correction.

**Remarks**   
It supports segmentation threshold. If the parameter is not defined in `TextArea`, it will be inherited. Otherwise, the value will be overwritten.

**As Json Parameter**

| Json Object |	Json Parameter Name |	Value Type | Default Value |
| ----------- | ------------------- | ---------- | ------------- |
| LabelRecognizerParameter | DictionaryCorrectionThresholds | *Array* | `null` |

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
