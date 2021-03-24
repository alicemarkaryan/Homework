package com.company;

import java.util.Arrays;

public class InterfaceMain {
  public static void main(String[] args){

      Flyable1[] f={new Duck1(10), new Duck1(5), new Parrot1(15), new Parrot1(12),
              new Airplane1(1500),new Airplane1(2000)};

       Arrays.sort(f);

      for(Flyable1 ff:f){
          System.out.println(ff);

      }



  }
}
