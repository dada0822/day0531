package day0531;

//부모님, 아이, 강아지랑 소풍을 가요
abstract class Living {
	
	int x, y;
	abstract void move(int x, int y);
	
	void stop() {
		System.out.println("도착했어요!!");
	}
	
}

class Parent extends Living {
	void move(int x, int y) {
		System.out.printf("Parent의 위치 : %d, %d%n", x, y);
	}
	
	void drive() {
		System.out.println("운전을 해요!");
	}
}

class Child extends Living {
	void move(int x, int y) {
		System.out.printf("Child의 위치 : %d, %d%n", x, y);
	}
	
	void play() {
		System.out.println("놀아요!!");
	}
	
	void cry() {
		System.out.println("울어요~~");
	}
}

class Dog1 extends Living {
	void move(int x, int y) {
		System.out.printf("Dog의 위치 : %d, %d%n", x, y);
	}
	
	void sleep() {
		System.out.println("강아지는 자요~");
	}
	
}

public class PicnicMain {

	public static void main(String[] args) {
		
		// 객체배열 : 참조변수를 묶은 것
		Living[] group = new Living[3];
		
		// Object[] group = new Object[3];
		/* object는 최고 죄상이므로
		 * 다형성이 가능하지만 (객체 생성 가능)
		 * move()나 stop() 메서드를 가지고 있지는 않기 때문에
		 * 메서드를 호출할 수 없음. */
		
		// Living group = new Parent();
		group[0] = new Parent();
		group[1] = new Child();
		group[2] = new Dog1();
		// 부모의 참조변수로 자식을 다룸(자동형변환) > 다형성
		
		// Living[] group = {new Parent(), new Child(), new Dog1()};
		// 이렇게 표현 가능함
		for(int i=0; i<group.length; i++) {
			group[i].move(100, 200);
			group[i].stop();
		}

	}

}
