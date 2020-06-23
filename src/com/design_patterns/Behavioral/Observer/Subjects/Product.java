package com.design_patterns.Behavioral.Observer.Subjects;

import com.design_patterns.Behavioral.Observer.Observers.Observer;

import java.math.BigDecimal;
import java.util.ArrayList;

public class Product implements Subject {
    private ArrayList<Observer> observers = new ArrayList<>();
    private String productName;
    private BigDecimal bidAmount;
    private Observer currentBidOwner;

    public Product(String productName, BigDecimal bidAmount) {
        this.productName = productName;
        this.bidAmount = bidAmount;
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
        System.out.println("\n-----------------" + observer + " has withdrawn from bidding----------------");
    }

    @Override
    public void notifyObservers() {
        System.out.println("\n-----------------New bid Notification----------------");
        for (Observer ob : observers) {
            ob.update(this.currentBidOwner, this.productName, this.bidAmount);
        }
    }

    @Override
    public void setBidAmount(Observer observer, BigDecimal newBidAmount) {
        int res = bidAmount.compareTo(newBidAmount);

        if (res == -1) {
            this.currentBidOwner = observer;
            this.bidAmount = newBidAmount;
            notifyObservers();
        } else {
            System.out.println("New bid amount cannot be less or equal to current bid amount: " + this.bidAmount);
        }
    }
}
