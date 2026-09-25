# Key Concepts to Harnessing Agentic Code

vv

## AI Agents Need Verification

As AI agents are making decisions as they are writing code, they need a means of determing "correctness". 

Defining business behavior (in a testable way), providing examples and documentation, developing a robust test suite, provide that means of determining "correctness".

vv

## Behavior Driven Development

Defining business logic in a testable way. Typically expressed in "Given-when-then"

```
Given a user with a valid user name and password
When supply both to the login form
And hit submit
Then they should be logged in
```

vv

## Provide Examples

Provide the AI agents with accurate examples to use in end to end testing, or for other validation purposes.

vv

## Provide Documentation

* Architectural documentation
* Security requirements
* Other non-functional requirements

To ensure it's meeting overall busienss needs

vv

## Property Based Testing

Prevent "over-fitting" by defining properties an application must support. 

For example; rather that supply specific first names and last names, define what those fields should support, and allow random test data to be supplied to them.
