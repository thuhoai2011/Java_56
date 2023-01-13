package buoi9_bai3;
import java.util.Scanner;
public class iplmZoo implements ZooService{
	public static Zoo zoo=new Zoo();
	public static Scanner sc=new Scanner(System.in);
	@Override
	public void themChuongMoi() {
		System.out.print("Nhap ma chuong: ");
		int maCh=sc.nextInt();
		Chuong c=new Chuong();
		zoo.themChuong(c);
	}
	@Override
	public void xoaChuong() {
		System.out.print("Nhap ma chuong: ");
		int maCh=sc.nextInt();
		zoo.xoaChuong(maCh);
	}
	@Override
	public void themConVatMoi() {
		System.out.print("Nhap ma chuong: ");
		int maCh=sc.nextInt(); sc.nextLine();
		for(Chuong c : zoo.DanhSachChuong) {
			if(c.getMaChuong()==maCh) {
				Animal a;
				System.out.print("nhap loai muon them(cat, dog, tiger): ");
				String loai=sc.nextLine();
				if(loai.equalsIgnoreCase("Cat"))
					a=new Cat();
				else if(loai.equalsIgnoreCase("dog"))
					a=new Dog();
				else if(loai.equalsIgnoreCase("tiger"))
					a=new Tiger();
				else {
					System.out.print("khong cho phep dong vat nay");
					break;
				}
				a.input();
				c.themConVat(a);
				break;
			}
		}
	}
	@Override
	public void xoaConVat() {
		System.out.print("Nhap ma chuong: ");
		int maCh=sc.nextInt(); sc.nextLine();
		for(Chuong c : zoo.DanhSachChuong) {
			if(c.getMaChuong()==maCh) {
				System.out.print("Nhap ten loai muon xoa: ");
				String ten = sc.nextLine();
				c.xoaConVat(ten);
				break;
			}
		}
	}
	@Override
	public void xuatZoo() {
		zoo.xuat();
	}
}
