package com.company;

import java.util.LinkedList;

public class LinkedListStudy {
    public static void main(String[] args) {
             LinkedList<Integer> l=new LinkedList<>();
             System.out.println(l.size());
             l.add(10);
             l.add(15);
             l.add(20);
             l.add(30);

             l.removeFirst();
             l.removeLast();
             l.addLast(20);
             l.addFirst(50);
            System.out.println(l+" "+l.size());

            int g=l.get(2);
        System.out.println(g);
        int f=l.set(3,g);
        System.out.println(f);
        l.offerFirst(4545);
        System.out.println(l);
        l.offerLast(787);
        System.out.println(l);

        Object[] o=l.toArray();
        for (int i = 0; i < l.size(); i++) {
            System.out.print(l.get(i)+" ");
        }
        System.out.println();

        System.out.println(l.getLast());
        System.out.println(l.pollFirst());
        System.out.println(l.pollLast());

        LinkedList<Studentt> ll=new LinkedList<>();
        ll.add(new Studentt(45,"Armen Armenyan", 85,"white"));
        ll.add(new Studentt(45,"Armen Armenyan", 85,"white"));

        Studentt l0=new Studentt(45,"Armen Armenyan", 85,"white");

        boolean l1=ll.contains(l0);
        System.out.println(l1);
        System.out.println(ll.size());

        Studentt lk=ll.get(1);
        System.out.println(lk);
        System.out.println(lk.getColorSkin());


    }
}
