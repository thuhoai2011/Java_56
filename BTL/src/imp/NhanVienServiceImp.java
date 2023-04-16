package imp;
import java.util.Scanner;
import model.NhanVien;
import services.NhanVienService;
public class NhanVienServiceImp implements NhanVienService{
	@Override
	public void input(NhanVien nv) {
		Scanner sc=new Scanner(System.in);
		System.out.println("-Nhap thong tin-");
		System.out.print("Nhap ma NV: "); nv.setMaNV(sc.nextLine());
		System.out.print("Nhap ten NV: "); nv.setTenNV(sc.nextLine());
		System.out.print("Nhap tuoi NV: "); nv.setTuoiNV(sc.nextInt());
		sc.nextLine();
		System.out.print("Nhap dia chi NV: "); nv.setDiaChiNV(sc.nextLine());
	}
	
	@Override
	public void output(NhanVien nv) {
		System.out.printf("%-10s %-10s %-10d %-10s %-10s ", 
				nv.getMaNV(), nv.getTenNV(), nv.getTuoiNV(), nv.getDiaChiNV());
	}
}
