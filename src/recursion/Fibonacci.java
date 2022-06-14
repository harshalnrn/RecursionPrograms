package recursion;

public class Fibonacci {

    public static void main(String[] args) {
        //take input n and print nth fibonacci value in fibonacci series (0 1 1 2 3 5 8 .... ) with 0 indexed
        //recursive backtracking to compute deep recursion
        System.out.println(getFibonacciValue(4));
    }

    public static int getFibonacciValue(int n) {
        //base conditions for recursion to terminate
        //1
        if (n == 0 || n == 1) return n; //ends recursion
        //2 f(n-1) + f(n-2)
        return getFibonacciValue(n - 1) + getFibonacciValue(n - 2); //each recursive call has a deep recursive stack, where each stack gets completed sequentially
    }
}


/**
 * can represent recursive calls as binary tree
 * withing JVM, method invocations stored in stack frames. debug stack frames in debug mode.
 **/