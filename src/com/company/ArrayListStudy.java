package com.company;

import java.util.ArrayList;
import java.sql.SQLOutput;

import java.util.LinkedList;

public class ArrayListStudy {
    public static void main(String[] args) {
        ArrayList<String> a=new ArrayList<>();
        System.out.println(a.size());
        a.add("Life");
        a.add("is");
        a.add("is");
        a.remove(2);
        a.add("important");
        a.add("for");
        a.add("the present");
        System.out.println(a);
        System.out.println(a.size());
        a.remove("for");
        a.add(3,"in");
        System.out.println(a);
        boolean exists=a.contains("Life");
        System.out.println(exists);
        a.ensureCapacity(1000);
        a.trimToSize();
        for (int i = 0; i <a.size() ; i++) {
            System.out.print( a.get(i)+" ");
        }
        System.out.println();
         Object[] aa=  a.toArray();
        for(Object k : aa){
            System.out.print(k+" ");
        }
        System.out.println();

        ArrayList<Studentt> a1=new ArrayList<>();
        a1.add(new Studentt(15,"Armen Armenyan", 55,"white"));
        a1.add(new Studentt(17,"Armen Armenyan", 54,"white"));
        a1.add(new Studentt(11,"Armen Armenyan", 60,"whi"));
        a1.add(new Studentt(55,"Armen Armenyan", 74,"white"));
        a1.add(new Studentt(45,"Armen Armenyan", 85,"white"));

        Studentt student1= new Studentt(15,"Armen Armenyan", 55,"white");

        exists=a1.contains(student1);
        System.out.println(exists);
        System.out.println(a1.size());


        Studentt a2 =a1.get(2);
        System.out.println(a2.getColorSkin());



    }

}