package com.designPatterns.behavioral.memento;

public class Main {

    public static void main(String[] args) {

        EmpOriginator empOriginator = new EmpOriginator(306, "Mark Ferguson", "1234");

        EmpMemento empMemento = empOriginator.saveToMemento();
        EmpCaretaker empCaretaker = new EmpCaretaker();
        empCaretaker.addMemento(empMemento);
        System.out.println("\nOriginal EmpOriginator");
        empOriginator.printInfo();

        System.out.println("\nEmpOriginator after updating phone number");
        empOriginator.setEmpPhoneNo("5678");
        empMemento = empOriginator.saveToMemento();
        empCaretaker.addMemento(empMemento);
        empOriginator.printInfo();

        System.out.println("\nEmpOriginator after undoing designation update");
        empMemento = empCaretaker.getMemento();
        empOriginator.restore(empMemento);
        empMemento = empCaretaker.getMemento();
        empOriginator.restore(empMemento);
        empOriginator.printInfo();
    }
}
