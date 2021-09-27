## Initialization Control

The following static methods and properties help to set up the runtime environment for the library.

| API Name | Description |
|---|---|
| [engineResourcePath](#engineresourcepath) | Specifies the path from where the recognition engine and models, etc. can be loaded. |
| [loadWasm()](#loadwasm) | Loads the recognition engine and models. |
| [isWasmLoaded()](#iswasmloaded) | Returns whether the recognition engine and models have been loaded. |
| [version](#version) | Returns the version of the library. |
| [detectEnvironment()](#detectenvironment) | Assess the running environment regarding the features the library requires to run. |