---
layout: default-layout
title: Dynamsoft Label Recognition Introcution - Main Page
description: This is the main page of Dynamsoft Label Recognition Introduction. 
needAutoGenerateSidebar: false
---

# Overview of Dynamsoft Label Recognition

Dynamsoft Label Recognition (DLR) is an SDK designed to recognize meaningful zonal text or symbols in an image (Label). Common scenarios include price tags in supermarkets, inventory labels in warehouses, VIN codes on car windshield, driver licenses and ID cards, etc. DLR enables you to efficiently read alphanumeric characters and standard symbols from image files, videos regardless of background colour, text colour, font or size. With our SDK, you can create customizable text detection and recognition software with enterprise-grade performance to meet your business needs.

## Key Features

### Reference Region
How to specify the label position is not a simple problem. The label is generally not fixed in a certain position, but may be located in or around some characteristic areas. DLR introduces the concept of reference region, which uses the features such as foreground and background colors, straight lines, textures, or barcodes around the label.

A reference region could be:
- A predefined region with absolute or relative coordinates known in advance.
- A barcode region.
- A predetect region according background colour, foreground colour etc. 

The position of a label (also called text area) is specified by percentage coordinates relative to the reference region. The relationship between the reference region and the label is shown in the figure below.
<div align="center">
   <p><img src="assets/dlr_roi.png" alt="ROI definition" width="100%" /></p>
   <p>Figure 1 – ROI definition</p>
</div> 

On the left side of the above figure, the position of reference region could be determined by barcode. The barcode can be localized and recognized through [Dynamsoft Barcode Reader](https://www.dynamsoft.com/barcode-reader/overview/?urlsource=navigation). In addition, if there are multiple barcodes in an image, we can further determine the target barcode region by specifying the barcode formats and barcode text. 

On the right, the background color of the reference region is specified as red, then DLR can automatically detect the region through algorithms.

### Inference Area

In some scenarios, there are no features such as color, texture, and barcode in the image that can be used directly. However, there are structural features between the text blocks in the label. Therefore, DLR will introduce the concept of Inference Area in version 2.0, which uses text-based features. 

As shown in the figure below, the text blocks L0 and T1 inside the label T0 meet the form of key-value pairs. 

<div align="center">
   <p><img src="assets/dlr_ia.png" alt="text-based region inference" width="75%" /></p>
   <p>Figure 2 – text-based region inference</p>
</div> 

T0 is not only a label, but also an inference area with appropriate inference parameters. DLR can find the text line L0 that meets the parameters in T0, then calculate more accurate reference coordinates for the target label T1.

### Text recognition model
Machine learning is very popular in text recognition. However, in some scenarios, there are still misreading of certain characters. In order to improve the accuracy and robustness of character recognition, DLR's text recognition engine uses a combination of deep neural networks and traditional feature extraction. 

The DLR installation package contains 4 sets of preset character recognition models, which correspond to different supported character sets. It also supports training to generate customized recognition models through specific data sets. 

DLR's recognition model supports both the primary model and the auxiliary model. The auxiliary model is mainly trained for some confusing characters.
In some cases, when the primary model cannot determine which candidate character is more accurate, the auxiliary model will further try to distinguish.

### Regular Expression
In order to improve the accuracy of text recognition, DLR supports setting different regular expressions for different regions including label or text line. Through regular expressions, DLR can quickly find recognition errors and perform effective error correction to improve accuracy. For example, if a character that does not conform to a regular expression is recognized at a specific position in a string, DLR will perform multiple iteration attempts on the character to obtain the best result.

### Various processing modes
In order to cope with various scenarios, DLR has designed a variety of processing modes at different stages of the algorithm to maintain great scalability. For example, the `BinarizationModes` provide different image binarization methods, and the `RegionPredetectionModes` provide different pre-detection methods for the reference region. These Modes can be configured not only through API, but also through a template file. Furthermore, the implementation of these modes can be customized according to customer scenarios and seamlessly integrated with SDK.



## Usage scenarios

### [VIN Scanning]({{ site.docFullPath }}/use-cases/#VinScan)
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
|Windows        | C/C++/C\#/VB.NET     |
|Linux          | C/C++                |
|Android        | Java                 |
|iOS            | Swift/Objective-C    |

