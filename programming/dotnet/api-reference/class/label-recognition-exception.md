---
layout: default-layout
title: Dynamsoft Label Recognition .Net API Reference - DLR_Exception Class
description: This page shows the DLR_Exception Class of Dynamsoft Label Recognition for .Net SDK.
keywords: DLR_Exception, class, api reference, .Net
needAutoGenerateSidebar: false
---


# DLR_Exception
The exception class of Dynamsoft.LabelRecognition.

```csharp
public class DLR_Exception : Exception
```  

---

## Attributes
  
| Attribute | Type |
|---------- | ----------- | 
| [`Code`](#code) | *EnumDLRErrorCode* |
| [`Message`](#message) | *string* | 
| [`StackTrace`](#stacktrace) | *string* |
  
  
### Code
Gets or sets the error code. 

```csharp
EnumDLRErrorCode Dynamsoft.DLR.DLR_Exception.Code
```  
- **See also**  
    [`EnumDLRErrorCode`]({{ site.enumerations }}error-code.html)    

### Message
Gets the message that describes the current exception. 

```csharp
override string Dynamsoft.DLR.DLR_Exception.Message
```  

### StackTrace
Gets the string representation of the frames on the call stack at the time the current exception was thrown. 

```csharp
override string Dynamsoft.DLR.DLR_Exception.StackTrace
```  

