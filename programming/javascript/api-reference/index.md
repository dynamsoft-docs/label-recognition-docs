---
layout: default-layout
title: Dynamsoft Label Recognizer JavaScript API - Main Page
description: This is the main page of Dynamsoft Label Recognizer JavaScript SDK API Reference.
keywords: LabelRecognizer, api reference, javascript, js
needAutoGenerateSidebar: true
needGenerateH3Content: true
noTitleIndex: true
breadcrumbText: API Reference
---

# JavaScript API Reference

The primary class of the library is `LabelRecognizer` .

## LabelRecognizer

The following code snippets shows the basic usage.

* Recognize a still image

```js
let labelRecognizer = await Dynamsoft.DLR.createInstance();
let results = await labelRecognizer.recognize(imageSource);
for (let result of results) {
    for (let lineResult of result.LineResults) {
        console.log(lineResult.Text);
    }
}
```

* Recognize continuous video frames

```js
let labelRecognizer = await Dynamsoft.DLR.createInstance();
labelRecognizer.onFrameRead = results => {
    for (let result of results) {
        for (let lineResult of result.LineResults) {
            console.log(lineResult.Text);
        }
    }
};
labelRecognizer.startScanning();
```

The APIs for this class include

## License Control

| API Name | Description |
|---|---|
| [initLicense()](general.md#initLicense) | Initializes the license with a license string. |

### Create and Destroy Instances

| API Name | Description |
|---|---|
| [createInstance()](general.md#createinstance) | Creates a `LabelRecognizer` instance. |
| [destroyContext()](general.md#destroycontext) | Destroies the LabelRecognizer instance. |
| [isContextDestroyed()](general.md#iscontextdestroyed) | Returns whether the instance has been destroyed. |

### Recognize Labels from Still Images

| API Name | Description |
|---|---|
| [recognize()](recognize.md#recognize) | Decodes labels from an image. |
| [recognizeBase64String()](recognize.md#recognizebase64string) | Decodes labels from a base64-encoded image (with or without MIME). |
| [recognizeUrl()](recognize.md#recognizeurl) | Decodes labels from an image specified by its URL. |
| [recognizeBuffer()](recognize.md#recognizebuffer) | Decodes labels from raw image data. |

### Recognize Labels from Video Frames

| API Name | Description |
|---|---|
| [onUnduplicatedRead](recognize.md#onunduplicatedread) | This event is triggered when a new, unduplicated label is found. |
| [onFrameRead](recognize.md#onframeread) | This event is triggered after the library finishes scanning a frame. |
| [recognizeCurrentFrame()](recognize.md#recognizecurrentframe) | Scans the current frame of the video for labels. |

### Change Settings

| API Name | Description |
|---|---|
| [getRuntimeSettings()](settings.md#getruntimesettings) | Returns the current runtime settings. |
| [updateRuntimeSettings()](settings.md#updateruntimesettings) | Updates runtime settings with a given struct or a preset template. |
| [resetRuntimeSettings()](settings.md#resetruntimesettings) | Resets all parameters to default values. |
| [getModeArgument()](settings.md#getmodeargument) | Returns the argument value for the specified mode parameter. |
| [setModeArgument()](settings.md#setmodeargument) | Sets the argument value for the specified mode parameter. |
| [updateRuntimeSettingsFromString()](settings.md#updateruntimesettingsfromstring) | Updates runtime settings with a template represented by a JSON string. |
| [outputSettingsToString()](settings.md#outputsettingstostring) | Output the current runtime settings to a JSON string. |
| [updateReferenceRegionFromBarcodeResults()](settings.md#updatereferenceregionfrombarcoderesults) | Updates reference region which is defined with source type DLR_LST_BARCODE. |
| [appendCharacterModelBuffer()](settings.md#appendcharactermodelbuffer) | Appends a CharacterModel to assist the recognition. |
| [eraseCharacterModelByName()](settings.md#erasecharactermodelbyname) | Erases a CharacterModel by its name. |
| [eraseAllCharacterModels()](settings.md#eraseallcharactermodels) | Erases all CharacterModels. |

### Auxiliary

| API Name | Description |
|---|---|
| [ifSaveOriginalImageInACanvas](auxiliary.md#ifsaveoriginalimageinacanvas) | Whether to save the original image into a &lt; canvas&gt; element. |
| [getOriginalImageInACanvas()](auxiliary.md#getoriginalimageinacanvas) | Returns an `HTMLCanvasElement` that holds the original image. |

## Initialization Control

The following static methods and properties help to set up the runtime environment for the library.

| API Name | Description |
|---|---|
| [engineResourcePath](initialize.md#engineresourcepath) | Specifies the path from where the recognition engine and models, etc. can be loaded. |
| [loadWasm()](initialize.md#loadwasm) | Loads the recognition engine and models. |
| [isWasmLoaded()](initialize.md#iswasmloaded) | Returns whether the recognition engine and models have been loaded. |
| [version](initialize.md#version) | Returns the version of the library. |
| [detectEnvironment()](initialize.md#detectenvironment) | Assess the running environment regarding the features the library requires to run. |

## Interfaces and Enums

In order to make the code more predictable and readable, the library defines a series of supporting interfaces and enumerations.

### Interfaces

* [`DLRLineResult`](interface/dlr-line-result.md)	
* [`DLRPoint`](interface/dlr-point.md)		
* [`DLRQuadrilateral`](interface/dlr-quadrilateral.md)	
* [`DLRReferenceRegion`](interface/dlr-reference-region.md)	
* [`DLRResult`](interface/dlr-result.md)		
* [`DLRRuntimeSettings`](interface/dlr-runtime-settings.md)	
