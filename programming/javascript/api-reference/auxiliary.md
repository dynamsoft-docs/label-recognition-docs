---
layout: default-layout
title: Dynamsoft Label Recognizer JavaScript API - Auxiliary APIs
description: This page shows the auxiliary APIs of Dynamsoft Label Recognizer JavaScript SDK.
keywords: label recognizer, api reference, javascript, js, auxiliary
needAutoGenerateSidebar: true
needGenerateH3Content: true
noTitleIndex: true
breadcrumbText: Auxiliary APIs
---

# Auxiliary APIs

| API Name | Description |
|---|---|
| [ifSaveOriginalImageInACanvas](#ifsaveoriginalimageinacanvas) | Whether to save the original image into a &lt; canvas&gt; element. |
| [getOriginalImageInACanvas()](#getoriginalimageinacanvas) | Returns an `HTMLCanvasElement` that holds the original image. |
| [onResourcesLoadStarted](#onresourcesloadstarted) | This event is triggered when the resource file (.data) for a particular template starts to load. |
| [onResourcesLoadProgress](#onresourcesloadprogress) | This event is triggered multiple times when the resource file (.data) for a particular template is being loaded. |
| [onResourcesLoaded](#onresourcesloaded) | This event is triggered when the resource file (.data) for a particular template finishes loading. |

## ifSaveOriginalImageInACanvas

Whether to save the original image into a &lt; canvas&gt; element. The original image refers to the actual image the library tried to read labels from.

Note that the result is an `HTMLCanvasElement` element and you can insert it into the DOM to show the image.

```typescript
ifSaveOriginalImageInACanvas: boolean;
```

**Default value**

 `false`

**Code snippet**

```js
recognizer.ifSaveOriginalImageInACanvas = true;
let results = await recognizer.recognize(source);
document.body.append(recognizer.getOriginalImageInACanvas());
```

## getOriginalImageInACanvas

An [HTMLCanvasElement](https://developer.mozilla.org/en-US/docs/Web/API/Canvas) that holds the original image. The original image refers to the actual image the library tried to read labels from.

```typescript
getOriginalImageInACanvas(): HTMLCanvasElement | OffscreenCanvas
```

**Code snippet**

```js
recognizer.ifSaveOriginalImageInACanvas = true;
let results = await recognizer.recognize(source);
document.body.append(recognizer.getOriginalImageInACanvas());
```

**See also**

* [HTMLCanvasElement](https://developer.mozilla.org/en-US/docs/Web/API/HTMLCanvasElement)
* [OffscreenCanvas](https://developer.mozilla.org/en-US/docs/Web/API/OffscreenCanvas)

## onResourcesLoadStarted

This event is triggered when the resource file (.data) for a particular template starts to load.

```typescript
static onResourcesLoadStarted = (resourcePath: string) => {};
```

**Code snippet**

```js
Dynamsoft.DLR.LabelRecognizer.onResourcesLoadStarted = (resourcePath) => {
  console.log("Loading " + resourcePath);
}
recognizer.updateRuntimeSettingsFromString("MRZ");
```

## onResourcesLoadProgress

This event is triggered multiple times when the resource file (.data) for a particular template is being loaded.

```typescript
static onResourcesLoadProgress = (resourcePath: string, progress: {loaded: number, total: number}) => {};
```

**Code snippet**

```js
Dynamsoft.DLR.LabelRecognizer.onResourcesLoadProgress = (resourcePath, progress) => {
    console.log(resourcePath + "loading progress: " + progress.loaded + "/" + progress.total);
}
recognizer.updateRuntimeSettingsFromString("MRZ");
```

## onResourcesLoaded

This event is triggered when the resource file (.data) for a particular template finishes loading.

```typescript
static onResourcesLoaded = (resourcePath: string) => {};
```

**Code snippet**

```js
Dynamsoft.DLR.LabelRecognizer.onResourcesLoaded = (resourcePath) => {
  console.log("Finished loading " + resourcePath);
}
recognizer.updateRuntimeSettingsFromString("MRZ");
```
