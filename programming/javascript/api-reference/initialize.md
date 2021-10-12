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

The following static methods and properties help to set up the runtime environment for the library.

| API Name | Description |
|---|---|
| [engineResourcePath](#engineresourcepath) | Specifies the path from where the recognition engine and models, etc. can be loaded. |
| [loadWasm()](#loadwasm) | Loads the recognition engine and models. |
| [isWasmLoaded()](#iswasmloaded) | Returns whether the recognition engine and models have been loaded. |
| [version](#version) | Returns the version of the library. |
| [detectEnvironment()](#detectenvironment) | Assess the running environment regarding the features the library requires to run. |

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