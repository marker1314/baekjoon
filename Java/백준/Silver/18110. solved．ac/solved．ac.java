import java.util.*;	
import java.io.*;

public class Main {
		
	public static void main(String[] args) throws NumberFormatException, IOException {
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		int[] vote = new int[n];
		
		for (int i = 0; i < n; i++) {
			vote[i] = Integer.parseInt(br.readLine());
		}
		
		Arrays.sort(vote);
		
		int min = (int)Math.round(n * 0.15);
		int max = n - min;
		
		double total = 0;
		
		for (int i = min; i < max; i++) {
			total += vote[i];
		}
		
		System.out.println(Math.round(total / (n - min * 2)));
	}
	
}
        