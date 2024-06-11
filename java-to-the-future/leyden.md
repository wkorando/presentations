# Project Leyden

vv
## Project Leyden

Improve the start-up, time to peak performance, and reduce footprint, for the JVM by time shifting work (i.e. pre-compute information with training runs). 

vv

## CDS

Now "Cache Data Storage" (previously Class Data Sharing), the central feature Leyden is built around. Will allow storing of computed data from training runs. 

vv

## Key CDS Enhancements

* Unified Cache Data Storage: Allows the storing of profiling data, heap objects, and other "leyden" data.
* Loaded Classes: Allows the storing of classes in a "loaded" state.
* Method Profiles: Storage of method profiles from training runs, to give to the JIT
* AOT Resolution of Constant Pool: Resolve constant pools ahead-of-time, also important for other AOT behavior.
* AOT Compilation of Java Methods: Store native compilation of Java methods ahead of time 
* AOT Generation of Proxies: Generate and store proxies ahead of time. Frequently used by frameworks. 
* Class Loader Lookup Cache: Store in a cache classes looked up with `Class.getName()`

vv

## Next Steps

* [Project Leyden OpenJDK](https://openjdk.org/projects/leyden/)
* [Dev mailing list](https://mail.openjdk.org/mailman/listinfo/loom-dev)
* [State of Project Loom](https://www.youtube.com/watch?v=KG24inClY2M)
