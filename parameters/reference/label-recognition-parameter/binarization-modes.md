---
layout: default-layout
title: Dynamsoft Label Recognizer Parameter Reference for LabelRecognizerParameter Object - BinarizationModes
description: This page shows Dynamsoft Label Recognizer Parameter Reference for LabelRecognizerParameter Object - BinarizationModes.
keywords: BinarizationModes, LabelRecognizerParameter, parameter reference, parameter
needAutoGenerateSidebar: true
needGenerateH3Content: true
---

# LabelRecognizerParameter Object

## BinarizationModes 

### Mode Properties
`BinarizationModes` is a parameter for setting the mode  for binarization. It consisits of one or more `BinarizationMode` items and each item has its own arguments. The array index represents the priority of the item. The smaller index is, the higher priority is.

| Value Type | Value Range | Default Value |
| ---------- | ----------- | ------------- |
| *[`BinarizationMode`]({{ site.enumerations }}binarization-mode.html) array* | "BM_SKIP"<br>"BM_AUTO"<br>"BM_LOCAL_BLOCK" | ["BM_LOCAL_BLOCK", "BM_SKIP", "BM_SKIP", "BM_SKIP", "BM_SKIP", "BM_SKIP", "BM_SKIP", "BM_SKIP"] |

- **See also**:   
    [`BinarizationMode` Enumeration]({{ site.enumerations }}binarization-mode.html)
    
