import java.util.*;
import java.io.*;

public class Main {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int N = Integer.parseInt(br.readLine());
		int[] shirtList = new int[6];
		int[] penList = new int[2];
		int[] res = {0, 0, 0};
		
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < 6; i++) {
			shirtList[i] = Integer.parseInt(st.nextToken());
		}
		
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < 2; i++) {
			penList[i] = Integer.parseInt(st.nextToken());
		}
		
		for (int i = 0; i < 6; i++) {
			while (shirtList[i] > 0) {
				shirtList[i] -= penList[0];
				res[0]++;
			}
		}
		
		res[1] = N / penList[1];
		res[2] = N % penList[1];
		
		System.out.println(res[0]);
		System.out.println(res[1] + " " + res[2]);
	}
	
}