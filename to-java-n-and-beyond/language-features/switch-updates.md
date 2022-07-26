## Switch Updates
Added in Java 14 <br/>
JEP 361
VV

### Switch Updates

```java
switch(d){
	case 1:
		System.out.println("Sunday");
		break;
	case 2:
		System.out.println("Monday");
		break;
	case 3:
		System.out.println("Tuesday");
		break;
	case 4:
		System.out.println("Wednesday");
		break;
	case 5: 
		System.out.println("Thursday");
		break;
	case 6: 
		System.out.println("Friday");
		break;
	case 7: 
		System.out.println("Saturday");
		break;
}
```

VV

### Switch Updates

```java
switch(d){
	case 1:
		System.out.println("Sunday");
		break;
	case 2:
		System.out.println("Monday");
		break;
	case 3:
		System.out.println("Tuesday");
		break;
	case 4:
		System.out.println("Wednesday");
		break;
	case 5: 
		System.out.println("Thursday");
		break;
	case 6: 
		System.out.println("Friday");
//		break;
	case 7: 
		System.out.println("Saturday");
		break;
}
```

VV

### Switch Updates

```java
switch(d){
	case 1 -> System.out.println("Sunday");
	case 2 -> System.out.println("Monday");
	case 3 -> System.out.println("Tuesday");
	case 4 -> System.out.println("Wednesday");
	case 5 -> System.out.println("Thursday");
    case 6 -> System.out.println("Friday");
	case 7 -> System.out.println("Saturday");
}
```

VV

### Switch Updates

```java
String day = switch(d){
	case 1 -> "Sunday";
	case 2 -> "Monday";
	case 3 -> "Tuesday";
	case 4 -> "Wednesday";
	case 5 -> "Thursday";
	case 6 -> "Friday";
	case 7 -> "Saturday";
	default -> throw new IllegalArgumentException();
}
```

VV

### Switch Updates

```java
String day = switch(d){
	case 1 -> "Sunday";
	case 2 -> "Monday";
	case 3 -> "Tuesday";
	case 4 -> "Wednesday";
	case 5 -> "Thursday";
	case 6 -> {
 	  System.out.println("Ladies and Gentlemen, the Weekend");
 	  yield "Friday";
 	}
	case 7 -> "Saturday";
	default -> throw new IllegalArgumentException();
}
```

VV

### Switch Updates

```java
String day = switch(d){
	case 1: 
		yield "Sunday";
	case 2: 
		yield "Monday";
	case 3: 
		yield "Tuesday";
	case 4: 
		yield "Wednesday";
	case 5: 
		yield "Thursday";
	case 6: 
 		yield "Friday";
	case 7: 
		yield "Saturday";
	default: 
	    throw new IllegalArgumentException();
}
```
VV
### Switch Updates

```java
enum DaysOfWeek {
   SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY;
}

DaysOfWeek dayOfWeek = [someDayOfWeek]

String day = switch(dayOfWeek){
	case SUNDAY -> "Sunday";
	case MONDAY -> "Monday";
	case TUESDAY -> "Tuesday";
	case WEDNESDAY -> "Wednesday";
	case THURSDAY -> "Thursday";
	case FRIDAY -> "Friday";
	case SATURDAY -> "Saturday";
}
```

VV

### Switch Updates


```java
enum DaysOfWeek {
   SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY;
}

String day = switch(dayOfWeek){
	case SUNDAY :
 		yield "Sunday";
	case MONDAY :
		yield "Monday";
	case TUESDAY :
		yield  "Tuesday";
	case WEDNESDAY:
		yield "Wednesday";
	case THURSDAY:
		yield "Thursday";
	case FRIDAY:
		yield "Friday";
	case SATURDAY: 
 		yield "Saturday";
};
```