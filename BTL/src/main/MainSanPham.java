package main;

import DAO.SanPhamDAO;
import model.SanPham;
import services.SanPhamService;
import imp.SanPhamServiceImp;
import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;


public class MainSanPham {
	static Scanner sc = new Scanner(System.in);
	
	public static void themSanPham() throws SQLException{
		SanPhamDAO sanPhamDAO = new SanPhamDAO();
		SanPham sp = new SanPham();
		String maSP;
		boolean check = true;
		do {
			System.out.print("Nhap ma san pham: ");
			maSP = sc.nextLine();
			SanPham sanPham = sanPhamDAO.timMaSP(maSP);
			if(sanPham == null) {
				check = false;
				break; 
			}
			else System.out.println("MaSP da ton tai. Moi ban nhap maSP khac!");
		}while(check == true);
		
		sp.setMaSP(maSP);
		System.out.print("Nhap ten san pham: "); sp.setTenSP(sc.nextLine());
		System.out.print("Nhap gia ban: "); sp.setGiaBan(sc.nextInt());
		System.out.print("Nhap so luong ban: "); sp.setSoLuongBan(sc.nextInt());
		System.out.print("Nhap so luong kho: "); sp.setSoLuongKho(sc.nextInt());
		
		sanPhamDAO.themSP(sp);
		System.out.print("Da them san pham thanh cong!");
	}
	
	public static void suaSP() throws SQLException{
		
		SanPhamDAO sanPhamDAO = new SanPhamDAO();
		SanPham sp = new SanPham();
		String maSP;
		boolean check = true;
		do {
			System.out.print("Nhap ma san pham muon sua: ");
			maSP = sc.nextLine();
			SanPham sanPham = sanPhamDAO.timMaSP(maSP);
			if(sanPham != null) {
				check = false;
				break; 
			}
			else System.out.println("MaSP khong ton tai. Moi ban nhap maSP khac!");
		}while(check == true);
		
		System.out.print("Nhap ten san pham: "); sp.setTenSP(sc.nextLine());
		System.out.print("Nhap gia ban: "); sp.setGiaBan(sc.nextInt());
		System.out.print("Nhap so luong ban: "); sp.setSoLuongBan(sc.nextInt());
		System.out.print("Nhap so luong kho: "); sp.setSoLuongKho(sc.nextInt());
		sc.nextLine();
		sanPhamDAO.suaThongTinSP(sp, maSP);
		System.out.println("Hoan tat!");
	}
	
	public static void xoaSP() throws SQLException{
		SanPhamDAO sanPhamDAO = new SanPhamDAO();
		System.out.print("Nhap ma san pham muon xoa: ");
		String maSP = sc.nextLine();
		SanPham sp = sanPhamDAO.timMaSP(maSP);
		if(sp != null) {
			sanPhamDAO.xoaSP(maSP);
			System.out.println("Da xoa san pham co ma "+ maSP);
		}else System.out.println("Khong tim thay san pham co ma "+ maSP);
	}
	
	public static void danhSachSP() {
		SanPhamDAO sanPhamDAO = new SanPhamDAO();
		try {
			List<SanPham> sanPham = sanPhamDAO.dsSP();
			System.out.println("-DANH SACH SAN PHAM-");
			System.out.printf("%-10s %-15s %-15s %-15s %-15s\n", 
					"MaSP", "TenSP", "GiaBan", "SoLuongBan", "SoLuongKho");
			for(SanPham sp: sanPham) {
				System.out.printf("%-10s %-15s %-15d %-15d %-15d\n", 
					sp.getMaSP(), sp.getTenSP(), sp.getGiaBan(), sp.getSoLuongBan(), sp.getSoLuongKho());
			}
		}catch(SQLException throwables) {
			throwables.printStackTrace();
		}
	}
	
	public static void timKiemSP() {
        int a;
        do {
          System.out.println("--CHUC NANG TIM KIEM SAN PHAM-- ");
          System.out.println("1. Tim kiem theo ma san pham.");
          System.out.println("2. Tim kiem theo ten san pham.");
          System.out.println("3. Thoat khoi che do tim kiem.");
          
          System.out.print("Hay nhap lua chon cua ban:  ");
          a = sc.nextInt();
          sc.nextLine();
          switch (a) {
            case 1: {
              timTheoMaSP();
              break;
            }
            case 2: {
                timTheoTenSP();
                break;
            }
          }
        } while (a != 3);
	}
	
