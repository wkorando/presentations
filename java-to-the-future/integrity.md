# Integrity by Default

Have the behavior of code match developers expectations, and protect against unwanted and unsafe behavior.

vv

## The Problem

There are a number of APIs that undermine this expectation including; serialization, reflection, `sun.misc.Unsafe`, JNI. 

## The Goal

Remove or disable by default problemmatic behavior.

## Related JEPs

* JEP 261: Module System
* JEP 260: Encapsulate Most Internal APIs
* JEP 396: Strongly Encapsulate JDK Internals by Default
* JEP 403: Strongly Encapsulate JDK Internals
* JEP 451: Prepare to Disallow the Dynamic Loading of Agents
* JEP 498: Warn upon Use of Memory-Access Methods in sun.misc.Unsafe
* JEP 471: Deprecate the Memory-Access Methods in sun.misc.Unsafe for Removal
* JEP 472: Prepare to Restrict the Use of JNI

## Next steps

JEP draft: Integrity by Default: [8305968](https://openjdk.org/jeps/8305968) 

Integrity by Default - Inside Java Podcast 38: https://youtu.be/mYcHoXVnRmM