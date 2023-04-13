---
layout: default-layout
Title: CRecognizedTextLinesResult - Dynamsoft Label Recognizer Classes
Description: The class CRecognizedTextLinesResult of Dynamsoft Label Recognizer represents the result of a text recognition process.
Keywords: Recognized text lines result
needGenerateH3Content: true
needAutoGenerateSidebar: true
noTitleIndex: true
breadcrumbText: CRecognizedTextLinesResult
---

# CRecognizedTextLinesResult

The `CRecognizedTextLinesResult` class represents the result of a text recognition process. It provides access to information about the recognized text lines, the source image, and any errors that occurred during the recognition process.

```cpp
class dynamsoft::dlr::CRecognizedTextLinesResult
```

## Methods Summary

| Method               | Description |
|----------------------|-------------|
| [`GetSourceImageHashId`](#getsourceimagehashid) | Gets the hash ID of the source image. |
| [`GetSourceImageTag`](#getsourceimagetag) | Gets the tag of the source image. |
| [`GetCount`](#getcount) | Gets the number of text line result items in the recognition result. |
| [`GetItem`](#getitem) | Gets the text line result item at the specified index. |
| [`GetErrorCode`](#geterrorcode) | Gets the error code of the recognition result, if an error occurred. |
| [`GetErrorString`](#geterrorstring) | Gets the error message of the recognition result, if an error occurred. |

### GetSourceImageHashId

Gets the hash ID of the source image.

```cpp
virtual const char* GetSourceImageHashId() const = 0;
```

**Return value**

Returns a pointer to a null-terminated string containing the hash ID of the source image.

### GetSourceImageTag

Gets the tag of the source image.

```cpp
virtual const CImageTag* GetSourceImageTag() const = 0;
```

**Return value**

Returns a pointer to a CImageTag object representing the tag of the source image.

### GetCount

Gets the number of text line result items in the recognition result.

```cpp
virtual int GetCount() const = 0;
```

**Return value**

Returns the number of text line result items in the recognition result.

### GetItem

Gets the text line result item at the specified index.

```cpp
virtual const CTextLineResultItem* GetItem(int index) const = 0;
```

**Parameters**

`[in] index` The zero-based index of the text line result item to retrieve.

**Return value**

Returns a pointer to the CTextLineResultItem object at the specified index.

### GetErrorCode

Gets the error code of the recognition result, if an error occurred.

```cpp
virtual int GetErrorCode() const = 0;
```

**Return value**

Returns the error code of the recognition result, or 0 if no error occurred.

### GetErrorString

Gets the error message of the recognition result, if an error occurred.

```cpp
virtual const char* GetErrorString() const = 0;
```

**Return value**

Returns a pointer to a null-terminated string containing the error message of the recognition result, or a pointer to an empty string if no error occurred.
