package buoi5_bai1;
import java.util.Scanner;
public class main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("nhap so nhan vien: ");
		int n=sc.nextInt();
		NhanVien[] a=new NhanVien[n];
		for(int i=0; i<n; i++) {
			System.out.print("\nNV"+(i+1));
			a[i]=new NhanVien();
			System.out.print("nhap id:"); int id=sc.nextInt();
			System.out.print("nhap ho ten:"); String hoTen=sc.nextLine(); hoTen=sc.nextLine();
			System.out.print("nhap kieu nhan vien:"); String kieuNV=sc.nextLine();
			System.out.print("nhap so ngay lam:"); int soNgayLam=sc.nextInt();
			System.out.print("nhap nam vao lam:"); int namVao=sc.nextInt();
			a[i].setId(id);
			a[i].setHoTen(hoTen);
			a[i].setKieuNV(kieuNV);
			a[i].setSoNgayLam(soNgayLam);
			a[i].setNamVao(namVao);

		}
		System.out.println("id \t Ho ten \t Kieu NV \t So Ngay Lam \t Nam vao lam \t Luong \t Phu Cap \t Tong Tien");
		for(int i=0; i<n; i++) {
			System.out.println(a[i].toString());
		}
	}

}
