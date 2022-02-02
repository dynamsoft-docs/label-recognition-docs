---
layout: default-layout
title: Dynamsoft Label Recognizer Introduction  - Main Page
description: This is the main page of Dynamsoft Label Recognizer Introduction. 
needAutoGenerateSidebar: true
needGenerateH3Content: true
noTitleIndex: true
---

# Overview of Dynamsoft Label Recognizer

Dynamsoft Label Recognizer (DLR) is an SDK designed to recognize meaningful zonal text or symbols in an image (or a 'Label' in this context). Some common scenarios where a component like DLR can prove handy include price tags in supermarkets, inventory labels in warehouses, VIN codes on car windshields, driver licenses, ID cards, and more.

DLR powers your software development through the following aspects:
- Introduces the `Reference Region` feature to reduce the difficulty of specifying a Region of Interest (ROI).
- Creates the `Inference Area` concept to effectively calculate the target label position by utilizing fixed relative position characteristics between text blocks, particularly for key-value pairs.
- Innovative a text recognition engine that combines the advantages of Convolutional Neural Network (CNN) models and traditional image feature extraction.
- Supports extensible regular expressions to improve the accuracy of text recognition.
- Utilizes a variety of processing modes at different stages of the algorithm to maintain great scalability.

With DLR, you can create customizable text detection and recognition software with enterprise-grade performance to meet your business needs.

## Key Features

### Reference Region 
The `Reference Region` is the most important feature of DLR. Generally, a label is not fixed in a certain position, but we could utilize some characteristic areas around the target label to locate it. The reference region may utilize surrounding features such as foreground and background colours, straight lines, textures, or barcodes around the label in order to localize the Region of Interest (ROI).

A reference region could be:
- A pre-defined region based on absolute or relative coordinates known in advance.
- A barcode region.
- A pre-detected region based on the background colour, foreground colour, etc. 

The position of a label (also called the text area) is specified by percentage coordinates relative to the reference region. The relationship between the reference region and the label is shown in the figure below.
<div align="center">
   <p><img src="assets/dlr_roi.png" alt="ROI definition" width="100%" /></p>
   <p>Figure 1 – ROI definition</p>
</div> 

