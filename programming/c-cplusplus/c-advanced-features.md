---
layout: default-layout
title: Dynamsoft Label Recognizer - C Advanced features
description: This is the advanced features page of Dynamsoft Label Recognizer for C Language.
keywords: c, advanced features
needAutoGenerateSidebar: true
needGenerateH3Content: true
---

# Dynamsoft Label Recognizer - Advanced feature for C

## Specify ROI

The `Reference Region` is an important feature of DLR. It can greatly enhance the ability to localize ROI. If you do not understand the concept of reference region in DLR, please refer to [here](../../introduction/index.md##reference-region) for a brief understanding. 

The ordinate origin of `text area`(also called label) is the top-left corner of the `reference region`. The x coordinate is a percentage value relative to the width of the `reference region` and the y coordinate is relative to the height.

### Manually specify the label position
If the target `text area` (also called Label) has a fixed position in images, you can specify the label position directly. For example, if the label is located in the upper left corner of the picture, and the width and height are both 50% of the picture, you can set it with the following code:

```c 
char error[512];

// step 1. get current runtime settings
DLRRuntimeSettings settings;
DLR_GetRuntimeSettings(dlr, &settings);

// step 2. set the text area(label) position by the percentage coordinates relative to the reference region. The default reference region is the entire image.
settings.textArea.points[0].x = 0;
settings.textArea.points[0].y = 0;
settings.textArea.points[1].x = 50;
settings.textArea.points[1].y = 0;
settings.textArea.points[2].x = 50;
settings.textArea.points[2].y = 50;
settings.textArea.points[3].x = 0;
settings.textArea.points[3].y = 50;

// step3. Apply the runtime settings to the `dlr` instance
DLR_UpdateRuntimeSettings(dlr, &settings, error, 512);
```

### Specify reference region by barcode

In some cases, the target `text area` (also called Label) may be near a barcode, as shown in figure 1:

<div align="center">
<img src="assets/dlr_barcode.png" alt="DLR Barcode Reference Region" width="80%"/>
<p>Figure 1 –DLR Barcode Reference Region</p>
</div> 

The barcode can be localized and recognized through [Dynamsoft Barcode Reader](https://www.dynamsoft.com/barcode-reader/overview/?urlsource=docs). The following code demostrates how to specify a barcode reference region and a target text area:

```c 
// step 1. Create instance of Dynamsoft Barcode Reader and initialize the license.
void* dbr = DBR_CreateInstance();
DBR_InitLicense(dbr, "<insert DBR license key here>");

// step 2. Decode the file and get the barcode results.
TextResultArray *pBarcodes = NULL;
DBR_DecodeFile(dbr, "a.png","");
DBR_GetAllTextResults(dbr, &pBarcodes);

char error[512];

// step3. get current runtime settings
DLRRuntimeSettings settings;
DLR_GetRuntimeSettings(dlr, &settings);

// step4. Locate the reference region by Barcodes
settings.referenceRegion.localizationSourceType = DLR_LST_BARCODE;

// step5. Update the reference region by barcode results.
DLR_UpdateReferenceRegionFromBarcodeResults(dlr, pBarcodes, "");

// step6. Update the target label position relative to the barcode region.
settings.textArea.points[0].x = 0;
settings.textArea.points[0].y = 100;
settings.textArea.points[1].x = 100;
settings.textArea.points[1].y = 100;
settings.textArea.points[2].x = 100;
settings.textArea.points[2].y = 130;
settings.textArea.points[3].x = 0;
settings.textArea.points[3].y = 130;

// step7. Apply the runtime settings to the `dlr` instance
DLR_UpdateRuntimeSettings(dlr, &settings, error, 512);
```

>Please replace `<insert DBR license key here>` with your DBR license key. If you do not have a valid license, please request a trial license through the [customer portal](https://www.dynamsoft.com/customer/license/trialLicense?utm_source=docs). 

### Specify reference region by pre-detection
Sometimes, a reference region has a clear background color feature, as shown in figure 2:

<div align="center">
<img src="assets/dlr_predetect.png" alt="Reference Region by predetection" width="60%"/>
<p>Figure 2 – Reference Region by predetection</p>
</div> 

The following code demostrates how to specify a reference region and a target text area by pre-detection using the background colour feature:

```c
char error[512];

// step1. get current runtime settings
DLRRuntimeSettings settings;
DLR_GetRuntimeSettings(dlr, &settings);

// step2. locate the reference region by pre-detection
settings.referenceRegion.localizationSourceType = DLR_LST_PREDETECTED_REGION;

// step3. detects region using the general algorithm based on HSV colour contrast
settings.regionPredetectionModes[0] = DLR_RPM_GENERAL_HSV_CONTRAST;

// step4. Set the argument value of `ForeAndBackgroundColours` like " [ForegroundColour, BackgroundColour, Tolerance]". 

DLR_SetModeArgument(dlr, "RegionPredetectionModes", 0, "ForeAndBackgroundColours", "[-1,0,10]", error, 512);

// step5. Update the target label position relative to the pre-detected region.
settings.textArea.points[0].x = 0;
settings.textArea.points[0].y = 35;
settings.textArea.points[1].x = 100;
settings.textArea.points[1].y = 35;
settings.textArea.points[2].x = 100;
settings.textArea.points[2].y = 65;
settings.textArea.points[3].x = 0;
settings.textArea.points[3].y = 65;

// step6. Apply the runtime settings to the `dlr` instance
DLR_UpdateRuntimeSettings(dlr, &settings, error, 512);
```

>In step 4, The `ForegroundColour` and `BackgroundColour` are the Hue values in the HSV colour space for defining the regions you want to predetect. The value -1 means special colour such as black, gray and white. The `Tolerance` is the allowable deviation of the Hue value. For more details, please refer to the mode parameter [ForeAndBackgroundColours]({{site.parameters-reference}}label-recognizer-parameter/region-predetection-modes.md#foreandbackgroundcolours).
If you want to convert the RGB colour to HSV colour, please visit [here](https://www.peko-step.com/en/tool/hsvrgb_en.html).


## Change the recognizer model

### Recognize only numbers

If the text you want to recognize only contains numbers, you can choose a numbers-only recognizer model from the preset models in DLR, as shown below:

```c
char error[512];

// step1. get current runtime settings
DLRRuntimeSettings settings;
DLR_GetRuntimeSettings(dlr, &settings);

// step2. specify the characterModelName as "Number"
strcpy(settings.characterModelName, "Number");

// step3. Apply the runtime settings to the `dlr` instance
DLR_UpdateRuntimeSettings(dlr, &settings, error, 512);
```

### Recognize only letters

Similarly, if the text you want to recognize only contains letters, you can choose a letters-only recognizer model from the preset models in DLR:

```c
char error[512];

// step1. get current runtime settings
DLRRuntimeSettings settings;
DLR_GetRuntimeSettings(dlr, &settings);

// step2. specify the characterModelName as "Letter"
strcpy(settings.characterModelName, "Letter");

// step3. Apply the runtime settings to the `dlr` instance
DLR_UpdateRuntimeSettings(dlr, &settings, error, 512);
```

## Use regular expressions

//TODO:


