## Pattern Matching for Switch
Java 21 <br/>
JEP 441
VV

### Pattern Matching for Switch

* `switch` using pattern matching must be exhaustive
* Can handle `null`

VV

### Pattern Matching for Switch

```java
interface Shape{
	int area();
}
final class Triangle implements Shape{}
final class Circle implements Shape{}
final class Square implements Shape{}

switch(shape)
	case Triangle t when t.area() > 100 -> System.out.println("A large triange");
	case Triangle t -> System.out.println("A small triange");
	case Circle c -> System.out.println("A circle");
	case Square s -> System.out.println("A square");
	default -> System.out.println("A different shape");
```

VV

### Pattern Matching for Switch - null

```java
interface Shape{
	int area();
}
final class Triangle implements Shape{}
final class Circle implements Shape{}
final class Square implements Shape{}

switch(shape)
	case Triangle t when t.area() > 100 -> System.out.println("A large triange");
	case Triangle t -> System.out.println("A small triange");
	case Circle c -> System.out.println("A circle");
	case Square s -> System.out.println("A square");
	case null -> System.out.println("Oops");
	default -> System.out.println("A different shape");
```

VV

### Pattern Matching for Switch - Sealed Hierarchies

```java
sealed interface Shape{
	int area();
}
final class Triangle implements Shape{}
final class Circle implements Shape{}
final class Square implements Shape{}

switch(sealedHierarchy)
	case Triangle t when t.area() > 100 -> System.out.println("A large triange");
	case Triangle t -> System.out.println("A small triange");
	case Circle c -> System.out.println("A circle");
	case Square s -> System.out.println("A square");
	//No default needed; compiler can read sealed hierarchy
```
