## DOP Enabling Features in Java

VV

### Records

Added in Java 16 with [JEP 395](https://openjdk.org/jeps/395)

<br/>

Allows for transparent modeling of data as data:

```java
record Attendee(String firstName, String lastName, String company){}
```

VV

* Cannot be extended
* Cannot define instance fields
* All fields are `final`
* Canonical constructor must be invoked on initialization

VV

### Sealed Hiearchies

Added in Java 17 with [JEP 409](https://openjdk.org/jeps/409)

<br/>

Allows for a class to define which classes are allowed to extend it.

VV

```java
sealed interface ConferenceAttendee permits
StandardAttendee, WorkshopAttendee, Speaker{
	String firstName();
	String lastName();
	String company();
	String email();
	List<Presentation> favoritedPresentations();
}

record StandardAttendee(String firstName, String lastName, String company, String email, List<Presentation> favoritedPresentations) implements ConferenceAttendee;

record WorkshopAttendee(String firstName, String lastName, String company, String email, List<Presentation> favoritedPresentations, List<Presentation> workshops) implements ConferenceAttendee;

record Speaker(String firstName, String lastName, String company, String email, List<Presentation> favoritedPresentations, List<Presentation> workshops, List<Presentation> speakingPresentations, String profilePicture) implements ConferenceAttendee;
```

VV

### Pattern Matching

Pattern Match for `instanceof` added in Java 16 with [JEP 394](https://openjdk.org/jeps/394)


Pattern Matching for `switch` added in Java 21 with [JEP 441](https://openjdk.org/jeps/441)


`record` Pattern added in Java 21 with [JEP 440](https://openjdk.org/jeps/440)

Unnamed Patterns and Variables in Java 22 with [JEP 456](https://openjdk.org/jeps/456)


VV

### Pattern Matching with Switch & Records


```java
public void sendAttendeeEmails(ConferenceAttendee attendee){
	switch(attendee){
		case StandardAttendee standardAttendee -> sendAttendeeWelcomeEmail(standardAttendee); 
		case WorkshopAttendee workshopAttendee when workshopAttendee.workshops().isEmpty() -> sendWorkshopSelectionEmail(workshopAttendee);
		case WorkshopAttendee workshopAttendee -> sendWorkshopPrereqsEmail(workshopAttendee); 
		case Speaker speaker -> sendSpeakerWelcomeEmail(speaker); 
	}
}
```

VV

### Pattern Matching with Switch & Records


```java
public void displaySpeakers(List<ConferenceAttendees> attendees){
	for(var a : attendees){
		if(a instanceof Speaker(String firstName, String lastName, String company,
			_, _, _, String profilePicture){
			updateSpeakerPage(firstName, lastName, company, profilePicture);
		}
	}
}

```
