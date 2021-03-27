package com.company;

public class MainFGeneric{


    public static void main(String[] args) {


        Airplane1 a1 = new Airplane1(2000);
        Airplane1 a2 = new Airplane1(1500);
        Airplane1 a3 = new Airplane1(3000);
        Parrot1 p1 = new Parrot1(20);
        Parrot1 p2 = new Parrot1(15);
        Parrot1 p3 = new Parrot1(17);
        Duck1 d1 = new Duck1(10);
        Duck1 d2 = new Duck1(9);
        Duck1 d3 = new Duck1(15);


        Airplane1[] aa = {a1, a2, a3};
        System.out.println(isIn(aa, a1));

        Parrot1[] pp = {p1, p2,p3};
        System.out.println(isIn(pp, p1));


        Duck1[] dd = {d1, d2};
        System.out.println(isIn(dd, d1));


    }



    static  <T extends Flyable1<T>>  T isIn(T[] x, T y) {


        for (T t : x)
            if (y.equals(t)) {

                return y;
            }
        return null;
    }


//    private static boolean isIn(Parrot1[] pp, Parrot1 p) {
//        return true;
//    }
//
//    private static boolean isIn(Duck1[] dd, Duck1 d) {
//        return true;
//    }
//
//
//    private static boolean isIn(Airplane1[] aa, Airplane1 a1) {
//        return true;
//    }








}




