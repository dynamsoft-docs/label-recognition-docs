---
layout: default-layout
title: Dynamsoft Label Recognizer Parameter Reference for LabelRecognizerParameter Object - ColourConversionModes
description: This page shows Dynamsoft Label Recognizer Parameter Reference for LabelRecognizerParameter Object - ColourConversionModes.
keywords: ColourConversionModes, LabelRecognizerParameter, parameter reference, parameter
needAutoGenerateSidebar: true
needGenerateH3Content: true
---


# LabelRecognizerParameter Object

## ColourConversionModes

### Mode Properties
`ColourConversionModes` is a parameter for setting the mode for converting a colour image to a grayscale image. It consisits of one or more `ColourConversionMode` items and each item has its own arguments. The array index represents the priority of the item. The smaller index is, the higher priority is.

| Value Type | Value Range | Default Value |
| ---------- | ----------- | ------------- |
| *string array* or *[`ColourConversionMode`]({{ site.enumerations }}colour-conversion-mode.html) array* | "CICM_SKIP"<br>"CICM_GENERAL"<br>"CICM_HSV" | ["CICM_GENERAL", "CICM_SKIP", "CICM_SKIP", "CICM_SKIP", "CICM_SKIP", "CICM_SKIP", "CICM_SKIP", "CICM_SKIP"] |

- **See also**:   
    [`ColourConversionMode` Enumeration]({{ site.enumerations }}colour-conversion-mode.html)
    
#### Mode Arguments
- [BlueChannelWeight](#bluechannelweight)
- [GreenChannelWeight](#greenchannelweight)
- [RedChannelWeight](#redchannelweight)
- [ReferChannel](#referchannel)
- [LibraryFileName](#libraryfilename)
- [LibraryParameters](#libraryparameters)
 
##### BlueChannelWeight 
Sets the weight value of Blue Colour Channel used for converting a colour image to a grayscale image.

| Value Type | Value Range | Default Value | 
| ---------- | ----------- | ------------- |
| *int* | [-1, 1000] | -1 |         

- **Remarks**     
  -1: The weight value will be set automatically by the SDK. 
  

##### GreenChannelWeight 
Sets the weight value of Green Colour Channel used for converting a colour image to a grayscale image.

| Value Type | Value Range | Default Value | 
| ---------- | ----------- | ------------- |
| *int* | [-1, 1000] | -1 |         

- **Remarks**     
  -1: The weight value will be set automatically by the SDK. 


##### RedChannelWeight 
Sets the weight value of Red Colour Channel used for converting a colour image to a grayscale image.

| Value Type | Value Range | Default Value | 
| ---------- | ----------- | ------------- |
| *int* | [-1, 1000] | -1 |         

- **Remarks**     
  -1: The weight value will be set automatically by the SDK. 

##### ReferChannel 
Sets reference channel used for converting a colour image to a grayscale image by HSV algorithm.

| Value Type | Value Range | Default Value | 
| ---------- | ----------- | ------------- |
| *string* |     "H_CHANNEL"<br>"S_CHANNEL"<br>"V_CHANNEL" | "H_CHANNEL" |         

##### LibraryFileName 
Sets the file name of the library to load dynamically.

| Value Type | Value Range | Default Value | Valid For | 
| ---------- | ----------- | ------------- | ----------- |
| *string* | A string value representing file name. | "" | All `ColourConversionMode` items except CICM_SKIP |         


- **Remarks**     
  The library must be in the same place with Dynamsoft Barcode Reader Library.


##### LibraryParameters 
Sets the parameters passed to the library to load dynamically.

| Value Type | Value Range | Default Value | Valid For | 
| ---------- | ----------- | ------------- | ----------- |
| *string* | A string value representing parameters. | "" | All `ColourConversionMode` items except CICM_SKIP |         


### Setting Methods

#### As JSON Parameter
`ColourConversionModes` as a JSON parameter is a JSON Object array. Each JSON Object has several keys for setting the mode and the value of arguments. The array index decides the priority of the mode for converting a colour image to a grayscale image. Default values will be used if there is no manual setting.


| Json Object |	Json Parameter Name | Value Type |
| ----------- | ------------------- | ---------- |
| ImageParameter | ColourConversionModes | *JSON Object Array* | 

**Json Parameter Example**   
```json
{
    "ColourConversionModes": [
        {
            "Mode": "CICM_GENERAL"
        }
    ]
}
```



#### As `DLR_RuntimeSettings` Member
`ColourConversionModes` is a [`ColourConversionMode`]({{ site.enumerations }}colour-conversion-mode.html) array defines in `furtherModes` which is a struct member of `DLR_RuntimeSettings`. It is used for setting the modes and the priority for converting a colour image to a grayscale image. Default value will be used if there is no manual setting.

| Struct |	Struct Member Name | Value Type |
| ------ | ------------------ | ---------- |
| [`DLR_RuntimeSettings`]({{ site.c-cplusplus-api-reference }}dlr-runtime-settings.html)->[`furtherModes`]({{ site.c-cplusplus-api-reference }}dlr-runtime-settings.html#furthermodes) | [`colourConversionModes`]({{ site.c-cplusplus-api-reference }}dlr-further-modes.html#colourconversionmodes) | [`ColourConversionMode`]({{ site.enumerations }}colour-conversion-mode.html)[8] |


**See Also**    
- [`DLR_RuntimeSettings` Struct]({{ site.c-cplusplus-api-reference }}dlr-runtime-settings.html)
- [`DLR_FurtherModes` Struct]({{ site.c-cplusplus-api-reference }}dlr-further-modes.html)
- [`ColourConversionMode` Enumeration]({{ site.enumerations }}colour-conversion-mode.html)

