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
import java.util.Map;                   
import java.util.function.Function;     
import java.util.stream.Collectors;  
import java.util.stream.Stream; 
```

VV

### Module Import Declarations 

```java
import module java.base;

class HelloWorld{
	void main(){
		...
	}
}

```

VV

### Paving the On-ramp


Paving the On-ramp - [read more](https://openjdk.org/projects/amber/design-notes/on-ramp)