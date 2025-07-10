## Flexible Constructor Bodies

JDK 25 <br/>
JEP 513

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
		throw IlleglaArgumentException();
	}
	super(value);
}
```
VV