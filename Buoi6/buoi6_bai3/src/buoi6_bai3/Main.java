package buoi6_bai3;
import java.util.Scanner;
import java.util.ArrayList;
public class Main {
	static ArrayList<HocSinh> hs = new ArrayList<>();
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		System.out.print("Nhap so hoc sin can nhap: ");
		int n=sc.nextInt();
		for(int i=0; i<n; i++) {
			System.out.println("\nHS"+(i+1));
			HocSinh hocsinh=new HocSinh();
			hocsinh.nhap();
			hs.add(hocsinh);
		}
		do {
			System.out.println("\n----------MENU---------"+
							"\n1.Them hoc sinh moi."+
							"\n2.Xuat ra thong tin hoc sinh."+
							"\n3.Hien thi hoc sinh 20 tuoi."+
							"\n4.So luong HS 23 tuoi va que DN."+
							"\n5.Sap xep HS tang dan theo que quan."+
							"\n6.Ket thuc chuong trinh.");
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
				dem();
				break;
			case 5:
				sapxep();
				break;
			case 6:
				System.out.println("Ket thuc chuong trinh!");
				return;
			default:
				System.out.println("khong hop le!");
				break;
			}
		}while(true);

	}

	private static void tieude() {
		System.out.printf("%-10s %-10s %-10s %-10s %-10s \n", 
				"HoTen", "Tuoi", "QueQuan", "MaLop", "TenLop");
	}
	private static void hienthi() {
		tieude();
		for(int i=0; i<hs.size(); i++) {
			hs.get(i).xuat();
		}
	}
	private static void them() {
		HocSinh hocsinh=new HocSinh();
		hocsinh.nhap();
		hs.add(hocsinh);
	}
	private static void timkiem() {
		int cnt=0;
		tieude();
		for(int i=0; i<hs.size(); i++) {
			if(hs.get(i).getTuoi()==20) {
				hs.get(i).xuat();
				cnt++;
			}
		}
		if(cnt==0)
			System.out.println("khong tim thay hoc sinh");
	}
	private static void dem() {
		int cnt=0;
		for(int i=0; i<hs.size(); i++) {
			if(hs.get(i).getTuoi()==23 && hs.get(i).getQue().equalsIgnoreCase("DN")==true) {
				cnt++;
			}
		}
		if(cnt>0) System.out.println("Co "+cnt+" HS 23 tuoi va que DN");
		
		else System.out.println("Khong co HS nao");
	}
	private static void sapxep() {
		for (int i = 0; i<hs.size() - 1; i++) {
	        for (int j = i+1; j<hs.size(); j++) {
	          if (hs.get(i).getQue().compareTo(hs.get(j).getQue()) > 0) {
	            HocSinh tem = hs.get(i);
	            hs.set(i, hs.get(j));
	            hs.set(j, tem);
	          }
	        }
	      }
	      hienthi();
	}
}
