import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int a = s.nextInt();
		int b = s.nextInt();
		int c = s.nextInt();
		
		System.out.println(a + b - c);
		System.out.println(a * (int)Math.pow(10, (int)Math.log10(b) + 1) + b - c);
		
		s.close();
	}
	
}
