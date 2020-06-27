package BigO;

public class BigOSpaceComplexity {
    public static void main(String[] args) {

        // O(1) for single variable declaration
        for (int i = 0; i < 10; i++){      // O(n)
            System.out.print(i);
        }

        // O(n) for n sized array declaration
        // n = length of args
        // O(a + n) can be simplified to O(n)
        String [] names = new String[args.length];     // O(n)
        for (int i = 0; i < names.length; i++){        // O(1)
            names[i] = String.valueOf(i*i);
        }
    }
}
