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
| [initLicense()](#initLicense) | Initializes the license with a license string. |

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
| [version](#version) | Returns the version of the library. |
| [detectEnvironment()](#detectenvironment) | Assess the running environment regarding the features the library requires to run. |

## initLicense

Initializes the license with a license string.

```typescript
static initLicense(licenseString: string): void
```

**Parameters**

`licenseString` : an alphanumeric string that specifies the license.

**Return value**

None.

**Code Snippet**

```js
Dynamsoft.DLR.initLicense("DBRJS_Samples:DLS2eyJoYW5kc2hha2VDb2RlIjoiMjAwMDAwLWRicl9qc19zYW1wbGVzIiwib3JnYW5pemF0aW9uSUQiOiIyMDAwMDAifQ==");
```

## createInstance

Creates a `LabelRecognizer` instance.

```typescript
static createInstance(config?: any): Promise<LabelRecognizer>
```

**Parameters**

`config` : Configure how to create the instance. At present, it only specifies a default runtimeSettings template. Please see [UpdateRuntimeSettings](settings.md#updateruntimesettings) for more information.

**Return value**

A promise resolving to the created `LabelRecognizer` object.

**Code Snippet**

```js
let recognizer = await Dynamsoft.DLR.createInstance({
    runtimeSettings: "video"
});
recognizer.startScanning();
```

## destroyContext

Destroys the `LabelRecognizer` instance. If your page needs to create a new instance from time to time, don't forget to destroy unused old instances.

```typescript
destroyContext(): Promise<void>
```

**Parameters**

None.

**Return value**

A promise that resolves when the operation succeeds.

**Code Snippet**

```js
let recognizer = await Dynamsoft.DLR.createInstance();
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
Dynamsoft.DLR.engineResourcePath = "https://cdn.jsdelivr.net/npm/dynamsoft-javascript-barcode@8.6.1/dist/";
await Dynamsoft.DLR.loadWasm();
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
    Dynamsoft.DLR.loadWasm();
});
```

## isWasmLoaded

Returns whether the engine is loaded/ready.

```typescript
static isWasmLoaded(): boolean
```

## version

Returns the version of the library including the detailed version numbers of the engine and the main JavaScript code.

Only valid after [loadWasm](#loadwasm) has been called.

```typescript
readonly static version: string
```

**Code Snippet**

```js
console.log(Dynamsoft.DLR.version);
await Dynamsoft.DLR.loadWasm();
console.log(Dynamsoft.DLR.version);
```

## detectEnvironment

Returns a report on the current running environments.

```typescript
static detectEnvironment(): Promise<any>
```

**Code Snippet**

```js
console.log(Dynamsoft.DLR.detectEnvironment());
// {"wasm":true, "worker":true, "getUserMedia":true, "camera":true, "browser":"Chrome", "version":90, "OS":"Windows"}
```
