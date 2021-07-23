---
layout: default-layout
title: Dynamsoft Label Recognizer Parameter Reference - InferenceSetting Object
description: This page shows Dynamsoft Label Recognizer Parameter Reference - InferenceSetting Object.
keywords: parameter reference, parameters, InferenceSetting
needAutoGenerateSidebar: true
needGenerateH3Content: true
---


# Dynamsoft Label Recognizer SDK - InferenceSetting Object

 | Parameter Name | Description |
 | -------------- | ----------- | 
 | [`InferenceSetting.Name`](#name) | The name of the InferenceSetting object. |
 | [`InferenceSetting.FilteringConditions`](#filteringconditions) | 	Sets the filtering conditions of the InferenceSetting object. |
 | [`InferenceSetting.ReferenceSettings`](#referencesettings) | Sets the reference settings of the InferenceSetting object. |


## Name
The name of the InferenceSetting object.  

**Remarks**    
It must be a unique name. If it is referenced in a `TextArea` object through parameter [InferenceSettingName](../text-area/parameter-control.md#inferencesettingname), the TextArea object became a inference area, then DLR will use the relative position characteristics between text blocks to calculate the target label position. 


**As Json Parameter**

| Json Object |	Json Parameter Name | Value Type | Default Value |
| ----------- | ------------------- | ---------- | ------------- |
| InferenceSetting | Name | *string* | It must be a mandatory setting value. |

**Json Parameter Example**   
```json
{
    "Name":"InferenceSetting1"
}
```



## FilteringConditions
The filtering conditions of the InferenceSetting object. It is used to determine whether the inference area is valid or not.

### AreaType
Sets the condition level of the inference area.

**As Json Parameter**

| Json Object |	Json Parameter Name | Value Type | Value Range | Default Value |
| ----------- | ------------------- | ---------- | ----------- | ------------- |
| FilteringConditions | AreaType | *string* | "AT_ENTIRE"<br>"AT_LINE_ALL"<br>"AT_LINE_ANY"<br>"AT_LINE_N"| "AT_ENTIRE" |

- AT_ENTIRE: conditions on the oncatenated string
- AT_LINE_ALL: conditions on each of the line string
- AT_LINE_ANY: conditions on any of the line string
- AT_LINE_N: conditions on each specified line string

**Json Parameter Example**   
```json
{
    "FilteringConditions":
    {
        "AreaType": "AT_ENTIRE",
        "RegEx": ".*b.*b.*b.*"
    },

}
```



### RegEx
Sets the regular expression condition on the specified area. This parameter only takes effect when the `AreaType` parameter is specified as "AT_ENTIRE" OR "AT_LINE_ALL" OR "AT_LINE_ANY".

**As Json Parameter**

| Json Object |	Json Parameter Name | Value Type | Value Range | Default Value |
| ----------- | ------------------- | ---------- | ----------- | ------------- |
| FilteringConditions | RegEx | *string* | | "" |

**Json Parameter Example**   
```json
{
    "FilteringConditions":
    {
        "AreaType": "AT_ENTIRE",
        "RegEx": ".*b.*b.*b.*"
    },

}
```





### LineArray
Sets the condition on each specified line. This parameter only takes effect when the `AreaType` parameter is specified as "AT_LINE_N".

- LineNumber: A string of one or more of the following data,separated by commas:<br>1. One int value which represents a specified line index;<br>2. One Expression, start index and stop index connected with ""-"", which represents a specified line index range;<br>3. The value is 1-based.
- LineRegEx: The regular regression on the lines sepcified by `LineNumber`.

**As Json Parameter**

| Json Object |	Json Parameter Name | Value Type | Default Value |
| ----------- | ------------------- | ---------- | ------------- |
| FilteringConditions | LineArray | *Array* | null |

**Json Parameter Example**   
```json
{
    "FilteringConditions":
    {
        "AreaType": "AT_LINE_N",
        "LineArray":
        [
            {
                "LineNumber": "1,3,5-7",
                "LineRegEx":"Nutrition"
            }
        ]
    },
    ......
}
```





## ReferenceSettings
The reference settings of the InferenceSetting object. It is used to indicate which parts in the inference area should be referenced by the target Label.

### TargetTextAreaNameArray
Sets the target area where the coordinates need to be inferred.

**As Json Parameter**

| Json Object |	Json Parameter Name | Value Type | Default Value |
| ----------- | ------------------- | ---------- | ------------- |
| ReferenceSettings | TargetTextAreaNameArray | *Array* | null |

**Json Parameter Example**   
```json
{
    "ReferenceSettings":
    [
        {
            "TargetTextAreaNameArray":["TA_1"],
            "ReferenceAreaType": "RAT_TEXT_LINE",
            "LineNumber": "1,3-5",	
            "LineRegEx": "Sodium[(\w| )]*",	
            "RestrictedInInferenceArea": 1  
        }
    ]

}
```



### ReferenceAreaType
Sets the reference source type.

**As Json Parameter**

| Json Object |	Json Parameter Name | Value Type | Value Range | Default Value |
| ----------- | ------------------- | ---------- | ----------- | ------------- |
| ReferenceSettings | ReferenceAreaType | *string* | "RAT_TEXT_AREA"<br>"RAT_TEXT_LINE"| "RAT_TEXT_AREA" |

- RAT_TEXT_AREA: The source postion is the quadrilateral coordinates of the text area.
- RAT_TEXT_LINE: The source postion is the quadrilateral coordinates of the specified line(s).

**Json Parameter Example**   
```json
{
    "ReferenceSettings":
    [
        {
            "TargetTextAreaNameArray":["TA_1"],
            "ReferenceAreaType": "RAT_TEXT_LINE",
            "LineNumber": "1,3-5",	
            "LineRegEx": "Sodium[(\w| )]*",	
            "RestrictedInInferenceArea": 1  
        }
    ]

}
```



### LineNumber
Sets the source line(s) by specifying the line numbers. It is optional and only takes effect when the `ReferenceAreaType` parameter is specified as "RAT_TEXT_LINE". If both `LineNumber` and `LineRegEx` are specified, `LineNumber` has a higher priority than `LineRegEx`.

**As Json Parameter**

| Json Object |	Json Parameter Name | Value Type | Value Range | Default Value |
| ----------- | ------------------- | ---------- | ----------- | ------------- |
| ReferenceSettings | LineNumber | *string* | A string of one or more of the following data,separated by commas:<br>1. One int value which represents a specified line index;<br>2. One Expression, start index and stop index connected with ""-"", which represents a specified line index range;<br>3. The value is 1-based.| "" |


**Json Parameter Example**   
```json
{
    "ReferenceSettings":
    [
        {
            "TargetTextAreaNameArray":["TA_1"],
            "ReferenceAreaType": "RAT_TEXT_LINE",
            "LineNumber": "1,3-5",	
            "LineRegEx": "Sodium[(\w| )]*",	
            "RestrictedInInferenceArea": 1  
        }
    ]

}
```



### LineRegEx
Sets the source line(s) where the text satisfies the regular expression. It is optional and only takes effect when the `ReferenceAreaType` parameter is specified as "RAT_TEXT_LINE". If both `LineNumber` and `LineRegEx` are specified, `LineNumber` has a higher priority than `LineRegEx`.

**As Json Parameter**

| Json Object |	Json Parameter Name | Value Type | Default Value |
| ----------- | ------------------- | ---------- | ------------- |
| ReferenceSettings | LineRegEx | *string* | "" |


**Json Parameter Example**   
```json
{
    "ReferenceSettings":
    [
        {
            "TargetTextAreaNameArray":["TA_1"],
            "ReferenceAreaType": "RAT_TEXT_LINE",
            "LineNumber": "1,3-5",	
            "LineRegEx": "Sodium[(\w| )]*",	
            "RestrictedInInferenceArea": 1  
        }
    ]

}
```



### RestrictedInInferenceArea
Set whether the target text area(s) is located inside the Inference Area or not. If the value is specified as 1, the target text area coordinates will be calculated by intersecting with the inference area.

**As Json Parameter**

| Json Object |	Json Parameter Name | Value Type | Default Value |
| ----------- | ------------------- | ---------- | ------------- |
| ReferenceSettings | RestrictedInInferenceArea | *int* | 0 |


**Json Parameter Example**   
```json
{
    "ReferenceSettings":
    [
        {
            "TargetTextAreaNameArray":["TA_1"],
            "ReferenceAreaType": "RAT_TEXT_LINE",
            "LineNumber": "1,3-5",	
            "LineRegEx": "Sodium[(\w| )]*",	
            "RestrictedInInferenceArea": 1  
        }
    ]

}
```

