## Pattern Matching for Switch
Java 21 <br/>
JEP 440
VV

### Pattern Matching for Switch

* `switch` using pattern matching must be exhaustive
* Can handle `null`

VV

### Pattern Matching for Switch

```java
interface class Shape{
	int area();
}
final class Triangle implements Shape{}
final class Circle implements Shape{}
final class Square implements Shape{}

switch(shape)
	case Triangle t when t.area() > 100 -> ...do something with t;
	case Triangle t -> ...do something with t; 
	case Circle c -> ...do something with c;
	case Square s -> ...do something with s;
	default -> System.out.println("A different shape");
```

VV

### Pattern Matching for Switch - null

```java
interface class Shape{
	int area();
}
final class Triangle implements Shape{}
final class Circle implements Shape{}
final class Square implements Shape{}

switch(shape)
	case Triangle t when t.area() > 100 -> ...do something with t;
	case Triangle t -> ...do something with t; 
	case Circle c -> ...do something with c;
	case Square s -> ...do something with s;
	case null -> System.out.println("Oops");
	default -> System.out.println("A different shape");
```

VV

### Pattern Matching for Switch - Sealed Hierarchies

```java
sealed interface class Shape{
	int area();
}
final class Triangle implements Shape{}
final class Circle implements Shape{}
final class Square implements Shape{}

switch(sealedHierarchy)
	case Triangle t when t.area() > 100 -> ...do something with t;
	case Triangle t -> ...do something with t; 
	case Circle c -> ...do something with c;
	case Square s -> ...do something with s;
	//No default needed; compiler can read sealed hierarchy
```
