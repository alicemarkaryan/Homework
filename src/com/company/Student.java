package com.company;

public class Student {
    public  int id ;
    private String colorSkin;
    private double height;
    private double weight;
    private int age;
    static int num;


    Student(int age, String colorSkin, double weight, double height) {
        setAge(age);
        this.colorSkin = colorSkin;
        this.weight = weight;
        this.height = height;


        ++num;
        id=num;
    }


    public int getId(){
        return id;
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

        public static void main(String[] args){

        Student s1=new Student(20,"white", 56.5,170.5);
            System.out.println(s1.getId());
            Student s2=new Student(20,"sevmundar", 58,185);
            System.out.println(s2.getId());
            System.out.println(s1.getId());

    }
}

