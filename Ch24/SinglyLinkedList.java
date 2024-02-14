package Ch24;

class Node {
	// 속성(데이터)
	int data;
	Node next;
	
	public Node(int data) {
		super();
		this.data = data;
		this.next = null;
	}
	
	
}

class LinkedList {
	Node head;
	
	
	public LinkedList() {
		this.head = null;
	}
	
	// 노드 추가 메서드
	public void append(int data) {
		Node newNode = new Node(data);
		// 방금 위에서 만든 Node 객체가 첫번째 노드일 때
		if(head == null) {			// LinkedList의 head가 null을 참조한다
									// == 노드를 아무것도 만들지 않았다
			head = newNode;
			return;					// append 메서드 종료
		}
		
		// 방금 위에서 만든 Node 객체가 두번째 노드일 때, 즉 head가 null이 아닐 때 
		Node last = head;
		while(last.next != null) {
			last = last.next;
		}
		
		last.next = newNode;
	}
	
	// 리스트의 내용 출력
	public void printList() {
		Node current = head;
		while(current != null) {
			System.out.println(current.data + " ");
			current = current.next;
		}
		System.out.println();
	}
	
	// 특정 값의 노드 삭제
	public void deleteNode(int key) {
		Node current = head;
		Node prev = null;
		
		// 삭제할 노드 찾기 ==> current가 이리저리 옮겨다니면서 최종저개으로 삭제할 노드를 가리켜주는 역할
		while(current != null && current.data != key) {
			prev = current;
			current = current.next;
		}
		
		// 삭제할 노드가 첫번째 노드인 경우
		if (current == head) {
			head = current.next;
		} else if (current != null) {
			// 중간이나 끝에 있는 노드를 삭제하는 경우
			prev.next = current.next;
			
		}
		// 삭제할 노드가 없다. : current == null
		
		
	}
}




public class SinglyLinkedList {
	public static void main(String[] args) {
		
		// 연결 리스트 생성
		LinkedList linkedList = new LinkedList();			// 현재 head == null
		
		//노드 추가
		linkedList.append(10);	// data 값이 10인 첫번째 노드 생성 및 head와 연결
		linkedList.append(15);
		linkedList.append(20);
		
		//노드 삭제
		linkedList.deleteNode(5);
		
		System.out.println("Linked List : ");
		linkedList.printList();
		
		
	}


}
