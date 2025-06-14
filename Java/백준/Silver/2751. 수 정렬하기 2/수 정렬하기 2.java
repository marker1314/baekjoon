import java.util.*;
import java.io.*;

public class Main {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int size = Integer.parseInt(br.readLine());
		int[] arr = new int[size];
		
		for (int i = 0; i < size; i++)
			arr[i] = Integer.parseInt(br.readLine());
		
		Arrays.sort(arr);
		for (int i = 0; i < size; i++)
			System.out.println(arr[i]);
	}
	
}
