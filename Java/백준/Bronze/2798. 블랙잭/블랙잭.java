import java.util.*;	
import java.io.*;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int size = Integer.parseInt(st.nextToken());
		int goal = Integer.parseInt(st.nextToken());
		Vector<Integer> cards = new Vector<Integer>(size);
		int res = 0;
		
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < size; i++) {
			cards.add(Integer.parseInt(st.nextToken()));
		}
		
		for (int i = size - 1; i >= 0; i--) 
			for (int j = i - 1; j >= 0; j--) 
				for (int k = j - 1; k >= 0; k--) 
					if (cards.elementAt(i) + cards.elementAt(j) + cards.elementAt(k) <= goal && cards.elementAt(i) + cards.elementAt(j) + cards.elementAt(k) >= res)
						res = cards.elementAt(i) + cards.elementAt(j) + cards.elementAt(k);
		System.out.println(res);
	}
	
}
