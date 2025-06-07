import java.util.*;

public class Main {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
	
		int n = s.nextInt();
		Map<Integer, Boolean> nList = new HashMap<Integer, Boolean>(n);
		
		for (int i = 0; i < n; i++) {
			nList.put(s.nextInt(), true);
		}
		
		int m = s.nextInt();
		int[] mList = new int[m];
		
		for (int i = 0; i < m; i++) {
			int temp = s.nextInt();
			if (nList.containsKey(temp))
				mList[i] = 1;
			else
				mList[i] = 0;
		}
		
		for(int i = 0; i < m; i++) {
			System.out.println(mList[i]);
		}

		s.close();
	}
	
}