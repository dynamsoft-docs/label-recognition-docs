---
layout: default-layout
title: Dynamsoft Label Recognition Parameter Reference for LabelRecognitionParameter Object - BinarizationModes
description: This page shows Dynamsoft Label Recognition Parameter Reference for LabelRecognitionParameter Object - BinarizationModes.
keywords: BinarizationModes, LabelRecognitionParameter, parameter reference, parameter
needAutoGenerateSidebar: true
---

# LabelRecognitionParameter Object

 | Parameter Name | Description |
 | -------------- | ----------- | 
 | [`LabelRecognitionParameter.Name`](parameter-control.md#name) | The name of the LabelRecognitionParameter object. |
 | [`LabelRecognitionParameter.BinarizationModes`](#binarizationmodes) | 	Sets the mode and priority for binarization. |
 | [`LabelRecognitionParameter.CharacterModelName`](parameter-control.md#charactermodelname) | Sets the name of a white list of recognizable characters. |
 | [`LabelRecognitionParameter.GrayscaleTransformationModes`](grayscale-transformation-modes.md#grayscaletransformationmodes) | Sets the mode and priority for the grayscale image conversion. |
 | [`LabelRecognitionParameter.LetterHeightRange`](parameter-control.md#letterheightrange) | Sets the range of letter height (in pixel or a percentage value relative to the height of the text area). |
 | [`LabelRecognitionParameter.LinesCount`](parameter-control.md#linescount) | Sets the text lines count of the text area. |
 | [`LabelRecognitionParameter.LineStringRegExPattern`](parameter-control.md#linestringregexpattern) | Specifies the regular expression pattern of each line string text in current image to recognize. |
 | [`LabelRecognitionParameter.MaxThreadCount`](parameter-control.md#maxthreadcount) | Sets the maximum number of threads the algorithm will use to recognize text. |
 | [`LabelRecognitionParameter.ReferenceRegionNameArray`](parameter-control.md#referenceregionnamearray) | The name array of the ReferenceRegion object(s). |
 | [`LabelRecognitionParameter.RegionPredetectionModes`](region-predetection-modes.md#regionpredetectionmodes) | Sets the region pre-detection mode for barcodes search. |
 | [`LabelRecognitionParameter.TextRegExPattern`](parameter-control.md#textregexpattern) | Specifies the regular expression pattern of the text to recognize. |

---


## BinarizationModes 

### Mode Properties
`BinarizationModes` is a parameter for setting the mode  for binarization. It consisits of one or more `DLRBinarizationMode` items and each item has its own arguments. The array index represents the priority of the item. The smaller index is, the higher priority is.

| Value Type | Value Range | Default Value |
| ---------- | ----------- | ------------- |
| *[`DLRBinarizationMode`]({{ site.enumerations }}parameter-mode-enums.html#dlrbinarizationmode) array* | "DLR_BM_SKIP"<br>"DLR_BM_AUTO"<br>"DLR_BM_LOCAL_BLOCK" | ["DLR_BM_LOCAL_BLOCK", "DLR_BM_SKIP", "DLR_BM_SKIP", "DLR_BM_SKIP", "DLR_BM_SKIP", "DLR_BM_SKIP", "DLR_BM_SKIP", "DLR_BM_SKIP"] |

- **See also**:   
    [`DLRBinarizationMode` Enumeration]({{ site.enumerations }}parameter-mode-enums.html#dlrbinarizationmode)
    
#### Mode Arguments
- [BlockSizeX](#blocksizex)
- [BlockSizeY](#blocksizey)
- [EnableFillBinaryVacancy](#enablefillbinaryvacancy)
- [ImagePreprocessingModesIndex](#imagepreprocessingmodesindex)
- [ThreshValueCoefficient](#threshvaluecoefficient)
- [LibraryFileName](#libraryfilename)
- [LibraryParameters](#libraryparameters)
 
##### BlockSizeX 
Sets the horizontal block size for the binarization process.

| Value Type | Value Range | Default Value | Valid Modes | 
| ---------- | ----------- | ------------- | ----------- |
| *int* | [0, 1000] | 0 | "DLR_BM_LOCAL_BLOCK" |         

- **Remarks**    
  Block size refers to the size of a pixel neighborhood used to calculate a threshold value for the pixel. An appropriate value for binarizationBlockSize can help generate a high quality binary image and increase the accuracy of barcode localization.   

  - 0: the block size used for binarization will be set to a value which is calculated automatically.   
  - N:
     - 1 <= N <= 3: the block size used for binarization will be set to 3.
     - N > 3: the block size used for binarization will be set to N.
     
  


##### BlockSizeY 
Sets the vertical block size for the binarization process.

| Value Type | Value Range | Default Value | Valid Modes | 
| ---------- | ----------- | ------------- | ----------- |
| *int* | [0, 1000] | 0 | "DLR_BM_LOCAL_BLOCK" |         

- **Remarks**     
  Block size refers to the size of a pixel neighborhood used to calculate a threshold value for the pixel. An appropriate value for binarizationBlockSize can help generate a high quality binary image and increase the accuracy of barcode localization.   

  - 0: the block size used for binarization will be set to a value which is calculated automatically.   
  - N:
     - 1 <= N <= 3: the block size used for binarization will be set to 3.
     - N > 3: the block size used for binarization will be set to N..


##### EnableFillBinaryVacancy 
Sets whether to enable binary vacancy filling.

| Value Type | Value Range | Default Value | Valid Modes | 
| ---------- | ----------- | ------------- | ----------- |
| *int* | [0, 1] | 1 | "DLR_BM_LOCAL_BLOCK" |         

- **Remarks**     
  0: disable.   
  1: enable.

  For barcodes with a large module size, there might be a vacant area in the position detection pattern after binarization. The vacant area may result in decoding failure. Setting this to True will fill in the vacant area with black and may help improve the decoding success rate. Better accuracy for images with a large module size.  
  

##### ImagePreprocessingModesIndex 
The index of a specific image preprocessing mode in the [ImagePreprocessingModes](ImagePreprocessingModes.md#imagepreprocessingmodes) parameter which the current binarization mode is applied to.

| Value Type | Value Range | Default Value | Valid Modes | 
| ---------- | ----------- | ------------- | ----------- |
| *int* | [-1, 0x7fffffff] | -1 | "DLR_BM_LOCAL_BLOCK" |         

- **Remarks**     
  -1: The current binarization mode is applied to all modes in parameter [ImagePreprocessingModes](ImagePreprocessingModes.md#imagepreprocessingmodes).


##### ThreshValueCoefficient 
Constant subtracted from the mean or weighted mean. Normally, it is positive but may be zero or negative as well.

| Value Type | Value Range | Default Value | Valid Modes | 
| ---------- | ----------- | ------------- | ----------- |
| *int* | [-255, 255] | 10 | "DLR_BM_LOCAL_BLOCK" |         



##### LibraryFileName 
Sets the file name of the library to load dynamically.

| Value Type | Value Range | Default Value | Valid Modes | 
| ---------- | ----------- | ------------- | ----------- |
| *string* | A string value representing file name. | "" | All `DLRBinarizationMode` items except DLR_BM_SKIP and DLR_BM_AUTO |         


- **Remarks**     
  - The library must be in the same place with Dynamsoft Label Recognition Library.


##### LibraryParameters 
Sets the parameters passed to the library to load dynamically.

| Value Type | Value Range | Default Value | Valid Modes | 
| ---------- | ----------- | ------------- | ----------- |
| *string* | A string value representing parameters. | "" | All `DLRBinarizationMode` items except DLR_BM_SKIP and DLR_BM_AUTO |         


### Setting Methods

#### As JSON Parameter
`BinarizationModes` as a JSON parameter is a JSON Object array. Each JSON Object has several keys for setting the mode and the value of arguments. The array index decides the priority the mode  for binarization. Default values will be used if there is no manual setting.   


| Json Object |	Json Parameter Name | Value Type |
| ----------- | ------------------- | ---------- |
| LabelRecognitionParameter | BinarizationModes | *JSON Object Array* | 

**Json Parameter Example**   
```
{
    "BinarizationModes": [
        {
            "Mode": "DLR_BM_LOCAL_BLOCK",
            "BlockSizeX": 5,
            "BlockSizeY": 5,
        }
    ]
}
```


&nbsp;
