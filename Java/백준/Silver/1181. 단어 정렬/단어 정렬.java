import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
				
		int size = s.nextInt();
		String[] list = new String[size];
		
		for (int i = 0; i < size; i++) {
			list[i] = s.next();
		}
		
		Arrays.sort(list);
		Arrays.sort(list, (String s1, String s2) -> s1.length() - s2.length());
		list =  Arrays.stream(list).distinct().toArray(String[]::new);
		
		for (String i : list) {
			System.out.println(i);
		}

		s.close();
	}
	
}