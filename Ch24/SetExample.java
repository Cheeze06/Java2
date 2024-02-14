package Ch24;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetExample {
	public static void main(String[] args) {
		// HashSet 생성
		Set<String> hashSet = new HashSet<>();

		// add 메서드를 사용하여 요소 추가
		hashSet.add("Apple");
		hashSet.add("Banana");
		hashSet.add("Orange");
		hashSet.add("Apple"); // 중복 허용 안됨.

		// size 메서드를 사용하여 Set의 크기 확인
		System.out.println("Size of HashSet: " + hashSet.size()); // 출력: 3

		// contains 메서드를 사용하여 요소의 존재 여부 확인
		System.out.println("Contains Banana: " + hashSet.contains("Banana")); // 출력: true
		System.out.println("Contains Grape: " + hashSet.contains("Grape")); // 출력: false

		// Iterator를 사용하여 모든 요소 순회

		// Iterator는 Java에서 컬렉션(컬렉션 프레임워크)을 순회할 때 사용되는 인터페이스.
		// Iterator를 사용하면 컬렉션의 각 요소에 접근하고 반복(iterate)할 수 있음.

		Iterator<String> iterator = hashSet.iterator();
		System.out.print("HashSet Elements: ");
		while (iterator.hasNext()) {
			System.out.print(iterator.next() + " ");
		}
		// 출력: HashSet Elements: Apple Banana Orange

		// remove 메서드를 사용하여 요소 제거
		hashSet.remove("Banana");

		// 요소 제거 후 다시 순회
		System.out.print("\nHashSet Elements after removal: ");
		for (String element : hashSet) {
			System.out.print(element + " ");
		}
		// 출력: HashSet Elements after removal: Apple Orange

		// clear 메서드를 사용하여 Set 비우기
		hashSet.clear();

		// 비우고 난 후 Set이 비어있는지 확인
		System.out.println("\nIs HashSet empty? " + hashSet.isEmpty()); // 출력: true
	}

}
