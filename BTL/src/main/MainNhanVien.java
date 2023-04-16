package main;

import DAO.AccountDAO;
import DAO.NhanVienDAO;
import model.Account;
import model.NhanVien;
import services.AccountService;
import services.NhanVienService;
import imp.AccountServiceImp;
import imp.NhanVienServiceImp;
import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static DAO.NhanVienDAO.getTenNV;
import static main.MainAccount.listTK;
import static main.MainSanPham.*;


public class MainNhanVien {
	static Scanner sc = new Scanner(System.in);
	public static void dangNhap() throws SQLException{
		String username_regex = "^[a-z]+$";
		Pattern pattern;
		Matcher matcher;
		String username;
		do {
			System.out.print("Ten dang nhap: ");
			username = sc.nextLine();
			pattern = Pattern.compile(username_regex);
			matcher = pattern.matcher(username);
			if(matcher.find()) break;
			else System.out.println("Ten dang nhap khong ton tai");
		}while(!matcher.find()); 
		
		System.out.print("Mat khau: ");
		String password = sc.nextLine();
		boolean check=false;
		for(Account tk : listTK()) {
			if(tk.getRole().equals("admin") && tk.getUsername().equals(username) && tk.getPassword().equals(password)) {
				System.out.println("\nCHAO ADMIN, BAN CO THE THUC HIEN MOT SO CHUC NANG");
				int choseAd;
				do {
					System.out.println("\n------------------------------------------");
					System.out.println("--CHUC NANG QUAN LI NHAN VIEN--");
			        System.out.println("1. Tim kiem nhan vien.");
			        System.out.println("2. Xoa mot nhan vien theo maNV.");
			        System.out.println("3. Sap xep thong tin nhan vien.");
			        System.out.println("4. In danh sach nhan vien");
			        
			        System.out.println("\n--CHUC NANG QUAN LI SAN PHAM--");
			        System.out.println("5. Them mot san pham moi.");
			        System.out.println("6. Tim kiem san pham.");
			        System.out.println("7. Xoa mot san pham theo maSP.");
			        System.out.println("8. Sua mot san pham.");
			        System.out.println("9. Sap xep san pham.");
			        System.out.println("10. In ra top 3 san pham ban chay nhat.");
			        System.out.println("11. In danh sach san pham");
			        
			        System.out.println("\n--12. THOAT--");
			        System.out.println("------------------------------------------");
			        System.out.print("Hay nhap lua chon cua ban:  ");
			        choseAd = sc.nextInt();
			        sc.nextLine();
			        switch (choseAd) {
			          case 1: {
			            timKiemNV();
			            break;
			          }
			          case 2: {
			            xoaNV();
			            break;
			          }
			          case 3: {
			            sapXepNV();
			            break;
			          }
			          case 4: {
			        	  danhSachNV();
			        	  break;
			          }
			          case 5: {
			        	  themSanPham();
			        	  break;
			          }
			          case 6: {
			        	  timKiemSP();
			        	  break;
			          }
			          case 7: {
			        	  xoaSP();
			        	  break;
			          }
			          case 8: {
			        	  suaSP();
			        	  break;
			          }
			          case 9: {
			        	  sapxepSP();
			        	  break;
			          }
			          case 10: {
			        	  top3();
			        	  break;
			          }
			          case 11: {
			        	  danhSachSP();
			        	  break;
			          }
			        }
				}while (choseAd != 12);
				check=true;
				break;
			}
			if (tk.getRole().equals("user") && tk.getUsername().equals(username) && tk.getPassword().equals(password)) {
		        System.out.println("\nCHAO " + getTenNV(username) + ", BAN CO THE THUC HIEN MOT SO CHUC NANG-");
		        int choseUs;
		        do {
		        	System.out.println("\n------------------------------------------");
		        	System.out.println("--CHUC NANG CUA BAN-- ");
		        	System.out.println("1. Chinh sua thong tin cua ban.");
		        	System.out.println("2. Tim kiem san pham theo ten.");
		        	System.out.println("3. Mua san pham.");
		        	System.out.println("4. Thoat.");
		        	System.out.println("------------------------------------------");
		        	System.out.print("Hay nhap lua chon cua ban:  ");
		        	choseUs = sc.nextInt();
		        	sc.nextLine();
		        	switch (choseUs) {
		            	case 1: {
		            		suaNV(username);
		              	break;
		            	}
		            	case 2: {
		            		timTheoTenSP();
		            		break;
		            	}
		            	case 3: {
		            		muaSanPham();
		            		break;
		            	}
		        	}
		        } while (choseUs != 4);
		        check = true;
		        break;
		      }
		}
		if (!check) System.out.println("Tai khoan khong hop le!");
	}
	
