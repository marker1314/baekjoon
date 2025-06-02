import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		String num = "0123456789";
		Long temp = (long)1;
		
		for (int i = 0; i < 3; i++)
			temp *= s.nextLong();
		
		String str = temp.toString();
		
		for (int i = 0; i < 10; i++) {
			System.out.println(str.length() - str.replace(num.valueOf(i), "").length());
		}
		
		s.close();
	}
	
}
