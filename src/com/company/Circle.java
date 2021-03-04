package com.company;

public class Circle {
    private double R;
    public int x;
    public  int y;



    public Circle(double R, int x, int y){
        this.R=R; this.x=x; this.y=y;
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

    public double CircleP(){

        return 2*R*3.14;

    }

    public double CircleS(){

        return 3.14*R*R;
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
        System.out.println(c.R+" "+c.x+" "+c.y);
        System.out.println(c.CircleS());
        System.out.println(c.CircleP());
    }
}