	public static void dangKiTK() throws SQLException{
		NhanVienServiceImp nvImp = new NhanVienServiceImp();
		NhanVienDAO nvDAO = new NhanVienDAO();
		NhanVien nv = new NhanVien();
		
		boolean check = true;
		
		do {
			nvImp.input(nv);
			if(nvDAO.timMaNV(nv.getMaNV())==null) {
				check = false;
				break;
			}else System.out.println("MaNV da ton tai. Moi ban nhap lai!");
		}while(check==true);
		
		AccountService accNV = new AccountServiceImp();
		AccountDAO accDAO = new AccountDAO();
		Account acc = new Account();
		
		accNV.input(acc);
		accDAO.add(acc);
		
		nv.setUsername(acc.getUsername());
		nvDAO.themNV(nv, nv.getUsername());
		System.out.println("Tao tai khoan moi thanh cong!");
	}
	
	public static void timKiemNV() {
        int a;
        do {
          System.out.println("--CHUC NANG TIM KIEM NHAN VIEN-- ");
          System.out.println("1. Tim kiem theo ma nhan vien.");
          System.out.println("2. Tim kiem theo ten nhan vien.");
          System.out.println("3. Tim kiem theo tuoi nhan vien.");
          System.out.println("4. Tim kiem theo dia chi nhan vien.");
          System.out.println("5. Thoat khoi che do tim kiem.");
          
          System.out.print("Hay nhap lua chon cua ban:  ");
          a = sc.nextInt();
          sc.nextLine();
          switch (a) {
            case 1: {
              timTheoMaNV();
              break;
            }
            case 2: {
                timTheoTenNV();
                break;
            }
            case 3: {
                timTheoTuoiNV();
                break;
            }
            case 4: {
                timTheoDiaChiNV();
                break;
            }
          }
        } while (a != 5);
	}
	
	public static void timTheoTenNV() {
		NhanVienDAO nhanVienDAO = new NhanVienDAO();
		System.out.print("Nhap ten nhan vien muon tim: ");
		String tenNV = sc.nextLine();
		try {
			List<NhanVien> nhanVien = nhanVienDAO.timTenNV(tenNV);
			if(!nhanVien.isEmpty()) {
				System.out.printf("%-10s %-15s %-15s %-15s %-15s\n", 
						"MaNV", "TenNV", "Tuoi", "DiaChi", "Username");
				for(NhanVien nv: nhanVien) {
					System.out.printf("%-10s %-15s %-15d %-15s %-15s\n", 
							nv.getMaNV(), nv.getTenNV(), nv.getTuoiNV(), nv.getDiaChiNV(), nv.getUsername());
				}
			}else System.out.println("Khong tim thay nhan vien co ten "+ tenNV);
		}catch(SQLException throwables) {
			throwables.printStackTrace();
		}
	}
	
	public static void timTheoMaNV() {
	    NhanVienDAO nhanVienDAO = new NhanVienDAO();
	    System.out.println("Nhap ma nhan vien muon  tim: ");
	    String maNV = sc.nextLine();
	    try {
	      NhanVien nv = nhanVienDAO.timMaNV(maNV);
	      if (nv != null) {
	    	  System.out.printf("%-10s %-15s %-15s %-15s %-15s\n", 
						"MaNV", "TenNV", "Tuoi", "DiaChi", "Username");
	    	  System.out.printf("%-10s %-15s %-15d %-15s %-15s\n", 
						nv.getMaNV(), nv.getTenNV(), nv.getTuoiNV(), nv.getDiaChiNV(), nv.getUsername());
	      } else System.out.println("Khong tim thay nhan vien co maNV: " + maNV);
	    } catch (SQLException throwables) {
	      throwables.printStackTrace();
	    }
	  }
	
	public static void timTheoTuoiNV() {
		NhanVienDAO nhanVienDAO = new NhanVienDAO();
		System.out.print("Nhap tuoi nhan vien muon tim: ");
		int tuoiNV = sc.nextInt();
		try {
			List<NhanVien> nhanVien = nhanVienDAO.timTuoiNV(tuoiNV);
			if(!nhanVien.isEmpty()) {
				System.out.printf("%-10s %-15s %-15s %-15s %-15s\n", 
						"MaNV", "TenNV", "Tuoi", "DiaChi", "Username");
				for(NhanVien nv: nhanVien) {
					System.out.printf("%-10s %-15s %-15d %-15s %-15s\n", 
							nv.getMaNV(), nv.getTenNV(), nv.getTuoiNV(), nv.getDiaChiNV(), nv.getUsername());
				}
			}else System.out.println("Khong tim thay nhan vien tuoi "+ tuoiNV);
		}catch(SQLException throwables) {
			throwables.printStackTrace();
		}
	}
	
