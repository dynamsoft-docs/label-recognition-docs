---
layout: default-layout
title: Dynamsoft Label Recognizer .Net API Reference - LabelRecognizerException Class
description: This page shows the LabelRecognizerException Class of Dynamsoft Label Recognizer for .Net SDK.
keywords: LabelRecognizerException, class, api reference, .Net
needAutoGenerateSidebar: true
needGenerateH3Content: true
noTitleIndex: true
---


# LabelRecognizerException
The exception class of Dynamsoft.DBR.LabelRecognizer.

```csharp
class Dynamsoft.DLR.LabelRecognizerException
```   

## Attributes
  
| Attribute | Type |
|---------- | ----------- | 
| [`Code`](#code) | *EnumDLRErrorCode* |
| [`Message`](#message) | *string* | 
| [`StackTrace`](#stacktrace) | *string* |
  
  
&nbsp;

### Code
Gets or sets the error code. 

```csharp
EnumDLRErrorCode Code
```  
- **See also**  
    [`EnumDLRErrorCode`]({{ site.enumerations }}error-code.html)    

&nbsp;

### Message
Gets the message that describes the current exception. 

```csharp
override string Message
```  

&nbsp;

### StackTrace
Gets the string representation of the frames on the call stack at the time the current exception was thrown. 

```csharp
override string StackTrace
```  

