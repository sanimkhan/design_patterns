package com.design_patterns.Creational.Builder;

public class Person {
    private String firstName; // required
    private String lastName; // required
    private int age; // optional
    private String phone; // optional
    private String address; // optional

    public Person(PersonBuilder personBuilder) {
        this.firstName = personBuilder.getFirstName();
        this.lastName = personBuilder.getLastName();
        this.age = personBuilder.getAge();
        this.phone = personBuilder.getPhone();
        this.address = personBuilder.getAddress();
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public String getPhone() {
        return phone;
    }

    public String getAddress() {
        return address;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", phone='" + phone + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
