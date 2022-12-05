---
layout: default-layout
title: ImageSource - Dynamsoft Label Recognizer JavaScript Interface
description: This page shows the ImageSource interface of Dynamsoft Label Recognizer for JavaScript.
keywords: ImageSource, javascript, interface
needAutoGenerateSidebar: false
noTitleIndex: true
breadcrumbText: ImageSource
---

# ImageSource

Interface that defines an Image Source.

## Members

### getImage()

Returns an image from the Image Source.

```typescript
/**
 * @param index Specifies the index of the image. If undefined, the Image Source will determine which image to return.
 */ 
getImage(index?: number): Promise<DSImage> | DSImage;
```
