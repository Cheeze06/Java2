package Ch19;


//싱글톤 패턴
//하나의 객체를 생성하여 다수의 클라이언트가 접속하여 사용하는 형태
//하나의 인스턴스를 공유하여 사용할 수 있음
//ex) DB Connection Pool 생성시 사용

//어떤 클래스가 최대 한 번만 인스턴스화되어야 하는 경우에 사용되는 디자인 패턴 중 하나


class Single {
	int x;
	int y;
	private static Single instance = null;				// 객체 생성을 하지 않아도 사용할 수 있음.
														// 아니면 Single instance; 이렇게 만들어줘도 O
	
	
	private Single() {									// private : 다른 위치에서는 생성자 사용 X, 오직 이 클래스 안에서만 만들 수 있음.
		x = 10;
		y = 20;
	}


	public static Single getInstance() {				// getter 함수
		if(instance == null) {							// Single에 대한 객체를 처음에 생성시에 유효한 코드
			instance = new Single();			//120
		}
		return instance;
	}
}


public class SingleTonMain {
	
	public static void main(String[] args) {
		Single a = Single.getInstance();			// 120
		
		Single b = Single.getInstance();			// 120
		
		
		System.out.println( a == b );				// True
		System.out.println("a.x : " + a.x);
		System.out.println("a.y : " + a.y);
		
		
		
		
		
		
		
	}

}
