---
layout: default-layout
title: Dynamsoft Label Recognition Enumerations - Error Code
description: This article shows Error Code of Dynamsoft Label Recognition.
keywords: error code, enumeration
needAutoGenerateSidebar: true
---

# Dynamsoft Label Recognition - Error Code  
  
## Error code common to all programming languages

  | Erorr Code | Value | Description |
  |--------------------------------|-------------------------|-------|-------------|
  | `DLR_OK` | 0 | Successful. |
  | `DLRERR_UNKNOWN` | -10000 | Unknown error. |
  | `DLRERR_NO_MEMORY` | -10001 | Not enough memory to perform the operation. |
  | `DLRERR_NULL_POINTER` | -10002 | Null pointer. |
  | `DLRERR_LICENSE_INVALID` | -10003 | The license is invalid. |
  | `DLRERR_FILE_NOT_FOUND` | -10004 | The file is not found. |
  | `DLRERR_JSON_PARSE_FAILED` | -10005 | Failed to parse JSON string. |
  | `DLRERR_JSON_TYPE_INVALID` | -10006 | The value type is invalid. |
  | `DLRERR_JSON_KEY_INVALID` | -10007 | The key is invalid. |
  | `DLRERR_JSON_VALUE_INVALID` | -10008 | The value is invalid or out of range. |
  | `DLRERR_JSON_NAME_KEY_MISSING` | -10009 | The mandatory key "Name" is missing. |
  | `DLRERR_JSON_NAME_VALUE_DUPLICATED` | -10010 | The value of the key "Name" is duplicated. |
  | `DLRERR_PARAMETER_VALUE_INVALID` | -10011 | The parameter value is invalid or out of range. |
  | `DLRERR_TEMPLATE_NAME_INVALID` | -10012 | The template name is invalid. |
  | `DLRERR_LICENSE_EXPIRED`  | -10013 | The license has expired. |
  | `DLRERR_CHARACTER_MODEL_FILE_NOT_FOUND` | -10014 | The character model file is not found. |

  | `DMERR_HANDSHAKE_CODE_INVALID`          | -20001 | The handshake code is invalid. |
  | `DMERR_LICENSE_BUFFER_FAILED`           | -20002 | Failed to read or write license buffer. |
  | `DMERR_LICENSE_SYNC_FAILED`             | -20003 | Failed to synchronize license info with license tracking server. |
  | `DMERR_DEVICE_NOT_MATCH`                | -20004 | Device does not match with license buffer. |
  | `DMERR_BIND_DEVICE_FAILED`              | -20005 | Failed to bind device. |
  | `DMERR_LICENSE_INTERFACE_CONFLICT`      | -20006 | Interface InitLicenseFromLTS can not be used together with other license initiation interfaces. |
  | `DMERR_LICENSE_CLIENT_DLL_MISSING`      | -20007 | The license client dll is missing. |
  | `DMERR_INSTANCE_COUNT_OVER_LIMITED`     | -20008 | The instance count is over limited. |


## Error code for specific programming languages  

### Android

  | Erorr Code | Value | Description |
  |------------|-------|-------------|
  | `DLR_SYSTEM_EXCEPTION` | 1 | System exception. |

### .Net

  | Erorr Code | Value | Description |
  |------------|-------|-------------|
  | `DLR_SYSTEM_EXCEPTION` | 1 | System exception. |
