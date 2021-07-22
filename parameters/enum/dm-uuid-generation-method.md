---
layout: default-layout
title: Dynamsoft Core Enumerations - DM_UUIDGenerationMethod
description: This article shows the DM_UUIDGenerationMethod enumeration of Dynamsoft Core.
keywords: enumerations, DM_UUIDGenerationMethod
needAutoGenerateSidebar: true
needGenerateH3Content: true
noTitleIndex: true
---

# DM_UUIDGenerationMethod
Describes UUID generation method.


## Declarations
   
| Language | Declaration |
| -------- | ----------- |
| C / C++ | `enum DM_UUIDGenerationMethod` |
| .Net | `enum Dynamsoft.Core.EnumDMUUIDGenerationMethod` |
| Android | `class com.dynamsoft.core.EnumDMUUIDGenerationMethod` |
| ObjC / Swift | `enum EnumDMUUIDGenerationMethod` |
| Java | `class com.dynamsoft.core.EnumDMUUIDGenerationMethod` |


## Members
   
| Member (except ObjC/Swift) | Member (ObjC/Swift) | Value | Description |
| -------------------------- | ------------------- | ----- | ----------- |
| DM_UUIDGM_RANDOM | EnumDMUUIDGenerationMethodRandom | 1 | Generates UUID with random values. |
| DM_UUIDGM_HARDWARE | EnumDMUUIDGenerationMethodHardware | 2 | Generates UUID based on hardware info. |
