## Runtime Features and Tools

VV

## CDS Updates
JDK 12<br/>
Default CDS Archive: JEP 341<br/>
<br/>
JDK 13 <br/>
Dynamic CDS Archive: JEP 350 <br/>
<br/>
JDK 19 <br/>
Autogenerate CDS archive <br/>

VV

## AppCDS

```
java -XX:+AutoCreateSharedArchive -XX:SharedArchiveFile=foo.jsa <application> 
```
VV

## Project Leyden


JDK 24 <br/>
Ahead-of-Time Class Loading & Linking: JEP 483

VV

## Ahead-of-Time Class Loading & Linking


```
$ java -XX:AOTMode=record -XX:AOTConfiguration=app.aotconf <appliction>

$ java -XX:AOTMode=create -XX:AOTConfiguration=app.aotconf -XX:AOTCache=app.aot  <appliction>

$ java -XX:AOTCache=app.aot  <appliction>

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

Added in JDK 21 <br/>
JEP 439
<br/>
Only option strarting JDK 24: <br/>
JEP 490 <br/>
Get Started:

```
-XX:+UseZGC 
```

VV

## G1 Updates

Region Pinning added in JDK 22 <br/>
JEP 423 <br/>
Important for native memory work.
<br/>
<br/>
Late Barrier Expansion for the G1 added in JDK 24 <br/>
JEP 475 <br/>
Reduces overhead for C2 compiler

VV

## Launch Multi-File Source-Code Programs

JDK 22 <br/>
JEP 458

