## To Java 18 and Beyond!
Billy Korando
Java Developer Advocate - Oracle
@BillyKorando
--horizontal--
## Important Information

* Ask questions
* Reach out:
	* Email: billy.korando@oracle.com
* Link to presentation:  
--horizontal--
## Would you like to know more?

* https://dev.java
* https://inside.java
* https://youtube.com/java 
* Inside Java Podcast
* Inside Java Newscast
* #SipOfJava
* #JEPCafé
--horizontal--
## Agenda
* New Language Features
* New Runtime Features
* Deprecations, Removals, & other changes to know about
* The Future
--horizontal--
## New Language Features
--down--
## Text Blocks
Added in Java 15 <br/>
JEP 378
--down--
```java
String simpleJSONMessage = "{\n" + 
		"\t\"firstName\": \"Billy\",\n" +
		"\t\"lastName\": \"Korando\",\n" +
		"\t\"jobTitle\": \"Java Developer Advocate\",\n" +
		"\t\"twitterHandle\": \"@BillyKorando\"\n" +
		"}\n";
```
--down--
```java
String simpleJSONMessage = """
		{
		        "firstName": "Billy",
		        "lastName": "Korando",
		        "jobTitle": "Java Developer Advocate",
		        "twitterHandle": "@BillyKorando"
		}
		""";
```
--down--
### Text Blocks

```java
String simpleJSONMessage = """
		{
		        "firstName": "%s",
		        "lastName": "%s",
		        "jobTitle": "%s",
		        "twitterHandle": "%s"
		}
		""";
		
String formattedString = 
	simpleJSONMessage.formatted("Billy", 
			      "Korando", 
			      "Java Developer Advocate", 
			      "@BillyKorando");
```

--down--
### Text Blocks

```java
String aSingleLine = """
		A \
		single \
		line \
		of \
		text.""";
```

### Output

```
A single line of text.
```

--horizontal--
## Switch Updates
Added in Java 14 <br/>
JEP 361
--down--

```java
String input = args[0];
if (input.equals("1")) {
	System.out.println("Monday");
} else if (input.equals("2")) {
	System.out.println("Tuesday");
} else if (input.equals("3")) {
	System.out.println("Wednesday");
} else if (input.equals("4")) {
	System.out.println("Thursday");
} else if (input.equals("5")) {
	System.out.println("Friday");
} else if (input.equals("6")) {
	System.out.println("Saturday");
} else if (input.equals("7")) {
	System.out.println("Sunday");
} else {
	System.out.println("Invalid selection, valid choices 1-7");
}
```
--horizontal--
# New Runtime Features and Improvements
--down--
## CDS Updates
JDK 12<br/>
Default CDS Archive: JEP 341<br/>

JDK 13 <br/>
Dynamic CDS Archive: JEP 350


