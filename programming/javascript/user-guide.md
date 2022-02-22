---
layout: default-layout
title: Dynamsoft Label Recognizer - JavaScript User Guide
description: This is the user guide page of Dynamsoft Label Recognizer for JavaScript Language.
keywords: javascript, user guide
needAutoGenerateSidebar: true
needGenerateH3Content: true
---

# Dynamsoft Label Recognizer for Your Website

Add the capability of reading ID cards or other text of fixed formats in your web application with just a few lines of code.

[![](https://img.shields.io/badge/Download-Offline%20SDK-orange)](https://www.dynamsoft.com/survey/dlr/?utm_source=guide&product=dlr&package=js)

Once integrated, your users can open your website in a browser, access their cameras, and read the intended text directly from the video input.

In this guide, you will learn step by step on how to integrate this library into your website.

[TEST THE LIBRARY](https://www.dynamsoft.com/survey/dlr/?utm_source=guide&product=dlr&package=js)

**Table of Contents**

* [Hello World - Simplest Implementation](#hello-world---simplest-implementation)
* [Building your own page](#building-your-own-page)
  + [Include the library](#include-the-library)
  + [Configure the library](#configure-the-library)
  + [Interact with the library](#interact-with-the-library)
* [Requesting A Trial](#requesting-a-trial)
* [System Requirements](#system-requirements)
* [Hosting the Library](#hosting-the-library)
* [FAQ](#faq)

**Other resources**

* [API reference](https://www.dynamsoft.com/label-recognition/programming/javascript/api-reference/?ver=latest&utm_source=guide&product=dlr&package=js)

## Hello World - Simplest Implementation

Let's start by testing the "Hello World" example of the library which demonstrates how to use the minimum code to enable a web page to read text from a live video stream.  

* Basic Requirements
  + Internet connection  
  + [A supported browser](#system-requirements)
  + Camera access  

### Step One: Check the code of the example

The complete code of the "Hello World" example is shown below

```html
<!DOCTYPE html>
<html>

<body>
<script src="https://cdn.jsdelivr.net/npm/dynamsoft-label-recognizer@2.2.1/dist/dlr.js"></script>
<script src="https://cdn.jsdelivr.net/npm/dynamsoft-camera-enhancer@2.0.3/dist/dce.js"></script>
    <script>
        // initializes and uses the library
        (async () => {
            Dynamsoft.DCE.CameraEnhancer.defaultUIElementURL = Dynamsoft.DLR.LabelRecognizer.defaultUIElementURL;
            let cameraEnhancer = await Dynamsoft.DCE.CameraEnhancer.createInstance();

            let recognizer = await Dynamsoft.DLR.LabelRecognizer.createInstance({
                runtimeSettings: "video-letter"
            });
            recognizer.onFrameRead = results => {
                for (let result of results) {
                    for (let lineResult of result.lineResults) {
                        console.log(lineResult.text);
                    }
                }
            };
            recognizer.onUniqueRead = (txt, results) => {
                alert(txt);
            };
            recognizer.cameraEnhancer = cameraEnhancer;
            await recognizer.startScanning(true);
        })();
    </script>
</body>

</html>
```

<p align="center" style="text-align:center; ">
  <!--<a target="_blank" href="https://github.com/Dynamsoft/barcode-reader-javascript-samples/blob/master/1.hello-world/1.minimum-code.html" title="Code in Github">
    <img src="https://cdn.jsdelivr.net/npm/simple-icons@3.0.1/icons/github.svg" alt="Code in Github" style="width:20px;height:20px;">
  </a>
  &nbsp;-->
  <a target="_blank" href="https://jsfiddle.net/DynamsoftTeam/pL4e7yrd/" title="Run via JSFiddle">
    <img src="https://cdn.jsdelivr.net/npm/simple-icons@3.0.1/icons/jsfiddle.svg" alt="Run via JSFiddle" style="width:20px;height:20px;">
  </a>
  <!--&nbsp;
  <a target="_blank" href="https://demo.dynamsoft.com/Samples/DBR/JS/1.hello-world/1.minimum-code.html?utm_source=guide" title="Run in Dynamsoft">
    <img src="https://cdn.jsdelivr.net/npm/@fortawesome/fontawesome-free@6.0.0/svgs/solid/circle-play.svg" alt="Run in Dynamsoft" style="width:20px;height:20px;">
  </a>
  &nbsp;
  <a target="_blank" href="https://tst.dynamsoft.com/public/download/dbr/browser/code/helloworld-v8.8.7.zip?utm_source=guide" title="Download from Dynamsoft">
    <img src="https://cdn.jsdelivr.net/npm/@fortawesome/fontawesome-free@6.0.0/svgs/solid/download.svg" alt="Download from Dynamsoft" style="width:20px;height:20px; ">-->
  </a>
</p>

-----

*About the code*

  + `LabelRecognizer.createInstance()`: This method creates a `LabelRecognizer` object called `recognizer`. Note that the code passed the configuration `runtimeSettings: "video-letter"` which sets up `recognizer` with a built-in template optimized for reading letters from continous video frames. Note that this template can later be swapped or changed by the method `updateRuntimeSettingsFromString()`.

  + `CameraEnhancer.createInstance()`: this method creates a `CameraEnhancer` object called `cameraEnhancer` which is used to control the camera as well as the default user interface. To use `cameraEnhancer` with `recognizer`, we pass to it the customized UI provided by the Dynamsoft Label Recognizer SDK and then bind it to `recognizer` to allow the latter to fetch frames from the camera for recognition as well as highlight the recognized text areas.

  + `onFrameRead`: This event is triggered every time the library finishes scanning a video frame. The `results` object contains all the text results that the library has found on this frame. In this example, we print the results to the browser console.

  + `onUniqueRead`: This event is triggered when the library finds a new text, which is not a duplicate among multiple frames. `txt` holds the text value while `results` is an array of objects that hold details of the text. In this example, an alert will be displayed for this new text.

  + `startScanning(true)`: Starts contious video frame scanning. The return value is a Promise which resovles when the camera is opened, the video shows up on the page and the scanning begins (which means `cameraEnhancer` has started feeding `recognizer` with frames to recognize).

### Step Two: Test the example

Create a text file with the name "helloworld.html", fill it with the code above and save. After that, open the example page in a browser, allow the page to access your camera and the video will show up on the page. After that, you can point the camera at something with a simple line of text to read it.

If the text is decoded, an alert will pop up with the result text. At the same time, the text location will be highlighted in the video feed. 

  > For first use, you may need to wait a few seconds for the library to initialize.

*Note*:

  + The library only scans a new frame when it has finished scanning the previous frame. The interval between two consecutive frames might not be enough time for the library to process the 1st frame (for 30 FPS, the interval is about 33 ms), therefore, not all frames are scanned.

  + The library requires a license to work. However, when no license is specified in the code, a [free public trial license](https://www.dynamsoft.com/license-server/docs/about/terms.html?ver=latest#public-trial-license?utm_source=guide&product=dlr&package=js) will be applied. You can make initial evaluation of the library to decide whether or not you want to evaluate it further. If you do want more evaluation time, you can [request a trial](#requesting-a-trial).
    > Network connection is required for the free public trial license to work.

If the test doesn't go as expected, you can check out the [FAQ](#faq) or [contact us](https://www.dynamsoft.com/company/contact/?utm_source=guide&product=dlr&package=js).

## Building your own page

### Include the library

#### Use a CDN

The simplest way to include the library is to use either the [jsDelivr](https://jsdelivr.com/) or [UNPKG](https://unpkg.com/) CDN. The "hello world" example above uses **jsDelivr**. Since the recognition is mostly on a video input, we should also include the supporting library Dynamsoft Camera Enhancer.

* jsDelivr

```html
<script src="https://cdn.jsdelivr.net/npm/dynamsoft-label-recognizer@2.2.1/dist/dlr.js"></script>
<script src="https://cdn.jsdelivr.net/npm/dynamsoft-camera-enhancer@2.0.3/dist/dce.js"></script>
```

* UNPKG  

```html
<script src="https://unpkg.com/dynamsoft-label-recognizer@2.2.1/dist/dlr.js"></script>
<script src="https://unpkg.com/dynamsoft-camera-enhancer@2.0.3/dist/dce.js"></script>
```

#### Host the library yourself

Besides using the CDN, you can also download the library and host its files on your own website / server before including it in your application.

The following shows a few ways to download the library.

* From the website

  [Download the JavaScript Package](https://www.dynamsoft.com/survey/dlr/?utm_source=guide&product=dlr&package=js)

  > NOTE that the package contains the library Dynamsoft Camera Enhancer

* yarn

```cmd
$ yarn add dynamsoft-label-recognizer
$ yarn add dynamsoft-camera-enhancer
```

* npm

```
$ npm install dynamsoft-label-recognizer@2.2.1 --save
$ npm install dynamsoft-camera-enhancer@2.0.3 --save
```

Depending on how you downloaded the library and where you put it. You can typically include it like this:

```html
<script src="/dlr-js-2.2.1/dist/dlr.js"></script>
<script src="/dlr-js-2.2.1/dce/dist/dce.js"></script>
```

or

```html
<script src="/node_modules/dynamsoft-label-recognizer/dist/dlr.js"></script>
<script src="/node_modules/dynamsoft-camera-enhancer/dist/dce.js"></script>
```

Read more on [how to host the library](#hosting-the-library).

### Configure the library

Before using the library, you need to configure a few things.

#### Specify the license

The library requires a license to work, use the API `license` to specify the license.

```javascript
Dynamsoft.DLR.LabelRecognizer.license =
  "YOUR-ORGANIZATION-ID or YOUR-HANDSHAKECODE or AN-OFFLINE-LICENSE or ANY-OTHER-TYPE-OF-SUPPORTED-LICENSE-STRING";
```

*Note*:

* When specified by YOUR-ORGANIZATION-ID or YOUR-HANDSHAKECODE, the license is an online license and a network connection to Dynamsoft License Server is required for it to work.
* In most cases, online licenses are offered. If you want to use an offline license, you can [contact us](https://www.dynamsoft.com/company/contact/?utm_source=guide).
* If nothing is specified like the above "hello world" example, a [free public trial license](https://www.dynamsoft.com/company/contact/?utm_source=guide&product=dlr&package=js) will be automatically used. This license requires a network connection.

#### Specify the location of the "engine" files

The "engine" files refer to *.worker.js, *.wasm.js and *.wasm, etc. which are loaded by the main library at runtime. This configuration option uses the API `engineResourcePath` and is often not required as these files usually are in the same location with the main library file (dlr.js). However, in cases where the engine files are not in the same location as the main library file (for example, with frameworks like Angular or React, dlr.js is compiled into another file), this configuration will be required.

The following code uses the jsDelivr CDN, feel free to change it to your own location of these files.

```javascript
Dynamsoft.DLR.LabelRecognizer.engineResourcePath = "https://cdn.jsdelivr.net/npm/dynamsoft-label-recognizer@2.2.1/dist/";
Dynamsoft.DCE.CameraEnhancer.engineResourcePath = "https://cdn.jsdelivr.net/npm/dynamsoft-camera-enhancer@2.0.3/dist/";
```

### Interact with the library

#### Create a `LabelRecognizer` object

To use the library, we first create a `LabelRecognizer` object.

```javascript
let recognizer = null;
try {
    recognizer = await Dynamsoft.DLR.LabelRecognizer.createInstance({
        runtimeSettings: "video-letter"
    });
} catch (ex) {
    console.error(ex);
}
```

*Note*:

* The creation of an object consists of two parallel tasks: one is to download and compile the "engine", the other is to fetch a license from Dynamsoft License Server (assuming an online license is used).

#### Create a `CameraEnhancer` object and bind it to the `LabelRecognizer` object

A `CameraEnhancer` object is required for video recognition. Also, the object should make use of a customized UI from the Label Recognition SDK to streamline the recognition.

```javascript
Dynamsoft.DCE.CameraEnhancer.defaultUIElementURL = Dynamsoft.DLR.LabelRecognizer.defaultUIElementURL;
let cameraEnhancer = await Dynamsoft.DCE.CameraEnhancer.createInstance();
recognizer.cameraEnhancer = cameraEnhancer;
```

#### Change the camera settings if necessary.

In some cases, a different camera might be required instead of the default one. Also, a different resolution might work better. To change the camera or the resolution, we use the `CameraEnhancer` object. Learn more [here](https://www.dynamsoft.com/camera-enhancer/docs/programming/javascript/api-reference/camera-control.html?ver=latest&utm_source=guide&product=dlr&package=js).

```javascript
// set which camera and what resolution to use
var allCameras = await enhancer.getAllCameras();
await enhancer.selectCamera(allCameras[0]);
await enhancer.setResolution(1280, 720);
```

#### Set up the recognition process

Check out the following code:

```javascript
let scanSettings = await recognizer.getScanSettings();
// disregard duplicated results found in a specified time period (in milliseconds)
scanSettings.duplicateForgetTime = 6000;
// set a scan interval in milliseconds so the library may release the CPU from time to time
scanSettings.intervalTime = 100;
await recognizer.updateScanSettings(scanSettings);
```

```javascript
// use one of the built-in RuntimeSetting templates: "number", "letter", "numberLetter", "numberUppercase", "VIN", "passportMRZ", "video-number", "video-letter", "video-numberLetter", "video-numberUppercase", "video-VIN", "video-passportMRZ". For convenience, these names are not case-sensitive. You can also pass in a JSON string as the template.
await recognizer.updateRuntimeSettingsFromString("video-passportMRZ");
```

As you can see from the above code snippets, there are two types of configurations:

* `get/updateScanSettings`: Configures the behavior of the recognizer which includes `duplicateForgetTime` and `intervalTime`.

* `updateRuntimeSettingsFromString`: Configures the recognizer engine with a built-in template or a template represented by a JSON string. If a template was configured at creation, it will be replaced.

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
await enhancer.setUIElement(Dynamsoft.DLR.LabelRecognizer.defaultUIElementURL);
document.getElementById('recognizerUI').appendChild(enhancer.getUIElement());
document.getElementsByClassName('dce-btn-close')[0].hidden = true; // Hide the close button
```

* Build the UI element into your own web page and specify it with the API `setUIElement(HTMLElement)`.

  + Embed the video

```html
<div id="div-video-container" style="width:640px; height:500px; position: relative;">
    <video class="dce-video" playsinline="true" muted style="position:absolute;left:0;top:0;width:100%;height:100%;"></video>
</div>
<script>
    (async () => {
        let cameraEnhancer = await Dynamsoft.DCE.CameraEnhancer.createInstance();
        await cameraEnhancer.setUIElement(document.getElementById('div-video-container'));
        let recognizer = await Dynamsoft.DLR.LabelRecognizer.createInstance({
            runtimeSettings: "video-passportMRZ"
        });
        recognizer.cameraEnhancer = cameraEnhancer;
        recognizer.onFrameRead = results => {
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
```

> The video element must have the class `dce-video` .

  + Add the camera list and resolution list
    If the class names for these lists match the default ones, `dce-sel-camera` and `dce-sel-resolution` , the library will automatically populate the lists and handle the camera/resolution switching.

```html
<select class="dce-sel-camera" style="position:absolute;left:0;top:0;"></select>
```

```html
<select class="dce-sel-resolution" style="position:absolute;left:0;top:20px;"></select>
```

> Generally, you need to provide a resolution that the camera supports. However, in case a camera does not support the specified resolution, it usually uses the nearest supported resolution. As a result, the selected resolution may not be the actual resolution used. In this case, add an option with the class name `dce-opt-gotResolution` (as shown below) and the library will then use it to show the actual resolution.

```html
<select class="dce-sel-resolution" style="position:absolute;left:0;top:20px;">
    <option class="dce-opt-gotResolution" value="got"></option>
    <option data-width="1920" data-height="1080">1920x1080</option>
    <option data-width="1280" data-height="720">1280x720</option>
    <option data-width="640" data-height="480">640x480</option>
</select>
```

Interested to test it further? Read on to learn how to request a 30-day free trial.

## Requesting A Trial

If no license is specified, a [free public trial license](https://www.dynamsoft.com/license-server/docs/about/terms.html?ver=latest#public-trial-license?utm_source=guide&product=dlr&package=js) will be used by default. 

> Network connection is required for the free public trial license to work.

After that, if you want to evaluate the library further, you can [register for a Dynamsoft account](https://www.dynamsoft.com/api-common/Regist/Regist?utm_source=guide&product=dlr&package=js) (if you haven't already done so) and request a 30-day trial in the [customer portal](https://www.dynamsoft.com/customer/license/trialLicense?utm_source=guide&product=dlr&package=js).

* If you like, you can also [contact our support team](https://www.dynamsoft.com/company/contact/?utm_source=guide&product=dlr&package=js) to get a trial license.

## System Requirements

This library requires the following features which are supported by all modern mainstream browsers:

* `WebAssembly`, `Blob`, `URL`/`createObjectURL`,  `Web Workers`  

  The above four features are required for the library to work.

* `MediaDevices`/`getUserMedia`

  This API is only required for in-browser video streaming. If a browser does not support this API, the [Single Frame Mode](https://www.dynamsoft.com/label-recognition/programming/javascript/api-reference/ui.html?ver=latest&utm_source=guide&product=dlr&package=js#singleframemode) will be used automatically. If the API exists but doesn't work correctly, the Single Frame Mode can be used as an alternative way to access the camera.

The following table is a list of supported browsers based on the above requirements:

  Browser Name | Version
  :-: | :-:
  Chrome | v57+ (v59+ on Android/iOS<sup>1</sup>)
  Firefox | v52+ (v55+ on Android/iOS<sup>1</sup>)
  Edge<sup>2</sup> | v16+
  Safari<sup>3</sup> | v11+

  <sup>1</sup> iOS 14.3+ is required for camera video streaming in Chrome and Firefox or Apps using webviews.
  <sup>2</sup> On Edge, due to strict Same-origin policy, you must host the library files on the same domain as your web page. 
  <sup>3</sup> Safari 11.2.2 ~ 11.2.6 are not supported.

Apart from the browsers, the operating systems may impose some limitations of their own that could restrict the use of the library. Browser compatibility ultimately depends on whether the browser on that particular operating system supports the features listed above.

## Hosting the library

### Step One: Deploy the dist folder

Once you have downloaded the library, you can locate the "dist" directory and copy it to your server (usually as part of your website / web application). The following shows some of the files in this directory:

* `dlr.js` // The main library file
* `dlr.ui.html` // Defines the default recognizer UI
* `dlr-<version>.worker.js` // Defines the worker thread for text reading
* `dlr-<version>.wasm.js` // The recognition engine (.js)
* `dlr-<version>.wasm` // The recognition engine (.wasm)

NOTE: the files for Dynamsoft Camera Enhancer are often required as well and can be copied to the same location as the above "dist" directory.

### Step Two: Configure the Server

* Set the MIME type for `.wasm` as `application/wasm` and `.data` as `application/octet-stream` on your webserver.
  
  The goal is to configure your server to send the correct Content-Type header for the wasm file so that it is processed correctly by the browser.

  Different types of webservers are configured differently, for example:

  + [Apache](https://developer.mozilla.org/en-US/docs/Learn/Server-side/Apache_Configuration_htaccess)
  + [IIS](https://docs.microsoft.com/en-us/iis/configuration/system.webserver/staticcontent/mimemap)
  + [NGINX](https://developer.mozilla.org/en-US/NGINX_configuration_snippets)

* Enable HTTPS

  To use the library, you must access your website / web application via a secure HTTPS connection. This is due to browser security restrictions which only grant camera video streaming access to a [secure context](https://developer.mozilla.org/en-US/docs/Web/Security/Secure_Contexts).

  > For convenience, self-signed certificates can be used during development and testing.

### Step Three: Include the library from the server

Now that the library is hosted on your server, you can include it accordingly.

```html
<script src="https://www.yourwebsite.com/dynamsoft-label-recognizer/dist/dlr.js"></script>
<script src="https://www.yourwebsite.com/dynamsoft-camera-enhancer/dist/dce.js"></script>
```

Optionally, you may also need to [specify the location of the "engine" files](#specify-the-location-of-the-engine-files).

## FAQ

### Can I open the web page directly from the hard drive?

Yes, for simple testing purposes, it's perfectly fine to open the file directly from the hard drive. However, you might encounter some issues in doing so (like unable to access the camera, etc.). The recommendation is to deploy this page to your web server and run it over **HTTPS**. If you don't have a ready-to-use web server but have a package manager like *npm* or *yarn*, you can set up a simple HTTP server in minutes. Check out [http-server on npm](https://www.npmjs.com/package/http-server). 

### Why can't I use my camera?

If you open the web page as `file:///` or `http://` , the camera may not work and you see the following error in the browser console:

> [Deprecation] getUserMedia() no longer works on insecure origins. To use this feature, you should consider switching your application to a secure origin, such as HTTPS. See https://goo.gl/rStTGz for more details.

* In Safari 12 the equivalent error is:

> Trying to call "getUserMedia" from an insecure document.

You get this error because the API [getUserMedia](https://developer.mozilla.org/en-US/docs/Web/API/MediaDevices/getUserMedia) requires HTTPS to access the camera.

* If you use Chrome or Firefox, you might not get the error because these two browsers allow camera access via file:/// and http://localhost.

To make sure your web application can access the camera, please configure your web server to support HTTPS. The following links may help.

  + NGINX: [Configuring HTTPS servers](https://nginx.org/en/docs/http/configuring_https_servers.html)
  + IIS: [Create a Self Signed Certificate in IIS](https://aboutssl.org/how-to-create-a-self-signed-certificate-in-iis/)
  + Tomcat: [Setting Up SSL on Tomcat in 5 minutes](https://dzone.com/articles/setting-ssl-tomcat-5-minutes)
  + Node.js: [npm tls](https://nodejs.org/docs/v0.4.1/api/tls.html)
