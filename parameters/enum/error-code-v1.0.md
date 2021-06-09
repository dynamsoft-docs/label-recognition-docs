---
layout: default-layout
title: Dynamsoft Label Recognition Enumerations - Error Code
description: This article shows Error Code of Dynamsoft Label Recognition.
keywords: error code, enumeration
needAutoGenerateSidebar: true
---

# Dynamsoft Label Recognition - Error Code  
   
## Error code common to all programming languages

  | Erorr Code (except ObjC/Swift) | Erorr Code (ObjC/Swift) | Value | Description |
  |--------------------------------|-------------------------|-------|-------------|
  | `DLR_OK`                                | `EnumErrorCode_OK`                              | 0 | Successful. |
  | `DLRERR_UNKNOWN`                        | `EnumErrorCode_Unknow`                          | -10000 | Unknown error. |
  | `DLRERR_NO_MEMORY`                      | `EnumErrorCode_No_Memory`                       | -10001 | Not enough memory to perform the operation. |
  | `DLRERR_NULL_POINTER`                   | `EnumErrorCode_Null_Pointer`                    | -10002 | Null pointer. |
  | `DLRERR_LICENSE_INVALID`                | `EnumErrorCode_License_Invalid`                 | -10003 | The license is invalid. |
  | `DLRERR_FILE_NOT_FOUND`                 | `EnumErrorCode_File_Not_Found`                  | -10004 | The file is not found. |
  | `DLRERR_JSON_PARSE_FAILED`              | `EnumErrorCode_Json_Parse_Failed`               | -10005 | Failed to parse JSON string. |
  | `DLRERR_JSON_TYPE_INVALID`              | `EnumErrorCode_Json_Type_Invalid`               | -10006 | The value type is invalid. |
  | `DLRERR_JSON_KEY_INVALID`               | `EnumErrorCode_Json_Key_Invalid`                | -10007 | The key is invalid. |
  | `DLRERR_JSON_VALUE_INVALID`             | `EnumErrorCode_Json_Value_Invalid`              | -10008 | The value is invalid or out of range. |
  | `DLRERR_JSON_NAME_KEY_MISSING`          | `EnumErrorCode_Json_Name_Key_Missing`           | -10009 | The mandatory key "Name" is missing. |
  | `DLRERR_JSON_NAME_VALUE_DUPLICATED`     | `EnumErrorCode_Json_Name_Value_Duplicated`      | -10010 | The value of the key "Name" is duplicated. |
  | `DLRERR_PARAMETER_VALUE_INVALID`        | `EnumErrorCode_Parameter_Value_Invalid`         | -10011 | The parameter value is invalid or out of range. |
  | `DLRERR_TEMPLATE_NAME_INVALID`          | `EnumErrorCode_Template_Name_Invalid`           | -10012 | The template name is invalid. |
  | `DLRERR_LICENSE_EXPIRED`                | `EnumErrorCode_License_Expired`                 | -10013 | The license has expired. |
  | `DLRERR_CHARACTER_MODEL_FILE_NOT_FOUND` | `EnumErrorCode_Character_Model_File_Not_Found`  | -10014 | The character model file is not found. |
  | `DLRERR_SET_MODE_ARGUMENT_ERROR`        | `EnumErrorCode_Set_Mode_Argument_Error`         | -10015 | Failed to set mode's argument. |
  | `DLRERR_GET_MODE_ARGUMENT_ERROR`        | `EnumErrorCode_Get_MODE_Argument_Error`         | -10016 | Failed to set mode's argument. |
  | `DLRERR_REQUESTED_FAILED`               | `EnumErrorCode_Requested_Failed`                | -10044 | Failed to request the license file. |
  | `DMERR_NO_LICENSE`                      | `EnumErrorCode_No_License`                      | -20000 | No license specified. |
  | `DMERR_HANDSHAKE_CODE_INVALID`          | `EnumErrorCode_Handshake_Code_Invalid`          | -20001 | The handshake code is invalid. |
  | `DMERR_LICENSE_BUFFER_FAILED`           | `EnumErrorCode_License_Buffer_Failed`           | -20002 | Failed to read or write license buffer. |
  | `DMERR_LICENSE_SYNC_FAILED`             | `EnumErrorCode_License_Sync_Failed`             | -20003 | Failed to synchronize license info with license tracking server. |
  | `DMERR_DEVICE_NOT_MATCH`                | `EnumErrorCode_Device_Not_Match`                | -20004 | Device does not match with license buffer. |
  | `DMERR_BIND_DEVICE_FAILED`              | `EnumErrorCode_Bind_Device_Failed`              | -20005 | Failed to bind device. |
  | `DMERR_LICENSE_INTERFACE_CONFLICT`      | `EnumErrorCode_License_Interface_Conflict`      | -20006 | Interface InitLicenseFromLTS can not be used together with other license initiation interfaces.|
  | `DMERR_LICENSE_CLIENT_DLL_MISSING`      | `EnumErrorCode_License_Client_DLL_Missing`      | -20007 | The license client dll is missing. |
  | `DMERR_INSTANCE_COUNT_OVER_LIMIT`       | `EnumErrorCode_Instance_Count_Over_Limit`       | -20008 | The number of instances used has exceeded the limit. |
  | `DMERR_LICENSE_INIT_SEQUENCE_FAILED`    | `EnumErrorCode_License_Init_Sequence_Failed`    | -20009 | Interface InitLicenseFromLTS has to be called before creating any SDK objects. |
  | `DMERR_TRIAL_LICENSE`                   | `EnumErrorCode_Trial_License`                   | -20010 | Using a trial license. |


## Error code for specific programming languages  

### Android

  | Erorr Code | Value | Description |
  |------------|-------|-------------|
  | `DLR_SYSTEM_EXCEPTION` | 1 | System exception. |

### .Net

  | Erorr Code | Value | Description |
  |------------|-------|-------------|
  | `DLR_SYSTEM_EXCEPTION` | 1 | System exception. |
