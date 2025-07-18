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

Will remain in incubator until integration of Valhalla features

vv

## Foreign Function & Memory API 

Provide an API that allows Java programs to operate with code and data outside the Java program. The API improves on JNI by being less brittle and dangerous.

vv

## Foreign Function & Memory API
JDK 22 <br/>
JEP 454 
vv

## Jextract Tool

A tool for mechanically generating Java bindings from a native library's headers. 

More info 👉 [https://github.com/openjdk/jextract](https://github.com/openjdk/jextract)

vv

## Why Project Panama

Improve upon the existing Java Native Interface (JNI) with an improved API that makes debugging and memory management easier, and address security concerns and safety issues related to JNI.

Allow Java applications take advantage of native libraries while still writing Java, and not having to write in the libraries native language.

vv

## Next steps

* [Project Panama OpenJDK](https://openjdk.org/projects/panama/)
* [Dev mailing list](https://mail.openjdk.org/mailman/listinfo/panama-dev)
* [Foreign Function and Memory API](https://www.youtube.com/watch?v=Bhh07Rz5enw)
