package free_prac;

import java.util.*;

import javax.swing.Spring;
public class dfdfdfdfdfd {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
//		int[] num = new int[2];
//		num[0] = 5;
//		System.out.println(num[1]);
//		
//		int b;
//		
//		int a = 5;
//		System.out.println(a);
//		
//		int[] num2 = new int[3];
//		
//		int[][] num3 = new int[1][2];
//		System.out.println(num3[0][1]);
//		
//		
//		switch (num[0]) {
//			case 5:
//				b = 4;
//			default :
//				b= 3;
//		}
//		System.out.println(b);
//		int[][] aaa = new int[2][];
//		aaa[0] = new int[5];
//		aaa[1] = new int[1];
//		
////		aaa[0] = new int[4];
//		System.out.println(aaa[0][2]);
//		System.out.println(aaa.length);
//		System.out.println(aaa[0].length);
//		System.out.println(aaa[1].length);
//		String a = "dkdkdk";
//		System.out.println(a == "dkdkdk");
//		
//		String dd = sc.nextLine();
//		System.out.println(dd);
//		System.out.println(dd.equals("djajsl"));
//		String[][] dd = new String[5][2];
//		dd[0][0] = "14";
//		System.out.println(dd[0][0]);
//		
//		int A = 5;
//		
//		Loop2: while()
		
		String[][] board = new String[10][5];
		
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j<board[i].length; j++) {
				board[i][j] = "ff";
			}
		}
		board[5][1] = null;
		board[5] = null;
		
//		System.out.println(board[5][3]);
//		System.out.println(board[5][1]);
//		System.out.println(board[6][1]);
		
		board[5] = new String[5];
		board[5][3] = "asdg";
		
		System.out.println(board[5][3]);
		System.out.println(board[5][1]);
		System.out.println(board[6][1]);

	} // main

} // class
