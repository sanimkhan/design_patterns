# Observer Pattern
Observer pattern in Java

### Problem Scenario
 - Messaging app like **twitter**, or auction app can be an example.  
   Where an entity broadcast message, other entities listen.
 - Let's check Auction app as example.
    - There are some bidders, and products.
    - When 1 bidder bids, it transmits messages to a destination.
    - Other bidders observes this destination.

### When to use
 - Need to define a new operation without introducing the modifications to an existing object structure.
 
 
### Class diagram 
  ![Class diagram](VisitorClassDiagram.png)