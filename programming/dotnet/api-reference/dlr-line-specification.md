---
layout: default-layout
title: Dynamsoft Label Recognizer .NET API Reference - DLR_LineSpecification Struct
description: This page shows the DLR_LineSpecification Struct of Dynamsoft Label Recognizer for .NET SDK.
keywords: DLR_LineSpecification, .Net
needAutoGenerateSidebar: true
needGenerateH3Content: true
noTitleIndex: true
---


# DLR_LineSpecification
Stores the settings of text line.

```csharp
class Dynamsoft.DLR.DLR_LineSpecification
```

## Attributes
  
| Attribute | Type |
|---------- | ---- |
| [`GrayscaleEnhancementModes`](#grayscaleenhancementmodes) | [`EnumGrayscaleEnhancementMode`]({{ site.enumerations }}grayscale-enhancement-mode.html)[] | 
| [`BinarizationModes`](#binarizationmodes) | [`EnumBinarizationMode`]({{ site.enumerations }}binarization-mode.html)[ ] |


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

### BinarizationModes
Sets the mode and priority for binarization.

```csharp
EnumBinarizationMode[] BinarizationModes
```

- **Value range**   
    Each array item can be any one of the [`EnumBinarizationMode`]({{ site.enumerations }}binarization-mode.html) Enumeration items.
      
- **Default value**   
    `[EnumBinarizationMode.BM_LOCAL_BLOCK, EnumBinarizationMode.BM_SKIP, EnumBinarizationMode.BM_SKIP, EnumBinarizationMode.BM_SKIP, EnumBinarizationMode.BM_SKIP, EnumBinarizationMode.BM_SKIP, EnumBinarizationMode.BM_SKIP, EnumBinarizationMode.BM_SKIP]`
    
- **Remarks**   
    The array index represents the priority of the item. The smaller index is, the higher priority is.