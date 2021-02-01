package com.company;

import java.util.Scanner;

public class xScanner {

  public static void main(String[] args){

        Scanner x = new Scanner(System.in);
        System.out.println("Input the numbers ... ");
            int num1 = x.nextInt();
        int num2 = x.nextInt();
        Scanner y = new Scanner(System.in);
        System.out.println("Input the char ... ");
        char sign = y.next().charAt(0);

        switch (sign) {
            case '+':
                int z = num1 + num2;
                System.out.println(z);
                break;
            case '-':
                int k = num1 - num2;
                System.out.println(k);
                break;
            case '/':
                float a = num1 / num2;
                System.out.println(a);
                break;
            case '*':
                int b = num1*num2;
                System.out.println(b);
                break;
            case '%':
                int c = num1 % num2;
                System.out.println(c);
                break;
            default:
                System.out.println("Wrong user");
        }
            // xndir 2
        x = new Scanner(System.in);
        System.out.println("Input the numbers ... ");
        num1 = x.nextInt();
        num2 = x.nextInt();
        double y1 = (num2>=0 && num2 <= 100)? (num1*num2)/100.0: (num1*105)/100.0;
        System.out.println(y1);

        // xndir 3
      x= new Scanner(System.in);
      System.out.print("Enter the month... ");
      String month= x.next();
      String season;
      switch ( month ) {
          case "December":
          case "January":
          case "February":
              season = "winter";
              System.out.println(season);
              break;
          case "March":
          case "April":
          case "May":
              season = "spring";
              System.out.println(season);
              break;
          case "June":
          case "July":
          case "August":
              season = "summer";
              System.out.println(season);
              break;
          case "September":
          case "October":
          case "November":
              season = "autumn";
              System.out.println(season);
              break;
          default:
              System.out.println("no season");
      }

    }
}