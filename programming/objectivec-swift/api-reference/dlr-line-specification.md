---
layout: default-layout
title: Dynamsoft Label Recognizer iOS API Reference - iDLRLineSpecification Struct
description: This page shows the iDLRLineSpecification Struct of Dynamsoft Label Recognizer for iOS SDK.
keywords: iDLRLineSpecification, iOS
needAutoGenerateSidebar: true
needGenerateH3Content: true
noTitleIndex: true
---


# iDLRLineSpecification
Stores the settings of text line.

```objc
@interface iDLRLineSpecification : NSObject 
```

## Attributes
  
| Attribute | Type |
|---------- | ---- |
| [`grayscaleEnhancementModes`](#grayscaleenhancementmodes) | *NSArray\** | 
| [`binarizationModes`](#binarizationmodes) | *NSArray\** |

&nbsp;

### grayscaleEnhancementModes
Sets the mode and priority for grayscale image preprocessing algorithms.

```objc
NSArray * grayscaleEnhancementModes
```

- **Value range**  
   Each array item can be any one of the [`EnumGrayscaleEnhancementMode`]({{ site.enumerations }}grayscale-enhancement-mode.html) Enumeration items.  
     
- **Default value**  
   `[EnumGrayscaleEnhancementModeGeneral, EnumGrayscaleEnhancementModeSkip, EnumGrayscaleEnhancementModeSkip, EnumGrayscaleEnhancementModeSkip, EnumGrayscaleEnhancementModeSkip, EnumGrayscaleEnhancementModeSkip, EnumGrayscaleEnhancementModeSkip, EnumGrayscaleEnhancementModeSkip]`  
     
- **Remarks**  
   The array index represents the priority of the item. The smaller index is, the higher priority is.


&nbsp;

### binarizationModes
Sets the mode and priority for binarization.

```objc
NSArray * binarizationModes
```

- **Value range**   
    Each array item can be any one of the [`EnumBinarizationMode`]({{ site.enumerations }}binarization-mode.html) Enumeration items.
      
- **Default value**   
    `[EnumBinarizationModeLocalBlock, EnumBinarizationModeSkip, EnumBinarizationModeSkip, EnumBinarizationModeSkip, EnumBinarizationModeSkip, EnumBinarizationModeSkip, EnumBinarizationModeSkip, EnumBinarizationModeSkip]`
    
- **Remarks**   
    The array index represents the priority of the item. The smaller index is, the higher priority is.