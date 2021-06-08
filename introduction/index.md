---
layout: default-layout
title: Dynamsoft Label Recognition Introcution - Main Page
description: This is the main page of Dynamsoft Label Recognition Introduction. 
needAutoGenerateSidebar: true
needGenerateH3Content: true
---

# Overview of Dynamsoft Label Recognition

Dynamsoft Label Recognition (DLR) is an SDK designed to recognize meaningful zonal text or symbols in an image (Label). Common scenarios include price tags in supermarkets, inventory labels in warehouses, VIN codes on car windshield, driver licenses and ID cards, etc. 

DLR powers your software development from the following aspects:
- (1) introduce `Reference Region` feature to reduce the difficulty of specifying ROI,
- (2) create `Inferece Area` concept to effectively calculate the target label position by utilizing fixed relative position characteristics between text blocks,
- (3) innovate a text recognition engine combines the advantages of CNN(Convolutional Neural Networks) models and traditional image feature extraction,
- (4) support setting regular expressions to improve the accuracy of text recognition,
- (5) design a variety of processing modes at different algorithm stages to maintain great scalability.

With our SDK, you can create customizable text detection and recognition software with enterprise-grade performance to meet your business needs.

## Key Features

### Reference Region 
The `Reference Region` is an important feature of DLR. It can greatly reduce the difficulty of specifying ROI for users. Generally, a label is not fixed in a certain position, but may be located in or around some characteristic areas. The reference region may utilize the features such as foreground and background colors, straight lines, textures, or barcodes around the label.

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

The `Inference Area` feature in DLR is based on the relative position characteristics between text blocks in an image. It will be introduced to quickly and effectively calculate the target label position in version 2.0.

As shown in the figure below, the text blocks L0 and T1 inside the label T0 meet the form of key-value pairs. 

<div align="center">
   <p><img src="assets/dlr_ia.png" alt="text-based region inference" width="75%" /></p>
   <p>Figure 2 – text-based region inference</p>
</div> 

T0 is not only a label, but also an inference area with appropriate inference parameters. DLR can find the text line L0 that meets the condition in T0, then calculate more accurate reference coordinates for the target label T1.

### Text recognition engine
In order to obtain the most accurate and robust text recognition results, DLR has innovated a `text recognition engine`. It combines the advantages of CNN(Convolutional Neural Networks) models and traditional image feature extraction.

The text recognition engine of DLR supports one primary model and multiple auxiliary models. In the iterative recognition process, DLR will automatically select the smallest CNN-model according to the character sets to be recognized. For example, the text of a label contains both numbers and letters, but only numbers in a certain position. If it is known by DLR and there is a number-only auxiliary model in the directories, DLR will automatically select the number-only model for best results. Additionaly, DLR also supports training to generate customized recognition models through specific data sets. In some cases, there are still misreading of certain characters. Then traditional image feature of each character will be captured to further distinguish.

### Regular Expression
In order to improve the accuracy of text recognition, DLR supports setting different `regular expressions` for different regions including label or text line. Through regular expressions, DLR can quickly find recognition errors and perform effective error correction to improve accuracy. For example, if a character that does not conform to a regular expression is recognized at a specific position in a string, DLR will perform multiple iteration attempts on the character to obtain the best result.

### Various processing modes
In order to cope with various scenarios, DLR has designed a variety of processing modes at different stages of the algorithm to maintain great scalability. For example, the `BinarizationModes` provide different image binarization methods, and the `RegionPredetectionModes` provide different pre-detection methods for the reference region. These Modes can be configured not only through API, but also through a template file. Furthermore, the implementation of these modes can be customized according to customer scenarios and seamlessly integrated with SDK.



## Usage scenarios

### VIN Scanning
Automotive industry professionals use Vehicle Identification Numbers (VINs) to identify vehicles. With the help of DLR, users can identify vehicles anywhere, anytime by scanning VINs.

### Retail
In retail, DLR ensures accurate price label recognition. Multiple price labels can be easily scanned at once, reducing chances of errors. Even when a barcode is damaged, the store employees can make use of the label recognition feature on their mobile phones to perform price verification.

### Inventory and Warehouse Management
With DLR, warehouse crew and staff can capture content that isn’t necessarily barcoded. Even if the barcodes are damaged, every item of inventory can be easily scanned with the help of the accompanying text to make sure that everything is in its place and to determine which items need to be restocked.

### ID Cards in Air Travel
Smart devices equipped with DLR-based OCR software help airports and airline employees to scan machine-readable ID cards and passports easily and instantly. Passengers can scan their passports while checking-in online, thereby eliminating errors when entering the data and responding to alerts such as passport expiration.

### Lot No. on Drug Bottles in Healthcare
Based on DLR, we can integrate data capture and text recognition technologies into healthcare software, adding remarkable value to their applications. As an example, for pharmaceutical products that do not have data encoded within a barcode, DLR-baesd OCR software helps by instantly scanning ref or lot numbers. Staff ID badges do not need to have barcodes on them because the text printed on the badges (name, number, etc.) can be scanned for identity verification.

### Parts Tracking and Maintenance
OCR software integrated with DLR helps maintenance operators to easily track and find different parts in a warehouse. Smart device scanning solutions equipped with OCR software can easily replace dedicated scanning hardware that contributes to reducing the total cost of ownership. Employees can scan text and barcodes on different parts, saving time in the process and decreasing the chances of errors in tracking a large number of parts. 

### Parcel Labels in Transport and Logistics
OCR technology helps in reducing the errors, energy, and time associated with manual data entry processes in the transport and logistics industries. With DLR, it becomes easier to read optical marks, text, and laser print, which can then index documents with data contained within the document and dispatch system. When a barcode on a parcel or package is damaged and cannot be scanned, OCR software helps by reading the accompanying text instead. Advanced OCR software can scan multiple lines of text in a single scan on a smart device.

### Voucher Code Scanning
With the help of DLR, companies can enable their customers to scan voucher codes on the back of gift cards using their mobile phones. To make this happen, companies need to integrate serial number scanning into an app or website. Because vouchers benefit customers in many ways, this will be a good way to promote engagement with the company.

### Checks in Banking
Accurate data capture helps to simplify banking processes, making it more efficient and faster. Recent OCR innovations allow customers to easily scan and deposit checks via their mobile phones. Every part of the check is processed, including the signature, the account number, and the amount. The numbers on checks are printed with a special font that can be easily recognized by smart devices equipped with DLR-based OCR software. 

## Programming Language

Cross-platform application development is now the new trend. The core of DLR is written in C/C++ for performance. The library is also wrapped for use with .NET, Java and other programming languages so that your users can use the functionality on iOS, Android, Windows and Linux. Below is a list of supported OS and programming languages: 

| OS            | Programming Language |
|---------------|----------------------|
|Windows        | C/C++/C\#/VB.NET     |
|Linux          | C/C++                |
|Android        | Java                 |
|iOS            | Swift/Objective-C    |

