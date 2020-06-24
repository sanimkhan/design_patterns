# Mediator Pattern
Mediator pattern in Java

### Problem Scenario
 - Assume there is an warzone.
 - 3 types of units aer fighting- foot soldier, tank, sniper.
 - Rule is- if a unit is attacking, other units should not attack.
 - It will be a hard maintainable code if a unit has to update all other units individualy.

### Solution
 - Implementing Mediator pattern, suppose there is a Commander on top of all units.
 - When a unit is attacking, it can just update status in commander.
 - Other units can check commander status before starting to attack.

### When to use
 - The mediator design pattern is useful when the number of objects grows so large that it becomes difficult to maintain the references to the objects.
 
 