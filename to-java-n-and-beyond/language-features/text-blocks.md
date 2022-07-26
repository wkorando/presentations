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
### Text Blocks

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

#### Output

```
A single line of text.
```