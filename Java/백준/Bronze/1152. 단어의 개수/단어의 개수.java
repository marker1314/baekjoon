import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		String temp = s.nextLine();
		if (temp.trim() != "")
			System.out.print(temp.trim().split(" ").length);
		else 
			System.out.print(0);
		
		s.close();
	}
	
}
