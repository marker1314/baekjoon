import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int loop = s.nextInt();
		Vector<Integer> list = new Vector<Integer>(loop);
		Vector<String> stringList = new Vector<String>(loop);
		
		for (int i = 0; i < loop; i++) {
			list.add(s.nextInt());
			stringList.add(s.next());
		}
		
		for (int i = 0; i < loop; i++) {
			for (int j = 0; j < stringList.get(i).length(); j++) {
				for (int k = 0; k < list.get(i); k++) {
					System.out.print(stringList.get(i).charAt(j));
				}
			}
			System.out.println("");
		}

	}
	
}
