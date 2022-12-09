package buoi6_bai4;
import java.util.Scanner;
import java.util.ArrayList;
public class Main {
	static ArrayList<Nguoi> ng= new ArrayList<>();
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		System.out.print("Nhap so can bo GV: "); 
		int n=sc.nextInt(); sc.nextLine();
		for(int i=0; i<n; i++) {
			System.out.println("Nhap GV "+(i+1));
			Nguoi newng= new Nguoi();
			newng.nhap();
			ng.add(newng);
		}
		themNg();
		xoa();
	}
	private static void tieude() {
		System.out.println("--------------------------------------------------");
		System.out.printf("%-10s %-10s %-10s %-10s %-10s %-10s %-15s %-12s \n", 
				"HoTen", "Tuoi", "Que", "MaSoGV", "LuongCung", "LuongThuong", "LuongPhat", "TongLuong");
	}
	private static void hienthi() {
		tieude();
		for(int i=0; i<ng.size(); i++) {
			ng.get(i).xuat();
		}
	}
	private static void themNg() {
		System.out.println("Nhap thong tin GV can them");
		Nguoi newng= new Nguoi();
		newng.nhap();
		ng.add(newng);
		hienthi();
	}
	private static void xoa() {
		System.out.print("Nhap ma so GV muon xoa: "); 
		int check=sc.nextInt();
		for(int i=0; i<ng.size(); i++) {
			if(ng.get(i).getMaSoGV()==check)
				ng.remove(i);
		}
		hienthi();
	}
}
