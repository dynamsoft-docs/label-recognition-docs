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

Interface that provides more info on the specific lines of a result returned by the recognizer.

## Attributes

| Attribute | Type |
|---------- | ---- |
| [ `lineSpecificationName` ](#linespecificationname) | *string* |
| [ `text` ](#text) | *string* |
| [ `characterModelName` ](#charactermodelname) | *string* |
| [ `location` ](#location) | [ `Quadrilateral` ](quadrilateral.md) |
| [ `confidence` ](#confidence) | *number* |
| [ `characterResults` ](#characterresults) | *[ `DLRCharacterResult` ](dlr-character-result.md)* |

<!--
| [ `characterResultsCount` ](#characterresultscount) | *number* |-->

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

<!--

### characterResultsCount

The character result count.
-->

### characterResults

The character results array.
