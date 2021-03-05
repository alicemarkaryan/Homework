package com.company;

public class Circle {
    private double R;
    private int x;
    private int y;



    public Circle(double R, int x, int y){
        this.R=R; this.x=x; this.y=y;
    }
    public Circle(double R){
        this.R=R;
    }

    public void setX(int x){
       this.x=x;
    }
    public int getX(){
        return x ;
    }

    public void setY(int y) {
        this.y = y;
    }

        public int getY(){
            return y;
    }

    public void CircleP(){
        if(R>0) {
            System.out.println(2 * R * 3.14);
        }else{
            System.out.println(" Circle doesn't exist");
        }
    }

    public void CircleS() {
        if (R > 0) {
            System.out.println(3.14 * R * R);
        }
        else
        {
            System.out.println("Circle doesn't exist");

        }
    }
    public static void main(String[] args) {

        Circle c = new Circle(20.5, 2, 5);
        System.out.println(c.R+"  "+c.x+" "+c.y);
        c.CircleS();
        c.CircleP();
    }
}
