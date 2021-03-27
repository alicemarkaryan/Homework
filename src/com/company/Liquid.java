package com.company;

abstract public class Liquid {
    protected double ml;



    public Liquid(double ml) {
        this.ml = ml;
    }


    public void boilTempr() {
        System.out.println("Liquid boils at unknown C");
    }

  abstract  public void density() ;


public static void main(String[] args) {
    Liquid a = new Coffee(100, "black", 20,200);
    a.boilTempr();
    Liquid b = new Tea(200, "Green", 30,200);
    b.boilTempr();
//    Coffee c=new Coffee(200,"black", 80,120);
//    c.density();



    Liquid[] d = { new Coffee(300, "black",50,150),
            new Tea(200, "Green", 50,140)};

    for (Liquid e : d) {
          e.density();

    }



}
    }


