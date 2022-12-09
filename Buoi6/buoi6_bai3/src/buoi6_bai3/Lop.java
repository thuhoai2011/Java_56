package buoi6_bai3;
import java.util.Scanner;
public class Lop {
	private String maLop, tenLop;
	static Scanner sc=new Scanner(System.in);
	public Lop() {
	}
	public Lop(String maLop, String tenLop) {
		super();
		this.maLop = maLop;
		this.tenLop = tenLop;
	}
	public String getMaLop() {
		return maLop;
	}
	public void setMaLop(String maLop) {
		this.maLop = maLop;
	}
	public String getTenLop() {
		return tenLop;
	}
	public void setTenLop(String tenLop) {
		this.tenLop = tenLop;
	}
	public void nhapLop() {
		System.out.print("Nhap ma lop: "); setMaLop(sc.nextLine());
		System.out.print("Nhap ten lop: "); setTenLop(sc.nextLine());
	}
	public void xuatLop() {
		System.out.printf("%-10s %-10s \n", getMaLop(), getTenLop());
	}
}
