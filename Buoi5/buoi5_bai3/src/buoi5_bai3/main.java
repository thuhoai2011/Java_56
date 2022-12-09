package buoi5_bai3;
import java.util.Scanner;
public class main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("nhap so sinh vien: ");
		int n=sc.nextInt();
		SinhVien[] a=new SinhVien[n];
		for(int i=0; i<n; i++) {
			System.out.println("\nSV"+(i+1));
			a[i]=new SinhVien();
			System.out.print("nhap ma SV:"); int maSV=sc.nextInt();
			System.out.print("nhap ho ten:"); String hoTen=sc.nextLine(); hoTen=sc.nextLine();
			System.out.print("nhap dia chi:"); String diaChi=sc.nextLine();
			System.out.print("nhap so dien thoai:"); int sdt=sc.nextInt();
			System.out.print("nhap diem:"); float diem=sc.nextFloat();
			a[i].setMaSV(maSV);
			a[i].setHoTen(hoTen);
			a[i].setDiaChi(diaChi);
			a[i].setSdt(sdt);
			a[i].setDiem(diem);
		}
		boolean check=true;
		do{
			System.out.println("\n---Menu---");
			System.out.println("0.Xuat DS theo thu tu tang dan cua diem");
			System.out.println("1.Tim kiem theo ten");
			System.out.println("2.Sx theo ten");
			System.out.println("3.Thoat");
			System.out.print("Ban chon: ");
			int k=sc.nextInt();
			switch(k) {
				case 0:
					for(int i=0; i<n-1; i++) {
						for(int j=i+1; j<n; j++) {
							if(a[i].getDiem() > a[j].getDiem()) {
								SinhVien t=a[i];
								a[i]=a[j];
								a[j]=t;
							}
						}
					}
					System.out.println("------------------------");
					System.out.println("Ma SV \t Ho ten \t Dia Chi \t So DT \t Diem");
					for(int i=0; i<n; i++) {
						System.out.println(a[i].toString());
					}
					break;
				case 1:
					System.out.print("Nhap ten can tim: ");
					String s=sc.nextLine(); s=sc.nextLine();
					int cnt=0;
					for(int i=0; i<n; i++) {
						if(s.equalsIgnoreCase(a[i].getHoTen())==true) {
							System.out.println("Ma SV \t Ho ten \t Dia Chi \t So DT \t Diem");
							System.out.println(a[i]);
							cnt++;
						}
					}
					if(cnt==0) System.out.print("Khong co ten can tim");
					break;
				case 2:
					for (int i = 0; i<n-1; i++){
			            for (int j = i + 1; j<n; j++) {
			            	String t1=a[i].getHoTen().substring(a[i].getHoTen().lastIndexOf(" ",a[i].getHoTen().length()));
			            	String t2=a[j].getHoTen().substring(a[j].getHoTen().lastIndexOf(" ",a[j].getHoTen().length()));
			                if (t1.compareTo(t2)>0){
			                    SinhVien temp = a[i];
			                    a[i] = a[j];
			                    a[j] = temp;
			                }
			            }
			        }
					System.out.println("------------------------");
					System.out.println("Ma SV \t Ho ten \t Dia Chi \t So DT \t Diem");
					for(int i=0; i<n; i++) {
						System.out.println(a[i].toString());
					}
					break;
				case 3:
					check=false;
					break;
			}
		}while(check);
	}

}
