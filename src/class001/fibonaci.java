package class001;

/**
 * Get the Kth number in the Fibonacci Sequence.
 * (K is 0-indexed, the 0th Fibonacci number is 0 and the 1st Fibonacci number is 1).
 *
 * Examples
 *
 * 0th fibonacci number is 0
 * 1st fibonacci number is 1
 * 2nd fibonacci number is 1
 * 3rd fibonacci number is 2
 * 6th fibonacci number is 8
 */

public class fibonaci {
    public static long fibonacci(int K) {
        // Write your solution here
        long[] fibo = new long[K + 1];
             fibo[1] = 1l ;

         for(int i = 2; i <= K; i++ ){
             fibo[i] = fibo[i - 1] + fibo[i - 2];
         }

         return fibo[K ];
    }

    public static void   main(String[] args){
        System.out.println(fibonacci(50));
    }

}
