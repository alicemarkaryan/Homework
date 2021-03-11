package com.company;

public class Bicycle {
    private int countWheel;
    private String formSteeringWheel;

    Bicycle(int countWheel, String formSteeringWheel){
        setCountWheel(countWheel); setFormSteeringWheel(formSteeringWheel);
    }
    Bicycle(){
        System.out.println("In default in bicycle");

    }

    public int getCountWheel() {
        return countWheel;
    }

    public void setCountWheel(int countWheel) {
        if(countWheel>1 && countWheel<4)
        this.countWheel = countWheel;
    }

    public String getFormSteeringWheel() {
        return formSteeringWheel;
    }

    public void setFormSteeringWheel(String formSteeringWheel) {
        this.formSteeringWheel = formSteeringWheel;
    }


    public static void  main(String[] args){
        Bicycle b1= new Bicycle(2,"triangle");
        Bicycle b2=new Bicycle(3,"round");
        Motorcycle m1=new Motorcycle(2,"triangle", 160, "square");
        Motorcycle m2=new Motorcycle(3,"triangle",170," round");
        Bicycle b3=new Bicycle();
        Motorcycle m3=new Motorcycle();
        System.out.println(b1.formSteeringWheel);
        System.out.println(m2.getEnginePower());

    }
}
