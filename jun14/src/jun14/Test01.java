package jun14;

import java.util.Arrays;
import java.util.Scanner;

import javax.swing.WindowConstants;

// 가위1 < 바위2 바위2 > 보3 보3< 가위1
// 가위 = 가위 바위 = 바위 보 = 보 다시 뽑아주세요

// 승패 저장
// 10번 게임 끝나면 승률 출력
// 승률 = 총경기수 / 승리한 경기수
//      =      10  /
public class Test01 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("가위바위보 게임을 시작합니다.");

		System.out.println("선택 : 1. 가위 2. 바위 3. 보 ");
		int result = (int) (Math.random() * 3 + 1);

		int[] win = new int[10];
		int[] lose = new int[10];
		int[] draw = new int[10];
		int wincount = 0;
		int losecount = 0;
		int drawcount = 0;
		double winRate = 0;

		for (int i = 1; i <= 10; i++) {
			int input = sc.nextInt();
			System.out.println(result);
			if (input == 1) {
				if (input == result) {
					System.out.println("비겼습니다. 다시 뽑아주세요.");
					draw[i - 1] = drawcount++;
					continue;
				} else if (result == 2) {
					System.out.println("졌습니다.");
					lose[i - 1] = losecount++;
					continue;
				} else {
					System.out.println("이겼습니다.");
					win[i - 1] = wincount++;
					continue;
				}
			}
			if (input == 2) {
				if (input == result) {
					System.out.println("비겼습니다. 다시 뽑아주세요.");
					draw[i - 1] = drawcount++;
					continue;
				} else if (result == 1) {
					System.out.println("이겼습니다.");
					win[i - 1] = wincount++;
					continue;
				} else {
					System.out.println("졌습니다.");
					lose[i - 1] = losecount++;
					continue;
				}
			}
			if (input == 3) {
				if (input == result) {
					System.out.println("비겼습니다. 다시 뽑아주세요.");
					draw[i - 1] = drawcount++;
					continue;
				} else if (result == 2) {
					System.out.println("이겼습니다.");
					win[i - 1] = wincount++;
					continue;
				} else {
					System.out.println("졌습니다.");
					lose[i - 1] = losecount++;
					continue;
				}
			}
		}
		winRate = wincount / (double) (wincount + losecount + drawcount) * 100;
		System.out.println("총 시합 10판 중 이긴 시합은 " + wincount + ", " + "진 시합은 " + losecount + ", " + "비긴 시합은 " + drawcount
				+ "으로 총 승률은 " + winRate + "% 입니다.");
	}

}
