package com.company;

public class Coffee extends Liquid{

    protected double coffeeGram;
    protected String color;

    protected double water;


    Coffee(double ml, String color, double coffeeGram,double water){
        super(ml);
        this.water=water;
        this.color=color;
        this.coffeeGram=coffeeGram;
    }

@Override

    public void boilTempr(){
        System.out.println("Coffee boils at 96 C");
}


 public void density(){
     System.out.println( "density for coffee is "+(water*coffeeGram/3));
 }
}
