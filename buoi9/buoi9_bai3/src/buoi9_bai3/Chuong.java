package buoi9_bai3;
import java.util.ArrayList;
import java.util.Scanner;
public class Chuong {
	private int maChuong;
	static ArrayList <Animal> AnimalList=new ArrayList<Animal>();
	static Scanner sc=new Scanner(System.in);
	public Chuong() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Chuong(int maChuong) {
		super();
		this.maChuong = maChuong;
	}

	public int getMaChuong() {
		return maChuong;
	}

	public void setMaChuong(int maChuong) {
		this.maChuong = maChuong;
	}
	
	public static ArrayList<Animal> getAnimalList() {
		return AnimalList;
	}

	public static void setAnimalList(ArrayList<Animal> animalList) {
		AnimalList = animalList;
	}

	public void themConVat(Animal a){
		 if(a instanceof Cat)
			 a=new Cat(a);
		 else if(a instanceof Dog)
			 a=new Dog(a);
		 else if(a instanceof Tiger)
			 a=new Tiger(a);
		 this.AnimalList.add(a);
	}

	public void xoaConVat(String ten) {
		for(int i=0; i<AnimalList.size(); i++) {
			if(AnimalList.get(i).getTen().compareTo(ten)==0)
				AnimalList.remove(i);
		}
	}
	public void display() {
		System.out.printf("%-10s %-10s %-10s %-10s", 
				"ConVat", "Ten", "Tuoi", "Mota");
		for(Animal a : AnimalList) {
			a.xemThongTin();
		}
	}
}