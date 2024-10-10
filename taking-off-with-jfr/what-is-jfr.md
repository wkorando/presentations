## What is JDK Flight Recorder? (JFR)
VV
### What is JFR?

* Initially added in JDK 7 
    * Then called Java Flight Recorder
    * Goes back to JRockit
* Open sourced in JDK 11, renamed JDK Flight Recorder
* Built into the Java runtime 
VV

### What is JFR?

* Event based diagnostic and profiling framework
* Extremely low overhead of <1%*
* Meant to be used continuously in production
* Covers both events happening in JVM and Application(s) running on the JVM


\* When using default settings, YMMV when choosing different settings

VV

### JFR Under the Hood

<iframe width="560" height="315" src="https://www.youtube.com/embed/XEKkUpPnf4Q?si=ny_VAqzUlFsXo-kp" title="YouTube video player" frameborder="0" allow="accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture; web-share" referrerpolicy="strict-origin-when-cross-origin" allowfullscreen></iframe>

VV

## JFR Events

Over 180 different events:

```
jdk.SystemProcess                         
jdk.ActiveSetting                         
jdk.GarbageCollection                     
jdk.GCPhasePause                                       
jdk.EvacuationFailed                      
jdk.ThreadStart                           
jdk.ThreadDump                            
jdk.GCConfiguration                                             
jdk.FileRead                              
jdk.FileWrite                             
jdk.SocketRead                            
jdk.SocketWrite                           
```

