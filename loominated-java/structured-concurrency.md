# Structured Concurrency

## Structured Concurrency Goal

Being able to breakdown a unit of work into concurrent tasks that can be reasoned with.

## Problems with Current State

* Serial execution - slow
* Parallel execution 
	* More difficult to understand stacktraces
	* Stranded threads
	* Lots of work to properly handle all of this behavior (distracting to read)

	
	Nesting structured concurrency scopes?