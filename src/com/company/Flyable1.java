package com.company;

import java.lang.reflect.Array;

public interface Flyable1<T > extends Comparable{
    public int compareTo(Object o);
   public String toString();
   public int speed();
}
