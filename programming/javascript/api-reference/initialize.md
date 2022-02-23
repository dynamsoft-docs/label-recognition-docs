---
layout: default-layout
title: Dynamsoft Label Recognizer JavaScript API - Initialization APIs
description: This page shows the initialization APIs of Dynamsoft Label Recognizer JavaScript SDK.
keywords: label recognizer, api reference, javascript, js, initialization
needAutoGenerateSidebar: true
needGenerateH3Content: true
noTitleIndex: true
breadcrumbText: Initialization APIs
---

# Initialization Control

The following methods and properties help with the initialization of the library.

## License Control

| API Name | Description |
|---|---|
| [license](#license) | Use an alphanumeric string to specify the license. |

## Create and Destroy Instances

| API Name | Description |
|---|---|
| [createInstance()](#createinstance) | Creates a `LabelRecognizer` instance. |
| [destroyContext()](#destroycontext) | Destroies the LabelRecognizer instance. |
| [isContextDestroyed()](#iscontextdestroyed) | Returns whether the instance has been destroyed. |

## Set Up the Environment

| API Name | Description |
|---|---|
| [engineResourcePath](#engineresourcepath) | Specifies the path from where the recognition engine and models, etc. can be loaded. |
| [loadWasm()](#loadwasm) | Loads the recognition engine and models. |
| [isWasmLoaded()](#iswasmloaded) | Returns whether the recognition engine and models have been loaded. |
| [getVersion()](#getversion) | Returns the version of the library. |
| [detectEnvironment()](#detectenvironment) | Assess the running environment regarding the features the library requires to run. |

## license

Use an alphanumeric string to specify the license. Note that the license must be specified before the methods `createInstance()` and `loadWasm()` .

```typescript
static license: string;
```

## createInstance

Creates a `LabelRecognizer` instance.

```typescript
static createInstance(config?: any): Promise<LabelRecognizer>
```

**Parameters**

`config` : Configures how to create the instance. At present, it only specifies one of the built-in `runtimeSettings` templates which include

| Name | Description |
|:-:|:-:|
| `number` | For pure number recognition. |
| `numberLetter` | For number and English letter recognition. |
| `numberUpperCase` | For number and uppercase English letter recognition. |
| `letter` | For pure English letter recognition. |
| `passportMRZ` | For recognition of the machine-readable zones on passports. |
| `visaMRZ` | For recognition of the machine-readable zones on visas. |
| `MRZ` | For recognition of the machine-readable zones on passports, visas and IDCards. |
| `VIN` | For VIN (vehicle identification number) recognition. |
| `VIN_NA` | For North American VIN (vehicle identification number) recognition. |

When recognizing from video input, add the prefix "video-" for a slightly different template optimized for continuous frame recognition. For example, use `video-MRZ` to read the MRZ on passports with a camera.

**Return value**

A promise resolving to the created `LabelRecognizer` object.

**Code Snippet**

```js
let recognizer = await Dynamsoft.DLR.LabelRecognizer.createInstance({
    runtimeSettings: "video-MRZ"
});
await recognizer.startScanning();
```

## destroyContext

Destroys the `LabelRecognizer` instance. If your page needs to create a new instance from time to time, don't forget to destroy unused old instances.

```typescript
destroyContext(): void
```

**Parameters**

None.

**Return value**

A promise that resolves when the operation succeeds.

**Code Snippet**

```js
let recognizer = await Dynamsoft.DLR.LabelRecognizer.createInstance();
// ... decode ...
recognizer.destroyContext();
```

## isContextDestroyed

Returns whether the instance has been destroyed.

```typescript
isContextDestroyed(): boolean
```

## engineResourcePath

Specifies the path to find the engine(s). The property needs to be set before [loadWasm](#loadwasm). If not specified, the library will try to find the engine in the same location as the main JavaScript file (dlr.js).

```typescript
static engineResourcePath: string
```

**Code Snippet**

```js
Dynamsoft.DLR.LabelRecognizer.engineResourcePath = "https://cdn.jsdelivr.net/npm/dynamsoft-javascript-barcode@8.6.1/dist/";
await Dynamsoft.DLR.LabelRecognizer.loadWasm();
```

## loadWasm

Downloads and compiles the engine to get it loaded/ready for a LabelRecognizer instance to be created. You can call this API to silently set the operating environment of the library as soon as the page is loaded, avoiding unnecessary waiting time when using the library later.

If this API is not called beforehand, it will be called automatically when creating a LabelRecognizer instance.

```typescript
static loadWasm(): Promise<void>
```

**Code Snippet**

```js
window.addEventListener('DOMContentLoaded', (event) => {
    Dynamsoft.DLR.LabelRecognizer.loadWasm();
});
```

## isWasmLoaded

Returns whether the engine is loaded/ready.

```typescript
static isWasmLoaded(): boolean
```

## getVersion

Returns the version of the library including the detailed version numbers of the engine and the main JavaScript code.

The engine version only valid after [loadWasm](#loadwasm) has been called.

```typescript
readonly static getVersion(): string
```

**Code Snippet**

```js
console.log(Dynamsoft.DLR.LabelRecognizer.getVersion());
// loading...(JS 2.2.0.20211011)
await Dynamsoft.DLR.LabelRecognizer.loadWasm();
console.log(Dynamsoft.DLR.LabelRecognizer.getVersion());
// 2.2.0.11051(JS 2.2.0.20211011)
```

## detectEnvironment

Returns a report on the current running environments.

```typescript
static detectEnvironment(): Promise<any>
```

**Code Snippet**

```js
console.log(Dynamsoft.DLR.LabelRecognizer.detectEnvironment());
// {"wasm":true, "worker":true, "getUserMedia":true, "camera":true, 
// "browser":"Chrome", "version":90, "OS":"Windows"}
```
