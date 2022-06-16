package day0531;

abstract class Animal{
	String kind;
	
	void breathe() {
		System.out.println("숨을 쉽니다....");
	}
	
	abstract void sound();
}

class Dog extends Animal {
	
	Dog(){
		this.kind = "포유류";
	}
	
	void sound() {;
	System.out.println("멍멍");
	}
}

class Cat extends Animal {
	Cat(){
		this.kind = "포유류";
	}
	
	void sound() {
		System.out.println("야옹");
	};
	
}

public class AnimalMain {

	public static void main(String[] args) {
		
		// sound() 메서드 호출
		
		// 1. 가장 일반적인 방법
		
		Dog dog = new Dog();
		Cat cat = new Cat();
		
		dog.sound();
		cat.sound();
		
		System.out.println("--------------");
		
		/* 2. 부모 타입의 참조 변수를 이용하여
		 * 자식의 sound() 메서드 호출
		 * 자식은 부모 타입으로 자동형변환 가능 */
		Animal animal = null;
		
		// Animal animal = new Dog();
		animal = new Dog();
		animal.sound();
		
		animal = new Cat();
		animal.sound();
		
		System.out.println("--------------");
		
		// 3. 메서드를 생성
		animalSound(new Dog());
		animalSound(new Cat());
		
		// Animal animal = new Dog();
		// Animal animal = new Cat();
	}
	// static 없으면 AnimalMain 객체를 생성해서 사용해야 함	
	public static void animalSound(Animal animal) {
		animal.sound();
	}

}
