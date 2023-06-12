## G1 (Garbage-First) GC
* Default GC since JDK 9
* Tries to balance between; memory, latency, and throughput
* Highly configurable
* Partially concurrent

VV

## Using G1GC

```
-XX:+UseG1GC
```
VV
## Using G1GC

Key Configurations:

* `-Xmx`: Sets max heap space 
* `-XX:MaxGCPauseTimeMillis`: Sets *goal* for maximum pause time
* `-XX:GCPauseTimeInterval`: Sets *goal* for minimum time between pauses
* `-XX:ParallelGCThreads`: Sets max threads for use during GC phase
* `-XX:ConcGCThreads`: Sets max threads for use when in concurrent phase


VV

## Future of G1GC

* Region Pinning - [JEP 423](https://openjdk.org/jeps/423)