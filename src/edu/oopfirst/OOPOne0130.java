package edu.oopfirst;

import java.util.Scanner;

class Person{
	private final int IQ = 140;
	private String name; // ���� ���� ������ Person Ŭ���� ���ο����� ���� ���������� �ܺο����� ����ڴ�.
	private int age;
	// �Ķ���� ���� �⺻�����ڴ� �����Ϸ��� ��� ���� �Ѵ�
	// ����ڰ� �����ڸ� ����� �����Ϸ��� �ȸ���
	

	public Person() {  //�⺻������ default constructor, �Ű������� ����
		System.out.println("�� �⺻������");
		name = null;
		age = 0;
	}
	
	
	public Person(String pname, int page) {
		this.name = pname;
		this.age = page;
		System.out.println("�̰� �Ű����� �ΰ��� ������");
	}
	
	
	//person class�� �żҵ�//////////////////////////////////////////////////////////////////////////////////////////////////
	
	public void talk(){  // �Լ� ����� ���� Ÿ���� ����ؾ���
		System.out.printf("%d�� %s�̰� ���� �Ѵ�.\n", age, name);
	}
	public void talk(String shouting) {
		System.out.printf("\"%s\"��� ���ߴ�.\n", shouting);
	}
	public void talk(String shouting, int age) {
		System.out.printf("%d�� �̴�!! \"%s\"!!!!!! \n", age, shouting);
	}
	public void talk(int age, String shouting) {
		System.out.printf("%d�� %s \n", age, shouting);
	}
	
	public void breathe() {
		System.out.printf("%s�̰� ���� ����.\n", name);
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
		// Person Ŭ������ ���纻�� ���� �� : ��ü �ν��Ͻ� ����
		// personŸ���� gildong����(��ü ���� ����=�ν��Ͻ�=���۷���)�� ���纻(new)�� �ּҸ� ����Ų��
		new Person();  // �Ķ���� ���� �⺻�����ڴ� �����Ϸ��� ��� ���� �Ѵ�
		Person gildong = new Person();  // �Ķ���� ���� �⺻������
		gildong.set_name("�浿");
		gildong.set_age(25);
		System.out.printf("%d ��, �̸��� %s\n", gildong.get_age(), gildong.get_name());
		gildong.breathe();
		gildong.talk();
		//System.out.print("�浿�̰� �����Ѵ�. : ");
		//shouting = sc.nextLine();
		//gildong.talk(shouting);
		
		Person hodong = new Person("ȣ��", 26);  //setter�� ������ �ʿ� ����
		hodong.breathe();
		System.out.printf("%d ��, �̸��� %s\n", hodong.get_age(), hodong.get_name());
		
		//setter�� ���� ������ �Ķ���͸� ��������
		hodong.set_age(25);  //setter�� ���� ������ �Ķ���͸� ��������
		hodong.set_name("��ȯ");
		hodong.breathe();
		System.out.printf("%d ��, �̸��� %s\n", hodong.get_age(), hodong.get_name());
		
		//scanner�� �Ű����� �޾Ƽ� ��ü ����
		System.out.print("�̸��� �Է��Ͻÿ�: ");
		myname = sc.nextLine();
		System.out.print("���̸� �Է��Ͻÿ�: ");
		myage = sc.nextInt();
		Person human = new Person(myname, myage);
		System.out.printf("%d ��, �̸��� %s\n", human.get_age(), human.get_name());
		human.breathe();
		System.out.printf("%s �̰� �����Ѵ�. : ", human.get_name());
		sc.nextLine();
		shouting = sc.nextLine();
		human.talk(shouting);
		human.talk();
		human.talk("��©", myage);
		human.talk(myage,"��©");
		
	}

}
