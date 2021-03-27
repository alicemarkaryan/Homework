package com.company;

public class Duck1 implements Flyable1{
    private int speed;


    public Duck1(int speed){
        this.speed=speed;
    }
    public void setSpeed(int speed){
        this.speed=speed;
    }





    public int getSpeed(){
        return speed;
    }
    @Override
    public int speed(){
        return speed;
    }

    @Override
    public int compareTo(Object o){
        Flyable1 d=(Flyable1) o;
        if(this.getSpeed()>d.speed()){
            return 1;
        }
        if(this.getSpeed()<d.speed()){
            return -1;
        }

            return 0;

    }

    @Override
    public String toString(){
        return "Duck's speed is "+getSpeed();
    }
}
