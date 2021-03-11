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

public  String TwoPointDistance(TwoDPoint t) {

    TwoDPoint t1 = new TwoDPoint(this.x - t.x, this.y - t.y);
    double a = this.x-t.x; double b=this.y - t.y;



        if (a < 0 ) {
            a=a*(-1);

        }
       if( b < 0) {

           b=b*(-1);
       }
         return "distance is x=" + a + " y=" + b;



}


public static void main(String[] args){
        TwoDPoint t1=new TwoDPoint(0,5);
        TwoDPoint t2=new TwoDPoint(2,5);
    System.out.println( t1.TwoPointDistance(t2));
        ThreeDPoint th1=new ThreeDPoint(40,2,15);
        ThreeDPoint th2=new ThreeDPoint(70,0,9);
        th1.distanceThreeDPoint(th2);


}

}
