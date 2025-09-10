## Compact Source Files and Instance Main Methods 

JDK 25 <br/>
JEP 512

VV

### Compact Source Files and Instance Main Methods

```java
public class HelloWorld {
	public static void main(String[] args) {
		System.out.println("Hello World!");
	}
}
```

VV


### Compact Source Files and Instance Main Methods

```java
class HelloWorld{
	void main(String[] args){
		System.out.println("Hello World!");
	}
}
```

VV

### Compact Source Files and Instance Main Methods

```java
void main() {
    System.out.println("Hello, World!");
}
```

VV

```java
void main() {
    IO.println("Hello, World!");
}
```

VV

```java
void main() {
	String name = IO.readln("What's your name?");
    IO.println("Hello, " + name + "!");
}
```

VV

## Module Import Declarations 

JDK 25 <br/>
JEP 511

VV

### Module Import Declarations 

```java
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import static java.net.http.HttpResponse.BodyHandlers;

class CallFoo{
        public void main(){
                HttpClient client = HttpClient.newHttpClient();

                HttpRequest request = HttpRequest.newBuilder()
                      .uri(URI.create("http://localhost:8000/"))
                      .build();

                client.sendAsync(request, BodyHandlers.ofString())
                      .thenApply(HttpResponse::body)
                      .thenAccept(System.out::println)
                      .join();
      }
}
```

VV

### Module Import Declarations 

```java
import module java.net.http;

import java.net.URI;
import static java.net.http.HttpResponse.BodyHandlers;//Only public top-level classes imported

class CallFoo{
	public void main(){
		HttpClient client = HttpClient.newHttpClient();
		
		HttpRequest request = HttpRequest.newBuilder()
		      .uri(URI.create("http://localhost:8000/"))
		      .build();
		
		client.sendAsync(request, BodyHandlers.ofString())
		      .thenApply(HttpResponse::body)
		      .thenAccept(System.out::println)
		      .join();
      }
}  

```

VV

### Paving the On-ramp


Paving the On-ramp - [read more](https://openjdk.org/projects/amber/design-notes/on-ramp)