package com.company;

public class Tv {
    private String color;
    private int price;
    private double length;
    private double weight;
    private String model;



    public Tv(String model, int price, double length, double weight, String color){
     setWeight(weight); setPrice(price); setLength(length);  setColor(color); setModel(model);
    }

    public Tv(String color, String model, int price){
      this.color=color; this.model=model; this.price=price;
    }
    public void setWeight(double weight){
        if(weight >5 && weight <10){
            this.weight=weight;
        }
   }

   public double getWeight(){
        return weight;
   }

   public void setPrice(int price){
        if(price>0 && price<10000){
            this.price=price;
        }
   }
   public int getPrice(){
        return price;
   }

   public void setLength(double length){
        if(length>4 && length<100){
            this.length=length;
        }
   }

   public double getLength(){
        return length;
   }

   public void setColor(String color){
        if(color.charAt(0)=='w'|| color.charAt(0)=='b'){
            this.color=color;
        }
        else{
            System.out.println("wrong color");
        }
   }
   public String getColor(){
        return color;
   }

   public void setModel(String model){
        if(model.charAt(0)=='s' || model.charAt(0)=='l'){
            this.model=model;
        }
        else{
            System.out.println("wrong model");
        }
   }
   public String getModel(){
        return model;
   }

    public static void main(String[] args){
     Tv t1=new Tv("Galaxy",20000,200,6000,"red");
     Tv t2= new Tv("white","sony",3000);
     Tv t3=t1;
     t3.price=1500;
        System.out.println(t1.price);
        System.out.println(t2.model+" "+t2.color+" "+t2.price);
    }


}


