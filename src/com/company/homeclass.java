package com.company;

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
    public class homeclass{
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










