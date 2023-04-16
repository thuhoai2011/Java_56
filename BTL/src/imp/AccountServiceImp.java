package imp;
import java.util.Scanner;
import model.Account;
import services.AccountService;
public class AccountServiceImp implements AccountService {
	@Override
	public void input(Account tk) {
		Scanner sc=new Scanner(System.in);
		System.out.println("-Hay nhap tai khoan cua ban-");
		System.out.print("Ten dang nhap: "); tk.setUsername(sc.nextLine());
		System.out.print("Mat khau: "); tk.setPassword(sc.nextLine());
		tk.setRole("user");
	}
	
	@Override
	public void output(Account tk) {
		System.out.printf("%-10s %-10s ", tk.getUsername(), tk.getPassword());
	}
}
