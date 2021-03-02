package com.company;


class Cup {
    String form;
    double height;
    double radius;
    int tail;

    Cup(double r, double h, int t, String f) {
        radius = r;
        height = h;
        tail = t;
        form = f;
    }
    Cup(String f, double r){
        form=f; radius=r;
    }
    Cup(String f, int tail){
        form =f; this.tail=tail;
    }
}

public class homeclass {
    public static void main (String[] args){

        Cup c1=new Cup(5.3,11.5,2,"round");
        Cup c2=new Cup("square", 2.5);
        Cup c3=new Cup("round", 1);
        Cup c4 = c1;
        c4.radius=5;
        System.out.println(c1.radius);
        System.out.println(c2.form+" "+c1.tail);
        System.out.println(c3.form);
        System.out.println(c3.tail+" "+c1.form);
    }
}

class MercedesGLE{
    int year;
    double price;
    String color;
    int mileage;
    double engineVolume;
    String gearbox;
    String bodyStyle;
    String beauty;

    MercedesGLE(int year, double price, int mileage, double engineVolume, String color, String gearbox, String bodyStyle){
        this.year=year; this.price=price; this.mileage=mileage; this.engineVolume=engineVolume;
        this.color=color; this.gearbox=gearbox; this.bodyStyle=bodyStyle;
    }
    MercedesGLE(String beauty, double price, String color){
        this.price=price; this.color=color; this.beauty=beauty;
    }
}
     class homeclass2{
    public static void main(String[] arg) {
        MercedesGLE coupe1 = new MercedesGLE(2020, 120000, 20000, 5.0, "Black", "Automatic",
                "SUV / Truck");
        // currency is USD
        MercedesGLE coupe2 = new MercedesGLE("Very beauty",187000,"Red");
        MercedesGLE coupe3=coupe1;
        coupe3.price=110000;
        System.out.println(coupe2.color+" "+coupe2.price);
        System.out.println(coupe1.price+" "+coupe1.year);
        System.out.println(coupe2.beauty+" "+ coupe1.gearbox+", "+coupe1.engineVolume+", "+coupe1.bodyStyle);

    }
}










