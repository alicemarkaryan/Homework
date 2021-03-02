package com.company;


class Cup {
    String form;
    double height;
    double radius;
    int tail;

    Cup(double r, double h, int t, String f) {
        radius = r;
        height = h;
        tail = t;
        form = f;
    }
    Cup(String f, double r){
        form=f; radius=r;
    }
    Cup(String f, int tail){
        form =f; this.tail=tail;
    }
}

public class homeclass {
    public static void main (String[] args){

        Cup c1=new Cup(5.3,11.5,2,"round");
        Cup c2=new Cup("square", 2.5);
        Cup c3=new Cup("round", 1);
        Cup c4 = c1;
        c4.radius=5;
        System.out.println(c1.radius);
        System.out.println(c2.form+" "+c1.tail);
        System.out.println(c3.form);
        System.out.println(c3.tail+" "+c1.form);
    }
}