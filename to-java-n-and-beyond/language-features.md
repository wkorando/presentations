# New Language Features
VV
## Text Blocks
Added in Java 15 <br/>
JEP 378
VV
### Text Blocks
```java
String simpleJSONMessage = "{\n" + 
		"\t\"firstName\": \"Billy\",\n" +
		"\t\"lastName\": \"Korando\",\n" +
		"\t\"jobTitle\": \"Java Developer Advocate\",\n" +
		"\t\"twitterHandle\": \"@BillyKorando\"\n" +
		"}\n";
```
VV
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
VV
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

VV
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

>>
## Switch Updates
Added in Java 14 <br/>
JEP 361
VV

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


