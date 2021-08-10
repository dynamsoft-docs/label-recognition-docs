---
layout: default-layout
title: Dynamsoft Label Recognizer Java Class - DLRRuntimeSettings
description: This page shows the DLRRuntimeSettings struct of Dynamsoft Label Recognizer for Java Language.
keywords: DLRRuntimeSettings, struct, java
needAutoGenerateSidebar: true
needGenerateH3Content: true
noTitleIndex: true
---


# DLRRuntimeSettings
Defines a struct to configure the text recognizer runtime settings. These settings control the text recognition process.
  
```java
class com.dynamsoft.dlr.DLRRuntimeSettings
```  

## Attributes
  
| Attribute | Type |
|---------- | ---- |
| [`maxThreadCount`](#maxthreadcount) | *int* |
| [`characterModelName`](#charactermodelname) | *String* |
| [`referenceRegion`](#referenceregion) | [`DLRReferenceRegion`](dlr-reference-region.md) |
| [`textArea`](#textarea) | [`DLRQuadrilateral`](dlr-quadrilateral.md) |
| [`dictionaryPath`](#dictionarypath) | *String* |
| [`dictionaryCorrectionThreshold`](#dictionarycorrectionthreshold) | [`DLRDictionaryCorrectionThreshold`](dlr-dictionary-correction-threshold.md) |
| [`binarizationModes`](#binarizationmodes) | *int\[\]* |
| [`furtherModes`](#furthermodes) | [`DLRFurtherModes`](dlr-further-modes.md)|

&nbsp;

### maxThreadCount
Sets the number of threads the algorithm will use to recognize label.
```java
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
```java
String characterModelName
```

&nbsp;

### referenceRegion
Sets the reference region to search for text.
```java
DLRReferenceRegion referenceRegion
```

&nbsp;

### textArea
Sets the text area relative to the reference region.
```java
Quadrilateral textArea
```

&nbsp;

### dictionaryPath
Sets the path of the dictionary file.
```java
String dictionaryPath
```

&nbsp;

### dictionaryCorrectionThreshold
Sets the threshold of dictionary error correction.
```java
DLRDictionaryCorrectionThreshold dictionaryCorrectionThreshold
```


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


&nbsp;

### furtherModes
Sets further modes.

```java
DLRFurtherModes furtherModes
```

- **See also**  
    [`DLRFurtherModes`](dlr-further-modes.md)

