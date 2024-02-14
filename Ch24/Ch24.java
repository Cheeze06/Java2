package Ch24;

//00 자료구조
//자료구조란?
//데이터를 효율적으로 저장하고 조작(검색)하기 위한 구조를 의미
//주로 세가지 범주로 나뉨.
//1. 단순구조
//2. 선형구조
//3. 비선형구조

//자료구조 예시)
//배열(Array), 연결 리스트(Linked List), 스택(Stack), 큐(Queue), 트리(Tree), 해시 테이블(Hash Table) 등이 있음.



//1. 단순구조 (Primitive Data Structures)		:

//1-1. 정수 (Integer)			: 정수형 데이터 타입으로, 정수를 나타냄.
//1-2. 실수 (Real Number)		: 실수형 데이터 타입으로, 소수점 이하를 포함하는 숫자를 나타냄.
//1-3. 문자열 (String)			: 문자들의 시퀀스로, 텍스트를 나타냄.


//2. 선형구조 (Linear Data Structures)			:

//2-1. 리스트 (List)					: 순서가 있는 요소들의 집합으로, 배열과 같이 인덱스를 통해 접근함.
//2-2. 연결리스트 (Linked List)		: 노드들이 연결된 구조로, 각 노드는 데이터와 다음 노드에 대한 참조를 가지고 있음.
//			1. 단순 연결리스트 (Singly Linked List)	: 각 노드가 다음 노드에 대한 참조만을 가지는 연결리스트.
//			2. 이중 연결리스트 (Doubly Linked List)	: 각 노드가 이전 노드와 다음 노드에 대한 참조를 가지는 연결리스트.
//			==> 이러한 자료구조들은 각각의 특성에 따라 데이터를 효율적으로 저장하고 조작할 수 있도록 설계되어있음. 
//				선택한 자료구조는 프로그램의 특정 요구 사항과 작업에 따라 결정.
//2-3. 스택 (Stack)				: 후입선출(LIFO) 구조로, 데이터의 삽입과 삭제가 한쪽 끝에서 이루어짐.
//2-4. 큐 (Queue)				: 선입선출(FIFO) 구조로, 데이터의 삽입은 한쪽 끝에서, 삭제는 다른 한쪽 끝에서 이루어짐.







//3. 비선형구조 (Non-linear Data Structures)	:

//3-1. 트리 (Tree)				: 노드들이 부모-자식 관계로 연결된 구조로, 계층적인 데이터를 표현함.
//			1. 일반 트리 (General Tree)			: 부모가 여러 개의 자식을 가질 수 있는 트리 구조입니다.
//			2. 이진 트리 (Binary Tree)			: 각 노드가 최대 두 개의 자식을 가질 수 있는 트리 구조입니다.
//3-2. 그래프 (Graph)				: 노드와 간선의 집합으로, 네트워크나 관계를 나타내는데 사용됨.
//			1. 방향 그래프 (Directed Graph)		: 간선에 방향이 있는 그래프입니다.
//			2. 무방향 그래프 (Undirected Graph)	: 간선에 방향이 없는 그래프입니다.




//1. 배열 (Array)
//특징		: 동일한 데이터 타입의 요소들을 인덱스로 접근할 수 있는 정적인 크기의 자료구조.
//사용 예시	: int[] numbers = {1, 2, 3, 4, 5};

//
//
//2. 리스트 (List)
//특징		: 크기가 가변적이며, 순서가 있는 자료구조.
//주요 구현체	: ArrayList, LinkedList, Vector.
//사용 예시	: List<String> names = new ArrayList<>();

//names.add("Alice");
//names.add("Bob");
//
//
//
//3. 집합 (Set)
//특징		: 중복 요소를 허용하지 않는 자료구조.
//주요 구현체	: HashSet, LinkedHashSet, TreeSet.
//사용 예시	: Set<Integer> numbers = new HashSet<>();
//numbers.add(1);	
//numbers.add(2);
//
//
//
//4. 맵 (Map)
//특징		: 키-값 쌍으로 이루어진 자료구조.
//주요 구현체	: HashMap, LinkedHashMap, TreeMap.
//사용 예시	: Map<String, Integer> ages = new HashMap<>();
//ages.put("Alice", 25);
//ages.put("Bob", 30);
//
//
//5. 큐 (Queue)
//특징		: 선입선출(FIFO) 구조의 자료구조.
//주요 구현체	: LinkedList, PriorityQueue.
//사용 예시	: Queue<String> waitingQueue = new LinkedList<>();
//waitingQueue.offer("Alice");
//waitingQueue.offer("Bob");
//
//
//6. 스택 (Stack)
//특징		: 후입선출(LIFO) 구조의 자료구조.
//주요 구현체	: LinkedList.
//사용 예시	: Stack<String> callStack = new Stack<>();
//callStack.push("Method1");
//callStack.push("Method2");
//
//
//
//7. 배열 리스트 (ArrayList)
//특징		: 크기가 동적으로 조절되며 배열 기반의 리스트.
//주요 메서드	: add, get, remove, size.
//사용 예시	: ArrayList<String> names = new ArrayList<>();
//names.add("Alice");
//names.add("Bob");
//
//
//
//8. 링크드 리스트 (LinkedList):
//특징		: 노드로 이루어진 연결 리스트.
//주요 메서드	: add, get, remove, size.
//사용 예시	: LinkedList<String> names = new LinkedList<>();
//names.add("Alice");
//names.add("Bob");




public class Ch24 {

}
