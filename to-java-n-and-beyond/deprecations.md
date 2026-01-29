## Deprecations, Removal, and Other Changes

VV

### Deprecations

Deprecate all 32-bit x86 Ports for Removal <br/>
JDK 24<br/>
JEP 479 - Windows (Removed) <br/>
JEP 501 - Linux<br/>

VV

Permanently Disable the Security Manager <br/>
JDK 24<br/>
JEP 486<br/>


VV

## Prepare to Make Final mean Final

JDK 26 <br/>

Prepare to Make Final Mean Final: JEP 500<br/>

Print warning messages when final fields are modified. Eventually modifying final fields will be disabled **by default**. 

New JVM args:

```
--illegal-final-field-mutation=[allow|warn|debug|deny]
--enable-final-field-mutation=[module(s)]
```

VV

## Integrity by Default: 

👉 [Draft JEP 8305968](https://openjdk.org/jeps/8305968) <br/> <br/>

Related JEPs:<br/>
472: Prepare to Restrict the Use of JNI <br/>
498: Warn upon Use of Memory-Access Methods in sun.misc.Unsafe<br/>
500: Prepare to Make Final Mean Final<br/>
