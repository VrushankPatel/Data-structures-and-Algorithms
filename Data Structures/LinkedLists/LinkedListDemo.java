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
                * At the End : singly linked list : O(n) because we have to search the second last element in list
                * At the End : doubly linked list : O(1)
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
        list.addLast(24);
        list.addLast(89);
        list.addLast(10);
        list.addLast(73);
        list.addLast(92);
        /*list.removeFirst();
        list.addLast(14);
        list.addFirst(93);
        list.addFirst(124);
        list.addLast(144);
        list.removeLast();
        System.out.println(list.indexOf(93));
        System.out.println(list.contains(93));
        System.out.println("Size = " + list.size());
        list.print();
        int[] array = list.toArray();
        System.out.println(Arrays.toString(array));*/
        //list.reverse();
        list.print();
        list.printMiddle();
        System.out.println(list.hasLoop());
        System.out.println(list.getKthFromTheEnd(7));
    }
}
