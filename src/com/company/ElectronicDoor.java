package com.company;

public class ElectronicDoor implements RightLeftMoveAble,Comparable{
    private String DoorsType;
    protected int length;

    public ElectronicDoor(String DoorsType, int length){
        this.DoorsType=DoorsType;
        this.length=length;
    }
    public ElectronicDoor(){};

    public String getDoorsType() {
        return DoorsType;
    }

    public void setDoorsType(String DoorsType) {
        this.DoorsType = DoorsType;
    }
    @Override
    public int length(){
        return length;
    }
    @Override
    public int compareTo(Object o){
        ElectronicDoor m=(ElectronicDoor) o;
        if(this.length>m.length()){
            return 1;
        }
        if(this.length<m.length()){
            return -1;
        }
        return 0;

    }

    @Override
   public void leftMoveAble(){
        System.out.println("Electronic Door can move left");
    }

    @Override
    public void rightMoveAble(){
        System.out.println("Electronic Door can move right");
    }
    @Override
    public String toString(){
        return "DoorsType is  "+DoorsType+" and length is "+length;
    }
}
