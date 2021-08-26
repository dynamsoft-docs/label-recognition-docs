---
layout: default-layout
title: Dynamsoft Label Recognition Android Class - DLRRuntimeSettings
description: This page shows the DLRRuntimeSettings struct of Dynamsoft Label Recognition for Android Language.
keywords: DLRRuntimeSettings, struct, android
needAutoGenerateSidebar: true
---


# DLRRuntimeSettings
Defines a struct to configure the text recognizer runtime settings. These settings control the text recognition process.
  

## Attributes
  
| Attribute | Type |
|---------- | ---- |
| [`maxThreadCount`](#maxthreadcount) | *int* |
| [`characterModelName`](#charactermodelname) | *String* |
| [`linesCount`](#linescount) | *int* |
| [`regionPredetectionModes`](#regionpredetectionmodes) | *int\[\]* |
| [`referenceRegion`](#referenceregion) | [`DLRReferenceRegion`](dlr-reference-region.md) |
| [`textArea`](#textarea) | [`DLRQuadrilateral`](dlr-quadrilateral.md) |
| [`grayscaleTransformationModes`](#grayscaletransformationmodes) | *int\[\]* |


### maxThreadCount
Sets the number of threads the algorithm will use to recognize label.
```java
int com.dynamsoft.dlr.DLRRuntimeSettings.maxThreadCount
```
- **Value range**   
    [1, 4]
      
- **Default value**   
    4
    
- **Remarks**   
    To keep a balance between speed and quality, the library concurrently runs four different threads by default.

### characterModelName
The name of the CharacterModel.
```java
String com.dynamsoft.dlr.DLRRuntimeSettings.characterModelName
```

### linesCount
Sets the text lines count of the text area.
```java
int com.dynamsoft.dlr.DLRRuntimeSettings.linesCount
```
- **Value range**   
    [0, 200]
      
- **Default value**   
    0
    
- **Remarks**   
    0: line count is not certain.


### regionPredetectionModes
Sets the region pre-detection mode.
```java
int[] com.dynamsoft.dlr.DLRRuntimeSettings.regionPredetectionModes[]
```
- **Value range**   
    Each array item can be any one of the [`DLRRegionPredetectionMode`]({{ site.enumerations }}parameter-mode-enums.html#dlrregionpredetectionmode) Enumeration items.
      
- **Default value**   
    `[DLR_RPM_SKIP,DLR_RPM_SKIP,DLR_RPM_SKIP,DLR_RPM_SKIP,DLR_RPM_SKIP,DLR_RPM_SKIP,DLR_RPM_SKIP,DLR_RPM_SKIP]`
    
- **Remarks**   
    The array index represents the priority of the item. The smaller index is, the higher priority is.


### referenceRegion
Sets the reference region to search for text.
```java
DLRReferenceRegion com.dynamsoft.dlr.DLRRuntimeSettings.referenceRegion
```

### textArea
Sets the text area relative to the reference region.
```java
DLRQuadrilateral com.dynamsoft.dlr.DLRRuntimeSettings.textArea
```

### grayscaleTransformationModes
Sets the grayscale transformation mode.
```java
int[] com.dynamsoft.dlr.DLRRuntimeSettings.grayscaleTransformationModes[]
```
- **Value range**   
    Each array item can be any one of the [`DLRGrayscaleTransformationMode`]({{ site.enumerations }}parameter-mode-enums.html#dlrgrayscaletransformationmode) Enumeration items.
      
- **Default value**   
    `[DLR_GTM_ORIGINAL,DLR_GTM_SKIP,DLR_GTM_SKIP,DLR_GTM_SKIP,DLR_GTM_SKIP,DLR_GTM_SKIP,DLR_GTM_SKIP,DLR_GTM_SKIP]`
    
- **Remarks**   
    The array index represents the priority of the item. The smaller index is, the higher priority is.
  

