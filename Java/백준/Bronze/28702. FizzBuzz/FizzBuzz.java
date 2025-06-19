import java.util.*;
import java.io.*;

public class Main {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String[] list = new String[3];
		int temp = 0, num = 0;
		
		for (int i = 0; i < 3; i++) {
			list[i] = br.readLine();
			try {
				num = Integer.parseInt(list[i]);
				temp = i;
			} catch (NumberFormatException e) {
				continue;
			}
		}
		num += 3 - temp;
		
		if (num % 3 == 0)
			if (num % 5 == 0)
				System.out.print("FizzBuzz");
			else
				System.out.print("Fizz");
		else if(num % 5 == 0)
			System.out.print("Buzz");
		else	
			System.out.println(num);
		
	}
	
}