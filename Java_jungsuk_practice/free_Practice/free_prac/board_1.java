package free_prac;

import java.util.*;

import javax.swing.Spring;


public class board_1 {

	public static void main(String[] args) {
		
		// 스캐너 불러오기
		Scanner sc = new Scanner(System.in);
		
		// 로그인 변수
		String admin_id = "admin";
		String admin_pw = "0000";
		
		// 회원가입 변수
		int id_num;
		
		// 회원 리스트
		String[][] ID_List = new String[100][2];
		
		//프로그램 시작
		Loop1 : while(true) {
			
			System.out.print("접속할 주소를 입력해 주세요.(프로그램 종료는 \"end\" 입력) >  ");
			
			String tmp = sc.nextLine();
			
			
			// www.oti.com 사이트 접속
			if (tmp.equals("www.oti.com")) {
				System.out.println("");
				
				// www.oti.com 사이트 실행
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
				
					System.out.print("메뉴를 선택해 주세요. > ");
					int tmp_logmenu = sc.nextInt();
					sc.nextLine();
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
								System.out.println("                     안녕히가세요.\n");
								System.out.println("---------------------------------------------------");
								System.out.println("---------------------------------------------------\n");
								break Loop2;
							case 2 :
								System.out.println("                  ------------------");
								System.out.println("                        회원가입    ");
								System.out.println("                  ------------------\n");
								
								Loop3 : while(true) {
									System.out.println("<ID 생성>");
									System.out.print("희망 아이디를 적어주세요. > ");
									
									String tmp_id = sc.nextLine();
									
									
									boolean check_id = true;
									
									for (int i = 0; i < ID_List.length; i++) {
										if (tmp_id.equals(ID_List[i][0])) {
											System.out.println("");
											System.out.println("이미 있는 ID 입니다.\n");
											check_id = false;
											break;
										} // if
									} //for 종료
									if (!check_id) {
										continue Loop3;
									} else {
										
										for (id_num=0; id_num < ID_List.length; id_num++) {
											if (ID_List[id_num][0] == null) {
												ID_List[id_num][0] = tmp_id;
												break Loop3;
											}
										} // for문 종료
										
										
									} // ID check 여부 if문 종료
								} // Loop 3 종료
								
								
								
								Loop4 : while(true) {
									System.out.println("");
									System.out.println("<PW 생성>");
									
									System.out.print("비밀번호를 입력해주세요. > ");
									
									String tmp_pw = sc.nextLine();
									
									System.out.println("");
									System.out.print("(비밀번호 재입력)비밀번호를 확인해주세요. > ");
									
									String tmp_pw_check = sc.nextLine();
									
									if (tmp_pw.equals(tmp_pw_check)) {
										ID_List[id_num][1] = tmp_pw;
										
										System.out.println("");
										System.out.println("*** ID가 생성되었습니다. ***");
										System.out.printf("*** %s님 환영합니다!!! ***\n \n", ID_List[id_num][0]);
										System.out.println("");
										id_num = 0; // id_num 초기화
										continue Loop2;
									} else {
										System.out.println("");
										System.out.println("***비밀번호가 다릅니다. 다시 입력해주세요.***\n");
										continue Loop4;
									}
											
								} // Loop 4 종료
							case 1 :
								System.out.println("                  ------------------");
								System.out.println("                         로그인    ");
								System.out.println("                  ------------------\n");
								
								System.out.println("<ID / PW 입력>");
								System.out.print("아이디를 입력해주세요. > ");
								
								String log_id = sc.nextLine();
								System.out.println("");
								
								System.out.print("비밀번호를 입력해주세요. > ");
								
								String log_pw = sc.nextLine();
								System.out.println("");
								
								for (int i = 0 ; i < ID_List.length; i++) {
									if (log_id.equals(ID_List[i][0])&&log_pw.equals(ID_List[i][1])) {
										System.out.println("로그인이 되었습니다.");
									} else {
										System.out.println("*** 존재하지 않는 ID 또는 PW 입니다. ***\n");
										break; // if 종료
									}
								} // ID, PW 확인
								
					
						} // switch(1~3) 종료
					} // 메뉴선택 if문 종료						
				} // Loop2 종료
						
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
