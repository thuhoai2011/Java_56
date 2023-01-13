package ktra;
import java.util.Scanner;
public class RunMain {
	static HoneyService h = new iplmHoney();
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		do {
			System.out.println("\n--------MENU--------"+
								"\n1.Them 1 Honey."+
								"\n2.Hien thi tat ca Honey."+
								"\n3.Xoa 1 Honey theo id."+
								"\n4.Chon va sua Honey."+
								"\n5.Them so thich."+
								"\n6.Sap xep theo ten."+
								"\n7.Thoat.");
			System.out.print("Nhap lua chon: "); int chose=sc.nextInt();
			switch(chose) {
			case 1:
				h.AddHoney();
				break;
			case 2:
				h.ShowAllHoney();
				break;
			case 3:
				h.DeleteHoneyById();
				break;
			case 4:
				break;
			case 5:
				h.AddFavoriteByHoneyId();
				break;
			case 6:
			case 7:
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
