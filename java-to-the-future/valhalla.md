# Project Valhalla
vv
## Project Valhalla
Goal: Advanced Java VM and Language feature candidates

vv

## What does this mean?

* Unify the type system
	* primitives and classes (reference types)
vv
## Types - identity

* Have identity
	* Extra overhead
	* mutability
	* locking, synchronoziation, etc



<br/>
<br/>
 Not always needed!
vv

## Types - references

* Have reference
	*  memory indirection
	*  nullability
	*  protection from tearing



<br/>
<br/>
 Not always needed!

vv
## Project Valhalla Goals

* value types (disavow identity)

* primitive types (disavow identity + references)

* universal generics (`ArrayList<int>`)

* specialized generics (backed by `int[]`)
vv
## What Can You Do Now?

### Synchronization:
Compiler warnings:

```java
Long longValue = Long.valueOf(100L);

synchronized (longValue) {
	longValue.longValue();
}
```

Enable JFR event:

```
SyncOnValueBasedClass
```

vv

## What Can You Do Now?

### Initializing value types: 

Compiler warning:
```java
public Long createALong() {
	return new Long(100L);
}
```



vv

## Next steps

* [Project Valhalla OpenJDK](https://openjdk.org/projects/valhalla/)
* [Dev Mailing list](https://mail.openjdk.org/mailman/listinfo/valhalla-dev)
* [State of Project Valhalla](https://www.youtube.com/watch?v=x1_DBqJrykM)

