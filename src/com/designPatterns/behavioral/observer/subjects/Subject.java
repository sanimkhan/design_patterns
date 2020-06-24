package com.designPatterns.behavioral.observer.subjects;

import com.designPatterns.behavioral.observer.observers.Observer;

import java.math.BigDecimal;

public interface Subject {
    public void registerObserver(Observer observer);

    public void removeObserver(Observer observer);

    public void notifyObservers();

    public void setBidAmount(Observer observer, BigDecimal newBidAmount);
}
