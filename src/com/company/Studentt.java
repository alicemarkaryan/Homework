package com.company;

public class Studentt {
    private int idNumber;
    private String fullName;
    private double weight;
    private String colorSkin;


    public int getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(int idNumber) {
        this.idNumber = idNumber;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getColorSkin() {
        return colorSkin;
    }

    public void setColorSkin(String colorSkin) {
        this.colorSkin = colorSkin;
    }

    public Studentt(int idNumber, String fullName, double weight, String colorSkin){
        this.idNumber=idNumber; this.fullName=fullName; this.weight=weight; this.colorSkin=colorSkin;
    }

    public void g(){
        System.out.println("this is Student");
    }



    public String k(){
        return "Studen";
    }

@Override
    public boolean equals(Object s){
        if(!(s instanceof Studentt)){
            return false;
        }
        Studentt st=(Studentt) s;
        if(st.getIdNumber()!=this.getIdNumber()){
            return false;
        }
        if(!(st.fullName.equalsIgnoreCase(this.getFullName()))){
            return false;
        }
        if(st.getWeight()!=this.getWeight()){
            return false;
        }

        if(!(st.getColorSkin().equals(this.getColorSkin()))){
            return false;
        }
        return true;

    }

public  String toString(){
        return    getIdNumber()+" "+getFullName()+" "+getWeight()+" "+getColorSkin();

}




}

