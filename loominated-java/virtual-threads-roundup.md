## Virtual Threads Roundup

* Virtual threads aren't "faster" than platform threads
* Virtual threads are cheap, abundant, and ephemeral
	* Use a virtual thread per task/request/connection and dispose of it... **DO NOT POOL**
* Don't "replace" platform threads with virtual threads, refactor to using virtual threads for tasks
* In many cases, virtual threads are being used at the framework/library level (so it might be a simple property file change)
* You might run into new bottlenecks, consider using a Semaphore for arbitrary throttling.
* Support aleady good and will contuing improving for serviceability; `jcmd`, `JFR`, and other tools. Biggest "issue" would be scale. Tools designed for hundreds of threads, might struggle when working with thousands/millions. 

VV

## Virtual Threads Roundup - Issues

* Most issues have been resolved as of JDK 27
	*  JDK 24 - JEP 491, Synchronize without pinning
	*  JDK 26 - JDK-8371470, Class initialization locking

