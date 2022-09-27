# Project Panama
vv
## Project Panama

Goal: Interconnecting JVM and native code

<br/>

Composed of three parts: 

<br/>

* Vector API
* The Foreign Function & Memory API
* Jextract tool

vv

## Vector API

Introduce an API to express vector computations that reliably compile at runtime to optimal vector instructions on supported CPU architectures, thus achieving performance superior to equivalent scalar computations.

vv

## Vector API 
JDK 19 <br/>
JEP 426 (fourth incubator)
vv

## Vector API

```java
void compute(float[] a, float[] b, float[] c) {
	for (int i = 0; i < a.length; i++) {
		c[i] = a[i] + b[i];
	}
}
```
vv

## Foreign Function & Memory API 

Provide an API that allows Java programs to operate with code and data outside the Java program. The API improves on JNI by being less brittle and dangerous.

vv

## Foreign Function & Memory API
JDK 19 <br/>

JEP 424 (First Preview)
vv

## Foreign Function & Memory API

```java
// 1. Find foreign function on the C library path
Linker linker = Linker.nativeLinker();
SymbolLookup stdlib = linker.defaultLookup();
MethodHandle radixSort = linker.downcallHandle(
                             stdlib.lookup("radixsort"), ...);
// 2. Allocate on-heap memory to store four strings
String[] javaStrings   = { "mouse", "cat", "dog", "car" };
// 3. Allocate off-heap memory to store four pointers
SegmentAllocator allocator = implicitAllocator();
MemorySegment offHeap  = allocator.allocateArray(ValueLayout.ADDRESS, javaStrings.length);
// 4. Copy the strings from on-heap to off-heap
for (int i = 0; i < javaStrings.length; i++) {
    // Allocate a string off-heap, then store a pointer to it
    MemorySegment cString = allocator.allocateUtf8String(javaStrings[i]);
    offHeap.setAtIndex(ValueLayout.ADDRESS, i, cString);
}
// 5. Sort the off-heap data by calling the foreign function
radixSort.invoke(offHeap, javaStrings.length, MemoryAddress.NULL, '\0');
// 6. Copy the (reordered) strings from off-heap to on-heap
for (int i = 0; i < javaStrings.length; i++) {
    MemoryAddress cStringPtr = offHeap.getAtIndex(ValueLayout.ADDRESS, i);
    javaStrings[i] = cStringPtr.getUtf8String(0);
}
assert Arrays.equals(javaStrings, new String[] {"car", "cat", "dog", "mouse"});  // true
```

vv

## Jextract Tool

A tool for mechanically generating Java bindings from a native library's headers. 

More info 👉 [https://github.com/openjdk/jextract](https://github.com/openjdk/jextract)

vv

## Why Project Panama

Replace the existing Java Native Interface (JNI) with an improved API that makes debugging and memory management easier, and address security concerns and safety issues related to JNI.

Allow Java applications take advantage of native libraries while still writing Java, and not having to write in the libraries native language.*

vv

## Next steps

* [Project Panama OpenJDK](https://openjdk.org/projects/panama/)
* [Dev mailing list](https://mail.openjdk.org/mailman/listinfo/panama-dev)
* [State of Project Valhalla](https://www.youtube.com/watch?v=B8k9QGvPxC0)
* [Introduction to Project Panama](https://denismakogon.github.io/openjdk/panama/2022/05/31/introduction-to-project-panama-part-1.html)
