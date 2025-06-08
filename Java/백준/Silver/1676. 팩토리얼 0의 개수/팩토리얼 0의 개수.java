import java.util.*;
import java.math.BigInteger;

public class Main {

	public static BigInteger factorial(int n) {
        if (n == 0 || n == 1) {
            return BigInteger.ONE;
        } else {
            return BigInteger.valueOf(n).multiply(factorial(n - 1));
        }
    }
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
	
		int n = s.nextInt();
		BigInteger bi = factorial(n);
		
		String temp = bi.toString();
		int count = 0;
		
        for (int i = temp.length() - 1; i >= 0; i--) {
            if (temp.charAt(i) == '0') {
                count++;
            } 
            else {
                break;
            }
        }
		
		System.out.println(count);
 
		s.close();
	}
	
}   