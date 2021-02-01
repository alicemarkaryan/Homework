package com.company;

import java.util.Scanner;

public class main1 {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.println("grel tvery");
        int a = x.nextInt();
        int b = x.nextInt();
        Scanner y = new Scanner(System.in);
        System.out.println("nshany");
        char sign = y.next().charAt(0);

        switch (sign) {
            case '+':
                System.out.println(a + b);
                break;
            case '-':
                System.out.println(a - b);
                break;
            default:
                System.out.println("NOt");
        }
    }
}