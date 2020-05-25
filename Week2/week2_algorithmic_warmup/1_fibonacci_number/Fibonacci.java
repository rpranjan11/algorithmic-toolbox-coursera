import java.util.Scanner;

public class Fibonacci {
  private static long calc_fib(int n) {
    if (n <= 1)
      return n;

    return calc_fib(n - 1) + calc_fib(n - 2);
  }
  
  private static long calc_fib_fast(int n) {
	  if (n <= 1)
	      return n;
	  
	  long[] fib = new long[n];
	  long res = 0;
	  for(int i = 0; i < n; i++) {
		  if(i<2)
			  fib[i] = i;
		  else
			  fib[i] = fib[i-1] + fib[i-2];
		  res = fib[i];
	  }
	  return res;
  }

  public static void main(String args[]) {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();

    System.out.println(calc_fib_fast(n));
  }
}
