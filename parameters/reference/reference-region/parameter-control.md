---
layout: default-layout
title: Dynamsoft Label Recognizer Parameter Reference for ReferenceRegion Object
description: This page shows Dynamsoft Label Recognizer Parameter Reference for ReferenceRegion Object.
keywords: ReferenceRegion, parameter reference, parameter
needAutoGenerateSidebar: true
needGenerateH3Content: true
---

# ReferenceRegion Object

 | Parameter Name | Description |
 | -------------- | ----------- | 
 | [`ReferenceRegion.Name`](#name) | The name of the ReferenceRegion object. |
 | [`ReferenceRegion.TextAreaNameArray `](#textareanamearray) | Specifies the name array of the TextAreas which is relative to current reference region. |

---


## Name
The name of the ReferenceRegion object.  

**Remarks**    
It must be a unique name.

**As Json Parameter**

| Json Object |	Json Parameter Name | Value Type | Default Value |
| ----------- | ------------------- | ---------- | ------------- |
| ReferenceRegion | Name | *string* | It must be a mandatory setting value. |

**Json Parameter Example**   
```json
{
    "Name":"ReferenceRegion1"
}
```





## TextAreaNameArray
Specifies the name array of the TextArea objects which is relative to current reference region. 

**Remarks**   
An array item is a name of any available `TextArea`.    

**As Json Parameter**

| Json Object |	Json Parameter Name |	Value Type | Default Value |
| ----------- | ------------------- | ---------- | ------------- |
| ReferenceRegion | TextAreaNameArray | *string Array* | `null` |


**Json Parameter Example**   
```json
{
    "TextAreaNameArray":[
        "TextArea1",
        "TextArea2"
    ]
}
```


