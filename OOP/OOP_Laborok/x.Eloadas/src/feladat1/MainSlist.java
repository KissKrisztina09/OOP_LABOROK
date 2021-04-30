package feladat1;

import java.util.Iterator;

public class MainSlist {
    public static void main(String[] args) {

        Slist list = new Slist();
        for(int i=0; i<10; ++i){
            list.insertFirst(i);
        }
        System.out.println("Elso bejaro: ");
        Iterator iterator = list.createIterator();
        while(iterator.hasNext()){
            System.out.print(iterator.next() + " ");
        }
        System.out.println();
        System.out.println("Masodik beajro: ");
        Iterator iterator2 = list.createIterator();
        System.out.print(iterator2.next() + " ");
        System.out.print(iterator2.next() + " ");
    }
}