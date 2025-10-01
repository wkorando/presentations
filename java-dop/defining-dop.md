## What is Data-Oriented Programming?


VV

### What is Object-Oriented Programming?

Modeling entities and processes through a combination of both state and behavior. 

VV

### What is Object-Oriented Programming?

```java
public class Attendee{
	private String firstName;
	private String lastName;
	private String company;
	private String email;
	private AttendeeType attendeeType;//Standard Attendee, Workshop Attendee, Speaker, etc.
	private List<Presentation> favoritedPresentations;
	
	...
	
	public void addFavoritedPresentation(Presentation presentation){
		favoritedPresentations.add(presentation);
	}
	
	public void setEmail(String email){
		if(Validators.validEmail(email)){
			this.email = email;
		}
	}
	
	public void setAttendeeType(AttendeeType attendeeType){
		this.attendeeType = type;
	}
}
```

VV

### What is Data-Oriented Programming?

Defining a system by its (immutable) data, that is then acted upon by operations. 


VV

### Defining Characteristics of DOP

* Model data immutably and transparently.
* Model the data, the whole data, and nothing but the data.
* Make illegal states unrepresentable.
* Separate operations from data.

(Not hard and fast universal rules) 

<br/>

[Data-Oriented Programming in Java - Version 1.1](https://inside.java/2024/05/23/dop-v1-1-introduction/)


VV

### DOP isn't New

Popularized in the 2000's for console video game development. 

<br/>

👉 [Data-Oriented Design (Or Why You Might Be Shooting Yourself in The Foot With OOP)](https://gamesfromwithin.com/data-oriented-design)

<br/>

Antecedents go back to the 70s; Expression Problem and distinction between abstract data types and objects. 

👉 [Expression Problem](https://en.wikipedia.org/wiki/Expression_problem)

VV

### Expression Problem

When you are not the owner of the code, choose one:

<div style="text-align: center;">
    <div style="display: inline-block; text-align: left;">

**Polymorphism** 

<br/>

* Add new subtypes
* Cannot add operations

<br/>

**Pattern Matching** 

<br/>

* Add operations
* Cannot add new subtypes

</div>
</div>
