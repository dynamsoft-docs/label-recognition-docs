---
layout: default-layout
title: MRZ Scanner (Android) Dynamsoft Label Recognizer
description: This is the page of Dynamsoft Label Recognizer Android MRZ Scanner sample.
keywords: MRZ Scanner, Android
needAutoGenerateSidebar: true
---

# MRZ Scanner Sample

MRZScanner sample shows you how to develop with Dynamsoft Label Recognizer to create a simple app to scan machine-readable zome (MRZ).

View the sample:

- <a href="https://github.com/Dynamsoft/label-recognizer-mobile-samples/tree/master/android/MRZScanner" target="_blank">MRZScanner (Android)</a>

In the MRZScanner sample, we include an additional library **MRZLib**, which is developed from Dynamsoft Label Recognizer. MRZ models or parameters are preset in the library. As a result, you don't need to add additional settings.

The following APIs are available in the MRZScanner sample

- `MRZRecognizer`: The class extended from `DynamsoftLabelRecognizer`.
- `MRZResult`: The class that stores MRZ result information. When using **MRZLib**, you can obtain `MRZResult` as the output of the library instead of `DLRResult`.
- `MRZResultListener`: The listener to handle callbacks when MRZ results are returned.

## How to use MRZLib

### Setup Camera Module

In this sample, we use Dynamsoft Camera Enhancer to set up the camera module and capture video frames.

```java
public class ScanFragment extends Fragment {
   private DCECameraView mCameraView;
   private CameraEnhancer mCamera;
   @Override
   public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
      mCameraView = view.findViewById(R.id.dce_camera_view);
      mCamera = new CameraEnhancer(requireActivity());
      mCamera.setCameraView(mCameraView);
   }
}
```

### Initialize MRZ Recognizer and Bind the Camera Module

Create an instance of `MRZRecognizer`. Use the method `setImageSource` to bind the `MRZRecognizer` and the camera module you created. After that, the instance of `MRZRecognizer` will be able to obtain video frames from the camera continuously.

```java
public class ScanFragment extends Fragment {
   ...
   private MRZRecognizer mMRZRecognizer;
   @Override
   public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
      ...
      try {
         mMRZRecognizer = new MRZRecognizer();
      } catch (LabelRecognizerException e) {
         e.printStackTrace();
      }
      // Use setImageSource to bind MRZRecognizer with the camera enhancer.
      // You can also implement the interface ImageSource by yourself.
      mMRZRecognizer.setImageSource(mCamera);
   }
}
```

### Obtain Results

Use `setMRZResultListener` to Register a `MRZResultListener`. Trigger `startScanning`. So that you can obtain the MRZ results from `mrzResultCallback`.

```java
public class ScanFragment extends Fragment {
   ...
   private MRZRecognizer mMRZRecognizer;
   @Override
   public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
      mMRZRecognizer.setMRZResultListener(new MRZResultListener() {
         @Override
         public void mrzResultCallback(int i, ImageData imageData, MRZResult mrzResult) {
            // Implement mrzResultCallback
         }
      });
}
```
