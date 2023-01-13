package buoi9_bai3;
import java.util.Scanner;
public class TestZoo {
	static Scanner sc=new Scanner(System.in);
	static ZooService z = new iplmZoo();
	public static void main(String[] args) {
		do {
			System.out.println("\n--------MENU--------"+
								"\n1.Them chuong."+
								"\n2.Xoa chuong."+
								"\n3.Them con vat."+
								"\n4.Xoa con vat."+
								"\n5.Xem tat ca con vat."+
								"\n6.Thoat.");
			System.out.print("Nhap lua chon: "); int chose=sc.nextInt();
			switch(chose) {
			case 1:
				z.themChuongMoi();
				break;
			case 2:
				z.xoaChuong();
				break;
			case 3:
				z.themConVatMoi();
				break;
			case 4:
				z.xoaConVat();
				break;
			case 5:
				z.xuatZoo();
				break;
			case 6:
				System.out.print("Thoat chuong trinh!");
				System.exit(0);
				break;
			default:
				System.out.print("Lua chon khong hop le!"); 
				break;
			}
		}while(true);

	}
}
