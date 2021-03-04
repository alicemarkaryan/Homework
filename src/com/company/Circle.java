package com.company;

public class Circle {
    private double R;
    public int x;
    public  int y;
    private  double Pi;


    public Circle(double R, int x, int y){
        setR(R); this.x=x; this.y=y;
    }
    public Circle(double R){
        setR(R);
    }

    public void setR(double R){
        if(R>0){
            this.R=R;
        }
        else{
            System.out.println("Circle doesn't exist");
        }
    }

    public double CircleP(double R, double Pi){
        setR(R);
        return 2*R*Pi;

    }

    public double CircleS(double R, double Pi){
        setR(R);
        return Pi*R*R;
    }



    public double getR(){
        return R;
    }


    public int getX(){
        return x;
    }
    public int getY(){
        return y;
    }


    public static void main(String[] args) {

            Circle c = new Circle(20.5, 2, 5);
        double res = c.CircleP(20.5, 3.14);
        double res1= c.CircleS(20.5, 3.14);
        System.out.println(res);
        System.out.println(res1);

    }
}
