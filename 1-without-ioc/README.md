# Spring example
## 1 - Without IoC
Old school app, impossible to test (randomness and time dependent service).

## 2 - With IoC by hand
Service does not instanciate their dependencies. Better but still impossible to test.

## 3 - Testable
Business code abstracted with interfaces. Now we can mock the random and time dependent code. Fully testable

## 4 - Spring
Manual instanciation replace with spring xml. Objects instanciation is delegated to spring (2 "new" keywords in the code base).
