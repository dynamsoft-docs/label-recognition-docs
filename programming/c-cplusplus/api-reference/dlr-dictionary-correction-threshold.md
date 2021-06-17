---
layout: default-layout
title: Dynamsoft Label RecognizerC & C++ Struct - DLRDictionaryCorrectionThreshold
description: This page shows the DLRDictionaryCorrectionThreshold struct of Dynamsoft Label Recognizer for C & C++ Language.
keywords: DLRDictionaryCorrectionThreshold, C, C++
needAutoGenerateSidebar: true
needGenerateH3Content: true
---


# DLRDictionaryCorrectionThreshold
Stores the dictionary correction threshold.

## Typedefs

```cpp
typedef struct tagDLRDictionaryCorrectionThreshold  DLRDictionaryCorrectionThreshold
```  

## Attributes
  
| Attribute | Type |
|---------- | ---- |
| [`minWordLength`](#minwordlength) | *int* |
| [`maxWordLength`](#maxwordlength) | *int* |
| [`threshold`](#threshold) | *int* |


### minWordLength
The minimum value of word length.
```cpp
int minWordLength
```

### maxWordLength
The maximum value of word length.
```cpp
int maxWordLength
```

### threshold
The threshold for the number of error correction characters.
```cpp
int threshold
```
