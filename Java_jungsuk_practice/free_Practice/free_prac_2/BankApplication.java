package free_prac_2;

import java.util.*;

public class BankApplication {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Menu.startMenu();
		
		Menu.selectMenu();
		

	}
	
	static void mennnu() {
		
	}

}




class ScannerOpen {
	public static void scannerOpen() {
		Scanner sc = new Scanner(System.in);
	}
}


class Menu {
	
	Scanner sc = new Scanner(System.in);
	
	public static void startMenu( ) {
		System.out.println("--------------------------------------------------");
		System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
		System.out.println("--------------------------------------------------");
	}
	
	static void selectMenu() {
		
		System.out.print("선택> ");
		ScannerOpen.scannerOpen();
		sc.nextLine();
		
		
	}
	
	
//	void 
}