package buoi6_bai4;
import java.util.Scanner;
public class Nguoi {
	private String hoTen, que;
	private int tuoi, maSoGV;
	private CBGV cb=new CBGV();
	static Scanner sc=new Scanner(System.in);
	public Nguoi() {
	}
	public Nguoi(String hoTen, String que, int tuoi, int maSoGV, CBGV cb) {
		super();
		this.hoTen = hoTen;
		this.que = que;
		this.tuoi = tuoi;
		this.maSoGV = maSoGV;
		this.cb = cb;
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
	public int getMaSoGV() {
		return maSoGV;
	}
	public void setMaSoGV(int maSoGV) {
		this.maSoGV = maSoGV;
	}
	public CBGV getCBGV() {
		return cb;
	}
	public void setCBGV(CBGV cb) {
		this.cb = cb;
	}
	public void nhap() {
		
		System.out.print("Nhap ho ten: ");setHoTen(sc.nextLine());
		System.out.print("Nhap tuoi: ");setTuoi(sc.nextInt()); 
		sc.nextLine();
		System.out.print("Nhap que quan: ");setQue(sc.nextLine());
		System.out.print("Nhap ma so GV: ");setMaSoGV(sc.nextInt());
		sc.nextLine();
		cb.nhapLuong();
	}
	public void xuat() {
		System.out.printf("%-10s %-10d %-10s %-10d", getHoTen(), getTuoi(), getQue(), getMaSoGV());
		cb.xuatLuong();
	}
}
