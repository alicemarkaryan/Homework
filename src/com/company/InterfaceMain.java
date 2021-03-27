package com.company;

import java.time.Clock;
import java.util.Arrays;

public class InterfaceMain {
  public static void main(String[] args){
//
//      Flyable1[] f={new Duck1(10), new Duck1(5), new Parrot1(15), new Parrot1(12),
//              new Airplane1(1500),new Airplane1(2000)};

//       Arrays.sort(f);
//
//      for(Flyable1 ff:f){
//          System.out.println(ff);
//
//      }

//
//      Human h=new Human();
//      ClockArrow c=new ClockArrow();
//      ElectronicDoor e=new ElectronicDoor();
//
//      h.moveForward();
//      h.backMoveAble();
//      h.rightMoveAble();
//      h.leftMoveAble();
//      c.backMoveAble();
//      c.moveForward();
//      e.leftMoveAble();
//      e.rightMoveAble();
//
//
//      MoveAble[] m={new Human("Poghos",180), new Human("Ani",185)};
//      RightLeftMoveAble[] r={new ElectronicDoor("Supermarket Doors",220), new ElectronicDoor("Shop doors",215)};
//      BackMoveAble[] b={new ClockArrow("Rolex",20), new ClockArrow("Chopard",15)};
//
//      Arrays.sort(m);
//      Arrays.sort(r);
//      Arrays.sort(b);
//
//      for (MoveAble mm: m){
//          System.out.println(mm.toString());
//      }
//
//      for(RightLeftMoveAble rr: r){
//          System.out.println(rr.toString());
//
//      }
//
//      for(BackMoveAble bb:b){
//          System.out.println(bb.toString());
//      }


      Airplane1[] a1={new Airplane1(2000), new Airplane1(1500),new Airplane1(3000)};
      Parrot1[] p1={new Parrot1(20), new Parrot1(15),new Parrot1(17)};
      Duck1[] d1={new Duck1(10),new Duck1(9), new Duck1(15)};

          GenericClass <Double>gen1=new GenericClass<>(5,8.5);
          double s =gen1.getGenInfo();
      System.out.println(s);
           compareToObject(new Employee("sd",15),new Employee("sf",50));
           compareToObject("dbhngcb","djddan");




  }
  private static <T extends Comparable<T>> int compareToObject(T obj1, T obj2){// hamematelu enq
      return obj1.compareTo(obj2);

  }
}
