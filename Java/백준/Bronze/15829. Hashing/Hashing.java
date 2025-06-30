import java.util.*;
import java.io.*;
import java.math.*;

public class Main {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String alp = "abcdefghijklmnopqrstuvwxyz";
		int size = Integer.parseInt(br.readLine());
		BigInteger res = new BigInteger("0");
		BigInteger num = new BigInteger("31");
		String temp = br.readLine();
		
		for (int i = 0; i < size; i++) {
			num = num.pow(i);
			res = res.add(num.multiply(BigInteger.valueOf(alp.indexOf(temp.charAt(i)) + 1)));
			num = BigInteger.valueOf(31);
		}

			
		System.out.println(res.mod(BigInteger.valueOf(1234567891)));
		
	}
	
}