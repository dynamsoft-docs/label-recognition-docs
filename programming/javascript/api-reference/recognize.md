
### Recognize Labels from Still Images

| API Name | Description |
|---|---|
| [recognize()](#recognize) | Decodes labels from an image. |
| [recognizeBase64String()](#recognizebase64string) | Decodes labels from a base64-encoded image (with or without MIME). |
| [recognizeUrl()](#recognizeurl) | Decodes labels from an image specified by its URL. |
| [recognizeBuffer()](#recognizebuffer) | Decodes labels from raw image data. |

### Recognize Labels from Video Frames

| API Name | Description |
|---|---|
| [onUnduplicatedRead](#onunduplicatedread) | This event is triggered when a new, unduplicated label is found. |
| [onFrameRead](#onframeread) | This event is triggered after the library finishes scanning a frame. |
| [recognizeCurrentFrame()](#recognizecurrentframe) | Scans the current frame of the video for labels. |