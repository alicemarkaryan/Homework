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

    public double distanceThreeDPoint(ThreeDPoint p){

     double c=Math.sqrt(Math.pow(this.getX()-p.getX(),2)+Math.pow(this.getY()-p.getY(),2)+Math.pow(this.z-p.z,2));

     return c;

    }

}
