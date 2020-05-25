import java.util.*;

public class FibonacciSumLastDigit {
    private static long getFibonacciSumNaive(long n) {
        if (n <= 1)
            return n;

        long previous = 0;
        long current  = 1;
        long sum      = 1;

        for (long i = 0; i < n - 1; ++i) {
            long tmp_previous = previous;
            previous = current;
            current = tmp_previous + current;
            sum += current;
        }

        return sum % 10;
    }
    
    private static long getFibonacciSumFast(long n) {
    	if (n <= 1)
            return n;
    	int first = 0;
        int second = 1;

        int res = 0, sum = 1;

        for (long i = 2; i <= n; i++) {
            res = (first + second) % 10;
            first = second;
            second = res;
            sum += res;
        }

        return sum % 10;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();
        long s = getFibonacciSumFast(n);
        System.out.println(s);
    }
}

