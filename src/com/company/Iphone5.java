package com.company;

import java.util.Arrays;

public class Iphone5 {
    private String name;
    private int memory;

    public Iphone5(String name, int memory) {
   setName(name);setMemory(memory);
    }

    Iphone5(){
        System.out.println("In default iphone 5");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMemory() {
        return memory;
    }

    public void setMemory(int memory) {
        if (memory > 32 && memory < 512) {
            this.memory = memory;
        } else {
            System.out.println("wrong memory");
        }
    }

//    public static void main(String[] args){
//        Iphone5 a1=new Iphone5("iphone",64);
//        Iphone5 a2=new Iphone5("iphone", 64);
//        Iphone12 b1=new Iphone12("iphone", 125, 30, "Dolby Digital");
//        Iphone12 b2=new Iphone12("iphone", 256,40, "Dolby Digital plus" );
//        Iphone12 b3=new Iphone12();
//        System.out.println(a2.memory);
//        System.out.println(b1.getAudioFeatures());
//
//          Studentt s1=new Studentt(1,"Nubar Nubaryan", 80,"white");
//          Studentt s2=new Studentt(1,"NUbar Nubaryan", 80,"white");
////           System.out.println(s1.equals(s2));
//        Inherited i1=new Inherited(1,"NUbar Nubaryan", 80,"white", 23);
//        Inherited i2 = new Inherited(1,"NUbar Nubaryan", 80,"white",23);
////        System.out.println(i1.equals(i2));
//        Studentt s3=new Inherited(1,"NUbar Nubaryan", 80,"white", 23);
//
//        s3.g();
//        System.out.println(s1.k());







            public static void main(String[] args) {
//                Employee[] employees = {
//                        new Employee("Vazgen Vazgenyan", 700),
//                        new Employee("Vardan Vardanyan", 800),
//                        new Employee("Armen Armenyan", 400)
//                };
//                printEmployees(employees);
//                Arrays.sort(employees);
//                printEmployees(employees);
//
//            }
//            static public void printEmployees(Employee[] employees) {
//                for (Employee employee: employees) {
//                    System.out.println(employee);
//                }
//                System.out.println();


                Parrot p = new Parrot(20);
                Parrot p1 = new Parrot(19);
                Airplane a1 = new Airplane(2000);
                Airplane a2 = new Airplane(3000);
                Airplane a3 = new Airplane(400);
                Duck d = new Duck(10);
                Duck d1 = new Duck(15);
                Flyable[] f = {p, p1, a1, a2, a3, d, d1};
                Arrays.sort(f);
                printAnimal(f);


            }

               public static void printAnimal(Flyable[] f){


                    for (Flyable l : f) {
                        System.out.println(l.toString());
                    }

    }





    }










