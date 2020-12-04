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
 | [`LabelRecognitionParameter.MaxThreadCount`](#maxthreadcount) | Sets the maximum number of threads the algorithm will use to recognize text. |
 | [`LabelRecognitionParameter.BinarizationModes`](binarization-modes.md#binarizationmodes) | 	Sets the mode and priority for binarization. |
 | [`LabelRecognitionParameter.GrayscaleTransformationModes`](grayscale-transformation-modes.md#grayscaletransformationmodes) | Sets the mode and priority for the grayscale image conversion. |
 | [`LabelRecognitionParameter.RegionPredetectionModes`](region-predetection-modes.md#regionpredetectionmodes) | Sets the region pre-detection mode for barcodes search. |
 | [`LabelRecognitionParameter.ReferenceRegionNameArray`](#ReferenceRegionNameArray) | An array of the search base regions. |
 | [`LabelRecognitionParameter.TextRegExPattern`](#TextRegExPattern) | Specifies the regular expression pattern of the text to recognize. |
 | [`LabelRecognitionParameter.LineStringRegExPattern`](#LineStringRegExPattern) | Specifies the regular expression pattern of each line string text in current image to recognize. |
 | [`LabelRecognitionParameter.LetterHeightRange`](#LetterHeightRange) | Sets the range of letter height (in pixel or a percentage value relative to the height of the text area). |
 | [`LabelRecognitionParameter.CharacterModelName`](#CharacterModelName) | Sets the name of a white list of recognizable characters. |
 | [`LabelRecognitionParameter.LinesCount`](#LinesCount) | Sets the text lines count of the text area. |

---


## Name
The name of the LabelRecognitionParameter object.  

**Remarks**    
It must be a unique name.

### As Json Parameter

| Json Object |	Json Parameter Name | Value Type | Default Value |
| ----------- | ------------------- | ---------- | ------------- |
| ImageParameter | Name | *string* | It must be a mandatory setting value. |

**Json Parameter Example**   
```
{
    "Name":"ImageParameter1"
}
```


&nbsp;


