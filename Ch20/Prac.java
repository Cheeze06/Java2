package Ch20;

// 문제 01)
// 추상 클래스 Moonbanggu를 정의하는데 sharpenCnt, PencilCnt 속성 선언 및 초기화하고 write를 추상 메서드로 가짐.
// 이를 상속받는 Sharpen, Pencil 클래스를 정의하세요!

// Sharpen, Pencil 객체를 생성할 때마다 sharpenCnt, PencilCnt 속성값들이 1씩 감소해야 합니다.


public class Prac {
	// Writing(), ShowInfo()
	
	
	
	
	
	public static void main(String[] args) {

		Sharpen item1 = new Sharpen();		// 문방구가 가지는 SharpenCnt 속성값이 1줄어야함.
		Pencil item2 = new Pencil();		// 문방구가 가지는 PencilCnt 속성값이 1줄어야힘.
		Writing(item1);						//"샤프로 씁니다" 가 출력
		Writing(item2); 					//"연필로 씁니다" 가 출력 
		ShowInfo();							// 샤프재고량 : 99, 연필재고량 :99
		
		
		
	}
}
