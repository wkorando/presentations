# Beyond

VV

### Structured Concurrency

JDK 24  <br/>
JEP 499 (fourth preview)

VV


```java
<T> List<T> runAll(List<Callable<T> > tasks) throws InterruptedException, ExecutionException { 
	try (var scope = new StructuredTaskScope.ShutdownOnFailure()) {
		List<? extends Supplier<T> > suppliers = tasks.stream().map(scope::fork).toList();
		scope.join().throwIfFailed(); // Propagate exception if any subtask fails
		// Here, all tasks have succeeded, so compose their results
		return suppliers.stream().map(Supplier::get).toList();
	}
}
```

VV

```java

<T> T race(List<Callable<T> > tasks, Instant deadline) 
        throws InterruptedException, ExecutionException, TimeoutException {
    try (var scope = new StructuredTaskScope.ShutdownOnSuccess<T>()) {
        for (var task : tasks) {
            scope.fork(task);
        }
        return scope.joinUntil(deadline)
                    .result();  // Throws if none of the subtasks completed successfully
    }
}
```
VV

### Scoped Values

JDK 24  <br/>
JEP 487 (second preview)

VV

### Vector API

JDK 24 <br/>
JEP 489 (ninth incubator) <br/>
<br/>
(Will remain in incubator until Valhalla starts delivering)


VV


### Flexible Constructor Bodies

JDK 24 (third preview) <br/>
JEP 492

VV

```java
public class PositiveBigInteger extends BigInteger {
	public PositiveBigInteger(long value) {
		super(value);  // Potentially unnecessary work
		if (value <= 0) throw ...
		}
}
```

VV

```java
public class PositiveBigInteger extends BigInteger {
    public PositiveBigInteger(long value) {
        super(verifyPositive(value));
    }

    private static long verifyPositive(long value) {
        if (value <= 0) throw ...
        return value;
    }
}
```
VV


```java
public class PositiveBigInteger extends BigInteger {
	public PositiveBigInteger(long value) {
	if (value <= 0)
		throw ...super(value);
	}
}
```
VV

## Primitive Type Patterns

Java 24<br/>
JEP 488 (First Preview)
VV

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
VV

## Implicitly Declared Classes and Instance Main Methods 

JDK 24 <br/>
JEP 495

VV

### Implicitly Declared Classes and Instance Main Methods

```java
public class HelloWorld {
	public static void main(String[] args) {
		System.out.println("Hello World!");
	}
}
```

VV


### Implicitly Declared Classes and Instance Main Methods

```java
class HelloWorld{
	void main(String[] args{
		System.out.println("Hello World!");
	}
}
```

VV

### Implicitly Declared Classes and Instance Main Methods

```java
void main() {
    System.out.println("Hello, World!");
}
```

VV

```java
void main() {
    println("Hello, World!");
}
```

VV

```java
void main() {
	String name = readln("What's your name?");
    println("Hello, " + name + "!");
}
```

VV

## Module Import Declarations 

JDK 24 <br/>
JEP 494

VV

### Module Import Declarations 

```java
```

VV

### Module Import Declarations 

```java
```

VV

### Paving the On-ramp


Paving the On-ramp - [read more](https://openjdk.org/projects/amber/design-notes/on-ramp)
