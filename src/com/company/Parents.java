package com.company;

public class Parents extends Child{
    private int salary;
    private String profession;

    public Parents(String fullName, int age, int salary, String profession){
        super(fullName,age);

    }
    Parents(){
        System.out.println("in default parents");
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        if (salary > 100) {
            this.salary = salary;
        }
        else
        {
            System.out.println("less salary");
        }
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }



}
