package ktra;
import java.util.ArrayList;
import java.util.Scanner;
public class iplmHoney implements HoneyService{
	static ArrayList<Honey> honey =new ArrayList<>();
	static ArrayList<Favorite> favorite = new ArrayList<>();
	static Scanner sc=new Scanner(System.in);
	public void AddHoney() {
		Honey ny=new Honey();
		ny.input();
		honey.add(ny);
	}
	public void ShowAllHoney() {
		for(int i=0; i<honey.size(); i++) {
			honey.get(i).output();
		}
	}
	public void DeleteHoneyById() {
		System.out.print("Nhap id Honey muon xoa: ");
		String idx=sc.nextLine();
		for(int i=0; i<honey.size();i++) {
			if(idx.equalsIgnoreCase(honey.get(i).getId())){
				honey.remove(i);
			}
		}
	}
	public void EditHoneyById() {
		
	}
	public void AddFavoriteByHoneyId() {
		System.out.print("Chon Honey: ");
		String idny=sc.nextLine();
		for(int i=0; i<honey.size();i++) {
			if(idny.equalsIgnoreCase(honey.get(i).getId())) {
				Favorite fv=new Favorite();
				fv.nhap();
				favorite.add(fv);
			}
		}
	}
	public void SortHoneyByName() {
		
	}
}
