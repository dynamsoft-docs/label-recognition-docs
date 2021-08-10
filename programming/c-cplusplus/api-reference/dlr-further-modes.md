---
layout: default-layout
title: Dynamsoft Label Recognizer C&C++ API Reference - DLR_FurtherModes Struct
description: This page shows the DLR_FurtherModes Struct of Dynamsoft Label Recognizer for C&C++ SDK.
keywords: DLR_FurtherModes, c, c++
needAutoGenerateSidebar: true
needGenerateH3Content: true
noTitleIndex: true
---


# DLR_FurtherModes
Stores the FurtherModes. 

```cpp
typedef struct tagDLR_FurtherModes DLR_FurtherModes
```  

## Attributes
  
| Attribute | Type |
|---------- | ---- |
| [`colourConversionModes[8]`](#colourconversionmodes) | [`ColourConversionMode`]({{ site.enumerations }}colour-conversion-mode.html) |
| [`grayscaleTransformationModes[8]`](#grayscaletransformationmodes) | [`GrayscaleTransformationMode`]({{ site.enumerations }}grayscale-transformation-mode.html) |
| [`regionPredetectionModes[8]`](#regionpredetectionmodes) | [`RegionPredetectionMode`]({{ site.enumerations }}region-predetection-mode.html) |
| [`grayscaleEnhancementModes[8]`](#grayscaleenhancementmodes) | [`GrayscaleEnhancementMode`]({{ site.enumerations }}grayscale-enhancement-mode.html) | 
| [`textureDetectionModes[8]`](#texturedetectionmodes) | [`TextureDetectionMode`]({{ site.enumerations }}texture-detection-mode.html) |


&nbsp;

### colourConversionModes
Sets the mode and priority for converting a colour image to a grayscale image.

```cpp
ColourConversionMode colourConversionModes[8]
```

- **Value range**  
   Each array item can be any one of the [`ColourConversionMode`]({{ site.enumerations }}colour-conversion-mode.html) Enumeration items. 
     
- **Default value**  
   `[CICM_GENERAL, CICM_SKIP, CICM_SKIP, CICM_SKIP, CICM_SKIP, CICM_SKIP, CICM_SKIP, CICM_SKIP]`  
     
- **Remarks**  
   The array index represents the priority of the item. The smaller index is, the higher priority is.  

&nbsp;

### grayscaleTransformationModes
Sets the mode and priority for the grayscale image conversion.

```cpp
GrayscaleTransformationMode grayscaleTransformationModes[8]
```

- **Value range**  
   Each array item can be any one of the [`GrayscaleTransformationMode`]({{ site.enumerations }}grayscale-transformation-mode.html) Enumeration items. 
     
- **Default value**  
   `[GTM_ORIGINAL, GTM_SKIP, GTM_SKIP, GTM_SKIP, GTM_SKIP, GTM_SKIP, GTM_SKIP, GTM_SKIP]`  
     
- **Remarks**  
   The array index represents the priority of the item. The smaller index is, the higher priority is.  

&nbsp;

### regionPredetectionModes
Sets the region pre-detection mode.

```cpp
RegionPredetectionMode regionPredetectionModes[8]
```

- **Value range**  
   Each array item can be any one of the [`RegionPredetectionMode`]({{ site.enumerations }}region-predetection-mode.html) Enumeration items.  
     
- **Default value**  
   `[RPM_GENERAL, RPM_SKIP, RPM_SKIP, RPM_SKIP, RPM_SKIP, RPM_SKIP, RPM_SKIP, RPM_SKIP]`  
     
- **Remarks**  
   The array index represents the priority of the item. The smaller index is, the higher priority is.

&nbsp;

### grayscaleEnhancementModes
Sets the mode and priority for grayscale image preprocessing algorithms.

```cpp
GrayscaleEnhancementMode grayscaleEnhancementModes[8]
```

- **Value range**  
   Each array item can be any one of the [`GrayscaleEnhancementMode`]({{ site.enumerations }}grayscale-enhancement-mode.html) Enumeration items.  
     
- **Default value**  
   `[GEM_GENERAL, GEM_SKIP, GEM_SKIP, GEM_SKIP, GEM_SKIP, GEM_SKIP, GEM_SKIP, GEM_SKIP]`  
     
- **Remarks**  
   The array index represents the priority of the item. The smaller index is, the higher priority is.

&nbsp;

### textureDetectionModes
Sets the mode and priority for texture detection. 

```cpp
TextureDetectionMode textureDetectionModes[8]
```

- **Value range**  
   Each array item can be any one of the [`TextureDetectionMode`]({{ site.enumerations }}texture-detection-mode.html) Enumeration items.  
     
- **Default value**  
   `[TDM_GENERAL_WIDTH_CONCENTRATION, TDM_SKIP, TDM_SKIP, TDM_SKIP, TDM_SKIP, TDM_SKIP, TDM_SKIP, TDM_SKIP]`  
     
- **Remarks**  
   The array index represents the priority of the item. The smaller index is, the higher priority is.
