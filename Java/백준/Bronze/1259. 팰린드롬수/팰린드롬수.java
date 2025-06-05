import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
				
		while(true) {
			Integer input = s.nextInt();
			String str = input.toString();
			boolean res = true;
			
			if (input == 0)
				break;
			
			for(int i = 0; i < str.length(); i++) {
				if (str.charAt(i) != (str.charAt(str.length() - 1 - i)))
					res = false;
			}
			
			System.out.println(res?"yes":"no");
		}
		
		s.close();
	}
	
}