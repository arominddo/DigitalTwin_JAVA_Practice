package free_prac;

import java.util.*;

public class prac2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int[][] stu_score = new int[2][];
		stu_score[0] = new int[1];
		stu_score[1] = new int[0];
		
		
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
				
				if (1 <= select_num && select_num <= 5) { 
				
					switch (select_num) {
						case 5 :
							System.out.println("프로그램 종료\n");
							break Loop1;
						case 1 :
							System.out.print("학생수> ");
							int student_num = sc.nextInt();
							
							stu_score[0][0] = student_num;
							System.out.println();
							
	
							stu_score[0][0] = student_num;
							stu_score[1] = new int[student_num];
							break;
						case 2 :
							if (stu_score[1].length == 0) {
								System.out.println("등록된 학생이 없습니다.\n");
								break;
							} else {
								System.out.println("점수를 입력해주세요.");
								for (int i=0; i < stu_score[1].length; i++) {
									System.out.printf("score[%d]> ",i);
									int tmp = sc.nextInt();
									stu_score[1][i] = tmp;
								} // for 끝
								System.out.println("");	
								break;
							}
						case 3 :
							if (stu_score[1].length == 0) {
								System.out.println("입력된 성적이 없습니다.\n");
								break;
							} else {
								System.out.println("점수를 확인해주세요.");
								for (int i=0; i < stu_score[1].length; i++) {
									System.out.printf("scores[%d]> %d\n",i,stu_score[1][i]);
								}
								System.out.println("");
								break;
							}
						case 4 :
							if (stu_score[1].length == 0) {
								System.out.println("입력된 성적이 없습니다.\n");
								break;
							} else {
								System.out.println("학생 점수 분포입니다.");
								
								int max = stu_score[1][0];
								int sum = 0;
								
								for (int i=0; i < stu_score[1].length; i++) {
									if (stu_score[1][i] > max) {
										max = stu_score[1][i];
									}
									sum += stu_score[1][i];
								}
								
								System.out.printf("최고 점수: %d\n", max);
								System.out.printf("평균 점수: %.1f\n\n", ((double)sum/stu_score[1].length));
								break;
							}
						
					} // switch 끝
				} else {
					System.out.println("1~5 사이 메뉴를 선택해주세요.\n");
					continue;
				}// if(1~5선택) 끝
	
			} // while 끝
			
		
	} // main 끝
} // class 끝