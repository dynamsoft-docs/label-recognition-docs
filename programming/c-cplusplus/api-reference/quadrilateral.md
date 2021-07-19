---
layout: default-layout
title: Dynamsoft Label Recognizer C & C++ Struct - Quadrilateral
description: This page shows the Quadrilateral struct of Dynamsoft Label Recognizer for C & C++ Language.
keywords: Quadrilateral, struct, c, c++
needAutoGenerateSidebar: true
needGenerateH3Content: true
---


# Quadrilateral
Stores the quadrilateral.  

## Typedefs

```cpp
typedef struct tagQuadrilateral  Quadrilateral 
```  
  
---
  

## Attributes
  
| Attribute | Type |
|---------- | ---- |
| [`points`](#points) | [`DM_Point`](point.md)[4] |


### points
Four vertexes in a clockwise direction of a quadrilateral. Index 0 represents the left-most vertex. 
```cpp
DM_Point points[4]
```



