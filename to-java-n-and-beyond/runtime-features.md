## Runtime Features and Tools

VV

### CDS Updates
JDK 12<br/>
Default CDS Archive: JEP 341<br/>
<br/>
JDK 13 <br/>
Dynamic CDS Archive: JEP 350 <br/>
<br/>
JDK 19 <br/>
Autogenerate CDS archive <br/>

VV

### AppCDS

```
java -XX:+AutoCreateSharedArchive -XX:SharedArchiveFile=foo.jsa <application> 
```
VV

## Simple Web Server

JDK 18 <br/>
JEP 408 <br/>
Get Started:

```
jwebserver
```


VV

## Generational ZGC 

JDK 21 <br/>
JEP 439
<br/>
Default option in JDK 23: <br/>
JEP 474 <br/>
Get Started:

```
-XX:+UseZGC -XX:+ZGenerational
```

VV

## Region Pinning for G1

JDK 22 <br/>
JEP 423
<br/>

VV

## Launch Multi-File Source-Code Programs

JDK 22 <br/>
JEP 458

