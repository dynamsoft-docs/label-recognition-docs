---
layout: default-layout
title: Dynamsoft Label Recognizer Enumerations - Error Code
description: This article shows Error Code of Dynamsoft Label Recognizer.
keywords: error code, enumeration
needAutoGenerateSidebar: true
needGenerateH3Content: true
noTitleIndex: true
---

# Error Code  
   
## For all programming languages

  | Erorr Code (except ObjC/Swift) | Erorr Code (ObjC/Swift) | Value | Description |
  |--------------------------------|-------------------------|-------|-------------|
  | `DM_OK`                                | `EnumDMErrorCode_OK`                              | 0 | Successful. |
  | `DMERR_UNKNOWN`                        | `EnumDMErrorCode_Unknow`                          | -10000 | Unknown error. |
  | `DMERR_NO_MEMORY`                      | `EnumDMErrorCode_No_Memory`                       | -10001 | Not enough memory to perform the operation. |
  | `DMERR_NULL_POINTER`                   | `EnumDMErrorCode_Null_Pointer`                    | -10002 | Null pointer. |
  | `DMERR_LICENSE_INVALID`                | `EnumDMErrorCode_License_Invalid`                 | -10003 | The license is invalid. |
  | `DMERR_FILE_NOT_FOUND`                 | `EnumDMErrorCode_File_Not_Found`                  | -10004 | The file is not found. |
  | `DMERR_JSON_PARSE_FAILED`              | `EnumDMErrorCode_Json_Parse_Failed`               | -10005 | Failed to parse JSON string. |
  | `DMERR_JSON_TYPE_INVALID`              | `EnumDMErrorCode_Json_Type_Invalid`               | -10006 | The value type is invalid. |
  | `DMERR_JSON_KEY_INVALID`               | `EnumDMErrorCode_Json_Key_Invalid`                | -10007 | The key is invalid. |
  | `DMERR_JSON_VALUE_INVALID`             | `EnumDMErrorCode_Json_Value_Invalid`              | -10008 | The value is invalid or out of range. |
  | `DMERR_JSON_NAME_KEY_MISSING`          | `EnumDMErrorCode_Json_Name_Key_Missing`           | -10009 | The mandatory key "Name" is missing. |
  | `DMERR_JSON_NAME_VALUE_DUPLICATED`     | `EnumDMErrorCode_Json_Name_Value_Duplicated`      | -10010 | The value of the key "Name" is duplicated. |
  | `DMERR_PARAMETER_VALUE_INVALID`        | `EnumDMErrorCode_Parameter_Value_Invalid`         | -10011 | The parameter value is invalid or out of range. |
  | `DMERR_TEMPLATE_NAME_INVALID`          | `EnumDMErrorCode_Template_Name_Invalid`           | -10012 | The template name is invalid. |
  | `DMERR_LICENSE_EXPIRED`                | `EnumDMErrorCode_License_Expired`                 | -10013 | The license has expired. |
  | `DLRERR_CHARACTER_MODEL_FILE_NOT_FOUND` | `EnumDLRErrorCode_Character_Model_File_Not_Found`  | -10014 | The character model file is not found. |
  | `DMERR_SET_MODE_ARGUMENT_ERROR`        | `EnumDMErrorCode_Set_Mode_Argument_Error`         | -10015 | Failed to set mode's argument. |
  | `DMERR_GET_MODE_ARGUMENT_ERROR`        | `EnumDMErrorCode_Get_MODE_Argument_Error`         | -10016 | Failed to set mode's argument. |
  | `DMERR_TIFF_READ_FAILED`               | `EnumDMErrorCode_TIFF_Read_Failed`                | -10017 | Failed to read the TIFF image. |
  | `DMERR_PDF_READ_FAILED`                | `EnumDMErrorCode_PDF_Read_Failed`                 | -10021 | Failed to read the PDF image. |
  | `DMERR_PDF_DLL_MISSING`                | `EnumDMErrorCode_PDF_DLL_Missing`                 | -10022 | The PDF DLL is missing. |
  | `DLRERR_RECOGNITION_TIMEOUT`            | `EnumDLRErrorCode_Recognition_Timeout`             | -10026 | Recognition timeout. |
  | `DMERR_REQUESTED_FAILED`               | `EnumDMErrorCode_Requested_Failed`                | -10044 | Failed to request the license file. |
  | `DMERR_NO_LICENSE`                      | `EnumDMErrorCode_No_License`                      | -20000 | No license specified. |
  | `DMERR_HANDSHAKE_CODE_INVALID`          | `EnumDMErrorCode_Handshake_Code_Invalid`          | -20001 | The handshake code is invalid. |
  | `DMERR_LICENSE_BUFFER_FAILED`           | `EnumDMErrorCode_License_Buffer_Failed`           | -20002 | Failed to read or write license buffer. |
  | `DMERR_LICENSE_SYNC_FAILED`             | `EnumDMErrorCode_License_Sync_Failed`             | -20003 | Failed to synchronize license info with license tracking server. |
  | `DMERR_DEVICE_NOT_MATCH`                | `EnumDMErrorCode_Device_Not_Match`                | -20004 | Device does not match with license buffer. |
  | `DMERR_BIND_DEVICE_FAILED`              | `EnumDMErrorCode_Bind_Device_Failed`              | -20005 | Failed to bind device. |
  | `DMERR_LICENSE_INTERFACE_CONFLICT`      | `EnumDMErrorCode_License_Interface_Conflict`      | -20006 | Interface InitLicenseFromLTS can not be used together with other license initiation interfaces.|
  | `DMERR_LICENSE_CLIENT_DLL_MISSING`      | `EnumDMErrorCode_License_Client_DLL_Missing`      | -20007 | The license client dll is missing. |
  | `DMERR_INSTANCE_COUNT_OVER_LIMIT`       | `EnumDMErrorCode_Instance_Count_Over_Limit`       | -20008 | The number of instances used has exceeded the limit. |
  | `DMERR_LICENSE_INIT_SEQUENCE_FAILED`    | `EnumDMErrorCode_License_Init_Sequence_Failed`    | -20009 | Interface InitLicenseFromLTS has to be called before creating any SDK objects. |
  | `DMERR_TRIAL_LICENSE`                   | `EnumDMErrorCode_Trial_License`                   | -20010 | Using a trial license. |


## For specific programming languages  

### Android

  | Erorr Code | Value | Description |
  |------------|-------|-------------|
  | `DLR_SYSTEM_EXCEPTION` | 1 | System exception. |

### .Net

  | Erorr Code | Value | Description |
  |------------|-------|-------------|
  | `DLR_SYSTEM_EXCEPTION` | 1 | System exception. |
