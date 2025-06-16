import java.util.*;
import java.io.*;

public class Main {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		Stack<Integer> stack = new Stack<>();

		int size = Integer.parseInt(br.readLine());
		Vector<String> list = new Vector<String>(size);
		for (int i = 0; i < size; i++) {
			String command = br.readLine();

            if (command.startsWith("push")) {
                int value = Integer.parseInt(command.split(" ")[1]);
                stack.push(value);
            } else if (command.equals("pop")) {
                list.add(stack.isEmpty() ? "-1" : Integer.toString(stack.pop()));
            } else if (command.equals("size")) {
                list.add(Integer.toString(stack.size()));
            } else if (command.equals("empty")) {
                list.add(stack.isEmpty() ? "1" : "0");
            } else if (command.equals("top")) {
                list.add(stack.isEmpty() ? "-1" : Integer.toString(stack.peek()));
            }
		}
		
		for (int i = 0; i < list.size(); i++)
			System.out.println(list.get(i));
	}  
	
}
