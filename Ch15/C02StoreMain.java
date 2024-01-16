package Ch15;

class Customer {
	// 속성
	int myMoney;			// 보유금액
	int colaCnt;			// 콜라보유개수
	
	
	public Customer(int myMoney, int colaCnt) {
		super();
		this.myMoney = myMoney;
		this.colaCnt = colaCnt;
	}
	
	// 기능
	// 구매 기능
	void pay(Store store, int money) {
		// 1. 내 보유금에서 money 차감
		myMoney -= money;
		
		// 2. 지정된 store에 money를 전달
		int cnt = store.returnCola(money);
		
		// 3. 콜라 개수를 누적
		colaCnt += cnt;
		
	}
	@Override
	public String toString() {
		return "Customer [myMoney=" + myMoney + ", colaCnt=" + colaCnt + "]";
	}
	
}

class Store {
	// 속성
	int savedMoney; 			// 보유금액
	int colaCnt;				// 콜라 재고량
	int price;					// 콜라가격
	
	public Store(int savedMoney, int colaCnt, int price) {
		super();
		this.savedMoney = savedMoney;
		this.colaCnt = colaCnt;
		this.price = price;
	}

	@Override
	public String toString() {
		return "Store [savedMoney=" + savedMoney + ", colaCnt=" + colaCnt + ", price=" + price + "]";
	}
	
	// 콜라 주기 기능
	int returnCola(int money) {
		// 1. 보유금액에 받은 금액 추가
		savedMoney += money;
		// 2. 받은 금액만큼 콜라재고량 감소
		int cnt = money / price;			// cnt : 내가 산 콜라 개수
		colaCnt -= cnt;
		
		// 3. 콜라 개수 반환
		return cnt;	
		
	}
}



public class C02StoreMain {
	public static void main(String[] args) {
		// 고객 객체
		Customer hong = new Customer(10000, 0);
		
		
		// 편의점 객체
		Store Gs반월 = new Store(100000, 100, 500);	// 보유금액, 콜라개수, 콜라가격
		
		// 구매하기
		hong.pay(Gs반월, 2000);	// 편의점에 2000원 주고 콜라 4개를 사옴.
		
		System.out.println(hong.toString());
		System.out.println(Gs반월.toString());
		
		
		
		
		
	}

}
