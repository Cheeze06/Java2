package Ch19;

//[1번] 다음 main() 메소드와 실행 결과를 참고하여 TV를 상속받은 ColorTV 클래스를 작성하라.
// 속성은 총 int size, int color ==> size : TV클래스의 속성, color : ColorTV클래스의 속성
//출력 결과
//32인치 1024컬러

//### super()의 개념과 필요 이유 ###
//super 					: 부모 클래스를 뜻함.
//super() 					: 부모 클래스의 기본 생성자를 뜻함.
//super(매개변수)				: 부모 클래스의 매개변수 생성자를 뜻함.

//부모 클래스의 생성자를 호출하는 이유 :  	부모 클래스의 초기화 코드를 실행시켜야 하기 때문임.
//								부모 클래스는 자식 클래스보다 상위 수준의 기능이나 속성을 정의하고 있음.
//								따라서 자식 클래스가 생성될 때 부모 클래스의 초기화 작업이 먼저 이루어져야 함.

class TV {
	private int size;

	public TV(int size) { // 객체 속성값 초기화 == 생성자
		this.size = size;
	}
	// getter 함수
	public int getSize() {
		return size;
	}
	// setter 함수
	public void setSize(int size) {
		this.size = size;
	}
	
	

}

class ColorTV extends TV {
	int color;

	public ColorTV(int size, int color) {
		super(size);
		this.color = color;

	}

	void printProperty() {
		System.out.printf("%d인치 %d컬러", getSize(), color);

	}

}

public class C01Prac {
	public static void main(String[] args) {

		ColorTV myTV = new ColorTV(32, 1024);

		myTV.printProperty();

//		myTV.setSize(120);
//		myTV.getSize();

	}

}
