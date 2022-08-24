package ch02;

import java.util.*;    // Scanner占쏙옙 占쏙옙占쏙옙歐占?占쏙옙占쏙옙 占쌩곤옙

class ScannerEx { 
	public static void main(String[] args) { 
		Scanner scanner = new Scanner(System.in);

		System.out.print("占쏙옙占쌘몌옙 占쏙옙占쏙옙占쏙옙 占싹놂옙 占쌉뤄옙占쏙옙占쌍쇽옙占쏙옙.>");

		String input = scanner.nextLine();
		int num = Integer.parseInt(input); // 占쌉력뱄옙占쏙옙 占쏙옙占쌘울옙占쏙옙 占쏙옙占쌘뤄옙 占쏙옙환

		System.out.println("占쌉력놂옙占쏙옙 :"+input);
		System.out.printf("num=%d%n", num);
	} 
}