	public static void timTheoMaSP() {
		SanPhamDAO sanPhamDAO = new SanPhamDAO();
		System.out.print("Nhap ma san pham muon tim: ");
		String maSP = sc.nextLine();
		try {
			SanPham sp = sanPhamDAO.timMaSP(maSP);
			if(sp != null) {
				System.out.printf("%-10s %-15s %-15s %-15s %-15s\n", 
						"MaSP", "TenSP", "GiaBan", "SoLuongBan", "SoLuongKho");
				System.out.printf("%-10s %-15s %-15d %-15d %-15d\n", 
						sp.getMaSP(), sp.getTenSP(), sp.getGiaBan(), sp.getSoLuongBan(), sp.getSoLuongKho());
			}else System.out.println("Khong tim thay san pham co ma  "+ maSP);
		}catch(SQLException throwables) {
			throwables.printStackTrace();
		}
	}
	
	public static void timTheoTenSP() {
		SanPhamDAO sanPhamDAO = new SanPhamDAO();
		System.out.print("Nhap ten san pham muon tim: ");
		String tenSP = sc.nextLine();
		try {
			List<SanPham> sanPham = sanPhamDAO.timTenSP(tenSP);
			if(!sanPham.isEmpty()) {
				System.out.printf("%-10s %-15s %-15s %-15s %-15s\n", 
						"MaSP", "TenSP", "GiaBan", "SoLuongBan", "SoLuongKho");
				for(SanPham sp: sanPham) {
					System.out.printf("%-10s %-15s %-15d %-15d %-15d\n", 
							sp.getMaSP(), sp.getTenSP(), sp.getGiaBan(), sp.getSoLuongBan(), sp.getSoLuongKho());
				}
			}else System.out.println("Khong tim thay san pham co ten "+ tenSP);
		}catch(SQLException throwables) {
			throwables.printStackTrace();
		}
	}
	
	public static void sapxepSP() {
        int a;
        do {
          System.out.println("--CHUC NANG SAP XEP SAN PHAM-- ");
          System.out.println("1. Sap xep theo gia ban san pham.");
          System.out.println("2. Sap xep theo so luong ban.");
          System.out.println("3. Sap xep theo so luong kho.");
          System.out.println("4. Thoat khoi che do sap xep.");
          
          System.out.print("Hay nhap lua chon cua ban:  ");
          a = sc.nextInt();
          sc.nextLine();
          switch (a) {
            case 1: {
              sapXepTheoGiaBan();
              break;
            }
            case 2: {
                sapXepTheoSoLuongBan();
                break;
            }
            case 3: {
                sapXepTheoSoLuongKho();
                break;
            }
          }
        } while (a != 4);
	}
	
	public static void sapXepTheoGiaBan() {
		SanPhamDAO sanPhamDAO = new SanPhamDAO();
		try {
			List<SanPham> sanPham = sanPhamDAO.sxSP_giaBan();
			System.out.println("-DANH SACH SAN PHAM-");
			System.out.printf("%-10s %-15s %-15s %-15s %-15s\n", 
					"MaSP", "TenSP", "GiaBan", "SoLuongBan", "SoLuongKho");
			for(SanPham sp: sanPham) {
				System.out.printf("%-10s %-15s %-15d %-15d %-15d\n", 
					sp.getMaSP(), sp.getTenSP(), sp.getGiaBan(), sp.getSoLuongBan(), sp.getSoLuongKho());
			}
		}catch(SQLException throwables) {
			throwables.printStackTrace();
		}
	}
	
