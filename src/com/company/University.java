package com.company;

import java.util.Map;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Objects;



public class University {
    private String name;
    private int age;
    private int studentsCount;


    public University(String name, int age, int studentsCount){
        this.name=name; this.age=age; this.studentsCount=studentsCount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getStudentsCount() {
        return studentsCount;
    }

    public void setStudentsCount(int studentsCount) {
        this.studentsCount = studentsCount;
    }


    @Override
    public String toString() {
        return "University{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", studentsCount=" + studentsCount +
                '}';
    }

@Override
  public  boolean equals(Object o){
      if(!(o instanceof University)){
          return false;
      }
      University s=(University) o;
      if(!(s.getName().equals(this.getName()))){
          return false;
      }
      if(s.getAge()!=this.getAge()){
          return false;
      }
      return true;


    }
    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }


    public static void main(String[] args) {

        University u1=new University("YSU",102,50241);
        University u2=new University("YSU",102,50457);
        University u3=new University("YSU",102,41210);
        University u4=new University("YSU",102,31201);
        University u5=new University("ASUE",46,20412);
        University u6=new University("ASUE",46,15241);
        University u7=new University("ASUE",46,11421);

        HashSet<University> u=new HashSet<>();
        u.add(u1);
        u.add(u2);
        u.add(u3);
        u.add(u4);
        u.add(u5);
        u.add(u6);
        u.add(u7);
        for(University uu: u)
            System.out.println(uu+" ");

    }


}
