package buoi6_bai3;
import java.util.Scanner;
public class HocSinh {
	private String hoTen, que;
	private int tuoi;
	private Lop lop=new Lop();
	static Scanner sc=new Scanner(System.in);
	public HocSinh() {
	}
	public HocSinh(String hoTen, String que, int tuoi, Lop lop) {
		super();
		this.hoTen = hoTen;
		this.que = que;
		this.tuoi = tuoi;
		this.lop = lop;
	}
	public String getHoTen() {
		return hoTen;
	}
	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}
	public String getQue() {
		return que;
	}
	public void setQue(String que) {
		this.que = que;
	}
	public int getTuoi() {
		return tuoi;
	}
	public void setTuoi(int tuoi) {
		this.tuoi = tuoi;
	}
	public Lop getLop() {
		return lop;
	}
	public void setLop(Lop lop) {
		this.lop = lop;
	}
	public void nhap() {
		lop.nhapLop();
		System.out.print("Nhap ho ten: "); setHoTen(sc.nextLine());
		System.out.print("Nhap tuoi: "); setTuoi(sc.nextInt());
		System.out.print("Nhap que quan: "); sc.nextLine(); setQue(sc.nextLine());
	}
	public void xuat() {
		System.out.printf("%-10s %-10d %-10s ", getHoTen(), getTuoi(), getQue());
		lop.xuatLop();
	}
}
