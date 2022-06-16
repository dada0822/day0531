package day0531;

class Employee {
	String name;
	int age;
	String addr;
	String department;
	int salary;
	
	Employee(String name, int age, String addr, String department){
		this.name = name;
		this.age = age;
		this.addr = addr;
		this.department = department;
	}
	
	public void printInfo() {
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
		System.out.println("주소 : " + addr);
		System.out.println("부서 : " + department);
	}
	
	public void setSalary(int salary) {
		
	}
	
	public void setWorkhour(int workhour) {
		
	}
}

class Regular extends Employee{
	Regular(String name, int age, String addr, String department){
		super(name, age, addr, department);
	}
	
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	public void printInfo() {
		super.printInfo();
		System.out.println("정규직");
		System.out.println("급여 : " + salary);
	}
}

class Temporary extends Employee{
	int workhour;
	int time_pay = 10000;
	
	Temporary(String name, int age, String addr, String department){
		super(name, age, addr, department);
	}
	
	public void setWorkhour(int workhour) {
		this.workhour = workhour;
		this.salary = workhour * time_pay;
	}
	
	public void printInfo() {
		super.printInfo();
		System.out.println("비정규직");
		System.out.println("일한 시간 : " + workhour);
		System.out.println("급여 : " + salary);
	}
	
}


public class EmployeeMain {

	public static void main(String[] args) {
		
//		Regular r = new Regular("김그린", 35, "울산", "인사부");
//		Temporary t = new Temporary("이자바", 22, "서울", "개발부");
		
		Employee r = new Regular("김그린", 35, "울산", "인사부");
		Employee t = new Temporary("이자바", 22, "서울", "개발부");

		r.setSalary(5000000);
		r.printInfo();
		System.out.println();
		t.setWorkhour(120);
		t.printInfo();
		
	}

}
