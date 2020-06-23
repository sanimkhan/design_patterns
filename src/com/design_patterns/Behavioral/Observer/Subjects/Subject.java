package com.design_patterns.Behavioral.Observer.Subjects;

import com.design_patterns.Behavioral.Observer.Observers.Observer;

import java.math.BigDecimal;

public interface Subject {
    public void registerObserver(Observer observer);

    public void removeObserver(Observer observer);

    public void notifyObservers();

    public void setBidAmount(Observer observer, BigDecimal newBidAmount);
}
