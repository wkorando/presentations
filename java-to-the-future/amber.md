# Project Amber

vv

## Project Amber

Goal: Introduce smaller productivity-oriented Java language features.

Goal 2: Improve the approachability of Java for new developers.

vv

## Key Language Changes

* Records
* Sealed classes/hierarchies
* Pattern matching for `instanceof`, `switch`, and `record`


vv

## Records

* Transparent modeling of data as data
* `record Person(String firstName, String lastName, String title, String twitterHandle) {}`
* Achieved through constraints 
	* Superclass always `java.lang.Record`
	* Cannot be extended, `abstract`, and implicitly `final`
	* All fields are final (shallowly immutable)
	* Cannot declare instance fields

vv

## Sealed Classes

Allow classes (and interfaces) to declare who can extend it. 

vv

## Sealed Classes

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

vv

## Pattern Matching

```java
switch (x.getYearlyFlights()) {
    case 0 -> ...;
    case 1 -> ...;
    case 2 -> issueDiscount();
    case int i when i >= 100 -> issueGoldCard();
    case int i -> ... appropriate action when i > 2 && i < 100 ...
}
```

vv

## Flexible Constructor Bodies 

JDK 25<br/>
JEP 513

vv

## Flexible Constructor Bodies 

```java
class Super {

    Super() { overriddenMethod(); }

    void overriddenMethod() { System.out.println("hello"); }

}

class Sub extends Super {

    final int x;

    Sub(int x) {
        this.x = x;    // Initialize the field
        super();       // Then invoke the Super constructor explicitly
    }

    @Override
    void overriddenMethod() { System.out.println(x); }

}
```

vv


## Paving the On-Ramp


vv

### Compact Source Files and Instance Main Methods

```java
public class HelloWorld {
	public static void main(String[] args) {
	    System.out.println("Hello, World!");
	}
}
```

vv

### Compact Source Files and Instance Main Methods

```java
void main() {
    IO.println("Hello, World!");
}
```

vv

### Compact Source Files and Instance Main Methods

```java
void main() {
	String name = IO.readln("Please enter your name: ");
   IO.println("Hello " + name + "!");
}
```

vv

## Module Import Declarations 

JDK 25 <br/>
JEP 511

vv

### Module Import Declarations 

```java
import java.util.Map;                   
import java.util.function.Function;     
import java.util.stream.Collectors;  
import java.util.stream.Stream; 
```

vv

### Module Import Declarations 

```java
import module java.base;

class HelloWorld{
	void main(){
		...
	}
}

```

vv

### Paving the On-ramp


Paving the On-ramp - [read more](https://openjdk.org/projects/amber/design-notes/on-ramp)

vv

## Themes

1. More expressive
	* Meaning can be more easily derived from code
2. Safer
	* Compiler warnings
	* Address some security issues (serialization)
	* Fewer concerns with nulls
3. Reducing verbosity/ceremony
	* Not *just* about typing, but reducing opportunities for bugs

 
vv

## Data-Oriented Programming
**Object-Oriented Programming (OOP)** -> Classes model business behavior and entites
<br/>
**Data-Oriented Programming (DOP)** -> Classes model data

❗️OOP and DOP are not competing paradigms, DOP can be used alongside OOP as needed.

More here 👉 [Data-Oriented Programming in Java - Version 1.1](https://inside.java/2024/05/23/dop-v1-1-introduction/)

vv

## Derived Records (withers)

JDK ??<br/>
JEP 468 (first preview)

vv

### Derived Records

```java
Point finalLoc = nextLoc with {
    x *= 2;
    y *= 2;
    z *= 2;
};
```
vv

## String Template/Interpolation

# 🤷‍♂️

Don't know when, still a goal/priority to get implemented

vv

## A Bit Further Ahead

* (Normal) Class deconstructors
* Static factory patterns
* Collection literals
* Declaration of patterns in classes

vv

## Better Marshalling

Towards Better Serialization: https://openjdk.org/projects/amber/design-notes/towards-better-serialization

Marshalling: Data-Oriented Serialization : https://www.youtube.com/watch?v=R8Xubleffr8

vv

## Next steps

* [Project Amber OpenJDK](https://openjdk.org/projects/amber/)
* [Dev mailing list](https://mail.openjdk.org/mailman/listinfo/amber-dev)
* [
Where is the Java Language Going](https://www.youtube.com/watch?v=1dY57CDxR14)

