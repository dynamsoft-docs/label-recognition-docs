---
layout: default-layout
title: Dynamsoft Label Recognition .Net Class - DMLTSConnectionParameters
description: This page shows the DMLTSConnectionParameters struct of Dynamsoft Label Recognition for .Net Language.
keywords: DMLTSConnectionParameters, struct, .Net
needAutoGenerateSidebar: true
---


# DMLTSConnectionParameters
Defines a struct to configure the parameters to connect to license tracking server.  


## Attributes
    
| Attribute | Type |
|---------- | ---- |
| [`MainServerURL`](#mainserverurl) | *string* |
| [`StandbyServerURL`](#standbyserverurl) | *string* |
| [`HandshakeCode`](#handshakecode) | *string* |
| [`SessionPassword`](#sessionpassword) | *string* |
| [`DeploymentType`](#deploymenttype) | *EnumDMDeploymentType* |
| [`ChargeWay`](#chargeway) | *EnumDMChargeWay* |
| [`UUIDGenerationMethod`](#uuidgenerationmethod) | *EnumDMUUIDGenerationMethod* |
| [`MaxBufferDays`](#maxbufferdays) | *int* |
| [`LimitedLicenseModules`](#limitedlicensemodules) | *EnumDMLicenseModule\[\]]* |
| [`MaxConcurrentInstanceCount`](#maxconcurrentinstancecount) | *int* |


### MainServerURL
The URL of the license tracking server.
```csharp
string  Dynamsoft.DMLTSConnectionParameters.MainServerURL
```
- **Value range**   
    Any string value   
      
- **Default value**   
    ""

- **Remarks**   
    If you choose "Dynamsoft-hosting", then no need to change the value of MainServerURL and StandbyServerURL. When both are set to null (default value), it will connect to Dynamsoft's license tracking servers for online verification.   


### StandbyServerURL
The URL of the standby license tracking server.
```csharp
string  Dynamsoft.DMLTSConnectionParameters.StandbyServerURL
```
- **Value range**   
    Any string value   
      
- **Default value**   
    ""

- **Remarks**   
    If you choose "Dynamsoft-hosting", then no need to change the value of MainServerURL and StandbyServerURL. When both are set to null (default value), it will connect to Dynamsoft's license tracking servers for online verification.   


### HandshakeCode
The handshake code.
```csharp
string  Dynamsoft.DMLTSConnectionParameters.HandshakeCode
```
- **Value range**   
    Any string value   
      
- **Default value**   
    ""

### SessionPassword
The session password of the handshake code set in license tracking server.
```csharp
string  Dynamsoft.DMLTSConnectionParameters.SessionPassword
```
- **Value range**   
    Any string value   
      
- **Default value**   
    ""

### DeploymentType

Sets the deployment type.

```csharp
EnumDMDeploymentType Dynamsoft.DMLTSConnectionParameters.DeploymentType
```

- **Value range**   
    Any one of the [`EnumDMDeploymentType`]({{ site.enumerations }}other-enums.html#dm_deploymenttype) Enumeration items.   
      
- **Default value**   
    DM_DT_DESKTOP   
    
- **See also**  
    [`EnumDMDeploymentType`]({{ site.enumerations }}other-enums.html#dm_deploymenttype)    

### ChargeWay
Sets the charge way.
```csharp
int Dynamsoft.DMLTSConnectionParameters.ChargeWay
```
- **Value range**   
    A value of [`EnumDMChargeWay`]({{ site.enumerations }}other-enums.html#dm_chargeway) Enumeration items.
      
- **Default value**   
    `DM_CW_AUTO`
    
- **See also**  
    [`EnumDMChargeWay`]({{ site.enumerations }}other-enums.html#dm_chargeway)
      

### UUIDGenerationMethod
Sets the method to generate UUID.
```csharp
int Dynamsoft.DMLTSConnectionParameters.UUIDGenerationMethod
```
- **Value range**   
    A value of [`EnumDMUUIDGenerationMethod`]({{ site.enumerations }}other-enums.html#dm_uuidgenerationmethod) Enumeration items.
      
- **Default value**   
    `DM_UUIDGM_RANDOM`
    
- **See also**  
    [`EnumDMUUIDGenerationMethod`]({{ site.enumerations }}other-enums.html#dm_uuidgenerationmethod)
      

### MaxBufferDays
Sets the max days to buffer the license info.
```csharp
int Dynamsoft.DMLTSConnectionParameters.MaxBufferDays
```
- **Value range**   
    [0,0x7fffffff]   
      
- **Default value**   
    7

### LimitedLicenseModules
Sets the license modules to use.
```csharp
List<Integer>  Dynamsoft.DMLTSConnectionParameters.LimitedLicenseModules
```
- **Value range**   
    A list of the [`EnumDMLicenseModule`]({{ site.enumerations }}other-enums.html#dm_licensemodule) Enumeration items.   
      
- **Default value**   
    null
    
- **See also**  
    [`EnumDMLicenseModule`]({{ site.enumerations }}other-enums.html#dm_licensemodule)    
      

### MaxConcurrentInstanceCount
Sets the max concurrent instance count.
```csharp
int Dynamsoft.DMLTSConnectionParameters.MaxConcurrentInstanceCount
```
- **Value range**   
    [1,0x7fffffff]   
      
- **Default value**   
    1
- **Remarks**   
    It works only when [ChargeWay](#chargeway) is setting to DM_CW_CONCURRENT_INSTANCE_COUNT
    It is the total number of instances used by multiple processes. For example, if there are two .EXE are running on the server and each .EXE may have 10 instances at most, then you should set MaxConcurrentInstanceCount to 20.