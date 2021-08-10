---
layout: default-layout
title: Dynamsoft Label Recognizer C&C++ API Reference - DLR_LineSpecification Struct
description: This page shows the DLR_LineSpecification Struct of Dynamsoft Label Recognizer for C&C++ SDK.
keywords: DLR_LineSpecification, c, c++
needAutoGenerateSidebar: true
needGenerateH3Content: true
noTitleIndex: true
---


# DLR_LineSpecification
Stores the settings of text line. 

```cpp
typedef struct tagDLR_LineSpecification DLR_LineSpecification
``` 

## Attributes
  
| Attribute | Type |
|---------- | ---- |
| [`grayscaleEnhancementModes[8]`](#grayscaleenhancementmodes) | [`GrayscaleEnhancementMode`]({{ site.enumerations }}grayscale-enhancement-mode.html) | 
| [`binarizationModes[8]`](#binarizationmodes) | [`BinarizationMode`]({{ site.enumerations }}binarization-mode.html) |


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

### binarizationModes
Sets the mode and priority for binarization.

```cpp
BinarizationMode binarizationModes[8]
```

- **Value range**   
    Each array item can be any one of the [`BinarizationMode`]({{ site.enumerations }}binarization-mode.html) Enumeration items.
      
- **Default value**   
    `[BM_LOCAL_BLOCK, BM_SKIP, BM_SKIP, BM_SKIP, BM_SKIP, BM_SKIP, BM_SKIP, BM_SKIP]`
    
- **Remarks**   
    The array index represents the priority of the item. The smaller index is, the higher priority is.