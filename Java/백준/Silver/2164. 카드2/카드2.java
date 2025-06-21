import java.util.*;
import java.io.*;

public class Main {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		Queue<Integer> list = new LinkedList<>();
		
		for (int i = 0; i < N; i++)
			list.add(i + 1);
		
		int temp = 0;
		while(list.size() > 1) {
			list.poll();
			list.add(list.poll());
		}
		
		System.out.println(list.poll());
	}
	
}