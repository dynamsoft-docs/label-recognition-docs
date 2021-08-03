---
layout: default-layout
title: Dynamsoft Label Recognizer Parameter Reference
description: This page shows Dynamsoft Label Recognizer Json Parameters for organization.
keywords: parameter reference
needAutoGenerateSidebar: true
needGenerateH3Content: true
---

# Organizational Json Parameter

 | Parameter Name | Description |
 | -------------- | ----------- | 
 | [`LabelRecognizerParameterArray`](#labelrecognizerparameterarray) | An array of LabelRecognizerParameter objects. |
 | [`ReferenceRegionArray`](#referenceregionarray) | An array of ReferenceRegionArray objects. |
 | [`TextAreaArray `](#textareaarray) | An array of TextArea objects. |
 | [`LineSpecificationArray `](#linespecificationarray) | An array of LineSpecification objects. |
 | [`CharacterModelArray `](#charactermodelarray) | An array of CharacterModel objects. |

 
---


## LabelRecognizerParameterArray
An array of [LabelRecognizerParameter objects](label-recognition-parameter/parameter-control.md).  

**As Json Parameter**

|	Json Key Name | Value Type |
| --------------- | ---------- |
| LabelRecognizerParameterArray | *Object array* |

**Json Parameter Example**   
```json
{
    "LabelRecognizerParameterArray": [
      {
        "Name": "LabelRecognizerParameter1", 
        "ReferenceRegionNameArray": ["Region1"]
      },
      {
        "Name": "LabelRecognizerParameter2", 
        "ReferenceRegionNameArray": ["Region2"]
      }
    ]
}
```



## ReferenceRegionArray
An array of [ReferenceRegion objects](reference-region/parameter-control.md).  

**As Json Parameter**

|	Json Key Name | Value Type |
| --------------- | ---------- |
| ReferenceRegionArray | *Object array* |

**Json Parameter Example**   
```json
{
    "ReferenceRegionArray": [
      {
        "Name": "ReferenceRegion1", 
        "TextAreaNameArray": ["TextArea1"]
      },
      {
        "Name": "ReferenceRegion2", 
        "TextAreaNameArray": ["TextArea2"]
      }
    ]
}
```



## TextAreaArray
An array of [TextArea objects](text-area/parameter-control.md).  

**As Json Parameter**

|	Json Key Name | Value Type |
| --------------- | ---------- |
| TextAreaArray | *Object array* |

**Json Parameter Example**   
```json
{
    "TextAreaArray": [
      {
        "Name": "TextArea1", 
        "LineSpecificationNameArray": ["LineSpecification1"]
      },
      {
        "Name": "TextArea2", 
        "LineSpecificationNameArray": ["LineSpecification2"]
      }
    ]
}
```



## LineSpecificationArray
An array of [LineSpecification objects](line-specification/parameter-control.md).  

**As Json Parameter**

|	Json Key Name | Value Type |
| --------------- | ---------- |
| LineSpecificationArray | *Object array* |

**Json Parameter Example**   
```json
{
    "LineSpecificationArray": [
      {
        "Name": "LineSpecification1", 
        "CharacterModelName": "CharacterModel_Name1"
      },
      {
        "Name": "LineSpecification2", 
        "CharacterModelName": "CharacterModel_Name2"
      }
    ]
}
```



## CharacterModelArray
An array of [CharacterModel objects](character-model/parameter-control.md).  

**As Json Parameter**

|	Json Key Name | Value Type |
| --------------- | ---------- |
| CharacterModelArray | *Object array* |

**Json Parameter Example**   
```json
{
    "CharacterModelArray": [
      {
        "Name": "CharacterModel1", 
        "DirectoryPath": "Path1"
      },
      {
        "Name": "CharacterMode2", 
        "DirectoryPath": "Path2"
      }
    ]
}
```

