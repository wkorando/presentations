# Project Amber

vv

## Project Amber

Goal: Introduce smaller productivity-oriented Java language features.

Goal 2: Improve the approachability of Java for new developers.

vv

## Key Language Changes

* Records
* Sealed classes
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

![](images/nicolai.png)

vv

## Primitive Type Patterns

Java 23<br/>
JEP 455 (First Preview)
vv

### Pattern Matching for Switch

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

## Implicitly Declared Classes and Instance Main Methods

JDK 23<br/>
JEP 477 (third preview)

vv

### Implicitly Declared Classes and Instance Main Methods

```java
public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }
}
```
vv

### Implicitly Declared Classes and Instance Main Methods

```java
void main() {
    System.out.println("Hello, World!");
}
```

vv

### Implicitly Declared Classes and Instance Main Methods

```java
void main() {
    println("Hello, World!");
}
```

vv

### Implicitly Declared Classes and Instance Main Methods

```java
void main() {
    String name = readln("Please enter your name: ");
    print("Pleased to meet you, ");
    println(name);
}
```

vv

## Flexible Constructor Bodies 

JDK 23<br/>
JEP 482 (Second preview)

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

## Next steps

* [Project Amber OpenJDK](https://openjdk.org/projects/amber/)
* [Dev mailing list](https://mail.openjdk.org/mailman/listinfo/amber-dev)
* [State of Project Amber](https://www.youtube.com/watch?v=a8OdwUiSnXw)

