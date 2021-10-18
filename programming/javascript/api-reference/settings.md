---
layout: default-layout
title: Dynamsoft Label Recognizer JavaScript API - Settings APIs
description: This page shows the settings APIs of Dynamsoft Label Recognizer JavaScript SDK.
keywords: label recognizer, api reference, javascript, js, settings
needAutoGenerateSidebar: true
needGenerateH3Content: true
noTitleIndex: true
breadcrumbText: Settings APIs
---

# Change Settings

| API Name | Description |
|---|---|
<!--| [getRuntimeSettings()](#getruntimesettings) | Returns the current runtime settings. |
| [updateRuntimeSettings()](#updateruntimesettings) | Updates runtime settings with a given struct or a preset template. |
| [resetRuntimeSettings()](#resetruntimesettings) | Resets all parameters to default values. |
| [getModeArgument()](#getmodeargument) | Returns the argument value for the specified mode parameter. |
| [setModeArgument()](#setmodeargument) | Sets the argument value for the specified mode parameter. |-->
| [updateRuntimeSettingsFromString()](#appendsettingsfromstring) | Updates runtime settings with a template represented by a JSON string. |
| [outputSettingsToString()](#outputsettingstostring) | Output the current runtime settings to a JSON string. |
<!--| [updateReferenceRegionFromBarcodeResults()](#updatereferenceregionfrombarcoderesults) | Updates reference region which is defined with source type DLR_LST_BARCODE. |-->
| [appendCharacterModelBuffer()](#appendcharactermodelbuffer) | Appends a CharacterModel to assist the recognition. |
<!--| [eraseCharacterModelByName()](#erasecharactermodelbyname) | Erases a CharacterModel by its name. |
| [eraseAllCharacterModels()](#eraseallcharactermodels) | Erases all CharacterModels. |-->

## getRuntimeSettings

Returns the current runtime settings.

```typescript
getRuntimeSettings(): Promise<RuntimeSettings>
```

**Parameters**

None.

**Return value**

A promise resolving to a `RuntimeSettings` object that contains the settings for label recognizing.

**Code snippet**

```js
let settings = await recognizer.getRuntimeSettings();
settings.maxThreadCount = 4;
await recognizer.updateRuntimeSettings(settings);
```

**See also**

* [RuntimeSettings](./interface/runtimeSettings.md)

## updateRuntimeSettings

Updates runtime settings with a given struct..

```typescript
updateRuntimeSettings(settings: RuntimeSettings): Promise<void>
```

**Parameters**

`settings` : a `RuntimeSettings` object that contains the new settings for label recognizing.

**Return value**

A promise that resolves when the operation succeeds.

**Code snippet**

```js
let settings = await recognizer.getRuntimeSettings();
settings.maxThreadCount = 4;
await recognizer.updateRuntimeSettings(settings);
```

**See also**

* [RuntimeSettings](./interface/runtimeSettings.md)

## resetRuntimeSettings

Resets all parameters to default values.

```typescript
resetRuntimeSettings(): Promise<void>
```

**Parameters**

None.

**Return value**

A promise that resolves when the operation succeeds.

**Code snippet**

```js
await recognizer.resetRuntimeSettings();
```

## getModeArgument

Returns the argument value for the specified mode parameter.

```typescript
getModeArgument(modeName: string, index: number, argumentName: string): Promise<string>
```

**Parameters**

`modeName` : specifies the mode which contains one or multiple elements.
`index` : specifies an element of the mode by its index.
`argumentName` : specifies the argument.

**Return value**

A promise resolving to a string which represents the value of the argument.

**Code snippet**

```js
let argumentValue = await recognizer.getModeArgument("BinarizationModes", 0, "EnableFillBinaryVacancy");
```

## setModeArgument

Sets the argument value for the specified mode parameter.

```typescript
setModeArgument(modeName: string, index: number, argumentName: string, argumentValue: string): Promise<void>
```

**Parameters**

`modeName` : specifies the mode which contains one or multiple elements.
`index` : specifies an element of the mode by its index.
`argumentName` : specifies the argument.
`argumentValue` : specifies the value.

**Return value**

A promise that resolves when the operation succeeds.

**Code snippet**

```js
await recognizer.setModeArgument("BinarizationModes", 0, "EnableFillBinaryVacancy", "1");
```

## updateRuntimeSettingsFromString

Updates runtime settings with a template represented by a JSON string.

```typescript
updateRuntimeSettingsFromString(runtimeSettings: string): Promise<void>
```

**Parameters**

`runtimeSettings` : a JSON string that specifies the runtime settings.

**Return value**

A promise that resolves when the operation succeeds.

## outputSettingsToString

Output the current runtime settings to a JSON string.

```typescript
outputSettingsToString(): string;
```

**Parameters**

None.

**Return value**

A JSON string that represents the runtime settings.

## updateReferenceRegionFromBarcodeResults

Updates reference region which is defined with source type `DLR_LST_BARCODE` .

```typescript
updateReferenceRegionFromBarcodeResults(barcodeResults: BarcodeResultArray): Promise<void>
```

**Parameters**

`barcodeResults` : specifies the barcode results used to localize reference region.

**Return value**

A promise that resolves when the operation succeeds.

## appendCharacterModelBuffer

Appends a CharacterModel to assist the recognition.

```typescript
appendCharacterModelBuffer(name: string, prototxtBuffer: ArrayBuffer, txtBuffer: ArrayBuffer, characterModelBuffer: ArrayBuffer): Promise<void>
```

**Parameters**

`name` : A unique name for the appended CharacterModel.
`prototxtBuffer` : The .prototxt file data of the CharacterModel in a byte array.
`txtBuffer` : The .txt file data of the CharacterModel in a byte array.
`characterModelBuffer` : The .caffemodel file data of the CharacterModel in a byte array.

**Return value**

A promise that resolves when the operation succeeds.

## eraseCharacterModelByName

Erases a CharacterModel by its name.

```typescript
eraseCharacterModelByName(name: string): Promise<void>
```

**Parameters**

`name` : A unique name for the appended CharacterModel.

**Return value**

A promise that resolves when the operation succeeds.

## eraseAllCharacterModels

Erases all CharacterModels.

```typescript
eraseAllCharacterModels(): Promise<void>
```

**Parameters**

None.

**Return value**

A promise that resolves when the operation succeeds.
