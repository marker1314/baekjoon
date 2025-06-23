import java.util.*;
import java.io.*;

public class Main {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int N = Integer.parseInt(br.readLine());
		HashMap<Integer, Integer> Nlist = new HashMap<Integer, Integer>(N);
		
		st = new StringTokenizer(br.readLine());
		while (st.hasMoreTokens()) {
			int num = Integer.parseInt(st.nextToken());
			if(!Nlist.containsKey(num))
				Nlist.put(num, 1);
			else
				Nlist.put(num, Nlist.get(num) + 1);
		}
		
		int M = Integer.parseInt(br.readLine());
		int[] Mlist = new int[M];
		
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < M; i++) {
			int num = Integer.parseInt(st.nextToken());
			if(Nlist.containsKey(num)) 
				Mlist[i] = Nlist.get(num);
			else
				Mlist[i] = 0;
		} 
		
		for(int i : Mlist)
			System.out.print(i + " ");
	}
	
}