	public static void timTheoDiaChiNV() {
		NhanVienDAO nhanVienDAO = new NhanVienDAO();
		System.out.print("Nhap dia chi muon tim: ");
		String diaChiNV = sc.nextLine();
		try {
			List<NhanVien> nhanVien = nhanVienDAO.timDiaChiNV(diaChiNV);
			if(!nhanVien.isEmpty()) {
				System.out.printf("%-10s %-15s %-15s %-15s %-15s\n", 
						"MaNV", "TenNV", "Tuoi", "DiaChi", "Username");
				for(NhanVien nv: nhanVien) {
					System.out.printf("%-10s %-15s %-15d %-15s %-15s\n", 
							nv.getMaNV(), nv.getTenNV(), nv.getTuoiNV(), nv.getDiaChiNV(), nv.getUsername());
				}
			}else System.out.println("Khong tim thay nhan vien co dia chi o "+ diaChiNV);
		}catch(SQLException throwables) {
			throwables.printStackTrace();
		}
	}
	
	public static void xoaNV() throws SQLException{
		NhanVienDAO nhanVienDAO = new NhanVienDAO();
		System.out.print("Nhap ma nhan vien muon xoa: ");
		String maNV = sc.nextLine();
		NhanVien nhanVien = nhanVienDAO.timMaNV(maNV);
		if(nhanVien != null) {
			nhanVienDAO.xoaNV(maNV);
			AccountDAO accountDAO = new AccountDAO();
			accountDAO.deleteAccount(nhanVien.getUsername());
			System.out.println("Da xoa nhan vien voi MaNV "+ maNV);
		}else System.out.println("Khong tim thay nhan vien co maNV "+ maNV);
	}
	
	public static void sapXepNV() {
        int a;
        do {
          System.out.println("--CHUC NANG SAP XEP NHAN VIEN-- ");
          System.out.println("1. Sap xep theo ten nhan vien.");
          System.out.println("2. Sap xep theo tuoi nhan vien.");
          System.out.println("3. Thoat khoi che do sap xep.");
          
          System.out.print("Hay nhap lua chon cua ban:  ");
          a = sc.nextInt();
          sc.nextLine();
          switch (a) {
            case 1: {
              sapXepTheoTenNV();
              break;
            }
            case 2: {
                sapXepTheoTuoiNV();
                break;
            }
          }
        } while (a != 3);
	}
	
	public static void sapXepTheoTenNV() {
		NhanVienDAO nhanVienDAO = new NhanVienDAO();
		try {
			List<NhanVien> nhanVien = nhanVienDAO.sxNV_ten();
			System.out.println("-DANH SACH NHAN VIEN-");
			System.out.printf("%-10s %-15s %-15s %-15s %-15s\n", 
					"MaNV", "TenNV", "Tuoi", "DiaChi", "Username");
			for(NhanVien nv: nhanVien) {
				System.out.printf("%-10s %-15s %-15d %-15s %-15s\n", 
						nv.getMaNV(), nv.getTenNV(), nv.getTuoiNV(), nv.getDiaChiNV(), nv.getUsername());
			}
		}catch(SQLException throwables) {
			throwables.printStackTrace();
		}
	}
	
	public static void sapXepTheoTuoiNV() {
		NhanVienDAO nhanVienDAO = new NhanVienDAO();
		try {
			List<NhanVien> nhanVien = nhanVienDAO.sxNV_tuoi();
			System.out.println("-DANH SACH NHAN VIEN-");
			System.out.printf("%-10s %-15s %-15s %-15s %-15s\n", 
					"MaNV", "TenNV", "Tuoi", "DiaChi", "Username");
			for(NhanVien nv: nhanVien) {
				System.out.printf("%-10s %-15s %-15d %-15s %-15s\n", 
						nv.getMaNV(), nv.getTenNV(), nv.getTuoiNV(), nv.getDiaChiNV(), nv.getUsername());
			}
		}catch(SQLException throwables) {
			throwables.printStackTrace();
		}
	}
	
	public static void danhSachNV() {
		NhanVienDAO nhanVienDAO = new NhanVienDAO();
		try {
			List<NhanVien> nhanVien = nhanVienDAO.dsNV();
			System.out.println("-DANH SACH NHAN VIEN-");
			System.out.printf("%-10s %-15s %-15s %-15s %-15s\n", 
					"MaNV", "TenNV", "Tuoi", "DiaChi", "Username");
			for(NhanVien nv: nhanVien) {
				System.out.printf("%-10s %-15s %-15d %-15s %-15s\n", 
						nv.getMaNV(), nv.getTenNV(), nv.getTuoiNV(), nv.getDiaChiNV(), nv.getUsername());
			}
		}catch(SQLException throwables) {
			throwables.printStackTrace();
		}
	}
	
	public static void suaNV(String username) throws SQLException{
		NhanVienDAO nhanVienDAO = new NhanVienDAO();
		NhanVien nv = new NhanVien();
		
		System.out.print("Nhap ten: "); nv.setTenNV(sc.nextLine());
		System.out.print("Nhap tuoi: "); nv.setTuoiNV(sc.nextInt()); sc.nextLine();
		System.out.print("Nhap dia chi: "); nv.setDiaChiNV(sc.nextLine());
		
		nhanVienDAO.suaThongTinNV(nv, username);
		System.out.println("Hoan tat!");
	}
}

