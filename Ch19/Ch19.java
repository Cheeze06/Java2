package Ch19;


//### 상속(Inheritance) ###

//## 상속의 기본구조 ##


//class 부모클래스 {
//// 부모 클래스의 멤버 변수와 메서드
//}
//
//class 자식클래스 extends 부모클래스 {
//// 자식 클래스의 추가적인 멤버 변수와 메서드
//}

//## 주의사항 ##
//1. 단일 상속		: 자바에서는 단일 상속만을 지원함.
//				즉, 하나의 클래스는 하나의 부모 클래스만을 가질 수 있음.
//				이로 인해 클래스 간의 강한 결합을 피하고 복잡성을 감소시키는 효과가 있음.

class A {
	
}


//부모 클래스: 차량(Vehicle)
class Vehicle {
String brand;

Vehicle(String brand) {
   this.brand = brand;
}

void start() {
   System.out.println(brand + " 차량 시동을 걸다.");
}

void stop() {
   System.out.println(brand + " 차량을 정지시킨다.");
}
}

//자식 클래스: 자동차(Car)
class Car extends Vehicle {
	
	
Car(String brand) {
	super(brand);
}

void accelerate() {
   System.out.println(brand + " 차량이 가속한다.");
}

void brake() {
   System.out.println(brand + " 차량이 제동한다.");
}
}

public class Ch19 {
	public static void main(String[] args) {
		Car myCar = new Car("Toyota");			 // myCar.brand = "Toyota";
		
		myCar.start(); 		// 부모 클래스의 메서드 호출
		
		myCar.accelerate(); // 자식 클래스의 메서드 호출
		
		myCar.brake();		// 자식 클래스의 메서드 호출
		
		myCar.stop();		// 부모 클래스의 메서드 호출
		
		
		
		
		
		
	}

}
