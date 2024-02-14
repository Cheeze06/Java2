package Ch25;

//### Exception 클래스 ###

//자바에서 예외 처리를 위한 기본 클래스 중 하나
//모든 예외의 부모 클래스로서 다양한 예외들이 Exception을 상속하고 있음, java.lang 패키지에 속해 있음

//## 상속 관계 ##
//Exception 클래스는 Throwable 클래스를 상속하고 있음.
//Throwable은 자바에서 예외 처리의 기본 클래스이며, Error와 Exception 클래스의 부모 클래스임.

//## Checked Exception과 Unchecked Exception ##
//Exception 클래스의 하위 클래스 중에서 RuntimeException(런타임 예외)을 제외한 예외들은 Checked Exception(컴파일 타임 예외)으로 분류됨. 
//Checked Exception(컴파일 타임 예외)은 반드시 예외 처리를 해주어야 하는 것이 특징임.

public class Exception01 {
	public static void main(String[] args) {
		try {

//			String str = null;
//			System.out.println(str.toString()); // null 예외
			
			int arr[]  = new int[3];
			arr[4] = 2000;
			
//			Class<?> age = Class.forName("NonExistentClass");
			
		}
		
		catch (NullPointerException e) {
			System.out.println("NULL 예외");
		} 
		catch (Exception e) {
			System.out.println("나 Exception 예외 처리");
		}
		
//			
	}
}
