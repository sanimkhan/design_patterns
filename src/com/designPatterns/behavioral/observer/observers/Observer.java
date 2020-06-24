package com.designPatterns.behavioral.observer.observers;

import java.math.BigDecimal;

public interface Observer {
    public void update(Observer observer,String productName, BigDecimal bidAmount);
}
