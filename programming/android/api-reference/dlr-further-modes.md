---
layout: default-layout
title: Dynamsoft Label Recognizer Android API Reference - DLRFurtherModes Struct
description: This page shows the DLRFurtherModes Struct of Dynamsoft Label Recognizer for Android SDK.
keywords: DLRFurtherModes, Android
needAutoGenerateSidebar: true
needGenerateH3Content: true
noTitleIndex: true
---


# DLRFurtherModes
Stores the FurtherModes. 

```java
class com.dynamsoft.dlr.DLRFurtherModes
```

## Attributes
  
| Attribute | Type |
|---------- | ---- |
| [`colourConversionModes`](#colourconversionmodes) |  *int\[\]* |
| [`grayscaleTransformationModes`](#grayscaletransformationmodes) |  *int\[\]* |
| [`regionPredetectionModes`](#regionpredetectionmodes) |  *int\[\]* |
| [`grayscaleEnhancementModes`](#grayscaleenhancementmodes) |  *int\[\]* | 
| [`textureDetectionModes`](#texturedetectionmodes) | *int\[\]* |


&nbsp;

### colourConversionModes
Sets the mode and priority for converting a colour image to a grayscale image.

```java
int[] colourConversionModes
```

- **Value range**  
   Each array item can be any one of the [`EnumColourConversionMode`]({{ site.enumerations }}colour-conversion-mode.html) Enumeration items. 
     
- **Default value**  
   `[EnumColourConversionMode.CICM_GENERAL, EnumColourConversionMode.CICM_SKIP, EnumColourConversionMode.CICM_SKIP, EnumColourConversionMode.CICM_SKIP, EnumColourConversionMode.CICM_SKIP, EnumColourConversionMode.CICM_SKIP, EnumColourConversionMode.CICM_SKIP, EnumColourConversionMode.CICM_SKIP]`  
     
- **Remarks**  
   The array index represents the priority of the item. The smaller index is, the higher priority is.  

&nbsp;

### grayscaleTransformationModes
Sets the mode and priority for the grayscale image conversion.

```csharp
int[] grayscaleTransformationModes
```

- **Value range**  
   Each array item can be any one of the [`EnumGrayscaleTransformationMode`]({{ site.enumerations }}grayscale-transformation-mode.html) Enumeration items. 
     
- **Default value**  
   `[EnumGrayscaleTransformationMode.GTM_ORIGINAL, EnumGrayscaleTransformationMode.GTM_SKIP, EnumGrayscaleTransformationMode.GTM_SKIP, EnumGrayscaleTransformationMode.GTM_SKIP, EnumGrayscaleTransformationMode.GTM_SKIP, EnumGrayscaleTransformationMode.GTM_SKIP, EnumGrayscaleTransformationMode.GTM_SKIP, EnumGrayscaleTransformationMode.GTM_SKIP]`  
     
- **Remarks**  
   The array index represents the priority of the item. The smaller index is, the higher priority is.  

&nbsp;

### regionPredetectionModes
Sets the region pre-detection mode.

```java
int[] regionPredetectionModes
```

- **Value range**  
   Each array item can be any one of the [`EnumRegionPredetectionMode`]({{ site.enumerations }}region-predetection-mode.html) Enumeration items.  
     
- **Default value**  
   `[EnumRegionPredetectionMode.RPM_GENERAL, EnumRegionPredetectionMode.RPM_SKIP, EnumRegionPredetectionMode.RPM_SKIP, EnumRegionPredetectionMode.RPM_SKIP, EnumRegionPredetectionMode.RPM_SKIP, EnumRegionPredetectionMode.RPM_SKIP, EnumRegionPredetectionMode.RPM_SKIP, EnumRegionPredetectionMode.RPM_SKIP]`  
     
- **Remarks**  
   The array index represents the priority of the item. The smaller index is, the higher priority is.

&nbsp;

### grayscaleEnhancementModes
Sets the mode and priority for grayscale image preprocessing algorithms.

```java
int[] grayscaleEnhancementModes
```

- **Value range**  
   Each array item can be any one of the [`EnumGrayscaleEnhancementMode`]({{ site.enumerations }}grayscale-enhancement-mode.html) Enumeration items.  
     
- **Default value**  
   `[EnumGrayscaleEnhancementMode.GEM_GENERAL, EnumGrayscaleEnhancementMode.GEM_SKIP, EnumGrayscaleEnhancementMode.GEM_SKIP, EnumGrayscaleEnhancementMode.GEM_SKIP, EnumGrayscaleEnhancementMode.GEM_SKIP, EnumGrayscaleEnhancementMode.GEM_SKIP, EnumGrayscaleEnhancementMode.GEM_SKIP, EnumGrayscaleEnhancementMode.GEM_SKIP]`  
     
- **Remarks**  
   The array index represents the priority of the item. The smaller index is, the higher priority is.

&nbsp;

### textureDetectionModes
Sets the mode and priority for texture detection. 

```java
int[] textureDetectionModes
```

- **Value range**  
   Each array item can be any one of the [`EnumTextureDetectionMode`]({{ site.enumerations }}texture-detection-mode.html) Enumeration items.  
     
- **Default value**  
   `[EnumTextureDetectionMode.TDM_GENERAL_WIDTH_CONCENTRATION, EnumTextureDetectionMode.TDM_SKIP, EnumTextureDetectionMode.TDM_SKIP, EnumTextureDetectionMode.TDM_SKIP, EnumTextureDetectionMode.TDM_SKIP, EnumTextureDetectionMode.TDM_SKIP, EnumTextureDetectionMode.TDM_SKIP, EnumTextureDetectionMode.TDM_SKIP]`  
     
- **Remarks**  
   The array index represents the priority of the item. The smaller index is, the higher priority is.
