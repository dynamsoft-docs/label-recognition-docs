---
layout: default-layout
Title: CLocalizedTextLineElement - Dynamsoft Label Recognizer Classes
Description: The class CLocalizedTextLineElement of Dynamsoft Label Recognizer represents a localized text line element.
Keywords: Localized text line element
needGenerateH3Content: true
needAutoGenerateSidebar: true
noTitleIndex: true
breadcrumbText: CLocalizedTextLineElement
---

# CLocalizedTextLineElement

The `CLocalizedTextLineElement` class represents a localized text line element. It inherits from the `CRegionObjectElement` class.

```cpp
class dynamsoft::dlr::intermediate_results::CLocalizedTextLineElement : public CRegionObjectElement
```

## Methods Summary

| Method               | Description |
|----------------------|-------------|
| [`GetCharacterQuadsCount`](#getcharacterquadscount) | Gets the number of character quads in the text line.|
| [`GetCharacterQuad`](#getcharacterquad) | Gets the quadrilateral of a specific character in the text line. |
| [`GetRowNumber`](#getrownumber) | Gets the row number of the text line. |

## Methods Details

### GetCharacterQuadsCount

Gets the number of character quads in the text line.

```cpp
int GetCharacterQuadsCount() const
```

**Return value**

Returns the number of character quads in the text line.

### GetCharacterQuad

Gets the quadrilateral of a specific character in the text line.

```cpp
int GetCharacterQuad(int index, CQuadrilateral* quad) const
```

**Parameters**

`[in] index` The index of the character.  
`[out] quad` The quadrilateral of the character.

**Return value**

Returns 0 if successful, otherwise returns a negative value.

### GetRowNumber

Gets the row number of the text line.

```cpp
int GetRowNumber() const
```

**Return value**

Returns the row number of the text line.
