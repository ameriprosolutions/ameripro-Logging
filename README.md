# ameripro-Logging
Wrapper of Android Util Logging


=========================

[![Hex.pm](https://img.shields.io/hexpm/l/plug.svg)](http://www.apache.org/licenses/LICENSE-2.0) [![Platform](https://img.shields.io/badge/platform-android-green.svg)](http://developer.android.com/index.html)

```ameripro-Logging``` is an android library acts as a wrapper for ```android.util.log```, mainly used for logging the debug, informational, error messages.

<br>

Features & Usage 
-----------------

- **logDebug:** ```logDebug``` method used to log the debug information using ```android.util.log``` library.
              
              LogFactory.getInstance().logDebug("Print Debug.");
              
              LogFactory.getInstance().logDebug("Print Debug.", exception);
              
              
- **logError:** ```logError``` method used to log the Error information using ```android.util.log``` library.

              LogFactory.getInstance().logError("Print Error.");
              
              LogFactory.getInstance().logError("Print Error.", exception);
              
              
- **logInfo:** ```logInfo``` method used to log the General information using ```android.util.log``` library.
               

              LogFactory.getInstance().logInfo("Print Info.");
              
              LogFactory.getInstance().logInfo("Print Info.", exception);
              
<br>

Gradle
------

To consume ameripro-Logging, a gradle plugin must be applied in your ```build.gradle```:
```
dependencies {
    ...
    compile 'com.github.ameriprosolutions:ameripro-Logging:a1.0'
}
```
<br>

WIKI
-----------------
For complete information, features and usage, refer to the [WIKI](https://github.com/ameriprosolutions/ameripro-Logging/wiki):
- [Consume Library](https://github.com/ameriprosolutions/ameripro-Logging/wiki/Consuming-Library)
- [Logging](https://github.com/ameriprosolutions/ameripro-Logging/wiki/Logging)
- [Release Notes](https://github.com/ameriprosolutions/ameripro-Logging/wiki/Release-Notes)

<br>

License
-----------------

    Copyright 2018 Ameripro Solutions

    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.


<a href="http://www.ameripro-solutions.com" target="_blank">
 <img src="http://ameripro-solutions.com/_include/img/logo.png" alt="IMAGE ALT TEXT HERE" width="200" height="120" border="10" />
</a>
              
