---
layout: default-layout
title: Dynamsoft Label RecognizerC & C++ Struct - DLR_DictionaryCorrectionThreshold
description: This page shows the DLR_DictionaryCorrectionThreshold struct of Dynamsoft Label Recognizer for C & C++ Language.
keywords: DLR_DictionaryCorrectionThreshold, C, C++
needAutoGenerateSidebar: true
needGenerateH3Content: true
---


# DLR_DictionaryCorrectionThreshold
Stores the dictionary correction threshold.

## Typedefs

```cpp
typedef struct tagDLR_DictionaryCorrectionThreshold  DLR_DictionaryCorrectionThreshold
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
