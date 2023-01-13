package ktra;
import java.util.Scanner;
public class Favorite {
	private String id, name;
	static Scanner sc=new Scanner(System.in);
	public Favorite() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Favorite(String id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void nhap() {
		System.out.print("Nhap ma so thich: ");setId(sc.nextLine());
		System.out.print("Nhap ten so thich: ");setName(sc.nextLine());
	}
	public void xuat() {
		System.out.printf("%-10s %-10s", getId(), getName());
	}
}
