---
layout: default-layout
title: Dynamsoft Label Recognition Introduction - Overview
description: This is the overview page of Dynamsoft Label Recognition Introduction.
keywords: overview
needAutoGenerateSidebar: true
needGenerateH3Content: true
---

# Overview of Dynamsoft Label Recognition

Dynamsoft Label Recognition (DLR) is a SDK specially designed to recognize labels which are some meaningful zonal text in the image. Popular scenarios include price tags in supermarkets, inventory labels in warehouses, VIN code on cars, driver licenses and ID cards, etc. DLR enables you to efficiently read alphanumeric characters and standard symbols from image files, videos regardless of background colour, text colour, font or size. With our SDK, you can create reliable text detection and recognition software with enterprise-grade performance to meet your business needs.


## Key Features

### Extract and Recognize Characters from Various Image Formats
DLR is capable of reading of alphanumeric characters and standard symbols, including period, commas, and dashes, of varying colours, font sizes and styles.

### Specify an Area to OCR Text Using a Reference Region
DLR does not have to recognize texts from a full-sized image. Users have the option to run a zonal OCR feature for a text area. The OCR SDK allows you to specify the relative position of texts to a reference region.

### Sophisticated Image Pre-Processing Algorithms
For images of poor quality, sophisticated algorithms built into DLR SDK are applied to improve contrast, remove noise, and so on. The characteristics of texts can also be used to improve the image quality.

### Use Regular Expression to Improve Accuracy and Robustness
Developers can also specify a Regular Expression to indicate to DLR the assumption about the texts. The semantics of a Regular Expression, to specify alphanumeric values that are expected to be scanned, can give DLR more context for better OCR results.

### Stitch Content Results from Neighboring Video Frames
DLR SDK supports reading content from video streams. For a specified frame, the SDK extracts texts using OCR and cross references the result with neighbor frames for verifiable accuracy. The SDK can also intelligently decide if the text results are a partial or full match and overlap the partial results from sequential frames together.

## Use cases

### [VIN Scanning[({{ site.docFullPath }}/use-cases/#VinScan)
### [Retail]({{ site.docFullPath }}/use-cases/#Retail)
### [Inventory and Warehouse Management]({{ site.docFullPath }}/use-cases/#Inventory)
### [ID Cards in Air Travel]({{ site.docFullPath }}/use-cases/#IDCards)
### [Lot No. on Drug Bottles in Healthcare]({{ site.docFullPath }}/use-cases/#Healthcare)
### [Parts Tracking and Maintenance]({{ site.docFullPath }}/use-cases/#Tracking)
### [Parcel Labels in Transport and Logistics]({{ site.docFullPath }}/use-cases/#Transport)
### [Voucher Code Scanning]({{ site.docFullPath }}/use-cases/#Voucher)
### [Automatic Data Extraction]({{ site.docFullPath }}/use-cases/#Automatic)
### [Checks in Banking]({{ site.docFullPath }}/use-cases/#Banking)

## Programming Language

Cross-platform application development is now the new trend. The core of DLR is written in C/C++ for performance. The library is also wrapped for use with .NET, Java and other programming languages so that your users can use the functionality on iOS, Android, Windows and Linux. Below is a list of supported OS and programming languages: 

| OS            | Programming Language |
|---------------|----------------------|
|Windows/Linux  | C/C++                |
|Windows        | C\#/VB.NET           |
|Android        | Java                 |
|iOS            | Swift/Objective-C    |