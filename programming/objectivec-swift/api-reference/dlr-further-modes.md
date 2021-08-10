---
layout: default-layout
title: Dynamsoft Label Recognizer iOS API Reference - iDLRFurtherModes
description: This page shows the iDLRFurtherModes of Dynamsoft Label Recognizer for iOS SDK.
keywords: iDLRFurtherModes, iOS
needAutoGenerateSidebar: true
needGenerateH3Content: true
noTitleIndex: true
---


# iDLRFurtherModes
Stores the FurtherModes. 

```objc
@interface iDLRFurtherModes : NSObject 
```

## Attributes
  
| Attribute | Type |
|---------- | ---- |
| [`colourConversionModes`](#colourconversionmodes) | *NSArray\** |
| [`grayscaleTransformationModes`](#grayscaletransformationmodes) | *NSArray\** |
| [`regionPredetectionModes`](#regionpredetectionmodes) | *NSArray\** |
| [`grayscaleEnhancementModes`](#grayscaleenhancementmodes) | *NSArray\** | 
| [`textureDetectionModes`](#texturedetectionmodes) | *NSArray\** |


&nbsp;

### colourConversionModes
Sets the mode and priority for converting a colour image to a grayscale image.

```objc
NSArray * colourConversionModes
```

- **Value range**  
   Each array item can be any one of the [`EnumColourConversionMode`]({{ site.enumerations }}colour-conversion-mode.html) Enumeration items. 
     
- **Default value**  
   `[EnumColourConversionModeGeneral, EnumColourConversionModeSkip, EnumColourConversionModeSkip, EnumColourConversionModeSkip, EnumColourConversionModeSkip, EnumColourConversionModeSkip, EnumColourConversionModeSkip, EnumColourConversionModeSkip]`  
     
- **Remarks**  
   The array index represents the priority of the item. The smaller index is, the higher priority is.  



&nbsp;

### grayscaleTransformationModes
Sets the grayscale transformation mode.
```objc
NSArray * grayscaleTransformationModes
```
- **Value range**   
    Each array item can be any one of the [`EnumGrayscaleTransformationMode`]({{ site.enumerations }}grayscale-transformation-mode.html) Enumeration items.
      
- **Default value**   
    `[EnumGrayscaleTransformationModeOriginal,EnumGrayscaleTransformationModeSkip,EnumGrayscaleTransformationModeSkip,EnumGrayscaleTransformationModeSkip,EnumGrayscaleTransformationModeSkip,EnumGrayscaleTransformationModeSkip,EnumGrayscaleTransformationModeSkip,EnumGrayscaleTransformationModeSkip]`
    
- **Remarks**   
    The array index represents the priority of the item. The smaller index is, the higher priority is.
  


&nbsp;

### regionPredetectionModes
Sets the region pre-detection mode.
```objc
NSArray * regionPredetectionModes
```
- **Value range**   
    Each array item can be any one of the [`EnumRegionPredetectionMode`]({{ site.enumerations }}region-predetection-mode.html) Enumeration items.
      
- **Default value**   
    `[EnumRegionPredetectionModeSkip,EnumRegionPredetectionModeSkip,EnumRegionPredetectionModeSkip,EnumRegionPredetectionModeSkip,EnumRegionPredetectionModeSkip,EnumRegionPredetectionModeSkip,EnumRegionPredetectionModeSkip,EnumRegionPredetectionModeSkip]`
    
- **Remarks**   
    The array index represents the priority of the item. The smaller index is, the higher priority is.


&nbsp;

### grayscaleEnhancementModes
Sets the mode and priority for grayscale image preprocessing algorithms.

```objc
NSArray * GrayscaleEnhancementModes
```

- **Value range**  
   Each array item can be any one of the [`EnumGrayscaleEnhancementMode`]({{ site.enumerations }}grayscale-enhancement-mode.html) Enumeration items.  
     
- **Default value**  
   `[EnumGrayscaleEnhancementModeGeneral, EnumGrayscaleEnhancementModeSkip, EnumGrayscaleEnhancementModeSkip, EnumGrayscaleEnhancementModeSkip, EnumGrayscaleEnhancementModeSkip, EnumGrayscaleEnhancementModeSkip, EnumGrayscaleEnhancementModeSkip, EnumGrayscaleEnhancementModeSkip]`  
     
- **Remarks**  
   The array index represents the priority of the item. The smaller index is, the higher priority is.


&nbsp;

### TextureDetectionModes
Sets the mode and priority for texture detection. 

```objc
NSArray * textureDetectionModes
```

- **Value range**  
   Each array item can be any one of the [`EnumTextureDetectionMode`]({{ site.enumerations }}texture-detection-mode.html) Enumeration items.  
     
- **Default value**  
   `[EnumTextureDetectionModeGeneralWidthConcentration, EnumTextureDetectionModeSkip, EnumTextureDetectionModeSkip, EnumTextureDetectionModeSkip, EnumTextureDetectionModeSkip, EnumTextureDetectionModeSkip, EnumTextureDetectionModeSkip, EnumTextureDetectionModeSkip]`  
     
- **Remarks**  
   The array index represents the priority of the item. The smaller index is, the higher priority is.
