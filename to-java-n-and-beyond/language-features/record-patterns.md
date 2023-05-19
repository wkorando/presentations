## Record Patterns 
Java 21 <br/>
JEP 441
VV

### Pattern Matching for Records 

```java
record Name(String firstName, String middleName, String lastName){}

if(o instanceof Name(var fName, var mName, var lName)){
	System.out.println(lName + ", " + fName + " " + mName); 
}
```

VV

### Record Patterns - Switch

```java
record Name(String firstName, String middleName, String lastName){}

switch(name)
	case Name name(var fName, var mName, var lName) 
		when !middleName.isEmpty() -> 
			System.out.println(lName + ", " + fName + " " + mName); 
	case Name name(var fName, var mName, var lName)  -> 
		System.out.println(lName + ", " + fName); 
```
