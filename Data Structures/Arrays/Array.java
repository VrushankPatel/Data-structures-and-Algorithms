package Arrays;

public class Array {
    private int[] array;
    private int counter = 0;

    public Array(int length){
        array = new int[length];
    }

    // Time Complexity for insert operation in array
    // O(n)
    public void insert(int number){
        if(array.length == counter){
            int[] newArray = new int[array.length * 2];
            for(int i = 0; i < counter; i++){
                newArray[i] = array[i];
            }
            array = newArray;
        }
        array[counter++] = number;
    }

    public void print(){
        System.out.print("[");
        for(int i = 0; i < counter ; i++){
            System.out.print(this.array[i] + ", ");
        }
        System.out.println("]");
    }

    // Time Complexity for indexOf
    // Best case : O(1) // when we get it at the beginning of array
    // Worst case : O(n)
    int indexOf(int element){
        for (int i = 0; i < array.length; i++){
            if (this.array[i] == element){
                return i;
            }
        }
        return -1;
    }

    // Time Complexity for removeAt
    // Best case : O(1) : when we remove item from end of the array
    // Worst case : O(n)
    void removeAt(int index){
        if(index >= 0 && index < array.length){
            for(int i = index; i < array.length; i++){
                this.array[i] = i != array.length-1 ? this.array[i+1] : 0;
            }
            counter--;
        }
    }

    int largest(){
        int largest = array[0];
        for (int value : array) {
            if (value > largest) {
                largest = value;
            }
        }
        return largest;
    }

    Array reverse(){
        Array reversed = new Array(counter-1);
        for(int i = counter-1 ; i >= 0 ; i--){
            reversed.insert(array[i]);
        }
        return reversed;
    }

    Array intersect(int[] array2){
        Array intersection = new Array(1);
        for (int number : this.array) {
            for (int number2 : array2) {
                if(number == number2){
                    if(intersection.indexOf(number) == -1){
                        intersection.insert(number);
                    }
                }
            }
        }
        return intersection;
    }

    void insertAt(int item, int index){
        // if index is smaller then counter then index will be considered, otherwise counter will insert as regularly
        index = index > counter ? counter : index;
        // OR we can write below code..
        // index = Math.min(index, counter);
        int temp;
        counter++;
        for(int i = index ; i < counter ; i++){
            temp = array[i];
            array[i] = item;
            item = temp;
        }
    }

}
