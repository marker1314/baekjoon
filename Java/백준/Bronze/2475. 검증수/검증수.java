import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int temp = 0;
		
		for (int i = 0; i < 5; i++) 
			temp += Math.pow(s.nextInt(),2);
		
		System.out.print(temp % 10);
		
		s.close();
	}
	
}
