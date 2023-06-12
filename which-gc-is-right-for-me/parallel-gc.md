## Parallel GC

* Highest throughput
* Longer latency
* Fully STOW

VV
## Using Parallel GC

```
-XX:+UseParallelGC
```
VV
## Using Parallel GC

Key Configurations:

* `-XX:ParallelGCThreads`: Sets max threads for use during GC phase
* `-XX:MaxGCPauseMillis`: Sets *goal* for maximum pause time.
* `-XX:GCTimeRatio`: Sets *goal* for ratio spent between performing application work and performing GC work

VV

## Recent Changes
* Support for String Deduplication (JDK 18)
VV

## Future of Parallel GC

* In maintenance mode, bug fixes and small performance improvements