package buoi9_bai3;
import java.util.Scanner;
public abstract class Animal {
	private String ten, moTa;
	private int tuoi;
	static Scanner sc=new Scanner(System.in);
	public Animal(String ten, String moTa, int tuoi) {
		super();
		this.ten = ten;
		this.moTa = moTa;
		this.tuoi = tuoi;
	}
	public Animal() {
	}
	public String getTen() {
		return ten;
	}
	public void setTen(String ten) {
		this.ten = ten;
	}
	public String getMoTa() {
		return moTa;
	}
	public void setMoTa(String moTa) {
		this.moTa = moTa;
	}
	public int getTuoi() {
		return tuoi;
	}
	public void setTuoi(int tuoi) {
		this.tuoi = tuoi;
	}
	public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap Ten: ");
        this.setTen(sc.nextLine());
        System.out.print("Nhap Tuoi: ");
        this.setTuoi(sc.nextInt());
        sc.nextLine();
        System.out.print("Nhap Mo ta: ");
        this.setMoTa(sc.nextLine());
    }
	public abstract void xemThongTin();
	public abstract void tiengKeu();
}
