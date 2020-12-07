---
layout: default-layout
title: Dynamsoft Label Recognition Enumerations - Parameter Mode Enumerations
description: This article shows Parameter Mode Enumerations of Dynamsoft Label Recognition.
keywords: DLRBinarizationMode, DLRGrayscaleTransformationMode, DLRRegionPredetectionMode, parameter mode enumeration, enumeration
needAutoGenerateSidebar: true
needGenerateH3Content: false
---

# Dynamsoft Label Recognition Enumeration - Parameter Mode Enumeration

  | Enumeration | Description |
  |-------------|-------------|
  | [`DLRBinarizationMode`](#dlrbinarizationmode) | Describes the binarization mode. |
  | [`DLRGrayscaleTransformationMode`](#dlrgrayscaletransformationmode) | Describes the grayscale transformation mode. |
  | [`DLRRegionPredetectionMode`](#dlrregionpredetectionmode) | Describes the region predetection mode. |

  
---


## DLRBinarizationMode
Describes the binarization mode.


### Declarations
   
| Language | Declaration |
| -------- | ----------- |
| C / C++ | `enum DLRBinarizationMode` |
| .Net | `enum Dynamsoft.DLR.EnumDLRBinarizationMode` |
| Android | `class EnumDLRBinarizationMode` |


### Members
   
| Member | Value | Description |
| -------------------------- | ------------------- | ----- | ----------- |
| DLR_BM_SKIP | 0x00 | Skips the binarization. |
| DLR_BM_AUTO | 0x01 | **Not supported yet.** |
| DLR_BM_LOCAL_BLOCK | 0x02 | Binarizes the image based on the local block. |
| DLR_BM_THRESHOLD | 0x04 | Binarizes the image based on given threshold. |

### Remarks
Check arguments of [`DLRBinarizationModes`]({{ site.parameters-reference }}label-recognition-parameter/DLRBinarizationModes.html#mode-arguments) for available argument settings.

&nbsp;



## DLRGrayscaleTransformationMode
Describes the grayscale transformation mode.


### Declarations
   
| Language | Declaration |
| -------- | ----------- |
| C / C++ | `enum DLRGrayscaleTransformationMode` |
| .Net | `enum Dynamsoft.DLR.EnumDLRGrayscaleTransformationMode` |
| Android | `class EnumDLRGrayscaleTransformationMode` |


### Members
   
| Member | Value | Description |
| -------------------------- | ------------------- | ----- | ----------- |
| DLR_GTM_SKIP  | 0x00 | Skips grayscale transformation. |
| DLR_GTM_INVERTED  | 0x01 | Transforms to inverted grayscale. Recommended for light on dark images. |
| DLR_GTM_ORIGINAL | 0x02 | Keeps the original grayscale. Recommended for dark on light images. |

### Remarks


&nbsp;



## DLRRegionPredetectionMode
Describes the region predetection mode.


### Declarations
   
| Language | Declaration |
| -------- | ----------- |
| C / C++ | `enum DLRRegionPredetectionMode` |
| .Net | `enum Dynamsoft.DLR.EnumDLRRegionPredetectionMode` |
| Android | `class EnumDLRRegionPredetectionMode` |


### Members
   
| Member | Value | Description |
| -------------------------- | ------------------- | ----- | ----------- |
| DLR_RPM_SKIP | 0x00 | Skips region detection. |
| DLR_RPM_AUTO | 0x01 | Lets the library choose an algorithm automatically to detect region. |
| DLR_RPM_GENERAL | 0x02 | Takes the whole image as a region. |
| DLR_RPM_GENERAL_RGB_CONTRAST | 0x04 | Detects region using the general algorithm based on RGB colour contrast. |
| DLR_RPM_GENERAL_GRAY_CONTRAST | 0x08 | Detects region using the general algorithm based on gray contrast. |
| DLR_RPM_GENERAL_HSV_CONTRAST | 0x10 | Detects region using the general algorithm based on HSV colour contrast. |

### Remarks
Check arguments of [`DLRRegionPredetectionModes`]({{ site.parameters-reference }}label-recognition-parameter/DLRRegionPredetectionModes.html#mode-arguments) for available argument settings.

&nbsp;



