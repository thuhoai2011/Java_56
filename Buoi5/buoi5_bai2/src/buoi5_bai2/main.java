package buoi5_bai2;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("nhap so oto: ");
		int n=sc.nextInt();
		Oto[] a=new Oto[n];
		
		for(int i=0; i<n; i++) {
			System.out.println("\nOto"+(i+1));
			a[i]=new Oto();
			System.out.print("nhap chu so huu:"); String chuSoHuu=sc.nextLine(); chuSoHuu=sc.nextLine();
			System.out.print("nhap ten xe:"); String tenXe=sc.nextLine(); 
			System.out.print("nhap hang xe:"); String hang=sc.nextLine();
			System.out.print("nhap gia:"); int gia=sc.nextInt();
			System.out.print("nhap nam sd:"); int namMua=sc.nextInt();
			a[i].setChuSoHuu(chuSoHuu);
			a[i].setTenXe(tenXe);
			a[i].setHang(hang);
			a[i].setGia(gia);
			a[i].setNamMua(namMua);
		}
		System.out.println("---------------------------------------");
		System.out.println("Chu so huu \t Ten Xe \t Hang Xe \t Gia Xe \t Nam sd \t Gia tri hien tai ");
		for(int i=0; i<n; i++) {
			System.out.println(a[i].toString());
		}
		
		for(int i=0; i<n-1;i++) {
			for(int j=i+1; j<n;j++) {
				if(a[i].giaTri() > a[j].giaTri()) {
					Oto t=a[i];
					a[i]=a[j];
					a[j]=t;
				}
			}
		}
		System.out.println("---------------------------------------");
		System.out.println("Chu so huu \t Ten Xe \t Hang Xe \t Gia Xe \t Nam sd \t Gia tri hien tai ");
		for(int i=0; i<n; i++) {
			System.out.println(a[i].toString());
		}
		
		System.out.println("---------------------------------------");
		System.out.println("Chu so huu \t Ten Xe \t Hang Xe \t Gia Xe \t Nam sd \t Gia tri hien tai ");
		for(int i=0; i<n; i++) {
			if(a[i].giaTri()==0)
				System.out.println(a[i].toString());
		}
	}
}
