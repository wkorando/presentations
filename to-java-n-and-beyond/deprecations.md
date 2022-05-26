# Deprecations, Removal, and Other Changes

VV

## Deprecations

Security Manager <br/>
JDK 17<br/>
JEP 411<br/>
<br/>
Applet API<br/>
JDK 17<br/>
JEP 398<br/>
<br/>
Finalizers<br/>
JDK 18<br/>
JEP 421
VV
## Removal

Nashorn (JavaScript Engine)<br/>
JDK 15<br/>
JEP 372<br/>
<br/>
CMS Garbage Collector<br/>
JDK 14<br/>
JEP 363
VV
## Other Changes

Strongly Encapsulate JDK Internals<br/>
JDK 17<br/>
JEP 403<br/>
<br/>
No longer relax strong encapsulation with single argument (i.e. `--illegal-access=permit`)<br/>

Some critical internal APIs remain available: <br/>
```
sun.misc.{Signal,SignalHandler}

sun.misc.Unsafe (The functionality of many of the methods in this class is available via variable handles (JEP 193).)

sun.reflect.Reflection::getCallerClass(int) (The functionality of this method is available in the stack-walking API defined by JEP 259.)

sun.reflect.ReflectionFactory

com.sun.nio.file.{ExtendedCopyOption,ExtendedOpenOption, ExtendedWatchEventModifier,SensitivityWatchEventModifier}
```