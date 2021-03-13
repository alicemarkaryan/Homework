package com.company;

public class ThreeDPoint extends TwoDPoint {

    private double z; //height

 public   ThreeDPoint(double x, double y, double z){
        super(x,y);
        setZ(z);

    }

    public void setZ(double z) {


            this.z = z;

    }

    public double getZ(){
     return z;
    }


    public void distanceThreeDPoint(ThreeDPoint p){

     ThreeDPoint p1=new ThreeDPoint(this.getX()-p.getX(), this.getY()-p.getY(), this.z-p.z);
     double c=Math.sqrt(Math.pow(this.getX()-p.getX(),2)+Math.pow(this.getY()-p.getY(),2)+Math.pow(this.z-p.z,2));

     System.out.println(c);

    }






}