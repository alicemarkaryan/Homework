package com.company;

public class ClockArrow implements MoveAble,BackMoveAble {
    private String name;
    protected int length;

    public ClockArrow(String name, int length){
        this.name=name;
        this.length=length;
    }
    public ClockArrow(){};
    @Override
    public int length(){
        return length;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    @Override
    public void moveForward(){
        System.out.println("Clock's arrows   can move forward");
    }
    @Override
    public void backMoveAble(){
        System.out.println("Clock's arrows  can move back");
    }
    @Override
    public String toString(){
        return "Clock name is "+ name+" and length is "+length ;
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
}
