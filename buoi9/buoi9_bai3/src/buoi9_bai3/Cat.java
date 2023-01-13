package buoi9_bai3;

public class Cat extends Animal{
	
	public Cat() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Cat(String ten, String moTa, int tuoi) {
		super(ten, moTa, tuoi);
		// TODO Auto-generated constructor stub
	}
	public Cat(Animal a) {
		super(a);
	}
	@Override
	public void tiengKeu() {
		System.out.print("meow meow");
	}
	@Override
	public void xemThongTin() {
		System.out.printf("%-10s %-10s %-10d %-10s ", 
				"Cat", super.getTen(), super.getTuoi(), super.getMoTa());
	}
}