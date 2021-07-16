---
layout: default-layout
title: Dynamsoft Label Recognizer C&C++ API Reference - DLR_FurtherModes Struct
description: This page shows the DLR_FurtherModes Struct of Dynamsoft Label Recognizer for C&C++ SDK.
keywords: DLR_FurtherModes, c, c++
needAutoGenerateSidebar: true
needGenerateH3Content: true
---


# DLR_FurtherModes
Stores the FurtherModes. 

## Attributes
  
| Attribute | Type |
|---------- | ---- |
| [`colourConversionModes[8]`](#colourconversionmodes) | [`ColourConversionMode`]({{ site.enumerations }}parameter-mode-enums.html#colourconversionmode) |
| [`grayscaleTransformationModes[8]`](#grayscaletransformationmodes) | [`GrayscaleTransformationMode`]({{ site.enumerations }}parameter-mode-enums.html#grayscaletransformationmode) |
| [`regionPredetectionModes[8]`](#regionpredetectionmodes) | [`RegionPredetectionMode`]({{ site.enumerations }}parameter-mode-enums.html#regionpredetectionmode) |
| [`grayscaleEnhancementModes[8]`](#grayscaleenhancementmodes) | [`GrayscaleEnhancementMode`]({{ site.enumerations }}parameter-mode-enums.html#grayscaleenhancementmode) | 
| [`textureDetectionModes[8]`](#texturedetectionmodes) | [`TextureDetectionMode`]({{ site.enumerations }}parameter-mode-enums.html#texturedetectionmode) |


### ColourConversionModes
Sets the mode and priority for converting a colour image to a grayscale image.

```cpp
ColourConversionMode colourConversionModes[8]
```

- **Value range**  
   Each array item can be any one of the [`ColourConversionMode`]({{ site.enumerations }}parameter-mode-enums.html#colourconversionmode) Enumeration items. 
     
- **Default value**  
   `[CICM_GENERAL, CICM_SKIP, CICM_SKIP, CICM_SKIP, CICM_SKIP, CICM_SKIP, CICM_SKIP, CICM_SKIP]`  
     
- **Remarks**  
   The array index represents the priority of the item. The smaller index is, the higher priority is.  

### GrayscaleTransformationModes
Sets the mode and priority for the grayscale image conversion.

```cpp
GrayscaleTransformationMode grayscaleTransformationModes[8]
```

- **Value range**  
   Each array item can be any one of the [`GrayscaleTransformationMode`]({{ site.enumerations }}parameter-mode-enums.html#grayscaletransformationmode) Enumeration items. 
     
- **Default value**  
   `[GTM_ORIGINAL, GTM_SKIP, GTM_SKIP, GTM_SKIP, GTM_SKIP, GTM_SKIP, GTM_SKIP, GTM_SKIP]`  
     
- **Remarks**  
   The array index represents the priority of the item. The smaller index is, the higher priority is.  

### RegionPredetectionModes
Sets the region pre-detection mode.

```cpp
RegionPredetectionMode regionPredetectionModes[8]
```

- **Value range**  
   Each array item can be any one of the [`RegionPredetectionMode`]({{ site.enumerations }}parameter-mode-enums.html#regionpredetectionmode) Enumeration items.  
     
- **Default value**  
   `[RPM_GENERAL, RPM_SKIP, RPM_SKIP, RPM_SKIP, RPM_SKIP, RPM_SKIP, RPM_SKIP, RPM_SKIP]`  
     
- **Remarks**  
   The array index represents the priority of the item. The smaller index is, the higher priority is.

### GrayscaleEnhancementModes
Sets the mode and priority for grayscale image preprocessing algorithms.

```cpp
GrayscaleEnhancementMode grayscaleEnhancementModes[8]
```

- **Value range**  
   Each array item can be any one of the [`GrayscaleEnhancementMode`]({{ site.enumerations }}parameter-mode-enums.html#grayscaleenhancementmode) Enumeration items.  
     
- **Default value**  
   `[GEM_GENERAL, GEM_SKIP, GEM_SKIP, GEM_SKIP, GEM_SKIP, GEM_SKIP, GEM_SKIP, GEM_SKIP]`  
     
- **Remarks**  
   The array index represents the priority of the item. The smaller index is, the higher priority is.

### TextureDetectionModes
Sets the mode and priority for texture detection. 

```cpp
TextureDetectionMode textureDetectionModes[8]
```

- **Value range**  
   Each array item can be any one of the [`TextureDetectionMode`]({{ site.enumerations }}parameter-mode-enums.html#texturedetectionmode) Enumeration items.  
     
- **Default value**  
   `[TDM_GENERAL_WIDTH_CONCENTRATION, TDM_SKIP, TDM_SKIP, TDM_SKIP, TDM_SKIP, TDM_SKIP, TDM_SKIP, TDM_SKIP]`  
     
- **Remarks**  
   The array index represents the priority of the item. The smaller index is, the higher priority is.
