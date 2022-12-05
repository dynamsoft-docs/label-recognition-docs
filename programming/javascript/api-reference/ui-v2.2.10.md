---
layout: default-layout
title: UI Control - Dynamsoft Label Recognizer JavaScript API
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
| [defaultUIElementURL](#defaultuielementurl) | Returns or sets the URL of the .html file that defines the default UI Element. |
| [highlightFillStyle](#highlightfillstyle) | Specifies the color used inside the shape which highlights a found line of text.  |
| [highlightStrokeStyle](#highlightstrokestyle) | Specifies the color used to paint the outline of the shape which highlights a found line of text. |
| [highlightLineWidth](#highlightlinewidth) | Specifies the line width of the outline of the shape which highlights a found line of text. |

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

## highlightFillStyle

Specifies the color used inside the shape which highlights a found line of text. The default value is `rgba(254, 180, 32, 0.3)` .

```typescript
highlightFillStyle: string
```

## highlightStrokeStyle

Specifies the color used to paint the outline of the shape which highlights a found line of text. The default value is `rgba(254, 180, 32, 0.9)` .

```typescript
highlightStrokeStyle: string
```

## highlightLineWidth

Specifies the line width of the outline of the shape which highlights a found line of text. The default value is `1` .

```typescript
highlightLineWidth: number
```
