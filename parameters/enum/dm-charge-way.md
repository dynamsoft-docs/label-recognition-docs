---
layout: default-layout
title: Dynamsoft Core Enumerations - DM_ChargeWay
description: This article shows the DM_ChargeWay enumeration of Dynamsoft Core.
keywords: enumerations, DM_ChargeWay
needAutoGenerateSidebar: true
needGenerateH3Content: true
noTitleIndex: true
---

# DM_ChargeWay
Describes charge way.


## Declarations
   
| Language | Declaration |
| -------- | ----------- |
| C / C++ | `enum DM_ChargeWay` |
| .Net | `enum Dynamsoft.Core.EnumDMChargeWay` |
| Android | `class com.dynamsoft.core.EnumDMChargeWay` |
| ObjC / Swift | `enum EnumDMChargeWay` |
| Java | `class com.dynamsoft.core.EnumDMChargeWay` |


## Members
   
| Member (except ObjC/Swift) | Member (ObjC/Swift) | Value | Description |
| -------------------------- | ------------------- | ----- | ----------- |
| DM_CW_AUTO | EnumDMChargeWayAuto | 0 | The charge way automatically determined by the license server. |
| DM_CW_DEVICE_COUNT | EnumDMChargeWayDeviceCount | 1 | Charges by the count of devices. |
| DM_CW_SCAN_COUNT | EnumDMChargeWayScanCount | 2 | Charges by the count of barcode scans.|
| DM_CW_CONCURRENT_DEVICE_COUNT | EnumDMChargeWayConcurrentDeviceCount | 3 | Charges by the count of concurrent devices. |
| DM_CW_APP_DOMAIN_COUNT | EnumDMChargeWayAppDomainCount | 6 | Charges by the count of app domains. |
| DM_CW_ACTIVE_DEVICE_COUNT | EnumDMChargeWayActiveDeviceCount | 8 | Charges by the count of active devices. |
| DM_CW_INSTANCE_COUNT | EnumDMChargeWayInstanceCount | 9 | Charges by the count of instances. |
| DM_CW_CONCURRENT_INSTANCE_COUNT | EnumDMChargeWayConcurrentInstanceCount | 10 | Charges by the count of concurrent instances. |