#### Mode Arguments
- [BlockSizeX](#blocksizex)
- [BlockSizeY](#blocksizey)
- [EnableFillBinaryVacancy](#enablefillbinaryvacancy)
- [ThresholdCompensation](#thresholdcompensation)
- [ThreshValueCoefficient](#threshvaluecoefficient)
- [BinarizationThreshold](#binarizationThreshold)
- [MorphOperation](#morphoperation)
- [MorphShape](#morphshape)
- [MorphOperationKernelSizeX](#morphoperationkernelsizex)
- [MorphOperationKernelSizeY](#morphoperationkernelsizey)
- [LibraryFileName](#libraryfilename)
- [LibraryParameters](#libraryparameters)

##### BlockSizeX 
Sets the horizontal block size for the binarization process.

| Value Type | Value Range | Default Value | 
| ---------- | ----------- | ------------- |
| *int* | [0, 1000] | 0 |         

- **Remarks**    
  Block size refers to the size of a pixel neighborhood used to calculate a threshold value for the pixel. An appropriate value for binarizationBlockSize can help generate a high quality binary image and increase the accuracy of barcode localization.   

  - 0: the block size used for binarization will be set to a value which is calculated automatically.   
  - N:
     - 1 <= N <= 3: the block size used for binarization will be set to 3.
     - N > 3: the block size used for binarization will be set to N.
     
  


##### BlockSizeY 
Sets the vertical block size for the binarization process.

| Value Type | Value Range | Default Value | 
| ---------- | ----------- | ------------- |
| *int* | [0, 1000] | 0 |         

- **Remarks**     
  Block size refers to the size of a pixel neighborhood used to calculate a threshold value for the pixel. An appropriate value for binarizationBlockSize can help generate a high quality binary image and increase the accuracy of barcode localization.   

  - 0: the block size used for binarization will be set to a value which is calculated automatically.   
  - N:
     - 1 <= N <= 3: the block size used for binarization will be set to 3.
     - N > 3: the block size used for binarization will be set to N..


##### EnableFillBinaryVacancy 
Sets whether to enable binary vacancy filling.

| Value Type | Value Range | Default Value | 
| ---------- | ----------- | ------------- |
| *int* | [0, 1] | 1 |         

- **Remarks**     
  0: disable.   
  1: enable.

  For barcodes with a large module size, there might be a vacant area in the position detection pattern after binarization. The vacant area may result in decoding failure. Setting this to True will fill in the vacant area with black and may help improve the decoding success rate. Better accuracy for images with a large module size.  
  

##### ThresholdCompensation 
Constant subtracted from the mean or weighted mean. Normally, it is positive but may be zero or negative as well.

| Value Type | Value Range | Default Value | 
| ---------- | ----------- | ------------- |
| *int* | [-255, 255] | 10 |         

##### ThreshValueCoefficient 
Deprecated. Use [ThresholdCompensation](#thresholdcompensation) instead.


##### BinarizationThreshold
Sets the binarization threshold.

| Value Type | Value Range | Default Value | 
| ---------- | ----------- | ------------- |
| *int* | [-1, 255] | -1 |   



##### MorphOperation 
Sets the morph operation for the morphology process. 

| Value Type | Value Range | Default Value | 
| ---------- | ----------- | ------------- |
| *string* | "Erode"<br>"Dilate"<br>"Open"<br>"Close" | "Close" |         

- **Remarks**    
   - "Erode": Perform erosion process.
   - "Dilate": Perform dilation process.
   - "Open": Perform erosion first, then perform dilation.
   - "Close": Perform dilation first, then perform erosion.
   
   For more information, please check out [Image Processing in OpenCV - Morphological Transformations](https://docs.opencv.org/master/d9/d61/tutorial_py_morphological_ops.html) for reference.


##### MorphShape  
 Sets the morph shape for the morphology process.  

| Value Type | Value Range | Default Value | 
| ---------- | ----------- | ------------- |
| *string* | "Rectangle"<br>"Cross"<br>"Ellipse" | "Rectangle" |         

- **Remarks**    
   - "Rectangle": 
   - "Cross": 
   - "Ellipse": 



##### MorphOperationKernelSizeX  
Sets the horizontal kernel size for the morphology process. 

| Value Type | Value Range | Default Value | 
| ---------- | ----------- | ------------- |
| *int* | [-1, 1000]  | -1 |         



##### MorphOperationKernelSizeY  
 Sets the vertical kernel size for the morphology process.  

| Value Type | Value Range | Default Value | 
| ---------- | ----------- | ------------- |
| *int* | [-1, 1000]  | -1 |   


##### LibraryFileName 
Sets the file name of the library to load dynamically.

| Value Type | Value Range | Default Value | Valid For | 
| ---------- | ----------- | ------------- | ----------- |
| *string* | A string value representing file name. | "" | All `BinarizationMode` items except BM_SKIP and BM_AUTO |         


- **Remarks**     
  The library must be in the same place with Dynamsoft Barcode Reader Library.


##### LibraryParameters 
Sets the parameters passed to the library to load dynamically.

| Value Type | Value Range | Default Value | Valid For | 
| ---------- | ----------- | ------------- | ----------- |
| *string* | A string value representing parameters. | "" | All `BinarizationMode` items except BM_SKIP and BM_AUTO |         


### Setting Methods

#### As JSON Parameter
`BinarizationModes` as a JSON parameter is a JSON Object array. Each JSON Object has several keys for setting the mode and the value of arguments. The array index decides the priority the mode  for binarization. Default values will be used if there is no manual setting.   


| Json Object |	Json Parameter Name | Value Type |
| ----------- | ------------------- | ---------- |
| LabelRecognizerParameter | BinarizationModes | *JSON Object Array* | 

**Json Parameter Example**   
```json
{
    "BinarizationModes": [
        {
            "Mode": "BM_LOCAL_BLOCK",
            "BlockSizeX": 5,
            "BlockSizeY": 5,
        }
    ]
}
```


#### As `DLR_RuntimeSettings` Member
`BinarizationModes` as a member of `DLR_RuntimeSettings` struct is a [`BinarizationMode`]({{ site.enumerations }}binarization-mode.html) array for setting the modes and the priority  for binarization. Default value will be used if there is no manual setting.

| Struct |	Struct Member Name | Value Type |
| ------ | ------------------ | ---------- |
| [`DLR_RuntimeSettings`]({{ site.c-cplusplus-api-reference }}dlr-runtime-settings.html) | [`binarizationModes`]({{ site.c-cplusplus-api-reference }}dlr-runtime-settings.html#binarizationmodes) | [`BinarizationMode`]({{ site.enumerations }}binarization-mode.html)[8] |

**See Also**    
- [`DLR_RuntimeSettings` Struct]({{ site.c-cplusplus-api-reference }}dlr-runtime-settings.html)
- [`BinarizationMode` Enumeration]({{ site.enumerations }}binarization-mode.html)

