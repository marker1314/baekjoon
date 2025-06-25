import java.util.*;
import java.io.*;

public class Main {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String input = br.readLine();
		int[] list = new int[13];
		int temp = 0, m = 0;
		
		for (int i = 0; i < 13; i++) {
			try {
				list[i] = Integer.parseInt(Character.toString(input.charAt(i)));
				if (i % 2 == 1)
					m += 3 * list[i];
				else 
					m += list[i];
			} catch(NumberFormatException e) {
				temp = i;
				list[i] = 0;
			}
		}
		
		if (temp % 2 == 1) {
			for(int i = 1; i < 10; i++)
				if((m + 3 * i) % 10 == 0)
					list[temp] = i;
		}
		else {
			for(int i = 1; i < 10; i++)
				if((m + i) % 10 == 0)
					list[temp] = i;
		}
		
		System.out.println(list[temp]);
		
	}
	
}