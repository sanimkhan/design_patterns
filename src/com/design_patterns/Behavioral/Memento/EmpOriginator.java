package com.design_patterns.Behavioral.Memento;

public class EmpOriginator {
    private int empId;
    private String empName;
    private String empPhoneNo;

    public EmpOriginator(int empId, String empName, String empPhoneNo) {
        this.empId = empId;
        this.empName = empName;
        this.empPhoneNo = empPhoneNo;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getEmpPhoneNo() {
        return empPhoneNo;
    }

    public void setEmpPhoneNo(String empPhoneNo) {
        this.empPhoneNo = empPhoneNo;
    }

    public EmpMemento saveToMemento() {
        EmpMemento empMemento = new EmpMemento(this.empId, this.empName, this.empPhoneNo);
        return empMemento;
    }

    public void restore(EmpMemento memento) {
        this.empId = memento.getEmpId();
        this.empName = memento.getEmpName();
        this.empPhoneNo = memento.getEmpPhoneNo();
    }

    public void printInfo() {
        System.out.println("ID: " + this.empId);
        System.out.println("Name: " + this.empName);
        System.out.println("Phone Number: " + this.empPhoneNo);
    }
}
