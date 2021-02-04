package com.company;

public class homework7 {

    public static void main(String[] args) {

      int [] x = {5, 7, -3, 2, 7, -6, -8,};
      int c = 0;
      int i = 0;
      for(int y = 0; y < x.length; y++)
      {
          if (x[y] > 0)
          {
              ++c;
          }
          else
          {
              ++i;
          }
      }
            System.out.println("Positive numbers count"+" "+c);
            System.out.print("Negative numbers count"+" "+i);
    }
}
