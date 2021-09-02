

- Added image processing modes to enhance the usage scenarios like MRZ reading: 
  - Texture area detection
  - Color Conversion
  - Binarization
  - Grayscale image processing
	
- Added dictionary-based correction. The dictionary is minimal and customizable to only cover a scenario-oriented vocabulary.
	
- Improved the overall performance by replacing Caffe engine with OpenCV dnn engine
	
- Improved the readability of recognizing skewed characters.
	
- Improved the MRZ reading performance.
	
- Added a `core` library. Migrated the core structs/classes from the LabelRecognizer library to the `core` library.

