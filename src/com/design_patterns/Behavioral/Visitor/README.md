# Visitor Pattern
Visitor pattern in Java

### Problem Scenario
[Problem scenario example](https://github.com/sanimkhan/design_patterns/tree/master/src/com/design_patterns/Behavioral/Visitor/Problem "Problem scenario")
 - Above scenario serves functional application.
 - But its hard to maintain.
 - Change in requirements are difficult to implement.
   Ex- **New requirement** comes in to provide support for Linux.  
   We need to update [MailClient](https://github.com/sanimkhan/design_patterns/tree/master/src/com/design_patterns/Behavioral/Visitor/Problem/MailClient.java "MailClient") , need to add another configuration **configureForLinux()** 
 - If there are large number of **MailClient** implementation, like 30 or more, then current implementation will be very difficult to maintain.

### When to use
 - Need to define a new operation without introducing the modifications to an existing object structure.