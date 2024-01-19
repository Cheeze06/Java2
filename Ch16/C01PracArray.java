package Ch16;

import java.util.Scanner;

public class C01PracArray {
	
	public static void main(String[] args) {
		
		// 
//		[입력값] : 1 2 3 4 5 6 7 8 9 10 
//		[출력값] : 최대 : 10 최소 : 1 합 : 55 평균 : 5.500000 
		
		
		
		Scanner sc = new Scanner(System.in);
		// 1. 
//		//10 크기의 int형 배열을 만들어서
//		//반복문과 함께 해당배열의 0 - 9 까지 요소에 각각 정수값을 입력(설정)
		
		int [] arr = new int[10];
		
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
			
		}
		// 2.
//		//합, 평균, 최대값, 최소값을 구합시다.
		int sum = 0;
		
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
			
		}
		System.out.println("10개의 정수의 합 : " + sum);
		
		double avg = (double) sum / 10;			// 자동 형변환
		System.out.println("10개의 정수의 평균 : " + avg);
		
		int max = 0;				// 저장 공간
		int tmp = arr[0];			// 값비교를 위한 공간
									// 두개를 분리
		
		for (int i = 1; i < arr.length; i++) {
			if (tmp <= arr[i]) {
				max = arr[i];
			} else {
				max = tmp;
			}
		}
		System.out.println("10개의 정수 중 최댓값 : " + max);
		
		
		int min = 0;
		
		for (int i = 1; i < arr.length; i++) {
			if (min >= arr[i]) {
				min = arr[i];
			}
		}
		
		System.out.println("10개의 정수 중 최솟값 : " + min);
		
		
		
	}

}
