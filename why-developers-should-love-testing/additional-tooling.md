# Additional Tooling

vv

## Separate Execution of Unit and Integration Tests
* Surefire - Unit tests
* Failsafe - Integration tests

Provides isolation when running unit tests and integration tests.

Allows fast running and very reliable units to be executed first. 

Allows different classpaths/dependencies to be used when running unit tests versus integration tests.

vv

## Mutation Testing
* Pitest (PIT)

Manipulates bytecode to validate tests are actually validating behavior.

vv

## AI Generated Tests?

(Many options)

vv

## Property-based Testing

* jqwik

Defining properties that hold true for a range of inputs.

Good for edge case testing, and reducing bias in testing that comes with "traditional" example-based testing.

[Video](https://www.youtube.com/watch?v=rlAbJ3tWw9U)