## Pattern Matching for Instanceof

Added in Java 16 <br/>
JEP 394

VV

### Pattern Matching for Instanceof

```java
Object someNumberType = ...

if(someNumberType instanceof Integer) {
	Integer i = (Integer) someNumberType;
	//do work
} else if (someNumberType instanceof Long) {
	Long l = (Long) someNumberType;
	//do work
} else if (someNumberType instanceof Double) {
	Double d = (Double) someNumberType;
	//do work
}
```

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

### Pattern Matching for Instanceof

```java
Object someNumberType = ...

if(someNumberType instanceof Integer i && i > 100) {
	//large number
} else if (someNumberType instanceof Integer i && i >= 0) {
	//small number
} else if (someNumberType instanceof Integer i && i < 0) {
	//negative number
}
```
VV

### Pattern Matching for Instanceof

```java
Object someNumberType = 1;

if(someNumberType instanceof Integer i) {
	System.out.println(i);
}

System.out.println(i); //Out of scope

boolean isAnInt =
	(someNumberType instanceof String nowImAString);

System.out.println(nowImAString); //Out of scope

if(someNumberType instanceof String i 
	|| i.endsWith("!")) //Out of scope
{
	System.out.println(i);
}
```
VV
### Pattern Matching for Instanceof

```java
Object someNumberType = 1;

if(!(someNumberType instanceof Integer i)) {
	System.out.println(i); //Out of scope
} else {
    System.out.println(i); //In scope
}
```

```java
Object someNumberType = 1;
if(!(someNumberType instanceof Integer i)) {
	throw RuntimeException();
}

System.out.println(i); //In scope
```