package main;

import java.sql.SQLException;
import java.util.Scanner;
import static main.MainNhanVien.*;
import static main.MainAccount.quenMK;;

public class RunMain {

	public static void main(String[] args) throws SQLException{
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("\n------------------------------------------");
			System.out.println("---XIN CHAO---");
			System.out.println("1. Dang nhap.");
			System.out.println("2. Dang ki tai khoan.");
			System.out.println("3. Quen mat khau.");
			System.out.print("Nhap vao lua chon cua ban: ");
			int chose = sc.nextInt();
			switch(chose) {
			case 1 :
				dangNhap();
				break;
			case 2:
				dangKiTK();
				break;
			case 3:
				quenMK();
				break;
			}
		}while(true);

	}

}
