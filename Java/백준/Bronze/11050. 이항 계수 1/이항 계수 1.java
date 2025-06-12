import java.util.*;	
import java.io.*;

public class Main {
	
	static int fa(int a){
		int res = 1;
		for (int i = 2; i <= a; i++)
			res *= i;
		return res;
	}
    	
	public static void main(String[] args) throws NumberFormatException, IOException {
			
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		
		int res = fa(N) / (fa(N - K) * fa(K));
		
		System.out.println(res);
	}
	
}