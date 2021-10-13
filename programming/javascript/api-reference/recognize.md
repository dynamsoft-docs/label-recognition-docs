---
layout: default-layout
title: Dynamsoft Label Recognizer JavaScript API - Recognition APIs
description: This page shows the recognition APIs of Dynamsoft Label Recognizer JavaScript SDK.
keywords: label recognizer, api reference, javascript, js, recognition
needAutoGenerateSidebar: true
needGenerateH3Content: true
noTitleIndex: true
breadcrumbText: Recognition APIs
---

# Recognition APIs

## Recognize Labels from Still Images

| API Name | Description |
|---|---|
| [recognize()](#recognize) | Recognizes labels from an image. |
| [recognizeBase64String()](#recognizebase64string) | Recognizes labels from a base64-encoded image (with or without MIME). |
| [recognizeUrl()](#recognizeurl) | Recognizes labels from an image specified by its URL. |
| [recognizeBuffer()](#recognizebuffer) | Recognizes labels from raw image data. |

## Recognize Labels from Video Frames

| API Name | Description |
|---|---|
| [onUnduplicatedRead](#onunduplicatedread) | This event is triggered when a new, unduplicated label is found. |
| [onFrameRead](#onframeread) | This event is triggered after the library finishes scanning a frame. |
| [recognizeCurrentFrame()](#recognizecurrentframe) | Scans the current frame of the video for labels. |

## recognize

Recognizes labels from an image. 

```typescript
recognize(source: Blob | Buffer | ArrayBuffer | Uint8Array | Uint8ClampedArray | HTMLImageElement | HTMLCanvasElement | HTMLVideoElement | string): Promise<DLRResult[]>
```

**Parameters**

`source` : specifies the image to recognize. The supported image formats include `png` , `jpeg` , `bmp` , `gif` and a few others (some browsers support `webp` , `tif` ). Also note that the image can be specified in a lot of ways including binary data, base64 string (with MIME), URL, etc.

**Return value**

A promise resolving to a `DLRResult` object that contains all the label results found in this image.

**Code snippet**

```js
let results1 = await recognizer.recognize(blob);
let results2 = await recognizer.recognize(htmlImageElement);
let results3 = await recognizer.recognize(url);
let results4 = await recognizer.recognize(strBase64WithMime); // like `data:image/png;base64,iV************`
```

You can even use an `HTMLVideoElement` as the source. If the video is playing, the current frame will be recognized.

```js
let results;
try {
    // The current frame will be recognized.
    results = await recognizer.recognize(htmlVideoElement);
    for (let result of results) {
        for (let lineResult of result.LineResults) {
            console.log(lineResult.Text);
        }
    }
} catch (ex) {
    // If there is no frame in the video, throw an exception.   
}
```

**See also**

* [Blob](https://developer.mozilla.org/en-US/docs/Web/API/Blob)
* [Buffer](https://nodejs.org/api/buffer.html#buffer_class_buffer)
* [ArrayBuffer](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/ArrayBuffer)
* [Uint8Array](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Uint8Array)
* [Uint8ClampedArray](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Uint8ClampedArray)
* [HTMLImageElement](https://developer.mozilla.org/en-US/docs/Web/API/HTMLImageElement)
* [HTMLCanvasElement](https://developer.mozilla.org/en-US/docs/Web/API/HTMLCanvasElement)
* [HTMLVideoElement](https://developer.mozilla.org/en-US/docs/Web/API/HTMLVideoElement)
* [DLRResult](./interface/dlr-result.md)

## recognizeBase64String

Recognizes labels from a base64-encoded image (with or without MIME).

```typescript
recognizeBase64String(base64Str: string): Promise<DLRResult[]>
```

**Parameters**

`base64Str` : specifies the image represented by a string.

**Return value**

A promise resolving to a `DLRResult` object that contains all the label results found in this image.

**Code snippet**

```js
let results = await recognizer.recognizeBase64String(strBase64); //e.g. `data:image/jpg;base64,Xfjshekk....` or `Xfjshekk...`.
for (let result of results) {
    for (let lineResult of result.LineResults) {
        console.log(lineResult.Text);
    }
}
```

**See also**

* [DLRResult](./interface/dlr-result.md)

## recognizeUrl

Recognizes labels from an image specified by its URL. Note that the image should either be from the same domain or has the 'Access-Control-Allow-Origin' header set to allow access from your current domain.

```typescript
recognizeUrl(url: string): Promise<DLRResult[]>
```

**Parameters**

`url` : specifies the image by its URL.

**Return value**

A promise resolving to a `DLRResult` object that contains all the label results found in this image.

**Code snippet**

```js
let results = await recognizer.recognizeUrl("https://www.yourdomain.com/imageWithBarcodes.png");
for (let result of results) {
    for (let lineResult of result.LineResults) {
        console.log(lineResult.Text);
    }
}
```

**See also**

* [DLRResult](./interface/dlr-result.md)

## recognizeBuffer

Recognizes labels from raw image data.

```typescript
recognizeBuffer(buffer: Blob | Buffer | ArrayBuffer | Uint8Array | Uint8ClampedArray, width: number, height: number, stride: number, format: EnumImagePixelFormat): Promise<DLRResult[]>
```

**Parameters**

`buffer` : specifies the image represented by a `Uint8Array` , `Uint8ClampedArray` , `ArrayBuffer` , `Blob` or `Buffer` object.

**Return value**

A promise resolving to a `DLRResult` object that contains all the label results found in this image.

**See also**

* [Blob](https://developer.mozilla.org/en-US/docs/Web/API/Blob)
* [Buffer](https://nodejs.org/api/buffer.html#buffer_class_buffer)
* [ArrayBuffer](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/ArrayBuffer)
* [Uint8Array](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Uint8Array)
* [Uint8ClampedArray](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Uint8ClampedArray)
* [EnumImagePixelFormat](./enum/EnumImagePixelFormat.md)
* [DLRResult](./interface/dlr-result.md)

| [onFrameRead](#onframeread) | This event is triggered after the library finishes scanning a frame. |
| [recognizeCurrentFrame()](#recognizecurrentframe) | Scans the current frame of the video for labels. |

## onUnduplicatedRead

This event is triggered when a new, unduplicated label is found.

```typescript
onUnduplicatedRead: (txt: string, result: DLRResult) => void
```

**Arguments**

`txt` : a string that holds the label text. 

`result` : a `DLRResult` object that contains more detailed info.

**Code Snippet**

```javascript
recognizer.onUnduplicatedRead = (txt, result) => {
    alert(txt);
    for (let lineResult of result.LineResults) {
        console.log(lineResult.Text);
    }
}
```

**See also**

* [DLRResult](./interface/dlr-result.md)

## onFrameRead

This event is triggered after the library finishes scanning a frame.

```typescript
onFrameRead: (results: DLRResult[]) => void
```

**Arguments**

`results` : a `DLRResult` object that contains all the label results in this frame.

**Code Snippet**

```js
recognizer.onFrameRead = results => {
    for (let result of results) {
        for (let lineResult of result.LineResults) {
            console.log(lineResult.Text);
        }
    }
};
```

**See also**

* [DLRResult](./interface/dlr-result.md)

## decodeCurrentFrame

Scans the current frame of the video for barcodes.

```typescript
decodeCurrentFrame(): Promise<DLRResult[]>
```

**Parameters**

None.

**Return value**

A promise resolving to a `DLRResult` object that contains all the label results found in this frame.

**Code Snippet**

```js
await recognizer.showVideo();
let results = await recognizer.decodeCurrentFrame();
for (let result of results) {
    for (let lineResult of result.LineResults) {
        console.log(lineResult.Text);
    }
}
```

**See also**

* [DLRResult](./interface/dlr-result.md)