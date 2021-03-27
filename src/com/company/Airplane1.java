package com.company;

public class Airplane1  implements Flyable1{
    private int speed;

    public void setSpeed(int speed){
        this.speed=speed;
    }
    public int getSpeed(){
        return speed;
    }

    public Airplane1(int speed){
        this.speed=speed;
    }
    @Override
    public int speed(){
        return speed;
    }




@Override
    public int compareTo(Object o){
        Flyable1 a=(Flyable1) o;
        if(this.getSpeed()>a.speed()){
            return 1;
        }
        if(this.getSpeed()<a.speed()){
            return -1;
        }

            return 0;

    }

@Override
    public String toString(){
        return "Airplane's speed is "+getSpeed();
}


}
