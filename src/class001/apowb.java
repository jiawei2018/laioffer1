package class001;

/**
 * Evaluate a to the power of b, assuming both a and b are integers and b is non-negative.
 *
 * Examples
 *
 * power(2, 0) = 1
 * power(2, 3) = 8
 * power(0, 10) = 0
 * power(-2, 5) = -32
 */
public class apowb {
    public static long power(int a, int b) {
        // Write your solution here
        boolean sign = false;
        if(b < 0){
          sign = true;
          b = -b;
        }

        if(b == 0){
            return 1;
        }

        if(b == 1){
            return a;
        }
        long tmp = 0;
        tmp = power(a, b / 2);
        return b % 2 ==0 ? tmp * tmp : tmp * tmp * a;
    }

    public static void main(String[] args) {
        System.out.println( power(2,-5));
    }

}
