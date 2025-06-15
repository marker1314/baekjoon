import java.util.*;
import java.io.*;

public class Main {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int size = Integer.parseInt(br.readLine());
		String[][] info = new String[size][2];
		
		for (int i = 0; i < size; i++) {
			st = new StringTokenizer(br.readLine());
			info[i][0] = st.nextToken();
			info[i][1] = st.nextToken();
		}
		
		Arrays.sort(info, (o1, o2)-> {
			return Integer.compare(Integer.parseInt(o1[0]), Integer.parseInt(o2[0]));
		});

		for(String[] i : info) {
			System.out.println(i[0] + " " + i[1]);
		}	
	}
	
}
