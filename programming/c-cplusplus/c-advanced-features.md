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

### Manually specify the label position
If the target `text area` (also called Label) has a fixed position in images, you can specify the label position directly. For example, if the label is located in the upper left corner of the picture, and the width and height are both 50% of the picture, you can set it with the following code:

```c 
char error[512];

// get current runtime settings
DLRRuntimeSettings settings;
DLR_GetRuntimeSettings(dlr, &settings);

// The default reference region is the entire image, the text area(label) position is specified by the percentage coordinates relative to the image
settings.textArea.points[0].x = 0;
settings.textArea.points[0].y = 0;
settings.textArea.points[1].x = 50;
settings.textArea.points[1].y = 0;
settings.textArea.points[2].x = 50;
settings.textArea.points[2].y = 50;
settings.textArea.points[3].x = 0;
settings.textArea.points[3].y = 50;

// Apply to the `dlr` instance
DLR_UpdateRuntimeSettings(dlr, &settings, error, 512);
```

### Specify reference region by barcode

In some cases, the target `text area` (also called Label) may be near a barcode, as shown in figure 1:

<div align="center">
<img src="assets/dlr_barcode.png" alt="DLR Barcode Reference Region" width="80%"/>
<p>Figure 1 –DLR Barcode Reference Region</p>
</div> 

The barcode can be localized and recognized through [Dynamsoft Barcode Reader](https://www.dynamsoft.com/barcode-reader/overview/?urlsource=docs). The following code demostrates how to specify a barcode reference region:

```c 
// Create instance of Dynamsoft Barcode Reader and initialize the license.
void* dbr = DBR_CreateInstance();
DBR_InitLicense(dbr, "<insert DBR license key here>");

// Decode the file and get the barcode results.
TextResultArray *pBarcodes = NULL;
DBR_DecodeFile(dbr, "a.png","");
DBR_GetAllTextResults(dbr, &pBarcodes);

char error[512];

// get current runtime settings
DLRRuntimeSettings settings;
DLR_GetRuntimeSettings(dlr, &settings);

// Update the reference region by barcode results.
DLR_UpdateReferenceRegionFromBarcodeResults(dlr, pBarcodes, "");

// Update the target label position relative to the barcode region.
settings.textArea.points[0].x = 0;
settings.textArea.points[0].y = 100;
settings.textArea.points[1].x = 100;
settings.textArea.points[1].y = 100;
settings.textArea.points[2].x = 100;
settings.textArea.points[2].y = 130;
settings.textArea.points[3].x = 0;
settings.textArea.points[3].y = 130;

// Apply to the `dlr` instance
DLR_UpdateRuntimeSettings(dlr, &settings, error, 512);
```

>Please replace `<insert DBR license key here>` with your DBR license key. If you do not have a valid license, please request a trial license through the [customer portal](https://www.dynamsoft.com/customer/license/trialLicense?utm_source=docs). 

### Specify reference region by pre-detection

//TODO:

## Change the recognizer model

//TODO:

## Use regular expressions

//TODO:


