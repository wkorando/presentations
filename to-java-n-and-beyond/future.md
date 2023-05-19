# Beyond

VV

## Unnamed Patterns and Variables 

JDK 21 <br/>
<br/>
JEP 443 (first preview)
VV

### Unnamed Patterns 

```java
record Name(...){}
record Address(...){}
record Billing(Address billingAddress, String ccNumber, LocalDate expiration){}
record Customer(Name name, Address address, Billing billing){}

if(o instanceof 
	Customer(var name, var adress, 
		Billing(var billingAddress, var ccNumber, var expiration)){
	...//Do something with billingAddress
} 
```

VV

### Unnamed Patterns 

```java
record Name(...){}
record Address(...){}
record Billing(Address billingAddress, String ccNumber, LocalDate expiration){}
record Customer(Name name, Address address, Billing billing){}

if(o instanceof Customer(_, _, Billing(var billingAddress, _, _)){
	...//Do something with billingAddress
} 
```

VV

### Unnamed Patterns 

```java
record Name(...){}
record Address(...){}
record Billing(Address billingAddress, String ccNumber, LocalDate expiration){}
record Customer(Name name, Address address, Billing billing){}

if(o instanceof Customer(var name, _, _){
	...//Do something with name
} 
```

VV

### Unnamed Variables 

```java
List<Name> names = ...;
int i = 0;
for(Name n : names){
	if(i < LIMIT){
		System.out.println("ACCEPTED");
	} else {
		System.out.println("REJECTED");
	}	
}
```

VV

### Unnamed Variables 

```java
List<Name> names = ...;
int i = 0;
for(Name _ : names){
	if(i < LIMIT){
		System.out.println("ACCEPTED");
	} else {
		System.out.println("REJECTED");
	}	
}
```

VV

### Unnamed Variables 

```java
List<Name> names = ...;
int i = 0;
for(Name _ : names){
	if(i < LIMIT){
		System.out.println("ACCEPTED");
	} else {
		System.out.println("REJECTED");
	}	
}
```

VV

### Unnamed Variables - Exceptions

```java
String age = "cat";
try{
	person.setAge(age);
} catch (IllegalArgumentException e){
	log(age + " is not a valid age!"); 
}
```

VV

### Unnamed Variables - Exceptions

```java
String age = "cat";
try{
	person.setAge(age);
} catch (IllegalArgumentException _){
	log(age + " is not a valid age!"); 
}
```

VV

### Structured Concurrency

JDK 21(?)  <br/>
JEP 453 (first preview)

VV

### Scoped Values

JDK 21(?)  <br/>
JEP 446 (first preview)

VV

### Vector API

JDK 21 <br/>
JEP 448 (sixth incubator) <br/>
<br/>
(Will remain in incubator until Valhalla starts delivering)


VV

### Foreign Function & Memory API

JDK 21 <br/>

JEP 442 (third preview)
VV


### String Templates

JDK 21 <br/>
JEP 430 (first preview)

VV

### String Templates

```java
String title = "My Web Page";
String text  = "Hello, world";
String html = STR."""
        <html>
          <head>
            <title>\{title}</title>
          </head>
          <body>
            <p>\{text}</p>
          </body>
        </html>
        """;
```
VV
### String Templates

```
| """
| <html>
|   <head>
|     <title>My Web Page</title>
|   </head>
|   <body>
|     <p>Hello, world</p>
|   </body>
| </html>
| """
```
VV
### Unnamed Classes and Instance Main Methods

JDK 21 <br/>
JEP 445

VV

### Unnamed Classes and Instance Main Methods

```java
public class HelloWorld {
	public static void main(String[] args) {
		System.out.println("Hello World!");
	}
}
```

VV


### Unnamed Classes and Instance Main Methods

```java
class HelloWorld{
	void main(String[] args{
		System.out.println("Hello World!");
	}
}
```

VV

### Unnamed Classes and Instance Main Methods

```java
void main() {
    System.out.println("Hello, World!");
}
```

VV

### Paving the On Ramp

(draft) JEP 8304400 - Launch Multi-File Source-Code Programs  <br/>

Paving the on Ramp - [read more](https://openjdk.org/projects/amber/design-notes/on-ramp)
