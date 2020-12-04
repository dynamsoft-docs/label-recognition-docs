---
layout: default-layout
title: Dynamsoft Barcode Reader Parameter Reference - TextArea Object
description: This page shows Dynamsoft Barcode Reader Parameter Reference - TextArea Object.
keywords: parameter reference, parameters, TextArea
needAutoGenerateSidebar: false
needGenerateH3Content: false
breadcrumbText: TextArea
---


# Dynamsoft Barcode Reader SDK - TextArea Object Parameters

## Content Organization Control

 | Parameter Name | Description |
 | -------------- | ----------- | 
 | [`TextArea.Name`](content-organization-control.md#name) | The name of the TextArea object. |


## Format Control

 | Parameter Name | Description |
 | -------------- | ----------- | 
 | [`TextArea.AllModuleDeviation`](format-control.md#allmoduledeviation) | Set the module size deviation from the standard barcode module size. |
 | [`TextArea.AustralianPostEncodingTable`](format-control.md#australianpostencodingtable) | Set the encoding table used to code the Customer Information Field of Australian Post Customer Barcode. | 
 | [`TextArea.BarcodeAngleRangeArray`](format-control.md#barcodeanglerangearray) | Sets the range of angles (in degrees) for barcodes search. | 
 | [`TextArea.BarcodeBytesLengthRangeArray`](format-control.md#barcodebyteslengthrangearray) | Sets the range of barcode bytes length for barcodes search. | 
 | [`TextArea.BarcodeBytesRegExPattern`](format-control.md#barcodebytesregexpattern) | Specifies the regular express pattern of barcode byte characters. | 
 | [`TextArea.BarcodeFormatIds`](format-control.md#barcodeformatids) | Sets which barcode format the current TextArea configuration is applied to. | 
 | [`TextArea.BarcodeFormatIds_2`](format-control.md#barcodeformatids_2) | Sets which barcode format in BarcodeFormat group 2 the current TextArea configuration is applied to. |
 | [`TextArea.BarcodeHeightRangeArray`](format-control.md#barcodeheightrangearray) | Sets the range of barcode heights (in pixels) to for barcodes search. | 
 | [`TextArea.BarcodeTextLengthRangeArray`](format-control.md#barcodetextlengthrangearray) |	Sets the range of barcode text length for barcodes search. | 
 | [`TextArea.BarcodeTextRegExPattern`](format-control.md#barcodetextregexpattern) | Specifies the regular express pattern of barcode characters. | 
 | [`TextArea.BarcodeWidthRangeArray`](format-control.md#barcodewidthrangearray) | Sets the range of barcode widths (in pixels) for barcodes search.(Hint). | 
 | [`TextArea.BarcodeZoneBarCountRangeArray`](format-control.md#barcodezonebarcountrangearray) |	Sets the range of bar count of the barcode zone for barcodes search. | 
 | [`TextArea.BarcodeZoneMinDistanceToImageBorders`](format-control.md#barcodezonemindistancetoimageborders) |	Sets the minimum distance (in pixels) between barcode zone and image borders. | 
 | [`TextArea.Code128Subset`](format-control.md#code128subset) | Set the code 128 subset. | 
 | [`TextArea.FindUnevenModuleBarcode`](format-control.md#findunevenmodulebarcode) | Specifies whether to find barcodes with uneven barcode modules. Not support yet. | 
 | [`TextArea.HeadModuleRatio`](format-control.md#headmoduleratio) | Set the module count and module size ratio of the barcode head part. | 
 | [`TextArea.MinQuietZoneWidth`](format-control.md#minquietzonewidth) | The minimum width of the barcode quiet zone. | 
 | [`TextArea.MinRatioOfBarcodeZoneWidthToHeight`](format-control.md#minratioofbarcodezonewidthtoheight) |	Sets the minimum ratio (width/height) of the barcode zone. | 
 | [`TextArea.MirrorMode`](format-control.md#mirrormode) | Sets whether to decode mirrored barcodes. | 
 | [`TextArea.ModuleSizeRangeArray`](format-control.md#modulesizerangearray) | Sets the range of module size (in pixels) for barcodes search. (Hint). |
 | [`TextArea.RequireStartStopChars`](format-control.md#requirestartstopchars) |	Sets whether the start and stop characters are required when searching for Code 39 barcodes. |
 | [`TextArea.StandardFormat`](format-control.md#standardformat) | Set the standard barcode format. | 
 | [`TextArea.TailModuleRatio`](format-control.md#tailmoduleratio) |	Set the module count and module size ratio of the barcode tail part. | 


 
 
## Image Process Control

 | Parameter Name | Description |
 | -------------- | ----------- | 
 | [`TextArea.DeblurLevel`](image-process-control.md#deblurlevel) | Sets the degree of blurriness of the barcode for the current specified barcode format. | 
 | [`TextArea.DeformationResistingModes`](image-process-control.md#deformationresistingmodes)  | Sets the mode and priority for deformation resisting for the current specified barcode format. Not support yet. |
 | [`TextArea.BarcodeComplementModes`](image-process-control.md#barcodecomplementmodes) | Sets the mode and priority to complement the missing parts in the barcode for current specified barcode format. Not support yet. |



## Result Control

 | Parameter Name | Description |
 | -------------- | ----------- | 
 | [`TextArea.MinResultConfidence`](result-control.md#minresultconfidence) | The minimum confidence of the result. | 
 | [`TextArea.ReturnPartialBarcodeValue`](result-control.md#returnpartialbarcodevalue) | Sets whether or not to return partial barcode value(s). Not support yet. | 
