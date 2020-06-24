package com.designPatterns.behavioral.memento;

public class EmpMemento {
    private int empId;
    private String empName;
    private String empPhoneNo;

    public EmpMemento(int empId, String empName, String empPhoneNo) {
        this.empId = empId;
        this.empName = empName;
        this.empPhoneNo = empPhoneNo;
    }

    public int getEmpId() {
        return empId;
    }

    public String getEmpName() {
        return empName;
    }

    public String getEmpPhoneNo() {
        return empPhoneNo;
    }

    @Override
    public String toString() {
        String str = "Current memento State" + this.empId + " , " + this.empName + " , " + this.getEmpPhoneNo();
        return str;
    }
}

