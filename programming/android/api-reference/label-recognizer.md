---
layout: default-layout
title: Dynamsoft Label Recognizer Android API Reference - LabelRecognizer Class
description: This page shows LabelRecognizer methods of Dynamsoft Label Recognizer for Android API Reference.
keywords: api reference, android
needAutoGenerateSidebar: true
needGenerateH3Content: true
noTitleIndex: true
---

# class LabelRecognizer

```java
class com.dynamsoft.dlr.LabelRecognizer
```  

## Initialization Methods Summary
  
  | Method               | Description |
  |----------------------|-------------|
  | [`LabelRecognizer`](#labelrecognizer) | Initialization of `LabelRecognizer` object.|

## Settings Methods Summary

  | Method               | Description |
  |----------------------|-------------|
  | [`appendCharacterModelBuffer`](#appendcharactermodelbuffer) | Appends CharacterModel to the SDK object. |
  | [`getRuntimeSettings`](#getruntimesettings) | Gets the current settings and saves it into a struct. |
  | [`updateRuntimeSettings`](#updateruntimesettings) | Updates runtime settings with a given struct. |
  | [`resetRuntimeSettings`](#resetruntimesettings) | Resets the runtime settings. |
  | [`initRuntimeSettings`](#initruntimesettings) |  Initializes a new setting to the current label recognizer instance via template string. |
  | [`initRuntimeSettingsFromFile`](#initruntimesettingsfromfile) |  Initializes a new setting to the current label recognizer instance via template file. |
  | [`outputRuntimeSettings`](#outputruntimesettings) | Clear all appended LabelRecognizerParameter settings in the SDK object. |
  | [`outputRuntimeSettingsToFile`](#outputruntimesettingstofile) | Outputs LabelRecognizerParameter settings into a file (JSON file). |
  | [`updateReferenceRegionFromBarcodeResults`](#updatereferenceregionfrombarcoderesults) | Updates reference region which is defined with source type LST_BARCODE. |
  | [`getModeArgument`](#getmodeargument) | Get argument value for the specified mode parameter. |
  | [`setModeArgument`](#setmodeargument) | Set argument value for the specified mode parameter. |

## Recognizing Methods Summary

  | Method               | Description |
  |----------------------|-------------|
  | [`recognizeBuffer`](#recognizebuffer) | Recognizes text from memory buffer containing image pixels in defined format. |
  | [`recognizeFile`](#recognizefile) | Recognizes text from a specified image file. |
  | [`recognizeImage`](#recognizeimage) | Recognizes text from a bitmap. |
  | [`recognizeFileInMemory`](#recognizefileinmemory) | Recognizes text from an image file in memory. |

## Video Recognizing Methods Summary

  | Method | Description |
  |--------|-------------|
  | [`setImageSource`](#setimagesource) | Bind an instance of ImageSource to the Label Recognizer.  |
  | [`startScanning`](#startscanning) | Start the label recognizing thread in the video streaming scenario. |
  | [`stopScanning`](#stopscanning) | Stop the label recognizing thread in the video streaming scenario. |
  | [`setLabelResultListener`](#setlabelresultlistener) | Set callback interface to process recognized label results generated during frame processing. |

## General Methods Summary

  | Method               | Description |
  |----------------------|-------------|
  | [`getVersion`](#getversion) | Returns the version number string for the SDK. |

## Initialization Methods Details

### LabelRecognizer

Initialization of `LabelRecognizer` object.

```java
LabelRecognizer() throws LabelRecognizerException
```

**Exceptions**

[`LabelRecognizerException`](label-recognizer-exception.md)

**Code Snippet**

```java
LabelRecognizer recognizer = new LabelRecognizer();
```

## Settings Methods Details

### appendCharacterModelBuffer

Appends CharacterModel into memory.

```java
static void appendCharacterModelBuffer (String name, byte[] prototxtBuffer, byte[] txtBuffer, byte[] characterModelBuffer)
```

**Parameters**

`[in] name` A unique name for the appended CharacterModel.  
`[in] prototxtBuffer` The .prototxt file data of the CharacterModel in a byte array.  
`[in] txtBuffer` The .txt file data of the CharacterModel in a byte array.  
`[in] characterModelBuffer` The .caffemodel file data of the CharacterModel in a byte array.  

**Code Snippet**

```java
AssetManager manager = getAssets();
InputStream isPrototxt = manager.open("CharacterModel/NumberLetter.prototxt");
byte[] prototxt = new byte[isPrototxt.available()];
isPrototxt.read(prototxt);
isPrototxt.close();
InputStream isCharacterModel = manager.open("CharacterModel/NumberLetter.caffemodel");
byte[] characterModel = new byte[isCharacterModel.available()];
isCharacterModel.read(characterModel);
isCharacterModel.close();
InputStream isTxt = manager.open("CharacterModel/NumberLetter.txt");
byte[] txt = new byte[isTxt.available()];
isTxt.read(txt);
isTxt.close();

LabelRecognizer.appendCharacterModelBuffer("NumberLetter", prototxt, txt, characterModel);
```

&nbsp;

### getRuntimeSettings

Get current runtime settings and save them into a [`DLRRuntimeSettings`](dlr-runtime-settings.html) object.

```java
DLRRuntimeSettings getRuntimeSettings () throws LabelRecognizerException
```

**Return value**

An object of [`DLRRuntimeSettings`](dlr-runtime-settings.html) stores the current runtime settings.

**Exceptions**

[`LabelRecognizerException`](label-recognizer-exception.md)

**Code Snippet**

```java
LabelRecognizer recognizer = new LabelRecognizer();
DLRRuntimeSettings settings = recognizer.getRuntimeSettings();
```

&nbsp;

### updateRuntimeSettings

Update runtime settings with a given [`DLRRuntimeSettings`](dlr-runtime-settings.html) object.

```java
void updateRuntimeSettings (DLRRuntimeSettings settings) throws LabelRecognizerException
```

**Parameters**

`[in] settings` The class object of template settings. See also [`DLRRuntimeSettings`](dlr-runtime-settings.html)

**Exceptions**

[`LabelRecognizerException`](label-recognizer-exception.md)

**Code Snippet**

```java
LabelRecognizer recognizer = new LabelRecognizer();

DLRRuntimeSettings settings = recognizer.getRuntimeSettings();
settings.maxThreadCount = 1;
recognizer.updateRuntimeSettings(settings);
```

&nbsp;

### resetRuntimeSettings

Reset all runtime settings to default values.

```java
void resetRuntimeSettings () throws LabelRecognizerException
```

**Exceptions**

[`LabelRecognizerException`](label-recognizer-exception.md)

**Code Snippet**

```java
LabelRecognizer recognizer = new LabelRecognizer();

DLRRuntimeSettings settings = recognizer.getRuntimeSettings();
settings.maxThreadCount = 4;
recognizer.updateRuntimeSettings(settings);
recognizer.resetRuntimeSettings();
```

&nbsp;

### initRuntimeSettings

Initializes a new setting to the current label recognizer instance via template file.

```java
void initRuntimeSettings(String content) throws LabelRecognizerException
```

**Parameters**

`[in] content` A JSON string that represents the content of the settings.

**Exceptions**

[`LabelRecognizerException`](label-recognizer-exception.md)

**Code Snippet**

```java
LabelRecognizer recognizer = new LabelRecognizer();
recognizer.initRuntimeSettings("{\"LabelRecognizerParameter\":{\"Name\":\"P1\", \"RegionPredetectionModes\":[{\"Mode\":\"RPM_GENERAL_HSV_CONTRAST\"}], \"ReferenceRegionNameArray\": [\"R1\"]},\"ReferenceRegion\":{\"Name\":\"R1\",\"Localization\":{\"SourceType\":\"LST_PREDETECTED_REGION\",\"RegionPredetectionModesIndex\":0},\"TextAreaNameArray\":[\"T1\"]},\"TextArea\":{\"Name\":\"T1\",\"CharacterModelName\":\"Number\"}}");
```

&nbsp;

### initRuntimeSettingsFromFile

Initializes a new setting to the current label recognizer instance via template file.

```java
void initRuntimeSettingsFromFile(String filePath) throws LabelRecognizerException
```

**Parameters**

`[in] filePath` The settings file path.

**Exceptions**

[`LabelRecognizerException`](label-recognizer-exception.md)

**Code Snippet**

```java
LabelRecognizer recognizer = new LabelRecognizer();
recognizer.initRuntimeSettingsFromFile("your file path");
```

&nbsp;

### outputRuntimeSettingsToFile

Outputs runtime settings and save them into a settings file (JSON file).  

```java
void outputRuntimeSettingsToFile (String filePath, String templateName) throws LabelRecognizerException
```

**Parameters**

`[in] filePath` The path of the output file which stores current settings.  
`[in] templateName` A unique name for declaring current runtime settings.  

**Exceptions**

[`LabelRecognizerException`](label-recognizer-exception.md)

**Code Snippet**

```java
LabelRecognizer recognizer = new LabelRecognizer();

recognizer.initRuntimeSettings("{\"LabelRecognizerParameter\":{\"Name\":\"P1\", \"RegionPredetectionModes\":[{\"Mode\":\"RPM_GENERAL_HSV_CONTRAST\"}], \"ReferenceRegionNameArray\": [\"R1\"]},\"ReferenceRegion\":{\"Name\":\"R1\",\"Localization\":{\"SourceType\":\"LST_PREDETECTED_REGION\",\"RegionPredetectionModesIndex\":0},\"TextAreaNameArray\":[\"T1\"]},\"TextArea\":{\"Name\":\"T1\",\"CharacterModelName\":\"Number\"}}");
recognizer.outputRuntimeSettingsToFile("your saving file path", "P1");
```

&nbsp;

### outputRuntimeSettings

Outputs runtime settings and save them into a string.  

```java
String outputRuntimeSettings (String templateName) throws LabelRecognizerException
```

**Parameters**

`[in] templateName` A unique name for declaring current runtime settings.  

**Exceptions**

[`LabelRecognizerException`](label-recognizer-exception.md)

**Code Snippet**

```java
LabelRecognizer recognizer = new LabelRecognizer();

recognizer.initRuntimeSettings("{\"LabelRecognizerParameter\":{\"Name\":\"P1\", \"RegionPredetectionModes\":[{\"Mode\":\"RPM_GENERAL_HSV_CONTRAST\"}], \"ReferenceRegionNameArray\": [\"R1\"]},\"ReferenceRegion\":{\"Name\":\"R1\",\"Localization\":{\"SourceType\":\"LST_PREDETECTED_REGION\",\"RegionPredetectionModesIndex\":0},\"TextAreaNameArray\":[\"T1\"]},\"TextArea\":{\"Name\":\"T1\",\"CharacterModelName\":\"Number\"}}");
String settingsStr = recognizer.outputRuntimeSettings("P1");
```

&nbsp;

### getModeArgument

Get argument value for the specified mode parameter.

```java
String getModeArgument(String modesName, int index, String argumentName) throws LabelRecognizerException 
```

**Parameters**
  
`[in] modesName` The mode parameter name to get argument.  
`[in] index` The array index of mode parameter to indicate a specific mode.  
`[in] argumentName` The name of the argument to get.

**Return value**

the optional argument for a specified mode in Modes parameters.

**Exceptions**

[`LabelRecognizerException`](label-recognizer-exception.md)

**Remark**

Check follow link for available modes and arguments:

- [`RegionPredetectionModes`]({{ site.parameters-reference }}label-recognition-parameter/region-predetection-modes.html#regionpredetectionmodes)

**Code Snippet**

```java
LabelRecognizer recognizer = new LabelRecognizer();

DLRRuntimeSettings settings = recognizer.getRuntimeSettings();
settings.furtherModes.regionPredetectionModes[0] = EnumRegionPredetectionMode.RPM_GENERAL_RGB_CONTRAST;
recognizer.updateRuntimeSettings(settings);
recognizer.setModeArgument("RegionPredetectionModes", 0, "AspectRatioRange", "100");
String argumentValue = recognizer.getModeArgument("RegionPredetectionModes", 0, "AspectRatioRange");
```

&nbsp;

### setModeArgument

Set argument value for the specified mode parameter.

```java
void setModeArgument(String modesName, int index, String argumentName, String argumentValue) throws LabelRecognizerException 
```

**Parameters**

`[in] modesName` The mode parameter name to set argument.  
`[in] index` The array index of mode parameter to indicate a specific mode.  
`[in] argumentName` The name of the argument to set.  
`[in] argumentValue` The value of the argument to set.

**Exceptions**

[`LabelRecognizerException`](label-recognizer-exception.md)

**Remark**

Check follow link for available modes and arguments:

- [`RegionPredetectionModes`]({{ site.parameters-reference }}label-recognition-parameter/region-predetection-modes.html#regionpredetectionmodes)

**Code Snippet**

```java
LabelRecognizer recognizer = new LabelRecognizer();

DLRRuntimeSettings settings = recognizer.getRuntimeSettings();
settings.furtherModes.regionPredetectionModes[0] = EnumRegionPredetectionMode.RPM_GENERAL_RGB_CONTRAST;
recognizer.updateRuntimeSettings(settings);
recognizer.setModeArgument("RegionPredetectionModes", 0, "AspectRatioRange", "100");
```

&nbsp;

### updateReferenceRegionFromBarcodeResults

Updates reference region which is defined with source type LST_BARCODE.  

```java
void updateReferenceRegionFromBarcodeResults (BarcodeResult[] barcodeResults, String templateName) throws LabelRecognizerException
```

**Parameters**

`[in] barcodeResults` The barcode results used to localize reference region.  See also [`BarcodeResult`](barcode-result.md).  
`[in] templateName` The template name. A template name is the value of key LabelRecognizerParameter.Name defined in JSON formatted settings. If no template name is specified, current runtime settings will be used.

**Exceptions**

[`LabelRecognizerException`](label-recognizer-exception.md)

**Code Snippet**

```java
LabelRecognizer recognizer = new LabelRecognizer();

recognizer.initRuntimeSettings("{\"LabelRecognizerParameter\":{\"Name\":\"P1\", \"RegionPredetectionModes\":[{\"Mode\":\"RPM_GENERAL_HSV_CONTRAST\"}], \"ReferenceRegionNameArray\": [\"R1\"]},\"ReferenceRegion\":{\"Name\":\"R1\",\"Localization\":{\"SourceType\":\"LST_BARCODE\"},\"TextAreaNameArray\":[\"T1\"]},\"TextArea\":{\"Name\":\"T1\",\"CharacterModelName\":\"Number\"}}");
//Get barcodeResults from Dynamsoft Barcode Reader SDK
recognizer.updateReferenceRegionFromBarcodeResults(barcodeResults, "P1");
```

&nbsp;

## Recognizing Methods Details

### recognizeBuffer

Recognizes text from the memory buffer containing image pixels in defined format.

```java
DLRResult[] recognizeBuffer(ImageData imageData) throws LabelRecognizerException
```

**Parameters**

`[in] imageData` An object of [`ImageData`](image-data.md) that represents an image.  

**Return value**

All results recognized successfully.

**Exceptions**

[`LabelRecognizerException`](label-recognizer-exception.md)

**Code Snippet**

```java
LabelRecognizer recognizer = new LabelRecognizer();
//Generate imageData from somewhere else
DLRResult[] result = recognizer.recognizeBuffer(imageData);
```

&nbsp;

### recognizeFile

Recognizes text from a specified image file.

```java
DLRResult[] recognizeFile(String fileName) throws LabelRecognizerException 
```

**Parameters**

`[in] fileName` A string defining the file name.  

**Return value**

All results recognized successfully.

**Exceptions**

[`LabelRecognizerException`](label-recognizer-exception.md)

**Code Snippet**

```java
LabelRecognizer recognizer = new LabelRecognizer();
DLRResult[] result = recognizer.recognizeFile("full file path");
```

&nbsp;

### recognizeImage

Recognizes text from a bitmap.

```java
DLRResult[] recognizeByImage (Bitmap image) throws LabelRecognizerException 
```

**Parameters**

`[in] image` A bitmap image.  

**Return value**

All results recognized successfully.

**Exceptions**

[`LabelRecognizerException`](label-recognizer-exception.md)

**Code Snippet**

```java
LabelRecognizer recognizer = new LabelRecognizer();
Bitmap img = BitmapFactory.decodeFile("full file path");
DLRResult[] result = recognizer.recognizeImage(img);
```

### RecognizeFileInMemory

Recognizes text from a specified image file in memory.

```java
DLRResult[] RecognizeFileInMemory(byte[] fileBytes) throws LabelRecognizerException
```  

**Parameters**

`[in] fileBytes` The image file bytes in memory.  

**Return value**

All results recognized successfully.

**Exceptions**

[`LabelRecognizerException`](label-recognizer-exception.md)

**Code Snippet**

```java
LabelRecognizer recognizer = new LabelRecognizer();
// user code: read from an image into fileBytes 
byte[] fileBytes = null;
DLRResult[] result = recognizer.recognizeFileInMemory(fileBytes);
```

## Video Recognizing Methods Details

### setImageSource

Sets an instance of ImageSource to get images. `CameraEnhancer` is a specific implementation of ImageSource, which can help the Label Recognizer to acquire video frames continuously for recognition.

```java
void setImageSource(ImageSource source)
```

**Parameters**

`[in] source`: An instance of ImageSource. If you are using `Dynamsoft Camera Enhancer`(DCE) to capture camera frames, pass an instance of `CameraEnhancer`.

**Code Snippet**

This code snippet displays a complete code on how to add CameraEnhancer to your project and start detecting and get detection results from the video streaming.

```java
LabelRecognizer recognizer;
CameraEnhancer mCameraEnhancer;

@Override
protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    // Be sure that you have added a cameraView in the layout file.
    DCECameraView cameraView = findViewById(R.id.cameraView);

    try {
        // Create an instance of Dynamsoft Label recognizer.
        recognizer = new  LabelRecognizer();
    } catch (LabelRecognizerException e) {
        e.printStackTrace();
    }
    mCameraEnhancer = new CameraEnhancer(MainActivity.this);
    mCameraEnhancer.setCameraView(cameraView);

    // Bind the Camera Enhancer instance to the Label recognizer instance.
    recognizer.setImageSource(mCameraEnhancer);

    // Result callback configurations
    LabelResultListener mLabelResultListener = new LabelResultListener() {
        // Obtain the recognized label results and display.
        @Override
        public void labelResultCallback(int id, ImageData imageData, DLRResult[] labelResults) {
            // Add your code to execute when label results are returned.
        }
    };

    recognizer.setLabelResultListener(mLabelResultListener);
}

@Override
public void onResume() {
    // Open the camera and start video label recognition 
    try {
        mCameraEnhancer.open();
    } catch (CameraEnhancerException e) {
        e.printStackTrace();
    }
    recognizer.startScanning();
    super.onResume();
}

@Override
public void onPause() {
    // Stop video label recognition 
    try {
        mCameraEnhancer.close();
    } catch (CameraEnhancerException e) {
        e.printStackTrace();
    }
    recognizer.stopScanning();
    super.onPause();
}
```

## startScanning

Start the label recognition thread in the video streaming scenario. Please be sure that you have bound an object of `ImageSource` before you trigger `startScanning`.

```java
void startScanning()
```

**Code Snippet**

You can view the complete code snippet in [`setImageSource`](#setimagesource).

## stopScanning

Stop the label recognition thread in the video streaming scenario.

```java
void stopScanning()
```

**Code Snippet**

You can view the complete code snippet in [`setImageSource`](#setimagesource).

## setLabelResultListener

Set the callback interface to process recongnized label results generated during frame processing.

```java
void setLabelResultListener(LabelResultListener labelResultListener)
```

**Parameters**

`[in] labelResultListener`: The Callback interface.

**Code Snippet**

You can view the complete code snippet in [`setImageSource`](#setimagesource).

## General Methods Details

### getVersion

Get version information of SDK.

```java
static String getVersion()
```

**Return value**

The version information string.

**Code Snippet**

```java
String versionInfo = LabelRecognizer.getVersion();
```
