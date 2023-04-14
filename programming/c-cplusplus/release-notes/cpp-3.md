---
layout: default-layout
title: C/C++ SDK Release Notes 2.x - Dynamsoft Label Recoginizer 
description: This is the release notes page of Dynamsoft Label Recoginizer for C/C++ SDK version 2.x.
keywords: release notes, c, c++
needAutoGenerateSidebar: false
---

# Release Notes - C++ 3.x

## 3.0.0 (06/29/2023)

### New

- Added new methods
  - [`DLR_InitRuntimeSettingsFromFile`](../api-reference/label-recognizer-functions.md#dlrinitruntimesettingsfromfile)
  - [`DLR_InitRuntimeSettings`](../api-reference/label-recognizer-functions.md#dlrinitruntimesettings)
  - [`DLR_SetCharacterModelDefaultPath`](../api-reference/label-recognizer-functions.md#dlrsetcharactermodeldefaultpath)
  - [`DLR_FreeString`](../api-reference/label-recognizer-functions.md#dlrfreestring)

### Renamed

- The following methods are renamed
  - Renamed `DLR_OutputSettingsToFile` to [`DLR_OutputRuntimeSettingsToFile`](../api-reference/label-recognizer-functions.md#dlroutputruntimesettingstofile)
  - Renamed `DLR_OutputSettingsToString` to [`DLR_OutputRuntimeSettingsToString`](../api-reference/label-recognizer-functions.md#dlroutputruntimesettings)
  - Renamed `DLR_RecognizeByBuffer` to [`DLR_RecognizeBuffer`](../api-reference/label-recognizer-functions.md#dlrrecognizebuffer)
  - Renamed `DLR_RecognizeByFile` to [`DLR_RecognizeFile`](../api-reference/label-recognizer-functions.md#dlrrecognizefile)

### Removed

- The following methods are removed
  - `DLR_InitLicense`. The method is replaced by [`DC_InitLicense`](../api-reference/license-manager.md#initlicense) under `DynamsoftCore`.
  - `DLR_AppendSettingsFromString`
  - `DLR_AppendSettingsFromFile`
  - `DLR_ClearAppendedSettings`
  - `DLR_UpdateRuntimeSettingsFromString`
