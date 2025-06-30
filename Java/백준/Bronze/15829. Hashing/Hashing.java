import java.util.*;
import java.io.*;
import java.math.*;

public class Main {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String alp = "abcdefghijklmnopqrstuvwxyz";
		int size = Integer.parseInt(br.readLine());
		BigInteger res;
		res = BigInteger.valueOf(0);
		String temp = br.readLine();
		
		for (int i = 0; i < size; i++) 
			res = res.add(BigInteger.valueOf((long)(Math.pow(31, i) * (alp.indexOf(temp.charAt(i)) + 1))));

			
		System.out.println(res);
		
	}
	
}