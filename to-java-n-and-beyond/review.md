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

## Sealed Hierarchies (Classes)
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

## More About Data-Oriented Programming

https://inside.java/2024/05/23/dop-v1-1-introduction/

VV

## API Updates
Find them here 👇

[https://docs.oracle.com/en/java/javase/22/docs/api/new-list.html](https://docs.oracle.com/en/java/javase/22/docs/api/new-list.html)
<img src=images/new-api.png style="width:250px; margin-left: 40%;"/>
