---
layout: default-layout
title: Dynamsoft Label Recognizer .Net Class - DLRRuntimeSettings
description: This page shows the DLRRuntimeSettings struct of Dynamsoft Label Recognizer for .Net Language.
keywords: DLRRuntimeSettings, struct, .Net
needAutoGenerateSidebar: true
needGenerateH3Content: true
noTitleIndex: true
---


# class Dynamsoft.DLR.DLRRuntimeSettings
Defines a struct to configure the text recognizer runtime settings. These settings control the text recognition process.
  

## Attributes
  
| Attribute | Type |
|---------- | ---- |
| [`MaxThreadCount`](#maxthreadcount) | *int* |
| [`CharacterModelName`](#charactermodelname) | *string* |
| [`ReferenceRegion`](#referenceregion) | [`DLRReferenceRegion`](dlr-reference-region.md) |
| [`TextArea`](#textarea) | [`Quadrilateral`](quadrilateral.md) |
| [`DictionaryPath`](#dictionarypath) | *string* |
| [`DictionaryCorrectionThreshold`](#dictionarycorrectionthreshold) | [`DLRDictionaryCorrectionThreshold`](dlr-dictionary-correction-threshold.md) |
| [`BinarizationModes`](#binarizationmodes) | [`EnumBinarizationMode`]({{ site.enumerations }}binarization-mode.html)[ ] |
| [`FurtherModes`](#furthermodes) | [`DLRFurtherModes`](dlr-further-modes.md)|
| [`LineSpecification`](#linespecification) | [`DLRLineSpecification`](dlr-line-specification.md) |


&nbsp;

### MaxThreadCount
Sets the number of threads the algorithm will use to recognize label.
```csharp
int MaxThreadCount
```
- **Value range**   
    [1, 4]
      
- **Default value**   
    4
    
- **Remarks**   
    To keep a balance between speed and quality, the library concurrently runs four different threads by default.

&nbsp;

### CharacterModelName
The name of the CharacterModel.

```csharp
string CharacterModelName
```


&nbsp;

### ReferenceRegion
Sets the reference region to search for text.
```csharp
DLRReferenceRegion ReferenceRegion
```

&nbsp;

### TextArea
Sets the text area relative to the reference region.
```csharp
Quadrilateral TextArea
```

&nbsp;

### DictionaryPath
Sets the path of the dictionary file.
```csharp
string DictionaryPath
```

&nbsp;

### DictionaryCorrectionThreshold
Sets the threshold of dictionary error correction.
```csharp
DLRDictionaryCorrectionThreshold DictionaryCorrectionThreshold
```

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


&nbsp;

### FurtherModes
Sets further modes.

```csharp
DLRFurtherModes FurtherModes
```

- **See also**  
    [`DLRFurtherModes`](dlr-further-modes.md)


&nbsp;

### LineSpecification
Sets line specification.

```csharp
DLRLineSpecification LineSpecification
```

- **See also**  
    [`DLRLineSpecification`](dlr-line-specification.md)