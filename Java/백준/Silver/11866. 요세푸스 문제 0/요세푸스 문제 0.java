import java.util.*;
import java.io.*;

public class Main {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		st = new StringTokenizer(br.readLine());
		int size = Integer.parseInt(st.nextToken());
		int repeat = Integer.parseInt(st.nextToken());
		LinkedList<Integer> list = new LinkedList<Integer>();
		ArrayList<Integer> res = new ArrayList<Integer>(size);
		
		for(int i = 0; i < size; i++)
			list.add(i + 1);
		
		int temp = 0;
		int index = 0;
		while (list.size() > 0) {
			if (index >= list.size())
				index -= list.size();
			if (temp % repeat == repeat - 1) {
				res.add(list.get(index));
				list.remove(index);
				index -= 1;
			}
			temp++;
			index++;
		}
		
		System.out.print("<" + res.get(0));
		for (int i = 1; i < res.size(); i++) {
			System.out.print(", " + res.get(i));
		}
		System.out.print(">");
	}  
	
}