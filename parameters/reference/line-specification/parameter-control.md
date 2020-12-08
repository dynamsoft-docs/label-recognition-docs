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
 | [`LineSpecification.CharacterModelName`](#charactermodelname) | Sets the name of a white list of recognizable characters. |
 | [`LineSpecification.LineNumber`](#linenumber) | The line number of the line targeted by the LineSpecification object. |
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
```
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
```
{
    "LineNumber": "1,3,5,7-10"
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
```
{
    "CharacterModelName":"CharacterModel_Name1"
}
```

&nbsp;

## LineStringRegExPattern
Specifies the regular expression pattern of the string within a line.  


### As Json Parameter

| Json Object |	Json Parameter Name | Value Type | Default Value |
| ----------- | ------------------- | ---------- | ------------- |
| LineSpecification | LineStringRegExPattern | *string* | "" |

**Json Parameter Example**   
```
{
    "LineStringRegExPattern":""
}
```

&nbsp;

