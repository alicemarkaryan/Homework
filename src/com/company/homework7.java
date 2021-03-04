package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class homework7 {

    public static void main(String[] args) {

//      int [] x = {5, 7, -3, 0, 2, 7, 0, -6, -8};
//      int c = 0;
//      int i = 0;
//      for(int y = 0; y < x.length; y++)
//      {
//          if (x[y] > 0)
//          {
//              ++c;
//          }
//          else if(x[y]<0)
//          {
//              ++i;
//          }
//          else
//          {
//              continue;
//          }
//      }
//            System.out.println("Positive numbers count"+" "+c);
//            System.out.print("Negative numbers count"+" "+i);

//            int [] nums= {7, 10, 11,7, 5, 7, 1, 2, 1};
//            int c = 0;
//            for (int i=0; i< nums.length; i++)
//            {
//                if(nums[0]==nums[i])
//                {
//                    c++;
//                }
//
//            }
//        System.out.println(c-1);
//        int [] x = {6,8,3,5,3,2,1};
//        boolean f = true;
//        for(int  i=0,j=x.length-1 ; i<j; i++, j-- )
//        {
//            if (x[i] != x[j])
//            { f = false;
//               break; }
//        }
//        if(f){
//            System.out.println("palindrome");
//        }
//        else
//        {
//            System.out.println("non palindrome");
//        }
//
//        Scanner x = new Scanner(System.in);
//        System.out.print("Enter the index... ");
//        int y = x.nextInt();
//        int [] arr = {7, 5, 3, 2, 4, 6, 8};
//        int index = y;
//        for (int i = index; i < arr.length-1 ; i++)
//        {
//            arr[i] = arr[i + 1];
//        }
//        for (int i = 0; i < arr.length; i++)
//        {
//            System.out.print(arr[i]+" ");
//        }

//        int [] arr = {1,2,3,0, -5};
//        int max= arr[0];
//        for( int i = 1; i < arr.length; i++)
//        {
//            if(max<arr[i])
//            {
//                max=arr[i];
//            }
//
//        }
//
//        System.out.println(max);
//
//        int [] arr = {8,24,-32,17,0,63};
//
//        int j=0;
//        for(int i =0; i< arr.length; i++)
//        {
//            if(arr[i]>0) {
//                j++;
//            }
//        }
//                int [] posArr=new int [j];
//
//
//        for(int k=0,  i=0; i<arr.length; i++ )
//        {
//            if (arr[i]>0)
//            {
//           posArr[k++]= arr[i];
//            }
//        }
//
//
//        for (int i = 0; i < posArr.length; i++) {
//            System.out.print(posArr[i]+" ");
//
//        }
//        int[] arr = {2,3,5,9,14,7, 11,22,10,15,13,43,40,17};
//        for (int i = 0; i < 14 ; i++) {
//            boolean f = true;
//            for (int j = 0; j <= 100; j++)
//            {
//                for(int k=0; k<100; ++k)
//                {
//                    if(j%k==0)
//                    {
//                        f = false;
//                        break;
//                    }
//
//                    else
//                    {
//                     j=arr[i];
//                     break;
//                    }
//                }
//              break;
//
//            }
//            if (f);
//            System.out.print(arr[i] + " ");

//   int [] x = {9,7,5,3,2,4,8};
//   for(int i=0; i<x.length/2; i++) {
//       int y = x[i];
//       x[i] = x[x.length - 1 - i];
//       x[x.length - 1 - i] = y;
//
//   }
//       for (int i = 0; i < x.length; i++)
//       {
//           System.out.print(x[i] + ",");
//       }
//       int [] nums = { 1, 6, 3, 0, 8, 4, 1, 7 };
//       for(int i = 0; i<nums.length; i++)
//        {
//            for(int j = i+1; j<nums.length; j++)
//            {
//                if(nums[i]>nums[j])
//                {
//                 int  k = nums[i];
//                    nums[i]=nums[j];
//                    nums[j]=k;
//                }
//            }
//        }
//        for( int i = 0; i<nums.length; i++)
//        {
//            System.out.print(nums[i]+" ");
//        }

//int [] [] x = new int [5] [10];
//
//for(int i = 0; i < x.length; i++)
//{
//    for (int j = 0; j < x.length ; j++) {
//        System.out.print(x[i][j]);
//        System.out.println(" ");
//        break;
//
//    }
//
//}
//        int matrix [] [] = new int [3][5];
//    for(int i =0; i<3; i++){
//        for (int j = 0; j < 5; j++) {
//            matrix [i] [j] = i+j;
//        }
//    }
//    for(int i= 0; i< 3; i++){
//        for (int j = 0; j < 5; j++) {
//            System.out.print(matrix [i][j]+" ");
//        }
//        System.out.println(); // prabeln a
//    }

//    int matrix[] [] = new int [] []{
//            {8, 1, 2, 1},
//            {1, 2, 3, 4},
//            {1, 4, 5, 9},
//            {5, 4, 1, 4}
//    };
//    for (int i=0; i<4; i++) {
//
//        System.out.print(matrix[i][0]+ " ");
//
//    }

//    int [] [] matrix = new int [10] [10];
//for(int i =0; i<10;i++){
//    for (int j = 0; j < 10; j++) {
//        System.out.print(matrix[i][j]);
//
//    }
//    System.out.println();
//}
//
//
//        int matrix[] [] = new int [] []{
//                {8, 1, 2, 1},
//                {1, 2, 3, 4},
//                {1, 4, 5, 9},
//                {5, 4, 1, 4}
//        };
//        for (int i=0; i<4; i++) {
//            System.out.print(matrix[i][matrix.length-1-i]+ " ");
//        }








    }
}
