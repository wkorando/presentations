## What is JDK Flight Recorder? (JFR)
VV
### What is JFR?

* An event based diagnostic and profiling tool and framework built directly into the JDK
* Tracks events at both the JVM and application level 
* Extremely low overhead of <1%*
* Meant to be used continuously in production


\* When using default settings, YMMV when choosing different settings

VV

### JFR Under the Hood

<iframe width="560" height="315" src="https://www.youtube.com/embed/XEKkUpPnf4Q?si=ny_VAqzUlFsXo-kp" title="YouTube video player" frameborder="0" allow="accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture; web-share" referrerpolicy="strict-origin-when-cross-origin" allowfullscreen></iframe>

VV

## JFR Events

Over 190 different events (as of JDK 25):

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

