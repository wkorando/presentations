## Sealed Classes
Added in Java 17<br/>
JEP 409
VV
### Sealed Classes
#  ![](images/sealed-classes-graph.png)
VV

### Sealed Classes

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