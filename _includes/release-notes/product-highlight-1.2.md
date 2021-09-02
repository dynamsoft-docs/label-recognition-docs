

- Added timeout mechanism. DLR checks at a few points whether the elapsed time for the current image is longer than its value. If so, DLR will end the flow. Timeout prevents one image from costing too much time.

- Added parameters for lines filtering:
  - `LineStringLengthRange` is used to define the minimum and maximum string length when running the recognition process on a specific line.
  - `MaxLineCharacterSpacing` is used to control the spacing between characters treated as one line.

- Improved the regular expression parameter by supporting more [RegEx pattern syntaxes]({{ site.parameters-reference }}label-recognition-parameter/parameter-control.html#textregexpattern).

- Improved the recognition accuracy when dealing with skewed and italics characters.

- Improved the recognition accuracy for serif fonts.

