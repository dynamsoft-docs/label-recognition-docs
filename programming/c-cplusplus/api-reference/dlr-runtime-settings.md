---
layout: default-layout
title: Dynamsoft Label Recognizer C & C++ Struct - DLR_RuntimeSettings
description: This page shows the DLR_RuntimeSettings struct of Dynamsoft Label Recognizer for C & C++ Language.
keywords: DLR_RuntimeSettings, struct, c, c++
needAutoGenerateSidebar: true
needGenerateH3Content: true
noTitleIndex: true
---


# DLR_RuntimeSettings
Defines a struct to configure the text recognizer runtime settings. These settings control the text recognition process.

```cpp
typedef struct tagDLR_RuntimeSettings  DLR_RuntimeSettings
```  
  

## Attributes
  
| Attribute | Type |
|---------- | ---- |
| [`maxThreadCount`](#maxthreadcount) | *int* |
| [`characterModelName[64]`](#charactermodelname) | *char* |
| [`referenceRegion`](#referenceregion) | [`DLR_ReferenceRegion`](dlr-reference-region.md) |
| [`textArea`](#textarea) | [`Quadrilateral`](quadrilateral.md) |
| [`dictionaryPath[256]`](#dictionarypath) | *char* |
| [`dictionaryCorrectionThreshold`](#dictionarycorrectionthreshold) |  [`DLR_DictionaryCorrectionThreshold`](dlr-dictionary-correction-threshold.md) |
| [`binarizationModes[8]`](#binarizationmodes) | [`BinarizationMode`]({{ site.enumerations }}binarization-mode.html) |
| [`furtherModes`](#furthermodes) | [`DLR_FurtherModes`](dlr-further-modes.md)|
| [`reserved`](#reserved) | *char\[64\]* |


&nbsp;

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

&nbsp;

### characterModelName
The name of the CharacterModel.
```cpp
char characterModelName[64]
```

&nbsp;

### referenceRegion
Sets the reference region to search for text.
```cpp
DLR_ReferenceRegion referenceRegion
```

&nbsp;

### textArea
Sets the text area relative to the reference region.
```cpp
Quadrilateral textArea
```

&nbsp;

### dictionaryPath
Sets the path of the dictionary file.
```cpp
char dictionaryPath[256]
```

&nbsp;

### dictionaryCorrectionThreshold
Sets the threshold of dictionary error correction.
```cpp
DLR_DictionaryCorrectionThreshold dictionaryCorrectionThreshold
```

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


&nbsp;

### furtherModes
Sets further modes.

```cpp
DLR_FurtherModes furtherModes
```

- **See also**  
    [`DLR_FurtherModes`](dlr-further-modes.md)


&nbsp;

### reserved
Reserved memory for struct. The length of this array indicates the size of the memory reserved for this struct.
```cpp
char reserved[64]
```

