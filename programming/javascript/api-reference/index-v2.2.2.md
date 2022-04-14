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

The primary class of the library is `LabelRecognizer` . The following code snippets shows the basic usage.

* Recognize a still image

```js
let labelRecognizer = await Dynamsoft.DLR.LabelRecognizer.createInstance();
let results = await labelRecognizer.recognize(imageSource);
for (let result of results) {
    for (let lineResult of result.lineResults) {
        console.log(lineResult.text);
    }
}
```

* Recognize continuous video frames

```js
let labelRecognizer = await Dynamsoft.DLR.LabelRecognizer.createInstance({
    runtimeSettings: "video-MRZ"
});
labelRecognizer.onFrameRead = results => {
    for (let result of results) {
        for (let lineResult of result.lineResults) {
            console.log(lineResult.text);
        }
    }
};
labelRecognizer.startScanning(true);
```

The APIs for this class include

## Initialization Control

The following static methods and properties help to set up the runtime environment for the library.

| API Name | Description |
|---|---|
| [engineResourcePath](initialize.md#engineresourcepath) | Specifies the path from where the recognition engine and models, etc. can be loaded. |
| [loadWasm()](initialize.md#loadwasm) | Loads the recognition engine and models. |
| [isWasmLoaded()](initialize.md#iswasmloaded) | Returns whether the recognition engine and models have been loaded. |
| [getVersion()](initialize.md#getversion) | Returns the version of the library. |
| [detectEnvironment()](initialize.md#detectenvironment) | Assess the running environment regarding the features the library requires to run. |

### Create and Destroy Instances

| API Name | Description |
|---|---|
| [createInstance()](initialize.md#createinstance) | Creates a `LabelRecognizer` instance. |
| [destroyContext()](initialize.md#destroycontext) | Destroies the LabelRecognizer instance. |
| [isContextDestroyed()](initialize.md#iscontextdestroyed) | Returns whether the instance has been destroyed. |

### License Control

| API Name | Description |
|---|---|
| [license](initialize.md#license) | Use an alphanumeric string to specify the license. |

## UI Control

| API Name | Description |
|---|---|
| [getUIElement()](ui.md#getuielement) | Returns the HTML element that is used by the `LabelRecognizer` instance. |
| [setUIElement()](ui.md#setuielement) | Specifies an HTML element for the `LabelRecognizer` instance to use as its UI. |
| [defaultUIElementURL](ui.md#defaultuielementurl) | Returns or sets the URL of the .html file that defines the default UI Element. |
| [lineFillStyle](ui.md#linefillstyle) | Specifies the color used inside the shape which highlights a found line of text.  |
| [lineStrokeStyle](ui.md#linestrokestyle) | Specifies the color used to paint the outline of the shape which highlights a found line of text. |
| [lineLineWidth](ui.md#linelinewidth) | Specifies the line width of the outline of the shape which highlights a found line of text. |
| [regionMaskFillStyle](ui.md#regionmaskfillstyle) | Specifies the color used in the square-loop shape between the actual scanning area and the boundary of the video input. |
| [regionMaskStrokeStyle](ui.md#regionmaskstrokestyle) | Specifies the color used to paint the outline of the scanning region. |
| [regionMaskLineWidth](ui.md#regionmasklinewidth) | Specifies the width of the outline of the scanning region. |

## Recognition

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
| [onUniqueRead](recognize.md#onuniqueread) | This event is triggered when a new, unduplicated label is found. |
| [onFrameRead](recognize.md#onframeread) | This event is triggered after the library finishes scanning a frame. |
| [startScanning()](recognize.md#startscanning) | Starts continuous scanning of incoming frames. |
| [stopScanning()](recognize.md#stopscanning) | Stops continuous scanning. |

## Settings

### Scan Settings

| API Name | Description |
|---|---|
| [whenToPlaySoundforSuccessfulRead](settings.md#whentoplaysoundforsuccessfulread) | Sets when to play sound on text recognition. |
| [soundOnSuccessfullRead](settings.md#soundonsuccessfullread) | Specifies the sound to play on text recognition. |
| [whenToVibrateforSuccessfulRead](settings.md#whentovibrateforsuccessfulread) | Sets when to vibrate on text recognition. |
| [vibrateDuration](settings.md#vibrateduration) | Returns or sets how long the vibration lastsin milliseconds.  |
| [getScanSettings()](settings.md#getscansettings) | Returns the current scan settings. |
| [updateScanSettings()](settings.md#updatescansettings) | Changes scan settings with the object passed in. |

### Runtime Settings

<!--
| [getRuntimeSettings()](settings.md#getruntimesettings) | Returns the current runtime settings. |
| [updateRuntimeSettings()](settings.md#updateruntimesettings) | Updates runtime settings with a given struct or a preset template. |
| [resetRuntimeSettings()](settings.md#resetruntimesettings) | Resets all parameters to default values. |
| [getModeArgument()](settings.md#getmodeargument) | Returns the argument value for the specified mode parameter. |
| [setModeArgument()](settings.md#setmodeargument) | Sets the argument value for the specified mode parameter. |
-->

| API Name | Description |
|---|---|
| [updateRuntimeSettingsFromString()](settings.md#updateruntimesettingsfromstring) | Updates runtime settings with a template represented by a JSON string. |
| [outputRuntimeSettingsToString()](settings.md#outputruntimesettingstostring) | Output the current runtime settings to a JSON string. |
[updateReferenceRegionFromBarcodeResults()](settings.md#updatereferenceregionfrombarcoderesults) | Updates reference region which is defined with source type `DLR_LST_BARCODE`. |

<!--
| [appendCharacterModelBuffer()](settings.md#appendcharactermodelbuffer) | Appends a CharacterModel to assist the recognition. |
| [eraseCharacterModelByName()](settings.md#erasecharactermodelbyname) | Erases a CharacterModel by its name. |
| [eraseAllCharacterModels()](settings.md#eraseallcharactermodels) | Erases all CharacterModels. |
| 
-->

## Auxiliary

| API Name | Description |
|---|---|
| [ifSaveOriginalImageInACanvas](auxiliary.md#ifsaveoriginalimageinacanvas) | Whether to save the original image into a &lt; canvas&gt; element. |
| [getOriginalImageInACanvas()](auxiliary.md#getoriginalimageinacanvas) | Returns an `HTMLCanvasElement` that holds the original image. |
| [onResourcesLoadStarted](auxiliary.md#onresourcesloadstarted) | This event is triggered when the resource file (.data) for a particular template starts to load. |
| [onResourcesLoadProgress](auxiliary.md#onresourcesloadprogress) | This event is triggered multiple times when the resource file (.data) for a particular template is being loaded. |
| [onResourcesLoaded](auxiliary.md#onresourcesloaded) | This event is triggered when the resource file (.data) for a particular template finishes loading. |

## Interfaces and Enumerations

In order to make the code more predictable and readable, the library defines a series of supporting interfaces and enumerations.

### Interfaces

* [`DLRLineResult`](interface/dlr-line-result.md)	
* [`Point`](interface/point.md)		
* [`Quadrilateral`](interface/quadrilateral.md)	
* [`DLRReferenceRegion`](interface/dlr-reference-region.md)	
* [`DLRResult`](interface/dlr-result.md)		
* [`DLRRuntimeSettings`](interface/dlr-runtime-settings.md)	

### Enumerations

* [RegionPredetectionMode]({{ site.enumerations }}region-predetection-mode.html)
* [ColourConversionMode]({{ site.enumerations }}colour-conversion-mode.html)
* [GrayscaleTransformationMode]({{ site.enumerations }}grayscale-transformation-mode.html)
* [GrayscaleEnhancementMode]({{ site.enumerations }}grayscale-enhancement-mode.html)
* [BinarizationMode]({{ site.enumerations }}binarization-mode.html)
* [TextureDetectionMode]({{ site.enumerations }}texture-detection-mode.html)
* [ImagePixelFormat]({{ site.enumerations }}image-pixel-format.html)
* [LocalizationSourceType]({{ site.enumerations }}localization-source-type.html)
* [ErrorCode]({{ site.enumerations }}error-code.html)
