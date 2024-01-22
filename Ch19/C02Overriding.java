package Ch19;

//### 오버라이딩(함수재정의) ###
//오버라이딩 : 상속 관계에서 부모 클래스의 메서드를 자식 클래스에서 다시 정의(재정의)하는 것
//메서드의 헤더부분은 동일하나 바디{} 부분의 로직이 다를 수가 있음.
//==> 같은 메서드 헤더(시그니처), 
//  즉 메서드 이름, 매개변수 타입, 반환 타입이 같은 메서드 헤더를 가지고 몸체에 다른 코드를 삽입할 수 있다는 의미.

//접근 제어자는 같거나 더 넓은 범위를 가져야 함

class Animal {
	public void Sound() {
		System.out.println("소리를 냅니다");
	}
}


class Dog extends Animal {
	@Override
	public void Sound() {
		System.out.println("멍멍 소리를 냅니다");
		
	}
	
}
 
class Cat extends Animal {
	@Override
	public void Sound() {
		System.out.println("야옹 소리를 냅니다");
	}
	
}


public class C02Overriding {
	public static void main(String[] args) {
		
		Dog poppi = new Dog();
		Cat yummi = new Cat();
		
		
		poppi.Sound();
		yummi.Sound();
		
		
	}

}
