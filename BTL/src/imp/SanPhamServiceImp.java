package imp;
import java.util.Scanner;
import model.SanPham;
import services.SanPhamService;
public class SanPhamServiceImp implements SanPhamService{
	@Override
	public void input(SanPham sp) {
		Scanner sc=new Scanner(System.in);
		System.out.println("-Nhap thong tin san pham-");
		System.out.print("Nhap ma SP: "); sp.setMaSP(sc.nextLine());
		System.out.print("Nhap ten SP: "); sp.setTenSP(sc.nextLine());
		System.out.print("Nhap gia ban: "); sp.setGiaBan(sc.nextInt());
		System.out.print("Nhap so luong ban: "); sp.setSoLuongBan(sc.nextInt());
		System.out.print("Nhap so luong trong kho: "); sp.setSoLuongKho(sc.nextInt());
		sc.nextLine();
	}
	@Override
	public void output(SanPham sp) {
		System.out.printf("%-10s %-10s %-10d %-10d %-10d ", 
				sp.getMaSP(), sp.getTenSP(), sp.getGiaBan(), sp.getSoLuongBan(), sp.getSoLuongKho());
	}
}
