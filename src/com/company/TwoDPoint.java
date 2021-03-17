package com.company;

public class TwoDPoint {
    private double x; // x=width
    private double y; // y=length
    TwoDPoint(double x, double y){
        setX(x); setY(y);

    }
public void setX(double x) {


        this.x = x;

}
public double getX(){
        return x;
}

public void setY(double y){

            this.y=y;


}

public double getY(){
        return y;
}

public  double TwoPointDistance(TwoDPoint t) {

    double a = this.x-t.x; double b=this.y - t.y;

        double k = Math.sqrt(Math.pow(a,2)+Math.pow(b,2));

    return k;
    }
    public static void main(String[] args){
        TwoDPoint t1=new TwoDPoint(5,9);
        TwoDPoint t2=new TwoDPoint(8,5);
        System.out.println("distance is"+ t1.TwoPointDistance(t2));
        ThreeDPoint th1=new ThreeDPoint(5,9,15);
        ThreeDPoint th2=new ThreeDPoint(8,5,5);
        System.out.println( th1.distanceThreeDPoint(th2));


}

}
