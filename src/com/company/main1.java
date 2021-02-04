package com.company;

import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;
import java.util.Scanner;

public class main1 {
    public static void main(String[] args) {
//
//        Scanner num = new Scanner(System.in);
//        System.out.println("enter the number ...");
//        int x = num.nextInt();
//        int y = ((1-x)*25)+(x*44);
//        System.out.println(y);
//
//       Scanner c = new Scanner(System.in);
//        System.out.println("enter the number...");
//        int mutqiTiv = c.nextInt();
//        int[] numbers1 = {1,2,3,4,5,25,6,7,8,9,10,44};
//        mutqiTiv = numbers1[mutqiTiv];
//        System.out.println(mutqiTiv);

        int [] primeNumber = {3,5,10,7,-11,13,-29};

        boolean allNumbersArePositiv= true;
        for(int i=0; i<primeNumber.length; i++ )
        {
//            if(primeNumber[i] >= 0)
//            {
//                System.out.print(primeNumber[i]+ " ");
//            }
            if(primeNumber[i]<0){
                allNumbersArePositiv = false;
                break;
            }
        }
      if(allNumbersArePositiv==false) { // kam grum enq (!allNUmbersArePositiv)
          System.out.println("Negativ");
      }
      else
      {
          System.out.println("Positiv");
      }
    }

    }