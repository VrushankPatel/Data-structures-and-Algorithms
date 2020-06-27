package BigO;

public class BigOTimeComplexity {
    int n, m;
    int numbers[];
    int numbers2[];
    BigOTimeComplexity(int n, int m){
        this.n = n;
        this.m = m;
        this.numbers = new int[n];
        this.numbers2 = new int[m];
    }
    public void demoBigO(){

        // O(1) : Constant time
        // complexity for constant amount of time for operations
        // for below two operations, complexity will be O(1+1) = O(2)
        // 2 is constant operation so it will become O(1).
        System.out.println("Hello world");   // O(1)
        System.out.println(2 + 3 * 4 / 2);   // O(1)

        // O(n) : Linear time
        // O(n) for n times operation
        for (int i = 0; i < n; i++){    // O(n)
            this.numbers[i] = i*i;
            System.out.print(i);
        }

        System.out.println(); // for new line

        // O(n) : Linear time
        // O(n) for n times iterating over numbers array
        for (int number : numbers) {     // O(n)
            System.out.print(number + " ");
        }

        // O(n) : Linear time
        // for here, O(1 + n + 1) = O(2 + n) which can be simplified as O(n)
        // constants can not make any significent difference in front of n. so we don't consider them for Big O.
        System.out.println("Here it's started");      // O(1)
        for (int i = 0; i < m; i++){                  // O(n)
            this.numbers2[i] = i*2;
            System.out.print(i);
        }
        System.out.println("Here it's ended");        // O(1)

        // O(n) : Linear time
        // for here, O(n + n) = O(2n), again, we'll eliminate the constant which is 2,
        // So, we can simplify it to O(n)
        for (int i = 0; i < n; i++){                  // O(n)
            System.out.print(i);
        }
        for (int i = 0; i < n; i++){                  // O(n)
            System.out.print(i);
        }

        // O(n) : Linear time
        // for below operations Complexity will be O(n + m)
        // Again, it'll be simplified to O(n)
        for (int number : numbers2) {     // O(n)
            System.out.print(number);
        }
        for (int number : numbers) {      // O(m)  because different array
            System.out.print(number);
        }

        // O(n ^ 2) : Quadratic time
        // O(n * n)
        for (int number : numbers) {          // O(n)
            for (int number2 : numbers2){     // O(n)
                System.out.println(number + " __ " + number2);
            }
        }

        // O(n ^ 2) : Quadratic time
        // for below operations, complexity will become O(n + n ^ 2)
        // but n can't make significant difference in front of n ^ 2 so we can simplify it to O(n ^ 2)
        for (int number : numbers){     // O(n)
            System.out.println(number);
        }
        for (int number : numbers) {          // O(n)
            for (int number2 : numbers){     // O(n)
                System.out.println(number + " __ " + number2);
            }
        }

        // O(n ^ 2) : Quadratic time
        // for below operations, complexity will become O(m + n ^ 2)
        // but m can't make significant difference in front of n ^ 2 so we can simplify it to O(n ^ 2)
        for (int number2 : numbers2){     // O(m)
            System.out.println(number2);
        }
        for (int number : numbers) {          // O(n)
            for (int number2 : numbers){     // O(n)
                System.out.println(number + " __ " + number2);
            }
        }

        // O(n ^ 3) : Slower
        // O(n * n * n)
        for (int number : numbers) {          // O(n)
            for (int number2 : numbers2){     // O(n)
                for (int number3 : numbers2){     // O(n)
                    System.out.println(number + " __ " + number2 + " __ " + number3);
                }
            }
        }

        // O(log n) : Logarithmic time => more efficient and scalable then linear and quadric time
        // Binary search is the example of O(log n), we can search element in 19 comparison only in 1 million items.
        // Logarithmic curve slows down at some points as the input size grows.

        // O(2 ^ n) : Exponential curve grows faster and faster
        // Exponential is exact opposite of logarithmic
        // the algorithm that run in exponential time is not be scalable, it'll become very slow very soon.

    }
    public static void main(String[] args) {
        BigOTimeComplexity bigO = new BigOTimeComplexity(10, 12);
        bigO.demoBigO();
    }
}
