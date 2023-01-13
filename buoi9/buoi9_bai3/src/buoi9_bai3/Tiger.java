package buoi9_bai3;

public class Tiger extends Animal{
	
	public Tiger() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Tiger(String ten, String moTa, int tuoi) {
		super(ten, moTa, tuoi);
		// TODO Auto-generated constructor stub
	}
	public Tiger(Animal a) {
		super(a);
	}
	@Override
	public void tiengKeu() {
		System.out.print("grrr grrr");
	}
	@Override
	public void xemThongTin() {
		System.out.printf("%-10s %-10s %-10d %-10s ", 
				"Tiger", super.getTen(), super.getTuoi(), super.getMoTa());
	}
}
