---
layout: default-layout
title: Dynamsoft Label Recognition C & C++ Struct - Quadrilateral
description: This page shows the DLRRegion struct of Dynamsoft Label Recognition for C & C++ Language.
keywords: DLRRegion, struct, c, c++
needAutoGenerateSidebar: true
---


# DLRRegion
Stores the region information.  

## Typedefs

```cpp
typedef struct tagDLRRegion  DLRRegion 
```  
  
---
  

## Attributes
  
| Attribute | Type |
|---------- | ---- |
| [`points`](#points) | [`DLRPoint`](dlr-point.md)[4] |
| [`regionMeasuredByPercentage`](#regionMeasuredByPercentage) | *int* |


### points
Four vertexes in a clockwise direction of a quadrilateral. Index 0 represents the left-most vertex. 
```cpp
DLRPoint tagDLRRegion::points[4]
```

### regionMeasuredByPercentage
Sets whether or not to use percentage to measure the region size.
```cpp
int tagDLRRegion::regionMeasuredByPercentage
```
- **Value range**   
    [0, 1]
      
- **Default value**   
    1
    
- **Remarks**   
    0: not by percentage  
    1: by percentage
    When it's set to 1, the values of points indicate percentage (from 0 to 100); Otherwise, they indicate coordinates.  


