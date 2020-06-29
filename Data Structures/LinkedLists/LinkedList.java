package LinkedLists;

import Arrays.Array;

import java.util.NoSuchElementException;

public class LinkedList {
    private Node first;
    private Node last;

    public void print(){
        Node temp = first;
        System.out.print("[");
        while(temp != null){
            System.out.print(temp.value + ", ");
            temp = temp.next;
        }
        System.out.println("]");
    }

    public int indexOf(int item){
        int index = 0;
        Node temp = first;
        while(temp != null){
            if (temp.value == item) {
                return index;
            }
            temp = temp.next;
            index++;
        }
        return -1;
    }

    public int[] toArray(){
        int[] array = new int[size()];
        Node temp = first;
        int counter = 0;
        while(temp != null){
            array[counter++] = temp.value;
            temp = temp.next;
        }
        return array;
    }
    // below method returns the Array object of Array class we just created in Arrays package
    /*public Array toArray(){
        Array array = new Array(size());
        Node temp = first;
        while(temp != null){
            array.insert(temp.value);
            temp = temp.next;
        }
        return array;
    }*/

    public void addFirst(int item){
        Node node = new Node(item);
        if(isEmpty()){
            first = last = node;
        }else{
            node.next = first;
            first = node;
        }
    }

    public void addLast(int item){
        Node node = new Node(item);
        if(isEmpty()){
            first = last = node;
        }else{
            last.next = node;
            last = node;
        }
    }
    
    public void removeFirst(){
        if (isEmpty()){            // if the list is empty, then throw exception
            throw new NoSuchElementException();
        }
        if (first == last){        // if list has only one element, first and last will be same, so we'll remove them
            first = last = null;
            return;
        }
        Node second = first.next;  // for backup of second node after first
        first.next = null;         // by setting first.next to null, java garbage collector will remove it from memory
        first = second;            // first is removed, so second is now first variable.
    }

    public void removeLast(){
        // [10 -> 20 -> 30 -> 40]
        if (isEmpty()){            // if the list is empty, then throw exception
            throw new NoSuchElementException();
        }
        if (first == last){        // if list has only one element, first and last will be same, so we'll remove them.
            first = last = null;
            return;
        }
        Node previous = getPrevious(last);
        last = previous;
        last.next = null;
    }

    private Node getPrevious(Node node){
        Node current = first;
        while (current != null){
            if (current.next  == node) return current;
            current = current.next;
        }
        return null;
    }

    public boolean contains(int item){
        /*Node temp = first;
        while(temp != null){
            if (temp.value == item) {
                return true;
            }
            temp = temp.next;
        }
        return false;*/
        // insted of using above code, we can reuse the existing code as given below.
        return indexOf(item) != -1;  // -1 will be returned if there is no such element exists, for that only we'll return false.
    }

    public int size(){
        int size = 0;
        Node temp = first;
        while(temp != null){
            size++;
            temp = temp.next;
        }
        return size;
    }

    private boolean isEmpty(){
        return first == null;
    }

    public class Node {
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }

        public boolean isNext(){
            return next != null;
        }
    }
}
