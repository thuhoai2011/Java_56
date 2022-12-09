package buoi6_bai2;
import java.util.Scanner;
import java.util.ArrayList;
public class Main {
	static ArrayList<SinhVien> sv=new ArrayList<>();
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		System.out.print("Nhap so sinh vien muon nhap: ");
		int n=sc.nextInt();
		for(int i=0; i<n; i++) {
			System.out.println("\nSV"+(i+1));
			SinhVien sinhvien=new SinhVien();
			sinhvien.nhap();
			sv.add(sinhvien);
		}
		do {
			System.out.println("\n----------MENU---------"+
							"\n1.Them moi thi sinh."+
							"\n2.Hien thi thong tin thi sinh."+
							"\n3.Tim kiem theo sbd."+
							"\n4.Thoat khoi chuong trinh.");
			System.out.print("Nhap lua chon:");
			int chose=sc.nextInt();
			switch(chose) {
			case 1:
				them();
				break;
			case 2:
				hienthi();
				break;
			case 3:
				timkiem();
				break;
			case 4:
				System.out.println("Thoat chuong trinh");
				return;
			default:
				System.out.println("khong hop le!");
				break;
			}
		}while(true);
	}
	
	private static void tieude() {
		System.out.printf("%-10s %-15s %-10s %-10s %-10s \n", 
				"So bao danh", "Ho Ten", "Dia Chi", "Muc Uu Tien", "Khoi");
	}
	private static void hienthi() {
		tieude();
		for(int i=0; i<sv.size(); i++) {
			sv.get(i).xuat();
		}
	}
	private static void them() {
		SinhVien sinhvien=new SinhVien();
		sinhvien.nhap();
		sv.add(sinhvien);
	}
	private static void timkiem() {
		System.out.print("Nhap sbd muon tim: ");
		int find=sc.nextInt();
		int cnt=0;
		for(int i=0; i<sv.size(); i++) {
			if(sv.get(i).getSbd()==find) {
				tieude();
				sv.get(i);
				cnt++;
				break;
			}
		}
		if(cnt==0)
			System.out.println("khong tim thay thi sinh");
	}
}
