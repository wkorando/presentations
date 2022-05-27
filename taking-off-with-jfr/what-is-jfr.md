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

* Event based diagnostic and profiling tool
* Extremely low overhead of <1%*
* Meant to be used continuously in production
* Covers both events happening in JVM and Java applications


\* When using default settings, YMMV when choosing different settings

VV
### JFR Under the Hood

Events produced by Java Runtime and Application<br/>
Stored in Memory in Thread Local Buffers<br/>
Can then be dumped to a .jfr file<br/>

VV
## JFR Events

Over 150 different events:

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

