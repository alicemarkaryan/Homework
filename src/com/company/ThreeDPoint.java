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

     ThreeDPoint p1=new ThreeDPoint(this.getX(), this.getY(), this.z-p.z);

     double c=this.z-p.z; double a=this.getX()-p.getX(); double b=this.getY()-p.getZ();


        if(c<0){
            c=c*(-1);
        }

        System.out.println(p1.TwoPointDistance(p)+" z="+c);

    }






}
