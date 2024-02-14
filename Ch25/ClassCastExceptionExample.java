package Ch25;

//### ClassCastException ###
//자바에서 형변환(Casting)을 할 때, 실제 객체가 원하는 타입으로 변환될 수 없을 때 발생하는 예외
//객체가 특정 클래스의 인스턴스가 아닌데도 그 클래스로 캐스팅을 시도할 때 발생

//ClassCastException을 피하는 방법은 주로 형변환 전에 적절한 검사(타입 확인)를 수행하거나, instanceof 연산자를 사용하여 변환이 안전한지 확인하는 것

class Animal{
	
}

class Dog extends Animal {
	
}

class Cat extends Animal {
	
}

public class ClassCastExceptionExample {
	public static void castChanging ( Animal animal ) {
		try {
			Dog dog = (Dog) animal;
			System.out.println("dog 객체이고 dog 객체의 정보는 " + dog.toString());
		} catch (ClassCastException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		Dog dog = new Dog();			// dog 객체 생성
		Cat cat = new Cat();			// cat 객체 생성
		
		castChanging(dog);				// castChanging 메서드에 dog 객체 전달
		castChanging(cat);				// castChanging 메서드에 cat 객체 전달
		
	
		
		
		
	}
}
