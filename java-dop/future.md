# Future of DOP in Java

VV

### Derived Record Creation (withers)


Coming in JDK ??? with [JEP 468](https://openjdk.org/jeps/468)

Allow for the easy creation of new records based on existing records. 

```java
public class ManagePresentations{

	ConferenceAttendee addFavoritePresentation(ConferenceAttendee attendee, Presentation presentation){
		return switch(attendee){
			case StandardAttendee standardAttendee
				-> standardAttendee with {
					List.of(favoritedPresentations.values()),
					presentation  
					}
			}
			...
		}
	}
}
```

VV

### Project Valhalla

<div style="text-align: center;">
    <div style="display: inline-block; text-align: left;">

Value Classes and Objects - [JEP 401](https://openjdk.org/jeps/401)

<br/>

* Classes without identity

<br/>

Enhanced Primitive Boxing - [JEP 402](https://openjdk.org/jeps/402)

<br/>

* Improve expressiveness by breaking down the barrier between primitive and reference types

<br/>

Null-Restricted Value Class Types - [Draft JEP](https://openjdk.org/jeps/8316779)

<br/>

* Prevent variables from storing `null` 

</div>
</div>

<< No I don't know when Valhalla will be available \>\>
