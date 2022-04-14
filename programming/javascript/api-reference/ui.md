---
layout: default-layout
title: Dynamsoft Label Recognizer JavaScript API - UI Control
description: This page shows the UI Control APIs of Dynamsoft Label Recognizer JavaScript SDK.
keywords: label recognizer, api reference, javascript, js, ui
needAutoGenerateSidebar: true
needGenerateH3Content: true
noTitleIndex: true
breadcrumbText: UI Control
---

# UI Control

| API Name | Description |
|---|---|
| [getUIElement()](#getuielement) | Returns the HTML element that is used by the `LabelRecognizer` instance. |
| [setUIElement()](#setuielement) | Specifies an HTML element for the `LabelRecognizer` instance to use as its UI. |
| [defaultUIElementURL](#defaultuielementurl) | Returns or sets the URL of the .html file that defines the default UI Element. |
| [lineFillStyle](#linefillstyle) | Specifies the color used inside the shape which highlights a found line of text.  |
| [lineStrokeStyle](#linestrokestyle) | Specifies the color used to paint the outline of the shape which highlights a found line of text. |
| [lineLineWidth](#linelinewidth) | Specifies the line width of the outline of the shape which highlights a found line of text. |
| [regionMaskFillStyle](#regionmaskfillstyle) | Specifies the color used in the square-loop shape between the actual scanning area and the boundary of the video input. |
| [regionMaskStrokeStyle](#regionmaskstrokestyle) | Specifies the color used to paint the outline of the scanning region. |
| [regionMaskLineWidth](#regionmasklinewidth) | Specifies the width of the outline of the scanning region. |

## getUIElement

Returns the HTML element that is used by the `LabelRecognizer` instance.

```typescript
getUIElement(): HTMLElement
```

## setUIElement

Specifies an HTML element for the `LabelRecognizer` instance to use as its UI. The structure inside the element determines the appearance of the UI. See more on [how to customize the UI](../user-guide.md#customize-the-ui).

```typescript
setUIElement(elementOrURL: HTMLElement | string): Promise<void>
```

**Parameters**

`elementOrURL` : specifies the element.

**Return value**

A promise that resolves when the operation succeeds.

**Code Snippet**

```html
<!-- Define an element that shows only the video input -->
<video class="dce-video" playsinline="true"></video>
<script>
    let recognizer = await Dynamsoft.DLR.LabelRecognizer.createInstance({
        runtimeSettings: "video-MRZ"
    });
    await recognizer.setUIElement(document.getElementsByClassName("dce-video")[0]);
    await recognizer.startScanning();
</script>
```

```html
<!-- Use the default official UI element definition -->
<script>
    let recognizer = await Dynamsoft.DLR.LabelRecognizer.createInstance({
        runtimeSettings: "video-MRZ"
    });
    await recognizer.setUIElement("https://cdn.jsdelivr.net/npm/dynamsoft-label-recognizer@2.0.0/dist/dlr.ui.html");
    await recognizer.startScanning();
</script>
```

## defaultUIElementURL

Returns or sets the URL of the *.html* file that defines the default UI Element. The URL can only be set before the API [createInstance](#createinstance) is called.

```typescript
static defaultUIElementURL: string
```

**Code Snippet**

```js
// Dynamsoft.DLR.LabelRecognizer.defaultUIElementURL = "https://cdn.jsdelivr.net/npm/dynamsoft-label-recognizer@2.2.1/dist/dlr.ui.html";
let cameraEnhancer = await Dynamsoft.DCE.CameraEnhancer.createInstance();
await cameraEnhancer.setUIElement(Dynamsoft.DLR.LabelRecognizer.defaultUIElementURL);
recognizer.setImageSource(enhancer);
let recognizer = await Dynamsoft.DLR.LabelRecognizer.createInstance({
    runtimeSettings: "video-passportMRZ"
});
await recognizer.startScanning();
```

## lineFillStyle

Specifies the color used inside the shape which highlights a found line of text. The default value is `rgba(254, 180, 32, 0.3)` .

```typescript
lineFillStyle: string
```

## lineStrokeStyle

Specifies the color used to paint the outline of the shape which highlights a found line of text. The default value is `rgba(254, 180, 32, 0.9)` .

```typescript
lineStrokeStyle: string
```

## lineLineWidth

Specifies the line width of the outline of the shape which highlights a found line of text. The default value is `1` .

```typescript
lineLineWidth: number
```

## regionMaskFillStyle

Specifies the color used in the square-loop shape between the actual scanning area and the boundary of the video input. This shape only appears when the text scanning is limited to a specified region. The default value is `rgba(0, 0, 0, 0.5)` .

```typescript
regionMaskFillStyle: string
```

## regionMaskStrokeStyle

Specifies the color used to paint the outline of the scanning region. This outline only appears when the text scanning is limited to a specified region. The default value is `rgb(254, 142, 20)` .

```typescript
regionMaskStrokeStyle: string
```

## regionMaskLineWidth

Specifies the width of the outline of the scanning region. This outline only appears when the text scanning is limited to a specified region. The default value is `2` .

```typescript
regionMaskLineWidth: number
```