package com.design_patterns.Behavioral.Observer;

import com.design_patterns.Behavioral.Observer.Observers.Bidder;
import com.design_patterns.Behavioral.Observer.Observers.Observer;
import com.design_patterns.Behavioral.Observer.Subjects.Product;
import com.design_patterns.Behavioral.Observer.Subjects.Subject;

import java.math.BigDecimal;

public class Main {

    public static void main(String[] args) {

        Subject product = new Product("36 inch LED TV", new BigDecimal(350));

        Observer bidder1 = new Bidder("Alex Parker");
        Observer bidder2 = new Bidder("Henry Smith");
        Observer bidder3 = new Bidder("Mary Peterson");

        product.registerObserver(bidder1);
        product.registerObserver(bidder2);
        product.registerObserver(bidder3);

        product.setBidAmount(bidder1, new BigDecimal(375));

        product.removeObserver(bidder2);

        product.setBidAmount(bidder3, new BigDecimal(400));
    }
}
