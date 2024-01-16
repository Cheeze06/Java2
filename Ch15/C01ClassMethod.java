package Ch15;

class Controller {
	MemberInfo member; 		// 참조변수 member

	// getter 만들기
	public MemberInfo getMember() {
		return member;
	}
	// setter 만들기
	public void setMember(MemberInfo member) { 	// MemberInfo member = obj;	
		// member 참조변수 == 특적 객체에 대한 위치 정보를 가지는 변수
		this.member = member;
	}
}

class MemberInfo {
	// 3가지 속성
	String name;
	int age;
	String addr;
	// 매개변수 생성자 == 객체에 대한 속성 초기화를 담당
	public MemberInfo(String name, int age, String addr) {
		super();
		this.name = name;
		this.age = age;
		this.addr = addr;
	}
	
	@Override
	public String toString() {
		return "MemberInfo [name=" + name + ", age=" + age + ", addr=" + addr + "]";
	}
	
}

public class C01ClassMethod {

	public static void main(String[] args) {
		MemberInfo obj = new MemberInfo("홍길동", 32, "대구");
		
		
		
		Controller con = new Controller();
		con.setMember(obj);
		
		
		MemberInfo tmp = con.getMember();
		
		
		System.out.println(System.identityHashCode(tmp));
		System.out.println(System.identityHashCode(obj));
		
		
		System.out.println(tmp.toString());
		
		
		
		
		
	}

}
