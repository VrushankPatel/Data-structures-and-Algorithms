package LinkedLists;

import Arrays.Array;

import java.util.Arrays;

public class LinkedListDemo {
    void arrayDemo(){
        /*
            * Runtime Complexities for different operations in Linked List
            * Search operation :
                * By Value : O(n)
                * By index : O(n)
            * Insert operation :
                * At the End : O(1)
                * At the beginning : O(1)
                * In the middle : O(n) because first of all we have to search the item
            * Delete operation :
                * At the beginning : O(1)
                * At the End : O(n) because we have to search the second last element in list
                * In the middle : O(n) because first of all we have to search the item
         */
    }
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.addLast(12);
        list.addLast(34);
        list.addLast(23);
        list.addLast(24);
        list.addLast(44);
        list.addLast(84);
        list.removeFirst();
        list.print();
        list.addLast(14);
        list.print();
        list.addFirst(93);
        list.print();
        list.addFirst(124);
        list.addLast(144);
        list.print();
        list.removeLast();
        list.print();
        System.out.println(list.indexOf(93));
        System.out.println(list.contains(93));
        System.out.println("Size = " + list.size());
        list.print();
        int[] array = list.toArray();
        System.out.println(Arrays.toString(array));
    }
}
