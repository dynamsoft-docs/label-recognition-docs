---
layout: default-layout
title: Dynamsoft Label Recognizer iOS Class - iDLRRuntimeSettings
description: This page shows the iDLRRuntimeSettings class of Dynamsoft Label Recognizer for iOS SDK.
keywords: iDLRRuntimeSettings, class, objective-c, oc, swift
needAutoGenerateSidebar: true
needGenerateH3Content: true
noTitleIndex: true
---


# iDLRRuntimeSettings
Defines a struct to configure the text recognizer runtime settings. These settings control the text recognition process.
  
```objc
@interface iDLRRuntimeSettings : NSObject 
```

## Attributes
  
| Attribute | Type |
|---------- | ---- |
| [`maxThreadCount`](#maxthreadcount) | *NSInteger* |
| [`characterModelName`](#charactermodelname) | *NSString\** |
| [`referenceRegion`](#referenceregion) | [`iDLRReferenceRegion`](dlr-reference-region.md)\* |
| [`textArea`](#textarea) | [`iQuadrilateral`](quadrilateral.md)\* |
| [`dictionaryPath`](#dictionarypath) | *NSString\** |
| [`dictionaryCorrectionThreshold`](#dictionarycorrectionthreshold) | [`iDLRDictionaryCorrectionThreshold`](dlr-dictionary-correction-threshold.md)\* |
| [`binarizationModes`](#binarizationmodes) | *NSArray\** |
| [`furtherModes`](#furthermodes) | [`iDLRFurtherModes`](dlr-further-modes.md)\*|

&nbsp;

### maxThreadCount
Sets the number of threads the algorithm will use to recognize label.
```objc
NSInteger maxThreadCount
```
- **Value range**   
    [1, 4]
      
- **Default value**   
    4
    
- **Remarks**   
    To keep a balance between speed and quality, the library concurrently runs four different threads by default.

&nbsp;

### characterModelName
The name of the CharacterModel.
```objc
NSString* characterModelName
```

&nbsp;

### referenceRegion
Sets the reference region to search for text.
```objc
iDLRReferenceRegion* referenceRegion
```

&nbsp;

### textArea
Sets the text area relative to the reference region.
```objc
iQuadrilateral* textArea
```

&nbsp;

### dictionaryPath
Sets the path of the dictionary file.
```objc
NSString* dictionaryPath
```

&nbsp;

### dictionaryCorrectionThreshold
Sets the threshold of dictionary error correction.
```objc
iDLRDictionaryCorrectionThreshold* dictionaryCorrectionThreshold
```


&nbsp;

### binarizationModes
Sets the mode and priority for binarization.

```objc
NSArray* binarizationModes
```

- **Value range**   
    Each array item can be any one of the [`EnumBinarizationMode`]({{ site.enumerations }}binarization-mode.html) Enumeration items.
      
- **Default value**   
    `[EnumBinarizationModeLocalBlock, EnumBinarizationModeSkip, EnumBinarizationModeSkip, EnumBinarizationModeSkip, EnumBinarizationModeSkip, EnumBinarizationModeSkip, EnumBinarizationModeSkip, EnumBinarizationModeSkip]`
    
- **Remarks**   
    The array index represents the priority of the item. The smaller index is, the higher priority is.


&nbsp;

### furtherModes
Sets further modes.

```objc
iDLRFurtherModes* furtherModes
```

- **See also**  
    [`iDLRFurtherModes`](dlr-further-modes.md)

