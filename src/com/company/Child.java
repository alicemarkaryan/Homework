package com.company;

public class Child {
    private String fullName;
    private int age;

    public Child(String fullName,int age){
        setFullName(fullName); setAge(age);
    }
    Child(){
        System.out.println("In default Child");
    }
    Child(int age){
        setAge(age);
    }

    public void setFullName(String fullName){
        if (fullName.length()>0){
            this.fullName=fullName;
        }
        else
        {
            System.out.println("no name");
        }
    }
    public String getFullName(){
        return fullName;
    }
    public void setAge(int age){
        if(age>0 && age<100){
            this.age=age;
        }
        else
        {
            System.out.println("wrong age");
        }
    }

    public int getAge(){
        return age;
    }
    public int differentOfAge(Child a){
        Child c=new Child(this.age-a.age);
        return this.age-a.age;
    }

public static void main(String[] args){
        Child c1=new Child("Aram Aramyan", 5);
        Child c2= new Child("Ani Stepanyan", 8);
        Parents p1=new Parents("Levon Antonyan",28,500, "singer");
        Parents p2=new Parents("Gohar Sujyan",27,300,"doctor");
        Parents p3=new Parents();
        System.out.println("Age of different is "+p1.differentOfAge(c1));
        System.out.println("Age of different is "+p2.differentOfAge(c2));
        System.out.println("Age of different is "+p1.differentOfAge(c2));
        System.out.println("Age of different is "+p2.differentOfAge(c1));

}



}
