# Memento Pattern
Memento pattern in Java

### Problem Scenario
 - Assume we have a desktop word processing application.
 - The application should allow users undo and return to previous text.

### When to use
 - Used to restore state of an object to a previous state.
 
### Participator
 - Originator:  Whose state needs to be saved.
 - Memento:     Which will hold different states of the Originator. Denies other object access to itself except the Originator.
 - Caretaker:   Manages and safeguards Memento.
 