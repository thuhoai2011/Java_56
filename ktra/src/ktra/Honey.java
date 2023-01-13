package ktra;
import java.util.Scanner;
import java.util.ArrayList;
public class Honey extends Person{
	private String id;
	private int status;
	private ArrayList<Favorite> favorite = new ArrayList<>();
	static Scanner sc=new Scanner(System.in);
	public Honey() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Honey(String name, int age, String gender, int phone) {
		super(name, age, gender, phone);
		// TODO Auto-generated constructor stub
	}
	public Honey(String id, int status) {
		super();
		this.id = id;
		this.status = status;

	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public void input() {
		super.intput();
		System.out.print("Nhap ma ny: ");setId(sc.nextLine());
		System.out.print("Nhap trang thai iu: ");setStatus(sc.nextInt()); 
		System.out.print("Nhap so so thich: ");int n=sc.nextInt();
		sc.nextLine();
		for(int i=0; i<n; i++) {
			System.out.print("So thich "+(i+1));
			Favorite fvr=new Favorite();
			fvr.nhap();
			favorite.add(fvr);
		}
	}
	public void output() {
		super.output();
		System.out.printf("%-10s %-10d", getId(), getStatus());
		for(int i=0; i<favorite.size(); i++) {
			favorite.get(i).xuat();
		}
	}
}
