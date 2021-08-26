---
layout: default-layout
title: Dynamsoft Label Recognizer .NET API Reference - DLR_FurtherModes Struct
description: This page shows the DLR_FurtherModes Struct of Dynamsoft Label Recognizer for .NET SDK.
keywords: DLR_FurtherModes, .Net
needAutoGenerateSidebar: true
needGenerateH3Content: true
noTitleIndex: true
---


# DLR_FurtherModes
Stores the FurtherModes. 

```csharp
class Dynamsoft.DLR.DLR_FurtherModes
```

## Attributes
  
| Attribute | Type |
|---------- | ---- |
| [`ColourConversionModes`](#colourconversionmodes) | [`EnumColourConversionMode`]({{ site.enumerations }}colour-conversion-mode.html)[ ] |
| [`GrayscaleTransformationModes`](#grayscaletransformationmodes) | [`EnumGrayscaleTransformationMode`]({{ site.enumerations }}grayscale-transformation-mode.html)[ ] |
| [`RegionPredetectionModes`](#regionpredetectionmodes) | [`EnumRegionPredetectionMode`]({{ site.enumerations }}region-predetection-mode.html)[ ] |
| [`GrayscaleEnhancementModes`](#grayscaleenhancementmodes) | [`EnumGrayscaleEnhancementMode`]({{ site.enumerations }}grayscale-enhancement-mode.html)[] | 
| [`TextureDetectionModes`](#texturedetectionmodes) | [`EnumTextureDetectionMode`]({{ site.enumerations }}texture-detection-mode.html)[ ] |


&nbsp;

### ColourConversionModes
Sets the mode and priority for converting a colour image to a grayscale image.

```csharp
EnumColourConversionMode[] ColourConversionModes
```

- **Value range**  
   Each array item can be any one of the [`EnumColourConversionMode`]({{ site.enumerations }}colour-conversion-mode.html) Enumeration items. 
     
- **Default value**  
   `[EnumColourConversionMode.CICM_GENERAL, EnumColourConversionMode.CICM_SKIP, EnumColourConversionMode.CICM_SKIP, EnumColourConversionMode.CICM_SKIP, EnumColourConversionMode.CICM_SKIP, EnumColourConversionMode.CICM_SKIP, EnumColourConversionMode.CICM_SKIP, EnumColourConversionMode.CICM_SKIP]`  
     
- **Remarks**  
   The array index represents the priority of the item. The smaller index is, the higher priority is.  

&nbsp;

### GrayscaleTransformationModes
Sets the mode and priority for the grayscale image conversion.

```csharp
EnumGrayscaleTransformationMode[] GrayscaleTransformationModes
```

- **Value range**  
   Each array item can be any one of the [`EnumGrayscaleTransformationMode`]({{ site.enumerations }}grayscale-transformation-mode.html) Enumeration items. 
     
- **Default value**  
   `[EnumGrayscaleTransformationMode.GTM_ORIGINAL, EnumGrayscaleTransformationMode.GTM_SKIP, EnumGrayscaleTransformationMode.GTM_SKIP, EnumGrayscaleTransformationMode.GTM_SKIP, EnumGrayscaleTransformationMode.GTM_SKIP, EnumGrayscaleTransformationMode.GTM_SKIP, EnumGrayscaleTransformationMode.GTM_SKIP, EnumGrayscaleTransformationMode.GTM_SKIP]`  
     
- **Remarks**  
   The array index represents the priority of the item. The smaller index is, the higher priority is.  

&nbsp;

### RegionPredetectionModes
Sets the region pre-detection mode.

```csharp
EnumRegionPredetectionMode[] RegionPredetectionModes
```

- **Value range**  
   Each array item can be any one of the [`EnumRegionPredetectionMode`]({{ site.enumerations }}region-predetection-mode.html) Enumeration items.  
     
- **Default value**  
   `[EnumRegionPredetectionMode.RPM_GENERAL, EnumRegionPredetectionMode.RPM_SKIP, EnumRegionPredetectionMode.RPM_SKIP, EnumRegionPredetectionMode.RPM_SKIP, EnumRegionPredetectionMode.RPM_SKIP, EnumRegionPredetectionMode.RPM_SKIP, EnumRegionPredetectionMode.RPM_SKIP, EnumRegionPredetectionMode.RPM_SKIP]`  
     
- **Remarks**  
   The array index represents the priority of the item. The smaller index is, the higher priority is.

&nbsp;

### GrayscaleEnhancementModes
Sets the mode and priority for grayscale image preprocessing algorithms.

```csharp
EnumGrayscaleEnhancementMode[] GrayscaleEnhancementModes
```

- **Value range**  
   Each array item can be any one of the [`EnumGrayscaleEnhancementMode`]({{ site.enumerations }}grayscale-enhancement-mode.html) Enumeration items.  
     
- **Default value**  
   `[EnumGrayscaleEnhancementMode.GEM_GENERAL, EnumGrayscaleEnhancementMode.GEM_SKIP, EnumGrayscaleEnhancementMode.GEM_SKIP, EnumGrayscaleEnhancementMode.GEM_SKIP, EnumGrayscaleEnhancementMode.GEM_SKIP, EnumGrayscaleEnhancementMode.GEM_SKIP, EnumGrayscaleEnhancementMode.GEM_SKIP, EnumGrayscaleEnhancementMode.GEM_SKIP]`  
     
- **Remarks**  
   The array index represents the priority of the item. The smaller index is, the higher priority is.

&nbsp;

### TextureDetectionModes
Sets the mode and priority for texture detection. 

```csharp
EnumTextureDetectionMode[] TextureDetectionModes
```

- **Value range**  
   Each array item can be any one of the [`EnumTextureDetectionMode`]({{ site.enumerations }}texture-detection-mode.html) Enumeration items.  
     
- **Default value**  
   `[EnumTextureDetectionMode.TDM_GENERAL_WIDTH_CONCENTRATION, EnumTextureDetectionMode.TDM_SKIP, EnumTextureDetectionMode.TDM_SKIP, EnumTextureDetectionMode.TDM_SKIP, EnumTextureDetectionMode.TDM_SKIP, EnumTextureDetectionMode.TDM_SKIP, EnumTextureDetectionMode.TDM_SKIP, EnumTextureDetectionMode.TDM_SKIP]`  
     
- **Remarks**  
   The array index represents the priority of the item. The smaller index is, the higher priority is.
