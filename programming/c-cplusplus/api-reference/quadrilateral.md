---
layout: default-layout
title: Quadrilateral - Dynamsoft Core C & C++ Struct
description: This page shows the Quadrilateral struct of Dynamsoft Core for C & C++ Language.
keywords: Quadrilateral, struct, c, c++
needAutoGenerateSidebar: true
needGenerateH3Content: true
noTitleIndex: true
---


# Quadrilateral
Stores the quadrilateral.  

```cpp
typedef struct tagQuadrilateral  Quadrilateral 
```  

  

## Attributes
  
| Attribute | Type |
|---------- | ---- |
| [`points`](#points) | [`DM_Point`](point.md)[4] |


&nbsp;

### points
Four vertexes in a clockwise direction of a quadrilateral. Index 0 represents the left-most vertex. 
```cpp
DM_Point points[4]
```



