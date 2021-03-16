package com.company;

public class Coffee extends Liquid{

    protected double coffeeGram;


    Coffee(double ml, String color, double coffeeGram){
        super(ml,color);
        this.coffeeGram=coffeeGram;
    }

@Override

    public void boilTempr(){
        System.out.println("Coffee boils at 96 C");
}


 public void density(){
     System.out.println( "density for coffee is "+(ml*coffeeGram/3));
 }
}
