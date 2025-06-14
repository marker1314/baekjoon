import java.util.*;
import java.io.*;

public class Main {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int size = Integer.parseInt(br.readLine());
		int[][] cor = new int[size][2];
		
		for (int i = 0; i < size; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			cor[i][0] = Integer.parseInt(st.nextToken());
			cor[i][1] = Integer.parseInt(st.nextToken());
		}
		
        Arrays.sort(cor, (o1, o2) -> {
            if (o1[0] == o2[0]) {
            	if (o1[1]==o2[1]) {
                	return Integer.compare(o2[2], o1[2]);
                }
                return Integer.compare(o2[1], o1[1]);
            }
            else{
                return Integer.compare(o2[0], o1[0]);
            }
        });
		
		for(int i = size - 1; i > -1; i--) {
			System.out.println(Integer.toString(cor[i][0]) + " " + cor[i][1]);
		}	
	}
	
}
