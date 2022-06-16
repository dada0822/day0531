package day0531;

class Product{
	
	int price;
	int bonus;
	
	Product(){} // 기본생성자
	
	Product(int price){
		this.price = price;
		bonus = (int)(price / 10.0);
	}
	
}

class Tv extends Product {
	Tv(){
		// 부모의 생성자 호출
		super(100);
	}
	
	public String toString() {
		return "Tv";
	}
}

class Computer extends Product {
	Computer(){
		super(200);
	}
	
	public String toString() {
		return "Computer";
	}
}

class Audio extends Product {
	Audio(){
		super(50);
	}
	
	public String toString() {
		return "Audio";
	}
}

class Buyer{
	int money = 1000;
	int bonus = 0;
	Product[] cart = new Product[10];
	int i = 0;
	
	void buy(Product p) {
		if(money < p.price) {
			System.out.println("잔액 부족!");
			return;
		}
		
		money -= p.price; // 가진 돈에서 제품 금액 빼기
		bonus += p.bonus; // 보너스 추가
		cart[i++] = p; // i 사용 후 증가
		System.out.println(p + "를 구입하였습니다.");
	}
	
	// 구매한 물품에 대한 요약 정보를 표시하는 메서드
	void summary() {
		int sum = 0;
		String itemList = "";
		
		// 구매한 물건의 총 합계, 물건의 목록을 표시
		for(int i=0; i<cart.length; i++) {
			// 배열이 비어있으면 반복문 종료
			if(cart[i] == null) break;
			
			sum += cart[i].price;
			itemList += (i==0) ? "" + cart[i] : ", " + cart[i];
			
		}
		System.out.println("총 금액 : " + sum);
		System.out.println("구입한 물건 : " + itemList);
	}
}

public class Array {

	public static void main(String[] args) {
		
		Buyer b = new Buyer();
		
//		Product p = new Tv();
//		b.buy(p);

		b.buy(new Tv());
		b.buy(new Computer());
		b.buy(new Audio());
		
		b.summary();
		
	}

}