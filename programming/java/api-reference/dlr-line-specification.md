---
layout: default-layout
title: Dynamsoft Label Recognizer Java API Reference - DLRLineSpecification Struct
description: This page shows the DLRLineSpecification Struct of Dynamsoft Label Recognizer for Java SDK.
keywords: DLRLineSpecification, Java
needAutoGenerateSidebar: true
needGenerateH3Content: true
noTitleIndex: true
---


# DLRLineSpecification
Stores the settings of text line.

```java
class com.dynamsoft.dlr.DLRLineSpecification
```

## Attributes
  
| Attribute | Type |
|---------- | ---- |
| [`grayscaleEnhancementModes`](#grayscaleenhancementmodes) | *int\[\]* | 
| [`binarizationModes`](#binarizationmodes) | *int\[\]*  |


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

### binarizationModes
Sets the mode and priority for binarization.

```java
int[] binarizationModes
```

- **Value range**   
    Each array item can be any one of the [`EnumBinarizationMode`]({{ site.enumerations }}binarization-mode.html) Enumeration items.
      
- **Default value**   
    `[EnumBinarizationMode.BM_LOCAL_BLOCK, EnumBinarizationMode.BM_SKIP, EnumBinarizationMode.BM_SKIP, EnumBinarizationMode.BM_SKIP, EnumBinarizationMode.BM_SKIP, EnumBinarizationMode.BM_SKIP, EnumBinarizationMode.BM_SKIP, EnumBinarizationMode.BM_SKIP]`
    
- **Remarks**   
    The array index represents the priority of the item. The smaller index is, the higher priority is.