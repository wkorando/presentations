# Beyond

VV

### Structured Concurrency

JDK 22  <br/>
JEP 462 (second preview)

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

JDK 22  <br/>
JEP 464 (second preview)

VV

### Vector API

JDK 23 <br/>
JEP 460 (eighth incubator) <br/>
<br/>
(Will remain in incubator until Valhalla starts delivering)


VV

### Class-File API

JDK 23 <br/>
JEP 466 (second preview)
<br/>
![](images/class-file-api.jpg)
<br/>
https://youtu.be/bQ2Rwpyj_Ks

VV

### Stream Gatherers 

JDK 23 <br/>
JEP 473 (second preview)

VV


### Statements before super(...)

JDK 22 (first preview) <br/>
JEP 447

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

### JEP draft: Flexible Constructor Bodies (Second Preview)

Next step 👉 https://openjdk.org/jeps/8325803

VV

### Implicitly Declared Classes and Instance Main Methods 

JDK 23 <br/>
JEP 477

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

## Implicitly Declared Classes and Instance Main Methods

Next step 👉 https://openjdk.org/jeps/477


VV

```java
void main() {
    println("Hello, World!");
}
```

VV

### Paving the On-ramp


Paving the On-ramp - [read more](https://openjdk.org/projects/amber/design-notes/on-ramp)
