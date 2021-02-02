package com.company;

import java.util.Scanner;

public class main1 {
    public static void main(String[] args) {

        Scanner num = new Scanner(System.in);
        System.out.println("enter the number ...");
        int x = num.nextInt();
        int y = ((1-x)*25)+(x*44);
        System.out.println(y);



    }

    }