---
layout: default-layout
title: Dynamsoft Core C & C++ Struct - DM_DLSConnectionParameters
description: This page shows the DM_DLSConnectionParameters struct of Dynamsoft Core for C & C++ Language.
keywords: DM_DLSConnectionParameters, struct, c, c++
needAutoGenerateSidebar: true
needGenerateH3Content: true
noTitleIndex: true
---


# DM_DLSConnectionParameters
Defines a struct to configure the parameters to connect to license tracking server.  

```cpp
typedef struct tagDM_DLSConnectionParameters  DM_DLSConnectionParameters
```


## Attributes
    
| Attribute | Type |
|---------- | ---- |
| [`mainServerURL`](#mainserverurl) | *char\** |
| [`standbyServerURL`](#standbyserverurl) | *char\** |
| [`handshakeCode`](#handshakecode) | *char\** |
| [`sessionPassword`](#sessionpassword) | *char\** |
| [`deploymentType`](#deploymenttype) | [`DM_DeploymentType`]({{ site.enumerations }}dm-deployment-type.html) |
| [`chargeWay`](#chargeway) | [`DM_ChargeWay`]({{ site.enumerations }}dm-charge-way.html) |
| [`UUIDGenerationMethod`](#uuidgenerationmethod) | [`DM_UUIDGenerationMethod`]({{ site.enumerations }}dm-uuid-generation-method.html) |
| [`maxBufferDays`](#maxbufferdays) | *int* |
| [`limitedLicenseModulesCount`](#limitedlicensemodulescount) | *int* |
| [`limitedLicenseModules`](#limitedlicensemodules) | [`DM_LicenseModule*`]({{ site.enumerations }}dm-license-module.html) |
| [`maxConcurrentInstanceCount`](#maxconcurrentinstancecount) | *int* |
| [`organizationID`](#organizationID) | *char\** |
| [`products`](#products) | *int* |
| [`reserved`](#reserved) | *char\[52\]* |


&nbsp;

### mainServerURL
The URL of the license tracking server.
```cpp
char*  mainServerURL
```
- **Value range**   
    Any string value   
      
- **Default value**   
    NULL

- **Remarks**   
    If you choose "Dynamsoft-hosting", then no need to change the value of MainServerURL and StandbyServerURL. When both are set to NULL (default value), it will connect to Dynamsoft's license tracking servers for online verification.   


&nbsp;

### standbyServerURL
The URL of the standby license tracking server.
```cpp
char*  standbyServerURL
```
- **Value range**   
    Any string value   
      
- **Default value**   
    NULL

- **Remarks**   
    If you choose "Dynamsoft-hosting", then no need to change the value of MainServerURL and StandbyServerURL. When both are set to NULL (default value), it will connect to Dynamsoft's license tracking servers for online verification.   


&nbsp;

### handshakeCode
The handshake code.
```cpp
char*  handshakeCode
```
- **Value range**   
    Any string value   
      
- **Default value**   
    NULL

&nbsp;

### sessionPassword
The session password of the handshake code set in license tracking server.
```cpp
char*  sessionPassword
```
- **Value range**   
    Any string value   
      
- **Default value**   
    NULL

&nbsp;

### deploymentType
Sets the deployment type.
```cpp
DM_DeploymentType deploymentType
```
- **Value range**   
    A value of [`DM_DeploymentType`]({{ site.enumerations }}dm-deployment-type.html) Enumeration items.
      
- **Default value**   
    `DM_DT_DESKTOP`
    
- **See also**  
    [`DM_DeploymentType`]({{ site.enumerations }}dm-deployment-type.html)
      

&nbsp;

### chargeWay
Sets the charge way.
```cpp
DM_ChargeWay chargeWay
```
- **Value range**   
    A value of [`DM_ChargeWay`]({{ site.enumerations }}dm-charge-way.html) Enumeration items.
      
- **Default value**   
    `DM_CW_AUTO`
    
- **See also**  
    [`DM_ChargeWay`]({{ site.enumerations }}dm-charge-way.html)
      

&nbsp;

### UUIDGenerationMethod
Sets the method to generate UUID.
```cpp
DM_UUIDGenerationMethod UUIDGenerationMethod
```
- **Value range**   
    A value of [`DM_UUIDGenerationMethod`]({{ site.enumerations }}dm-uuid-generation-method.html) Enumeration items.
      
- **Default value**   
    `DM_UUIDGM_RANDOM`
    
- **See also**  
    [`DM_UUIDGenerationMethod`]({{ site.enumerations }}dm-uuid-generation-method.html)
      

&nbsp;

### maxBufferDays
Sets the max days to buffer the license info.
```cpp
int maxBufferDays
```
- **Value range**   
    [0,0x7fffffff]   
      
- **Default value**   
    0

&nbsp;

### limitedLicenseModulesCount
Sets the count of license modules to use.
```cpp
int limitedLicenseModulesCount
```
- **Value range**   
    [0,0x7fffffff]   
      
- **Default value**   
    0

&nbsp;

### limitedLicenseModules
Sets the license modules to use.
```cpp
DM_LicenseModule* limitedLicenseModules
```
- **Value range**   
    Each array item can be any one of the [`DM_LicenseModule`]({{ site.enumerations }}dm-license-module.html) Enumeration items.
      
- **Default value**   
    NULL
    
- **See also**  
    [`DM_LicenseModule`]({{ site.enumerations }}dm-license-module.html)

&nbsp;

### maxConcurrentInstanceCount
Sets the max concurrent instance count.
```cpp
int maxConcurrentInstanceCount
```
- **Value range**   
    [1,0x7fffffff]   
      
- **Default value**   
    1
- **Remarks**   
    It works only when [chargeWay](#chargeway) is setting to DM_CW_CONCURRENT_INSTANCE_COUNT.<br>
    It is the total number of instances used by multiple processes. For example, if there are two .EXE are running on the server and each .EXE may have 10 instances at most, then you should set maxConcurrentInstanceCount to 20.

&nbsp;

### organizationID
The organization ID got from Dynamsoft.
```cpp
char* organizationID
```
- **Value range**   
    Any string value   
      
- **Default value**   
    NULL

&nbsp;

### products
Sets the products to get the license for. Product values can be combined.
```cpp
int products
```
- **Value range**   
    A combine value of [`Product`]({{ site.enumerations }}product.html) Enumeration items.
      
- **Default value**   
    `PROD_ALL`
    
- **See also**  
    [`Product`]({{ site.enumerations }}product.html)

&nbsp;

### reserved
Reserved memory for the struct. The length of this array indicates the size of the memory reserved for this struct.
```cpp
char reserved[52]
```
