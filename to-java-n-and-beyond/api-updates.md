# API Updates

VV

## Sequenced Collections

JDK 21 <br/>
JEP 431
VV

### Sequenced Collections

```java
interface SequencedCollection<E> extends Collection<E> {
    // new method
    SequencedCollection<E> reversed();
    // methods promoted from Deque
    void addFirst(E);
    void addLast(E);
    E getFirst();
    E getLast();
    E removeFirst();
    E removeLast();
}
```

VV

### Sequenced Collections


```java
interface SequencedMap<K,V> extends Map<K,V> {
    // new methods
    SequencedMap<K,V> reversed();
    SequencedSet<K> sequencedKeySet();
    SequencedCollection<V> sequencedValues();
    SequencedSet<Entry<K,V> > sequencedEntrySet();
    V putFirst(K, V);
    V putLast(K, V);
    // methods promoted from NavigableMap
    Entry<K, V> firstEntry();
    Entry<K, V> lastEntry();
    Entry<K, V> pollFirstEntry();
    Entry<K, V> pollLastEntry();
}
```

VV


### Sequenced Collections

<img src=images/SequencedCollectionDiagram.png style="width:800px;"/>

VV

## Virtual Threads

JDK 21 <br/>
JEP 444
 
VV
### Virtual Threads

* First delivery from Project Loom
* Lightweight thread model that greatly increases the ability of writing, maintaining, and observing, a parallel/concurrent application.
* Eventually will be combined with Structured Concurrency (second incubator, JDK 20, JEP 437) and Scoped Values (first incubator, JDK 20, JEP 429)


