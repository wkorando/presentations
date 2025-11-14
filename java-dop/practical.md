## Practical Uses for DOP

VV

### Simulating Multi-Return Values

Handling issues when calling an external serivce:

```java
public Response callExternalService(MyRequest request){

	try{
		Response response = service.callExternalService(request);
	} catch(Exception e){
		//Handle error
	}
	
}
```

VV

### Simulating Multi-Return Values

Handling issues when calling an external serivce:

```java
public Response callExternalService(MyRequest request){

	try{
		Response response = service.callExternalService(request);
	} catch(InterruptedException e){
		//Handle error when something happens connecting to the service
	} catch(TimeoutException e){
		//Handle error when we send bad data
	} catch(Exception e){
		//Handle other type of errors
	}
	
}
```

VV

### Simulating Multi-Return Values

Handling issues when calling an external serivce:

```java

sealed interface SafeResponse<T>{
	public record Success<T>(T response) implements SafeResponse{};
	public record Interrupted<T>() implements SafeResponse{};
	public record Timeout<T>() implements SafeResponse{};
	public record Failure<T>(Throwable t) implements SafeResponse{};
}


public Response callExternalService(MyRequest request){
	SafeResponse<Response> safeResponse = service.callExternalService(request);
	Response response = switch(safeResponse){
		case Success<Response>(Response response) -> response;
		case Interrupted<Response>() -> //Handle when execution is interrupted;
		case Timeout<Response>() -> //Handle when connection is timed out;
		case Failure<Response>(Throwable throwable) ->  //Handle generic error;
	}
		
}


```
