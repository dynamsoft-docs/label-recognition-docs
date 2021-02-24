---
layout: default-layout
title: Dynamsoft Label Recognition C/C++ SDK - Release Notes 1.x
description: This is the release notes page of Dynamsoft Label Recognition for C/C++ SDK version 1.x.
keywords: release notes, c, c++
needAutoGenerateSidebar: false
---

# Release Notes for C/C++ - 1.x

## 1.0 (02/24/2021)

- Supports recognition from BMP, TIFF, JPEG, PNG and PDF files.
- Supports three ways for OCR:
    - Recognize texts from a full-sized image.
    - Recognize texts from a specified region.
    - Specify an area to recognize texts using a reference region. A common example would be a price tag, where the text of interest is always on a yellow square background, the yellow square can serve as the reference region.
- Supports specifying a regular expression to improve recognition accuracy and robustness.

## 1.0 Beta (12/10/2020)

- Supports recognition of `A-Z`, `a-z`, `0-9`, `.`, `-`, `_`, `(blank space)`, `/` and `:` characters. 