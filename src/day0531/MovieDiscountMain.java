package day0531;

/* 영화 예매 금액의 총 합계를 계산하고자 함
 * 모든 영화의 정가는 10,000원이며, 기본 할인율은 10%이다.
 * 또한 장르별로 추가로 할인 가능하며 할인 금액은 아래와 같다.
 * 1. 액션 : 1,000원 할인
 * 2. 공포 : 800원 할인
 * 3. 코미디 : 1,500원 할인
 * 
 * 총 3장의 영화를 다음과 같이 예매하였을 때
 * 총 예매 금액을 표시하시오. 
 * 1. 범죄도시(액션)
 * 2. 여고괴담(공포)
 * 3. 극한직업(코미디)
 *  
 * - 클래스 이름 : ActionMovie, HorroMovie, ComedyMovie 
 * 추가로 필요한 클래스의 이름은 본인이 선택하여 작성하시오 */

class Movie{
	String name;
	int price = 10000;
	double discountRate = 0.1;
	
	Movie(String name){
		this.name = name;
	}
	
	double discountedPrice() {
		return price * (1-discountRate);
	};
}

class ActionMovie extends Movie{
	ActionMovie(String name){
		super(name);
	}
	
	double discountedPrice() {
		return super.discountedPrice() - 1000;
	};
}

class HorroMovie extends Movie{
	HorroMovie(String name){
		super(name);
	}
	
	double discountedPrice() {
		return super.discountedPrice() - 800;
	};
}

class ComedyMovie extends Movie{
	ComedyMovie(String name){
		super(name);
	}
	
	double discountedPrice() {
		return super.discountedPrice() - 1500;
	};
}

public class MovieDiscountMain {

	public static void main(String[] args) {
		
		// 1. 
//		ActionMovie am = new ActionMovie("범죄도시");
//		HorroMovie hm = new HorroMovie("여고괴담");
//		ComedyMovie cm = new ComedyMovie("극한직업");
//		
//		int sum = 0;
//		sum += am.discountedPrice();
//		sum += hm.discountedPrice();
//		sum += cm.discountedPrice();
//		
//		System.out.println("총 예매금액 : " + sum);
		
		// 2. 배열
		Movie[] movie = {new ActionMovie("범죄도시"), new HorroMovie("여고괴담"), new ComedyMovie("코미디")};

		int sum = 0;
//		for (int i=0; i<movie.length; i++) {
//			sum += movie[i].discountedPrice();
//		}
		
		for(Movie m : movie) {
			sum += m.discountedPrice();
		}
		
		System.out.println("총 예매금액 : " + sum);
		
	}

}
