package com.design_patterns.Creational.Builder;

public class Main {

    public static void main(String[] args) {

        Person person1 = new PersonBuilder("James", "Matis").withAge(28).build();
        Person person2 = new PersonBuilder("Andrew", "Corc").withAge(28).withPhone("12398").withAddress("19/20 HH").build();

        System.out.println(person1);
        System.out.println(person2);
    }
}
