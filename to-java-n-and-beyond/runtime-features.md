## New Runtime Features and Improvements
VV
## CDS Updates
JDK 12<br/>
Default CDS Archive: JEP 341<br/>
<br/>
JDK 13 <br/>
Dynamic CDS Archive: JEP 350

VV

### AppCDS

```
java -XX:ArchiveClassesAtExit=dynamic-archive.jsa -jar <application>

java -XX:SharedArchiveFile=dynamic-archive.jsa  -jar <application>
```
VV
## ZGC
* JDK 15 
* JEP 377
* (Ultra-)Low Latency (<1 ms pause times)
* Scalable (multi-terabyte heaps)
* Single generation, planned to become multi-generation soon
* Get started: -XX:+UseZGC -Xmx<size> -Xlog:gc

Video: [https://www.youtube.com/watch?v=OcfvBoyTvA8](https://www.youtube.com/watch?v=OcfvBoyTvA8)

VV

## Helpful Null Pointer Exceptions
JDK 14 <br/>
JEP 358
VV

### Helpful Null Pointer Exceptions

```java
public class SampleApplication {
	record MyRec(int x ) {}
	MyRec myRec = null;
	
	public void processRecords() {
		myRec.x();
	}
}
```

#### Old
```
Exception in thread "main" java.lang.NullPointerException
	at com.oracle.sip.SampleApplication.processRecords(SampleApplication.java:14)
	at com.oracle.sip.SampleApplication.main(SampleApplication.java:9)
```

#### New
```
Exception in thread "main" java.lang.NullPointerException: Cannot invoke "com.oracle.sip.SampleApplication$MyRec.x()" because "this.myRec" is null
	at com.oracle.sip.SampleApplication.processRecords(SampleApplication.java:14)
	at com.oracle.sip.SampleApplication.main(SampleApplication.java:9)
```
VV

## AArch64 Support

* Linux JDK 9 (JEP 237)
* Windows JDK 16 (JEP 388)
* macOS JDK 17 (JEP 391)

VV

## Performance Improvements