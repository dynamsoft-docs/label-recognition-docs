---
layout: default-layout
title: Dynamsoft Label Recognition .Net Class - DLR_RuntimeSettings
description: This page shows the DLR_RuntimeSettings struct of Dynamsoft Label Recognition for .Net Language.
keywords: DLR_RuntimeSettings, struct, .Net
needAutoGenerateSidebar: true
---


# DLR_RuntimeSettings
Defines a struct to configure the text recognizer runtime settings. These settings control the text recognition process.
  

## Attributes
  
| Attribute | Type |
|---------- | ---- |
| [`MaxThreadCount`](#maxthreadcount) | *int* |
| [`CharacterModelName`](#charactermodelname) | *string* |
| [`LinesCount`](#linescount) | *int* |
| [`RegionPredetectionModes`](#regionpredetectionmodes) | *int\[8\]* |
| [`ReferenceRegion`](#referenceregion) | [`DLR_ReferenceRegion`](dlr-reference-region.md) |
| [`TextArea`](#textarea) | [`DLR_Quadrilateral`](dlr-quadrilateral.md) |
| [`GrayscaleTransformationModes`](#grayscaletransformationmodes) | *int\[8\]* |


### MaxThreadCount
Sets the number of threads the algorithm will use to recognize label.
```csharp
int Dynamsoft.DLR.DLR_RuntimeSettings.MaxThreadCount
```
- **Value range**   
    [1, 4]
      
- **Default value**   
    4
    
- **Remarks**   
    To keep a balance between speed and quality, the library concurrently runs four different threads by default.

### CharacterModelName
The name of the CharacterModel.
```csharp
string Dynamsoft.DLR.DLR_RuntimeSettings.CharacterModelName
```

### LinesCount
Sets the text lines count of the text area.
```csharp
int Dynamsoft.DLR.DLR_RuntimeSettings.LinesCount
```
- **Value range**   
    [0, 200]
      
- **Default value**   
    0
    
- **Remarks**   
    0: line count is not certain.


### RegionPredetectionModes
Sets the region pre-detection mode.
```csharp
int[] Dynamsoft.DLR.DLR_RuntimeSettings.RegionPredetectionModes[8]
```
- **Value range**   
    Each array item can be any one of the [`DLRRegionPredetectionMode`]({{ site.enumerations }}parameter-mode-enums.html#dlrregionpredetectionmode) Enumeration items.
      
- **Default value**   
    `[DLR_RPM_SKIP,DLR_RPM_SKIP,DLR_RPM_SKIP,DLR_RPM_SKIP,DLR_RPM_SKIP,DLR_RPM_SKIP,DLR_RPM_SKIP,DLR_RPM_SKIP]`
    
- **Remarks**   
    The array index represents the priority of the item. The smaller index is, the higher priority is.


### ReferenceRegion
Sets the reference region to search for text.
```csharp
DLR_ReferenceRegion Dynamsoft.DLR.DLR_RuntimeSettings.ReferenceRegion
```

### TextArea
Sets the text area relative to the reference region.
```csharp
DLR_Quadrilateral Dynamsoft.DLR.DLR_RuntimeSettings.TextArea
```

### GrayscaleTransformationModes
Sets the grayscale transformation mode.
```csharp
int[] Dynamsoft.DLR.DLR_RuntimeSettings.GrayscaleTransformationModes[8]
```
- **Value range**   
    Each array item can be any one of the [`DLRGrayscaleTransformationMode`]({{ site.enumerations }}parameter-mode-enums.html#dlrgrayscaletransformationmode) Enumeration items.
      
- **Default value**   
    `[DLR_GTM_ORIGINAL,DLR_GTM_SKIP,DLR_GTM_SKIP,DLR_GTM_SKIP,DLR_GTM_SKIP,DLR_GTM_SKIP,DLR_GTM_SKIP,DLR_GTM_SKIP]`
    
- **Remarks**   
    The array index represents the priority of the item. The smaller index is, the higher priority is.
  

