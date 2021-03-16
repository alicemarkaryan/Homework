package com.company;

public class Tea extends Liquid {
    protected double herbGram;

    Tea(double ml, String color, double herbGram) {
        super(ml, color);
        this.herbGram = herbGram;
    }

    @Override

    public void boilTempr() {
        System.out.println("Tea boils at 65-100 C" );
    }


    public void density() {
        System.out.println( "density for tea is "+ml + herbGram / 2);
    }
}
