package Ch24;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapExample {
	public static void main(String[] args) {
		
		// Map은 Java의 컬렉션 프레임워크에서 키-값 쌍을 저장하는 데 사용되는 인터페이스 
    	// 각각의 키(key)는 유일해야 하며, 각 키에 대응하는 값(value)을 저장
    	// Map은 중복된 키를 허용하지 않음.

    	// Map 인터페이스를 구현하는 주요 클래스로는 HashMap, TreeMap, LinkedHashMap 등이 있음.
    	
    	
    	
        // HashMap 생성 (키는 String, 값은 Integer)
        Map<String, Integer> hashMap = new HashMap<>();

        // put 메서드를 사용하여 키-값 쌍 추가
        hashMap.put("One", 1);
        hashMap.put("Two", 2);
        hashMap.put("Three", 3);
        hashMap.put("One", 11); 		// 중복이면 최신 업데이트 된 애가 나옴.
        

        // get 메서드를 사용하여 특정 키에 해당하는 값 얻기
        System.out.println("Value for key 'Two': " + hashMap.get("Two")); 
        // 출력: Value for key 'Two': 2

        
        // containsKey 메서드를 사용하여 키의 존재 여부 확인
        System.out.println("Contains key 'Four': " + hashMap.containsKey("Four")); 
        // 출력: Contains key 'Four': false

        
        // keySet 메서드를 사용하여 모든 키를 얻기
        Set<String> keys = hashMap.keySet();	// 모든 키를 set으로 반환
        System.out.println("Keys: " + keys); 
        // 출력: Keys: [One, Two, Three]

        
        // values 메서드를 사용하여 모든 값 얻기
        System.out.println("Values: " + hashMap.values());		// Map의 모든 값을 Collection으로 반환 
        // 출력: Values: [1, 2, 3]

        
        // entrySet 메서드를 사용하여 모든 키-값 쌍 얻기
        Set<Map.Entry<String, Integer>> entrySet = hashMap.entrySet();		// Map의 모든 키-값 쌍을 Set으로 반환
        System.out.println("Entry Set: " + entrySet); 
        // 출력: Entry Set: [One=1, Two=2, Three=3]

        
        // remove 메서드를 사용하여 특정 키-값 쌍 제거
        hashMap.remove("Two");

        
        // 제거 후 다시 entrySet 출력
        System.out.println("Entry Set after removal: " + hashMap.entrySet());
        // 출력: Entry Set after removal: [One=1, Three=3]
        
        
        // size 확인
        System.out.println(hashMap.size());
		
		
		
	}

}
