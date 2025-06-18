import java.util.*;
import java.io.*;

public class Main {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		Queue<Integer> queue = new LinkedList<Integer>();

		int size = Integer.parseInt(br.readLine());
		Vector<String> list = new Vector<String>(size);
		for (int i = 0; i < size; i++) {
			String command = br.readLine();

            if (command.startsWith("push")) {
                int value = Integer.parseInt(command.split(" ")[1]);
                queue.offer(value);
            } else if (command.equals("pop")) {
                list.add(queue.isEmpty() ? "-1" : Integer.toString(queue.poll()));
            } else if (command.equals("size")) {
                list.add(Integer.toString(queue.size()));
            } else if (command.equals("empty")) {
                list.add(queue.isEmpty() ? "1" : "0");
            } else if (command.equals("front")) {
                list.add(queue.isEmpty() ? "-1" : Integer.toString(queue.peek()));
            } else if (command.equals("back")) {
                list.add(queue.isEmpty() ? "-1" : Integer.toString(((LinkedList<Integer>) queue).getLast()));
            }
		}
		
		for (int i = 0; i < list.size(); i++)
			System.out.println(list.get(i));
	}  
	
}