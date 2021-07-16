---
layout: default-layout
title: Dynamsoft Label Recognizer Parameter Reference - LabelRecognizerParameter Object
description: This page shows Dynamsoft Label Recognizer Parameter Reference - LabelRecognizerParameter Object.
keywords: parameter reference, parameters, LabelRecognizerParameter
needAutoGenerateSidebar: true
needGenerateH3Content: true
---


# Dynamsoft Label Recognizer SDK - LabelRecognizerParameter Object

 | Parameter Name | Description |
 | -------------- | ----------- | 
 | [`LabelRecognizerParameter.Name`](parameter-control.md#name) | The name of the LabelRecognizerParameter object. |
 | [`LabelRecognizerParameter.BinarizationModes`](binarization-modes.md#binarizationmodes) | 	Sets the mode and priority for binarization. |
 | [`LabelRecognizerParameter.CharacterModelName`](parameter-control.md#charactermodelname) | Sets the name of a white list of recognizable characters. |
| [`LabelRecognizerParameter.ColourConversionModes`](colour-conversion-modes.md#colourconversionmodes) | Sets the mode and priority for converting a colour image to a grayscale image. |
 | [`LabelRecognizerParameter.DictionaryCorrectionThresholds`](parameter-control.md#dictionarycorrectionthresholds) | Sets the threshold of dictionary error correction. |
 | [`LabelRecognizerParameter.DictionaryPath`](parameter-control.md#dictionarypath) | Sets the path of the dictionary file. |
 | [`LabelRecognizerParameter.GrayscaleEnhancementModes`](grayscale-enhancement-modes.md#grayscaleenhancementmodes) | Sets the mode and priority for grayscale image preprocessing algorithms. |
 | [`LabelRecognizerParameter.GrayscaleTransformationModes`](grayscale-transformation-modes.md#grayscaletransformationmodes) | Sets the mode and priority for the grayscale image conversion. |
 | [`LabelRecognizerParameter.LetterHeightRange`](parameter-control.md#letterheightrange) | Sets the range of letter height (in pixel or a percentage value relative to the height of the text area). |
 | [`LabelRecognizerParameter.LineStringLengthRange`](parameter-control.md#linestringlengthrange) | Sets the range of string length for each recognized line. |
 | [`LabelRecognizerParameter.LineStringRegExPattern`](parameter-control.md#linestringregexpattern) | Specifies the regular expression pattern of each line string text in current image to recognize. |
 | [`LabelRecognizerParameter.MaxLineCharacterSpacing`](parameter-control.md#maxlinecharacterspacing) | Sets the maximum spacing between characters treated as one line. |
 | [`LabelRecognizerParameter.MaxThreadCount`](parameter-control.md#maxthreadcount) | Sets the maximum number of threads the algorithm will use to recognize text. |
 | [`LabelRecognizerParameter.Pages`](parameter-control.md#pages) | Sets the specific pages or the range of pages of a file (.tiff or .pdf) for label recognition. |
 | [`LabelRecognizerParameter.ReferenceRegionNameArray`](parameter-control.md#referenceregionnamearray) | The name array of the ReferenceRegion object(s). |
 | [`LabelRecognizerParameter.RegionPredetectionModes`](region-predetection-modes.md#regionpredetectionmodes) | Sets the region pre-detection mode for label recognition. |
 | [`LabelRecognizerParameter.ScaleUpModes`](scale-up-modes.md#scaleupmodes) | Sets the mode and priority to control the scale-up process for text line with small letter height. |
 | [`LabelRecognizerParameter.TextStringLengthRange`](parameter-control.md#textstringlengthrange) | Sets the range of string length for each recognized text area. |
 | [`LabelRecognizerParameter.TextRegExPattern`](parameter-control.md#textregexpattern) | Specifies the regular expression pattern of the text to recognize. |
 | [`LabelRecognizerParameter.TextureDetectionModes`](texture-detection-modes.md#texturedetectionmodes) | 	Sets the mode and priority for texture detection. |
 | [`LabelRecognizerParameter.Timeout`](parameter-control.md#timeout) | Sets the maximum amount of time (in milliseconds) that should be spent searching for labels on each page. |