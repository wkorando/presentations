## Serial GC

* Great for applications with limited resources
* Performance starts to suffer on heap size >100MB
* Fully stop-the-world
* Sometimes selected as the default GC

VV

## Using Serial GC

```
-XX:+UseSerialGC
```

VV
## Recent Changes

* Support for String Deduplication (JDK 18)
VV

## Future of Serial GC

* In maintenance mode, bug fixes and small performance improvements