package day0531;

/* 1. 각국 통화(원화/달러/유로)의 금액을 출력하고자 한다.
 * - 원화 : 1,500원
 * - 달러 : 100.50달러
 * - 유로 : 260.75유로
 * 2. 입력예시
 * KRW won = new KRW(1500.00);
 * 
 * 3. 모든 화폐를 Curreny 배열에 담고, 반복문을 이용하여 금액을 출력하시오. 
 *  출력예시
 *  KRW : 1500.00원
 *  USD : 100.50달러
 *  EUR : 260.75유로 */

abstract class Curreny {
	double amount;
	
	Curreny(double amount){
		this.amount = amount;
	}
	
	abstract void printInfo();
	
}

class KRW extends Curreny {
	KRW(double amount){
		super(amount);
	}
	
	void printInfo() {
		System.out.printf("KRW : %.2f원 %n", amount);
	}
}

class USD extends Curreny {
	USD(double amount){
		super(amount);
	}
	
	void printInfo() {
		System.out.printf("USD : %.2f달러 %n", amount);
	}
}

class EUR extends Curreny {
	EUR(double amount){
		super(amount);
	}
	
	void printInfo() {
		System.out.printf("EUR : %.2f유로 %n", amount);
	}
}

public class CurrenyTest {

	public static void main(String[] args) {
		
		Curreny[] curr = {new KRW(1500.00), new USD(100.50), new EUR(260.75)};
		
//		for(int i=0; i<curr.length; i++) {
//			curr[i].printInfo();
//		}
		
		// 향상된 for문 (> 배열에서만 사용 가능)
//		int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
//		
//		for(int i : arr) {
//			System.out.println(i);
//		}
		
		for(Curreny c : curr) {
			c.printInfo();
		}
	}

}
