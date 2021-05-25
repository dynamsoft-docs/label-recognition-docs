---
layout: default-layout
title: Dynamsoft Label Recognition Introduction - Architecture
description: This is the architecture page of DynamsoftLabel Recognition Introduction.
keywords: architecture, architecture
needAutoGenerateSidebar: true
needGenerateH3Content: true
---

# Architecture of Dynamsoft Label Recognition Algorithm

Dynamsoft Label Recognition (DLR) is a flexible SDK used to implement zonal OCR functionality in cross-platform applications. 

DLR powers your software development from the following aspects: 
- (1) performance of zonal text and symbols recognizing 
- (2) integration of multipurpose image processing 
- (3) flexible algorithm flow and versatile parameters  

The algorithm of DLR includes a flow of 4 stages at the top level. As illustrated in Figure 1, where extracting text line(s), character segmentation and recognition are the two core stages. DLR is designed to deal with a variety of zonal text recognition scenarios and offers many customizable parameters to increase its versatility. Furthermore, fully integrated algorithm architecture and variety parameters solidifies the agility to meet any new requirements. 

<div align="center">
   <p><img src="assets/architecture/top-level-flow-of-dlr-algorithm.png" alt="Top Level Flow of DLR Algorithm" width="30%" /></p>
   <p>Figure 1 – Top Level Flow of DLR Algorithm</p>
</div> 

## Stage 1. Specify regions of interest (ROI). 

This phase begins with how to specify a ROI from a variety of sources, including image files, videos, or buffers of other applications. A ROI in DLR consists two parts generally: reference region and text area. A reference region could be:
- An predefined region with absolute or relative coordinates known in advance
- A barcode region which detected by [Dynamsoft Barcode Reader](https://www.dynamsoft.com/barcode-reader/overview/?urlsource=navigation)
- A predetect region according background colour, foreground colour etc. 

A text area is specified by percentage coordinates relative to the reference region. Their relationship is shown in the figure below.
<div align="center">
   <p><img src="assets/architecture/dlr_roi.png" alt="ROI definition" width="100%" /></p>
   <p>Figure 2 – ROI definition</p>
</div> 

Table 1 lists these parameters and their respective design intents.

Table 1 – Parameters of DLR Algorithm in the Stage 1

| **Parameter Name** | **Functionality** | **Status** |
| ------------------ | ---------------------------- | ---------- |
| [`ReferenceRegionNameArray`]({{ site.parameters-reference }}label-recognition-parameter/parameter-control.html#ReferenceRegionNameArray) | The name array of the ReferenceRegion object(s) defined in th root node of template json. | Available |
| [`ReferenceRegion`]({{ site.parameters-reference }}reference-region/parameter-control.html) | To specify a reference region for text area(s). | Available |
| [`TextArea`]({{ site.parameters-reference }}text-area/parameter-control.html) | To specify a target area for text recognition. | Available |
| [`RegionPredetectionModes`]({{ site.parameters-reference }}label-recognition-parameter/RegionPredetectionModes.html#regionpredetectionmodes) | To limit the subsequent stages in special areas to speed up by detecting the regions of interest automatically. Pre-detection is based on the colour/grayscale distribution of each area. | Available, Extensible |
| [`Pages`]({{ site.parameters-reference }}label-recognition-parameter/parameter-control.html#Pages) | To specify pages or the range of pages of a file (.tiff or .pdf) for label recognition. | Available |
| [`GrayscaleTransformationModes`]({{ site.parameters-reference }}label-recognition-parameter/parameter-control.html#GrayscaleTransformationModes) | To emphasize the features of regions of interest with processing of the grayscale image.  | Available |


## Stage 2. Extract text line(s). 

 Before extracting text line(s), some optional steps can be taken to speed up. Such as preprocessing candidate text region, binarization, setting hints about text line count, letter height, text line length etc. These steps are related to the respective parameters listed in the Table 2.

Table 2 – Parameters of DLR Algorithm in the Stage 2

| **Parameter Name** | **Intent and Functionalities** | **Status** |
|--------------------|--------------------------------|------------|
| [`ImagePreprocessingModes`]({{ site.parameters-reference }}label-recognition-parameter/ImagePreprocessingModes.html#imagepreprocessingmodes) | To enhance/keep features of text zones by processing colour or grayscale images. | Available, Extensible |
| [`BinarizationModes`]({{ site.parameters-reference }}label-recognition-parameter/BinarizationModes.html#binarizationmodes) | To enhance/keep features of text zones by applying different binarization methods and arguments. | Available, Extensible |
| [`LetterHeightRange`]({{ site.parameters-reference }}label-recognition-parameter/parameter-control.html#LetterHeightRange) | To improve speed and accuracy by setting the range of letter height. | Available |
| [`MaxLineCharacterSpacing`]({{ site.parameters-reference }}label-recognition-parameter/parameter-control.html#MaxLineCharacterSpacing) | To improve speed and accuracy by setting the maximum spacing between characters treated as one line. | Available |


## Stage 3. Character segmentation and recognition.

This is the most complicated stage. In order to get accurate results, algorithm try to segment and recognize characters from each text line iteratively. There are a few methods to deal with varying text quality situations. The parameters are listed in table 3 .

Table 3 – Parameters of DLR Algorithm in the Stage 3

| **Parameter Name** | **Intent and Functionalities** | **Status** |
|--------------------|--------------------------------|------------|
| [`CharacterModelName`]({{ site.parameters-reference }}label-recognition-parameter/parameter-control.html#CharacterModelName) | To get better OCR results by setting the name of a white list of recognizable characters. | Available |
| [`TextRegExPattern`]({{ site.parameters-reference }}label-recognition-parameter/parameter-control.html#TextRegExPattern) | To improve accuracy and robustness by applying the regular expression pattern of text in each text area to recognize. | Available |
| [`LineStringRegExPattern`]({{ site.parameters-reference }}label-recognition-parameter/parameter-control.html#LineStringRegExPattern) | To improve accuracy and robustness by applying the regular expression pattern of text in each text line to recognize.| Available |
| [`TextStringLengthRange`]({{ site.parameters-reference }}label-recognition-parameter/parameter-control.html#LineStringLengthRange) | To improve speed and accuracy by setting the range of string length for each recognized line in text area(s). | Available |
| [`LineStringLengthRange`]({{ site.parameters-reference }}label-recognition-parameter/parameter-control.html#LineStringLengthRange) | To improve speed and accuracy by setting the range of string length for each recognized line. | Available |

## Stage 4. Output the recognition results. 

This stage main focus on the text recognition results. Algorithm would check all available results, and filter unwanted results according to the following parameters.

Table 4 – Parameters to Organize the Results

| **Parameter Name** | **Intent and Functionalities** | **Status** |
|--------------------|--------------------------------|------------|
| [`TextStringLengthRange`]({{ site.parameters-reference }}label-recognition-parameter/parameter-control.html#TextStringLengthRange)  | To filter text results with length limitations of text area. | Available |
| [`LineStringLengthRange`]({{ site.parameters-reference }}label-recognition-parameter/parameter-control.html#LineStringLengthRange) | To filter text results with length limitations of text line. | Available |
| [`LinesCount`]({{ site.parameters-reference }}label-recognition-parameter/parameter-control.html#LinesCount) | To filter text results with given lines count. | Available |
