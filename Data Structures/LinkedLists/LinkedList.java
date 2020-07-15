package LinkedLists;

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

    public void clearList(){
        // [10 -> 20 -> 30 -> 40]
        first = last = null;
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

    public void reverse(){
        // [10 -> 20 -> 30 -> 40]
        if(isEmpty()) return;

        Node previous = first;
        Node current = first.next;

        while(current != null){
            Node next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }

        last = first;
        last.next = null;
        first = previous;   //  because at the end of the loop, current will be null, so the previoud object will be last node.
    }
    /**
     * below method also can be used for reverse the list but it will use another list to traverse through all elements.
    public void reverse(){
        Node temp = first;
        clearList();
        while(temp != null){
            addFirst(temp.value);
            temp = temp.next;
        }
    }*/

    public int getKthFromTheEnd(int k){
        if(isEmpty()){
            throw new IllegalStateException();
        }

        /**
         * below code can validate the k's value
         * but we no longer need this because we can use next to check wether it is null or not in the next while loop.
        if (k > size() || k == 0){
            throw new IllegalArgumentException();
        }*/
        Node current = first;
        Node next = first;

        while (k-- > 1) {
            next = next.next;
            if (next == null){      // if next is null, then k is greater then size of list, so we'll throw exception
                throw new IllegalArgumentException();
            }
        };

        while (next != last){
            current = current.next;
            next = next.next;
        }
        return current.value;
    }

    public void printMiddle(){
        Node a = first;
        Node b = first;

        while (b != last && b.next != last){
            b = b.next.next;
            a = a.next;
        }

        if (b == last)
            System.out.println(a.value);
        else
            System.out.println(a.value + "  " + a.next.value);
    }
    public boolean hasLoop(){       // this function will check if the linked list is looped, ex. : last node has reference of 4th last element. or may be a circular list
        Node slow = first;
        Node fast = first;
        while (fast != last && fast.next != last){
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow || fast.next == slow){
                return true;
            }
        }
        return false;
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
