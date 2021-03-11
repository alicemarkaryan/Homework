package com.company;

public class Motorcycle extends Bicycle{
   private int enginePower;
   private String formProp;

   public Motorcycle(int countWheel, String formSteeringWheel, int enginePower, String formProp){
       super(countWheel,formSteeringWheel);
       setEnginePower(enginePower); setFormProp(formProp);

   }

   Motorcycle(){
       System.out.println("in default in Motorcycle");

   }

    public int getEnginePower() {
        return enginePower;
    }

    public void setEnginePower(int enginePower) {
        if (enginePower > 150 && enginePower < 300) {
            this.enginePower = enginePower;
        }
    }
    public String getFormProp() {
        return formProp;
    }

    public void setFormProp(String formProp) {
        this.formProp = formProp;
    }




}
