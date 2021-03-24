package com.company;

import java.util.Arrays;

public class Human implements MoveAble,RightLeftMoveAble,BackMoveAble{
    private String name;
    protected int length;

    public Human(String name, int length){
        this.name=name;
        this.length=length;
    }
    public Human(){};

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

@Override
    public int length(){
        return length;
    }
    @Override
    public int compareTo(Object o){
        MoveAble m=(MoveAble) o;
        if(this.length>m.length()){
            return 1;
        }
        if(this.length<m.length()){
            return -1;
        }
        return 0;

    }

    @Override
    public void moveForward(){
        System.out.println("human can move forward");
    }
    @Override
    public void rightMoveAble(){
        System.out.println("human can move right");
    }
    @Override
   public void leftMoveAble(){
        System.out.println("human can move left");
   }
   @Override
 public   void backMoveAble(){
       System.out.println("human can move back");
 }

 @Override
    public String toString(){
        return "Human name is "+name+" and length is "+length;
 }

    public static void main(String[] args) {
        Human h=new Human();
        ClockArrow c=new ClockArrow();
        ElectronicDoor e=new ElectronicDoor();

        h.moveForward();
        h.backMoveAble();
        h.rightMoveAble();
        h.leftMoveAble();
        c.backMoveAble();
        c.moveForward();
        e.leftMoveAble();
        e.rightMoveAble();


        MoveAble[] m={new Human("Poghos",180), new Human("Ani",185)};
        RightLeftMoveAble[] r={new ElectronicDoor("Supermarket Doors",220), new ElectronicDoor("Shop doors",215)};
        BackMoveAble[] b={new ClockArrow("Rolex",20), new ClockArrow("Chopard",15)};

        Arrays.sort(m);
        Arrays.sort(r);
        Arrays.sort(b);

        for (MoveAble mm: m){
            System.out.println(mm.toString());
        }

        for(RightLeftMoveAble rr: r){
            System.out.println(rr.toString());

        }

        for(BackMoveAble bb:b){
            System.out.println(bb.toString());
        }

    }
}
