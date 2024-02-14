package Ch25;

//### NullPointerException ###
//참조 변수가 null 값을 가진 상태에서 해당 변수를 사용하려고 할 때 발생 
//null은 아무런 객체를 참조하지 않음을 나타냄
//==> 해당 객체의 메소드를 호출하거나 인스턴스 변수에 접근하려고 하면 NullPointerException이 발생

public class NullPointerExceptionExample {
	public static void main(String[] args) {
		Object ob = new Object();
		ob.toString();
		
		
		try {
			String str = null;
			System.out.println(str.toString()); 	// 없는 문자열을 toString()으로 보려고 하니깐 예외 발생.
		} catch (NullPointerException e) {
			// e는 참조변수, 예외 객체가 생성되고 주소번지가 100이라면 try에서 예외가 발생한 후 catch의 참조변수 e가 그 주소번지를 받아냄.
			
//			System.out.println("예외발생함!!!!");
			System.out.println(e.getCause());		// getCause() 		: 원인 가져오기
			System.out.println();
			
			System.out.println(e.toString()); 		// toString() 		: 예외객체 정보
			System.out.println();
			
			System.out.println(e.getStackTrace()); 	// getStackTrace() 	: 예외객체 식별주소
			System.out.println();
			
			e.printStackTrace(); 					// pritStackTrace() : 프로그램 종료전 예외발생정보 출력
			System.out.println();
			
			System.out.println(e.getMessage());		// getMessage() 	: 예외 메세지 내용 출력
		
			
		}
		System.out.println("[SYSTEM] : 프로그램을 종료합니다!!");
		
		
		
		
		
	}

}
