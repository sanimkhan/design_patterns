# Observer Pattern
Observer pattern in Java

### Problem Scenario
 - Messaging app like **Twitter**, or **Auction app** can be an example.  
   Where an entity broadcast message, other entities listen.
 - Let's check Auction app as example.
    - There are some bidders, and products.
    - When 1 bidder bids, it transmits messages to a destination.
    - Other bidders observes this destination.

### Participants
- Observer: Listen for transmitted messages. Observer is Bidder from above example.
- Subject:  Transmit messages on state change. Subject is Product from above example.

### When to use
 - The change of a state in one object must be reflected in another object without keeping the objects tight coupled.
 