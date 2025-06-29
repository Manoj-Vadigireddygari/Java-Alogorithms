package com.algorithms;
import java.util.LinkedList;

public class LinkedListExample {

    public static void main(String[] args) {

        LinkedList<String>  list = new LinkedList<> ();
        
        list.add("Manoj");
        list.add("Ravi");
        list.add("Suresh");
        list.add("Ramesh");
        System.out.println(list.getFirst());
        System.out.println(list.getLast() + " ");
        System.out.println(list.contains("Ravi"));
        System.out.println(list.size());

        for(String item: list){
            System.out.print(item + " -> ");
        }

        list.remove("Ravi");
         list.forEach(item -> System.out.print(item + " -> "));



}
}