	public static void sapXepTheoSoLuongBan() {
		SanPhamDAO sanPhamDAO = new SanPhamDAO();
		try {
			List<SanPham> sanPham = sanPhamDAO.sxSP_soLuongBan();
			System.out.println("-DANH SACH SAN PHAM-");
			System.out.printf("%-10s %-15s %-15s %-15s %-15s\n", 
					"MaSP", "TenSP", "GiaBan", "SoLuongBan", "SoLuongKho");
			for(SanPham sp: sanPham) {
				System.out.printf("%-10s %-15s %-15d %-15d %-15d\n", 
					sp.getMaSP(), sp.getTenSP(), sp.getGiaBan(), sp.getSoLuongBan(), sp.getSoLuongKho());
			}
		}catch(SQLException throwables) {
			throwables.printStackTrace();
		}
	}
	
	public static void sapXepTheoSoLuongKho() {
		SanPhamDAO sanPhamDAO = new SanPhamDAO();
		try {
			List<SanPham> sanPham = sanPhamDAO.sxSP_soLuongKho();
			System.out.println("-DANH SACH SAN PHAM-");
			System.out.printf("%-10s %-15s %-15s %-15s %-15s\n", 
					"MaSP", "TenSP", "GiaBan", "SoLuongBan", "SoLuongKho");
			for(SanPham sp: sanPham) {
				System.out.printf("%-10s %-15s %-15d %-15d %-15d\n", 
					sp.getMaSP(), sp.getTenSP(), sp.getGiaBan(), sp.getSoLuongBan(), sp.getSoLuongKho());
			}
		}catch(SQLException throwables) {
			throwables.printStackTrace();
		}
	}
	
	public static void top3() {
		SanPhamDAO sanPhamDAO = new SanPhamDAO();
		try {
			List<SanPham> sanPham = sanPhamDAO.top3SP();
			System.out.println("-DANH SACH SAN PHAM-");
			System.out.printf("%-10s %-15s %-15s %-15s %-15s\n", 
					"MaSP", "TenSP", "GiaBan", "SoLuongBan", "SoLuongKho");
			for(SanPham sp: sanPham) {
				System.out.printf("%-10s %-15s %-15d %-15d %-15d\n", 
					sp.getMaSP(), sp.getTenSP(), sp.getGiaBan(), sp.getSoLuongBan(), sp.getSoLuongKho());
			}
		}catch(SQLException throwables) {
			throwables.printStackTrace();
		}
	}
	
	public static void muaSanPham() throws SQLException{
		System.out.print("Nhap ten nguoi mua: ");
		String ten = sc.nextLine();
		
		SanPhamDAO sanPhamDAO = new SanPhamDAO();
		SanPham sp = new SanPham(); 
		String maSP;
		boolean check = true;
		do {
			System.out.print("Nhap ma san pham muon mua: ");
			maSP = sc.nextLine();
			SanPham sanPham = sanPhamDAO.timMaSP(maSP);
			if(sanPham != null) {
				check = false;
				break; 
			}
			else System.out.println("MaSP khong ton tai. Moi ban nhap maSP khac!");
		}while(check == true);
		
		int sl;
		do {
			System.out.print("Nhap so luong mua: ");
			sl = sc.nextInt();
			int slk = sanPhamDAO.getSoLuongKho(maSP);
			if(sl < slk) {
				check = false;
				break; 
			}
			else System.out.println("so luong ban muon mua lon hon so luong kho.");
		}while(check == true);
		
		int slban = sanPhamDAO.getSoLuongBan(maSP) + sl;
		int slkho = sanPhamDAO.getSoLuongKho(maSP) - sl;
		
		sp.setSoLuongBan(slban);
		sp.setSoLuongKho(slkho);
		sanPhamDAO.muasp(sp, maSP);
		
		int tongTien = sl*sanPhamDAO.getGiaBan(maSP);
		
		System.out.println("Ban da mua hang thanh cong!");
		System.out.println("----------------------------");
		System.out.println("Nguoi mua: "+ ten);
		System.out.printf("%-10s %-15s %-15s %-15s %-15s\n", 
				"MaSP", "TenSP", "GiaBan", "SoLuongMua", "ThanhTien");
		System.out.printf("%-10s %-15s %-15d %-15d %-15d\n", 
				maSP, sanPhamDAO.getTenSP(maSP), sanPhamDAO.getGiaBan(maSP), sl, tongTien);
		System.out.println("Cam on ban da mua hang!");
		System.out.println("----------------------------");
	}
}
