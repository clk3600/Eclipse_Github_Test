package Coding_Test01;

import java.util.Scanner;

//Q7. for문을 사용하여, 1부터 Scanner 클래스 활용 입력값(예시 : 20)까지
//     양의 정수 중에서 다음의 실행 결과와 같이
//     3의 배수만 출력하는 자바 프로그램을 제작해 봅니다.
//     실행 결과 : 3 6 9 12 15 18

public class Coding_Test09 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("3의 배수를 구할 범위를 양의 정수로 입력해 주세요 ==> ");
		int num = scan.nextInt();
		
		for (int i = 1; i <= num; i++) {
			if (i%3 == 0) { // != 로 continue 문 활용가능
				System.out.print(i+" ");
				
			}
			
		}
	}
	
}









