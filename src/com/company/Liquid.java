package com.company;

abstract public class Liquid {
    protected double ml;
    protected String color;


    public Liquid(double ml, String color) {
        this.ml = ml;
        this.color = color;
    }


    public void boilTempr() {
        System.out.println("Water boils at 100 C" + " " + "ml " + ml * ml);
    }

    public void density() {
        System.out.println("density for liquid is "+ml/1000);
    }



public static void main(String[] args) {
    Liquid a = new Coffee(100, "black", 20);
    a.boilTempr();
    Liquid b = new Tea(200, "Green", 30);
    b.boilTempr();



    Liquid[] d = { new Coffee(300, "black",50),
            new Tea(200, "Green", 50)};

    for (Liquid e : d) {
          e.density();

    }



}
    }


