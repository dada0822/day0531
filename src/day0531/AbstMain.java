package day0531;

//비행기, 차 클래스 생성

//비행기와 차의 공통점을 이용하여 클래스 생성
//추상메서드를 가지고 있으므로 추상클래스가 됨
abstract class Vehicle{
	int speed;
	
	public void setSpeed(int speed) {
		this.speed = speed;
		System.out.println("속도를 " + speed + "로 설정하였습니다.");
	}
	
//	void show() {
//	
//} // 아무 것도 없지만 몸통은 존재한다 > 추상메서드 아님
	
	// 선언부만 있고 구현부가 없으므로 추상메서드가 됨
	abstract void show();
}

class Car extends Vehicle {
	int num;
	double gas;
	
	Car(int num, double gas){
		this.num = num;
		this.gas = gas;
		
		System.out.println("차량번호 : " + num + ", 연료량 : " + gas + "인 자동차를 생성함");
	}
	
	void show() {
		System.out.println("차량 번호 : " + num);
		System.out.println("연료량 : " + gas);
		System.out.println("속도 : " + speed);
	}
	
}

class Plane extends Vehicle {
	int flight;
	
	Plane(int flight){
		this.flight = flight;
		System.out.println("비행기 번호 : " + flight + "인 비행기를 생성함");
	}
	
	void show() {
		System.out.println("비행기 번호 : " + flight);
		System.out.println("속도 : " + speed);
	}
	
}

public class AbstMain {

	public static void main(String[] args) {
		
		Vehicle[] vc = new Vehicle[2];
		
		vc[0] = new Car(1234, 30.6);
		vc[0].setSpeed(80);
		
		vc[1] = new Plane(1);
		vc[1].setSpeed(100);
		
		vc[0].show();
		vc[1].show();

	}

}