The left portion of Figure1 above demonstrates how the position of the reference region can be determined by the barcode region. The barcode can be localized and recognized through [Dynamsoft Barcode Reader](https://www.dynamsoft.com/barcode-reader/overview/?urlsource=navigation). In addition, if there are multiple barcodes in an image, we can further determine the target barcode region by specifying the barcode format(s) and barcode text. 

On the right side, we demostrate how the SDK is able to locate the reference region based on the background colour. In this case, DLR is told (via the API) that the backgroud colour is red, and in turn it automatically determines the reference region through its algorithms.

### Inference Area

The `Inference Area` feature in DLR is based on the relative position characteristics between text blocks in an image. It will be introduced in version 3.0 to help you quickly and effectively calculate the target label position.

As shown in the figure below, the text blocks L0 and Label T1 inside the label T0 forms a key-value pair. 

<div align="center">
   <p><img src="assets/dlr_ia.png" alt="text-based region inference" width="75%" /></p>
   <p>Figure 2 – text-based region inference</p>
</div> 

T0 is not only a label but also an inference area with appropriate inference parameters. DLR can find the text line L0 with the same vertical coordinate as T0, then calculate more accurate reference coordinates of the target label T1.

### Text recognition engine
DLR comes with an innovative `text recognition engine` that helps it obtain text recogntion results quickly and accurately. This feature combines the advantages of CNN (Convolutional Neural Networks) models and traditional image feature extraction.

The text recognition engine of DLR supports one primary model and multiple auxiliary models. The primary model mainly covers uppercase and lowercase letters, numbers, arabic numerals, and few punctuation marks. The primary model is used by default when there is no character set specified in the parameters of DLR. 

Usually, the smaller a set of characters is, the higher the recognition rate will be. In the iterative recognition process, DLR will automatically select the smallest CNN-model (**auxiliary model**) according to the character sets. If no set is specified, then DLR will go with the **primary model**. DLR takes an iterative approach to the recognition process, so once the initial recognition result is produced, DLR may divide the result string into a few parts, each part having a smaller character set than the other. DLR can then take advantage of these specific sets to improve the recognition rate by selecting suitable auxiliary models.

One scenario would be a label that contains both numbers and letters, but only numbers in a certain position. If it is known by DLR and there is a number-only auxiliary model in the directories, DLR will automatically select the number-only model for best results.

Additionally, DLR also supports data set training in order to generate customized recognition models. In some cases, there may still be some misreading of certain characters. Then the traditional image features of each character will be captured to further distinguish.

### Extensible Regular Expressions
In order to improve text recognition accuracy, DLR supports `extensible regular expressions` to correct misrecognized characters. 

Using the matching results, DLR will perform segment analysis to find out the exact position that does not match the regular expression. Afterwards, DLR attempts to reduce the size of the character set used for recognition as much as possible via the partial matching results. 

Finally, DLR will perform multiple iterations to correct the misrecognized characters through a variety of methods such as auxiliary models or character features. 

### Various processing modes
In order to cope with various scenarios, DLR provides a variety of processing modes at each stage of the algorithm process to maintain great scalability. 

For example, [`BinarizationModes`](https://www.dynamsoft.com/label-recognition/programming/dotnet/api-reference/dlr-runtime-settings.html?ver=latest#binarizationmodes) provides several image binarization methods and [`RegionPredetectionModes`](https://www.dynamsoft.com/label-recognition/programming/dotnet/api-reference/dlr-further-modes.html?ver=latest#regionpredetectionmodes) provides different pre-detection methods to help locate the reference region. 

These modes can be configured not only through API but also through a configuration template (as file, string, JSON etc.). Furthermore, the implementation of these modes can be customized according to customer scenarios to seamlessly integrated with customer's project.


## [Usage scenarios]({{ site.docFullPath }}/use-cases)

### VIN Scanning
Vehicle Identification Numbers (VINs) are one of, if not the most important pieces of information commonly used in the automotive industry, usually for vehicle identification. With the help of DLR, users can identify any vehicle anywhere, anytime by scanning the VINs.

### Retail
In retail, DLR can help ensure fast and accurate price label recognition, whether it's multiple price labels at a time or just one. DLR is not dependent on a price label's associated barcode like the Barcode Reader, so retail employees can still use the label recognition feature to perform price verification .

### Inventory and Warehouse Management
Staff in a warehouse could utilize DLR for inventory management. Even if the barcodes are damaged, inventories can be easily recognized with the help of the accompanying text to make sure everything is in its place.

### ID Cards in Air Travel
Smart devices equipped with DLR-based OCR software help employees in the aviation industry scan machine-readable ID cards and passports easily. Passengers can scan their passports while checking-in online, thereby eliminating errors when entering the data and responding to alerts such as passport expiration.

### Lot No. on Drug Bottles in Healthcare
Based on DLR, we can integrate data capture and text recognition technologies into healthcare software, adding remarkable value to their applications. As an example, for pharmaceutical products that do not have data encoded within a barcode, DLR-based OCR software helps by instantly scanning ref or lot numbers. DLR also can be used for staff identification by scanning ID badge(name, number, etc.) on employees' chest.

### Parts Tracking and Maintenance
OCR software integrated with DLR helps maintenance operators easily track and find various parts in a warehouse. Smart device scanning solutions equipped with OCR software can easily replace dedicated scanning hardware that contributes to reducing the total cost of ownership. Employees can scan text and barcodes on different parts, saving time in the process and decreasing the chances of errors in tracking a large number of parts. 

### Parcel Labels in Transport and Logistics
OCR technology helps in reducing the errors and time consumption associated with manual data entry processes in the transport and logistics industries. With DLR, it becomes easier to read optical marks, text, and laser print, which can then index data in the document and dispatch system. When a barcode on a parcel or package is damaged, DLR can help you by reading the accompanying text instead. Advanced OCR software can scan multiple lines of text in one single scan.

### Voucher Code Scanning
With the help of DLR, companies can enable their customers to scan voucher codes on the back of gift cards using their mobile devices. To achieve this, companies need to integrate a serial number scanner into their app. This will be a good way to promote engagement with the company.

### Checks in Banking
Accurate data capture helps to simplify banking processes, making them more efficient. Recent OCR innovations allow customers to easily scan and deposit cheques via their mobile devices. The customer's signature, account number, and total amount will be checked. The amounts on cheques are printed with a special font which can be easily recognized by smart devices equipped with DLR-based OCR software. 

## Cross-Platform Programming Languages

DLR is designed to be cross-platform. The core of DLR is written in C/C++ for performance. The library is wrapped for .NET, Java, and other programming languages so that users can use DLR on iOS, Android, Windows, and Linux. Below is a list of supported OSes and corresponding programming languages: 

| OS            | Programming Language |
|---------------|----------------------|
|Windows        | C/C++/C\#/VB.NET/Java |
|Linux          | C/C++/Java            |
|Android        | Java                 |
|iOS            | Swift/Objective-C    |

## License Agreement

Please <a href="https://www.dynamsoft.com/label-recognition/license-agreement/" target="_blank">click here</a> to read the license agreement.
