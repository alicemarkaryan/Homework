package com.company;

public class Tv {
    String model;
    String color;
    int price;
    double length;
    double weight;


    public Tv(String model, String color, int price, double weight, double length){
        setModel(model); setPrice(price);setColor(color); setWeight(weight); setLength(length);
    }

    public Tv(int price, double weight, double length){
    setPrice(price); setWeight(weight); this.length=length;
    }

    public void print(){
        System.out.println(model+ " "+color+ " "+price+ " "+weight+" "+length);
    }


    public void setModel(String model){
        if(model.charAt(0)=='s' || model.charAt(0)=='l')
        {
            this.model=model;
        }
    }

    public String getModel(){
        return model;
    }

    public void setColor(String color){
        if(color.charAt(0)=='w' || color.charAt(0)=='b'){
            this.color=color;
        }else{
            System.out.println("wrong color");
        }
    }

    public String getColor(){
        return color;
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
        if(length>0 && length<10000){
            this.length=length;
        }
    }
    public double getLength(){
        return length;
    }
    public void  setWeight(double weight){
        if(weight>0 || weight<10){
            this.weight=weight;
        }
    }

    public static void main(String[] args){
        Tv t1=new Tv("sony", "black", 1000, 7,10);
        t1.print();
        Tv t2=new Tv(5000,9,20);
        Tv t3=t2;
        t3.price=2800;
        System.out.println("price "+t2.price+" "+ t2.weight );
        t3.print();
    }
}

