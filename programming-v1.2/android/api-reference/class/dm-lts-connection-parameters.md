---
layout: default-layout
title: Dynamsoft Label Recognition Android Class - DMLTSConnectionParameters
description: This page shows the DMLTSConnectionParameters struct of Dynamsoft Label Recognition for Android Language.
keywords: DMLTSConnectionParameters, struct, android
needAutoGenerateSidebar: true
---


# DMLTSConnectionParameters
Defines a struct to configure the parameters to connect to license tracking server.  


## Attributes
    
| Attribute | Type |
|---------- | ---- |
| [`mainServerURL`](#mainserverurl) | *String* |
| [`standbyServerURL`](#standbyserverurl) | *String* |
| [`handshakeCode`](#handshakecode) | *String* |
| [`sessionPassword`](#sessionpassword) | *String* |
| [`chargeWay`](#chargeway) | *int* |
| [`UUIDGenerationMethod`](#uuidgenerationmethod) | *int* |
| [`maxBufferDays`](#maxbufferdays) | *int* |
| [`limitedLicenseModules`](#limitedlicensemodules) | *List<Integer>* |


### mainServerURL
The URL of the license tracking server.
```java
String  com.dynamsoft.dlr.DMLTSConnectionParameters.mainServerURL
```
- **Value range**   
    Any string value   
      
- **Default value**   
    ""

- **Remarks**   
    If you choose "Dynamsoft-hosting", then no need to change the value of MainServerURL and StandbyServerURL. When both are set to null (default value), it will connect to Dynamsoft's license tracking servers for online verification.   


### standbyServerURL
The URL of the standby license tracking server.
```java
String  com.dynamsoft.dlr.DMLTSConnectionParameters.standbyServerURL
```
- **Value range**   
    Any string value   
      
- **Default value**   
    ""

- **Remarks**   
    If you choose "Dynamsoft-hosting", then no need to change the value of MainServerURL and StandbyServerURL. When both are set to null (default value), it will connect to Dynamsoft's license tracking servers for online verification.   


### handshakeCode
The handshake code.
```java
String  com.dynamsoft.dlr.DMLTSConnectionParameters.handshakeCode
```
- **Value range**   
    Any string value   
      
- **Default value**   
    ""

### sessionPassword
The session password of the handshake code set in license tracking server.
```java
String  com.dynamsoft.dlr.DMLTSConnectionParameters.sessionPassword
```
- **Value range**   
    Any string value   
      
- **Default value**   
    ""

### chargeWay
Sets the charge way.
```java
int com.dynamsoft.dlr.DMLTSConnectionParameters.chargeWay
```
- **Value range**   
    A value of [`EnumDMChargeWay`]({{ site.enumerations }}other-enums.html#dm_chargeway) Enumeration items.
      
- **Default value**   
    `DM_CW_AUTO`
    
- **See also**  
    [`EnumDMChargeWay`]({{ site.enumerations }}other-enums.html#dm_chargeway)
      

### UUIDGenerationMethod
Sets the method to generate UUID.
```java
int com.dynamsoft.dlr.DMLTSConnectionParameters.UUIDGenerationMethod
```
- **Value range**   
    A value of [`EnumDMUUIDGenerationMethod`]({{ site.enumerations }}other-enums.html#dm_uuidgenerationmethod) Enumeration items.
      
- **Default value**   
    `DM_UUIDGM_RANDOM`
    
- **See also**  
    [`EnumDMUUIDGenerationMethod`]({{ site.enumerations }}other-enums.html#dm_uuidgenerationmethod)
      

### maxBufferDays
Sets the max days to buffer the license info.
```java
int com.dynamsoft.dlr.DMLTSConnectionParameters.maxBufferDays
```
- **Value range**   
    [0,0x7fffffff]   
      
- **Default value**   
    7

### limitedLicenseModules
Sets the license modules to use.
```java
List<Integer>  com.dynamsoft.dlr.DMLTSConnectionParameters.limitedLicenseModules
```
- **Value range**   
    A list of the [`EnumDMLicenseModule`]({{ site.enumerations }}other-enums.html#dm_licensemodule) Enumeration items.   
      
- **Default value**   
    null
    
- **See also**  
    [`EnumDMLicenseModule`]({{ site.enumerations }}other-enums.html#dm_licensemodule)    
      
