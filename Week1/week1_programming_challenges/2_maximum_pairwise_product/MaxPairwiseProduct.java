import java.util.*;
import java.io.*;

public class MaxPairwiseProduct {
    static long getMaxPairwiseProduct(long[] numbers) {
        long max_product = 0;
        int n = numbers.length;

        for (int first = 0; first < n; ++first) {
            for (int second = first + 1; second < n; ++second) {
            	if(max_product < numbers[first] * numbers[second])
            		max_product = numbers[first] * numbers[second];
            }
        }

        return max_product;
    }
    
    static long getMaxPairwiseProductFast(long[] numbers) {
        int n = numbers.length;
        long count = 0, secmax = numbers[0], max = numbers[0];

        for (int first = 1; first < n; ++first) {
        	if(numbers[first] > max) {
        		secmax = max;
        		max = numbers[first];
        		count++;
        	} else if(first == 1) {
        		secmax = numbers[first];
        	} else if(numbers[first] > secmax) {
        		secmax = numbers[first];
        	}
        }

        return secmax * max;
    }

    public static void main(String[] args) {
        FastScanner scanner = new FastScanner(System.in);
        int n = scanner.nextInt();
        long[] numbers = new long[n];
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextLong();
        }
        //System.out.println(getMaxPairwiseProduct(numbers));
        System.out.println(getMaxPairwiseProductFast(numbers));
    }

    static class FastScanner {
        BufferedReader br;
        StringTokenizer st;

        FastScanner(InputStream stream) {
            try {
                br = new BufferedReader(new
                    InputStreamReader(stream));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        String next() {
            while (st == null || !st.hasMoreTokens()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }
        
        long nextLong() {
            return Long.parseLong(next());
        }
    }

}
