package com.company;

public class Iphone5 {
    private String name;
    private int memory;

    public Iphone5(String name, int memory) {
   setName(name);setMemory(memory);
    }

    Iphone5(){
        System.out.println("In default iphone 5");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMemory() {
        return memory;
    }

    public void setMemory(int memory) {
        if (memory > 32 && memory < 512) {
            this.memory = memory;
        } else {
            System.out.println("wrong memory");
        }
    }

    public static void main(String[] args){
        Iphone5 a1=new Iphone5("iphone",64);
        Iphone5 a2=new Iphone5("iphone", 64);
        Iphone12 b1=new Iphone12("iphone", 125, 30, "Dolby Digital");
        Iphone12 b2=new Iphone12("iphone", 256,40, "Dolby Digital plus" );
        Iphone12 b3=new Iphone12();
        System.out.println(a2.memory);
        System.out.println(b1.getAudioFeatures());
    }


}
