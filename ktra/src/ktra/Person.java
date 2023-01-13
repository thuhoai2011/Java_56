package ktra;
import java.util.Scanner;
public class Person {
	private String name;
	private int age;
	private String gender;
	private int phone;
	static Scanner sc=new Scanner(System.in);
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Person(String name, int age, String gender, int phone) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.phone = phone;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getPhone() {
		return phone;
	}
	public void setPhone(int phone) {
		this.phone = phone;
	}
	public void intput() {
		System.out.print("Nhap ten: ");setName(sc.nextLine());
		System.out.print("Nhap tuoi: ");setAge(sc.nextInt()); sc.nextLine();
		System.out.print("Nhap gioi tinh: ");setGender(sc.nextLine());
		System.out.print("Nhap sdt: ");setPhone(sc.nextInt()); sc.nextLine();
	}
	public void output() {
		System.out.printf("%-10s %-10d %-10s %-10d", getName(), getAge(), getGender(), getPhone());
	}
}
