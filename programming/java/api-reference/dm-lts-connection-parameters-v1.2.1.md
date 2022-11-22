---
layout: default-layout
title: Class DMLTSConnectionParameters - Dynamsoft Label Recognizer Java Edition
description: This page shows the DMLTSConnectionParameters struct of Dynamsoft Label Recognition for Java Language.
keywords: DMLTSConnectionParameters, struct, java
needAutoGenerateSidebar: true
needGenerateH3Content: true
---


# class com.dynamsoft.dlr.DMLTSConnectionParameters
Defines a struct to configure the parameters to connect to license tracking server.  


## Attributes
    
| Attribute | Type |
|---------- | ---- |
| [`mainServerURL`](#mainserverurl) | *String* |
| [`standbyServerURL`](#standbyserverurl) | *String* |
| [`handshakeCode`](#handshakecode) | *String* |
| [`sessionPassword`](#sessionpassword) | *String* |
| [`deploymentType`](#deploymenttype) | *int* |
| [`chargeWay`](#chargeway) | *int* |
| [`UUIDGenerationMethod`](#uuidgenerationmethod) | *int* |
| [`maxBufferDays`](#maxbufferdays) | *int* |
| [`limitedLicenseModules`](#limitedlicensemodules) | *int[]* |
| [`maxConcurrentInstanceCount`](#maxconcurrentinstancecount) | *int* |
| [`organizationID`](#organizationid) | *String* |
| [`products`](#products) | *int* |


### mainServerURL
The URL of the license tracking server.

```java
String  mainServerURL
```

**Value Range**

Any string value   

**Default value**

""

**Remarks**

If you choose "Dynamsoft-hosting", then no need to change the value of MainServerURL and StandbyServerURL. When both are set to null (default value), it will connect to Dynamsoft's license tracking servers for online verification.   


### standbyServerURL
The URL of the standby license tracking server.

```java
String  standbyServerURL
```

**Value Range**

Any string value   

**Default value**

""

**Remarks**

If you choose "Dynamsoft-hosting", then no need to change the value of MainServerURL and StandbyServerURL. When both are set to null (default value), it will connect to Dynamsoft's license tracking servers for online verification.   


### handshakeCode
The handshake code.

```java
String  handshakeCode
```

**Value Range**

Any string value   

**Default value**

""

### sessionPassword
The session password of the handshake code set in license tracking server.

```java
String  sessionPassword
```

**Value Range**

Any string value   

**Default value**

""

### deploymentType

Sets the deployment type.

```java
int deploymentType
```

**Value Range**

Any one of the [`EnumDMDeploymentType`]({{ site.enumerations }}other-enums.html#dm_deploymenttype) Enumeration items.   

**Default value**

DM_DT_DESKTOP   

**See also**

[`EnumDMDeploymentType`]({{ site.enumerations }}other-enums.html#dm_deploymenttype)  


### chargeWay
Sets the charge way.

```java
int chargeWay
```

**Value Range**

A value of [`EnumDMChargeWay`]({{ site.enumerations }}other-enums.html#dm_chargeway) Enumeration items.

**Default value**

`DM_CW_AUTO`

**See also**

[`EnumDMChargeWay`]({{ site.enumerations }}other-enums.html#dm_chargeway)
      

### UUIDGenerationMethod
Sets the method to generate UUID.

```java
int UUIDGenerationMethod
```

**Value Range**

A value of [`EnumDMUUIDGenerationMethod`]({{ site.enumerations }}other-enums.html#dm_uuidgenerationmethod) Enumeration items.

**Default value**

`DM_UUIDGM_RANDOM`

**See also**

[`EnumDMUUIDGenerationMethod`]({{ site.enumerations }}other-enums.html#dm_uuidgenerationmethod)
      

### maxBufferDays
Sets the max days to buffer the license info.

```java
int maxBufferDays
```

**Value Range**

[0,0x7fffffff]   

**Default value**

7

### limitedLicenseModules
Sets the license modules to use.

```java
int[] limitedLicenseModules
```

**Value Range**

A list of the [`EnumDMLicenseModule`]({{ site.enumerations }}other-enums.html#dm_licensemodule) Enumeration items.   

**Default value**

null

**See also**

[`EnumDMLicenseModule`]({{ site.enumerations }}other-enums.html#dm_licensemodule)    
      

### maxConcurrentInstanceCount
Sets the max concurrent instance count.

```java
int maxConcurrentInstanceCount
```

**Value Range**

[1,0x7fffffff]   

**Default value**

1
**Remarks**

It works only when [chargeWay](#chargeway) is setting to DM_CW_CONCURRENT_INSTANCE_COUNT
    It is the total number of instances used by multiple processes. For example, if there are two .EXE are running on the server and each .EXE may have 10 instances at most, then you should set maxConcurrentInstanceCount to 20.


### organizationID
The organization ID got from Dynamsoft.

```java
String organizationID
```

**Value Range**

Any string value   

**Default value**

""

### products
Sets the products to get the license for. Product values can be combined.

```java
int products
```

**Value Range**

A combine value of [`EnumProduct`]({{ site.enumerations }}other-enums.html#product) Enumeration items.

**Default value**

`PROD_ALL`

**See also**

[`EnumProduct`]({{ site.enumerations }}other-enums.html#product)