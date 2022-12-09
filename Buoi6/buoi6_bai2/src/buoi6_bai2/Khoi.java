package buoi6_bai2;
import java.util.Scanner;
public class Khoi {
	private String mon1, mon2, mon3;
	static Scanner sc=new Scanner(System.in);
	public Khoi() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Khoi(String mon1, String mon2, String mon3) {
		super();
		this.mon1 = mon1;
		this.mon2 = mon2;
		this.mon3 = mon3;
	}
	public String getMon1() {
		return mon1;
	}
	public void setMon1(String mon1) {
		this.mon1 = mon1;
	}
	public String getMon2() {
		return mon2;
	}
	public void setMon2(String mon2) {
		this.mon2 = mon2;
	}
	public String getMon3() {
		return mon3;
	}
	public void setMon3(String mon3) {
		this.mon3 = mon3;
	}
	public void nhapKhoi() {
		System.out.print("Nhap mon 1: "); setMon1(sc.nextLine());
		System.out.print("Nhap mon 2: "); setMon2(sc.nextLine());
		System.out.print("Nhap mon 3: "); setMon3(sc.nextLine());
	}
	public String chiaKh() {
		if(getMon1().equalsIgnoreCase("toan")==true) {
			if(getMon2().equalsIgnoreCase("ly")==true) {
				if(getMon3().equalsIgnoreCase("hoa")==true)
					return ("A");
				else return ("khong hop le");
			}else if(getMon2().equalsIgnoreCase("hoa")==true) {
				if(getMon3().equalsIgnoreCase("sinh")==true) 
					return ("B");
				else return ("Khong hop le");
			}else return ("Khong hop le");
		}else if(getMon1().equalsIgnoreCase("van")==true) {
			if(getMon2().equalsIgnoreCase("su")==true) {
				if(getMon3().equalsIgnoreCase("dia")==true)
					return ("C");
				else return ("khong hop le");
			}else return ("khong hop le");
		}else return ("Khong hop le"); 
	}
	public void xuatKhoi() {
		System.out.printf("%-10s", chiaKh());
	}
}
