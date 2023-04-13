---
layout: default-layout
Title: CRecognizedTextLinesUnit - Dynamsoft Label Recognizer Classes
Description: The class CRecognizedTextLinesUnit of Dynamsoft Label Recognizer represents an intermediate result unit containing recognized text lines.
Keywords: Recognized text lines unit
needGenerateH3Content: true
needAutoGenerateSidebar: true
noTitleIndex: true
breadcrumbText: CRecognizedTextLinesUnit
---

# CRecognizedTextLinesUnit

The `CRecognizedTextLinesUnit` class represents an intermediate result unit containing recognized text lines. It inherits from the `CIntermediateResultUnit` class.

```cpp
class dynamsoft::dlr::intermediate_results::CRecognizedTextLinesUnit : public CIntermediateResultUnit
```

## Methods Summary

| Method               | Description |
|----------------------|-------------|
| [`GetCount`](#getcount) | Gets the number of recognized text lines in the unit.|
| [`GetRecognizedTextLine`](#getrecognizedtextline) | Gets a pointer to the CRecognizedTextLineElement object at the specified index. |

### GetCount

Gets the number of recognized text lines in the unit.

```cpp
virtual int GetCount() const = 0;
```

**Return value**

Returns the number of recognized text lines in the unit.

### GetRecognizedTextLine

Gets a pointer to the CRecognizedTextLineElement object at the specified index.

```cpp
virtual const CRecognizedTextLineElement* GetRecognizedTextLine(int index) const = 0;
```

**Parameters**

`[in] index` The index of the desired CRecognizedTextLineElement object.

**Return value**

Returns a pointer to the CRecognizedTextLineElement object at the specified index.
