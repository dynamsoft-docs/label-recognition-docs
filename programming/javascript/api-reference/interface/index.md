---
layout: default-layout
title: Dynamsoft Label Recognizer JavaScript API - Interface APIs
description: This page shows the interface APIs of Dynamsoft Label Recognizer JavaScript SDK.
keywords: label recognizer, api reference, javascript, js, interface
needAutoGenerateSidebar: true
needGenerateH3Content: true
noTitleIndex: true
breadcrumbText: Interface APIs
---

# JavaScript API Interfaces

As seen across the API documentation, the JavaScript Label Recognizer works with a number of different interfaces. This section will list them all and run through the purpose of each interface.

| API Interface | Description |
|---|---|
| [DLRCharacterResult](dlr-character-result.md) | The interface provides more info on the specific characters of a result returned by the recognizer. |
| [DLRLineResult](RegionDefinition.md) | Interface used to specify the reading region via the runtime settings. |
| [DLRPoint](RuntimeSettings.md) | An interface for the points used to represent a quadrilateral or reference region. |
| [DLRQuadrilateral](ScannerPlayCallbackInfo.md) | Interface for the quadrilateral in which the result (line or character) is located. |
| [DLRReferenceRegion](ScanSettings.md) | Interface used to get or set (via the RuntimeSettings) the reference region used to identify the label. |
| [DLRResult](TextResult.md) | The core interface for the results returned by the label recognizer. |
| [DLRRuntimeSettings](dlr-runtime-settings.md) | The main interface used for label recognizer customization. |
| [DLRScanSettings](dlr-scansettings.md) | The main interface used for label recognizer customization. |