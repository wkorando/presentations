## Designing a DOP System

VV

### Model Data Transparently

Do not hide state. Allow operations to have a full view to the data they are acting upon. 

VV

### Model Data Transparently

`record` provide this naturally.

```
record StandardAttendee
	(String firstName, 
	String lastName, 
	String company, 
	String email, 
	List<Presentation> favoritedPresentations)
	implements ConferenceAttendee {}
```

VV

### Model Data Transparently

If modeling with normal classes, don't hide fields and ensure all fields are set on instance initialization.

```
class StandardAttendee implements ConferenceAttendee {
	private String firstName;
	private String lastName;
	private String company;
	private String email;
	private List<Presentation> favoritedPresentations;
	
	StandardAttendee(String firstName, 
	String lastName, 
	String company, 
	String email, 
	List<Presentation> favoritedPresentations){
		//Set all fields
	}
}
```

VV

### Model Data the Whole Data and Nothing But the Data

Express alternatives and ensure equity between data.

VV

### Model Data the Whole Data and Nothing But the Data

Alternatives can be expressed with `sealed` hierarchies. 

```
sealed interface Presentation permits StandardPresentation, WorkshopPresentation{
	String id;
	String name;
	String abstract;
	Speaker speaker;
}
```

VV

### Model Data the Whole Data and Nothing But the Data

By default `record` will provide an implementation of `equals()` and `hashCode()` that compares the identity of all fields. This might not always provide the best results. 

Equity for a presentation can be established by `id`.

```java
record StandardPresentation(String id, String name, String abstract, Speaker speaker) implements Presentation{
	@Override
	public equals(Object other) {
		return this == other
			|| other instanceof StandardPresentation presentation
			&& Objects.equals(id, presentation.id);
	@Override
	public hashCode(){
		return Objects.hash(id);
	}

}
```
VV

### Model Data Transparently

`record` make it easy to aggregate data. 

Instead of `String` for `email`, instead make it a type.

```
record Email(String emailAddress){}

record StandardAttendee
	(String firstName, 
	String lastName, 
	String company, 
	Email email, 
	List<Presentation> favoritedPresentations)
	implements ConferenceAttendee {}
```

VV

### Immutability In-Depth

Ensure the data within a class cannot be unexpectedly changed, and ensure clients are aware of this as well. 

Records only offer shallow immutability, which might require active intervention by the developer to ensure the claim remains truly immutable.

VV

### Ensure Immutability In-Depth

```java
record StandardAttendee(String firstName, String lastName, String company, String email, List<Presentation> favoritedPresentations) implements ConferenceAttendee
{
	
	ConferenceAttendee{
		this.favoritedPresentations = List.copyOf(favoritedPresentations);
		//Defensively copy potentially mutable fields
	}
	
	public List<Presentation> favoritedPresentations(){
		return Collections.unmodifiableList(favoritedPresentations);
		//Return unmodifiableLists to make clear to client the data is immutable
	}

}
```
VV


### Make an Illegal State Unrepresentable

Only legal representations should ever be present in the system. To ensure this, data should be validated at initialization, or as close to the boundary as possible.

VV

```java
record StandardAttendee(String firstName, String lastName, String company, String email, List<Presentation> favoritedPresentations) implements ConferenceAttendee
{
	ConferenceAttendee{
		Objects.requireNonNull(firstName);
		if(!firstName.isBlank()){
			throw new IllegalArgumentException("First name is required!");
		}
		Objects.requireNonNull(lastName);
		if(lastName.isBlank){
			throw new IllegalArgumentException("Last name is required!");
		}
		if(!Validators.isValidEmail(email)){
			throw new IllegalArgumentException("Email address is invalid!");
		}
		this.favoritedPresentations = List.copyOf(favoritedPresentations);	
	}
	
	public List<Presentation> favoritedPresentations(){
		return Collections.unmodifiableList(favoritedPresentations);
		//Return unmodifiableLists to make clear to client the data is immutable
	}

}
record Email(String emailAddress){
	Email{
		if(Validators.validEmail(emailAddress)){
			this.emailAddress = emailAddress;
		} else {
			throw new IllegalArgumentException("Email address is invalid!");
		}
	}
}
```
VV

### Separate Operations from Data

The behavior of the data should be separated from the modeling of the data. 

The modeling of data transparently allows operations to have full access and knowledge to the state of data.

VV


### Separate Operations from Data


❌ DON'T DO THIS ❌


```java
record StandardAttendee(String firstName, String lastName, String company, String email, List<Presentation> favoritedPresentations) implements 
{
	public void addFavoritedPresentation(Presentation presentation){
		favoritedPresentations.add(presentation);
	}
}
```
VV

### Separate Operations from Data


✅ DO THIS ✅


```java
public class ManagePresentations{

	ConferenceAttendee addFavoritePresentation(ConferenceAttendee attendee, Presentation presentation){
		return switch(attendee){
			case StandardAttendee sa(String firstName, String lastName, String company, String email, List<Presentation> favoritedPresentations) 
			-> new StandardAttendee(firstName, lastName, company, email, List.of(favoritedPresentations.values(),  presentation);
			...
		}
	}
}
```


### Separate Operations from Data

Having behavior purely derivative of contained state is fine. 

✅ THIS IS ALSO OK ✅


```java
record StandardAttendee(String firstName, String lastName, String company, String email, List<Presentation> favoritedPresentations) implements 
{
	public String prettyPrintName(){
		return String.format("%s %s - %s", firstName, lastName, company);
	}
}
```
