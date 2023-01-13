package buoi9_bai3;
import java.util.ArrayList;
import java.util.Scanner;
public class Zoo {
	static ArrayList<Chuong> DanhSachChuong = new ArrayList<Chuong>();
	static Scanner sc=new Scanner(System.in);
	public Zoo() {
		super();
		// TODO Auto-generated constructor stub
	}
	public void themChuong(Chuong c) {
		this.DanhSachChuong.add(c);
	}
	public void xoaChuong(int maChuong) {
		for(int i=0; i<DanhSachChuong.size(); i++) {
			if(DanhSachChuong.get(i).getMaChuong()==maChuong) {
				DanhSachChuong.remove(i);
				break;
			}
		}
	}
	public void xuat() {
		for(int i=0; i<DanhSachChuong.size();i++) {
			System.out.println("\n-Chuong "+ DanhSachChuong.get(i).getMaChuong()+"-");
			DanhSachChuong.get(i).display();
		}
	}
}
