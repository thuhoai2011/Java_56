package buoi6_bai2;
import java.util.Scanner;
public class SinhVien {
	private int sbd;
	private String hoTen, diaChi, mucUuTien;
	private static Khoi a=new Khoi();
	private static Scanner sc=new Scanner(System.in);
	public SinhVien(int sbd, String hoTen, String diaChi, String mucUuTien, Khoi a) {
		super();
		this.sbd = sbd;
		this.hoTen = hoTen;
		this.diaChi = diaChi;
		this.mucUuTien = mucUuTien;
		this.a=a;
	}
	public Khoi getA() {
		return a;
	}
	public void setA(Khoi a) {
		this.a = a;
	}
	public SinhVien() {
	}
	public int getSbd() {
		return sbd;
	}
	public void setSbd(int sbd) {
		this.sbd = sbd;
	}
	public String getHoTen() {
		return hoTen;
	}
	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}
	public String getDiaChi() {
		return diaChi;
	}
	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}
	public String getMucUuTien() {
		return mucUuTien;
	}
	public void setMucUuTien(String mucUuTien) {
		this.mucUuTien = mucUuTien;
	}
	public void nhap() {
		System.out.print("Nhap so bao danh: "); setSbd(sc.nextInt());
		System.out.print("Nhap ho ten: "); sc.nextLine();setHoTen(sc.nextLine());
		System.out.print("Nhap dia chi: "); setDiaChi(sc.nextLine());
		System.out.print("Nhap muc uu tien: "); setMucUuTien(sc.nextLine());
		a.nhapKhoi();
	}
	
	public void xuat() {
		System.out.printf("%-11d %-15s %-10s %-15s", 
				getSbd(), getHoTen(), getDiaChi(), getMucUuTien());
		a.xuatKhoi();
	}
}
