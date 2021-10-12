---
layout: default-layout
title: Dynamsoft Label Recognizer JavaScript API - General APIs
description: This page shows the general APIs of Dynamsoft Label Recognizer JavaScript SDK.
keywords: label recognizer, api reference, javascript, js
needAutoGenerateSidebar: true
needGenerateH3Content: true
noTitleIndex: true
breadcrumbText: General APIs
---

# General APIs

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
static createInstance(): Promise<LabelRecognizer>
```

**Parameters**

None.

**Return value**

A promise resolving to the created `LabelRecognizer` object.

**Code Snippet**

```js
let scanner = await Dynamsoft.DLR.createInstance();
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
let scanner = await Dynamsoft.DLR.createInstance();
// ... decode ...
scanner.destroyContext();
```

## isContextDestroyed

Returns whether the instance has been destroyed.

```typescript
isContextDestroyed(): boolean
```
