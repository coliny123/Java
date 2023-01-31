package edu.oopfirst;

import java.util.Scanner;

class Person{
	private final int IQ = 140;
	private String name; // 접근 권한 지정자 Person 클래서 내부에서는 접근 가능하지만 외부에서는 숨기겠다.
	private int age;
	// 파라미터 없는 기본생성자는 컴파일러가 대신 만들어서 한다
	// 사용자가 생성자를 만들면 컴파일러는 안만듬
	

	public Person() {  //기본생성자 default constructor, 매개변수가 없음
		System.out.println("난 기본생성자");
		name = null;
		age = 0;
	}
	
	
	public Person(String pname, int page) {
		this.name = pname;
		this.age = page;
		System.out.println("이건 매개변수 두개인 생성자");
	}
	
	
	//person class의 매소드//////////////////////////////////////////////////////////////////////////////////////////////////
	
	public void talk(){  // 함수 선언시 리턴 타입을 명시해야함
		System.out.printf("%d살 %s이가 말을 한다.\n", age, name);
	}
	public void talk(String shouting) {
		System.out.printf("\"%s\"라고 말했다.\n", shouting);
	}
	public void talk(String shouting, int age) {
		System.out.printf("%d살 이다!! \"%s\"!!!!!! \n", age, shouting);
	}
	public void talk(int age, String shouting) {
		System.out.printf("%d살 %s \n", age, shouting);
	}
	
	public void breathe() {
		System.out.printf("%s이가 숨을 쉰다.\n", name);
	}
	//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	
	
	void set_name(String name) {
		this.name = name;
	}
	
	void set_age(int age) {
		this.age = age;
	}
	
	String get_name() {
		return name;
	}
	
	int get_age() {
		return age;
	}
}

public class OOPOne0130 {

	public static void main(String[] args) {
		
		int val[] = new int[3];  // == int val[] = new int[] {10, 20, 30};
		val[0] = 10;
		val[1] = 20;
		val[2] = 30;
		
		Scanner sc = new Scanner(System.in);
		String myname = null;
		int myage = 0;
		String shouting = null;
		// Person 클래스의 복사본이 생긴 것 : 객체 인스턴스 생성
		// person타입의 gildong변수(객체 참조 변수=인스턴스=레퍼런스)가 복사본(new)의 주소를 가리킨다
		new Person();  // 파라미터 없는 기본생성자는 컴파일러가 대신 만들어서 한다
		Person gildong = new Person();  // 파라미터 없는 기본생성자
		gildong.set_name("길동");
		gildong.set_age(25);
		System.out.printf("%d 살, 이름은 %s\n", gildong.get_age(), gildong.get_name());
		gildong.breathe();
		gildong.talk();
		//System.out.print("길동이가 말을한다. : ");
		//shouting = sc.nextLine();
		//gildong.talk(shouting);
		
		Person hodong = new Person("호동", 26);  //setter로 설정할 필요 없음
		hodong.breathe();
		System.out.printf("%d 살, 이름은 %s\n", hodong.get_age(), hodong.get_name());
		
		//setter로 먼저 생성된 파라미터를 변경했음
		hodong.set_age(25);  //setter로 먼저 생성된 파라미터를 변경했음
		hodong.set_name("도환");
		hodong.breathe();
		System.out.printf("%d 살, 이름은 %s\n", hodong.get_age(), hodong.get_name());
		
		//scanner로 매개변수 받아서 객체 생성
		System.out.print("이름을 입력하시오: ");
		myname = sc.nextLine();
		System.out.print("나이를 입력하시오: ");
		myage = sc.nextInt();
		Person human = new Person(myname, myage);
		System.out.printf("%d 살, 이름은 %s\n", human.get_age(), human.get_name());
		human.breathe();
		System.out.printf("%s 이가 말을한다. : ", human.get_name());
		sc.nextLine();
		shouting = sc.nextLine();
		human.talk(shouting);
		human.talk();
		human.talk("우짤", myage);
		human.talk(myage,"우짤");
		
	}

}
