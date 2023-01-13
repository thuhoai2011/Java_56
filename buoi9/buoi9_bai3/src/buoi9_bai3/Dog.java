package buoi9_bai3;

public class Dog extends Animal{
	
	public Dog() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Dog(String ten, String moTa, int tuoi) {
		super(ten, moTa, tuoi);
		// TODO Auto-generated constructor stub
	}
	public Dog(Animal a) {
		super(a);
	}
	@Override
	public void tiengKeu() {
		System.out.print("gau gau");
	}
	@Override
	public void xemThongTin() {
		System.out.printf("%-10s %-10s %-10d %-10s ", 
				"Dog", super.getTen(), super.getTuoi(), super.getMoTa());
	}
}