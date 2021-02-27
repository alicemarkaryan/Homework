package com.company;

import java.util.Scanner;

public class homeworkp2c1 {
    public static void main (String[] arg){

        Scanner x = new Scanner(System.in);
        System.out.println("Enter the number...");
        int i=x.nextInt();
        System.out.println(func(i));
    }
    static int func(int i){
        if(i==0){
            return 0;
        }
        int sum=0;
        sum=sum+i%10;
        return sum+func(i/10);
    }
}
