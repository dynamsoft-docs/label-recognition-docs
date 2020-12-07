---   
description: Introduce the parameter definitions, organization structure, usage rules and related interfaces involved in Dynamsoft Label Recognition.
title: Dynamsoft Label Recognition Parameters - Structure and Interfaces of Parameters
keywords: Parameter,Interface,Hierarchy
layout: default-layout
needAutoGenerateSidebar: false
---


# Hierarchy and work domain of parameters 
This article introduces the parameter definitions, organization structure, usage rules and related interfaces involved in Dynamsoft Label Recognition.

## Definitions
Dynamsoft Label Recognition uses a template to set parameters. A template contains three types of data: `LabelRecognitionParameter`, `ReferenceRegion`, and `TextArea`.
- `LabelRecognitionParameter` is used to specify the decoding operation settings on the entire image. The value of the `LabelRecognitionParameter.Name` field is the unique identifier of the `LabelRecognitionParameter`.
- `ReferenceRegion` is used to specify a decoding region. It is also used to specify the decoding operation settings in this area. The value of the `ReferenceRegion.Name` field is the unique identifier of `ReferenceRegion`.
- `TextArea` is used to specify a barcode format. It is also used to specify the decoding operation settings of this barcode format. The value of the `TextArea.Name` field is the unique identifier of `TextArea`.

## Organizational Relationship
- There is only one `LabelRecognitionParameter` in a template definition. The `LabelRecognitionParameter.Name` field denotes the unique identifier of the template;
- One or more `ReferenceRegion` can be referenced through `ReferenceRegionNameArray` in `LabelRecognitionParameter`;
- One or more `TextArea` can be referenced through `TextAreaNameArray` in `LabelRecognitionParameter`;
- One or more `TextArea` can be referenced through `TextAreaNameArray` in `ReferenceRegion`;
- In a JSON template file/string, you can use `LabelRecognitionParameterContentArray`/`ReferenceRegionArray`/`TextAreaArray` field to define multiple `LabelRecognitionParameter`/`ReferenceRegion`/`TextArea`, for example:

```JSON
{
    "LabelRecognitionParameterContentArray": [
      {
        "Name": "LabelRecognitionParameter1", 
        "BarcodeFormatIds": "BF_ONED"
      },
      {
        "Name": "LabelRecognitionParameter2", 
        "BarcodeFormatIds": ["BF_ALL"]
      }
    ]
}
```

## Scope
- When the same parameter is set in both `LabelRecognitionParameter` and `ReferenceRegion`, the decoding operation in the region specified by `ReferenceRegion` is used; otherwise, the parameter values under the `LabelRecognitionParameter` will be used.

- When the same parameter is set in both `LabelRecognitionParameter` and `TextArea`, the decoding operation for the barcode format specified by `TextArea` is used; otherwise, the parameter values under the `LabelRecognitionParameter` will be used.

- When the same parameter is set in both `ReferenceRegion` and `TextArea`, the decoding operation for the barcode format specified by `TextArea` is used in the region specified by `ReferenceRegion`; otherwise, the parameter values under the `LabelRecognitionParameter` will be used.


## Parameter list
The parameters of `LabelRecognitionParameter` are:
- LabelRecognitionParameter.BarcodeColourModes
- LabelRecognitionParameter.BarcodeComplementModes
- LabelRecognitionParameter.BarcodeFormatIds
- LabelRecognitionParameter.BarcodeFormatIds_2
- LabelRecognitionParameter.BinarizationModes
- LabelRecognitionParameter.ColourClusteringModes
- LabelRecognitionParameter.ColourConversionModes
- LabelRecognitionParameter.DeblurLevel
- LabelRecognitionParameter.DeblurModes
- LabelRecognitionParameter.DeformationResistingModes
- LabelRecognitionParameter.Description
- LabelRecognitionParameter.DPMCodeReadingModes
- LabelRecognitionParameter.ExpectedBarcodesCount
- LabelRecognitionParameter.TextAreaNameArray
- LabelRecognitionParameter.GrayscaleTransformationModes
- LabelRecognitionParameter.ImagePreprocessingModes
- LabelRecognitionParameter.IntermediateResultSavingMode
- LabelRecognitionParameter.IntermediateResultTypes
- LabelRecognitionParameter.LocalizationModes
- LabelRecognitionParameter.MaxAlgorithmThreadCount
- LabelRecognitionParameter.Name
- LabelRecognitionParameter.Pages
- LabelRecognitionParameter.PDFRasterDPI
- LabelRecognitionParameter.PDFReadingMode
- LabelRecognitionParameter.ReferenceRegionNameArray
- LabelRecognitionParameter.RegionPredetectionModes
- LabelRecognitionParameter.ResultCoordinateType
- LabelRecognitionParameter.ReturnBarcodeZoneClarity
- LabelRecognitionParameter.ScaleDownThreshold
- LabelRecognitionParameter.ScaleUpModes
- LabelRecognitionParameter.TerminatePhase
- LabelRecognitionParameter.TextAssistedCorrectionMode
- LabelRecognitionParameter.TextFilterModes
- LabelRecognitionParameter.TextResultOrderModes
- LabelRecognitionParameter.TextureDetectionModes
- LabelRecognitionParameter.Timeout

