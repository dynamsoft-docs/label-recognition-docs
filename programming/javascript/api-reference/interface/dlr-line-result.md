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
| [ `lineSpecificationName` ](#linespecificationname) | *string* |
| [ `text` ](#text) | *string* |
| [ `characterModelName` ](#charactermodelname) | *string* |
| [ `location` ](#location) | [ `DLRQuadrilateral` ](dlr-quadrilateral.md) |
| [ `confidence` ](#confidence) | *number* |
| [ `characterResultsCount` ](#characterresultscount) | *number* |
| [ `characterResults` ](#characterresults) | *[ `PDLRCharacterResult` ](dlr-character-result.md)* |

### lineSpecificationName

The name of the line specification used to recognize current line result.

### text

The recognized text.

### characterModelName

The character model used to recognize the text.

### location

The location of current line.

### confidence

The confidence of the result. It ranges from 0 to 100.

### characterResultsCount

The character result count.

### characterResults

The character results array.
