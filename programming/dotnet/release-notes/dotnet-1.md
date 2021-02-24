---
layout: default-layout
title: Dynamsoft Label Recognition .Net SDK - Release Notes 1.x
description: This is the release notes page of Dynamsoft Label Recognition for .Net SDK version 1.x.
keywords: release notes, .Net
needAutoGenerateSidebar: false
---

# Release Notes for .Net - 1.x

## 1.0 (02/24/2021)

- Supports recognition of `A-Z`, `a-z`, `0-9`, `.`, `-`, `_`, `(blank space)`, `/` and `:` characters. 
- Supports text recognition from BMP, JPEG, PNG and single-page TIFF files.
- Supports zonal OCR and provides three ways to localize text areas:
    - Pre-define an area manually in pixel or percentage.
    - Specify an area relative to the barcode zone, which allows you to recognize accompanying texts near the barcode. 
    - Specify an area relative to blocks which share the same colour or uses the same font colour. A common example would be a price tag, where the text of interest is always on a yellow square background, the yellow square can serve as the reference region.
- Supports specifying a regular expression to improve recognition accuracy and robustness.
