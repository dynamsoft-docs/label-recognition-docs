---
layout: default-layout
title: DLR_DictionaryCorrectionThreshold - Dynamsoft Label RecognizerC & C++ Struct
description: This page shows the DLR_DictionaryCorrectionThreshold struct of Dynamsoft Label Recognizer for C & C++ Language.
keywords: DLR_DictionaryCorrectionThreshold, C, C++
needAutoGenerateSidebar: true
needGenerateH3Content: true
noTitleIndex: true
---


# DLR_DictionaryCorrectionThreshold
Stores the dictionary correction threshold.

```cpp
typedef struct tagDLR_DictionaryCorrectionThreshold  DLR_DictionaryCorrectionThreshold
```  

## Attributes
  
| Attribute | Type |
|---------- | ---- |
| [`minWordLength`](#minwordlength) | *int* |
| [`maxWordLength`](#maxwordlength) | *int* |
| [`threshold`](#threshold) | *int* |


&nbsp;

### minWordLength
The minimum value of word length.
```cpp
int minWordLength
```

&nbsp;

### maxWordLength
The maximum value of word length.
```cpp
int maxWordLength
```

&nbsp;

### threshold
The threshold for the number of error correction characters.
```cpp
int threshold
```
