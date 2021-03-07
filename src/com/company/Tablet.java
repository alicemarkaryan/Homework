package com.company;

public class Tablet {

    private String color;
    private int memory;
    private String model;
    private double length;

    Tablet(String color, String model, int memory, double length){
        this.color=color; this.model=model; setMemory(memory); setLength(length);
    }

    public void setColor(String color){
        this.color=color;
    }
    public String getColor(){
        return color;
    }
    public void setModel(String model){
        this.model=model;
    }
    public String getModel(){
        return model;
    }

    public void setMemory(int memory){
        if(memory>32){
            this.memory=memory;
        }
    }
    public int getMemory(){
        return memory;
    }

    public void setLength(double length){
        if(length>10){
            this.length=length;
        }
    }

    public double getLength() {
        return length;
    }

    public String print(){
        return  "color "+color+": model "+model+": memory "+memory+": length "+length;

    }

    public static void main(String[] args){
        Tablet t1=new Tablet("white","apple",32, 10.7);
        Tablet t2=new Tablet("black","apple",64, 15.5);
        Tablet t3=new Tablet("red","samsung",32, 20.5);
        Tablet t4=new Tablet("rose","lg",128, 10.7);
        Tablet t5=new Tablet("green","apple",64, 8.1);

        Tablet [] array ={t1,t2,t3,t4,t5};

            for (int i = 0; i < array.length ; i++) {
                System.out.println(array[i].print());
            }
    }
}
