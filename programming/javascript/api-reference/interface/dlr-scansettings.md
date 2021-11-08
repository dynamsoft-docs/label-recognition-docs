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

`interface` ScanSettings

* intervalTime?: *number*

  > Scan interval used to allow the library to release the CPU periodically. Measured in ms.

* duplicateForgetTime?: *number*

  > Ignore duplicated results found in the specified time period. Measured in ms.

```js
let scanSettings = await recognizer.getScanSettings();
scanSettings.intervalTime = 100; // 100ms
scanSettings.duplicateForgetTime = 3000; // 3s
await recognizer.updateScanSettings(scanSettings);
```
