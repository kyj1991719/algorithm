package algospot.LOAN;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * @see https://algospot.com/judge/problem/read/LOAN
 * @author jun
 * input
4
20000000 12 6.8
35000000 120 1.1
40000000 36 0.5
100 120 0.1

 * output
1728691.4686372071
308135.8967737053
1119696.7387703573
0.8375416659
 */
public class Main {
	public static void main(String[] args) {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			int tc = Integer.parseInt(bf.readLine());
			
			for(int t = 0; t < tc; t++) {
				String[] tmp = bf.readLine().split(" ");
				double n = Double.parseDouble(tmp[0]);
				int m = Integer.parseInt(tmp[1]);
				double p = Double.parseDouble(tmp[2])/100;
				
				double seed = 1+(p/12);
				double power = 1;
				double sig = 0;
				for(int i = 0; i < m; i++) {
					sig += power;
					power *= seed;
				}
				
				//n*power - c*sig = 0
				//c=power/sig*n
				System.out.println(String.format("%.12f", power/sig*n));
			}
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}
