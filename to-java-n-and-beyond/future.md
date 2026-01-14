# Beyond

VV

### Structured Concurrency

JDK 26  <br/>
JEP 525 (sixth preview)

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

## Primitive Type Patterns

Java 26<br/>
JEP 530 (Fourth Preview)
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

## Lazy Constants

Java 26<br/>
JEP 526

```java
```

VV

### Vector API

JDK 26 <br/>
JEP 529 (eleventh incubator) <br/>
<br/>
(Will remain in incubator until Valhalla starts delivering)



