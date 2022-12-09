package buoi6_bai1;
import java.util.ArrayList;
import java.util.Scanner;
public class Chuoi {
	static ArrayList<String> str=new ArrayList<String>();
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("So chuoi muon nhap:  "); 
		int n= sc.nextInt();
		System.out.println("Nhap chuoi");
	    for(int i=0; i<n+1; i++) {
	    	String Str = new String();
	    	Str=sc.nextLine();
	    	str.add(Str);
	    }
	    sreach();
	}
	public static void sreach() {
		System.out.println("Nhap chuoi con:");
		String str1 = sc.nextLine();
		int cnt=0;
		for(int i=0; i< str.size(); i++) {
			if((str.get(i)).contains(str1)==true) {
				cnt++;
				System.out.println(str.get(i));
			}
		}
		
		if(cnt==0) System.out.println("Khong co chuoi nao!");
	}
}
