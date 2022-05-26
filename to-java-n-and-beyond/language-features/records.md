## Records 
Added in Java 16 <br/>
JEP 395
VV

### Records

```java
String firstName1 = "Billy";
String lastName1 = "Korando";
String title1 = "Java Developer Advocate";
String twitterHandle1 = "@BillyKorando";

String firstName2 = "Sharat";
String lastName2 = "Chander";
String title2 = "Java Developer Advocate";
String twitterHandle2 = "@Sharat_Chander";

class Person{
	private String firstName;
	private String lastName;
	private String title;
	private String twitterHandle;
	public Person(String firstName, String lastName, String title, String twitterHandle) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.title = title;
		this.twitterHandle = twitterHandle;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((firstName == null) ? 0 : firstName.hashCode());
		result = prime * result + ((lastName == null) ? 0 : lastName.hashCode());
		result = prime * result + ((title == null) ? 0 : title.hashCode());
		result = prime * result + ((twitterHandle == null) ? 0 : twitterHandle.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		if (firstName == null) {
			if (other.firstName != null)
				return false;
		} else if (!firstName.equals(other.firstName))
			return false;
		if (lastName == null) {
			if (other.lastName != null)
				return false;
		} else if (!lastName.equals(other.lastName))
			return false;
		if (title == null) {
			if (other.title != null)
				return false;
		} else if (!title.equals(other.title))
			return false;
		if (twitterHandle == null) {
			if (other.twitterHandle != null)
				return false;
		} else if (!twitterHandle.equals(other.twitterHandle))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Person [firstName=" + firstName + ", lastName=" + lastName + ", title=" + title
				+ ", twitterHandle=" + twitterHandle + "]";
	}
}

var persons = Stream.of(new Person(firstName1, lastName1, title1, twitterHandle1), 
new Person(firstName2, lastName2, title2, twitterHandle2));

persons.forEach(System.out::println);
```
VV

### Records

```java
String firstName1 = "Billy";
String lastName1 = "Korando";
String title1 = "Java Developer Advocate";
String twitterHandle1 = "@BillyKorando";

String firstName2 = "Sharat";
String lastName2 = "Chander";
String title2 = "Java Developer Advocate";
String twitterHandle2 = "@Sharat_Chander";

record Person(String firstName, String lastName, String title, String twitterHandle) {}

var persons = Stream.of(new Person(firstName1, lastName1, title1, twitterHandle1),
		new Person(firstName2, lastName2, title2, twitterHandle2));

persons.forEach(System.out::println);
```

VV

### Records

* Transparent modeling of data as data
* `record Person(String firstName, String lastName, String title, String twitterHandle) {}`
* Superclass always `java.lang.Record`
* Cannot be extend, abstract, and implicitly final
* All fields are final (shallowly immutable)
* Cannot declare instance fields
* Accessors, hashcode, toString, equals, automatically generated
* Can override default implementation, or add your own method definitions 

VV
### Records


```java
record Person(String firstName, String lastName, String title, String twitterHandle) {
	public String toString() {
		return lastName + ", " + firstName + " twitter handle: " + twitterHandle + " job title: " + title;
	}
}
```
VV

### Records


```java
record Person(String firstName, String lastName, String title, String twitterHandle) {
	public String toJSON() {
		return """
				{
					"firstName" : "%s",
					"lastName" : "%s",
					"title" : "%s",
					"twitterHandle" : "%s"
				}
			   """.formatted(firstName, lastName, title, twitterHandle);
	}
}
```
VV
### Records

```java
public sealed interface Shape  {
	int calulateArea();
}
public record Circle(int radius) implements Shape {
	public int calulateArea() {
		return radius^2;
	}
}
public record Rectangle(int x, int y) 
implements Shape {
	public int calulateArea() {
		return x * y;
	}
}
public record Triangle(int x, int y, int z) 
implements Shape {
	public int calulateArea() {
		int s = (x + y + z) / 2;
		return s * (s - x) * (s - y) * (s - z);
	}
}
```