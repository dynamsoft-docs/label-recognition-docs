---
layout: default-layout
title: Dynamsoft Label Recognizer Enumerations - Parameter Mode Enumerations
description: This article shows Parameter Mode Enumerations of Dynamsoft Label Recognizer.
keywords: BinarizationMode, GrayscaleTransformationMode, RegionPredetectionMode, parameter mode enumeration, enumeration
needAutoGenerateSidebar: true
needGenerateH3Content: true
---

# Dynamsoft Label Recognizer Enumeration - Parameter Mode Enumeration

  | Enumeration | Description |
  |-------------|-------------|
  | [`BinarizationMode`](#binarizationmode) | Describes the binarization mode. |
  | [`GrayscaleTransformationMode`](#grayscaletransformationmode) | Describes the grayscale transformation mode. |
  | [`RegionPredetectionMode`](#regionpredetectionmode) | Describes the region predetection mode. |
  | [`ColourConversionMode`](#colourconversionmode) | Describes the colour conversion mode. |
  | [`GrayscaleEnhancementMode`](#grayscaleenhancementmode) | Describes the grayscale image preprocessing mode. |
  | [`TextureDetectionMode`](#texturedetectionmode) | Describes the texture detection mode. | 
  | [`ScaleUpMode`](#scaleupmode) | Describes the scale up mode. |
  | [`PDFReadingMode`](#pdfreadingmode) | Describes the PDF reading mode.  |
  
---


## BinarizationMode
Describes the binarization mode.


### Declarations
   
| Language | Declaration |
| -------- | ----------- |
| C / C++ | `enum BinarizationMode` |
| .Net | `enum Dynamsoft.Core.EnumBinarizationMode` |
| Android | `class com.dynamsoft.core.EnumBinarizationMode` |
| ObjC / Swift | `enum EnumBinarizationMode` |
| Java | `class com.dynamsoft.core.EnumBinarizationMode` |


### Members
   
| Member (except ObjC/Swift) | Member (ObjC/Swift) | Value | Description | Valid Argument(s) |
| -------------------------- | ------------------- | ----- | ----------- | ----------------- |
| BM_SKIP | EnumBinarizationModeSkip | 0x00 | Skips the binarization. | `N/A` |
| BM_AUTO | EnumBinarizationModeAuto | 0x01 | **Not supported yet.** | `N/A` |
| BM_LOCAL_BLOCK | EnumBinarizationModeLocalBlock | 0x02 | Binarizes the image based on the local block. | [`BlockSizeX`]({{ site.parameters-reference }}label-recognition-parameter/binarization-modes.html#blocksizex)<br>[`BlockSizeY`]({{ site.parameters-reference }}label-recognition-parameter/binarization-modes.html#blocksizey)<br>[`EnableFillBinaryVacancy`]({{ site.parameters-reference }}label-recognition-parameter/binarization-modes.html#enablefillbinaryvacancy)<br>[`ThreshValueCoefficient`]({{ site.parameters-reference }}label-recognition-parameter/binarization-modes.html#threshvaluecoefficient)<br> |
| BM_THRESHOLD | EnumBinarizationModeThreshold | 0x04 | Binarizes the image based on given threshold. | [`BinarizationThreshold`]({{ site.parameters-reference }}label-recognition-parameter/binarization-modes.html#binarizationThreshold) |





## GrayscaleTransformationMode
Describes the grayscale transformation mode.


### Declarations
   
| Language | Declaration |
| -------- | ----------- |
| C / C++ | `enum GrayscaleTransformationMode` |
| .Net | `enum Dynamsoft.Core.EnumGrayscaleTransformationMode` |
| Android | `class com.dynamsoft.core.EnumGrayscaleTransformationMode` |
| ObjC / Swift | `enum EnumGrayscaleTransformationMode` |
| Java | `class com.dynamsoft.core.EnumGrayscaleTransformationMode` |


### Members
   
| Member (except ObjC/Swift) | Member (ObjC/Swift) | Value | Description |
| -------------------------- | ------------------- | ----- | ----------- |
| GTM_SKIP  | EnumGrayscaleTransformationModeSkip | 0x00 | Skips grayscale transformation. |
| GTM_INVERTED  | EnumGrayscaleTransformationModeInverted | 0x01 | Transforms to inverted grayscale. Recommended for light on dark images. |
| GTM_ORIGINAL | EnumGrayscaleTransformationModeOriginal | 0x02 | Keeps the original grayscale. Recommended for dark on light images. |
| GTM_AUTO | EnumGrayscaleTransformationModeAuto | 0x04 | Lets the library choose an algorithm automatically for grayscale transformation. |




## RegionPredetectionMode
Describes the region predetection mode.


### Declarations
   
| Language | Declaration |
| -------- | ----------- |
| C / C++ | `enum RegionPredetectionMode` |
| .Net | `enum Dynamsoft.Core.EnumRegionPredetectionMode` |
| Android | `class com.dynamsoft.core.EnumRegionPredetectionMode` |
| ObjC / Swift | `enum EnumRegionPredetectionMode` |
| Java | `class com.dynamsoft.core.EnumRegionPredetectionMode` |


### Members
   
| Member (except ObjC/Swift) | Member (ObjC/Swift) | Value | Description | Valid Argument(s) |
| -------------------------- | ------------------- | ----- | ----------- | ----------------- |
| RPM_SKIP | EnumRegionPredetectionModeSkip | 0x00 | Skips region detection. | `N/A` |
| RPM_AUTO | EnumRegionPredetectionModeAuto | 0x01 | Lets the library choose an algorithm automatically to detect region. | `N/A` |
| RPM_GENERAL | EnumRegionPredetectionModeGeneral | 0x02 | Takes the whole image as a region. | `N/A` |
| RPM_GENERAL_RGB_CONTRAST | EnumRegionPredetectionModeGeneralRGBContrast | 0x04 | Detects region using the general algorithm based on RGB colour contrast. | [`MinImageDimension`]({{ site.parameters-reference }}label-recognition-parameter/region-predetection-modes.html#minimagedimension)<br>[`Sensitivity`]({{ site.parameters-reference }}label-recognition-parameter/region-predetection-modes.html#sensitivity)<br>[`SpatialIndexBlockSize`]({{ site.parameters-reference }}label-recognition-parameter/region-predetection-modes.html#spatialindexblocksize) |
| RPM_GENERAL_GRAY_CONTRAST | EnumRegionPredetectionModeGeneralGrayContrast | 0x08 | Detects region using the general algorithm based on gray contrast. | [`MinImageDimension`]({{ site.parameters-reference }}label-recognition-parameter/region-predetection-modes.html#minimagedimension)<br>[`Sensitivity`]({{ site.parameters-reference }}label-recognition-parameter/region-predetection-modes.html#sensitivity)<br>[`SpatialIndexBlockSize`]({{ site.parameters-reference }}label-recognition-parameter/region-predetection-modes.html#spatialindexblocksize) |
| RPM_GENERAL_HSV_CONTRAST | EnumRegionPredetectionModeGeneralHSVContrast | 0x10 | Detects region using the general algorithm based on HSV colour contrast. | [`AspectRatioRange`]({{ site.parameters-reference }}label-recognition-parameter/region-predetection-modes.html#aspectratiorange)<br>[`FindAccurateBoundary`]({{ site.parameters-reference }}label-recognition-parameter/region-predetection-modes.html#findaccurateboundary)<br>[`ForeAndBackgroundColours`]({{ site.parameters-reference }}label-recognition-parameter/region-predetection-modes.html#foreandbackgroundcolours)<br>[`HeightRange`]({{ site.parameters-reference }}label-recognition-parameter/region-predetection-modes.html#heightrange)<br>[`MinImageDimension`]({{ site.parameters-reference }}label-recognition-parameter/region-predetection-modes.html#minimagedimension)<br>[`Sensitivity`]({{ site.parameters-reference }}label-recognition-parameter/region-predetection-modes.html#sensitivity)<br>[`SpatialIndexBlockSize`]({{ site.parameters-reference }}label-recognition-parameter/region-predetection-modes.html#spatialindexblocksize)<br>[`WidthRange`]({{ site.parameters-reference }}label-recognition-parameter/region-predetection-modes.html#widthrange) |



## ColourConversionMode
Describes the colour conversion mode.


### Declarations
   
| Language | Declaration |
| -------- | ----------- |
| C / C++ | `enum ColourConversionMode` |
| .Net | `enum Dynamsoft.Core.EnumColourConversionMode` |
| Android | `class com.dynamsoft.core.EnumColourConversionMode` |
| ObjC / Swift | `enum EnumColourConversionMode` |
| Java | `class com.dynamsoft.core.EnumColourConversionMode` |


### Members
   
| Member (except ObjC/Swift) | Member (ObjC/Swift) | Value | Description | Valid Argument(s) |
| -------------------------- | ------------------- | ----- | ----------- | ----------------- |
| CICM_SKIP | EnumColourConversionModeSkip | 0x00 | Skip the colour conversion. | `N/A` |
| CICM_GENERAL | EnumColourConversionModeGeneral | 0x01 | Converts a colour image to a grayscale image using the general algorithm. | [`BlueChannelWeight`]({{ site.parameters-reference }}label-recognition-parameter/colour-conversion-modes.html#bluechannelweight)<br>[`GreenChannelWeight`]({{ site.parameters-reference }}label-recognition-parameter/colour-conversion-modes.html#greenchannelweight)<br>[`RedChannelWeight`]({{ site.parameters-reference }}label-recognition-parameter/colour-conversion-modes.html#redchannelweight) |



## GrayscaleEnhancementMode
Describes the grayscale image preprocessing mode.

### Declarations
   
| Language | Declaration |
| -------- | ----------- |
| C / C++ | `enum GrayscaleEnhancementMode` |
| .Net | `enum Dynamsoft.Core.EnumGrayscaleEnhancementMode` |
| Android | `class com.dynamsoft.core.EnumGrayscaleEnhancementMode` |
| ObjC / Swift | `enum EnumGrayscaleEnhancementMode` |
| Java | `class com.dynamsoft.core.EnumGrayscaleEnhancementMode` |


### Members
   
| Member (except ObjC/Swift) | Member (ObjC/Swift) | Value | Description | Valid Argument(s) |
| -------------------------- | ------------------- | ----- | ----------- | ----------------- |
| GEM_SKIP | EnumGrayscaleEnhancementModeSkip | 0x00 | Skips image preprocessing. | `N/A` |
| GEM_AUTO | EnumGrayscaleEnhancementModeAuto | 0x01 | **Not supported yet.** | `N/A` |
| GEM_GENERAL | EnumGrayscaleEnhancementModeGeneral | 0x02 | Takes the unpreprocessed image for following operations. | `N/A` |
| GEM_GRAY_EQUALIZE | EnumGrayscaleEnhancementModeGrayEqualize | 0x04 | Preprocesses the image using the gray equalization algorithm. | [`Sensitivity`]({{ site.parameters-reference }}label-recognition-parameter/grayscale-enhancement-modes.html#sensitivity) |
| GEM_GRAY_SMOOTH | EnumGrayscaleEnhancementModeGraySmooth | 0x08 | Preprocesses the image using the gray smoothing algorithm. | [`SmoothBlockSizeX`]({{ site.parameters-reference }}label-recognition-parameter/grayscale-enhancement-modes.html#smoothblocksizex)<br>[`SmoothBlockSizeY`]({{ site.parameters-reference }}label-recognition-parameter/grayscale-enhancement-modes.html#smoothblocksizey) |
| GEM_SHARPEN_SMOOTH | EnumGrayscaleEnhancementModeSharpenSmooth | 0x10 | Preprocesses the image using the sharpening and smoothing algorithm. | [`SmoothBlockSizeX`]({{ site.parameters-reference }}label-recognition-parameter/grayscale-enhancement-modes.html#smoothblocksizex)<br>[`SmoothBlockSizeY`]({{ site.parameters-reference }}label-recognition-parameter/grayscale-enhancement-modes.html#smoothblocksizey)<br>[`SharpenBlockSizeX`]({{ site.parameters-reference }}label-recognition-parameter/grayscale-enhancement-modes.html#sharpenblocksizex)<br>[`SharpenBlockSizeY`]({{ site.parameters-reference }}label-recognition-parameter/grayscale-enhancement-modes.html#sharpenblocksizey) |
| GEM_MORPHOLOGY  | EnumGrayscaleEnhancementModeMorphology | 0x20 | Preprocesses the image using the morphology algorithm. | [`MorphOperation`]({{ site.parameters-reference }}label-recognition-parameter/grayscale-enhancement-modes.html#morphoperation)<br>[`MorphShape`]({{ site.parameters-reference }}label-recognition-parameter/grayscale-enhancement-modes.html#morphshape)<br>[`MorphOperationKernelSizeX`]({{ site.parameters-reference }}label-recognition-parameter/grayscale-enhancement-modes.html#morphoperationkernelsizex)<br>[`MorphOperationKernelSizeY`]({{ site.parameters-reference }}label-recognition-parameter/grayscale-enhancement-modes.html#morphoperationkernelsizey) |



## TextureDetectionMode
Describes the texture detection mode.


### Declarations
   
| Language | Declaration |
| -------- | ----------- |
| C / C++ | `enum TextureDetectionMode` |
| .Net | `enum Dynamsoft.Core.EnumTextureDetectionMode` |
| Android | `class com.dynamsoft.core.EnumTextureDetectionMode` |
| ObjC / Swift | `enum EnumTextureDetectionMode` |
| Java | `class com.dynamsoft.core.EnumTextureDetectionMode` |


### Members
   
| Member (except ObjC/Swift) | Member (ObjC/Swift) | Value | Description | Valid Argument(s) |
| -------------------------- | ------------------- | ----- | ----------- | ----------------- |
| TDM_SKIP  | EnumTextureDetectionModeSkip | 0x00 | Skips texture detection. | `N/A` |
| TDM_AUTO  | EnumTextureDetectionModeAuto | 0x01 | Not supported yet. | `N/A` |
| TDM_GENERAL_WIDTH_CONCENTRATION  | EnumTextureDetectionModeGeneralWidthConcentration | 0x02 | Detects texture using the general algorithm. | [`Sensitivity`]({{ site.parameters-reference }}label-recognition-parameter/texture-detection-modes.html#sensitivity) |



## ScaleUpMode
Describes the scale up mode. 


### Declarations
   
| Language | Declaration |
| -------- | ----------- |
| C / C++ | `enum ScaleUpMode` |
| .Net | `enum Dynamsoft.Core.EnumScaleUpMode` |
| Android | `class com.dynamsoft.core.EnumScaleUpMode` |
| ObjC / Swift | `enum EnumScaleUpMode` |
| Java | `class com.dynamsoft.core.EnumScaleUpMode` |


### Members
   
| Member (except ObjC/Swift) | Member (ObjC/Swift) | Value | Description | Valid Argument(s) |
| -------------------------- | ------------------- | ----- | ----------- | ----------------- |
| SUM_SKIP | EnumScaleUpModeSkip | 0x00 | Skip the scale-up process. | `N/A` |
| SUM_AUTO | EnumScaleUpModeAuto | 0x01 | The library chooses an interpolation method automatically to scale up. | `N/A` |
| SUM_LINEAR_INTERPOLATION | EnumScaleUpModeLinearInterpolation | 0x02 | Scales up using the linear interpolation method. | [`LetterHeightThreshold`]({{ site.parameters-reference }}label-recognition-parameter/scale-up-modes.html#letterheightthreshold)<br>[`TargetLetterHeight`]({{ site.parameters-reference }}label-recognition-parameter/scale-up-modes.html#targetletterheight) |
| SUM_NEAREST_NEIGHBOUR_INTERPOLATION | EnumScaleUpModeNearestNeighbourInterpolation | 0x04 | Scales up using the nearest-neighbour interpolation method. | [`LetterHeightThreshold`]({{ site.parameters-reference }}label-recognition-parameter/scale-up-modes.html#letterheightthreshold)<br>[`TargetLetterHeight`]({{ site.parameters-reference }}label-recognition-parameter/scale-up-modes.html#targetletterheight) |



## PDFReadingMode
Describes the PDF reading mode. 


### Declarations
   
| Language | Declaration |
| -------- | ----------- |
| C / C++ | `enum PDFReadingMode` |
| .Net | `enum Dynamsoft.Core.EnumPDFReadingMode` |
| Android | `class com.dynamsoft.core.EnumPDFReadingMode` |
| ObjC / Swift | `enum EnumPDFReadingMode` |
| Java | `class com.dynamsoft.core.EnumPDFReadingMode` |



### Members
   
| Member (except ObjC/Swift) | Member (ObjC/Swift) | Value | Description |
| -------------------------- | ------------------- | ----- | ----------- |
| PDFRM_AUTO | EnumPDFReadingModeAuto | 0x01 | Lets the library choose the reading mode automatically. |
| PDFRM_VECTOR | EnumPDFReadingModeVector | 0x02 | Recognize text from vector data in PDF file. |
| PDFRM_RASTER | EnumPDFReadingModeRaster | 0x04 | Converts the PDF file to image(s) first, then perform text recognition. |






