## Unnamed Patterns and Variables 

JDK 22 <br/>
JEP 456
VV

### Unnamed Patterns 

```java
record Name(...){}
record Address(...){}
record Billing(Address billingAddress, String ccNumber, LocalDate expiration){}
record Customer(Name name, Address address, Billing billing){}

Customer customer = ...


if(customer instanceof 
	Customer(var name, var address, 
		Billing(var billingAddress, var ccNumber, var expiration))){
	//Do something with billingAddress
} 
```

VV

### Unnamed Patterns 

```java
record Name(...){}
record Address(...){}
record Billing(Address billingAddress, String ccNumber, LocalDate expiration){}
record Customer(Name name, Address address, Billing billing){}

Customer customer = ...

if(customer instanceof 
	Customer(_, _, 
		Billing(var billingAddress, _, _))){
	//Do something with billingAddress
} 
```

VV

### Unnamed Patterns 

```java
record Name(...){}
record Address(...){}
record Billing(Address billingAddress, String ccNumber, LocalDate expiration){}
record Customer(Name name, Address address, Billing billing){}

Customer customer = ...

if(customer instanceof Customer(var name, _, _){
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