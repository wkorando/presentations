## What is a Garbage Collector?

![](./images/james-day-ECyvZuZeLGc-unsplash.jpg)

VV

## Automatic Memory Collection

```java
public class NamePrinter{
  record Name(String fName, String lName){}
  public static void main(String[] args){
    Name aName = createName();
    printName(aName);
    ...//the rest of the program
  }
  private void printName(Name name){
    String formattedName = lName + ", " + fName;
    System.out.println(formattedName);
  }
  private Name createName(){
    return new Name("Billy", "Korando");
  }		
}
```

VV

## Terminology
VV
# Concurrent != Parallel 

VV

## Serial vs Parallel

![](./images/serial.png)

VV

## Serial vs Parallel

![](./images/parallel.png)

VV

## Non-Concurrent vs Concurrent

![](./images/non-concurrent.png)

VV

## Non-Concurrent vs Concurrent
![](./images/concurrent.png)

VV

## Generational Garbage Collectors

![](./images/heaps-1.png)

VV
## Generational Garbage Collectors

![](./images/heaps-2.png)

VV
## Generational Garbage Collectors

**Weak Generational Hypothesis** - States that young objects tend to die young, while old objects tend to stick around
VV

## Garbage Collection Design Principles

![](./images/gc-triangle.png)
VV
## Garbage Collection Design Principles
![](./images/gc-tetrahedron.png)
VV
## Garbage Collection Design Principles
![](./images/gc-polygon.png)
VV

## Other GC Benefits

* Memory compaction
* Deduplicating data (JEP 192)
* Updating data representations (JEP 254)
