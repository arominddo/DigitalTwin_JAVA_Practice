package free_prac;

import java.util.*;

import javax.swing.Spring;


public class board_1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String admin_id = "admin";
		String admin_pw = "0000";
		
		String[][] ID_List = new String[100][2];
		
		
		Loop1 : while(true) {
			
			System.out.print("접속할 주소를 입력해 주세요.(프로그램 종료는 \"end\" 입력) >  ");
			
			String tmp = sc.nextLine();
			
			if (tmp.equals("www.oti.com")) {
				System.out.println("");
				
				Loop2 : while(true) {
					
					System.out.println("                ____          ____   ____            ");
					System.out.println(" \\    /\\    /  |      |      |      |    |  |\\    /|       ");
					System.out.println("  \\  /  \\  /   |----  |      |      |    |  | \\  / |   ");
					System.out.println("   \\/    \\/    |____  |____  |____  |____|  |  \\/  |  ");
					System.out.println("                  ------------------");
					System.out.println("                  Welcom OTI World~!");
					System.out.println("                  ------------------\n");
					System.out.println("                  1. 로그인           ");
					System.out.println("                  2. 회원 가입        ");
					System.out.println("                  3. 사이트 종료    \n");
					
					Loop3 : while(true) {
						System.out.print("메뉴를 선택해 주세요. > ");
						int tmp_logmenu = sc.nextInt();
						System.out.println("");
						if (!(1<=tmp_logmenu&&tmp_logmenu<=3)) {
							System.out.println("올바른 메뉴 번호를 선택해 주세요.\n");
							continue;
						} else {
							switch (tmp_logmenu) {
								case 3 :
									System.out.println("                  ------------------");
									System.out.println("                       GOOD BYE~!");
									System.out.println("                  ------------------\n");
									System.out.println("                OTI 사이트를 종료합니다.");
									System.out.println("                     안녕히가세요.");
									System.out.println("---------------------------------------------------");
									System.out.println("---------------------------------------------------");
									break Loop2;
								case 2 :
									System.out.println("                  ------------------");
									System.out.println("                        회원가입    ");
									System.out.println("                  ------------------\n");
									
									Loop4 : while(true) {
										System.out.print("희망 아이디를 적어주세요. > ");
										
										String tmp_id = sc.nextLine();
										System.out.println();
										
										boolean check_id = true;
										
										for (int i = 0; i < ID_List.length; i++) {
											if (tmp_id.equals(ID_List[i][0])) {
												System.out.println("이미 있는 ID 입니다.");
												check_id = false;
												break;
											} // if
										} //for 종료
										if (!check_id) {
											continue Loop4;
										}
									}
							} // switch 종료
						} // 메뉴선택 종료						
					}
				} // while Loop2 종료
				
			} else if (tmp.equals("end")) {
				System.out.println("                  ------------------"  );
				System.out.println("                     프로그램 종료"    );
				System.out.println("                  ------------------\n");
				break Loop1;
			} else {
				System.out.println("\n정확한 주소를 입력해 주세요.\n");
				continue Loop1;
			}
			
		} // Loop1 while 종료
		
		
		
		

	} // main 종료

} // class 종료
