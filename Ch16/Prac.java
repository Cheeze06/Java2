package Ch16;

public class Prac {
	public static void main(String[] args) {

		// 문제 01
		// 5개의 정수를 저장할 수 있는 배열을 선언하고 모든 요소를 0으로 초기화하고 배열을 출력합니다.
		int[] array1 = new int[5];
		printArray(array1);

		// 문제 02
		// 5개의 정수를 저장할 수 있는 배열을 선언하고 사용자로부터 5개의 정수를 입력받아 배열에 저장하고 배열을 출력합니다.

//		inputArrayValues(array2);
//		printArray(array2);
//
//		// 문제 03
//		// 10개의 정수를 저장할 수 있는 배열을 선언하고 
		// 배열을 역순으로 초기화하고 (사용자로부터 값을 받아서 배열을 초기화) 배열을 출력합니다.
//
//		initializeReverseArray(array3);
//		printArray(array3);

	}

	// 배열 출력 메서드
	public static void printArray(int[] arr) {
		System.out.print("배열 출력 : ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");

		}
		System.out.println();

	}

	// 배열에 사용자로부터 값을 입력받는 메서드

	public static void inputArrayValues(int[] arr) {

	}

	// 배열을 역순으로 초기화하는 메서드

	public static void initializeReverseArray(int[] arr) {

	}

}
