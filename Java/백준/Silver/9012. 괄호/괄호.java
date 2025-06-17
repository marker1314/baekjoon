import java.util.*;
import java.io.*;

public class Main {
	
	public static boolean doIt(String input) {
		int open = 1;
		int close = 0;
		if (input.startsWith(")") || input.endsWith("(")) {
			return false;
		}
		
		for(int i = 1; i < input.length(); i++) {
			if(input.charAt(i) == '(') {
				open++;
			}
			else if(input.charAt(i) == ')' && open - close != 0) {
				close++;
			}
			else if(input.charAt(i) == ')' && open - close == 0)
				return false;
		}
		if(open - close == 0)
			return true;
		else 
			return false;
	}
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int size = Integer.parseInt(br.readLine());
		String[] ps = new String[size];
		
		for(int i = 0; i < size; i++) {
			if (doIt(br.readLine())) {
				ps[i] = "YES";
			}
			else {
				ps[i] = "NO";
			}
		}
		
		for (int i = 0; i < size; i++){
			System.out.println(ps[i]);
		}
	}
	
}
