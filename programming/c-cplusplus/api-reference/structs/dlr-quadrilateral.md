---
layout: default-layout
title: Dynamsoft Label Recognition C & C++ Struct - Quadrilateral
description: This page shows the DLRQuadrilateral struct of Dynamsoft Label Recognition for C & C++ Language.
keywords: DLRQuadrilateral, struct, c, c++
needAutoGenerateSidebar: true
---


# DLRQuadrilateral
Stores the quadrilateral.  

## Typedefs

```cpp
typedef struct tagDLRQuadrilateral  DLRQuadrilateral 
```  
  
---
  

## Attributes
  
| Attribute | Type |
|---------- | ---- |
| [`points`](#points) | [`DLRPoint`](dlr-point.md)[4] |


### points
Four vertexes in a clockwise direction of a quadrilateral. Index 0 represents the left-most vertex. 
```cpp
DLRPoint tagDLRQuadrilateral::points[4]
```



