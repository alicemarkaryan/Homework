//package com.company;
//
//public class Iphone12 extends Iphone5 {
//    private int waterProofMinutes;
//    private String audioFeatures;
//
//    Iphone12(String name, int memory, int waterProofMinutes, String audioFeatures){
//        super(name,memory);
//        setAudioFeatures(audioFeatures); setWaterProofMinutes(waterProofMinutes);
//    }
//
//    Iphone12(){
//        System.out.println("in default iphone 12");
//    }
//
//    public int getWaterProofMinutes() {
//        return waterProofMinutes;
//    }
//
//    public void setWaterProofMinutes(int waterProofMinutes) {
//        if (waterProofMinutes > 0 && waterProofMinutes < 60) {
//            this.waterProofMinutes = waterProofMinutes;
//        }
//        else{
//            System.out.println("Doesn't exist");
//        }
//    }
//
//    public String getAudioFeatures() {
//        return audioFeatures;
//    }
//
//    public void setAudioFeatures(String audioFeatures) {
//        this.audioFeatures = audioFeatures;
//    }
//}
