## Stream Gatherers 

JDK 24 <br/>
JEP 485
VV

### Stream Gatherers 

```java
List<String> speakers = 
	List.of("Billy", "Chandra", "Rodrigo", "Venkat", 
		"Grace", "Marit", "Freddy", "Bob", "Daniel", 
		"Trisha", "Michael", "Jennifer", "Justin");
		
long numberOfSpeakers = speakers.stream()
	.filter(Predicate.not(s -> s.length() == 5))
	.collect(Collectors.counting());
	
//10
```

VV



### Stream Gatherers 


```java

List<String> speakers = 
	List.of("Billy", "Chandra", "Rodrigo", "Venkat", 
		"Grace", "Marit", "Freddy", "Bob", "Daniel", 
		"Trisha", "Michael", "Jennifer", "Justin");
		
List<List<String> > groupsOfSpeakers 
	= speakers.stream().windowFixed(4).limit(3).toList();
//[[Billy, Chandra, Rodrigo, Venkat], [Grace, Marit, Freddy, Bob], [Daniel, Trisha, Michael, Jennifer]]

```

VV

### Stream Gatherers 

```java
List<String> speakers = 
	List.of("Billy", "Chandra", "Rodrigo", "Venkat", 
		"Grace", "Marit", "Freddy", "Bob", "Daniel", 
		"Trisha", "Michael", "Jennifer", "Justin");
		
List<List<String> > distinctSpeakerNameLength 
		= speakers.stream().distinctBy(String::length).toList();
//[Billy, Chandra, Venkat, Bob, Jennifer]
```

VV

### Stream Gatherers 

```java
List<String> speakers = 
	List.of("Billy", "Chandra", "Rodrigo", "Venkat", 
		"Grace", "Marit", "Freddy", "Bob", "Daniel", 
		"Trisha", "Michael", "Jennifer", "Justin");
		
List<List<String> > groupsOfSpeakers 
		= speakers.stream().gather(Gatherers.windowFixed(4)).limit(3).toList();
//[[Billy, Chandra, Rodrigo, Venkat], [Grace, Marit, Freddy, Bob], [Daniel, Trisha, Michael, Jennifer]]
```

VV

### Stream Gatherers 

```java
List<String> speakers = 
	List.of("Billy", "Chandra", "Rodrigo", "Venkat", 
		"Grace", "Marit", "Freddy", "Bob", "Daniel", 
		"Trisha", "Michael", "Jennifer", "Justin");
		
List<List<String> > distinctSpeakerNameLength 
		= speakers.stream().CustomGatherers.distinctBy(String::length).toList();
//[Billy, Chandra, Venkat, Bob, Jennifer]

...

public class DistinctByGatherer<T, R> implements Gatherer<T, Set<R>, T> {

  private final Function<T, R> extractor;

  public DistinctByGatherer(Function<T, R> extractor) {
      this.extractor = extractor;
  }

  @Override
  public Supplier<Set<R> > initializer() {
      return HashSet::new;
  }

  @Override
  public Integrator<Set<R>, T, T> integrator() {
      return Integrator.ofGreedy((state, item, downstream) -> {
          P extracted = extractor.apply(item);
          if(!state.contains(extracted)) {
              state.add(extracted);
              downstream.push(item);
          }
          return true;
      });
  }
}

public class CustomGatherers {
  public static <T, P> DistinctByGatherer<T, P> distinctBy(Function<T, P> extractor) {
      return new DistinctByGatherer<>(extractor);
  }
}
```

VV

### Stream Gatherers 

```java
List<String> speakers = 
	List.of("Billy", "Chandra", "Rodrigo", "Venkat", 
		"Grace", "Marit", "Freddy", "Bob", "Daniel", 
		"Trisha", "Michael", "Jennifer", "Justin");
		
List<List<String> > groupsOfSpeakers 
		= speakers.stream().gather(Gatherers.windowFixed(4)).limit(3).toList();
//[[Billy, Chandra, Rodrigo, Venkat], [Grace, Marit, Freddy, Bob], [Daniel, Trisha, Michael, Jennifer]]
public static <T, R> Gatherer<T, Set<R>, T> distinctBy(Function<T,R> extractor) {
   return Gatherer.ofSequential(
   	 HashSet::new,
  	 Integrator.ofGreedy((state, item, downstream) -> {
          R extracted = extractor.apply(item);
          if(!state.contains(extracted)) {
              state.add(extracted);
              downstream.push(item);
          }
          return true;
     }));
}
```
