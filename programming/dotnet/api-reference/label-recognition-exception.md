---
layout: default-layout
title: Dynamsoft Label Recognizer .Net API Reference - DLR_Exception Class
description: This page shows the DLR_Exception Class of Dynamsoft Label Recognizer for .Net SDK.
keywords: DLR_Exception, class, api reference, .Net
needAutoGenerateSidebar: true
needGenerateH3Content: true
---


# class Dynamsoft.DLR.DLR_Exception
The exception class of Dynamsoft.LabelRecognizer.

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
EnumDLRErrorCode Code
```  
- **See also**  
    [`EnumDLRErrorCode`]({{ site.enumerations }}error-code.html)    

### Message
Gets the message that describes the current exception. 

```csharp
override string Message
```  

### StackTrace
Gets the string representation of the frames on the call stack at the time the current exception was thrown. 

```csharp
override string StackTrace
```  

