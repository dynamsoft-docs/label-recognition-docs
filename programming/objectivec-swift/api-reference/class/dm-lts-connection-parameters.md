---
layout: default-layout
title: Dynamsoft Label Recognition Objective-C & Swift Class - iDMLTSConnectionParameters
description: This page shows the iDMLTSConnectionParameters class of Dynamsoft Label Recognition for iOS SDK.
keywords: iDMLTSConnectionParameters, class, objective-c, oc, swift
needAutoGenerateSidebar: true
---


# iDMLTSConnectionParameters
Defines a class to configure the parameters to connect to license tracking server.  


## Attributes
    
| Attribute | Type |
|---------- | ---- |
| [`mainServerURL`](#mainserverurl) | *NSString\** |
| [`standbyServerURL`](#standbyserverurl) | *NSString\** |
| [`handshakeCode`](#handshakecode) | *NSString\** |
| [`sessionPassword`](#sessionpassword) | *NSString\** |
| [`chargeWay`](#chargeway) | *EnumDMChargeWay* |
| [`UUIDGenerationMethod`](#uuidgenerationmethod) | *EnumDMUUIDGenerationMethod* |
| [`maxBufferDays`](#maxbufferdays) | *NSInteger* |
| [`limitedLicenseModules`](#limitedlicensemodules) | *NSArray\** |


### mainServerURL
The URL of the license tracking server.
```objc
NSString*  mainServerURL
```
- **Value range**   
    Any string value   
      
- **Default value**   
    ""

- **Remarks**   
    If you choose "Dynamsoft-hosting", then no need to change the value of MainServerURL and StandbyServerURL. When both are set to null (default value), it will connect to Dynamsoft's license tracking servers for online verification.   


### standbyServerURL
The URL of the standby license tracking server.
```objc
NSString*  standbyServerURL
```
- **Value range**   
    Any string value   
      
- **Default value**   
    ""

- **Remarks**   
    If you choose "Dynamsoft-hosting", then no need to change the value of MainServerURL and StandbyServerURL. When both are set to null (default value), it will connect to Dynamsoft's license tracking servers for online verification.   


### handshakeCode
The handshake code.
```objc
NSString*  handshakeCode
```
- **Value range**   
    Any string value   
      
- **Default value**   
    ""

### sessionPassword
The session password of the handshake code set in license tracking server.
```objc
NSString*  sessionPassword
```
- **Value range**   
    Any string value   
      
- **Default value**   
    ""

### chargeWay
Sets the charge way.
```objc
EnumDMChargeWay chargeWay
```
- **Value range**   
    A value of [`EnumDMChargeWay`]({{ site.enumerations }}other-enums.html#dm_chargeway) Enumeration items.
      
- **Default value**   
    `EnumDMChargeWayAuto`
    
- **See also**  
    [`EnumDMChargeWay`]({{ site.enumerations }}other-enums.html#dm_chargeway)
      

### UUIDGenerationMethod
Sets the method to generate UUID.
```objc
EnumDMUUIDGenerationMethod UUIDGenerationMethod
```
- **Value range**   
    A value of [`EnumDMUUIDGenerationMethod`]({{ site.enumerations }}other-enums.html#dm_uuidgenerationmethod) Enumeration items.
      
- **Default value**   
    `EnumDMUUIDGenerationMethodRandom`
    
- **See also**  
    [`EnumDMUUIDGenerationMethod`]({{ site.enumerations }}other-enums.html#dm_uuidgenerationmethod)
      

### maxBufferDays
Sets the max days to buffer the license info.
```objc
NSInteger maxBufferDays
```
- **Value range**   
    [0,0x7fffffff]   
      
- **Default value**   
    7

### limitedLicenseModules
Sets the license modules to use.
```objc
NSArray*  limitedLicenseModules
```
- **Value range**   
    Each array item can be any one of the [`EnumDMLicenseModule`]({{ site.enumerations }}other-enums.html#dm_licensemodule) Enumeration items.   
      
- **Default value**   
    nil
    
- **See also**  
    [`EnumDMLicenseModule`]({{ site.enumerations }}other-enums.html#dm_licensemodule)    
      
