## Runtime Features and Tools

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
Only option starting JDK 24: <br/>
JEP 490 <br/>
Get Started:

```
-XX:+UseZGC 
```

VV

## G1 Updates

Region Pinning added in JDK 22 <br/>
JEP 423 <br/>
Important when accessing native memory.
<br/>
<br/>
Late Barrier Expansion for the G1 added in JDK 24 <br/>
JEP 475 <br/>
Reduces overhead for C2 compiler <br/> <br/>
JEP 522 <br/>
Improves throughput by reducing sync points

VV

## Launch Multi-File Source-Code Programs

JDK 22 <br/>
JEP 458

VV

```
$ java Main.java

import model.Person;
import service.PersonService;

public class Main{
	void main(){
		PersonService service = new PersonService();
		Person person = service.createNewPerson();
		IO.println(person.printName() + " has been created!");
	}
}

Main.java
\ model
| Person.java 
\ service
| PersonService.java


```

VV

## Project Leyden/<br/>Ahead-of-Time Computation


JDK 24 <br/>
Ahead-of-Time Class Loading & Linking: JEP 483 <br/>

JDK 25 <br/>
Ahead-of-Time Command-Line Ergonomics: JEP 514 <br/>
Ahead-of-Time Method Profiling: JEP 515 <br/>

JDK 26 <br/>
Ahead-of-Time Ojbect Caching with any GC: JEP 516 <br/>


VV

## Using Project Leyden Features


```
$ java -XX:AOTCacheOutput=app.aot <appliction>

$ java -XX:AOTCache=app.aot  <appliction>

```
VV

## Compact Object Headers

JDK 25 <br/>
Compact Object Headers: JEP 519 <br/>

```
$ java -XX:+UseCompactObjectHeaders ...
```

* Modest reduction in heap ~10% 
* Modest throughput REGRESSION ~10%
* Modest GC pressure reduction (i.e. lower latency) ~10%

VV

## JFR Updates

JDK 25 <br/>
JFR Method Timing & Tracing: JEP 520 <br/>
JFR Cooperative Sampling: JEP 518 <br/>

