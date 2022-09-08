package free_prac;

import java.util.*;

public class factoto {

	public static void main(String[] args) {
		
		// 스캐너 생성
		Scanner sc = new Scanner(System.in);
		
		// N과 W 받기
		int N, W;
		
		String[] tmp = sc.nextLine().split(" ");
		
		N = Integer.parseInt(tmp[0]);
		W = Integer.parseInt(tmp[1]);
		
		
		String[] word_li = sc.nextLine().split(" ");
		
		int kn = 1; // know 길이
		
		String[] know_li = new String[kn];
		
		
		int t = 0;
		int sp = 0;
		
		
		 
		for (int i = 0; i<word_li.length; i++) {
			
			String word = word_li[i];
			
			if (know_li[0] == null) {
				know_li[0] = word;
				t += 3;
				continue;
			}
			
			
			boolean check_inside = false;
			
			for (sp = 0; sp < know_li.length;sp++) {
				if (know_li[sp].equals(word)) {
					check_inside = true;
					break;
				}
			}
			
			if (check_inside) {
				for (int j =sp; j<know_li.length-1; j++) {
					know_li[j]=know_li[j+1];
				}
				know_li[know_li.length-1] = word;
				t += 1;
//				continue;
			}
			else {
				
				if (know_li.length < N) {
					String[] know_copy = new String[know_li.length];
					System.arraycopy(know_li, 0, know_copy, 0, know_li.length);
					know_li = new String[kn+1];
					System.arraycopy(know_copy, 0, know_li, 0, know_copy.length);
					know_li[know_li.length-1] = word;
					t += 3;
//					continue;
				}
				else {
					int sum = 0;
					for (int z = 0; z<know_li.length; z++) {
						sum += know_li[z].length();
					}
					for (int p = 0; p<know_li.length; p++) {
						if (know_li[p].length() > (sum/know_li.length)) {
//							continue;
						}
						else {
							String[] know_copy = new String[know_li.length];
							System.arraycopy(know_li, 0, know_copy, 0, know_li.length);
							know_li = new String[kn];
							System.arraycopy(know_copy, 0, know_li, 0, know_copy.length);
							know_li[know_li.length-1] = word;
							t += 3;
							break;
							
						}
						
					}
//					continue;
				}
			
			}
			System.out.println("<<know>>");
			for (int sd=1; sd<know_li.length; sd++) {
				System.out.printf("%s ", know_li[sd]);
			}
			System.out.println("");
			System.out.println("<<word>>");
			System.out.println(word);
			System.out.println("t");
			System.out.println(t);
			System.out.println("=======");
			
		}
		
		System.out.println("t의 시간은");
		System.out.println(t);
		System.out.println("입니다.");

	
		
	}// main
}//class
