package buoi6_bai4;
import java.util.Scanner;
public class CBGV {
	private double lcung, lthuong, lphat;
	static Scanner sc=new Scanner(System.in);
	public CBGV() {
	}
	public CBGV(double lcung, double lthuong, double lphat) {
		super();
		this.lcung = lcung;
		this.lthuong = lthuong;
		this.lphat = lphat;
	}
	public double getLcung() {
		return lcung;
	}
	public void setLcung(double lcung) {
		this.lcung = lcung;
	}
	public double getLthuong() {
		return lthuong;
	}
	public void setLthuong(double lthuong) {
		this.lthuong = lthuong;
	}
	public double getLphat() {
		return lphat;
	}
	public void setLphat(double lphat) {
		this.lphat = lphat;
	}
	public double luongThuc() {
		return this.lcung+this.lthuong-this.lphat;
	}
	public void nhapLuong() {
		System.out.print("Nhap luong cung: "); setLcung(sc.nextDouble());
		System.out.print("Nhap luong thuong: "); setLthuong(sc.nextDouble());
		System.out.print("Nhap luong phat: "); setLphat(sc.nextDouble());
	}
	public void xuatLuong() {
		System.out.printf("%-10f %-10f %-10f %-10f \n", 
				getLcung(), getLthuong(), getLphat(), luongThuc());
	}
}
