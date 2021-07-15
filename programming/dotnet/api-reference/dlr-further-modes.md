---
layout: default-layout
title: Dynamsoft Label Recognizer .NET API Reference - DLRFurtherModes Struct
description: This page shows the DLRFurtherModes Struct of Dynamsoft Label Recognizer for .NET SDK.
keywords: DLRFurtherModes, .Net
needAutoGenerateSidebar: true
needGenerateH3Content: true
---


# class Dynamsoft.DLR.DLR_FurtherModes
Stores the FurtherModes. 

## Attributes
  
| Attribute | Type |
|---------- | ---- |
| [`ColourConversionModes`](#colourconversionmodes) | [`EnumColourConversionMode`]({{ site.enumerations }}parameter-mode-enums.html#colourconversionmode)[ ] |
| [`GrayscaleTransformationModes`](#grayscaletransformationmodes) | [`EnumGrayscaleTransformationMode`]({{ site.enumerations }}parameter-mode-enums.html#grayscaletransformationmode)[ ] |
| [`RegionPredetectionModes`](#regionpredetectionmodes) | [`EnumRegionPredetectionMode`]({{ site.enumerations }}parameter-mode-enums.html#regionpredetectionmode)[ ] |
| [`GrayscaleEnhancementModes`](#grayscaleenhancementmodes) | [`EnumGrayscaleEnhancementMode`]({{ site.enumerations }}parameter-mode-enums.html#grayscaleenhancementmode)[] | 
| [`TextureDetectionModes`](#texturedetectionmodes) | [`EnumTextureDetectionMode`]({{ site.enumerations }}parameter-mode-enums.html#texturedetectionmode)[ ] |


### ColourConversionModes
Sets the mode and priority for converting a colour image to a grayscale image.

```csharp
EnumColourConversionMode[] ColourConversionModes
```

- **Value range**  
   Each array item can be any one of the [`ColourConversionMode`]({{ site.enumerations }}parameter-mode-enums.html#colourconversionmode) Enumeration items. 
     
- **Default value**  
   `[EnumColourConversionMode.CICM_GENERAL, EnumColourConversionMode.CICM_SKIP, EnumColourConversionMode.CICM_SKIP, EnumColourConversionMode.CICM_SKIP, EnumColourConversionMode.CICM_SKIP, EnumColourConversionMode.CICM_SKIP, EnumColourConversionMode.CICM_SKIP, EnumColourConversionMode.CICM_SKIP]`  
     
- **Remarks**  
   The array index represents the priority of the item. The smaller index is, the higher priority is.  

### GrayscaleTransformationModes
Sets the mode and priority for the grayscale image conversion.

```csharp
EnumGrayscaleTransformationMode[] GrayscaleTransformationModes
```

- **Value range**  
   Each array item can be any one of the [`GrayscaleTransformationMode`]({{ site.enumerations }}parameter-mode-enums.html#grayscaletransformationmode) Enumeration items. 
     
- **Default value**  
   `[EnumGrayscaleTransformationMode.GTM_ORIGINAL, EnumGrayscaleTransformationMode.GTM_SKIP, EnumGrayscaleTransformationMode.GTM_SKIP, EnumGrayscaleTransformationMode.GTM_SKIP, EnumGrayscaleTransformationMode.GTM_SKIP, EnumGrayscaleTransformationMode.GTM_SKIP, EnumGrayscaleTransformationMode.GTM_SKIP, EnumGrayscaleTransformationMode.GTM_SKIP]`  
     
- **Remarks**  
   The array index represents the priority of the item. The smaller index is, the higher priority is.  

### RegionPredetectionModes
Sets the region pre-detection mode for barcodes search.

```csharp
EnumRegionPredetectionMode[] RegionPredetectionModes
```

- **Value range**  
   Each array item can be any one of the [`RegionPredetectionMode`]({{ site.enumerations }}parameter-mode-enums.html#regionpredetectionmode) Enumeration items.  
     
- **Default value**  
   `[EnumRegionPredetectionMode.RPM_GENERAL, EnumRegionPredetectionMode.RPM_SKIP, EnumRegionPredetectionMode.RPM_SKIP, EnumRegionPredetectionMode.RPM_SKIP, EnumRegionPredetectionMode.RPM_SKIP, EnumRegionPredetectionMode.RPM_SKIP, EnumRegionPredetectionMode.RPM_SKIP, EnumRegionPredetectionMode.RPM_SKIP]`  
     
- **Remarks**  
   The array index represents the priority of the item. The smaller index is, the higher priority is. If the image is large and the barcode on the image is very small, it is recommended to enable region predetection to speed up the localization process and recognition accuracy.

### GrayscaleEnhancementModes
Sets the mode and priority for grayscale image preprocessing algorithms.

```csharp
EnumGrayscaleEnhancementMode[] GrayscaleEnhancementModes
```

- **Value range**  
   Each array item can be any one of the [`GrayscaleEnhancementMode`]({{ site.enumerations }}parameter-mode-enums.html#grayscaleenhancementmode) Enumeration items.  
     
- **Default value**  
   `[EnumGrayscaleEnhancementMode.GEM_GENERAL, EnumGrayscaleEnhancementMode.GEM_SKIP, EnumGrayscaleEnhancementMode.GEM_SKIP, EnumGrayscaleEnhancementMode.GEM_SKIP, EnumGrayscaleEnhancementMode.GEM_SKIP, EnumGrayscaleEnhancementMode.GEM_SKIP, EnumGrayscaleEnhancementMode.GEM_SKIP, EnumGrayscaleEnhancementMode.GEM_SKIP]`  
     
- **Remarks**  
   The array index represents the priority of the item. The smaller index is, the higher priority is.

### TextureDetectionModes
Sets the mode and priority for texture detection. 

```csharp
EnumTextureDetectionMode[] TextureDetectionModes
```

- **Value range**  
   Each array item can be any one of the [`TextureDetectionMode`]({{ site.enumerations }}parameter-mode-enums.html#texturedetectionmode) Enumeration items.  
     
- **Default value**  
   `[EnumTextureDetectionMode.TDM_GENERAL_WIDTH_CONCENTRATION, EnumTextureDetectionMode.TDM_SKIP, EnumTextureDetectionMode.TDM_SKIP, EnumTextureDetectionMode.TDM_SKIP, EnumTextureDetectionMode.TDM_SKIP, EnumTextureDetectionMode.TDM_SKIP, EnumTextureDetectionMode.TDM_SKIP, EnumTextureDetectionMode.TDM_SKIP]`  
     
- **Remarks**  
   The array index represents the priority of the item. The smaller index is, the higher priority is.