The parameters of `ReferenceRegion` are:
- ReferenceRegion.BarcodeFormatIds
- ReferenceRegion.BarcodeFormatIds_2
- ReferenceRegion.Bottom
- ReferenceRegion.ExpectedBarcodesCount
- ReferenceRegion.TextAreaNameArray
- ReferenceRegion.Left
- ReferenceRegion.MeasuredByPercentage
- ReferenceRegion.Name
- ReferenceRegion.Right
- ReferenceRegion.Top

The parameters of `TextArea` are:
- TextArea.AllModuleDeviation
- TextArea.AustralianPostEncodingTable 
- TextArea.BarcodeAngleRangeArray
- TextArea.BarcodeBytesLengthRangeArray
- TextArea.BarcodeBytesRegExPattern
- TextArea.BarcodeComplementModes
- TextArea.BarcodeFormatIds
- TextArea.BarcodeFormatIds_2
- TextArea.BarcodeHeightRangeArray
- TextArea.BarcodeTextLengthRangeArray
- TextArea.BarcodeTextRegExPattern
- TextArea.BarcodeWidthRangeArray
- TextArea.Code128Subset
- TextArea.DeblurLevel
- TextArea.DeformationResistingModes
- TextArea.FindUnevenModuleBarcode
- TextArea.HeadModuleRatio
- TextArea.MinQuietZoneWidth
- TextArea.MinResultConfidence
- TextArea.MirrorMode
- TextArea.ModuleSizeRangeArray
- TextArea.Name
- TextArea.RequireStartStopChars
- TextArea.ReturnPartialBarcodeValue
- TextArea.StandardFormat
- TextArea.TailModuleRatio

## Parameter template files assignment rules 
When setting parameters through a JSON template, Dynamsoft Label Recognition will process the template according to the following rules:
- Parameters not defined in `LabelRecognitionParameter`/`ReferenceRegion`/`TextArea` will be filled with default values
- `TextArea` is automatically split into multiple settings for a single barcode format, for example:

```JSON
Template you set
{
    "LabelRecognitionParameter":{
        "Name": "LabelRecognitionParameter1", 
        "BarcodeFormatIds": "BF_ONED",    
        "TextAreaNameArray": [
          "TextArea1"
        ]
    }, 
    "TextArea": {
      "Name": "TextArea1", 
      "BarcodeFormatIds": ["BF_CODE_39","BF_CODE_128"],
      "MinResultConfidence": 20
    }
}
```


```JSON
Template used by DBR
{
    "LabelRecognitionParameter":{
        "Name": "LabelRecognitionParameter1", 
        "BarcodeFormatIds": "BF_ONED",    
        "TextAreaNameArray": [
          "TextArea1_BF_CODE_39",
          "TextArea1_BF_CODE_128"
        ]
    },
    "TextAreaArray":[
      {
        "Name": "TextArea1_BF_CODE_39", 
        "BarcodeFormatIds": ["BF_CODE_39"],
        "MinResultConfidence": 20
      },
      {
        "Name": "TextArea1_BF_CODE_128", 
        "BarcodeFormatIds": ["BF_CODE_128"],
        "MinResultConfidence": 20
      }
    ] 
}
```

