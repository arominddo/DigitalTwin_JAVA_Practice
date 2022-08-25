package free_prac;

import java.util.*;

public class prac1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int[] stu_score = new int[2];
		
		
	Loop1:	while (true) {
		
				for(int i=0;i<54;i++) {
					System.out.print("-");
				}
				System.out.println("\n1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
				for(int i=0;i<54;i++) {
					System.out.print("-");
				}
				System.out.println("\n");																// 메뉴 표출
				
				
				
				System.out.print("선택> ");
				
				int select_num = sc.nextInt();
				
				switch (select_num) {
					case 5 :
						break Loop1;
					case 1 :
						System.out.print("학생수> ");
						int student_num = sc.nextInt();
						
						stu_score[0] = student_num;
						System.out.println();
//						
//						int scores[] = new int[student_num];
//						stu_score[1] = scores[];
						
						break;
					case 2 :
						for (int i=0; i < stu_score.length; i++) {
							System.out.printf("score[%d]> ",i);
							int tmp = sc.nextInt();
							stu_score[i]
							System.out.println("");
							
						} // for 끝
					
				} // switch 끝
	
			} // while 끝
			System.out.println(student_num);
		
	} // main 끝
} // class 끝