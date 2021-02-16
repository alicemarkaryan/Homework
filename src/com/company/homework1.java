package com.company;

public class homework1 {
    public static void main (String[] args){
        double[] arr = {7, 5, 3, 8, 2, 9};
        System.out.println(average(arr));
    }

    static double average(double[] arr) {
        double sum = 0;
        int i;
        for (i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        double average1 = sum / i;

        return average1;

    }
}
