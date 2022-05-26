# Preview & Incubator

VV

## Pattern Matching for Switch

Java 19<br/>
JEP 427 (Third Preview)
VV
### Pattern Matching for Switch

* Updates to `null` case behavior
* `when` clause replaces `&&` guard case

```java
static void testTriangle(Shape s) {
    switch (s) {
        case Triangle t
        when t.calculateArea() > 100 ->
            System.out.println("Large triangle");
        case Triangle t ->
            System.out.println("Small triangle");
        default ->
            System.out.println("Non-triangle");
    }
}
```
VV

## Record Patterns

Java 19<br/>
JEP 405 (first preview)

VV

### Record Patterns

```java
record Point(int x, int y) {}

void printSum(Object o) {
    if (o instanceof Point(int x, int y)) {
        System.out.println(x+y);
    }
}
```
VV

## Virtual Threads

JDK 19 <br/>
JEP 425 
VV

## Vector API

JDK 19 <br/>
JEP 426

VV

## Structured Concurrency

JDK 19 (Proposed) <br/>
JEP 428