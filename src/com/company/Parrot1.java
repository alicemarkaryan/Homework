package com.company;

public class Parrot1 implements Flyable1{
    private int speed;

    public Parrot1(int speed){
        this.speed=speed;
    }

    public void setSpeed(int speed){
        this.speed=speed;
    }
    public int getSpeed(){
        return speed;
    }
    @Override
     public int compareTo(Object o){
        Flyable1 p=(Flyable1) o;
        if(this.getSpeed()>p.speed()){
            return 1;
        }
        if(this.getSpeed()<p.speed()){
            return -1;
        }

            return 0;

     }
     @Override
    public int speed(){
        return speed;
    }

     @Override
    public String toString(){
        return "Parrot's speed is "+getSpeed();
     }

}
