---
layout: default-layout
title: DM_Point - Dynamsoft Core C & C++ Struct
description: This page shows the DM_Point struct of Dynamsoft Core for C & C++ Language.
keywords: DM_Point, struct, c, c++
needAutoGenerateSidebar: true
needGenerateH3Content: true
noTitleIndex: true
---


# DM_Point

Stores the point.

## Definition

```c
typedef struct tagDMPoint
{
    int coordinate[2];
}DM_Point;
```

### coordinate

The coordinate defining a point. coordinate\[0\] represents the X coordinate and coordinate\[1\] represents the Y coordinate of the point.
