---
layout: default-layout
title: Dynamsoft Barcode Reader Parameter Reference for ReferenceRegion Object - Image Process Control Parameters
description: This article shows Dynamsoft Barcode Reader Parameter Reference for ReferenceRegion Object - Image Process Control Parameters.
keywords: Top, Left, Right, Bottom, MeasuredByPercentage, ReferenceRegion, image process control parameters, parameter reference, parameter 
needAutoGenerateSidebar: true
needGenerateH3Content: false
---


# ReferenceRegion Object - Image Process Control Parameters

 | Parameter Name | Description |
 | -------------- | ----------- | 
 | [`ReferenceRegion.Top`](#top) | The top-most coordinate or percentage of the region. | 
 | [`ReferenceRegion.Left`](#left) | The left-most coordinate or percentage of the region. | 
 | [`ReferenceRegion.Right`](#right) | The right-most coordinate or percentage of the region. | 
 | [`ReferenceRegion.Bottom`](#bottom) | The bottom-most coordinate or percentage of the region. | 
 | [`ReferenceRegion.MeasuredByPercentage`](#measuredbypercentage) | Sets whether or not to use percentages to measure the Region size. | 


---

## Top
The top-most coordinate or percentage of the region.  


### As Json Parameter

| Json Object |	Json Parameter Name | Value Type | Value Range | Default Value |
| ----------- | ------------------- | ---------- | ----------- | ------------- |
| ReferenceRegion | Top | *int* | [`MeasuredByPercentage`](#measuredbypercentage)=0: [0, 0x7fffffff]<br>[`MeasuredByPercentage`](#measuredbypercentage)=1: [0, 100] | 0 |


**Json Parameter Example**   
```
{
    "Top":0
}
```

### As `PublicRuntimeSettings` Member

| Struct |	Struct Member Name | Value Type | Value Range | Default Value |
| ------ | ------------------ | ---------- | ----------- | ------------- |
| [`PublicRuntimeSettings`]({{ site.structs }}PublicRuntimeSettings.html)->[`region`]({{ site.structs }}PublicRuntimeSettings.html#region) | [`regionTop`]({{ site.structs }}ReferenceRegion.html#regiontop) | *int* | [`regionMeasuredByPercentage`]({{ site.structs }}ReferenceRegion.html#regionmeasuredbypercentage)=0: [0, 0x7fffffff]<br>[`regionMeasuredByPercentage`]({{ site.structs }}ReferenceRegion.html#regionmeasuredbypercentage) = 1: [0, 100] | 0 |

**See Also**   
- [`PublicRuntimeSettings` Struct]({{ site.structs }}PublicRuntimeSettings.html)
- [`ReferenceRegion` Struct]({{ site.structs }}ReferenceRegion.html)



&nbsp;


## Left
The left-most coordinate or percentage of the region.


### As Json Parameter

| Json Object |	Json Parameter Name | Value Type | Value Range | Default Value |
| ----------- | ------------------- | ---------- | ----------- | ------------- |
| ReferenceRegion | Left | *int* | [`MeasuredByPercentage`](#measuredbypercentage)=0: [0, 0x7fffffff]<br>[`MeasuredByPercentage`](#measuredbypercentage)=1: [0, 100] | 0 |


**Json Parameter Example**   
```
{
    "Left":0
}
```

### As `PublicRuntimeSettings` Member

| Struct |	Struct Member Name | Value Type | Value Range | Default Value |
| ------ | ------------------ | ---------- | ----------- | ------------- |
| [`PublicRuntimeSettings`]({{ site.structs }}PublicRuntimeSettings.html)->[`region`]({{ site.structs }}PublicRuntimeSettings.html#region) | [`regionLeft`]({{ site.structs }}ReferenceRegion.html#regionleft) | *int* | [`regionMeasuredByPercentage`]({{ site.structs }}ReferenceRegion.html#regionmeasuredbypercentage)=0: [0, 0x7fffffff]<br>[`regionMeasuredByPercentage`]({{ site.structs }}ReferenceRegion.html#regionmeasuredbypercentage) = 1: [0, 100] | 0 |

**See Also**   
- [`PublicRuntimeSettings` Struct]({{ site.structs }}PublicRuntimeSettings.html)
- [`ReferenceRegion` Struct]({{ site.structs }}ReferenceRegion.html)



&nbsp;


## Right
The right-most coordinate or percentage of the region.


### As Json Parameter

| Json Object |	Json Parameter Name | Value Type | Value Range | Default Value |
| ----------- | ------------------- | ---------- | ----------- | ------------- |
| ReferenceRegion | Right | *int* | [`MeasuredByPercentage`](#measuredbypercentage)=0: [0, 0x7fffffff]<br>[`MeasuredByPercentage`](#measuredbypercentage)=1: [0, 100] | 0 |


**Json Parameter Example**   
```
{
    "Right":0
}
```

### As `PublicRuntimeSettings` Member

| Struct |	Struct Member Name | Value Type | Value Range | Default Value |
| ------ | ------------------ | ---------- | ----------- | ------------- |
| [`PublicRuntimeSettings`]({{ site.structs }}PublicRuntimeSettings.html)->[`region`]({{ site.structs }}PublicRuntimeSettings.html#region) | [`regionRight`]({{ site.structs }}ReferenceRegion.html#regionright) | *int* | [`regionMeasuredByPercentage`]({{ site.structs }}ReferenceRegion.html#regionmeasuredbypercentage)=0: [0, 0x7fffffff]<br>[`regionMeasuredByPercentage`]({{ site.structs }}ReferenceRegion.html#regionmeasuredbypercentage) = 1: [0, 100] | 0 |

**See Also**   
- [`PublicRuntimeSettings` Struct]({{ site.structs }}PublicRuntimeSettings.html)
- [`ReferenceRegion` Struct]({{ site.structs }}ReferenceRegion.html)



&nbsp;


## Bottom
The bottom-most coordinate or percentage of the region.


### As Json Parameter

| Json Object |	Json Parameter Name | Value Type | Value Range | Default Value |
| ----------- | ------------------- | ---------- | ----------- | ------------- |
| ReferenceRegion | Bottom | *int* | [`MeasuredByPercentage`](#measuredbypercentage)=0: [0, 0x7fffffff]<br>[`MeasuredByPercentage`](#measuredbypercentage)=1: [0, 100] | 0 |


**Json Parameter Example**   
```
{
    "Bottom":0
}
```

### As `PublicRuntimeSettings` Member

| Struct |	Struct Member Name | Value Type | Value Range | Default Value |
| ------ | ------------------ | ---------- | ----------- | ------------- |
| [`PublicRuntimeSettings`]({{ site.structs }}PublicRuntimeSettings.html)->[`region`]({{ site.structs }}PublicRuntimeSettings.html#region) | [`regionBottom`]({{ site.structs }}ReferenceRegion.html#regionbottom) | *int* | [`regionMeasuredByPercentage`]({{ site.structs }}ReferenceRegion.html#regionmeasuredbypercentage)=0: [0, 0x7fffffff]<br>[`regionMeasuredByPercentage`]({{ site.structs }}ReferenceRegion.html#regionmeasuredbypercentage) = 1: [0, 100] | 0 |

**See Also**   
- [`PublicRuntimeSettings` Struct]({{ site.structs }}PublicRuntimeSettings.html)
- [`ReferenceRegion` Struct]({{ site.structs }}ReferenceRegion.html)



&nbsp;



## MeasuredByPercentage
Sets whether or not to use percentages to measure the Region size

**Remarks**   
When it’s set to 1, the values of [Top](#top), [Left](#left), [Right](#right), [Bottom](#bottom) indicates the percentage (from 0 to 100). Otherwise, they refer to the coordinates.   
- 0: not by percentage
- 1: by percentage


### As Json Parameter

| Json Object |	Json Parameter Name | Value Type | Value Range | Default Value |
| ----------- | ------------------- | ---------- | ----------- | ------------- |
| ReferenceRegion | MeasuredByPercentage | *int* | [0, 1] | 0 |


**Json Parameter Example**   
```
{
    "MeasuredByPercentage":0
}
```

### As `PublicRuntimeSettings` Member

| Struct |	Struct Member Name | Value Type | Value Range | Default Value |
| ------ | ------------------ | ---------- | ----------- | ------------- |
| [`PublicRuntimeSettings`]({{ site.structs }}PublicRuntimeSettings.html)->[`region`]({{ site.structs }}PublicRuntimeSettings.html#region) | [`MeasuredByPercentage`]({{ site.structs }}ReferenceRegion.html#measuredbypercentage) | *int* | [0, 1] | 0 |

**See Also**   
- [`PublicRuntimeSettings` Struct]({{ site.structs }}PublicRuntimeSettings.html)
- [`ReferenceRegion` Struct]({{ site.structs }}ReferenceRegion.html)

