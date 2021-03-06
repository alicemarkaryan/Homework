package com.company;

public class Student {

    public static int id=1 ;
    private String colorSkin;
    private double height;
    private double weight;
    private int age;



    Student(int age, String colorSkin, double weight, double height) {
        setAge(age);

        this.colorSkin = colorSkin;
        this.weight = weight;
        this.height = height;
        System.out.println("id of "+id+" first student is "+id++);
    }


    public void setAge(int age) {
        if (age > 18 && age < 30) {
            this.age = age;
        }
    }

    public int getAge() {
        return age;
    }


    public void setColorSkin(String colorSkin) {
        this.colorSkin = colorSkin;
    }

    public String getColorSkin() {
        return colorSkin;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getHeight() {
        return height;
    }






    public static void main(String[] args) {
        Student s1 = new Student(20, "white",  60, 170);
        Student s2 = new Student(25, "black", 50, 160);
        Student s3 = new Student(20, "white",  60, 170);
        Student s4 = new Student(25, "black", 50, 160);
        Student s5 = new Student(20, "white",  60, 170);
        Student s6 = new Student(25, "black", 50, 160);
        Student s7 = new Student(20, "white",  60, 170);
        Student s8 = new Student(25, "black", 50, 160);

    }

}


