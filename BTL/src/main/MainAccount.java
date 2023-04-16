package main;

import DAO.AccountDAO;
import model.Account;

import java.util.List;
import java.util.Scanner;

import static DAO.NhanVienDAO.getTenNV;

public class MainAccount {
	public static List<Account> listTK(){
		AccountDAO accountDAO = new AccountDAO();
		return accountDAO.getAccount();
	}
	
	public static void quenMK() {
		System.out.println("Ten dang nhap: ");
		Scanner sc = new Scanner(System.in);
		String username = sc.next();
		if(getTenNV(username)!=null) {
			System.out.print("Nhap mat khau moi");
			String password = sc.next();
			AccountDAO accountDAO = new AccountDAO();
			accountDAO.updatePassword(username, password);
			System.out.println("Cap nhat thanh cong");
		}else System.out.println("Ten dang nhap khong ton tai");
	}
}
