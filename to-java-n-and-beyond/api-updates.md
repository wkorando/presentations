# API Updates

VV

## Enhanced Pseudo-Random Number Generators

JDK 17<br/>
JEP 356

VV
### Enhanced Pseudo-Random Number Generators

* New interface `RandomGenerator` provide uniform API for all Random classes
* For new interfaces:
    * `SplittableRandomGenerator`
    * `JumpableRandomGenerator`
    * `LeapableRandomGenerator`
    * `ArbitrarilyJumpableRandomGenerator`
* Updates to underlying algorithms to be more secure
VV
## Internet-Address Resolution SPI

JDK 18 <br/>
JEP 418
VV
### Internet-Address Resolution SPI

* Provide a Service-Provider Interface for host name and address resolution
* Default to still use platform built-in resolver
* Different resolvers can be supplied through the Java Service Loader
    * Support for upcoming project like Loom
    * Better testing support
    * Better framework support
VV
## Code Snippets in Java API Documentation

JDK 18 <br/>
JEP 413
VV

### Code Snippets in Java API Documentation

```java
/**
* {@snippet :
		public void HelloWorld(){
			System.out.println("Hello World!");
		}
	}
*/
public void HelloWord(){
	...
```
VV

###  Code Snippets in Java API Documentation

```java
package mypackage;

public class MyClass {
	/**
	* {@snippet class="MySnippet"}
	*/
	public void myMethod(){ ..}
}
```
#### Automatically Find Snippet Files

```
src
└── mypackage
    ├── MyClass.java
    └── snippet-files
        └── MySnippet.java
```
⚠️ **Note:** Requires setting `--source-path`
VV

## Simple Web Server

JDK 18 <br/>
JEP 408
VV

### Simple Web Server

```
$ jwebserver
```

* Starts server at: http://127.0.0.1:8000
* Serving files from current directory
* MIME types auto-configured
VV
### Simple Web Server

* `-b` configure binding address

* `-d` for the directory to serve
	* Can be a remote directory	
	* Must use full path

* `-o` configure console output `none|info|verbose` default: `info`

VV

## Even More API Updates
Find them here 👉 https://docs.oracle.com/en/java/javase/18/docs/api/new-list.html
<img src=images/new-api.png style="width:250px; margin-left: 40%;"/>