## Flexible Constructor Bodies

JDK 25 <br/>
JEP 513

VV

```java
class Person {
	int age;
    Person(..., int age) {
        if (age < 0){
            throw new IllegalArgumentException(...);
        }
        ...
        this.age = age;
    }
}

class Employee extends Person {
    Employee(..., int age){
    	super(..., age);//Potentially unnecessary work
    	if(age >= 18 || age <= 65){
    		throw new IllegalArgumentException(...);
    	}
    }
}
```

VV


```java
class Employee extends Person {
	Employee(..., int age){
		super(..., validateAge(age));//verbose and confusing
	}
	
	static int validateAge(int age){
		if(age < 18 || age > 65){
			throw new IllegalArgumentException(...);
		}
		return age;
	}
}
```

VV

```java

class Employee extends Person {
    Employee(..., int age){
    	if(age >= 18 || age <= 65){
    		throw new IllegalArgumentException(...);
    	}
    	super(..., age);
    }
}
```

VV

```java
class Object {
    Object() {
        // Object constructor body
    }
}

class A extends Object {
    A() {
        super();
        // A constructor body
    }
}

class B extends A {
    B() {
        super();
        // B constructor body
    }
}

class C extends B {
    C() {
        super();
        // C constructor body
    }
}
```

VV

```
C
--> B
    --> A
        --> Object constructor body
    --> A constructor body
--> B constructor body
C constructor body
```

VV

```java
class Object {
    Object() {
        // Object constructor body
    }
}

class A extends Object {
    A() {
        // A prologue
        super();
        // A epilogue
    }
}

class B extends A {
    B() {
        // B prologue
        super();
        // B epilogue
    }
}

class C extends B {
    C() {
        // C prologue
        super();
        // C epilogue
    }
}
```

VV

```
C prologue
    --> B prologue
        --> A prologue
            --> Object constructor body
        --> A epilogue
    --> B epilogue
C epilogue
```