---
layout: default-layout
title: DLRRuntimeSettings - Dynamsoft Label Recognizer JavaScript Interface
description: This page shows the DLRRuntimeSettings interface of Dynamsoft Label Recognizer for JavaScript.
keywords: DLRRuntimeSettings, javascript, interface
needAutoGenerateSidebar: false
noTitleIndex: true
breadcrumbText: DLRRuntimeSettings
---

# DLRRuntimeSettings

Interface for setting up the recognition process.

## Attributes

| Attribute | Type |
|---------- | ---- |
| [ `maxThreadCount` ](#maxthreadcount) | *number* |
| [ `characterModelName` ](#charactermodelname) | *string* |
| [ `linesCount` ](#linescount) | *number* |
| [ `regionPredetectionModes` ](#regionpredetectionmodes) | [ `DLRRegionPredetectionMode` ]({{ site.enumerations }}parameter-mode-enums.html#dlrregionpredetectionmode)\[8\] |
| [ `referenceRegion` ](#referenceregion) | [ `DLRReferenceRegion` ](dlr-reference-region.md) |
| [ `textArea` ](#textarea) | [ `Quadrilateral` ](quadrilateral.md) |
| [ `grayscaleTransformationModes` ](#grayscaletransformationmodes) | [ `DLRGrayscaleTransformationMode` ]({{ site.enumerations }}parameter-mode-enums.html#dlrgrayscaletransformationmode)\[8\] |

### maxThreadCount

Sets the number of threads the algorithm will use to recognize label.

* **Value range**

[1, 4]

* **Default value**

4

* **Remarks**

To keep a balance between speed and quality, the library concurrently runs four different threads by default.

### characterModelName

The name of the CharacterModel.

### linesCount

Sets the text lines count of the text area.

* **Value range**

[0, 200]
      
* **Default value**

0

* **Remarks**

0: line count is not certain.

### regionPredetectionModes

Sets the region pre-detection mode.

* **Value range**

Each array item can be any one of the [ `DLRRegionPredetectionMode` ]({{ site.enumerations }}parameter-mode-enums.html#dlrregionpredetectionmode) Enumeration items.

* **Default value** 
 `[DLR_RPM_SKIP, DLR_RPM_SKIP, DLR_RPM_SKIP, DLR_RPM_SKIP, DLR_RPM_SKIP, DLR_RPM_SKIP, DLR_RPM_SKIP, DLR_RPM_SKIP]`

* **Remarks**

The array index represents the priority of the item. The smaller index is, the higher priority is.

### referenceRegion

Sets the reference region to search for text.

### textArea

Sets the text area relative to the reference region.

### grayscaleTransformationModes

Sets the grayscale transformation mode.

* **Value range**

Each array item can be any one of the [ `DLRGrayscaleTransformationMode` ]({{ site.enumerations }}parameter-mode-enums.html#dlrgrayscaletransformationmode) Enumeration items.

* **Default value** 
 `[DLR_GTM_ORIGINAL, DLR_GTM_SKIP, DLR_GTM_SKIP, DLR_GTM_SKIP, DLR_GTM_SKIP, DLR_GTM_SKIP, DLR_GTM_SKIP, DLR_GTM_SKIP]`

* **Remarks**

The array index represents the priority of the item. The smaller index is, the higher priority is.
