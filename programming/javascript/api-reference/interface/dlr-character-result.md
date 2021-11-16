---
layout: default-layout
title: Dynamsoft Label Recognizer JavaScript Interface - DLRLineResult
description: This page shows the DLRLineResult interface of Dynamsoft Label Recognizer for JavaScript.
keywords: DLRLineResult, javascript, interface
needAutoGenerateSidebar: false
noTitleIndex: true
breadcrumbText: DLRLineResult
---

# DLRLineResult

Stores the line result.

## Attributes

| Attribute | Type |
|---------- | ---- |
| [ `characterH` ](#characterh) | *string* |
| [ `characterM` ](#characterm) | *string* |
| [ `characterL` ](#characterl) | *string* |
| [ `characterHConfidence` ](#characterhconfidence) | *number* |
| [ `characterMConfidence` ](#charactermconfidence) | *number* |
| [ `characterLConfidence` ](#characterlconfidence) | *number* |
| [ `location` ](#location) | [ `DLRQuadrilateral` ](dlr-quadrilateral.md) |
| [ `reserved` ](#reserved) | *string* |

### characterH

The recognized character with highest confidence.

### characterM

The recognized character with middle confidence.

### characterL

The recognized character with lowest confidence.

### location

The location of current character.

### characterHConfidence

The confidence of the recognized character with the highest confidence.

### characterMConfidence

The confidence of the recognized character with the middle confidence.

### characterLConfidence

The confidence of the recognized character with the lowest confidence.

### reserved

Reserved memory for the struct. The length of this array indicates the size of the memory reserved for this struct.
