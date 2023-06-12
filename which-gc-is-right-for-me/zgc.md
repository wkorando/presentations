## ZGC

* Ultra-low Latency
* Massive scalability
* Almost entirely concurrent
* *Currently* single-generation

VV

## Using ZGC

```
-XX:+UseZGC
```
VV

## Using ZGC
Key Configurations:

* `-Xmx`: Sets max heap space (ideally double expected live set size)
* `-XX:ConcGCThreads`: Number of threads to use during the concurrent phase

VV	

## Future of ZGC

* Generational ZGC - [JEP 439](https://openjdk.org/jeps/439) (JDK 21)

Using Generation ZGC:

```
-XX:+UseZGC -XX:+ZGenerational
```

Expected performance:

4x throughput for same heap space

4x less memory for same throughput 
