package com.company;

public class Tea extends Liquid {
    protected double herbGram;
    protected String color;
    protected double water;

    Tea(double ml, String color, double herbGram, double water) {
        super(ml);
        this.water=water;
        this.color=color;
        this.herbGram = herbGram;
    }

    @Override

    public void boilTempr() {
        System.out.println("Tea boils at 65-100 C" );
    }


    public void density() {
        System.out.println( "density for tea is "+water + herbGram / 2);
    }
}
