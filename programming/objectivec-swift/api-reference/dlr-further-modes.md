---
layout: default-layout
title: Dynamsoft Label Recognizer .NET API Reference - DLRFurtherModes Struct
description: This page shows the DLRFurtherModes Struct of Dynamsoft Label Recognizer for .NET SDK.
keywords: DLRFurtherModes, .Net
needAutoGenerateSidebar: true
needGenerateH3Content: true
---


# class Dynamsoft.DLR.DLRFurtherModes
Stores the FurtherModes. 

## Attributes
  
| Attribute | Type |
|---------- | ---- |
| [`colourConversionModes`](#colourconversionmodes) | *NSArray\** |
| [`grayscaleTransformationModes`](#grayscaletransformationmodes) | *NSArray\** |
| [`regionPredetectionModes`](#regionpredetectionmodes) | *NSArray\** |
| [`grayscaleEnhancementModes`](#grayscaleenhancementmodes) | *NSArray\** | 
| [`textureDetectionModes`](#texturedetectionmodes) | *NSArray\** |


### colourConversionModes
Sets the mode and priority for converting a colour image to a grayscale image.

```objc
NSArray * colourConversionModes
```

- **Value range**  
   Each array item can be any one of the [`EnumColourConversionMode`]({{ site.enumerations }}parameter-mode-enums.html#colourconversionmode) Enumeration items. 
     
- **Default value**  
   `[EnumColourConversionModeGENERAL, EnumColourConversionModeSkip, EnumColourConversionModeSkip, EnumColourConversionModeSkip, EnumColourConversionModeSkip, EnumColourConversionModeSkip, EnumColourConversionModeSkip, EnumColourConversionModeSkip]`  
     
- **Remarks**  
   The array index represents the priority of the item. The smaller index is, the higher priority is.  



### grayscaleTransformationModes
Sets the grayscale transformation mode.
```objc
NSArray * grayscaleTransformationModes
```
- **Value range**   
    Each array item can be any one of the [`EnumGrayscaleTransformationMode`]({{ site.enumerations }}parameter-mode-enums.html#grayscaletransformationmode) Enumeration items.
      
- **Default value**   
    `[EnumGrayscaleTransformationModeOriginal,EnumGrayscaleTransformationModeSkip,EnumGrayscaleTransformationModeSkip,EnumGrayscaleTransformationModeSkip,EnumGrayscaleTransformationModeSkip,EnumGrayscaleTransformationModeSkip,EnumGrayscaleTransformationModeSkip,EnumGrayscaleTransformationModeSkip]`
    
- **Remarks**   
    The array index represents the priority of the item. The smaller index is, the higher priority is.
  


### regionPredetectionModes
Sets the region pre-detection mode.
```objc
NSArray * regionPredetectionModes
```
- **Value range**   
    Each array item can be any one of the [`EnumRegionPredetectionMode`]({{ site.enumerations }}parameter-mode-enums.html#regionpredetectionmode) Enumeration items.
      
- **Default value**   
    `[EnumRegionPredetectionModeSkip,EnumRegionPredetectionModeSkip,EnumRegionPredetectionModeSkip,EnumRegionPredetectionModeSkip,EnumRegionPredetectionModeSkip,EnumRegionPredetectionModeSkip,EnumRegionPredetectionModeSkip,EnumRegionPredetectionModeSkip]`
    
- **Remarks**   
    The array index represents the priority of the item. The smaller index is, the higher priority is.


### grayscaleEnhancementModes
Sets the mode and priority for grayscale image preprocessing algorithms.

```objc
NSArray * GrayscaleEnhancementModes
```

- **Value range**  
   Each array item can be any one of the [`EnumGrayscaleEnhancementMode`]({{ site.enumerations }}parameter-mode-enums.html#grayscaleenhancementmode) Enumeration items.  
     
- **Default value**  
   `[EnumGrayscaleEnhancementModeGENERAL, EnumGrayscaleEnhancementModeSkip, EnumGrayscaleEnhancementModeSkip, EnumGrayscaleEnhancementModeSkip, EnumGrayscaleEnhancementModeSkip, EnumGrayscaleEnhancementModeSkip, EnumGrayscaleEnhancementModeSkip, EnumGrayscaleEnhancementModeSkip]`  
     
- **Remarks**  
   The array index represents the priority of the item. The smaller index is, the higher priority is.


### TextureDetectionModes
Sets the mode and priority for texture detection. 

```objc
NSArray * textureDetectionModes
```

- **Value range**  
   Each array item can be any one of the [`EnumTextureDetectionMode`]({{ site.enumerations }}parameter-mode-enums.html#texturedetectionmode) Enumeration items.  
     
- **Default value**  
   `[EnumTextureDetectionModeGeneralWidthConcentration, EnumTextureDetectionModeSkip, EnumTextureDetectionModeSkip, EnumTextureDetectionModeSkip, EnumTextureDetectionModeSkip, EnumTextureDetectionModeSkip, EnumTextureDetectionModeSkip, EnumTextureDetectionModeSkip]`  
     
- **Remarks**  
   The array index represents the priority of the item. The smaller index is, the higher priority is.
