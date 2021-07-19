---
layout: default-layout
title: Dynamsoft Label Recognizer C & C++ Struct - DLR_RuntimeSettings
description: This page shows the DLR_RuntimeSettings struct of Dynamsoft Label Recognizer for C & C++ Language.
keywords: DLR_RuntimeSettings, struct, c, c++
needAutoGenerateSidebar: true
needGenerateH3Content: true
---


# DLR_RuntimeSettings
Defines a struct to configure the text recognizer runtime settings. These settings control the text recognition process.

## Typedefs

```cpp
typedef struct tagDLR_RuntimeSettings  DLR_RuntimeSettings
```  
  
---
  

## Attributes
  
| Attribute | Type |
|---------- | ---- |
| [`maxThreadCount`](#maxthreadcount) | *int* |
| [`characterModelName[64]`](#charactermodelname) | *char* |
| [`referenceRegion`](#referenceregion) | [`DLR_ReferenceRegion`](dlr-reference-region.md) |
| [`textArea`](#textarea) | [`Quadrilateral`](quadrilateral.md) |
| [`dictionaryPath[256]`](#dictionarypath) | *char* |
| [`dictionaryCorrectionThreshold`](#dictionarycorrectionthreshold) |  [`DLRDictionaryCorrectionThreshold`](dlr-dictionary-correction-threshold.md) |
| [`binarizationModes[8]`](#binarizationmodes) | [`BinarizationMode`]({{ site.enumerations }}parameter-mode-enums.html#binarizationmode) |
| [`furtherModes`](#furthermodes) | [`DLR_FurtherModes`](dlr-further-modes.md)|
| [`lineSpecification`](#linespecification) | [`DLR_LineSpecification`](dlr-line-specification.md) |
| [`reserved`](#reserved) | *char\[64\]* |


### maxThreadCount
Sets the number of threads the algorithm will use to recognize label.
```cpp
int maxThreadCount
```
- **Value range**   
    [1, 4]
      
- **Default value**   
    4
    
- **Remarks**   
    To keep a balance between speed and quality, the library concurrently runs four different threads by default.

### characterModelName
The name of the CharacterModel.
```cpp
char characterModelName[64]
```

### referenceRegion
Sets the reference region to search for text.
```cpp
DLRReferenceRegion referenceRegion
```

### textArea
Sets the text area relative to the reference region.
```cpp
DLRQuadrilateral textArea
```

### grayscaleTransformationModes
Sets the grayscale transformation mode.
```cpp
DLRGrayscaleTransformationMode grayscaleTransformationModes[8]
```
- **Value range**   
    Each array item can be any one of the [`DLRGrayscaleTransformationMode`]({{ site.enumerations }}parameter-mode-enums.html#grayscaletransformationmode) Enumeration items.
      
- **Default value**   
    `[DLR_GTM_ORIGINAL,DLR_GTM_SKIP,DLR_GTM_SKIP,DLR_GTM_SKIP,DLR_GTM_SKIP,DLR_GTM_SKIP,DLR_GTM_SKIP,DLR_GTM_SKIP]`
    
- **Remarks**   
    The array index represents the priority of the item. The smaller index is, the higher priority is.
  

### dictionaryPath
Sets the path of the dictionary file.
```cpp
char dictionaryPath[256]
```

### dictionaryCorrectionThreshold
Sets the threshold of dictionary error correction.
```cpp
DLR_DictionaryCorrectionThreshold dictionaryCorrectionThreshold
```

### binarizationModes
Sets the mode and priority for binarization.

```cpp
BinarizationMode binarizationModes[8]
```

- **Value range**   
    Each array item can be any one of the [`BinarizationMode`]({{ site.enumerations }}parameter-mode-enums.html#binarizationmode) Enumeration items.
      
- **Default value**   
    `[BM_LOCAL_BLOCK, BM_SKIP, BM_SKIP, BM_SKIP, BM_SKIP, BM_SKIP, BM_SKIP, BM_SKIP]`
    
- **Remarks**   
    The array index represents the priority of the item. The smaller index is, the higher priority is.


### furtherModes
Sets further modes.

```cpp
DLR_FurtherModes furtherModes
```

- **See also**  
    [`DLR_FurtherModes`](dlr-further-modes.md)


### lineSpecification
Sets line specification.

```cpp
DLR_LineSpecification lineSpecification
```

- **See also**  
    [`DLR_LineSpecification`](dlr-line-specification.md)


### reserved
Reserved memory for struct. The length of this array indicates the size of the memory reserved for this struct.
```cpp
char reserved[64]
```

