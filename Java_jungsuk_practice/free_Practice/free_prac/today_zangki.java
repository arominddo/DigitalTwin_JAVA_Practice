package free_prac;

import java.util.*;

public class today_zangki {

	public static void main(String[] args) {

		// 스캐너 소환
		Scanner sc = new Scanner(System.in);

		// TastCase 값 입력
		int TC = Integer.parseInt(sc.nextLine());

		// 장기판 크기 입력
		int Zang_N = Integer.parseInt(sc.nextLine());

		// 각 알에 해당되는 변수 생성
		String Po = "X";
		String target = "H";
		String venom = "Y";

		// 프로그램 실행
		for (int z = 0; z < TC; z++) {

			// 포의 X,Y 좌표 변수
			int x = 0;
			int y = 0;

			// 장기 리스트 생성
			String[][] zangki = new String[Zang_N][Zang_N];
			

			// 장기 리스트 입력
			for (int i = 0; i < Zang_N; i++) {
				String[] tmp = sc.nextLine().split(" ");
				for (int j = 0; j < tmp.length; j++) {
					zangki[i][j] = tmp[j];
				}
			} // 장기 리스트 입력 종료

			// 포의 위치값 저장
			for (int i = 0; i < zangki.length; i++) {
				for (int j = 0; j < zangki[i].length; j++) {
					if (zangki[i][j].equals(Po)) {
						x = i;
						y = j;
						break;
					}
				}
			} // 포의 위치 값 판별 종료

			// x_값 같은 리스트 생성
			String[] x_li = zangki[x];

			// y_값 같은 리스트 생성
			String[] y_li = new String[Zang_N];

			for (int i = 0; i < Zang_N; i++) {
				y_li[i] = zangki[i][y];
			}

			// 일반 돌의 갯수 저장 변수 생성
			int h_count;

			// 잡을 수 있는 돌의 갯수 저장 변수 생성
			int cnt = 0;

			cnt += zangki_pro(x_li);
			cnt += zangki_pro(y_li);

			System.out.println("TestCase" + (z + 1) + " : " + cnt);

		} // 프로그램 for 문 종료
	} // main void 종료

	public static int zangki_pro(String[] LI) {

		int h_count = 0;
		int cnt = 0;
		boolean front_boolean = true;

		for (int i = 0; i < LI.length; i++) {
			if ((front_boolean == false) && (h_count >= 2)) {
				break;
			} else if (front_boolean == true) {
				if (LI[i].equals("H")) {
					h_count += 1;
					continue;
				} else if (LI[i].equals("Y")) {
					h_count *= 0;
					continue;
				} else if (LI[i].equals("X")) {
					if (h_count >= 2) {
						cnt += 1;
					}
					h_count = 0;
					front_boolean = false;
					continue;
				} else {
					continue;
				}

			} // else if 종료
			else {
				if (LI[i].equals("H")) {
					h_count += 1;
					continue;
				} else if (LI[i].equals("Y")) {
					break;
				} else {
					continue;
				}
			}

		} // for 문 종료

		if (h_count >= 2)
			cnt += 1;

		return cnt;

	}

}
