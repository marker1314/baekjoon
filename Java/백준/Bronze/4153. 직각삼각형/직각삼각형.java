import java.util.*;	
import java.io.*;

public class Main {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int[] sides = new int[3];
		int[] zeros = {0,0,0};
		sides[0] = Integer.parseInt(st.nextToken());
		sides[1] = Integer.parseInt(st.nextToken());
		sides[2] = Integer.parseInt(st.nextToken());
		while (!Arrays.equals(sides, zeros)) {
			Arrays.sort(sides);
			if (Math.pow(sides[2], 2) == Math.pow(sides[1], 2) + Math.pow(sides[0], 2))
				System.out.println("right");
			else
				System.out.println("wrong");
			
			st = new StringTokenizer(br.readLine());
			sides[0] = Integer.parseInt(st.nextToken());
			sides[1] = Integer.parseInt(st.nextToken());
			sides[2] = Integer.parseInt(st.nextToken());
		}
	}
	
}