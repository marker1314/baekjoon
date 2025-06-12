import java.util.*;
import java.io.*;

public class Main {
	
	static String[] BFirst = {
			"BWBWBWBW",
			"WBWBWBWB",
			"BWBWBWBW",
			"WBWBWBWB",
			"BWBWBWBW",
			"WBWBWBWB",
			"BWBWBWBW",
			"WBWBWBWB"
	};
	
	static String[] WFirst = {
			"WBWBWBWB",
			"BWBWBWBW",
			"WBWBWBWB",
			"BWBWBWBW",
			"WBWBWBWB",
			"BWBWBWBW",
			"WBWBWBWB",
			"BWBWBWBW"
	};
	
	static int diff(String str1, String str2) {
		int res = 0;
		
		for (int i = 0; i < 8; i++) {
			if (str1.charAt(i) != str2.charAt(i))
				res++;
		}
		
		return res;
	}
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int row = Integer.parseInt(st.nextToken());
		int colum = Integer.parseInt(st.nextToken());
		
		String[] chessBoard = new String[row];
		int min = 90;
		
		for (int i = 0; i < row; i++) {
			chessBoard[i] = br.readLine();
		}
		
		for (int j = 0; j <= row - 8; j++) {
			for (int k = 0; k <= colum - 8; k++) {
				int B = 0, W = 0;
				for (int i = 0; i < 8; i++) {
					B += diff(chessBoard[i + j].substring(0 + k, 8 + k), BFirst[i]);
					W += diff(chessBoard[i + j].substring(0 + k, 8 + k), WFirst[i]);
				}
				min = Math.min(min, Math.min(W, B));
			}
		}
		
		System.out.print(min);
	}
	
}
