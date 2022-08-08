---
layout: default-layout
title: Dynamsoft Label Recognizer - JavaScript User Guide
description: This is the user guide page of Dynamsoft Label Recognizer for JavaScript Language.
keywords: javascript, user guide
needAutoGenerateSidebar: true
needGenerateH3Content: true
---

<!--The original doc is hosted here => https://github.com/dynamsoft-docs/label-recognition-docs/blob/master/programming/javascript/user-guide.md -->

# Dynamsoft Label Recognizer for Your Website

Add the capability of reading passport MRZs, ID cards, VIN numbers, and various other fixed text fields in your web application with just a few lines of code.

![version](https://img.shields.io/npm/v/dynamsoft-label-recognizer.svg)
![downloads](https://img.shields.io/npm/dm/dynamsoft-label-recognizer.svg)
![jsdelivr](https://img.shields.io/jsdelivr/npm/hm/dynamsoft-label-recognizer.svg)
![vulnerabilities](https://img.shields.io/snyk/vulnerabilities/npm/dynamsoft-label-recognizer.svg)

Once integrated, your users can open your website in a browser, access their cameras, and read the intended text directly from the video input.

In this guide, you will learn step by step on how to integrate this SDK into your website.

<span style="font-size:20px">Table of Contents</span>

* [Example Usage - MRZ Reading](#example-usage---mrz-reading)
* [Building your own page](#building-your-own-page)
  * [Include the SDK](#include-the-sdk)
  * [Configure the SDK](#configure-the-sdk)
  * [Interact with the SDK](#interact-with-the-sdk)
* [API Documentation](#api-documentation)
* [System Requirements](#system-requirements)
* [Release Notes](#release-notes)
* [Next Step](#next-steps)

## Example Usage - MRZ Reading

Let's start by testing the "MRZ Reading" example of the SDK which demonstrates how to enable a web page to read the machine-readable zones (MRZ) found on passports, ID cards, VISAs, etc. from a live video stream.

* Basic Requirements
  * Internet connection  
  * [A supported browser](#system-requirements)
  * An accessible Camera

### Check the code

The complete code of the "MRZ Reading" example is shown below

```html
<!DOCTYPE html>
<html>

<head>
    <title>MRZ Reading</title>
    <script src="https://cdn.jsdelivr.net/npm/dynamsoft-label-recognizer@2.2.11/dist/dlr.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/dynamsoft-camera-enhancer@3.0.1/dist/dce.js"></script>
</head>

<body>
    <script>
        // The following line specifies a license good for 24 hours, you can visit https://www.dynamsoft.com/customer/license/trialLicense?utm_source=guide&product=dlr&package=js to get your own trial license good for 30 days.
        Dynamsoft.DLR.LabelRecognizer.license = 'DLS2eyJvcmdhbml6YXRpb25JRCI6IjIwMDAwMSJ9';
        // The following code initializes and uses the SDK.
        (async () => {
            Dynamsoft.DLR.LabelRecognizer.onResourcesLoadStarted = (resourcePath) => {
                // In this event handler, you can display a visual cue to show that the model file is being downloaded.
                console.log("Loading " + resourcePath);
            };
            Dynamsoft.DLR.LabelRecognizer.onResourcesLoaded = (resourcePath) => {
                // In this event handler, you can close the visual cue if it was displayed.
                console.log("Finished loading " + resourcePath);
            };
            let recognizer = await Dynamsoft.DLR.LabelRecognizer.createInstance();
            let cameraEnhancer = await Dynamsoft.DCE.CameraEnhancer.createInstance();
            let options = {
                resultsHighlightBaseShapes: Dynamsoft.DCE.DrawingItem
            };
            await recognizer.setImageSource(cameraEnhancer, options);
            // The following line sets up the recognizer to read MRZ, which means the SDK will load a model file specifically designed for MRZ.
            await recognizer.updateRuntimeSettingsFromString("video-mrz");
            // onMRZRead is a callback specifically designed for MRZ.
            recognizer.onMRZRead = (txt, results) => {
                // Here we simply show the text in the browser console.
                console.log("Found and read a MRZ:")
                console.log(txt);
            };
            // Beginning of redundant code: just to demonstrate the use of onImageRead and onUniqueRead events
            recognizer.onImageRead = results => {
                console.log("Finished reading an image:")
                for (let result of results) {
                    for (let lineResult of result.lineResults) {
                        console.log(lineResult.text);
                    }
                }
            };
            recognizer.onUniqueRead = (txt, results) => {
                console.log("Found a new unique text:")
                console.log(txt);
            };
            // End of redundant code.
            await recognizer.startScanning(true);
        })();
    </script>
</body>

</html>
```

<p align="center" style="text-align:center; white-space: normal; ">
  <a target="_blank" href="https://jsfiddle.net/DynamsoftTeam/kc35htxd/" title="Run via JSFiddle">
    <img src="https://cdn.jsdelivr.net/npm/simple-icons@3.0.1/icons/jsfiddle.svg" alt="Run via JSFiddle" width="20" height="20" style="width:20px;height:20px;">
  </a>
</p>

-----

#### About the code

* `LabelRecognizer.createInstance()`: This method creates a `LabelRecognizer` object called `recognizer`.

* `CameraEnhancer.createInstance()`: this method creates a `CameraEnhancer` object called `cameraEnhancer`, which is used to control the camera as well as the default user interface. Once `cameraEnhancer` is bound to `recognizer` via `setImageSource()`, it can send video frames from the camera to `recognizer` for recognition as well as highlight the recognized text areas directly in the video feed.

* `updateRuntimeSettingsFromString("video-mrz")`: this sets up `recognizer` with a built-in template optimized for reading MRZ from continous video frames. Note that all built-in templates starting with "video-" are only valid after `cameraEnhancer` has been bound to `recognizer`.

  > Built-in templates include
  >
  >| Name | Description |
  >|:-:|:-:|
  >| `number` | For pure number recognition. |
  >| `numberLetter` | For number and English letter recognition. |
  >| `numberUpperCase` | For number and uppercase English letter recognition. |
  >| `letter` | For pure English letter recognition. |
  >| `MRZ` | For MRZ (machine-readable zone) recognition. |
  >| `passportMRZ` | For passport MRZ recognition. |
  >| `visaMRZ` | For Visa (Country not Credit Card) MRZ recognition. |
  >| `VIN` | For VIN (vehicle identification number) recognition. |
  >| `VIN_NA` | For North American VIN (vehicle identification number) recognition. |
  >
  > When recognizing from video input, add the prefix "video-" for a slightly different template optimized for continuous frame recognition. For example, use `video-passportMRZ` to read the MRZ on passports with a camera.

* `onMRZRead`: This event is only used with one of the templates "MRZ", "passportMRZ" and "visaMRZ" (similarly, "onVINRead" is only used with either "VIN" or "VIN_NA"). It is triggered each time the SDK has identified and finished the recognition of a MRZ zone. The `results` object contains 2 or 3 lines of text results corresponding to the 2 or 3 lines in the MRZ. In this example, we simply print the results to the browser console.

> The events `onImageRead` and `onUniqueRead` are used in the code but they are not required. You can compare the results returned in the 3 events and see what the differences are.

* `onImageRead`: This event is triggered every time the SDK finishes scanning a video frame image. The `results` object contains all the text results that the SDK has found on this frame. In this example, we print the results to the browser console.

* `onUniqueRead`: This event is triggered when the SDK finds a new text, which is not a duplicate among multiple frames. `txt` holds the text value while `results` is an array of objects that hold details of the text. In this example, an alert will be displayed for this new text.

* `startScanning(true)`: Starts continuous video frame scanning. The return value is a Promise which resovles when the camera is opened, the video shows up on the page and the scanning begins (which means `cameraEnhancer` has started feeding `recognizer` with frames to recognize).

### Test the code

Create a text file with the name "readMRZ.html", fill it with the code above and save. After that, open the example page in a browser, allow the page to access your camera and the video will show up on the page. After that, you can point the camera at something with a simple line of text to read it.

> You can also just test it at [https://jsfiddle.net/DynamsoftTeam/kc35htxd/](https://jsfiddle.net/DynamsoftTeam/kc35htxd/)

Remember to open the browser console to check the resulting text. Also note that the found text will be highlighted on the UI.

*Note*:

* Although the page should work properly when opened directly as a file ("file:///"), it's recommended that you deploy it to a web server before accessing it. Also, most browsers require a secure connection (HTTPS) to access the cameras, so deploying the page to a HTTPS website is the best choice.
* On first use, you need to wait a few seconds for the SDK to initialize and download the necessary model file.
* The license "DLS2eyJvcmdhbml6YXRpb25JRCI6IjIwMDAwMSJ9" used in this sample is an online license and requires network connection to work.

If the test doesn't go as expected, you can [contact us](https://www.dynamsoft.com/company/contact/?utm_source=guide).

### Check out the official sample for MRZ reading

You can also try the official sample for MRZ reading ([test in Github](https://dynamsoft.github.io/label-recognizer-javascript-samples/2.use-case/2.mrz-read-and-parse/) or [check the code](https://github.com/Dynamsoft/label-recognizer-javascript-samples/tree/main/2.use-case/2.mrz-read-and-parse)). This sample also demonstrates how to parse the MRZ text into meaningful fields.

## Building your own page

In this section, we'll break down and show all the steps required to build a web page that reads the machine readable zone (MRZ) on a passport.

### Include the SDK

#### Use a CDN

The simplest way to include the SDK is to use either the [jsDelivr](https://jsdelivr.com/) or [UNPKG](https://unpkg.com/) CDN. The "hello world" example above uses **jsDelivr**. Since the recognition is mostly on a video input, we should also include the supporting SDK Dynamsoft Camera Enhancer.

* jsDelivr

  ```html
  <script src="https://cdn.jsdelivr.net/npm/dynamsoft-label-recognizer@2.2.11/dist/dlr.js"></script>
  <script src="https://cdn.jsdelivr.net/npm/dynamsoft-camera-enhancer@3.0.1/dist/dce.js"></script>
  ```

* UNPKG  

  ```html
  <script src="https://unpkg.com/dynamsoft-label-recognizer@2.2.11/dist/dlr.js"></script>
  <script src="https://unpkg.com/dynamsoft-camera-enhancer@3.0.1/dist/dce.js"></script>
  ```

#### Host the SDK yourself

Besides using the CDN, you can also download the SDK and host its files on your own website / server before including it in your application.

To download the SDK:

* yarn

  ```cmd
  yarn add dynamsoft-label-recognizer@2.2.11
  yarn add dynamsoft-camera-enhancer@3.0.1
  ```

* npm

  ```cmd
  npm install dynamsoft-label-recognizer@2.2.11
  npm install dynamsoft-camera-enhancer@3.0.1
  ```

Depending on how you downloaded the SDK and where you put it, you can typically include it like this:

  ```html
  <script src="/dlr-js-2.2.11/dist/dlr.js"></script>
  <script src="/dlr-js-2.2.11/dce/dist/dce.js"></script>
  ```

or

  ```html
  <script src="/node_modules/dynamsoft-label-recognizer/dist/dlr.js"></script>
  <script src="/node_modules/dynamsoft-camera-enhancer/dist/dce.js"></script>
  ```

or

  ```ts
  import { LabelRecognizer } from 'dynamsoft-label-recognizer';
  import { CameraEnhancer, DrawingItem } from 'dynamsoft-camera-enhancer';
  ```

### Configure the SDK

Before using the SDK, you need to configure a few things.

#### Specify the license

The SDK requires a license to work, use the API `license` to specify a license key.

```javascript
Dynamsoft.DLR.LabelRecognizer.license = "YOUR-LICENSE-KEY";
```

To test the SDK, you can request a 30-day trial license via the [customer portal](https://www.dynamsoft.com/customer/license/trialLicense?utm_source=guide&product=dlr&package=js).

#### Specify the location of the "engine" files

If the engine files (\*.worker.js, \*.wasm.js and \*.wasm, etc.) are not in the same location with the main SDK file (dlr.js), you can use the API `engineResourcePath` to specify the engine path, for example:

```javascript
// The following code uses the jsDelivr CDN, feel free to change it to your own location of these files.
Dynamsoft.DLR.LabelRecognizer.engineResourcePath = "https://cdn.jsdelivr.net/npm/dynamsoft-label-recognizer@2.2.11/dist/";
Dynamsoft.DCE.CameraEnhancer.engineResourcePath = "https://cdn.jsdelivr.net/npm/dynamsoft-camera-enhancer@3.0.1/dist/";
```

**This configuration is usually required with frameworks like Angular or React where dlr.js is compiled into another file.**

#### Add a visual cue about the loading of a .data file

The .data files are crucial for the recognition of certain types of text. For example, to read the MRZ zone on passports, the file MRZ.data must be loaded first. These .data files are loaded from the server on demand at runtime which could be time-consuming. To make the process user-friendly, it's recommended to show a visual cue about the loading process to the user with the help of the APIs `onResourcesLoadStarted` , `onResourcesLoadProgress` and `onResourcesLoaded` :

> These files are cached locally as soon as they are downloaded, so they load very quickly from the second time on.

```js
Dynamsoft.DLR.LabelRecognizer.onResourcesLoadStarted = (resourcePath) => {
    // In this event handler, you can display a visual cue to show that the model file is being downloaded.
    console.log("Loading " + resourcePath);
};
Dynamsoft.DLR.LabelRecognizer.onResourcesLoadProgress = (resourcePath, progress) => {
    // In this event handler, you can display the loading progress of the model file.
    console.log(resourcePath + "loading progress: " + progress.loaded + "/" + progress.total);
}
Dynamsoft.DLR.LabelRecognizer.onResourcesLoaded = (resourcePath) => {
    // In this event handler, you can close the visual cue if it was displayed.
    console.log("Finished loading " + resourcePath);
};
```

### Interact with the SDK

#### Create a `LabelRecognizer` object

To use the SDK, we first create a `LabelRecognizer` object.

```javascript
let recognizer = null;
try {
    recognizer = await Dynamsoft.DLR.LabelRecognizer.createInstance();
} catch (ex) {
    console.error(ex);
}
```

#### Create a `CameraEnhancer` object and bind it to the `LabelRecognizer` object

A `CameraEnhancer` object is required for video recognition.

```javascript
let cameraEnhancer = await Dynamsoft.DCE.CameraEnhancer.createInstance();
let options = {
    resultsHighlightBaseShapes: Dynamsoft.DCE.DrawingItem
};
await recognizer.setImageSource(cameraEnhancer, options);
```

#### Change the camera settings if necessary

In some cases, a different camera might be required instead of the default one. Also, a different resolution might work better. To change the camera or the resolution, we use the `CameraEnhancer` object. Learn more [here](https://www.dynamsoft.com/camera-enhancer/docs/programming/javascript/api-reference/camera-control.html?ver=3.0.1&utm_source=guide&product=dlr&package=js).

```javascript
// The following lines set which camera and what resolution to use.
let allCameras = await cameraEnhancer.getAllCameras();
await cameraEnhancer.selectCamera(allCameras[0]);
await cameraEnhancer.setResolution(1280, 720);
```

#### Set up the recognition process

Check out the following code:

```javascript
// Sets up the scanner behavior
let scanSettings = await recognizer.getScanSettings();
// Disregards duplicated results found in a specified time period (in milliseconds).
scanSettings.duplicateForgetTime = 5000; // The default is 3000
// Sets a scan interval in milliseconds so the SDK may release the CPU from time to time.
// (setting this value larger is a simple way to save battery power and reduce device heating).
scanSettings.intervalTime = 100; // The default is 0.
// Sets captureAndDecodeInParallel to false, which tells the SDK not to acquire the next frame while decoding the first.
// This is another way to save battery power and is recommended on low-end phones. However, it does slow down the decoding speed.
scanSettings.captureAndDecodeInParallel = false; // The default is true.
await recognizer.updateScanSettings(scanSettings);
```

```javascript
// The following line configures the SDK to use the template "video-MRZ" which is one of the built-in RuntimeSetting templates: 
// "number", "letter", "numberLetter", "numberUppercase", "VIN", "VIN_NA", "MRZ", "passportMRZ", "visaMRZ"
// "video-number", "video-letter", "video-numberLetter", "video-numberUppercase", "video-VIN", "video-VIN_NA", "video-MRZ", "video-passportMRZ", "video-visaMRZ"
// NOTE: For convenience, these names are not case-sensitive.
await recognizer.updateRuntimeSettingsFromString("video-passportMRZ");
```

As you can see from the above code snippets, there are two types of configurations:

* `get/updateScanSettings`: Configures the behavior of the recognizer which includes `duplicateForgetTime` and `intervalTime`, etc.

* `updateRuntimeSettingsFromString`: Configures the recognizer engine with a built-in template or a template represented by a JSON string. This will override the previous RuntimeSettings. In our case, we use the template "video-passportMRZ" which is meant for reading the machine readable zone (MRZ) on a passport.

  > Note that templates starting with "video-" are only valid after a `CameraEnhancer` instance has been bound to this `LabelRecognizer` instance.

#### Customize the UI

The built-in UI of the `LabelRecognizer` object is defined in the file `dist/dlr.ui.html` . There are a few ways to customize it:

* Modify the file `dlr.ui.html` directly.

  This option is only possible when you host this file on your own web server instead of using a CDN. Note that this file is put in the **dist** directory of the **dynamsoft-camera-enhancer** package.

* Copy the file `dlr.ui.html` to your application, modify it and pass its URL to the API `setUIElement` to set it as the default UI.

  ```javascript
  await cameraEnhancer.setUIElement("THE-URL-TO-THE-FILE");
  ```

* Append the default UI element to your page, customize it before showing it.

  ```html
  <div id="recognizerUI"></div>
  ```

  ```javascript
  await cameraEnhancer.open();
  document.getElementById('recognizerUI').appendChild(cameraEnhancer.getUIElement());
  document.getElementsByClassName('dce-btn-close')[0].hidden = true; // Hide the close button
  ```

* Build the UI element into your own web page and specify it with the API `setUIElement(HTMLElement)`.

  * Embed the video

    ```html
    <div id="div-ui-container" style="width:100%;height:100%;">
        <div class="dce-video-container" style="position:relative;width:100%;height:500px;"></div>
    </div>
    <script>
        (async () => {
            let cameraEnhancer = await Dynamsoft.DCE.CameraEnhancer.createInstance();
            await cameraEnhancer.setUIElement(document.getElementById('div-ui-container'));
            let recognizer = await Dynamsoft.DLR.LabelRecognizer.createInstance();
            let options = {
                resultsHighlightBaseShapes: Dynamsoft.DCE.DrawingItem
            };
            await recognizer.setImageSource(cameraEnhancer, options);
            await recognizer.updateRuntimeSettingsFromString("video-passportMRZ");
            await recognizer.startScanning(true);
        })();
    </script>
    ```

    > The video element will be created and appended to the DIV element with the class `dce-video-container` , make sure the class name is the correct. Also note that the CSS property `position` of the DIV element must be either `relative` , `absolute` , `fixed` , or `sticky` .

  * Add the camera list and resolution list

    If the class names for these lists match the default ones, `dce-sel-camera` and `dce-sel-resolution` , the SDK will automatically populate the lists and handle the camera/resolution switching.

    ```html
    <div id="div-ui-container" style="width:100%;height:100%;">
        <select class="dce-sel-camera"></select><br>
        <div class="dce-video-container" style="position:relative;width:100%;height:500px;"></div>
    </div>
    ```

    ```html
    <div id="div-ui-container">
        <select class="dce-sel-camera"></select>
        <select class="dce-sel-resolution"></select>
        <br>
        <div class="dce-video-container" style="position:relative;width:100%;height:500px;"></div>
    </div>
    ```

    > By default, only 3 hard-coded resolutions (3840 x 2160, 1920 x 1080, 1280 x 720), are populated as options. You can show a customized set of options by hardcoding them.

    ```html
    <select class="dce-sel-resolution">
        <option class="dce-opt-gotResolution" value="got"></option>
        <option data-width="1280" data-height="720">1280x720</option>
        <option data-width="1920" data-height="1080">1920x1080</option>
    </select>
    ```

    > Generally, you need to provide a resolution that the camera supports. However, in case a camera does not support the specified resolution, it usually uses the cloest supported resolution. As a result, the selected resolution may not be the actual resolution. In this case, add an option with the class name `dce-opt-gotResolution` (as shown above) and the SDK will then use it to show the **actual resolution**.

#### Starts the recognition

The last step is to attach event handlers to the events `onImageRead` (optional) and `onMRZRead` before calling `startScanning()` to starts the recognition process.

```javascript
recognizer.onImageRead = results => {
    for (let result of results) {
        for (let lineResult of result.lineResults) {
            console.log(lineResult.text);
        }
    }
};
recognizer.onMRZRead = (txt, results) => {
    // In this event handler, you get a two-line string recognized from the MRZ on passports from which you can further decode and display meaningful information such as name, nationality, etc.
    // Note that if you use the template video-MRZ, you may also get a three-line string.
    alert(txt);
};
await recognizer.startScanning(true);
```

## API Documentation

You can check out the detailed documentation about the APIs of the SDK at
[https://www.dynamsoft.com/label-recognition/docs/programming/javascript/api-reference/?ver=2.2.11&utm_source=guide&product=dlr&package=js](https://www.dynamsoft.com/label-recognition/docs/programming/javascript/api-reference/?ver=2.2.11&utm_source=guide&product=dlr&package=js).

## System Requirements

DLR requires the following features to work:

* Secure context (HTTPS deployment)

  When deploying your application / website for production, make sure to serve it via a secure HTTPS connection. This is required for two reasons
  
  * Access to the camera video stream is only granted in a security context. Most browsers impose this restriction.
  > Some browsers like Chrome may grant the access for `http://127.0.0.1` and `http://localhost` or even for pages opened directly from the local disk (`file:///...`). This can be helpful for temporary development and test.
  
  * Dynamsoft License requires a secure context to work.

* `WebAssembly`, `Blob`, `URL`/`createObjectURL`, `Web Workers`

  The above four features are required for the SDK to work.

* `MediaDevices`/`getUserMedia`

  This API is only required for in-browser video streaming. If a browser does not support this API, the [Single Frame Mode](https://www.dynamsoft.com/barcode-reader/programming/javascript/api-reference/BarcodeScanner.html?ver=9.2.12&utm_source=guide#singleframemode) will be used automatically. If the API exists but doesn't work correctly, the Single Frame Mode can be used as an alternative way to access the camera.

* `getSettings`

  This API inspects the video input which is a `MediaStreamTrack` object about its constrainable properties.

The following table is a list of supported browsers based on the above requirements:

  Browser Name | Version
  :-: | :-:
  Chrome | v61+<sup>1</sup>
  Firefox | v52+ (v55+ on Android/iOS<sup>1</sup>)
  Edge<sup>2</sup> | v16+
  Safari<sup>3</sup> | v11+

  <sup>1</sup> iOS 14.3+ is required for camera video streaming in Chrome and Firefox or Apps using webviews.

  <sup>2</sup> On Edge, due to strict Same-origin policy, you must host the SDK files on the same domain as your web page.
  
  <sup>3</sup> Safari v11.x already has the required features, but it has many other issues, so we recommend v12+.

Apart from the browsers, the operating systems may impose some limitations of their own that could restrict the use of the SDK. Browser compatibility ultimately depends on whether the browser on that particular operating system supports the features listed above.

## Release Notes

Learn about what are included in each release at [https://www.dynamsoft.com/label-recognition/docs/programming/javascript/release-notes/?ver=latest](https://www.dynamsoft.com/label-recognition/docs/programming/javascript/release-notes/?ver=latest).

## Next Steps

Now that you have got the SDK integrated, you can choose to move forward in the following directions

1. Check out the [official samples](https://github.com/Dynamsoft/label-recognizer-javascript-samples).
2. Check out the official demos: [MRZ Scanner](https://demo.dynamsoft.com/label-recognizer-js/mrz-scanner.html), [VIN Scanner](https://demo.dynamsoft.com/label-recognizer-js/vin.html) and the [source code for the demo](https://github.com/Dynamsoft/label-recognizer-javascript-demo).
3. Learn about the available [APIs](https://www.dynamsoft.com/label-recognition/docs/programming/javascript/api-reference/?ver=latest).
