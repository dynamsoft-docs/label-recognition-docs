---
layout: default-layout
title: Dynamsoft Label Recognition Parameter Reference - Main Page
description: Dynamsoft Label Recognition Parameter Reference - Main Page
keywords: parameter reference, parameters, LabelRecognitionParameter, ReferenceRegion, TextArea
needAutoGenerateSidebar: true
needGenerateH3Content: true
breadcrumbText: Reference
---


# Dynamsoft Label Recognition SDK - Parameters


## LabelRecognitionParameter Object

 | Parameter Name | Description |
 | -------------- | ----------- | 
 | [`LabelRecognitionParameter.Name`](label-recognition-parameter/parameter-control.md#name) | The name of the LabelRecognitionParameter object. |
 | [`LabelRecognitionParameter.BinarizationModes`](label-recognition-parameter/binarization-modes.md#binarizationmodes) | 	Sets the mode and priority for binarization. |
 | [`LabelRecognitionParameter.CharacterModelName`](label-recognition-parameter/parameter-control.md#charactermodelname) | Sets the name of a white list of recognizable characters. |
 | [`LabelRecognitionParameter.GrayscaleTransformationModes`](label-recognition-parameter/grayscale-transformation-modes.md#grayscaletransformationmodes) | Sets the mode and priority for the grayscale image conversion. |
 | [`LabelRecognitionParameter.LetterHeightRange`](label-recognition-parameter/parameter-control.md#letterheightrange) | Sets the range of letter height (in pixel or a percentage value relative to the height of the text area). |
 | [`LabelRecognitionParameter.LinesCount`](label-recognition-parameter/parameter-control.md#linescount) | Sets the text lines count of the text area. |
 | [`LabelRecognitionParameter.LineStringRegExPattern`](label-recognition-parameter/parameter-control.md#linestringregexpattern) | Specifies the regular expression pattern of each line string text in current image to recognize. |
 | [`LabelRecognitionParameter.MaxThreadCount`](label-recognition-parameter/parameter-control.md#maxthreadcount) | Sets the maximum number of threads the algorithm will use to recognize text. |
 | [`LabelRecognitionParameter.ReferenceRegionNameArray`](label-recognition-parameter/parameter-control.md#referenceregionnamearray) | The name array of the ReferenceRegion object(s). |
 | [`LabelRecognitionParameter.RegionPredetectionModes`](label-recognition-parameter/region-predetection-modes.md#regionpredetectionmodes) | Sets the region pre-detection mode for barcodes search. |
 | [`LabelRecognitionParameter.TextRegExPattern`](label-recognition-parameter/parameter-control.md#textregexpattern) | Specifies the regular expression pattern of the text to recognize. |


## ReferenceRegion Object

 | Parameter Name | Description |
 | -------------- | ----------- | 
 | [`ReferenceRegion.Name`](reference-region/parameter-control.md#name) | The name of the ReferenceRegion object. |
 | [`ReferenceRegion.FirstPoint`](reference-region/parameter-control.md#firstpoint) | The first point of the reference region, which is usually the top-left corner. |
 | [`ReferenceRegion.SecondPoint`](reference-region/parameter-control.md#secondpoint) | The second point of the reference region, which is usually the top-right corner. |
 | [`ReferenceRegion.ThirdPoint`](reference-region/parameter-control.md#thirdpoint) | The third point of the reference region, which is usually the bottom-right corner. |
 | [`ReferenceRegion.FourthPoint`](reference-region/parameter-control.md#fourthpoint) | The fourth point of the reference region, which is usually the bottom-left  corner. |
 | [`ReferenceRegion.MeasuredByPercentage`](reference-region/parameter-control.md#measuredbypercentage) | Sets whether or not to use percentages to measure the coordinate. |
 | [`ReferenceRegion.TextAreaNameArray `](reference-region/parameter-control.md#textareanamearray ) | Specifies the name array of the TextAreas which is relative to current reference region. |

## TextArea Object

 | Parameter Name | Description |
 | -------------- | ----------- | 
 | [`TextArea.Name`](text-area/parameter-control.md#name) | The name of the TextArea object. |
 | [`TextArea.FirstPoint`](text-area/parameter-control.md#firstpoint) | The first point of the text area, which is usually the top-left corner. |
 | [`TextArea.SecondPoint`](text-area/parameter-control.md#secondpoint) | The second point of the text area, which is usually the top-right corner. |
 | [`TextArea.ThirdPoint`](text-area/parameter-control.md#thirdpoint) | The third point of the text area, which is usually the bottom-right corner. |
 | [`TextArea.FourthPoint`](text-area/parameter-control.md#fourthpoint) | The fourth point of the text area, which is usually the bottom-left  corner. |
 | [`TextArea.CharacterModelName`](text-area/parameter-control.md#charactermodelname) | Sets the name of a white list of recognizable characters. |
 | [`TextArea.GrayscaleTransformationModes`](text-area/parameter-control.md#grayscaletransformationmodes) | Sets the mode and priority for the grayscale image conversion. |
 | [`TextArea.LetterHeightRange`](text-area/parameter-control.md#letterheightrange) | Sets the range of letter height (in pixel or a percentage value relative to the height of the text area). |
 | [`TextArea.LinesCount`](text-area/parameter-control.md#linescount) | Sets the text lines count of the text area. |
 | [`TextArea.LinesSpecificationNameArray `](text-area/parameter-control.md#linesspecificationnamearray ) | Specifies the name array of the LinesSpecification objects which is relative to current TextArea. |
 | [`TextArea.LineStringRegExPattern`](text-area/parameter-control.md#linestringregexpattern) | Specifies the regular expression pattern of each line string text in current text area to recognize. |
 | [`TextArea.TextAreaNameArray `](text-area/parameter-control.md#textareanamearray ) | Specifies the name array of the TextAreas which is relative to current text area. |
 | [`TextArea.TextRegExPattern`](text-area/parameter-control.md#textregexpattern) | Specifies the regular expression pattern of the text to recognize. |


## LineSpecification Object

 | Parameter Name | Description |
 | -------------- | ----------- | 
 | [`LineSpecification.Name`](line-specification/parameter-control.md#name) | The name of the LineSpecification object. |
 | [`LineSpecification.CharacterModelName`](line-specification/parameter-control.md#charactermodelname) | Sets the name of a white list of recognizable characters. |
 | [`LineSpecification.LineNumber`](line-specification/parameter-control.md#linenumber) | The line number of the line targeted by the LineSpecification object. |
 | [`LineSpecification.LineStringRegExPattern`](line-specification/parameter-control.md#linestringregexpattern) | Specifies the regular expression pattern of the string within a line. |

## CharacterModel Object

 | Parameter Name | Description |
 | -------------- | ----------- | 
 | [`CharacterModel.Name`](character-model/parameter-control.md#name) | The name of the CharacterModel object. |
 | [`CharacterModel.DirectoryPath`](character-model/parameter-control.md#directorypath) | The path of the folder containing the character model files. |
 | [`CharacterModel.FilterFilePath`](character-model/parameter-control.md#filterfilepath) | The full path of the filter file which specifies the characters to be recognized. |


