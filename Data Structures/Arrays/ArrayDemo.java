package Arrays;

public class ArrayDemo {
    void arrayDemo(){
        /*
            * Runtime Complexities (Worst) for different operations in arrays
            * Search operation : O(1) because we access by index in array
            * Insert operation : O(n) to insert element in array
            * Delete operation : O(n) for delete element from beginning because n shift operations will performed
         */
    }
    public static void main(String[] args) {
        Array array = new Array(1);
        array.insert(12);
        array.insert(122);
        array.insert(13);
        array.insert(11);
        array.removeAt(3);
        array.insert(32);
        array.insert(143);
        array.insert(121);
        array.print();
        System.out.println(array.indexOf(1991));
        System.out.println(array.largest());
        array.intersect(new int[]{121,11,143,654,23,11,121}).print();
        array.reverse().print();
        array.insertAt(390,5);
        array.reverse().print();
    }
}
