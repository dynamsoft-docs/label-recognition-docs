---
layout: default-layout
title: Dynamsoft Label Recognizer Parameter Reference for LabelRecognizerParameter Object - GrayscaleEnhancementModes
description: This page shows Dynamsoft Label Recognizer Parameter Reference for LabelRecognizerParameter Object - GrayscaleEnhancementModes.
keywords: GrayscaleEnhancementModes, LabelRecognizerParameter, image process control parameters, parameter reference, parameter
needAutoGenerateSidebar: true
needGenerateH3Content: true
---

# LabelRecognizerParameter Object

## GrayscaleEnhancementModes  

### Mode Properties
`GrayscaleEnhancementModes` is a parameter for setting the mode for grayscale image preprocessing algorithms. It consisits of one or more `GrayscaleEnhancementMode` items and each item has its own arguments. The array index represents the priority of the item. The smaller index is, the higher priority is.

| Value Type | Value Range | Default Value |
| ---------- | ----------- | ------------- |
| *string array* or *[`GrayscaleEnhancementMode`]({{ site.enumerations }}grayscale-enhancement-mode.html) array* | "GEM_SKIP"<br>"GEM_AUTO"<br>"GEM_GENERAL"<br>"GEM_GRAY_EQUALIZE"<br>"GEM_GRAY_SMOOTH"<br>"GEM_SHARPEN_SMOOTH" | ["GEM_GENERAL", "GEM_SKIP", "GEM_SKIP", "GEM_SKIP", "GEM_SKIP", "GEM_SKIP", "GEM_SKIP", "GEM_SKIP"] |

- **See also**:   
    [`GrayscaleEnhancementMode` Enumeration]({{ site.enumerations }}grayscale-enhancement-mode.html)
    
#### Mode Arguments
- [Sensitivity](#sensitivity)
- [SmoothBlockSizeX](#smoothblocksizex)
- [SmoothBlockSizeY](#smoothblocksizey)
- [SharpenBlockSizeX](#sharpenblocksizex)
- [SharpenBlockSizeY](#sharpenblocksizey)
- [LibraryFileName](#libraryfilename)
- [LibraryParameters](#libraryparameters)
 
##### Sensitivity 
Sets the sensitivity used for gray equalization.

| Value Type | Value Range | Default Value | 
| ---------- | ----------- | ------------- |
| *int* | [1, 9] | 5 |         

- **Remarks**     
  If you have an image with a low level of contrast, you can set the property to a larger value. A larger value means a higher possibility that gray equalization will be activated. This may cause adverse effect on images with a high level of contrast.  


##### SmoothBlockSizeX 
Sets the horizontal block size for the smoothing process.

| Value Type | Value Range | Default Value | 
| ---------- | ----------- | ------------- |
| *int* | [3, 1000] | 3 |         

- **Remarks**     
  Block size refers to the size of a pixel neighborhood used to calculate the threshold for the pixel. An appropriate value can help increase the accuracy of barcode localization.


##### SmoothBlockSizeY 
Sets the vertical block size for the smoothing process.

| Value Type | Value Range | Default Value |
| ---------- | ----------- | ------------- |
| *int* | [3, 1000] | 3 |         

- **Remarks**     
  Block size refers to the size of a pixel neighborhood used to calculate the threshold for the pixel. An appropriate value can help increase the accuracy of barcode localization.  
  

##### SharpenBlockSizeX 
Sets the horizontal block size for the sharpening process.

| Value Type | Value Range | Default Value | 
| ---------- | ----------- | ------------- |
| *int* | [3, 1000] | 3 |         

- **Remarks**     
  Block size refers to the size of a pixel neighborhood used to calculate the threshold for the pixel. An appropriate value can help increase the accuracy of barcode localization.


##### SharpenBlockSizeY 
Sets the vertical block size for the sharpening process.

| Value Type | Value Range | Default Value | 
| ---------- | ----------- | ------------- |
| *int* | [3, 1000] | 3 |         

- **Remarks**     
  Block size refers to the size of a pixel neighborhood used to calculate the threshold for the pixel. An appropriate value can help increase the accuracy of barcode localization.
      


##### LibraryFileName 
Sets the file name of the library to load dynamically.

| Value Type | Value Range | Default Value | Valid For | 
| ---------- | ----------- | ------------- | ----------- |
| *string* | A string value representing file name. | "" | All `GrayscaleEnhancementMode` items except GEM_SKIP and GEM_AUTO |         


- **Remarks**     
  The library must be in the same place with Dynamsoft Barcode Reader Library.


##### LibraryParameters 
Sets the parameters passed to the library to load dynamically.

| Value Type | Value Range | Default Value | Valid For | 
| ---------- | ----------- | ------------- | ----------- |
| *string* | A string value representing parameters. | "" | All `GrayscaleEnhancementMode` items except GEM_SKIP and GEM_AUTO |         


### Setting Methods

#### As JSON Parameter
`GrayscaleEnhancementModes` as a JSON parameter is a JSON Object array. Each JSON Object has several keys for setting the mode and the value of arguments. The array index decides the priority the mode for image preprocessing algorithms.
Default values will be used if there is no manual setting.   


| Json Object |	Json Parameter Name | Value Type |
| ----------- | ------------------- | ---------- |
| LabelRecognizerParameter | GrayscaleEnhancementModes | *JSON Object Array* | 

**Json Parameter Example**   
```json
{
    "GrayscaleEnhancementModes": [
        {
            "Mode": "GEM_GRAY_EQUALIZE",
            "Sensitivity": 5
        },
        {
            "Mode": "GEM_SHARPEN_SMOOTH",
            "SmoothBlockSizeX": 5,
            "SmoothBlockSizeY": 5,
            "SharpenBlockSizeX": 5,
            "SharpenBlockSizeY": 5
        }
    ]
}
```


#### As `DLR_RuntimeSettings` Member
`GrayscaleEnhancementModes` is a [`GrayscaleEnhancementMode`]({{ site.enumerations }}grayscale-enhancement-mode.html) array defines in `furtherModes` which is a struct member of `DLR_RuntimeSettings`. It is used for setting the modes and the priority for image preprocessing algorithms. Default value will be used if there is no manual setting.

| Struct |	Struct Member Name | Value Type |
| ------ | ------------------ | ---------- |
| [`DLR_RuntimeSettings`]({{ site.c-cplusplus-api-reference }}dlr-runtime-settings.html)->[`furtherModes`]({{ site.c-cplusplus-api-reference }}dlr-runtime-settings.html#furthermodes) | [`grayscaleEnhancementModes`]({{ site.c-cplusplus-api-reference }}dlr-further-modes.html#grayscaleenhancementmodes) | [`GrayscaleEnhancementMode`]({{ site.enumerations }}grayscale-enhancement-mode.html)[8] |

**See Also**    
- [`DLR_RuntimeSettings` Struct]({{ site.c-cplusplus-api-reference }}dlr-runtime-settings.html)
- [`DLR_FurtherModes` Struct]({{ site.c-cplusplus-api-reference }}dlr-further-modes.html)
- [`GrayscaleEnhancementMode` Enumeration]({{ site.enumerations }}grayscale-enhancement-mode.html)
