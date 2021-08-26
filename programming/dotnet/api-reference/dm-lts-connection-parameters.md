---
layout: default-layout
title: Dynamsoft Core .Net Class - DMDLSConnectionParameters
description: This page shows the DMDLSConnectionParameters Class of Dynamsoft Core for .Net Language.
keywords: DMDLSConnectionParameters, .Net
needAutoGenerateSidebar: true
needGenerateH3Content: true
noTitleIndex: true
---


# DMDLSConnectionParameters
Defines a struct to configure the parameters to connect to license tracking server.  

```csharp
class Dynamsoft.Core.DMDLSConnectionParameters
```   

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
| [`OrganizationID`](#organizationid) | *string* |
| [`Products`](#products) | *int* |


&nbsp;

### MainServerURL
The URL of the license tracking server.
```csharp
string  MainServerURL
```
- **Value range**   
    Any string value   
      
- **Default value**   
    ""

- **Remarks**   
    If you choose "Dynamsoft-hosting", then no need to change the value of MainServerURL and StandbyServerURL. When both are set to null (default value), it will connect to Dynamsoft's license tracking servers for online verification.   


&nbsp;

### StandbyServerURL
The URL of the standby license tracking server.
```csharp
string  StandbyServerURL
```
- **Value range**   
    Any string value   
      
- **Default value**   
    ""

- **Remarks**   
    If you choose "Dynamsoft-hosting", then no need to change the value of MainServerURL and StandbyServerURL. When both are set to null (default value), it will connect to Dynamsoft's license tracking servers for online verification.   


&nbsp;

### HandshakeCode
The handshake code.
```csharp
string  HandshakeCode
```
- **Value range**   
    Any string value   
      
- **Default value**   
    ""

&nbsp;

### SessionPassword
The session password of the handshake code set in license tracking server.
```csharp
string  SessionPassword
```
- **Value range**   
    Any string value   
      
- **Default value**   
    ""

&nbsp;

### DeploymentType

Sets the deployment type.

```csharp
EnumDMDeploymentType DeploymentType
```

- **Value range**   
    Any one of the [`EnumDMDeploymentType`]({{ site.enumerations }}dm-deployment-type.html) Enumeration items.   
      
- **Default value**   
    DM_DT_DESKTOP   
    
- **See also**  
    [`EnumDMDeploymentType`]({{ site.enumerations }}dm-deployment-type.html)    

&nbsp;

### ChargeWay
Sets the charge way.
```csharp
int ChargeWay
```
- **Value range**   
    A value of [`EnumDMChargeWay`]({{ site.enumerations }}dm-charge-way.html) Enumeration items.
      
- **Default value**   
    `DM_CW_AUTO`
    
- **See also**  
    [`EnumDMChargeWay`]({{ site.enumerations }}dm-charge-way.html)
      

&nbsp;

### UUIDGenerationMethod
Sets the method to generate UUID.
```csharp
int UUIDGenerationMethod
```
- **Value range**   
    A value of [`EnumDMUUIDGenerationMethod`]({{ site.enumerations }}dm-uuid-generation-method.html) Enumeration items.
      
- **Default value**   
    `DM_UUIDGM_RANDOM`
    
- **See also**  
    [`EnumDMUUIDGenerationMethod`]({{ site.enumerations }}dm-uuid-generation-method.html)
      

&nbsp;

### MaxBufferDays
Sets the max days to buffer the license info.
```csharp
int MaxBufferDays
```
- **Value range**   
    [0,0x7fffffff]   
      
- **Default value**   
    7

&nbsp;

### LimitedLicenseModules
Sets the license modules to use.
```csharp
List<Integer>  LimitedLicenseModules
```
- **Value range**   
    A list of the [`EnumDMLicenseModule`]({{ site.enumerations }}dm-license-module.html) Enumeration items.   
      
- **Default value**   
    null
    
- **See also**  
    [`EnumDMLicenseModule`]({{ site.enumerations }}dm-license-module.html)    
      

&nbsp;

### MaxConcurrentInstanceCount
Sets the max concurrent instance count.
```csharp
int MaxConcurrentInstanceCount
```
- **Value range**   
    [1,0x7fffffff]   
      
- **Default value**   
    1
- **Remarks**   
    It works only when [ChargeWay](#chargeway) is setting to DM_CW_CONCURRENT_INSTANCE_COUNT
    It is the total number of instances used by multiple processes. For example, if there are two .EXE are running on the server and each .EXE may have 10 instances at most, then you should set MaxConcurrentInstanceCount to 20.

&nbsp;

### OrganizationID
The organization ID got from Dynamsoft.
```csharp
string OrganizationID
```
- **Value range**   
    Any string value   
      
- **Default value**   
    ""

&nbsp;

### Products
Sets the products to get the license for. Product values can be combined.
```csharp
int Products
```
- **Value range**   
    A combine value of [`EnumProduct`]({{ site.enumerations }}product.html) Enumeration items.
      
- **Default value**   
    `PROD_ALL`
    
- **See also**  
    [`EnumProduct`]({{ site.enumerations }}product.html)