---
layout: default-layout
title: Dynamsoft Barcode Reader Parameter Reference for ImageParameter Object - TextureDetectionModes
description: This page shows Dynamsoft Barcode Reader Parameter Reference for ImageParameter Object - TextureDetectionModes.
keywords: TextureDetectionModes, ImageParameter, image process control parameters, parameter reference, parameter 
needAutoGenerateSidebar: true
needGenerateH3Content: true
---

# LabelRecognizerParameter Object

## TextureDetectionModes 

### Mode Properties
`TextureDetectionModes` is a parameter for setting the mode  for texture detection. It consists of one or more `TextureDetectionMode` items and each item has its own arguments. The array index represents the priority of the item. The smaller index is, the higher priority is.

| Value Type | Value Range | Default Value |
| ---------- | ----------- | ------------- |
| *string array* or *[`TextureDetectionMode`]({{ site.enumerations }}texture-detection-mode.html) array* | "TDM_SKIP"<br>"TDM_AUTO"<br>"TDM_GENERAL_WIDTH_CONCENTRATION" | ["TDM_GENERAL_WIDTH_CONCENTRATION", "TDM_SKIP", "TDM_SKIP", "TDM_SKIP", "TDM_SKIP", "TDM_SKIP", "TDM_SKIP", "TDM_SKIP"] |

- **See also**:   
    [`TextureDetectionMode` Enumeration]({{ site.enumerations }}texture-detection-mode.html)
    
#### Mode Arguments
- [Sensitivity](#sensitivity)
- [LibraryFileName](#libraryfilename)
- [LibraryParameters](#libraryparameters)

##### Sensitivity 
Sets the sensitivity used for texture detection.

| Value Type | Value Range | Default Value | 
| ---------- | ----------- | ------------- |
| *int* | [1, 9] | 5 |         

- **Remarks**    
  A larger value means the library will take more effort to detect texture.
     
##### LibraryFileName 
Sets the file name of the library to load dynamically.

| Value Type | Value Range | Default Value | Valid For | 
| ---------- | ----------- | ------------- | ----------- |
| *string* | A string value representing file name. | "" | All `TextureDetectionMode` items except TDM_SKIP and TDM_AUTO|         


- **Remarks**     
  The library must be in the same place with Dynamsoft Barcode Reader Library.


##### LibraryParameters 
Sets the parameters passed to the library to load dynamically.

| Value Type | Value Range | Default Value | Valid For | 
| ---------- | ----------- | ------------- | ----------- |
| *string* | A string value representing parameters. | "" | All `TextureDetectionMode` items except TDM_SKIP and TDM_AUTO |         



### Setting Methods

#### As JSON Parameter
`TextureDetectionModes` as a JSON parameter is a JSON Object array. Each JSON Object has several keys for setting the mode and the value of arguments. The array index decides the priority the mode  for texture detection. Default values will be used if there is no manual setting.   


| Json Object |	Json Parameter Name | Value Type |
| ----------- | ------------------- | ---------- |
| ImageParameter | TextureDetectionModes | *JSON Object Array* | 

**Json Parameter Example**   
```json
{
    "TextureDetectionModes": [
        {
            "Mode": "TDM_GENERAL_WIDTH_CONCENTRATION",
            "Sensitivity": 5
        }
    ]
}
```


#### As `DLR_RuntimeSettings` Member
`TextureDetectionModes` is a [`TextureDetectionMode`]({{ site.enumerations }}texture-detection-mode.html) array defines in `furtherModes` which is a struct member of `DLR_RuntimeSettings`. It is used for setting the modes and the priority  for texture detection. Default value will be used if there is no manual setting.

| Struct |	Struct Member Name | Value Type |
| ------ | ------------------ | ---------- |
| [`DLR_RuntimeSettings`]({{ site.c-cplusplus-api-reference }}dlr-runtime-settings.html)->[`furtherModes`]({{ site.c-cplusplus-api-reference }}dlr-runtime-settings.html#furthermodes) | [`textureDetectionModes`]({{ site.c-cplusplus-api-reference }}dlr-further-modes.html#texturedetectionmodes) | [`TextureDetectionMode`]({{ site.enumerations }}texture-detection-mode.html)[8] |


**See Also**    
- [`DLR_RuntimeSettings` Struct]({{ site.c-cplusplus-api-reference }}dlr-runtime-settings.html)
- [`DLR_FurtherModes` Struct]({{ site.c-cplusplus-api-reference }}dlr-further-modes.html)
- [`TextureDetectionMode` Enumeration]({{ site.enumerations }}texture-detection-mode.html)
