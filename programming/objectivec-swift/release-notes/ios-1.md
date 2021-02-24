---
layout: default-layout
title: Dynamsoft Label Recognition iOS SDK - Release Notes 1.x
description: This is the release notes page of Dynamsoft Label Recognition for iOS SDK version 1.x.
keywords: release notes, objective-c, oc, swift
needAutoGenerateSidebar: false
---

# Release Notes for Objective-C & Swift - 1.x

## 1.0 (02/24/2021)

* Supports recognition of `A-Z`, `a-z`, `0-9`, `.`, `-`, `_`, `(blank space)`, `/` and `:` characters.

* Supports text recognition from BMP, JPEG, PNG and single-page TIFF files.

* Supports zonal OCR and provides three ways to localize text areas:

	- Manually pre-define an area in pixel units or by percentage.

	- Specify an area relative to the barcode zone, which allows you to recognize accompanying texts near the barcode.

	- Specify an area relative to a block of a certain colour or that contains text of a specified font colour. A common example would be a price tag, where the text of interest is always on a yellow square background, the yellow square can serve as the reference region.

* Supports the usage of regular expressions to improve overall recognition accuracy and robustness.
