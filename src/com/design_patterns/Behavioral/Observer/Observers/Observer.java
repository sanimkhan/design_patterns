package com.design_patterns.Behavioral.Observer.Observers;

import java.math.BigDecimal;

public interface Observer {
    public void update(Observer observer,String productName, BigDecimal bidAmount);
}
