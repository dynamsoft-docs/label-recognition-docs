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

Add the capability of reading ID cards, passport MRZs, VIN numbers, and various other other fixed text fields in your web application with just a few lines of code.

![version](https://img.shields.io/npm/v/dynamsoft-label-recognizer.svg)
![downloads](https://img.shields.io/npm/dm/dynamsoft-label-recognizer.svg)
![jsdelivr](https://img.shields.io/jsdelivr/npm/hm/dynamsoft-label-recognizer.svg)
![vulnerabilities](https://img.shields.io/snyk/vulnerabilities/npm/dynamsoft-label-recognizer.svg)

Once integrated, your users can open your website in a browser, access their cameras, and read the intended text directly from the video input.

In this guide, you will learn step by step on how to integrate this SDK into your website.

<span style="font-size:20px">Table of Contents</span>

* [Hello World - Simplest Implementation](#hello-world---simplest-implementation)
* [Building your own page](#building-your-own-page)
  * [Include the SDK](#include-the-sdk)
  * [Configure the SDK](#configure-the-sdk)
  * [Interact with the SDK](#interact-with-the-sdk)
* [API Documentation](#api-documentation)
* [System Requirements](#system-requirements)

## Hello World - Simplest Implementation

Let's start by testing the "Hello World" example of the SDK which demonstrates how to use the minimum code to enable a web page to read text from a live video stream.  

* Basic Requirements
  * Internet connection  
  * [A supported browser](#system-requirements)
  * Camera access  

### Check the code

The complete code of the "Hello World" example is shown below

```html
<!DOCTYPE html>
<html>

<body>
    <script src="https://cdn.jsdelivr.net/npm/dynamsoft-label-recognizer@2.2.10/dist/dlr.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/dynamsoft-camera-enhancer@2.3.2/dist/dce.js"></script>
    <script>
        // The following line specifies a license, you can visit https://www.dynamsoft.com/customer/license/trialLicense?utm_source=guide&product=dlr&package=js to get your own trial license good for 30 days.
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
            Dynamsoft.DCE.CameraEnhancer.defaultUIElementURL = Dynamsoft.DLR.LabelRecognizer.defaultUIElementURL;
            let cameraEnhancer = await Dynamsoft.DCE.CameraEnhancer.createInstance();
            recognizer.setImageSource(cameraEnhancer);
            await recognizer.updateRuntimeSettingsFromString("video-letter");
            recognizer.onImageRead = results => {
                for (let result of results) {
                    for (let lineResult of result.lineResults) {
                        console.log(lineResult.text);
                    }
                }
            };
            recognizer.onUniqueRead = (txt, results) => {
                alert(txt);
            };
            await recognizer.startScanning(true);
        })();
    </script>
</body>

</html>
```

<p align="center" style="text-align:center; white-space: normal; ">
  <a target="_blank" href="https://jsfiddle.net/DynamsoftTeam/b1w8vm0t/" title="Run via JSFiddle">
    <img src="https://cdn.jsdelivr.net/npm/simple-icons@3.0.1/icons/jsfiddle.svg" alt="Run via JSFiddle" width="20" height="20" style="width:20px;height:20px;">
  </a>
</p>

-----

#### About the code

* `LabelRecognizer.createInstance()`: This method creates a `LabelRecognizer` object called `recognizer`.

* `CameraEnhancer.createInstance()`: this method creates a `CameraEnhancer` object called `cameraEnhancer` which is used to control the camera as well as the default user interface. To use `cameraEnhancer` with `recognizer`, we pass to it the customized UI provided by the Dynamsoft Label Recognizer SDK via `defaultUIElementURL` and then bind it to `recognizer` with `setImageSource()` to allow the latter to fetch frames from the camera for recognition as well as highlight the recognized text areas.

* `updateRuntimeSettingsFromString("video-letter")`: this sets up `recognizer` with a built-in template optimized for reading letters from continous video frames. Note that the built-in templates starting with "video-" are only valid after a `CameraEnhancer` instance has been bound to this `LabelRecognizer` instance.

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

* `onImageRead`: This event is triggered every time the SDK finishes scanning a video frame image. The `results` object contains all the text results that the SDK has found on this frame. In this example, we print the results to the browser console.

* `onUniqueRead`: This event is triggered when the SDK finds a new text, which is not a duplicate among multiple frames. `txt` holds the text value while `results` is an array of objects that hold details of the text. In this example, an alert will be displayed for this new text.

  > While the events `onImageRead` and `onUniqueRead` work for all templates, extra events are provided for certain templates for easier usage. For example, you can use `onMRZRead` if one of the MRZ-related templates is used or use `onVINRead` if one of the VIN-related templates is used.

* `startScanning(true)`: Starts contious video frame scanning. The return value is a Promise which resovles when the camera is opened, the video shows up on the page and the scanning begins (which means `cameraEnhancer` has started feeding `recognizer` with frames to recognize).

### Test the code

Create a text file with the name "helloworld.html", fill it with the code above and save. After that, open the example page in a browser, allow the page to access your camera and the video will show up on the page. After that, you can point the camera at something with a simple line of text to read it.

> You can also just test it at [https://jsfiddle.net/DynamsoftTeam/b1w8vm0t/](https://jsfiddle.net/DynamsoftTeam/b1w8vm0t/)

If the text is decoded, an alert will pop up with the result text. At the same time, the text location will be highlighted in the video feed.

*Note*:

* Although the page should work properly when opened directly as a file ("file:///"), it's recommended that you deploy it to a web server before accessing it. Also, some browsers require a secure connection (HTTPS) to access the cameras, so deploying the page to a HTTPS website is the best choice.
* On first use, you may need to wait a few seconds for the SDK to initialize.
* The license "DLS2eyJvcmdhbml6YXRpb25JRCI6IjIwMDAwMSJ9" used in this sample is an online license and requires network connection to work.

If the test doesn't go as expected, you can [contact us](https://www.dynamsoft.com/company/contact/?utm_source=guide).

## Building your own page

In this section, we'll break down and show all the steps required to build a web page to read the machine readable zone (MRZ) on a passport.

### Include the SDK

#### Use a CDN

The simplest way to include the SDK is to use either the [jsDelivr](https://jsdelivr.com/) or [UNPKG](https://unpkg.com/) CDN. The "hello world" example above uses **jsDelivr**. Since the recognition is mostly on a video input, we should also include the supporting SDK Dynamsoft Camera Enhancer.

* jsDelivr

  ```html
  <script src="https://cdn.jsdelivr.net/npm/dynamsoft-label-recognizer@2.2.10/dist/dlr.js"></script>
  <script src="https://cdn.jsdelivr.net/npm/dynamsoft-camera-enhancer@2.3.2/dist/dce.js"></script>
  ```

* UNPKG  

  ```html
  <script src="https://unpkg.com/dynamsoft-label-recognizer@2.2.10/dist/dlr.js"></script>
  <script src="https://unpkg.com/dynamsoft-camera-enhancer@2.3.2/dist/dce.js"></script>
  ```

#### Host the SDK yourself

Besides using the CDN, you can also download the SDK and host its files on your own website / server before including it in your application.

To download the SDK:

* yarn

  ```cmd
  yarn add dynamsoft-label-recognizer@2.2.10
  yarn add dynamsoft-camera-enhancer@2.3.2
  ```

* npm

  ```cmd
  npm install dynamsoft-label-recognizer@2.2.10
  npm install dynamsoft-camera-enhancer@2.3.2
  ```

Depending on how you downloaded the SDK and where you put it, you can typically include it like this:

  ```html
  <script src="/dlr-js-2.2.10/dist/dlr.js"></script>
  <script src="/dlr-js-2.2.10/dce/dist/dce.js"></script>
  ```

or

  ```html
  <script src="/node_modules/dynamsoft-label-recognizer/dist/dlr.js"></script>
  <script src="/node_modules/dynamsoft-camera-enhancer/dist/dce.js"></script>
  ```

or

  ```ts
  import { LabelRecognizer } from 'dynamsoft-label-recognizer';
  ```

### Configure the SDK

Before using the SDK, you need to configure a few things.

#### Specify the license

The SDK requires a license to work, use the API `license` to specify a license key.

```javascript
Dynamsoft.DLR.LabelRecognizer.license = "YOUR-LICENSE-KEY";
```

To test the SDK, you can request a 30-day trial license via the [customer portal](https://www.dynamsoft.com/customer/license/trialLicense?utm_source=guide&product=dlr&package=js).

> If you registered for a Dynamsoft account and downloaded the SDK from the official site, Dynamsoft will generate a 30-day trial license for you and put the license key in all the downloaded samples.

#### Specify the location of the "engine" files

If the engine files (\*.worker.js, \*.wasm.js and \*.wasm, etc.) are not in the same location with the main SDK file (dlr.js), you can use the API `engineResourcePath` to specify the engine path, for example:

```javascript
// The following code uses the jsDelivr CDN, feel free to change it to your own location of these files.
Dynamsoft.DLR.LabelRecognizer.engineResourcePath = "https://cdn.jsdelivr.net/npm/dynamsoft-label-recognizer@2.2.10/dist/";
Dynamsoft.DCE.CameraEnhancer.engineResourcePath = "https://cdn.jsdelivr.net/npm/dynamsoft-camera-enhancer@2.3.2/dist/";
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

A `CameraEnhancer` object is required for video recognition. We recommend that the object should make use of a customized UI from the Label Recognition SDK to streamline the recognition.

```javascript
// This line passes the custom UI to the CameraEnhancer class to override the default UI.
Dynamsoft.DCE.CameraEnhancer.defaultUIElementURL = Dynamsoft.DLR.LabelRecognizer.defaultUIElementURL;
let cameraEnhancer = await Dynamsoft.DCE.CameraEnhancer.createInstance();
recognizer.setImageSource(cameraEnhancer);
```

#### Change the camera settings if necessary

In some cases, a different camera might be required instead of the default one. Also, a different resolution might work better. To change the camera or the resolution, we use the `CameraEnhancer` object. Learn more [here](https://www.dynamsoft.com/camera-enhancer/docs/programming/javascript/api-reference/camera-control.html?ver=2.2.10&utm_source=guide&product=dlr&package=js).

```javascript
// The following lines set which camera and what resolution to use.
let allCameras = await cameraEnhancer.getAllCameras();
await cameraEnhancer.selectCamera(allCameras[0]);
await cameraEnhancer.setResolution(1280, 720);
```

#### Set up the recognition process

Check out the following code:

```javascript
let scanSettings = await recognizer.getScanSettings();
// The following line specifies that duplicate results found within 6000 ms should be ignored. In other words, the event "onUniqueRead" will only be triggered once for the 1st of these duplicate results.
scanSettings.duplicateForgetTime = 6000;
// The following line tells the SDK to rest for 100 ms after each recognition operation. This measure can reduce power usage and device heat.
scanSettings.intervalTime = 100;
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

* Modify the file `dist/dlr.ui.html` directly.

  This option is only possible when you host this file on your own web server instead of using a CDN. This file can then be passed to a `CameraEnhancer` object with `Dynamsoft.DLR.LabelRecognizer.defaultUIElementURL` .

* Copy the file `dist/dlr.ui.html` to your application, modify it and use the API `defaultUIElementURL` to set it as the default UI.

  ```javascript
  Dynamsoft.DLR.LabelRecognizer.defaultUIElementURL = "THE-URL-TO-THE-FILE";
  ```

* Append the default UI element to your page, customize it before showing it.

  ```html
  <div id="recognizerUI"></div>
  ```

  ```javascript
  await cameraEnhancer.setUIElement(Dynamsoft.DLR.LabelRecognizer.defaultUIElementURL);
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
            recognizer.setImageSource(cameraEnhancer);
            await recognizer.updateRuntimeSettingsFromString("video-passportMRZ");
        })();
    </script>
    ```

    > The video element will be created and appended to the DIV element with the class `dce-video-container` , make sure the class name is the correct. Also note that the CSS property `position` of the DIV element must be either `relative` , `absolute` , `fixed` , or `sticky` .

  * Add the camera list and resolution list
    If the class names for these lists match the default ones, `dce-sel-camera` and `dce-sel-resolution` , the SDK will automatically populate the lists and handle the camera/resolution switching. Note that these lists must be within the containing element, in our case, they must be put inside the DIV element `div-ui-container`.

    ```html
    <select class="dce-sel-camera"></select>
    ```

    ```html
    <select class="dce-sel-resolution"></select>
    ```

    > Generally, you need to provide a resolution that the camera supports. However, in case a camera does not support the specified resolution, it usually uses the nearest supported resolution. As a result, the selected resolution may not be the actual resolution used. In this case, add an option with the class name `dce-opt-gotResolution` (as shown below) and the SDK will then use it to show the actual resolution.

    ```html
    <select class="dce-sel-resolution">
        <option class="dce-opt-gotResolution" value="got"></option>
        <option data-width="1920" data-height="1080">1920x1080</option>
        <option data-width="1280" data-height="720">1280x720</option>
        <option data-width="640" data-height="480">640x480</option>
    </select>
    ```

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
[https://www.dynamsoft.com/label-recognition/programming/javascript/api-reference/?ver=2.2.10&utm_source=guide&product=dlr&package=js](https://www.dynamsoft.com/label-recognition/programming/javascript/api-reference/?ver=2.2.10&utm_source=guide&product=dlr&package=js).

## System Requirements

The SDK requires the following features to work (some of them are required by the `CameraEnhancer` SDK for camera access):

* Secure context (HTTPS deployment)

  When deploying your application / website for production, make sure to serve it via a secure HTTPS connection. This is required for two reasons
  
  * Dynamsoft License requires a secure context to work.
  * Access to the camera video stream is only granted in a security context. Most browsers impose this restriction.
  > Some browsers like Chrome may grant the access for `http://127.0.0.1` and `http://localhost` or even for pages opened directly from the local disk (`file:///...`). This can be helpful for temporary development and test.
  
* `WebAssembly`, `Blob`, `URL`/`createObjectURL`, `Web Workers`

  The above four features are required for the SDK to work.

* `MediaDevices`/`getUserMedia`

  This API is only required for in-browser video streaming by the `CameraEnhancer` SDK.

* `getSettings`

  This API inspects the video input which is a `MediaStreamTrack` object about its constrainable properties. This is also required by the `CameraEnhancer` SDK.

The following table is a list of supported browsers based on the above requirements:

  Browser Name | Version
  :-: | :-:
  Chrome | v61+<sup>1</sup>
  Firefox | v52+ (v55+ on Android/iOS<sup>1</sup>)
  Edge<sup>2</sup> | v16+
  Safari<sup>3</sup> | v11+

  <sup>1</sup> iOS 14.3+ is required for camera video streaming in Chrome and Firefox or Apps using webviews.

  <sup>2</sup> On Edge, due to strict Same-origin policy, you must host the SDK files on the same domain as your web page.
  
  <sup>3</sup> Safari 11.2.2 ~ 11.2.6 are not supported.

Apart from the browsers, the operating systems may impose some limitations of their own that could restrict the use of the SDK. Browser compatibility ultimately depends on whether the browser on that particular operating system supports the features listed above.