- When the two templates are merged, duplicate parameter settings in the defined `LabelRecognitionParameter` are handled as follows:

  - The following parameters take the maximum of the two settings
    - DeblurLevel
    - ExceptedBarcodeCount 
    - MaxAlgorithmThreadCount
    - PDFRasterDPI
    - ScaleDownThreshold
    - Timeout  
  - The following parameters take the combined values of two settings
    - BarcodeFormatIds
    - BarcodeFormatIds_2 
    - IntermediateResultTypes
    - Pages
  - The following parameters are controlled by the `ConflictMode`. If `ConflictMode` is `IGNORE`, the first value is taken. If `ConflictMode` is `OVERWRITE`, the last value is taken
    - AccompanyingTextReadingModes
    - BarcodeColourModes
    - BarcodeComplementModes
    - BinarizationModes
    - ColourClusteringModes
    - ColourConversionModes
   	- DeblurModes
   	- DeformationResistingModes
    - DPMCodeReadingModes
    - GrayscaleTransformationModes
    - ImagePreprogressingModes
   	- IntermediateResultSavingMode
    - LocalizationModes
    - PDFReadingMode
    - RegionPredetectionModes
    - ResultCoordinateType
    - ReturnBarcodeZoneClarity
    - ScaleUpModes
    - TerminatePhase
    - TextAssistedCorrectionMode
    - TextFilterModes
    - TextResultOrderModes
    - TextureDetectionModes
    - ReferenceRegionNameArray: Take the last ReferenceRegionName in the last ReferenceRegionNameArray
    - TextAreaNameArray: Take the combined value of the two settings, but if the TextArea is set for the same barcode format, TextAreaNameArray will only keep the name of the last TextArea

## Modes, Mode, Arguments 
The entire decoding process of Dynamsoft Label Recognition consists of many subdivided functions, among which the control parameters of some function blocks are designed in accordance with the format of Modes-Mode-Argument. That is, a function is controlled by a Modes parameter. There are many ways to implement this function, each method (Mode) has multiple unique settings, and each setting is an Argument. 
For example, one of the functions in the decoding process is barcode localization. Dynamsoft Label Recognition provides the `LocalizationModes` parameter to control this function. It provides `LM_CONNECTED_BLOCKS`, `LM_STATISTICS`, `LM_LINES`, `LM_SCAN_DIRECTLY`, `LM_STATISTICS_MARKS`, `LM_STATISTICS_POSTAL_CODE`, a total of 6 methods to implement barcode localization. For LM_SCAN_DIRECTLY, there are two Arguments, `ScanStride` and `ScanDirection`.

## Interfaces to change settings 

Dynamsoft Label Recognition provides two ways to set parameters: `DLRRuntimeSettings` and JSON template files. 
`DLRRuntimeSettings` is used to modify the Dynamsoft Label Recognition built-in template, and only supports commonly used parameters. The following are the steps to update Dynamsoft Label Recognition parameters through `DLRRuntimeSettings`:

1. (optional) Restore the parameter settings of the Dynamsoft Label Recognition built-in template to the default values through the `ResetRuntimeSettings` interface
2. Call the `GetRuntimeSettings` interface to get the current `DLRRuntimeSettings` of the Dynamsoft Label Recognition object
3. Modify the contents in `DLRRuntimeSettings` in the previous step
4. Call the `UpdateRuntimeSettings` interface to apply the modified `DLRRuntimeSettings` in the previous step to the Dynamsoft Label Recognition object
5. (optional) Call the `SetModeArgument` interface to set the optional argument for a specified mode in Modes parameters.


JSON templates supports all Dynamsoft Label Recognition parameters. The related parameter setting interfaces are:
- `InitRuntimeSettingsWithFile`: After calling this interface, the template definition in the file are processed according to the merging rules stated in the "Multiple parameter template files" section. Each independent template is stored in the Dynamsoft Label Recognition object. All templates are merged into one template, then replace the built-in template of Dynamsoft Label Recognition;
- `InitRuntimeSettingsWithString`: The effect after calling this interface is the same as `InitRuntimeSettingsWithFile`. The only difference is the template definition of `InitRuntimeSettingsWithString` is saved as a string;
- `AppendTplFileToRuntimeSettings`: After calling this interface, the template definition in the file will be processed according to the merging rules stated in the "Multiple parameter template files" section . Each independent template is stored in the Dynamsoft Label Recognition object. All templates, including Dynamsoft Label Recognition's built-in template, are merged into one template to replace the built-in template of Dynamsoft Label Recognition;
- `AppendTplStringToRuntimeSettings`: The effect after calling this interface is the same as `AppendTplFileToRuntimeSettings`. The only difference is the template definition of `AppendTplStringToRuntimeSettings` is saved as a string.
