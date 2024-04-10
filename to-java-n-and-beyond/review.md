## Key Changes in JDK 11 - 17

VV

## Text Blocks
Added in Java 15 <br/>
JEP 378
VV

### Text Blocks

```java
String simpleJSONMessage = """
		{
		        "firstName": "Billy",
		        "lastName": "Korando",
		        "jobTitle": "Java Developer Advocate",
		        "twitterHandle": "@BillyKorando"
		}
		""";
```
VV

## Switch Updates
Added in Java 14 <br/>
JEP 361
VV

### Switch Updates

```java
switch(d){
	case 1 -> System.out.println("Sunday");
	case 2 -> System.out.println("Monday");
	case 3 -> System.out.println("Tuesday");
	case 4 -> System.out.println("Wednesday");
	case 5 -> System.out.println("Thursday");
	case 6 -> System.out.println("Friday");
	case 7 -> System.out.println("Saturday");
}
```

VV

### Switch Updates

```java
String day = switch(d){
	case 1 -> "Sunday";
	case 2 -> "Monday";
	case 3 -> "Tuesday";
	case 4 -> "Wednesday";
	case 5 -> "Thursday";
	case 6 -> "Friday";
	case 7 -> "Saturday";
	default -> throw new IllegalArgumentException();
}
```
VV

## Sealed Classes
Added in Java 17<br/>
JEP 409
VV

### Sealed Classes

```java
public abstract sealed class User 
permits Admin, Customer, Guest{

}
```

```java
public non-sealed class Customer extends User {

}
```

```java
public final class Guest extends User {

}
```

```java
public sealed class Admin 
extends User {
	public final class NormalAdmin extends Admin {
	}
	public final class SuperAdmin extends Admin {
	}
}
```

VV

## Records 
Added in Java 16 <br/>
JEP 395
VV

### Records

```java
	record Person(String firstName, String lastName, String title, String twitterHandle) {}
```


* Transparent modeling of data as data
* Superclass always `java.lang.Record`
* Cannot be extend, abstract, and implicitly final
* All fields are final (shallowly immutable)
* Cannot declare instance fields
* Accessors, `hashCode()`, `toString()`, `equals()`, automatically generated
* Can override default implementation, or add your own method definitions 

VV

## Pattern Matching for Instanceof

Added in Java 16 <br/>
JEP 394

VV

### Pattern Matching for Instanceof

```java
Object someNumberType = ...

if(someNumberType instanceof Integer i) {
	//do work with i
} else if (someNumberType instanceof Long l) {
	//do work with l
} else if (someNumberType instanceof Double d) {
	//do work with d
}
```

VV

## API Updates

VV

### Enhanced Pseudo-Random Number Generators

JDK 17<br/>
JEP 356

VV
### Enhanced Pseudo-Random Number Generators

* New interface `RandomGenerator` provide uniform API for all Random classes
* For new interfaces:
    * `SplittableRandomGenerator`
    * `JumpableRandomGenerator`
    * `LeapableRandomGenerator`
    * `ArbitrarilyJumpableRandomGenerator`
* Updates to underlying algorithms to be more secure
VV

## Even More API Updates
Find them here 👇

[https://docs.oracle.com/en/java/javase/22/docs/api/new-list.html](https://docs.oracle.com/en/java/javase/22/docs/api/new-list.html)
<img src=images/new-api.png style="width:250px; margin-left: 40%;"/>

VV

## New Runtime Features and Improvements
VV

## ZGC
* JDK 15 
* JEP 377
* (Ultra-)Low Latency (<1 ms pause times)
* Scalable (multi-terabyte heaps)
* Initially single generation, now multi-generation
* Get started: `-XX:+UseZGC -Xmx<size> -Xlog:gc`

Video: [https://www.youtube.com/watch?v=U2Sx5lU0KM8](https://www.youtube.com/watch?v=U2Sx5lU0KM8)
VV

## Helpful Null Pointer Exceptions
JDK 14 <br/>
JEP 358
VV

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

## Deprecations, Removal, and Other Changes

VV

### Deprecations

Security Manager <br/>
JDK 17<br/>
JEP 411<br/>
<br/>
Applet API<br/>
JDK 17<br/>
JEP 398<br/>
<br/>
VV
## Removals

Nashorn (JavaScript Engine)<br/>
JDK 15<br/>
JEP 372<br/>
<br/>
CMS Garbage Collector<br/>
JDK 14<br/>
JEP 363
VV
## Other Changes

Strongly Encapsulate JDK Internals<br/>
JDK 17<br/>
JEP 403<br/>
<br/>
No longer relax strong encapsulation with single argument (i.e. `--illegal-access=permit`)<br/>
