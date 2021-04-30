package feladat1;

import java.util.Iterator;

public class Slist {
    //rejected tipus
    //static nested class
    private static class Element{
        Object value;
        Element next;
        // constructor:
        Element(Object value, Element next){
            this.value = value;
            this.next = next;
        }
        Element(Object value){
            this.value = value;
            //this.next = null; implicit nulla a kezdoertek
        }
    }
    //  non static nasted class
    // anonymus inner class
    public Iterator createIterator(){
        return new Iterator() {
            Element actual = head;

            @Override
            public boolean hasNext() {
                return actual != null;
            }

            @Override
            public Object next() {
                Object value = actual.value;
                actual = actual.next;
                return value;
            }
        };
    }
    private Element head; //lista fej, implicit null a kezdoertek, tehat ures

    public void insertFirst(Object value){
        head = new Element(value, head);
    }
}
