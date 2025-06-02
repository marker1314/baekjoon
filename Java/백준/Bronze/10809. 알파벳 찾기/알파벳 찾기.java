import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		String alp = "abcdefghijklmnopqrstuvwxyz";
		String temp = s.next();
		
		for(int i = 0; i < alp.length(); i++) {
			System.out.print(temp.indexOf(alp.charAt(i)) + " ");
		}
		
		s.close();
	}
	
}
