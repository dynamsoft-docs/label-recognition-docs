---
layout: default-layout
title: Dynamsoft Label Recognizer JavaScript Interface - ScanSettings
description: This page shows the ScanSettings interface of Dynamsoft Label Recognizer for JavaScript.
keywords: ScanSettings, api reference, javascript, js
needAutoGenerateSidebar: false
noTitleIndex: true
breadcrumbText: ScanSettings
---

# ScanSettings

Interface for scan behaviour customization.

## Attributes

| Attribute | Type | 
|---------- | ---- | 
| [ `intervalTime` ](#intervaltime) | *number* |
| [ `duplicateForgetTime` ](#duplicateforgettime) | *number* |

### intervalTime

Scan interval used to allow the library to release the CPU periodically. Measured in ms.

### duplicateForgetTime

Ignore duplicated results found in the specified time period. Measured in ms.

## Example Usage

```js
let scanSettings = await recognizer.getScanSettings();
scanSettings.intervalTime = 100; // 100ms
scanSettings.duplicateForgetTime = 3000; // 3s
await recognizer.updateScanSettings(scanSettings);
```
