package algospot.RATIO;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * @see https://algospot.com/judge/problem/read/RATIO
 * @author jun
 * input
5
10 8
100 80
47 47
99000 0
1000000000 470000000

 * output
1
6
-1
1000
19230770
 */
public class Main {
	public static void main(String[] args) {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			int tc = Integer.parseInt(bf.readLine());
			
			for(int t = 0; t < tc; t++) {
				long[] tmp = Arrays.stream(bf.readLine().split(" "))
						.mapToLong(Long::parseLong)
						.toArray();
				long n = tmp[0];
				long m = tmp[1];
				long p = m*100/n;
				p += 1;
				//c(100-(p+1))=(p+1)*n-100*m
				System.out.println(p >= 100 ? -1 : ceil(p*n-100*m, 100-p));
			}
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	static long ceil(long a, long b) {
		return (a + b - 1) / b;
	}
}
